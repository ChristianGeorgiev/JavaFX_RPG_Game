package Game.Graphics;


import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 64, height = 64;

    public static BufferedImage player1,player2,player3,player4;
    public static BufferedImage terrain1, terrain2, terrain3;

    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoad.loadImage("/textures/sheet2.jpg"));
        player1 = sheet.crop(0,0,width,height);
        player2 = sheet.crop(width, 0,width,height);
        player3 = sheet.crop(0, height, width, height);
        player4 = sheet.crop(width*2, 0,width,height);

        SpriteSheet terraintSheet = new SpriteSheet(ImageLoad.loadImage("/textures/terrainSheet.jpg"));
        terrain1 = terraintSheet.crop(0,0, 32,32);
        terrain2 = terraintSheet.crop(32,0,32,32);
        terrain3 = terraintSheet.crop(0,96,32,32);
    }
}
