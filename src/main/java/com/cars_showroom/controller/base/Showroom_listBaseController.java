package com.cars_showroom.controller.base;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.bson.types.ObjectId;
import org.springframework.security.access.annotation.Secured;
import org.springframework.beans.factory.annotation.Autowired;
import com.cars_showroom.db.cars_showroom_db.service.Showroom_listService;
import com.cars_showroom.db.cars_showroom_db.entity.Showroom_list;

//IMPORT RELATIONS
import com.cars_showroom.db.cars_showroom_db.entity.Cars_list;
import com.cars_showroom.db.cars_showroom_db.entity.Showroom_list;

public class Showroom_listBaseController {
    
    @Autowired
	Showroom_listService showroomListService;



//CRUD METHODS

	
    //CRUD - GET LIST
    @Secured({ "ROLE_PRIVATE_USER" })
	@RequestMapping(value = "/showroom_list", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Showroom_list> getList() {
		return showroomListService.getList();
	}
	
	


/*
 * CUSTOM SERVICES
 * 
 *	These services will be overwritten and implemented in  Custom.js
 */


	
}
