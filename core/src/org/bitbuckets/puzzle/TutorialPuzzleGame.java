package org.bitbuckets.puzzle;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;
import java.util.List;

/*
 * This is where the game code goes!
 * If this were a robot, this would be the main robot class where the subsystems go.
 * I've set up the starting code to resemble how robot code looks.
 */
public class TutorialPuzzleGame implements ApplicationListener {

	private final List<System> systems = new ArrayList<>(); //code from java intro

	@Override
	public void create () {

	}


	@Override
	public void render () {

	}

	@Override
	public void resize(int width, int height) {
		// don't worry about this method we aren't going to write code here
		// In coder speak we'd say we aren't going to implement it
	}


	@Override
	public void pause() {
		//not implemented
	}

	@Override
	public void resume() {
		//not implemented
	}

	//this method is activated when the application closes. Think of it as cleaning up all the images we loaded out of memory
	@Override
	public void dispose () {

	}
}
