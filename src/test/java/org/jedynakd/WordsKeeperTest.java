package org.jedynakd;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WordsKeeperTest {
    private WordsKeeper wordsKeeper;

    @Test
    public void shouldReturnMonitor() {
        wordsKeeper = new WordsKeeper();
        String actual = wordsKeeper.getOneWord(0);

        assertEquals("monitor", actual);
    }

    @Test
    public void shouldReturnAdapter() {
        wordsKeeper = new WordsKeeper();
        String actual = wordsKeeper.getOneWord(9);

        assertEquals("adapter", actual);
    }

    @Test
    public void shouldReturnMouse() {
        wordsKeeper = new WordsKeeper();
        String actual = wordsKeeper.getWords().get(2);

        assertEquals("mouse", actual);
    }

    @Test
    public void shouldReturnMicrophone() {
        wordsKeeper = new WordsKeeper();
        String actual = wordsKeeper.getWords().get(3);

        assertEquals("microphone", actual);
    }

}