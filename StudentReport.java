package com.mile1.service;
import com.mile1.exception.*;
import com.mile1.bean.*;
public class StudentReport {
	public String findGrades(Student studentObject){
		int sum=0;
		for(int i=0;i<studentObject.marks.length;i++) {
			if (studentObject.marks[i]<35) {
				studentObject.grade="F";
				return studentObject.grade;
			}
			else {
				sum+=studentObject.marks[i];
			}
		}
		if(sum<150) {
			studentObject.grade="C";
		}
		else if(sum<200) {
			studentObject.grade="B";
		}
		else if(sum<250) {
			studentObject.grade="A";
		}
		else {
			studentObject.grade="A+";
		}
		return studentObject.grade;
	}
	
	public  String validate(Student s)throws NullMarksArrayException,NullNameException,NullStudentObjectException{
			String s1="Invalid";
			try {
			if(s==null) {
				 throw new NullStudentObjectException();
			}
			else {
				if(s.getName()==null) {
					throw new NullNameException();
				}
				if(s.getMarks()==null) {
					throw new NullMarksArrayException();
				}
				else{
					return "Valid";
				}
			}
			}
			catch(Exception e) {
				e.toString();
			}
			return s1;
	}
}
