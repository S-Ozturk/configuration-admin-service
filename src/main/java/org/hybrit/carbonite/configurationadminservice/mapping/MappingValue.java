package org.hybrit.carbonite.configurationadminservice.mapping;

import java.util.List;

public class MappingValue {

	private String type;
	private List<String> args;
	public MappingValue(String type, List<String> args) {
		super();
		this.type = type;
		this.args = args;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<String> getArgs() {
		return args;
	}
	public void setArgs(List<String> args) {
		this.args = args;
	}
	
	
	
}
