package com.example.androidgames.mrnom;

import com.example.androidgames.framework.Screen;
import com.example.androidgames.framework.impl.AndroidGame;

public class MrNomGame extends AndroidGame {
	public Screen getStartScreen() {
		return new LoadingScreen(this);
	}
}
