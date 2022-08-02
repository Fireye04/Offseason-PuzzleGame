package org.bitbuckets.puzzle.subsystems;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import org.bitbuckets.puzzle.lib.Graphics;
import org.bitbuckets.puzzle.lib.SubSystem;
import org.bitbuckets.puzzle.lib.Textures;

//TODO very first subsystem
public class PlayerSystem implements SubSystem {

    int x = 8;
    int y = 8; //starting position

    @Override
    public void init() {

    }

    @Override
    public void periodic(Graphics graphics) {

        if (Gdx.input.isKeyJustPressed(Input.Keys.DOWN)) {
            int yFuture = y - 1;

            if (yFuture > 0) {
                y = yFuture;
            }
        }

        graphics.drawTexture(Textures.PLAYER, x, y);


    }
}
