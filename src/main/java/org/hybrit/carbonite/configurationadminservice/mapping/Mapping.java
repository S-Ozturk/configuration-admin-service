package org.hybrit.carbonite.configurationadminservice.mapping;

import java.util.HashMap;
import java.util.Map;

import org.hybrit.carbonite.configurationadminservice.modeller.AssetVersionModeller;

public class Mapping {
	
	private AssetVersionModeller id;

	Map<String, MappingValue> fields = new HashMap<>();

	public Mapping() {
	}
	
	public AssetVersionModeller getId() {
		return id;
	}

	public void setId(AssetVersionModeller id) {
		this.id = id;
	}

	public Map<String, MappingValue> getFields() {
		return fields;
	}

	public void setFields(Map<String, MappingValue> fields) {
		this.fields = fields;
	}
	
	
}
