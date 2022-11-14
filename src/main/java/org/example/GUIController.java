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
                    new GUI_Start("Start", "start", "2M", Color.red, Color.black),
                    new GUI_Street("Burgerbaren", "Burgerbaren", "Burgerbaren", "1", Color.yellow, Color.black),
                    new GUI_Street("Pizzahuset", "Pizzahuset", "Pizzahuset", "1", Color.yellow, Color.black),
                    new GUI_Chance("Chancefelt nr. 1", "Chancefelt nr. 1", "Chancefelt nr. 1", Color.white, Color.black),
                    new GUI_Street("Slikbutikken", "Slikbutikken", "Slikbutikken", "1", Color.blue, Color.black),
                    new GUI_Street("Is-koisken", "Is-koisken", "Is-koisken", "1", Color.blue, Color.black),
                    new GUI_Refuge("", "Fængsel på besøg", "Fængsel på besøg", "Fængsel på besøg", Color.white, Color.black),
                    new GUI_Street("Musset", "Musset", "Musset", "2", Color.pink, Color.black),
                    new GUI_Street("Biblioteket", "Biblioteket", "Biblioteket", "2", Color.pink, Color.black),
                    new GUI_Chance("Chancefelt nr. 2", "Chancefelt nr. 2", "Chancefelt nr. 2", Color.white, Color.black),
                    new GUI_Street("Skaterparken", "Skaterparken", "Skaterparken", "2", Color.orange, Color.black),
                    new GUI_Street("Swimmingpoolen", "Swimmingpoolen", "Swimmingpoolen", "2", Color.orange, Color.black),
                    new GUI_Refuge("", "Gratis parkering", "Gratis parkering", "Gratis parkering", Color.white, Color.black),
                    new GUI_Street("Spillehallen", "Spillehallen", "Spillehallen", "3", Color.red, Color.black),
                    new GUI_Street("biografen", "Biografen", "Biografen", "3", Color.red, Color.black),
                    new GUI_Chance("Chancefelt nr. 3", "Chancefelt nr. 3", "Chancefelt nr. 3", Color.white, Color.black),
                    new GUI_Street("Legetøjsbutikken", "Legetøjsbutikken", "Legetøjsbutikken", "3", Color.magenta, Color.black),
                    new GUI_Street("Dyrehandlen", "Dyrehandlen", "Dyrehandlen", "3", Color.magenta, Color.black),
                    new GUI_Jail("", "Gå i fængsel", "Gå i fængsel", "Gå i Fængsel", Color.white, Color.black),
                    new GUI_Street("Bowllinghallen", "Bowllinghallen", "Bowllinghallen", "4", Color.green, Color.black),
                    new GUI_Street("Zoo", "Zoo", "Zoo", "4", Color.green, Color.black),
                    new GUI_Chance("Chancefelt nr. 4", "Chancefelt nr. 4", "Chancefelt nr. 4", Color.white, Color.black),
                    new GUI_Street("Vandland", "Vandland", "Vandland", "5", Color.cyan, Color.black),
                    new GUI_Street("Strandpromenaden", "Strandpromenaden", "Strandpromenaden", "5", Color.cyan, Color.black),
            };
        gui = new GUI(fields);

    }
    public void guiCreatePieces (int numberOfPlayers){
        for (int i = 0; i < numberOfPlayers; i++){
            cars = new GUI_Car[numberOfPlayers];
            cars[i] = new GUI_Car();
            cars[i].setPosition(fields[0]);
        }
    }
    public void guiCreatePlayer(String name, int balance,int index) {
        gui_players = new GUI_Player[cars.length];
        GUI_Player newplayer = new GUI_Player(name,balance);
        gui.addPlayer(newplayer);
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
        cars[player].setPosition(fields[pos]);
    }

    public void print(String msg){
        gui.showMessage(msg);
    }
}
