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
    Texture board;
    TextureRegion region;

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

        int nextPow2=Integer.highestOneBit(shortestScreenSizePx-1)<<1;

        Pixmap pixmap = new Pixmap( nextPow2, nextPow2, Pixmap.Format.RGBA8888 );

        pixmap.setColor(Color.GRAY);
        pixmap.fillRectangle(0,0,shortestScreenSizePx,shortestScreenSizePx);


        pixmap.setColor(Color.WHITE);

        int y=0;
        int x=0;
        for(int i=0;i<32;i++)
        {
            pixmap.fillRectangle(x*squareSizePx,y*squareSizePx,squareSizePx,squareSizePx);
            x+=2;
            if(x>=8)
            {
                y++;
                x=1-x%8;
            }
        }

        board = new Texture( pixmap );
        pixmap.dispose();
        region = new TextureRegion(board,0,0,shortestScreenSizePx,shortestScreenSizePx);
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
