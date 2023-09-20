package com.gl.departments.techdepartment;

import com.gl.departments.superdepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment implements TechDepartmentInterface{

	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return "Tech Department";
	}

	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "Complete coding of module 1";
	}

	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Complete by EOD";
	}
	
	@Override
	public String getTechStackInformation() {
		// TODO Auto-generated method stub
		return "core Java";
	}

}
