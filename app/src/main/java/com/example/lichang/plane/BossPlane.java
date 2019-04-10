package com.example.lichang.plane;

public class BossPlane {
   private boolean noCollision;
    private int x,y;
    private int width,height;
    private int hp=5;

    public boolean isCollision(BossPlane bossPlane) {

        if (noCollision) {
            return false;
        } else {

            if (bossPlane.getY() + bossPlane.getH() > y && bossPlane.getY() + bossPlane.getH() < y + height) {
                if (x < bossPlane.getX() && x + width > bossPlane.getX()) {
                    noCollision = true;
                    if (hp >= 0) {
                        hp--;
                    }
                    return true;
                }
                if (x>bossPlane.getX()&&x+width<bossPlane.getX()+bossPlane.getX()){
                    noCollision = true;
                    if (hp > 0) {
                        hp--;
                    }
                    return true;
                }
                if(x<bossPlane.getX()&&x+width>bossPlane.getX()+bossPlane.getW()){
                    noCollision = true;
                    if (hp > 0) {
                        hp--;
                    }
                    return true;
                }


            }
            return false;
        }
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
    public int getH(){
        return height;
    }
    public int getW(){
        return width;
    }
}
