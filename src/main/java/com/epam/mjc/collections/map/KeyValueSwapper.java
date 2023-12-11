package com.epam.mjc.collections.map;

import java.util.Map;
import java.util.HashMap;

public class KeyValueSwapper {
	public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
		Map<String, Integer> swappedMap = new HashMap<>();
		for (Map.Entry<Integer, String> item : sourceMap.entrySet()) {
			if (!swappedMap.containsKey(item.getValue())) {
				swappedMap.put(item.getValue(), item.getKey());
			} else {
				if (swappedMap.get(item.getValue()) > item.getKey()) {
					swappedMap.put(item.getValue(), item.getKey());
				}
			}
		}
		return swappedMap;
	}
}
