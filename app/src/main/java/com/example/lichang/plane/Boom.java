package com.example.lichang.plane;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Boom {
    private Bitmap bitmap;
    private int x,y;
    private int totalFrame;
    private int currentFrame;//当前显示的第几幅画面
    private int frameH,frameW;
    private boolean isEnd;

    public Boom(Bitmap bitmap,int x,int y,int totalFrame){
        this.bitmap = bitmap;
        this.x = x;
        this.y = y;
        this.totalFrame = totalFrame;
        frameH = bitmap.getHeight();
        frameW = bitmap.getWidth()/totalFrame;
    }
    public void draw(Canvas canvas, Paint paint){
        canvas.save();
        canvas.clipRect(x,y,x+frameW,y+frameH);
        canvas.drawBitmap(bitmap,x-currentFrame*frameW,y,paint);
        canvas.restore();
        logic();
    }
    public void logic(){
        if (currentFrame<totalFrame){
            currentFrame++;
        }else {
            isEnd = true;
        }
    }

    public boolean isEnd() {
        return isEnd;
    }
}
