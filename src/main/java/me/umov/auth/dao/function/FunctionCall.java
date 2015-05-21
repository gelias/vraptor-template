package me.umov.auth.dao.function;

import org.hibernate.jdbc.Work;

public interface FunctionCall<T> extends Work {

	public T getResult();
	
}
