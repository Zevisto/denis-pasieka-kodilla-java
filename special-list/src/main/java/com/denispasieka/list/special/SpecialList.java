package com.denispasieka.list.special;

/**
 * Created by zevisto on 29.06.17.
*/
public class SpecialList {

    SpecialListElement listHead = null;
    public int amount = 0;

    public SpecialList() {

    }

    public void add(String s) {
        amount++;
        if(listHead == null) {
            listHead = new SpecialListElement(s);
        } else {
            SpecialListElement theLastElement = listHead;
            while(theLastElement.getNext() != null) {
                theLastElement = theLastElement.getNext();
            }
            SpecialListElement temporary = new SpecialListElement(s, null, theLastElement);
            theLastElement.setNext(temporary);
        }

    }
  //  public boolean remove(String s) {
  //      amount--;
  //  }
   // public String get(int n) {

  //  }
    public int size() {
        return amount;
    }
   // public void add(int n, String s) {

  //  }

}