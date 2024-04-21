package com.tnsif.StaticKeyword;

public class employee {

		int eid;  // non-static 
		String name;
		static String company="TNSIF ";  // static
	
		employee(int r,String n){
		eid=r;
		name=n;
		}
		void display() {
				System.out.println(eid+" "+name+" "+company);
		}

}
