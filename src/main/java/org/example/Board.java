package org.example;


public class Board {

        public void makeFields(){
        Field[] arr = new Field[24];
        arr [0] = new NoActionField("Start");
        arr [1] = new PropertyField(null,"Burgerbaren",1,1);
        arr [2] = new PropertyField(null,"Pizzahuset",1,1);
        arr [3] = new ChanceField("Chancefelt nr.1");
        arr [4] = new PropertyField(null,"Slikbutikken",1,1);
        arr [5] = new PropertyField(null,"Is-kiosken",1,1);
        arr [6] = new NoActionField("Fængsel, på besøg");
        arr [7] = new PropertyField(null,"Museet",2,2);
        arr [8] = new PropertyField(null, "Biblioteket",2,2);
        arr [9] = new ChanceField("Chancefelt nr.2");
        arr [10] = new PropertyField(null,"Skaterparken",2,2);
        arr [11] = new PropertyField(null,"Swimmingpoolen",2,2);
        arr [12] = new NoActionField("Gratis parkering");
        arr [13] = new PropertyField(null,"Spillehallen", 3,3);
        arr [14] = new PropertyField(null,"Biografen",3,3);
        arr [15] = new ChanceField("Chancefelt nr.3");
        arr [16] = new PropertyField(null,"Legetøjsbutikken", 3,3);
        arr [17] = new PropertyField(null, "Dyrehandlen",3,3);
        arr [18] = new NoActionField("Gå i Fængsel");
        arr [19] = new PropertyField(null, "Bowlinghallen", 4,4);
        arr [20] = new PropertyField(null,"Zoo",4,4);
        arr [21] = new ChanceField("Chancefelt nr. 4");
        arr [22] = new PropertyField(null,"Vandlandet",5,5);
        arr [23] = new PropertyField(null,"Strandpromenaden",5,5);
}
        public String toString(){
                return null;
        }
}



