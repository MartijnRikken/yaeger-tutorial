package com.github.hanyaeger.tutorial.entities.buttons.swordfish;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;

import java.util.Random;

public class swordfish extends DynamicCompositeEntity implements SceneBorderCrossingWatcher {


    public swordfish(Coordinate2D initialLocation) {
        super(initialLocation);
        setMotion(2, 270d);
    }

    @Override
    public void setupEntities() {

        var zwaard = new SwordfishSprite(new Coordinate2D(0, 0));
        var hit = new HitBox(new Coordinate2D(0, 38));

        addEntity(zwaard);
        addEntity(hit);
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder sceneBorder) {
        setAnchorLocationX(getSceneWidth());
        setAnchorLocationY(new Random().nextInt((int) getSceneHeight() - 81));
    }
}
