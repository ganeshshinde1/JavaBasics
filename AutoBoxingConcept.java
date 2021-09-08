package com.csi.core;

public class AutoBoxingConcept {
public static void main(String[] args) {
	int empId = 121;
	int employeeId = empId;// Autoboxing
	System.out.println("\n Employee Id;" + employeeId);
	double productPrice = 11.22;
	double pPrice = productPrice;
	System.out.println("\n ProductPrice;" + pPrice);
}
}
