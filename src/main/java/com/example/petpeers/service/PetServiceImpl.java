package com.example.petpeers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petpeers.entity.Pet;
import com.example.petpeers.pojo.PetDto;
import com.example.petpeers.repository.PetRepository;
@Service
public class PetServiceImpl  implements PetService {
	@Autowired
	PetRepository petRepository;

	@Override
	public String addPet(PetDto petDto) {
		try {
		Pet pet=new Pet();
		pet.setAge(petDto.getAge());
		pet.setPlace(petDto.getPlace());
		pet.setPetName(petDto.getName());
		petRepository.save(pet);
		
		return "sucessfully added";
		}
		catch(Exception e) {
			return "sucessfully not added";
		}
		
		
	}

	

}
