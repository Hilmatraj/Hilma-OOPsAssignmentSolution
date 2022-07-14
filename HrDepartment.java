package com.gl.departmentservice;

public class HrDepartment extends SuperDept {
	
	
	public HrDepartment()
	{
		
	}
	public String departmentName()
	{
		return "Hr Department"  ;
	}
	public String getTodaysWork()
	{
		return "Fill today's worksheet and mark your attendence";
	}
	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}
	public String doActivity()
	{
		return "team Lunch";
	}
}
