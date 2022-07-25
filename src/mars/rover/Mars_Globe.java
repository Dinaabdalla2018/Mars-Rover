/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mars.rover;

/**
 *
 * @author Dina Abdallah
 */
public class Mars_Globe {
    private int height;
    private int width;

    private Mars_Globe(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public static Mars_Globe of(int height, int width) {
        return new Mars_Globe(height, width);
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}

