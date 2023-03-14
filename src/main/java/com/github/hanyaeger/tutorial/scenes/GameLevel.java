package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.Waterworld;
import com.github.hanyaeger.tutorial.entities.buttons.HealthText;
import com.github.hanyaeger.tutorial.entities.buttons.Henny;
import com.github.hanyaeger.tutorial.entities.buttons.Swordfish;

public class GameLevel extends DynamicScene {

    private Waterworld hp;

    public GameLevel(Waterworld hp){
        this.hp = hp;

    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background2.jpg");
        setBackgroundAudio("audio/waterworld.mp3");
    }

    @Override
    public void setupEntities() {
        var zwaard = new Swordfish(new Coordinate2D(1400, 200));
        var HP = new HealthText(new Coordinate2D(10,10));
        var henny = new Henny(new Coordinate2D(100, 10),HP , this.hp);

        addEntity(zwaard);
        addEntity(henny);
        addEntity(HP);
    }
}
