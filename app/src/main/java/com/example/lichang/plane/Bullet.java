package com.example.lichang.plane;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Bullet {
    private Bitmap bitmap;
    private int x, y;
    private int speed = 20;
    private boolean isOut;
    private int type;

    public Bullet(Bitmap bitmap, int x, int y, int type) {
        this.bitmap = bitmap;
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Canvas canvas, Paint paint) {
        canvas.drawBitmap ( bitmap, x, y, paint );
        lg ();
    }

    private void lg() {

        switch (type) {
            //玩家子弹
            case 0:
                y -= speed;
                if (y < 0) {
                    isOut = true;
                }
                break;
            case 1:
                //Boss子弹
                y += speed;
                if (y < 0) {
                    isOut = true;
                }

                break;
            default:
                break;

        }

    }

    public boolean isOut() {
        return isOut;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setOut(boolean out) {
        isOut = out;
    }
}

