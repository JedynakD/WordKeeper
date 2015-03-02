package org.jedynakd;

public class DictionaryStarter {
	public static void main(String args[]) {
		WordsWriter writer = new WordsWriter();
		RepetitionHandler handler = new RepetitionHandler();
		writer.writeWordsToFile();
		handler.readRepetitionsFromFile();
		handler.writeSortedRepetitionsToFile();
	}

}
