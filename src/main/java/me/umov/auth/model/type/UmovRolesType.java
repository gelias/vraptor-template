package me.umov.auth.model.type;

public enum UmovRolesType {

	DEVELOPER_ACTIVITY('E', "agent.form.role.developer_activity", "agent.form.role.developer_activity.hint"),
	FIELD_OPERATOR('C', "agent.form.role.field_operator", "agent.form.role.field_operator.hint"),
	REAR_OPERATOR('O', "agent.form.role.rear_operator", "agent.form.role.rear_operator.hint"),
	READONLY_MANAGER('R', "agent.form.role.readonly_manager", "agent.form.role.readonly_manager.hint"),
	MANAGER('M', "agent.form.role.manager", "agent.form.role.manager.hint"),
	ADMIN('A', "agent.form.role.admin", "agent.form.role.admin.hint"),
	DEVELOPER('D', "agent.form.role.developer", "agent.form.role.developer.hint");

	private Character key;

	private String label;

	private String hint;

	private UmovRolesType(Character key, String label, String hint) {
		this.key = key;
		this.label = label;
		this.hint = hint;
	}

	public Character getKey() {
		return key;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
	}

	public String getHint() {
		return hint;
	}


	public static boolean isValidRole(UmovRolesType role) {
		for (UmovRolesType type : values()) {
			if (type.equals(role))
				return true;
		}
		return false;
	}

	public static UmovRolesType getRole(Character role) {
		for (UmovRolesType type : values()) {
			if (type.getKey().equals(role))
				return type;
		}
		return null;
	}

	public static Boolean isDeveloper(UmovRolesType role) {
		return role == null || DEVELOPER.equals(role);
	}

	public static Boolean isDeveloperActivity(UmovRolesType role) {
		return role == null || DEVELOPER_ACTIVITY.equals(role);
	}

	public static Boolean isAdmin(UmovRolesType role) {
		return role == null || ADMIN.equals(role);
	}

	public boolean isAbove(UmovRolesType anotherRole) {
		return ordinal() > anotherRole.ordinal();
	}

	public boolean isBelow(UmovRolesType anotherRole) {
		return ordinal() < anotherRole.ordinal();
	}

	public boolean isAllowed(UmovRolesType anotherRole) {
		return anotherRole != null && ordinal() <= anotherRole.ordinal();
	}
}
