package com.denispasieka.list.special;

/**
 * Created by zevisto on 29.06.17.
 */
public class SpecialListElement {

    String value;
    SpecialListElement next;
    SpecialListElement previous;

    public SpecialListElement(String value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public SpecialListElement(String value, SpecialListElement next, SpecialListElement previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public String getValue() {
        return this.value;
    }

    public SpecialListElement getNext() {
        return this.next;
    }

    public SpecialListElement getPrevious() {
        return this.previous;
    }

    public void setNext(SpecialListElement next) {
        this.next = next;
    }

    public void setPrevious(SpecialListElement previous) {
        this.previous = previous;
    }

    public String toString() {
        return "Object with value : " + value + ".";
    }

}
