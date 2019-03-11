package org.fasttrackit;

import org.Catel;

import javax.sound.midi.Soundbank;

public class TamagotchiGame {

    public static void main(String[] args){
        Catel dog1 = new Catel();
        dog1.setName("Rex");

        Catel dog2 = new Catel();
        dog2.setName("Snoopy");

        for (int zi=0;zi<15;zi++){
            dog2.mananca();
        }

        System.out.println("Catelul "+ dog2.getName()+ " are varsta:" + dog2.getVarsta());

    }
}
