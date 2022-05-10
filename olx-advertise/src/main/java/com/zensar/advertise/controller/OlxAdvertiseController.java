package com.zensar.advertise.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.adverise.service.OlxAdvertiseService;
import com.zensar.advertise.entity.Advertise;
import com.zensar.advertise.entity.AdvertiseDetails;



@RestController
@RequestMapping(produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}, consumes= { MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
public class OlxAdvertiseController {

	@Autowired
	private OlxAdvertiseService olxadvertiseService;

	@PostMapping(value="/advertise",produces = {MediaType.APPLICATION_XML_VALUE ,MediaType.APPLICATION_JSON_VALUE},consumes ={MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Advertise> addAdvertise(@RequestBody Advertise ads,
	@RequestHeader("userName") String username, @RequestHeader("password") String password) {
	Advertise advertise =olxadvertiseService.addAdvertise(ads, username, password);
	return new ResponseEntity<Advertise>(advertise,HttpStatus.CREATED);//run
	}
	
@GetMapping("/user/advertise/{postId}")//run
public Advertise getAdvertise(@PathVariable long postId,@RequestHeader("userName") String username, @RequestHeader("password") String password) {
	return olxadvertiseService.getAdvertise(postId, username, password);
		
	}

	@PutMapping("/advertise/{id}")
	public Advertise updateAdvertise(@PathVariable long id, @RequestBody Advertise advertises,
			@RequestHeader("userName") String username, @RequestHeader("password") String password) {
		return olxadvertiseService.updateAdvertise(id, advertises, username, password);

	}
	
	@GetMapping("/user/advertise")//run
	public List<Advertise> getAllAdvertise(@RequestHeader("userName") String username, @RequestHeader("password") String password) {
		return olxadvertiseService.getAllAdvertise(username, password);
	}
	
	@DeleteMapping("/user/advertise/{postId}")//run
	public boolean deleteAdvertise(@PathVariable("postId") long id,@RequestHeader("userName") String username, @RequestHeader("password") String password) {
               return olxadvertiseService.deleteAdvertise(id, username, password);
	}
	
	@GetMapping(value="/advertise/search/{filtercriteria}")
	public Advertise searchAdvertisementsByCriteria(@PathVariable long filtercriteria, String category, String toDate, String fromDate) {
	return olxadvertiseService.searchAdvertisementsByCriteria(category, toDate, filtercriteria, fromDate);
	}
	
	@GetMapping("/advertise/search")
	public List<Advertise> searchAdvertise() {
		
		return olxadvertiseService.searchAdvertise();
		
	}
	@GetMapping("/advertise/{postId}")
	public List<AdvertiseDetails> advertiseDetails(@PathVariable("postId") long id,@RequestHeader("userName") String username, @RequestHeader("password") String password) {
		
		return olxadvertiseService.advertiseDetails(id, username, password);
		
	}

}
