package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String string, PoemDecorator poemDecorator) {
        if(poemDecorator != null) {
            return poemDecorator.decorate(string);
        } if(poemDecorator == null) {
            return string + " ABC.";
        } else { }
        return string;
    }
}
