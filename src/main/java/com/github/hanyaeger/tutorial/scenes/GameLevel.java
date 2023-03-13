package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.tutorial.entities.buttons.Henny;
import com.github.hanyaeger.tutorial.entities.buttons.Swordfish;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;

import java.util.Set;

public class GameLevel extends DynamicScene {
    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background2.jpg");
        setBackgroundAudio("audio/waterworld.mp3");
    }

    @Override
    public void setupEntities() {
        var zwaard = new Swordfish(new Coordinate2D(1400, 200));
        var henny = new Henny(new Coordinate2D(10, 10));
        addEntity(zwaard);
        addEntity(henny);
    }
}
