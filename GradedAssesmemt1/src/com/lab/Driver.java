package com.lab;

import com.lab.department.AdminDepartment;
import com.lab.department.HrDepartment;
import com.lab.department.SuperDepartment;
import com.lab.department.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object creation of classes
		HrDepartment hr=new HrDepartment();
		AdminDepartment adm=new AdminDepartment();
		TechDepartment tech =new TechDepartment();
		SuperDepartment sup1=new HrDepartment();
		SuperDepartment sup2=new AdminDepartment();
		SuperDepartment sup3=new TechDepartment();
				
		
		final String s4="Today is not a holiday";
		
		//Admin department 
		adm.departmentName();
		String s9="Admin Department";
		System.out.println("Welcome to "+s9);
		
		adm.getTodaysWork();
		String s10="Complete your documents Submission";
		System.out.println(s10);
		
		adm.getWorkDeadline();
		String s11="Complete by EOD";
		System.out.println(s11);
		
        sup1.isTodayAHoliday();
		System.out.println(s4+"\n");
		
		
		//HR department 
		hr.departmentName();
		String s5="HR Department";
		System.out.println("Welcome to "+s5);
		
		hr.doActivity();
		String s8="team Lunch";
		System.out.println(s8);
		
		hr.getTodaysWork();
		String s6="Fill today’s worksheet and mark your attendance";
		System.out.println(s6);
		
		hr.getWorkDeadline();
		String s7="Complete by EOD";
		System.out.println(s7);
		
		sup2.isTodayAHoliday();
		System.out.println(s4+"\n");
		
		
	    //Tech department
		tech.departmentName();
		String s12="Tech Department";
		System.out.println("Welcome to "+s12);
		
		tech.getTodaysWork();
		String s13="Complete coding of module 1";
		System.out.println(s13);
		
		tech.getWorkDeadline();
		String s14="Complete by EOD";
		System.out.println(s14);
		
		tech.getTechStackInformation();
		String s15="Core Java";
		System.out.println(s15);	
		
		sup3.isTodayAHoliday();
		System.out.println(s4);
		
	}

}
