package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToSetJava8 {
	public static void main (String [] args) {
		List<Integer> list=Arrays.asList(1,2,4,5,6,7,8,9,1,2,3,4,5);
		list.stream().collect(Collectors.toSet()).forEach(System.out::println);
	}
	

}
