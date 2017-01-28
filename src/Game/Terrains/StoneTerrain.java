package Game.Terrains;


import Game.Graphics.Assets;


public class StoneTerrain extends Terrain {
    public StoneTerrain(int id) {
        super(Assets.terrain3, id);
    }

    @Override
    public boolean isSolid(){
        return true;
    }
}
