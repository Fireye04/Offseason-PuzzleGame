package org.bitbuckets.puzzle.lib.impl;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.bitbuckets.puzzle.lib.Graphics;
import org.bitbuckets.puzzle.lib.core.InternalSystem;

import java.util.LinkedList;
import java.util.Queue;

public class GraphicsSystem implements Graphics, InternalSystem {

    private final float squareSizePx;
    private final Sprite[] sprites;

    private final Queue<int[]> stuff = new LinkedList<>();

    public GraphicsSystem(int squareSizePx, Sprite[] sprites) {
        this.squareSizePx = squareSizePx;
        this.sprites = sprites;
    }

    @Override
    public void drawTexture(int texture, int x, int y) {
        int[] order = new int[3];
        order[0] = texture;
        order[1] = x;
        order[2] = y;

        stuff.add(order);
    }

    @Override
    public void draw(SpriteBatch batch) {
        while (!stuff.isEmpty()) {
            int[] order = stuff.remove();

            int x = order[1];
            int y = order[2];
            Sprite sprite = sprites[order[0]];

            float spriteScalingFactor = squareSizePx / sprite.getHeight();

            sprite.setScale(spriteScalingFactor);

            sprite.setX(y * squareSizePx + squareSizePx / 2 - sprite.getWidth() / 2); //place centered
            sprite.setY(x * squareSizePx + squareSizePx / 2 - sprite.getHeight() / 2);
            sprite.draw(batch);
        }
    }

}
