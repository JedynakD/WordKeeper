package org.jedynakd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RepetitionHandler {
	private Map<String, Integer> map = new HashMap<>();

	public void readRepetitionsFromFile() {
		try (FileReader fileReader = new FileReader("listOfWords.txt");
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			String repetition;
			while ((repetition = bufferedReader.readLine()) != null) {
				if (map.containsKey(repetition)) {
					int value = map.get(repetition);
					map.put(repetition, value + 1);
				} else {
					map.put(repetition, 1);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeSortedRepetitionsToFile() {
		String wordRepeated;
		int repetitionsNumber;
		WordsKeeper dictionary = new WordsKeeper();
		Collections.sort(dictionary.getWords());

		try (FileWriter fileWriter = new FileWriter("listOfRepetitions.txt");
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
			for (int listIndex = 0; listIndex < 10; listIndex++) {
				wordRepeated = dictionary.getOneWord(listIndex);
				repetitionsNumber = map.get(dictionary.getOneWord(listIndex));
				bufferedWriter.write(wordRepeated);
				bufferedWriter.write(" ");
				bufferedWriter.write(String.valueOf(repetitionsNumber));
				bufferedWriter.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
