package com.cars_showroom.controller.base;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.bson.types.ObjectId;
import org.springframework.security.access.annotation.Secured;
import org.springframework.beans.factory.annotation.Autowired;
import com.cars_showroom.db.cars_showroom_db.service.Cars_listService;
import com.cars_showroom.db.cars_showroom_db.entity.Cars_list;

//IMPORT RELATIONS
import com.cars_showroom.db.cars_showroom_db.entity.Cars_list;

public class Cars_listBaseController {
    
    @Autowired
	Cars_listService carsListService;



//CRUD METHODS

	
    //CRUD - GET ONE
    @Secured({ "ROLE_PRIVATE_USER" })
	@RequestMapping(value = "/cars_list/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Cars_list get(@PathVariable String id) {
		return carsListService.get(id);
	}
	
	
    //CRUD - GET LIST
    @Secured({ "ROLE_PRIVATE_USER" })
	@RequestMapping(value = "/cars_list", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Cars_list> getList() {
		return carsListService.getList();
	}
	
	


/*
 * CUSTOM SERVICES
 * 
 *	These services will be overwritten and implemented in  Custom.js
 */


	
}
