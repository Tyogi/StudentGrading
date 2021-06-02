package com.mile1.main;
import com.mile1.bean.*;
import com.mile1.service.*;
import com.mile1.exception.*;

public class StudentMain {
	static Student data[] =new Student[4];
	
	StudentMain() 
	{
		for(int i=0;i<data.length;i++) {
			data[i]=new Student();
		}
		data[0]=new Student("Sekar",new int[] {85,75,91});
		data[1]=new Student(null,new int[] {11,22,33});
		data[2]=null;
		data[3]=new Student("Manoj",null);
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		StudentMain s=new StudentMain();
		StudentReport sr=new StudentReport();
		StudentService ss=new StudentService();
		try {
			for(int i=0;i<data.length;i++) {
				if(sr.validate(data[i]).equalsIgnoreCase("Valid")){
				System.out.println(data[i].getName()+"'s grade is "+sr.findGrades(data[i]));
				}
			}
			System.out.println("Count of null marks is:"+ss.findNumberOfNullMarksArray(data));
			System.out.println("Count of null name is:"+ss.findNumberofNullName(data));
			System.out.println("Count of null object is:"+ss.findNumberofNullObjects(data));
		}
		catch(NullMarksArrayException ma) {
			ma.printStackTrace();
		}
		catch(NullNameException ne) {
			ne.printStackTrace();
		}
		catch(NullStudentObjectException so) {
			so.printStackTrace();
		}
	}

}
