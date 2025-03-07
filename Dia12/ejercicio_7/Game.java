
package ejercicio_7;

interface enemy{
    void doActio();
}

class KnifeEnemy implements enemy{
    public void doActio(){}
}

class GunEnemy implements enemy {
    public void doActio(){}
}

public class Game { 
    private KnifeEnemy enemy1;
    private GunEnemy enemy2;
    private boolean endGame;

    public Game(KnifeEnemy enemy1, GunEnemy enemy2, boolean endGame) {
        this.enemy1 = enemy1;
        this.enemy2 = enemy2;
        this.endGame = endGame;
    }   
    
    public void init(){
        enemy1 = new KnifeEnemy();
        enemy2 = new GunEnemy();
    }
    
    public void run(){
        while (!endGame) {
            enemy1.doActio();
            enemy2.doActio();
        }
    }
}
