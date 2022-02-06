package com.company.linearsearch;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfBoomerangs {
	public int numberOfBoomerangs(int[][] points) {
		int sum = 0;
		Map<Integer,Integer> record = new HashMap<>();
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {
				if (i != j) {
					int dis = dis(points[i],points[j]);
					int count = record.getOrDefault(dis, 0) + 1;
					record.put(dis,count);
				}
			}
			for (Integer value : record.values()) {
				sum += value * (value - 1);
			}
			record.clear();
		}
		return sum;
	}

	int dis(int[] p1, int[] p2) {
		return (p1[0] - p2[0])*(p1[0] - p2[0]) + (p1[1] - p2[1])*(p1[1] - p2[1]);
	}
}
