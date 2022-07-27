package org.bitbuckets.puzzle;

import com.badlogic.gdx.graphics.Texture;

public class DrawSystem implements System {

    private Texture[] textures;

    @Override
    public void create() {
        textures = new Texture[4];
        textures[0] = new Texture("box.png");
        textures[1] = new Texture("floor.png");
        textures[2] = new Texture("player.png");
        textures[3] = new Texture("target.png");
        textures[4] = new Texture("wall.png");
    }

    @Override
    public void render() {

    }
}
