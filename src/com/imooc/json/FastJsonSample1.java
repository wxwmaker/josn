package com.imooc.json;

import java.util.Calendar;

import com.alibaba.fastjson.JSON;

public class FastJsonSample1 {
public static void main(String[] args) {
	Employee employee=new Employee();
	employee.setEmpno(4488);
	employee.setEname("王晓东");
	employee.setJob("客户经理");
	employee.setSalary(10000f);
	employee.setDname("市场部");
	Calendar calendar=Calendar.getInstance();
	calendar.set(2019, 0, 30, 0, 0, 0);
	employee.setHdate(calendar.getTime());
	//对象转json字符串
	String jsonString = JSON.toJSONString(employee);
	System.out.println(jsonString);
	//json字符串转对象
	Employee emp = JSON.parseObject(jsonString,Employee.class);
	System.out.print(emp.getEname());
	
}
}
