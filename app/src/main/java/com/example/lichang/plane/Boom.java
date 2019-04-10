package com.example.lichang.plane;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Boom {
    private Bitmap bitmap;
    private int x,y;
    private int currentFrame;//当前显示的第几副画面
    private int totalFrame;
    private int frameW,frameH;
    private boolean isOut;

    public Boom(Bitmap bitmap, int x, int y, int totalFrame) {
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
        lg();
    }
    public void lg(){
        if(currentFrame<totalFrame){
            currentFrame++;
        }else {
            isOut = true;
        }
    }

    public boolean isOut() {
        return isOut;
    }
}