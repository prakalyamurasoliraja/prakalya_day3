package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.tabentity;

import com.example.demo.Repository.tabrepo;

@Service

public class tabservice {


@Autowired

tabrepo empRepo;


public tabentity saveDetails(tabentity em)

{

return empRepo.save(em);

}

public List<tabentity> getDetails()

{

return empRepo.findAll();

}

}