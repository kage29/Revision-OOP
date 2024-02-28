package com.jdc.itr;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorTest {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
		removeEven(set);

	}

//	public static void removeEven(Collection<Integer> collection) {
//		for(Integer i:collection) {
//			if(i % 2 ==0) {
//				collection.remove(i);
//			}
//		}
//	}

	public static void removeEven(Collection<Integer> collection) {
		Iterator<Integer> itr = collection.iterator();// like looping
		while (itr.hasNext()) {
			Integer data = itr.next();
			if (data % 2 == 0) {
				itr.remove();
			}
		}System.out.println(collection);
	}
}
