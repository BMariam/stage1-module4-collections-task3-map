package com.epam.mjc.collections.map;

import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

public class FunctionValueFinder {
	public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
		Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
		if (!sourceList.isEmpty()) {
			for (Map.Entry<Integer, Integer> item : functionMap.entrySet()) {
				if (requiredValue == item.getValue()) {
					return true;
				}
			}
		}
		return false;
	}

	private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
		Map<Integer, Integer> functionMap = new LinkedHashMap<>();
		if (!sourceList.isEmpty()) {
			for (int i = 0; i < sourceList.size(); ++i) {
				functionMap.put(sourceList.get(i), 5 * sourceList.get(i) + 2);
			}
		}
		return functionMap;
	}
}
