package com.cars_showroom.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.PropertySource;

import com.cars_showroom.controller.base.Cars_listBaseController;

@RestController
@PropertySource("classpath:${configfile.path}/cars_showroom.properties")
@RequestMapping(value="${endpoint.api}", headers = "Accept=application/json")
public class Cars_listController extends Cars_listBaseController {

	//OVERRIDE HERE YOUR CUSTOM CONTROLLER

}
