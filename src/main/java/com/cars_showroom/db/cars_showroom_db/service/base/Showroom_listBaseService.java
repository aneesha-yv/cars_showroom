package com.cars_showroom.db.cars_showroom_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cars_showroom.db.cars_showroom_db.entity.Showroom_list;

//IMPORT RELATIONS
import com.cars_showroom.db.cars_showroom_db.entity.Cars_list;
import com.cars_showroom.db.cars_showroom_db.entity.Showroom_list;

@Service
public class Showroom_listBaseService {

	
	@Autowired
	private Datastore datastore;


    //CRUD METHODS
    
    	
    //CRUD - GET LIST
    	
	public List<Showroom_list> getList() {
		return (ArrayList<Showroom_list>) datastore.find(Showroom_list.class).asList();
	}

    	
    
    

    
    /*
     * CUSTOM SERVICES
     * 
     *	These services will be overwritten and implemented in showroom_listService.java
     */
    


}
