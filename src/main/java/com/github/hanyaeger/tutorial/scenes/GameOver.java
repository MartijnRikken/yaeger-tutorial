package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Waterworld;
import com.github.hanyaeger.tutorial.entities.buttons.Quit;
import com.github.hanyaeger.tutorial.entities.buttons.Restart;
import com.github.hanyaeger.tutorial.entities.buttons.StartButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class GameOver extends StaticScene {
    private Waterworld waterworld;
    public GameOver(Waterworld waterworld){
        this.waterworld = waterworld;
    }


    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background3.jpg");
        setBackgroundAudio("audio/ocean.mp3");
    }

    @Override
    public void setupEntities() {
        var waterworldText = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() / 2),
                "Waterworld"
        );
        waterworldText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        waterworldText.setFill(Color.DARKBLUE);
        waterworldText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
        addEntity(waterworldText);


        var opnieuw = new Restart(new Coordinate2D(getWidth() / 2, getHeight() / 2 + 100), waterworld);
        var stop = new Quit(new Coordinate2D(getWidth() / 2, getHeight() / 2 + 150), waterworld);
        opnieuw.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        stop.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(opnieuw);
        addEntity(stop);
    }
}
