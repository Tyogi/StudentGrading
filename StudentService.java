package com.mile1.service;

import com.mile1.bean.*;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
public class StudentService {
	public int findNumberOfNullMarksArray(Student s[]) throws NullStudentObjectException,NullMarksArrayException,NullNameException{
		int c=0;
		int n=s.length;
		for(int i=0;i<n;i++) {
			if(s[i]!=null && s[i].marks==null) {
				c++;
			}
		}
		return c;
	}
	public int findNumberofNullName(Student s[]) throws NullStudentObjectException,NullMarksArrayException,NullNameException {
		int c1=0;
		int n=s.length;
		for(int i=0;i<n;i++) {
			if(s[i]!=null && s[i].name==null) {
				c1++;
			}
		}
		return c1;
	}
	public int findNumberofNullObjects(Student s[]) throws NullStudentObjectException,NullMarksArrayException,NullNameException{
		int c2=0;
		int n=s.length;
		for(int i=0;i<n;i++) {
			if(s[i]==null) {
				c2++;
			}
		}
		return c2;
	}
}
