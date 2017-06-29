package com.denispasieka.list.special;

/**
 * Created by zevisto on 29.06.17.
*/
public class SpecialList {

    SpecialListElement listHead = null;

    public SpecialList() {

    }

    public void add(String s) {
        if(listHead == null) {
            listHead = new SpecialListElement(s);
        }

    }
   /** public boolean remove(String s) {

   // }
   // public String get(int n) {

  //  }
   // public int size() {

  //  }
   // public void add(int n, String s) {

    }
*/
}