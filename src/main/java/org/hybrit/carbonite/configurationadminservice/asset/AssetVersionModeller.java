package org.hybrit.carbonite.configurationadminservice.asset;

public class AssetVersionModeller {
	
	private String name;
	private String version;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public AssetVersionModeller() {
		
	}
	
	public AssetVersionModeller(String name, String version) {
		this.name = name;
		this.version = version;
	}
}
