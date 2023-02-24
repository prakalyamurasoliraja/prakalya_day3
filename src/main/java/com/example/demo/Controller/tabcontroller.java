package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.tabentity;

import com.example.demo.Service.tabservice;

@RestController

public class tabcontroller {

@Autowired

tabservice empService;



@PostMapping("/addDetails")

public tabentity addInfo(@RequestBody tabentity emp)

{

return empService.saveDetails(emp);

}

@GetMapping("/showDetails")

public List<tabentity> fetchDetails()

{

return empService.getDetails();

}



}