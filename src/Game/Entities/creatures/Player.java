package Game.Entities.creatures;

import Game.Game;
import Game.Graphics.Assets;

import java.awt.*;

public class Player extends Creature{

    private Game game;

    public Player(Game game, float x, float y) {
        super(x, y, Creature.DEFAULT_CREATURE_WIDTH,Creature.DEFAULT_CREATURE_HEIGHT);
        this.game = game;
    }

    @Override
    public void tick() {
        getInput();
        move();
    }
    private void getInput(){
        xMove = 0;
        yMove = 0;

        if (game.getKeyManager().up){
            yMove = -speed-2;
        }
        if (game.getKeyManager().down){
            yMove = speed+2;
        }
        if (game.getKeyManager().left){
            xMove = -speed-2;
        }
        if (game.getKeyManager().right){
            xMove = speed+2;
        }

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.player3, (int)x, (int)y,width,height,null);

    }
}
