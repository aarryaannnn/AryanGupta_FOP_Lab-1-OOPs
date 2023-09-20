package com.gl.departments.hrdepartment;

import com.gl.departments.superdepartment.SuperDepartment;

public class HRDepartment extends SuperDepartment implements HRDepartmentInterface {

	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return "HR Department";
	}

	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "Fill today’s timesheet and mark your attendance";
	}

	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Complete by EOD";
	}
	
	@Override
	public String doActivity() {
		// TODO Auto-generated method stub
		return "team Lunch";
	}

}
