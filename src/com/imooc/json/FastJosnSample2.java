package com.imooc.json;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;


public class FastJosnSample2 {
public static void main(String[] args) {
	
	List empList=new ArrayList();
	for(int i=1;i<=100;i++) {
		Employee employee=new Employee();
		employee.setEmpno(4488+i);
		employee.setEname("员工"+i);
		empList.add(employee);
	}	
	String jsonString = JSON.toJSONString(empList);
	System.out.println(jsonString);
	List<Employee> emps = JSON.parseArray(jsonString,Employee.class);
	for(Employee e:emps) {
		System.out.println(e.getEmpno()+":"+e.getEname());
		
	}
}

}
