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

    @org.junit.jupiter.api.Test
    void testOfTakeTurn() {
        Game game = new Game();
        game.getBoard().makeFields();
        String[] playerNames = new String[]{"Jarl", "bongo"};
        game.createPlayers(2, playerNames);

        int startPosition = game.getPlayers().get(0).getPiece().getLocation();

        game.takeTurn(0);

        int positionAfterTurn = game.getPlayers().get(0).getPiece().getLocation();

        assertEquals(startPosition, 0);
        assertNotEquals(positionAfterTurn, 0);
    }

    @org.junit.jupiter.api.Test
    void chooseWinner() {
        Game game = new Game();
        Account acc = new Account();
        String[] playerNames = new String[]{"Jarl", "Bongo"};
        game.createPlayers(2, playerNames);
        acc.setBalance(-1);

    }
}
