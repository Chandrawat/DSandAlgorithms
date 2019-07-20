package com.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunnerComparator {

	public static void main(String[] args) {
	
		List<LaptopComparator> list = new ArrayList<>();
		list.add(new LaptopComparator("Dell", 16, 800));
		list.add(new LaptopComparator("Apple", 4,1600));
		list.add(new LaptopComparator("HP",8,1000));
		
		Comparator<LaptopComparator> comparator = new Comparator<LaptopComparator>()
				{

					@Override
					public int compare(LaptopComparator l1, LaptopComparator l2) {
						if(l1.getPrice()> l2.getPrice()) {
							return 1;
						}
						else {
							return -1;
						}
					}
			
				}
				;
				Collections.sort(list, comparator);
				
				for(LaptopComparator l:list) {
					System.out.println(l);
				}

	}

}
