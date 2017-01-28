package Game.Terrains;


import java.awt.*;
import java.awt.image.BufferedImage;

public  class Terrain {
    //STATIC STUFF HERE
    public static Terrain[] terrains = new Terrain[256];
    public static Terrain woodTerrain = new WoodTerrain(0);
    public static Terrain stoneTerrain = new StoneTerrain(1);


    //CLASS

    public static final int TERRAINTWIDTH = 64, TERRAINHEIGHT = 64;

    protected BufferedImage texture;
    protected final int id;


    public Terrain(BufferedImage texture, int id){
        this.texture = texture;
        this.id=id;

        terrains[id] = this;
    }

    public void tick(){

    }
    public void render(Graphics g, int x, int y){
        g.drawImage(texture,x,y, TERRAINTWIDTH, TERRAINHEIGHT, null);
    }

    public int getId(){
        return id;
    }

    public boolean isSolid(){
        return false;
    }
}
