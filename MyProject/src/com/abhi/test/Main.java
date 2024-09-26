package com.abhi.test;

import java.util.Arrays;
import java.util.HashSet;
import com.abhi.hasSet.HashSetExample;
import com.abhi.sbean.EmployeeBean;

public class Main {

	public static void main(String[] args) {
		// Create EmployeeBean objects
		EmployeeBean e1 = new EmployeeBean(45698, "Abhishek", "Satna", "a@gmail.com");
		EmployeeBean e2 = new EmployeeBean(45699, "Rahul", "Delhi", "r@gmail.com");
		EmployeeBean e3 = new EmployeeBean(45700, "Sneha", "Mumbai", "s@gmail.com");
		EmployeeBean e4 = new EmployeeBean(45701, "Amit", "Bangalore", "amit@gmail.com");
		EmployeeBean e5 = new EmployeeBean(45702, "Priya", "Kolkata", "priya@gmail.com");
		EmployeeBean e6 = new EmployeeBean(45703, "Neha", "Pune", "neha@gmail.com");
		EmployeeBean e7 = new EmployeeBean(45703, "Neha", "Pune", "neha@gmail.com");

		HashSet<EmployeeBean> ebSet = new HashSet<>();

		HashSetExample hashSetExample = new HashSetExample(ebSet);

		hashSetExample.addMultipleObjects(Arrays.asList(e1, e2, e3, e4, e5, e6,e7));
	}
}
