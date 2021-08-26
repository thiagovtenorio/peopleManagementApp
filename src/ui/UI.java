package ui;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import dao.EmployeeDAO;
import domain.Employee;

public class UI {
	private EmployeeDAO database;
	
	public UI () {
		this.database = new EmployeeDAO();
	}
	
	public void signIn(String name, String birthDate, String gender, String email, String cpf, String startDate, String team)
	{
		Employee newEmployee = new Employee();
		newEmployee.setName(name);
		newEmployee.setGender(gender);
		newEmployee.setEmail(email);
		newEmployee.setCpf(cpf);
		newEmployee.setTeam(team);
		
		//newEmployee.setBirthDate(birthDate);
		//newEmployee.setBirthDate(startDate);
		
		System.out.println(newEmployee);
	}
	public String list() { 
		StringBuilder grid = new StringBuilder();
		try {
			
			List<Employee> resultList = this.database.listAllEmployees();
			
			for(Employee employee : resultList) {
				grid.append(employee.toString());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return grid.toString();
	}
}