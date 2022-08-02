package org.bitbuckets.puzzle.lib;

/**
 * All of the game's textures are described by this file. Since internally the graphics wrapper I wrote uses integers
 * as ids, I decided to add a class which would highlight exactly what integer referred to which texture.
 *
 * Think of this class as an enum. When using
 */
public interface Textures {

    int BOX = 0;
    int FLOOR = 1;
    int PLAYER = 2;
    int TARGET = 3;
    int WALL = 4;

}
