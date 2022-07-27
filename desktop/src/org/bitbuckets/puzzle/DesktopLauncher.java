package org.bitbuckets.puzzle;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

// This is more code that starts the game. Don't worry about it for now.
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("PuzzleGame");
		new Lwjgl3Application(new TutorialPuzzleGame(), config);
	}
}
