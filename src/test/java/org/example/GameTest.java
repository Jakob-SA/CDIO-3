package org.example;

import junit.framework.Assert;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game game = new Game();

    @org.junit.jupiter.api.Test
    void testNumberOfcreatedPlayers() {
        game.createPlayer("test");
        assertEquals(4,game.players.size());
    }
    @org.junit.jupiter.api.Test
    void testStartMoney (){
        assertEquals(16,game.players.get(0).acc.getBalance());
        game.players.get(0).piece.addLocation(25,game.players.get(0));
        assertEquals(18,game.players.get(0).acc.getBalance());
    }
}