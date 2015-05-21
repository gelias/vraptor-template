package me.umov.auth.dao.function;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class LoginFunctionCall implements FunctionCall<Long> {

	private Long resultAgentId;
	private String domain;
	private String login;
	private String password;

	public LoginFunctionCall(String domain, String login, String password) {
		this.domain = domain;
		this.login = login;
		this.password = password;
	}
	
	@Override
	public void execute(Connection connection) throws SQLException {
		CallableStatement loginFunction = connection.prepareCall("{? = call flogin_agente(?, ?, ?)}");
		loginFunction.registerOutParameter(1, Types.BIGINT);
		loginFunction.setString(2, domain);
		loginFunction.setString(3, login);
		loginFunction.setString(4, password);
		loginFunction.execute();
		setResult(loginFunction.getLong(1));
		loginFunction.close();
	}

	private void setResult(long result) {
		this.resultAgentId = result > 0 ? result : null;
	}

	public Long getResult() {
		return resultAgentId;
	}

}
