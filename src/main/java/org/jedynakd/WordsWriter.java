package org.jedynakd;

import java.io.*;
import java.util.Random;

public class WordsWriter {
	public void writeWordsToFile() {
		Random random = new Random();
		WordsKeeper dictionary = new WordsKeeper();
		String randomWord;
		int indexOfRandomWord;
		File file = new File("listOfWords.txt");

		try (FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
			for (int i = 0; i < 1000; i++) {
				indexOfRandomWord = random.nextInt(10);
				randomWord = dictionary.getOneWord(indexOfRandomWord);
				bufferedWriter.write(randomWord);
				bufferedWriter.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
