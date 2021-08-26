package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Employee;

public class EmployeeDAO extends DAO{
	public List<Employee> listAllEmployees() throws SQLException{
		setStatement(getConnection().createStatement());
		setResultSet(getStatement().executeQuery("SELECT name, birth_date, gender, email, start_date, team, cpf FROM peoplemanagement.employee"));
		
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee employee = null;
		while(getResultSet().next()) {
			employee = new Employee();
			employee.setName(getResultSet().getString("name"));
			employee.setGender(getResultSet().getString("gender"));
			employee.setEmail(getResultSet().getString("email"));
			employee.setTeam(getResultSet().getString("team"));
			employee.setBirthDate(getResultSet().getDate("birth_date"));
			employee.setStartDate(getResultSet().getDate("start_date"));
			employee.setCpf(getResultSet().getString("cpf"));
			
			employeeList.add(employee);
		}
		
		getConnection().close();
		return employeeList;
	}
	public void insert(Employee newEmployee) throws SQLException{
		setPrepSt(getConnection().prepareStatement("INSERT INTO peoplemanagement.employee (name, birth_date, gender, email, start_date, team, cpf) VALUES (?, ?, ?, ?, ?, ?, ?)"));
		int index = 0;
		getPrepSt().setString(++index, newEmployee.getName());
		getPrepSt().setDate(++index, newEmployee.getBirthDate());
		getPrepSt().setString(++index, newEmployee.getGender());
		getPrepSt().setString(++index, newEmployee.getEmail());
		getPrepSt().setDate(++index, newEmployee.getStartDate());
		getPrepSt().setString(++index, newEmployee.getTeam());
		getPrepSt().setString(++index, newEmployee.getCpf());
		getPrepSt().executeUpdate();
		getConnection().close();
	}
}
