package com.mtsu.zenmetsu;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class GameScreen implements Screen{
	//Game asset variables
	private Game gameContext;
	private Sound tapSound;
	private Music gameMusic;
	private OrthographicCamera gameCamera;
	private SpriteBatch gameSprites;
	private ShapeRenderer gameShapeRenderer;
	//Objects
	private Circle gameCircle;

	public GameScreen( GameController initGame )
	{
		//Initialize context
		gameContext = initGame;
		//Initialize camera
		gameCamera = new OrthographicCamera();
		gameCamera.setToOrtho( false , 800 , 480 );
		//Initialize sprites
		gameSprites = new SpriteBatch();
		//Initialize renderer
		gameShapeRenderer = new ShapeRenderer();
		//Initialize circle
		gameCircle = new Circle();
		gameCircle.setPosition( 400 , 240 );
		gameCircle.setRadius( 40 );

		
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float arg0) {
		//Clear Screen
		Gdx.gl.glClearColor( 0 , 0 , 0 , 1 );
		Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT );
		//Update camera
		gameCamera.update();
		//Set camera on renderer
		gameShapeRenderer.setProjectionMatrix( gameCamera.combined );
		//Draw the circle
		gameShapeRenderer.begin( ShapeType.Filled );
		gameShapeRenderer.setColor( 0 , 0 , 1 , 1 );
		gameShapeRenderer.circle( gameCircle.x , gameCircle.y , gameCircle.radius );
		gameShapeRenderer.end();
	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub

		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
