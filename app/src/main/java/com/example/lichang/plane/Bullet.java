package com.example.lichang.plane;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Bullet {
    private Bitmap bitmap;
    private int x, y;
    private int speed = 10;
    private boolean isDead;
    private int type;

    public Bullet(Bitmap bitmap, int x, int y, int type) {
        this.bitmap = bitmap;
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Canvas canvas, Paint paint) {
        canvas.drawBitmap(bitmap, x, y, paint);
        logic();

    }

    public void logic() {
        switch (type) {
            case 0:
                //玩家子弹
                y -= speed;
                if (y < 0) {
                    isDead = true;
                }
                break;

            case 1:
                //Boss子弹
                y += speed + 2;
                if (y < 0) {
                    isDead = true;
                }
                break;
            default:
                break;
        }
    }
    public boolean isDead() {
        return isDead;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getType() {
        return type;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

}

