package com.demo.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.demo.beans.EmployeeBeans;

public class MainApp {
	public static void main(String[] args) {
		List<EmployeeBeans> list = new ArrayList<EmployeeBeans>();
		list.add(new EmployeeBeans(103, "DMG", "2100"));
		list.add(new EmployeeBeans(102, "ABC", "4100"));
		list.add(new EmployeeBeans(104, "OMG", "5100"));
		list.add(new EmployeeBeans(101, "AAB", "1100"));

		/*
		 * Collections.sort(list); for (EmployeeBeans e : list) {
		 * System.out.println(e); }
		 */

		Comparator<EmployeeBeans> comp = new Comparator<EmployeeBeans>() {

			@Override
			public int compare(EmployeeBeans o1, EmployeeBeans o2) {
				if (o1.getId() > o2.getId()) {
					return 1;
				} else {
					return -1;
				}
			}
		};

		Collections.sort(list, comp);
		for (EmployeeBeans emp : list) {
			System.out.println(emp);
		}
	}
}
