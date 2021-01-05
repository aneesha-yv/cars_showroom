package com.cars_showroom.db.cars_showroom_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cars_showroom.db.cars_showroom_db.entity.Location;

//IMPORT RELATIONS
import com.cars_showroom.db.cars_showroom_db.entity.Showroom_list;

@Service
public class LocationBaseService {

	
	@Autowired
	private Datastore datastore;


    //CRUD METHODS
    
    //CRUD - CREATE
    	
	public Location insert(Location obj) {
		datastore.save(obj);
		return obj;
	}
	
    	
    //CRUD - REMOVE
    
	public void delete(String id) {
		Query<Location> query = datastore.createQuery(Location.class).field("_id").equal(new ObjectId(id));
		datastore.delete(query);
	}

    	
    //CRUD - GET ONE
    	
	public Location get(String id) {
		return datastore.find(Location.class).field("_id").equal(new ObjectId(id)).get();
	}

    	
        	
    //CRUD - GET LIST
    	
	public List<Location> getList() {
		return (ArrayList<Location>) datastore.find(Location.class).asList();
	}

    	
        	
    //CRUD - EDIT
    	
	public Location update(Location obj) {
		datastore.save(obj);
		return obj;
	}
	
    	
    
    

    
    /*
     * CUSTOM SERVICES
     * 
     *	These services will be overwritten and implemented in locationService.java
     */
    
    
    /*
    
    YOU CAN COPY AND MODIFY THIS METHOD IN LocationService.java
    
    Name: location
    Description: 
    Params: 
    */
	public Object location () {
		
        return null;
        
	}
	
	


}
