package com.app.springboot.emobileconnect.controller;

import java.awt.List;
import java.util.ArrayList;

import javax.annotation.processing.SupportedAnnotationTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.springboot.emobileconnect.repo.EConnectionRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class EconnectionController {

	  @Autowired
	  EConnectionRepository eConnectionRepository;

	 

}
