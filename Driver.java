package com.gl.driver;

import com.gl.departmentservice.AdminDepartment;
import com.gl.departmentservice.HrDepartment;
import com.gl.departmentservice.SuperDept;
import com.gl.departmentservice.TechDepartment;


public class Driver {
public static void main(String[] args ) 
{
	

	 SuperDept sd = new SuperDept();
	 System.out.println();
	 System.out.println(sd.departmentName());
	 System.out.println(sd.getTodayssWork());
	 System.out.println(sd.getWorkDeadline());
	 System.out.println(sd.isTodayAHoliday());
	 
	 AdminDepartment ad =new AdminDepartment();
	 System.out.println();
	 System.out.println(ad.departmentName());
	 System.out.println(ad.getTodayssWork());
	 System.out.println(ad.getWorkDeadline());
	 SuperDept at=new AdminDepartment();
	 System.out.println(at.isTodayAHoliday());
	 
	 
	 HrDepartment hd =new HrDepartment();
	 System.out.println();
	 System.out.println(hd.departmentName());
 	 System.out.println(hd.getTodayssWork());
 	 System.out.println(hd.getWorkDeadline());
 	 System.out.println(hd.doActivity());
	 SuperDept ht=new HrDepartment();
	 System.out.println(ht.isTodayAHoliday());
 	
 	
 	TechDepartment td =new TechDepartment();
 	System.out.println();
	System.out.println(td.departmentName());
	System.out.println(td.getTodayssWork());
	System.out.println(td.getWorkDeadline());
	System.out.println(td.getTechStackInformation());
	SuperDept tt=new TechDepartment();
	System.out.println(tt.isTodayAHoliday());
	
	
	
	
	
 	}
	


}
