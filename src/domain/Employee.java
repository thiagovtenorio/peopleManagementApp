package domain;

import java.sql.Date;


public class Employee {
	private String name;
	private Date birthDate;
	private String gender;
	private String email;
	private String cpf;
	private Date startDate;
	private String team;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("| ").append(name).append(" |");
		sb.append(birthDate).append(" |");
		sb.append(gender).append(" |");
		sb.append(email).append(" |");
		sb.append(cpf).append(" |");
		sb.append(startDate).append(" |");
		sb.append(team).append(" |");
		sb.append("\n");
		
		return sb.toString();
	}
	
}