/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
public class LandTract {
    private int length;
    private int width;
    
    public LandTract(int len, int wid) {
        this.length = len; 
        this.width = wid;
    }
    
    public LandTract(LandTract land) {
        this.length = land.getLength();
        this.width = land.getWidth();
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getArea() {
        return this.length * this.width;
    }

    public boolean equals(LandTract obj) {
        if (this.length == obj.getLength() && this.width == obj.getWidth()) {
            return true;
        } else {
            return false;
        }
    }
}
