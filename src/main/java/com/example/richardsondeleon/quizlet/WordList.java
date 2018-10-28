package com.example.richardsondeleon.quizlet;

import java.util.LinkedList;

public class WordList<String> extends LinkedList<String> {

    public WordList(){
        populateWordList();

    }

    private void populateWordList() {

        this.addLast((String)"Engineering");
        this.addLast((String)"Science");
        this.addLast((String)"Geography");
        this.addLast((String)"Math");
        this.addLast((String)"Database");
        this.addLast((String)"Technology");

        for(int i=0; i<this.size(); i++){
            this.set(i, (String)((i+1)+" "+this.get(i)));

        }
    }
}
