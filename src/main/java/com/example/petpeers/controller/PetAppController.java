package com.example.petpeers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.petpeers.pojo.BuyRequestObject;
import com.example.petpeers.pojo.PetDto;
import com.example.petpeers.service.PetService;

@RestController
@RequestMapping("/pet")
public class PetAppController {
	
@Autowired
PetService petservice;
@PostMapping("/buypet")
public ResponseEntity<String> buyPet(@RequestBody BuyRequestObject buyRequestObject) {
	
return null;
}
@PostMapping("/addpet")
public ResponseEntity<String> addPet(@RequestBody PetDto petDto) {
	String s = petservice.addPet(petDto);
return new ResponseEntity<String>(s,HttpStatus.OK);
}
}
