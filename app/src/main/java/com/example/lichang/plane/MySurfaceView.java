package com.example.lichang.plane;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.Vector;

public class MySurfaceView extends SurfaceView implements SurfaceHolder.Callback, Runnable {
    private SurfaceHolder surfaceHolder;
    private Canvas canvas;//绘制图形的画布
    private boolean isDrawing = true;
    public static int Height;
    public static int Width;
    private Myplane plane;
    private Vector<Bullet> bulletVector = new Vector<>();//Vector是线程安全的，ArrayList是非线程安全的
    private Vector<Bullet> boosBulletVector = new Vector<>();
    private Vector<Boom>boomVector = new Vector<>();
    private int count;
    public static int Game_STATE=3;

    public MySurfaceView(Context context) {
        super ( context );
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    @Override
    public void run() {

    }
}
