package org.bitbuckets.puzzle.lib.impl;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.bitbuckets.puzzle.lib.Graphics;

import java.util.LinkedList;
import java.util.Queue;

public class GraphicsSystem implements Graphics {

    private final float squareWidthPx;
    private final float squareHeightPx;
    private final Sprite[] sprites;

    private final Queue<int[]> stuff = new LinkedList<>();

    public GraphicsSystem(float squareWidthPx, float squareHeightPx, Sprite[] sprites) {
        this.squareWidthPx = squareWidthPx;
        this.squareHeightPx = squareHeightPx;
        this.sprites = sprites;
    }

    @Override
    public void drawTexture(int texture, int x, int y) {
        int[] order = new int[3];
        order[0] = texture;
        order[1] = x - 1;
        order[2] = y - 1;

        stuff.add(order);
    }


    //TODO this should comply to the documentation
    @Override
    public void draw(SpriteBatch batch) {
        while (!stuff.isEmpty()) {
            int[] order = stuff.remove();

            int x = order[1];
            int y = order[2];
            Sprite sprite = sprites[order[0]];

            float spriteWidth = sprite.getWidth();
            float spriteHeight = sprite.getHeight();

            sprite.setScale(squareWidthPx / spriteWidth, squareHeightPx / spriteHeight);

            sprite.setX(x * squareWidthPx + squareWidthPx / 2 - spriteWidth / 2); //place centered and stretched
            sprite.setY(y * squareHeightPx + squareHeightPx / 2 - spriteHeight / 2);
            sprite.draw(batch);
        }
    }

}
