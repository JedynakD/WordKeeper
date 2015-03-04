package org.jedynakd;

import java.util.ArrayList;
import java.util.List;

public class WordsKeeper {

    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public WordsKeeper() {
        words.add("monitor");
        words.add("keyboard");
        words.add("mouse");
        words.add("microphone");
        words.add("hardware");
        words.add("software");
        words.add("peripherals");
        words.add("motherboard");
        words.add("memory");
        words.add("adapter");
    }

    public String getOneWord(int whichWord) {
        String oneWord = words.get(whichWord);
        return oneWord;
    }
}
