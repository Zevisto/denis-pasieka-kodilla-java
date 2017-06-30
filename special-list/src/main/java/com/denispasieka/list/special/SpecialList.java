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
        int currentSize = 1;
        SpecialListElement temporary = listHead;
        while(temporary != null) {
            if(temporary.getNext() != null) {
                currentSize++;
                temporary = temporary.getNext();
            } else {
                return currentSize;
            }
        }
        return currentSize;
    }
   // public void add(int n, String s) {

  //  }

}