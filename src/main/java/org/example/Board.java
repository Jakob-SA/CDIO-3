package org.example;


public class Board {
        Field[] fields = new Field[24];
        public void makeFields(){

        fields[0] = new NoActionField("Start");
        fields[1] = new PropertyField(null,"Burgerbaren",1,1);
        fields[2] = new PropertyField(null,"Pizzahuset",1,1);
        fields[3] = new ChanceField("Chancefelt nr.1");
        fields[4] = new PropertyField(null,"Slikbutikken",1,1);
        fields[5] = new PropertyField(null,"Is-kiosken",1,1);
        fields[6] = new NoActionField("Fængsel, på besøg");
        fields[7] = new PropertyField(null,"Museet",2,2);
        fields[8] = new PropertyField(null, "Biblioteket",2,2);
        fields[9] = new ChanceField("Chancefelt nr.2");
        fields[10] = new PropertyField(null,"Skaterparken",2,2);
        fields[11] = new PropertyField(null,"Swimmingpoolen",2,2);
        fields[12] = new NoActionField("Gratis parkering");
        fields[13] = new PropertyField(null,"Spillehallen", 3,3);
        fields[14] = new PropertyField(null,"Biografen",3,3);
        fields[15] = new ChanceField("Chancefelt nr.3");
        fields[16] = new PropertyField(null,"Legetøjsbutikken", 3,3);
        fields[17] = new PropertyField(null, "Dyrehandlen",3,3);
        fields[18] = new NoActionField("Gå i Fængsel");
        fields[19] = new PropertyField(null, "Bowlinghallen", 4,4);
        fields[20] = new PropertyField(null,"Zoo",4,4);
        fields[21] = new ChanceField("Chancefelt nr. 4");
        fields[22] = new PropertyField(null,"Vandlandet",5,5);
        fields[23] = new PropertyField(null,"Strandpromenaden",5,5);
}
        public String toString(){
                return null;
        }
}



