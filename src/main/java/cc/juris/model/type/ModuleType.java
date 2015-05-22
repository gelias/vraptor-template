package cc.juris.model.type;

public enum ModuleType {

	CENTER('1', "center"),
	MOBILE('2', "mobile"),
	SYNC('3', "sync");
	
	private Character key;
	private String value;
	
	private ModuleType(Character key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public static ModuleType getByKey(Character key) {
		for (ModuleType type : values()) 
			if (type.getKey().equals(key))
				return type;
		
		return null;
	}
	
	public static ModuleType getByValue(String value) {
		for (ModuleType type : values()) 
			if (type.getValue().equals(value))
				return type;
		
		return null;
	}
	
	public Character getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}
	
}
