package com.zensar.master.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.master.entity.AdvertiseCategory;
import com.zensar.master.entity.AdvertiseStatus;
import com.zensar.master.service.OlxMasterService;



@RestController
@RequestMapping(value="/advertise",produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}, consumes= { MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
public class MyController {
	
	@Autowired
	private OlxMasterService olxmasterService;
	
	@GetMapping("/category")
	public List<AdvertiseCategory> getAllAdvertisementCategories() {
		return olxmasterService.getAllAdvertisementCategories();
	}
	
	@GetMapping("/status")
	public List<AdvertiseStatus> getAllAdvertisementStatus(){
		return olxmasterService.getAllAdvertisementStatus();
	}
	

}