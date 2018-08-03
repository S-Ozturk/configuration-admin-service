package org.hybrit.carbonite.configurationadminservice.asset;

import org.hybrit.carbonite.configurationadminservice.asset.Asset;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AssetRepository extends MongoRepository<Asset, String> {
	
}

