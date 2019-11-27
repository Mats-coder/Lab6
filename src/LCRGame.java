public class LCRGame {
    Player[] players = new Player[3];
    Die[] dice = new Die[3];
    int chipsPot = 0;
    public LCRGame(String name1, String name2, String name3){
        for (int i = 0; i < 3; i++){
            dice[i]= new Die();
        }
        players[0] = new Player(name1, dice,3);
        players[1] = new Player(name2, dice,3);
        players[2] = new Player(name3, dice,3);
    }

    public int getChipsPot() {
        return chipsPot;
    }

    public Die[] getDice() {
        return dice;
    }

    public Player[] getPlayers() {
        return players;
    }
    /* TODO
    public Player getWinner(){
        return ;
    }*/


}


