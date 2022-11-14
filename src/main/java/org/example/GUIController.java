package org.example;

import gui_codebehind.GUI_FieldFactory;
import gui_fields.GUI_Board;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.*;
import gui_main.*;

import java.awt.*;
import java.util.List;

public class GUIController {
    GUI gui;
    GUI_Car[] cars;
    GUI_Player[] gui_players;

    public void guiCreateboard (){
        GUI_Field[] fields = {
                new GUI_Start("Start","start","2M",Color.red,Color.black),
                new GUI_Street("Burgerbaren","Burgerbaren","Burgerbaren","1",Color.yellow,Color.black),
                new GUI_Street("Pizzahuset","Pizzahuset","Pizzahuset","1",Color.yellow,Color.black)
        };
        gui = new GUI(fields);

    }
    public void guiCreatePieces (int numberOfPlayers){
        for (int i = 0; i < numberOfPlayers; i++){
            cars = new GUI_Car[numberOfPlayers];
            cars[i] = new GUI_Car();
        }
    }
    public void guiCreatePlayer(String name, int balance,int index) {
        gui_players = new GUI_Player[cars.length];
        GUI_Player newplayer = new GUI_Player(name,balance);
        gui.addPlayer(newplayer);
        gui_players[index] = newplayer;
    }
    public void print(String msg){
        gui.showMessage(msg);
    }
}
