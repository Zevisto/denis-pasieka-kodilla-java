package com.denispasieka.list;

import com.denispasieka.list.special.SpecialListElement;

/**
 * Created by zevisto on 29.06.17.
 */
public class ListRunner {

    public static void main(String[] args){
        SpecialListElement firstElement = new SpecialListElement("empty", null, null);
        firstElement.getValue();
        System.out.println(firstElement);

        for(int x = 0; x < 3000; x++) {

        }
    };

}
