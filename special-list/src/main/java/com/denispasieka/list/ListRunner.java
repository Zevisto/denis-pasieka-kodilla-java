package com.denispasieka.list;

import com.denispasieka.list.special.SpecialListElement;
import com.denispasieka.list.special.SpecialList;

/**
 * Created by zevisto on 29.06.17.
 */
public class ListRunner {

    public static void main(String[] args){
        SpecialList list = new SpecialList();
        list.add("Hello");
        list.add("Michał");
        list.add("Wojtek");
        list.add("Mysz");
        list.add("Komputer");
        list.add("Linux");
        list.add("Windows");
        list.add("Ekran");
        list.add("Komar");
        list.add("Mucha");
        list.add("Drzwi");
        System.out.println(list.get(5));

        for(int x = 0; x < 3000; x++) {
//
        }
    };

}
