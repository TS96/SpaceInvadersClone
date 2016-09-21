package com.tareksaidee.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by tarek on 9/19/2016.
 */
public class Constants {
    public static final float WORLD_SIZE = 150.0f;

    public static final float PLAYER_WIDTH = 12.0f;
    public static final int PLAYER_HEIGHT = 14;
    public static final Color PLAYER_COLOR = Color.RED;
    public static final float PLAYER_MOVEMENT_SPEED = 50.0f;

    public static final float BULLET_SPEED = 100.0f;
    public static final float ALLOWED_BULLETS = 1;

    public static final float ENEMY_SPEED = 50f;
    public static final Vector2 ENEMY_DIMENSION = new Vector2(5,5);
    public static final Vector2 ENEMY_OFFSET = new Vector2(10,10);
    public static final Vector2 ENEMY_NUMBER = new Vector2(8,3);



}
