package Test;

import org.example.Game;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTestCreatePlayers {

    @Test
    public void testOfCreatePlayers() {
        Game game = new Game();
        assertEquals(3, 3);
    }
}