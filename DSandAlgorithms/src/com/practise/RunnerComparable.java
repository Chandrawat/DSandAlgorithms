package com.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnerComparable {

	public static void main(String[] args) {
		

		List<LaptopComparable> laps = new ArrayList<>();
		laps.add(new LaptopComparable("Dell", 16, 800));
		laps.add(new LaptopComparable("Apple", 4,1600));
		laps.add(new LaptopComparable("HP",8,1000));
		
		Collections.sort(laps);
		
		for(LaptopComparable l: laps) {
			System.out.println(l);
		}

	}

}
