package com.cars_showroom.controller.base;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.bson.types.ObjectId;
import org.springframework.security.access.annotation.Secured;
import org.springframework.beans.factory.annotation.Autowired;
import com.cars_showroom.db.cars_showroom_db.service.LocationService;
import com.cars_showroom.db.cars_showroom_db.entity.Location;

//IMPORT RELATIONS
import com.cars_showroom.db.cars_showroom_db.entity.Showroom_list;

public class LocationBaseController {
    
    @Autowired
	LocationService locationService;



//CRUD METHODS


    //CRUD - CREATE
    @Secured({ "ROLE_PRIVATE_USER" })
	@RequestMapping(value = "/location",method = RequestMethod.POST, headers = "Accept=application/json")
	public Location insert(@RequestBody Location obj) {
		 return locationService.insert(obj);
	}

	
    //CRUD - REMOVE
    @Secured({ "ROLE_PRIVATE_USER" })
	@RequestMapping(value = "/location/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void delete(@PathVariable("id") String id) {
		locationService.delete(id);
	}
	
	
    //CRUD - GET ONE
    @Secured({ "ROLE_PRIVATE_USER" })
	@RequestMapping(value = "/location/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Location get(@PathVariable String id) {
		return locationService.get(id);
	}
	
	
    //CRUD - GET LIST
    @Secured({ "ROLE_PRIVATE_USER" })
	@RequestMapping(value = "/location", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Location> getList() {
		return locationService.getList();
	}
	
	

    //CRUD - EDIT
    @Secured({ "ROLE_PRIVATE_USER" })
	@RequestMapping(value = "/location/{id}", method = RequestMethod.POST, headers = "Accept=application/json")
	public Location update(@RequestBody Location obj) {
		return locationService.update(obj);
	}
	


/*
 * CUSTOM SERVICES
 * 
 *	These services will be overwritten and implemented in  Custom.js
 */


    /*
    Name: location
    Description: 
    Params: 
    
    
    @RequestMapping(value = "/location/location", method = RequestMethod.GET, headers = "Accept=application/json")
    public Object location() {
		return new HashMap<String, String>();
    }
    */
    		

	
}
