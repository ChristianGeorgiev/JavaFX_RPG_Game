package Game.States;



import Game.Entities.creatures.Player;
import Game.Game;
import Game.Terrains.Terrain;

import java.awt.*;

public class GameState extends State{
    private Player player;
    public GameState(Game game){
        super(game);
        player = new Player(game, 30,40);
    }

    @Override
    public void tick() {
        player.tick();
    }

    @Override
    public void render(Graphics g) {
        player.render(g);
        Terrain.terrains[0].render(g, 0,0);
    }


}
