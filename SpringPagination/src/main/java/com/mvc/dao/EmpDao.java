package com.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mvc.bean.Employee;

public class EmpDao {
   public JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}
   public List<Employee> getAllEmployee(int pageid,int total){
	   String sql="select * from employee limit "+(pageid-1)+","+total;
	  return template.query(sql,new RowMapper<Employee>() {

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Employee  e=new Employee();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setSalary(rs.getDouble(3));
			return e;
			
		}
		  
	  });
	   
   }
}
