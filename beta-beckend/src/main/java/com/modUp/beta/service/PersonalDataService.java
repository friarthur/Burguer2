package com.modUp.beta.service;


import com.modUp.beta.model.PersonalData;
import com.modUp.beta.repository.PersonalDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalDataService {

    @Autowired
    private PersonalDataRepository repository;

    public PersonalData save(PersonalData name){
        return repository.save(name);
    }
    public PersonalData lastNameSave(PersonalData lastName){
        return repository.save(lastName);
    }
    public PersonalData streetSave(PersonalData street){
        return repository.save(street);
    }
    public PersonalData neighbothoodSave(PersonalData neighbothood){
        return repository.save(neighbothood);
    }
    public PersonalData numberSave(PersonalData number){
        return repository.save(number);
    }
    public PersonalData descriptionSave(PersonalData description){
        return repository.save(description);
    }







}
