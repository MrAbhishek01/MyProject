package com.abhi.hasSet;

import java.util.HashSet;
import com.abhi.sbean.EmployeeBean;
import java.util.List;

public class HashSetExample {

    public HashSet<EmployeeBean> employeeSet;

    // Constructor to initialize the HashSet
    public HashSetExample(HashSet<EmployeeBean> employeeSet) {
        this.employeeSet = employeeSet;
    }

    // Method to add multiple EmployeeBean objects
    public void addMultipleObjects(List<EmployeeBean> employees) {
        for (EmployeeBean eb : employees) {
            if (employeeSet.add(eb)) {
                System.out.println("Employee added: " + eb);
            } else {
                System.out.println("Employee already exists: " + eb);
            }
        }
    }
}
