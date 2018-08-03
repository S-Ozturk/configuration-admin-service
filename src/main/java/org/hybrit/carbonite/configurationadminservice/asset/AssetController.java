package org.hybrit.carbonite.configurationadminservice.asset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;

import org.hybrit.carbonite.configurationadminservice.modeller.AssetVersionModeller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssetController {
	
	@Autowired
	private AssetRepository repository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String getAllAssets() {
		for(Asset a : repository.findAll()) {
			System.out.println(a);
		};
	    return "get some asset is working";
	}
	
	@RequestMapping(value = "/{assetId}", method = RequestMethod.GET)
	@ResponseBody
	public Asset getAsset(@PathVariable String assetId) {	
		return null;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public String addHardCodedAssets() {
		AssetVersionModeller objectId = new AssetVersionModeller("idTest","0.0.1");
		AssetVersionModeller mapping = new AssetVersionModeller("mappingTest","0.0.1");
		AssetVersionModeller rule = new AssetVersionModeller("ruleTest","0.0.1");
		ArrayList<String> categories = new ArrayList<String>();
		categories.add("rijd vrij");
		categories.add("leanable");
		ArrayList<String> destinations = new ArrayList<String>();
		destinations.add("Amsterdam");
		destinations.add("Utrecht");
		ArrayList<String> assets = new ArrayList<String>();
		assets.add("83c249c4-5759-46bd-b55b-5d779a9ad11f");
		assets.add("49c27f85-359a-47dd-891d-bfc075bea43b");
		assets.add("db6ebfa4-01a1-4093-bef4-743c37f300e4");
		
        
		/*categories,  destinations, assets*/
		//repository.save(new Asset("mapping","rule", "a",  "a", "a"));
		repository.save(new Asset(objectId, mapping, rule, categories,  destinations, assets));
	    return "added an asset";
    }
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseBody
	public Asset addAssetByPost(@RequestBody Asset asset) {
		return repository.save(asset);
		/*Asset temp = new Asset();
		if(asset.getObjectId() != null) temp.setObjectId(asset.getObjectId());
		if(asset.getMapping() != null) temp.setMapping(asset.getMapping());
		if(asset.getRule() != null) temp.setRule(asset.getRule());
		if(asset.getCategories() != null) temp.setCategories(asset.getCategories());
		if(asset.getDestinations() != null) temp.setDestinations(asset.getDestinations());
		if(asset.getAssets()!= null) temp.setAssets(asset.getAssets());*/
	    //return temp;
    }
	
}
