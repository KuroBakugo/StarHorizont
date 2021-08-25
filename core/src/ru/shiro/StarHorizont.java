package ru.shiro;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;

import ru.shiro.screen.MenuScreen;

public class StarHorizont extends Game {

	@Override
	public void create () {
		setScreen(new MenuScreen());
	}

}
