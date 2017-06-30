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
    public String get(int n) {
        int currentObject = 1;
        SpecialListElement temporary = listHead;
        while(currentObject != n) {
            temporary = temporary.getNext();
            currentObject++;
        }
        if(currentObject == n) {
            return "Object number : " + n + " contains word '" + temporary.getValue() + "'.";
        }
        if(n >= size()) {
            return null;
        }
        return "Object not found.";
    }
    public int size() {
        int currentSize = 0;
        SpecialListElement temporary = listHead;
        if (temporary != null) {
            currentSize = 1;
            while(temporary.getNext() != null) {
                currentSize++;
                temporary = temporary.getNext();
            }
        }
        return currentSize;
    }
   // public void add(int n, String s) {

  //  }

}