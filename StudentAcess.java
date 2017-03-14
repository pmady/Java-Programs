package com.java.collections;

import java.util.*;

public class StudentAcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student(100,"Pavan",27);
		Student s2=new Student(101,"Somu",23);
		Student s3=new Student(101,"Rushi",23);
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(1,s3);
		System.out.println(al.get(0).Studentage);
		for(Student obj:al){
		
			System.out.println(obj);
		}
		Iterator it=al.iterator();
				
		while(it.hasNext()){
			Student st=(Student) it.next();
			System.out.println(st.StudentId+" "+st.Studentname+" "+st.Studentage);
		
	}

}
}
