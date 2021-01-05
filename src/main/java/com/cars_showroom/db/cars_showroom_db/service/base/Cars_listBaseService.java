package com.cars_showroom.db.cars_showroom_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cars_showroom.db.cars_showroom_db.entity.Cars_list;

//IMPORT RELATIONS
import com.cars_showroom.db.cars_showroom_db.entity.Cars_list;

@Service
public class Cars_listBaseService {

	
	@Autowired
	private Datastore datastore;


    //CRUD METHODS
    
//CRUD - GET ONE
    	
	public Cars_list get(String id) {
		return datastore.find(Cars_list.class).field("_id").equal(new ObjectId(id)).get();
	}

    	
        	
    //CRUD - GET LIST
    	
	public List<Cars_list> getList() {
		return (ArrayList<Cars_list>) datastore.find(Cars_list.class).asList();
	}

    	
    
    

    
    /*
     * CUSTOM SERVICES
     * 
     *	These services will be overwritten and implemented in cars_listService.java
     */
    


}
