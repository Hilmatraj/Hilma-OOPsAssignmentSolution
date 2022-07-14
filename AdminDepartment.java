package com.gl.departmentservice;

public class AdminDepartment extends SuperDept {
		
	public AdminDepartment()
	{
		
	}
	
	public String departmentName()
	{
		return "Admin Department"  ;
	}
	
	public String getTodaysWork()
	{
		return "Complete your documents Submission";
	}
	
	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}
	
	
}
