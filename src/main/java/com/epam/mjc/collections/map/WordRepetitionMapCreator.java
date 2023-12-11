package com.epam.mjc.collections.map;

import java.util.Map;
import java.util.HashMap;

public class WordRepetitionMapCreator {
	public Map<String, Integer> createWordRepetitionMap(String sentence) {
		Map<String, Integer> repetition = new HashMap<>();
		String[] sentenceArray = sentence.toLowerCase().split("[\\s,.]+");
		for (int i = 0; i < sentenceArray.length; ++i) {
			Integer count = repetition.get(sentenceArray[i]);
			if (null == count) {
				repetition.put(sentenceArray[i], 1);
			} else {
				repetition.put(sentenceArray[i], count + 1);
			}
		}
		return repetition;
	}
}
