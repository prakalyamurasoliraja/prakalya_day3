package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.tabentity;

public interface tabrepo extends JpaRepository<tabentity,Integer> {

}