package com.zensar.master.service;

import java.util.List;

import com.zensar.master.entity.AdvertiseCategory;
import com.zensar.master.entity.AdvertiseStatus;

public interface OlxMasterService {
	
	List<AdvertiseCategory> getAllAdvertisementCategories();
	
	 List<AdvertiseStatus> getAllAdvertisementStatus();

}
