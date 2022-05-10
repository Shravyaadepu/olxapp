package com.zensar.master.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.master.entity.AdvertiseCategory;
import com.zensar.master.entity.AdvertiseStatus;
@Service
public class OlxMasterServiceImpl implements OlxMasterService {

	static List<AdvertiseCategory> categories= new ArrayList<AdvertiseCategory>();
	static List<AdvertiseStatus> status=new ArrayList<AdvertiseStatus>();
	
	static {
		categories.add(new AdvertiseCategory(1L, "Furniture"));
		categories.add(new AdvertiseCategory(2L, "Cars"));
		categories.add(new AdvertiseCategory(3L, "Mobiles"));
		categories.add(new AdvertiseCategory(4L, "Real Estate"));
		categories.add(new AdvertiseCategory(5L, "Sports"));
	}
	
	static {
		status.add(new AdvertiseStatus(1L, "OPEN"));
		status.add(new AdvertiseStatus(2L, "CLOSED"));
	}
	
	
	@Override
	public List<AdvertiseCategory> getAllAdvertisementCategories() {
		return categories;
	}

	@Override
	public List<AdvertiseStatus> getAllAdvertisementStatus() {
		return status;
	}

}
