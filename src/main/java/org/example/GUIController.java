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
    GUI_Field[] fields;

    public void guiCreateboard (){
            fields = new GUI_Field[]{
                    new GUI_Start("Start", "", "2M", Color.red, Color.black),
                    new GUI_Street("Burgerbaren", "Pris/Leje : 1M", "Spis en lækker burger", "1", Color.yellow, Color.black),
                    new GUI_Street("Pizzahuset", "Pris/Leje : 1M", "10 minutter min ven", "1", Color.yellow, Color.black),
                    new GUI_Chance("?", "Chancefelt", "", Color.white, Color.black),
                    new GUI_Street("Slikbutikken", "Pris/Leje : 1M", "Køb en god bland-selv pose", "1", Color.GRAY, Color.black),
                    new GUI_Street("Is-kiosken", "Pris/Leje : 1M", "Is til en varm sommerdag", "1", Color.GRAY, Color.black),
                    new GUI_Refuge("", "", "På besøg", "Du er på besøg i fængslet", Color.white, Color.black),
                    new GUI_Street("Museet", "Pris/Leje : 2M", "", "2", Color.pink, Color.black),
                    new GUI_Street("Biblioteket", "Pris/Leje : 2M", "Læs en bog", "2", Color.pink, Color.black),
                    new GUI_Chance("?", "Chancefelt","Chancefelt", Color.white, Color.black),
                    new GUI_Street("Skaterparken", "Pris/Leje : 2M", "Skaterparken", "2", Color.orange, Color.black),
                    new GUI_Street("Swimmingpoolen", "Pris/Leje : 2M", "Tag en dukkert", "2", Color.orange, Color.black),
                    new GUI_Refuge("", "Gratis parkering", "Parkering", "Tag en pause", Color.white, Color.black),
                    new GUI_Street("Spillehallen", "Pris/Leje : 3M", "Værs'go at gå amok", "3", Color.red, Color.black),
                    new GUI_Street("Biografen", "Pris/Leje : 3M", "Se en god film", "3", Color.red, Color.black),
                    new GUI_Chance("?", "Chancefelt", "Chancefelt", Color.white, Color.black),
                    new GUI_Street("Legetøjsbutikken", "Pris/Leje : 3M", ";)", "3", Color.magenta, Color.black),
                    new GUI_Street("Dyrehandlen", "Pris/Leje : 3M", "Guldfisk til salg", "3", Color.magenta, Color.black),
                    new GUI_Jail("", "Gå i fængsel", "Gå i fængsel", "Gå i fængsel", Color.white, Color.black),
                    new GUI_Street("Bowlinghallen", "Pris/Leje : 4M", "Strike!", "4", Color.green, Color.black),
                    new GUI_Street("Zoologisk Have", "Pris/Leje : 4M", "Søde pingviner", "4", Color.green, Color.black),
                    new GUI_Chance("?", "Chancefelt", "Chancefelt", Color.white, Color.black),
                    new GUI_Street("Vandland", "Pris/Leje : 5M", "Velkommen til Lalandia", "5", Color.cyan, Color.black),
                    new GUI_Street("Strandpromenaden", "Pris/Leje : 5M", "Nyd solen", "5", Color.cyan, Color.black),
            };
        gui = new GUI(fields);

    }
    public void guiCreatePieces (int numberOfPlayers){
        cars = new GUI_Car[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++){
            cars[i] = new GUI_Car();
            cars[i].setPosition(fields[0]);
        }
        gui_players = new GUI_Player[cars.length];
    }
    public void guiCreatePlayer(String name, int balance,int index) {
        GUI_Player newplayer = new GUI_Player(name,balance);
        gui.addPlayer(newplayer);
        gui_players[index] = newplayer;
    }

    public int guiNumberOfPlayers(){
        int temp;
        temp = Integer.parseInt(gui.getUserButtonPressed("Vælg antal spillere","2","3","4"));
        return temp;
    }
    public String guiPlayerName(){
        String name = gui.getUserString("Indtast dit navn");
        return name;
    }
    public void setDie(int faceValue){
        gui.setDie(faceValue);
    }
    public void updatePlayer (int player, int bal, int pos) {
        gui_players[player].setBalance(bal);
        gui_players[player].getCar().setPosition(fields[pos]);
        //cars[player].setPosition(fields[pos]);
    }

    public void print(String msg){
        gui.showMessage(msg);
    }


}
