package com.tareksaidee.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

/**
 * Created by tarek on 9/19/2016.
 */
public class SpaceInvadersScreen implements Screen {

    ExtendViewport spaceInvadersViewport;
    ShapeRenderer renderer;
    Player player;
    Bullets bullets;
    Enemies enemies;


    @Override
    public void show() {
        spaceInvadersViewport = new ExtendViewport(Constants.WORLD_SIZE, Constants.WORLD_SIZE);
        renderer = new ShapeRenderer();
        renderer.setAutoShapeType(true);
        player = new Player(spaceInvadersViewport);
        bullets = new Bullets(spaceInvadersViewport);
        enemies = new Enemies(spaceInvadersViewport);
    }

    @Override
    public void render(float delta) {
        player.update(delta);
        bullets.update(delta, player.position);
        enemies.update(delta);
        if(enemies.hitByBullet(bullets.getBulletPos())) {
            bullets.init();
        }
        spaceInvadersViewport.apply(true);
        Gdx.gl.glClearColor(Constants.BACKGROUND_COLOR.r, Constants.BACKGROUND_COLOR.g,
                Constants.BACKGROUND_COLOR.b, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        renderer.setProjectionMatrix(spaceInvadersViewport.getCamera().combined);
        renderer.begin();
        player.render(renderer);
        bullets.render(renderer);
        enemies.render(renderer);
        renderer.end();
    }

    @Override
    public void resize(int width, int height) {
        spaceInvadersViewport.update(width, height, true);
        player.init();
        bullets.init();
        enemies.init();
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {
        renderer.dispose();
    }

    @Override
    public void dispose() {

    }
}
