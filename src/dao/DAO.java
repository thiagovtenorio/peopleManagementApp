package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	private Connection connection;
	private PreparedStatement prepSt;
	private Statement statement;
	private ResultSet resultSet;
	
	private void createConnection(String url, String userName, String password) throws SQLException {
		this.connection = DriverManager.getConnection(url, userName, password);
	}
	public Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/peoplemanagement?useTimezone=true&serverTimezone=UTC";
		String userName = "root";
		String password = "servidor";
		createConnection(url, userName, password);
		return this.connection;
	}

	public PreparedStatement getPrepSt() {
		return prepSt;
	}

	public void setPrepSt(PreparedStatement prepSt) {
		this.prepSt = prepSt;
	}

	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	public ResultSet getResultSet() {
		return resultSet;
	}

	public void setResultSet(ResultSet resultSet) {
		this.resultSet = resultSet;
	}
	
}