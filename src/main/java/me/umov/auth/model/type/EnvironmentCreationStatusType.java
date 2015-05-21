package me.umov.auth.model.type;

public enum EnvironmentCreationStatusType {

	NOT_CREATED('0', "Not created"),
	CREATION_IN_PROGRESS('1', "Creation in progress"),
	SUCCESSFULLY_CREATED('2', "Successfully created"),
	ERROR_CREATING('3', "Error creating");

	private Character status;
	private String descricao;

	private EnvironmentCreationStatusType(Character status, String descricao) {
		this.status = status;
		this.descricao = descricao;
	}

	public Character getStatus() {
		return status;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static EnvironmentCreationStatusType getByStatus(Character status) {
		for (EnvironmentCreationStatusType type : values())
			if (type.getStatus().equals(status))
				return type;
		
		return null;
	}

	public static Boolean isNotCreated(EnvironmentCreationStatusType statusType) {
		return NOT_CREATED.equals(statusType);
	}

	public static Boolean isInProgress(EnvironmentCreationStatusType statusType) {
		return CREATION_IN_PROGRESS.equals(statusType);
	}

	public static Boolean isSucessfullyCreated(EnvironmentCreationStatusType statusType) {
		return SUCCESSFULLY_CREATED.equals(statusType);
	}

	public static Boolean isErrorCreating(EnvironmentCreationStatusType statusType) {
		return ERROR_CREATING.equals(statusType);
	}
	
}
