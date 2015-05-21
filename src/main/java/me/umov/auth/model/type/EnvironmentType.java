package me.umov.auth.model.type;

public enum EnvironmentType {
	UNDER_DEVELOPMENT('D'),
	TEMPLATE('B'),
	IN_USE('U');

	private Character value;

	private EnvironmentType(Character value) {
		this.value = value;
	}

	public Character getValue() {
		return this.value;
	}

	public static EnvironmentType getByValue(Character value) {
		for (EnvironmentType type : values()) {
			if (type.getValue().equals(value))
				return type;
		}
		return null;
	}
}
