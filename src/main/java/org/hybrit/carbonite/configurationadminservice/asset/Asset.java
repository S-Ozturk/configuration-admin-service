package org.hybrit.carbonite.configurationadminservice.asset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.hybrit.carbonite.configurationadminservice.modeller.AssetVersionModeller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

public class Asset {
	
	
	private AssetVersionModeller id;
	private AssetVersionModeller mapping;
	private AssetVersionModeller rule;
	
	/*private String id;
	private String mapping;
	private String rule;
	private String categories;
	private String destinations;
	private String assets;*/
	private ArrayList<String> categories;
	private ArrayList<String>  destinations;
	private ArrayList<String>  assets;

	public Asset() {}
	/*
	public Asset(String mapping, String rule, String categories, String destinations, String assets) {
        this.mapping = mapping;
        this.rule = rule;
        this.categories = categories;
        this.destinations = destinations;
        this.assets = assets;
    }*/

    public Asset(AssetVersionModeller id, AssetVersionModeller mapping, AssetVersionModeller rule, ArrayList<String>  categories, ArrayList<String>  destinations, ArrayList<String>  assets) {
    	this.id = id;
        this.mapping = mapping;
        this.rule = rule;
        this.categories = categories;
        this.destinations = destinations;
        this.assets = assets;
    }

    @Override
    public String toString() {
        return String.format(
                "Asset[objectId={ '%s' , '%s' } mapping={ '%s' , '%s' }, rule={ '%s' , '%s' }, categories='%s', destinations='%s', assets='%s']",
                id.getName(), id.getVersion(), mapping.getName(), mapping.getVersion(), rule.getName(), rule.getVersion(), categories,destinations,assets);
    }

	public AssetVersionModeller getObjectId() {
		return id;
	}

	public void setObjectId(AssetVersionModeller id) {
		this.id = id;
	}

	public AssetVersionModeller getMapping() {
		return mapping;
	}

	public void setMapping(AssetVersionModeller mapping) {
		this.mapping = mapping;
	}

	public AssetVersionModeller getRule() {
		return rule;
	}

	public void setRule(AssetVersionModeller rule) {
		this.rule = rule;
	}

	public ArrayList<String> getCategories() {
		return categories;
	}

	public void setCategories(ArrayList<String> categories) {
		this.categories = categories;
	}

	public ArrayList<String> getDestinations() {
		return destinations;
	}

	public void setDestinations(ArrayList<String> destinations) {
		this.destinations = destinations;
	}

	public ArrayList<String> getAssets() {
		return assets;
	}

	public void setAssets(ArrayList<String> assets) {
		this.assets = assets;
	}
    
    
}
