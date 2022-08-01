package org.bitbuckets.puzzle;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import org.bitbuckets.puzzle.lib.Textures;
import org.bitbuckets.puzzle.lib.impl.GraphicsSystem;

public class TutorialPuzzleGame implements ApplicationListener  {

    SpriteBatch batch;
    GraphicsSystem system;

    @Override
    public void create() {

        batch = new SpriteBatch();

        //graphics code
        int shortestScreenSizePx = Math.min(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        Sprite[] sprites = new Sprite[5];
        sprites[0] = new Sprite(new Texture("box.png"));
        sprites[1] = new Sprite(new Texture("floor.png"));
        sprites[2] = new Sprite(new Texture("player.png"));
        sprites[3] = new Sprite(new Texture("target.png"));
        sprites[4] = new Sprite(new Texture("wall.png"));

        int squareSizePx = shortestScreenSizePx / 8; //grid of 8
        system = new GraphicsSystem(squareSizePx, sprites); //graphics system is done
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void render() {
        //game code loop code



        system.drawTexture(Textures.BOX, 1, 1);
        system.drawTexture(Textures.FLOOR, 2, 2);

        batch.begin();

        //batch.draw(region,0,0);
        system.draw(batch);

        batch.end();
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
