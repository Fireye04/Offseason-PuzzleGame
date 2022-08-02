package org.bitbuckets.puzzle.lib;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * This class describes how you can interact with the game screen through two functions.
 * The one you'll be using most often is {@link #drawTexture(int, int, int)}.
 *
 * To use it, you'll need to provide a {@link Textures}, an x value and a y value.
 * The screen is divided into an 8 by 8 grid so don't specify any x or y values above 8
 */
public interface Graphics {

    /**
     * Draws cached values to a sprite batch
     * In other words, you don't need to know what this does
     * @param batch sprite batch
     */
    void draw(SpriteBatch batch);

    /**
     * Draws a texture onto the on screen grid that will stay on screen for the length of one {@link System#periodic(Graphics)} loop.
     *
     * Example: graphics.drawTexture(Textures.BOX, 0, 0) will make a box appear in the lower left corner of the screen
     * Example: graphics.draw(0, 8, 8) will make a box appear in the upper right corner of the screen
     *
     * @param texture A texture ID (see {@link Textures})
     * @param x An x value from 1 to 8
     * @param y A y value between 1 to 8
     */
    void drawTexture(int texture, int x, int y);

}
