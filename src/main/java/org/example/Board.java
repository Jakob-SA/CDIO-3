package org.example;


public class Board {

        public void makeFields(){
        Field[] arr = new Field[24];
        arr [0] = new NoActionField("Start");
        arr [1] = new PropertyField(null,"Burgerbaren",1,1);
        arr [2] = new PropertyField(null,"Pizzahuset",1,1);
        arr [3] = new ChanceField("Chancefelt1");
        arr [4] = new PropertyField(null,"Slikbutikken",1,1);
}



}



