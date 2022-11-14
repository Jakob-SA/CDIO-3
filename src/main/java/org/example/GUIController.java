package org.example;

import gui_codebehind.GUI_FieldFactory;
import gui_fields.GUI_Board;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.*;
import gui_main.*;

import javax.xml.namespace.QName;
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
                new GUI_Street("Pizzahuset","Pizzahuset","Pizzahuset","1",Color.yellow,Color.black),
                new GUI_Chance(),
                new GUI_Street("Slikbutikken","Slikbutikken","Slikbutikken","1",Color.blue,Color.black),
                new GUI_Street("Is-koisken","Is-koisken","Is-koisken","1",Color.blue,Color.black),
                new GUI_Refuge(),
                new GUI_Street("Musset","Musset","Musset","2",Color.pink,Color.black),
                new GUI_Street("Biblioteket","Biblioteket","Biblioteket","2",Color.pink,Color.black),
                new GUI_Chance(),
                new GUI_Street("Skaterparken","Skaterparken","Skaterparken","2",Color.orange,Color.black),
                new GUI_Street("Swimmingpoolen","Swimmingpoolen","Swimmingpoolen","2",Color.orange,Color.black),
                new GUI_Refuge(),
                new GUI_Street("Spillehallen","Spillehallen","Spillehallen","3",Color.red,Color.black),
                new GUI_Street("biografen","Biografen","Biografen","3",Color.red,Color.black),
                new GUI_Chance(),
                new GUI_Street("Legetøjsbutikken","Legetøjsbutikken","Legetøjsbutikken","3",Color.magenta,Color.black),
                new GUI_Street("Dyrehandlen","Dyrehandlen","Dyrehandlen","3",Color.magenta,Color.black),
                new GUI_Jail("","Gå i fængsel","Gå i fængsel","Gå i Fængsel",Color.white,Color.black),
                new GUI_Street("Bowllinghallen","Bowllinghallen","Bowllinghallen","4",Color.green,Color.black),
                new GUI_Street("Zoo","Zoo","Zoo","4",Color.green,Color.black),
                new GUI_Chance(),
                new GUI_Street("Vandland","Vandland","Vandland","5",Color.cyan,Color.black),
                new GUI_Street("Strandpromenaden","Strandpromenaden","Strandpromenaden","5",Color.cyan,Color.black),
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
}
