package com.example.lichang.plane;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;

public class Myplane {
    private Bitmap bitmap;
    private Bitmap bitmapHp;
    private int x,y;
    private int width,height;
    private boolean noCollision;
    private int noCollisionCount;

    private int bossHp = 3;

    public Myplane(Bitmap bitmap, Bitmap bitmapHp){
        this.bitmap = bitmap;
        this.bitmapHp = bitmapHp;
        x = MySurfaceView.Width/2-bitmap.getWidth()/2;
        y = MySurfaceView.Height-bitmap.getHeight();
        width = bitmap.getWidth();
        height = bitmap.getHeight();
    }
    public void draw(Canvas canvas,Paint paint){
        if (noCollision){
            noCollisionCount++;
            if (noCollisionCount%10==0){
                canvas.drawBitmap(bitmap,x,y,paint);//飞机闪烁
            }
            if (noCollisionCount>100){//无敌时间
                noCollision = false;
                noCollisionCount = 0;
            }
        }else {
            //非无敌状态
            canvas.drawBitmap(bitmap,x,y,paint);
        }

        for (int i = 0; i<bossHp; i++){
            canvas.drawBitmap(bitmapHp,i*bitmapHp.getWidth(),MySurfaceView.Height-bitmapHp.getHeight(),paint);
        }

    }
    public void onTouch(MotionEvent event){
        if (event.getAction() == MotionEvent.ACTION_MOVE){
            float ex = event.getX();
            float ey = event.getY();
            if (ex>x&&ex<x+width&&ey>y&&ey<y+height){
                x = (int) ex-width/2;
                y = (int) ey-height/2;
                if(y<0){
                    y=0;
                }
                if (y+height>MySurfaceView.Height) {
                    y=MySurfaceView.Height-height;
                }
            }
        }
    }

    public boolean isCollision(Bullet bullet) {
        if (noCollision) {
            return false;
        } else {
            if (bullet.getX() > x && bullet.getX() < x + width && bullet.getY() > y && bullet.getY() < y + height) {
                Log.e("AAA", "isCollision: .................................");
                noCollision = true;
                if (bossHp > 0) {
                    bossHp--;
                }
                return true;
            }
        }
        return false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }
}

