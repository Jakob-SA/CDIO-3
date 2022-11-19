package Test;

import org.example.*;

import static org.junit.jupiter.api.Assertions.*;

class GameTest1 {

    @org.junit.jupiter.api.Test
    public void testOfCreatePlayers() {
        Game game = new Game();
        String[] playerNames = new String[]{"Jarl", "bongo"};
        game.createPlayers(2, playerNames);
        int actual = game.getPlayers().size();
        assertEquals(2, actual);
    }
/**
    @org.junit.jupiter.api.Test
    void testOfTakeTurn() {
        Game game = new Game();
        String[] playerNames = new String[]{"Jarl", "bongo"};
        game.createPlayers(2, playerNames);
        game.takeTurn(2);
        assertEquals(6, 6);
 }

 @org.junit.jupiter.api.Test
 void chooseWinner() {

 }
 **/
}