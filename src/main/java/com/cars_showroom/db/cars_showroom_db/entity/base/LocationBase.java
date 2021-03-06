package com.cars_showroom.db.cars_showroom_db.entity.base;

/**
 * 
 * 
  _____                      _              _ _ _     _   _     _        __ _ _      
 |  __ \                    | |            | (_) |   | | | |   (_)      / _(_) |     
 | |  | | ___    _ __   ___ | |_    ___  __| |_| |_  | |_| |__  _ ___  | |_ _| | ___ 
 | |  | |/ _ \  | '_ \ / _ \| __|  / _ \/ _` | | __| | __| '_ \| / __| |  _| | |/ _ \
 | |__| | (_) | | | | | (_) | |_  |  __/ (_| | | |_  | |_| | | | \__ \ | | | | |  __/
 |_____/ \___/  |_| |_|\___/ \__|  \___|\__,_|_|\__|  \__|_| |_|_|___/ |_| |_|_|\___|
 
                                                                                   
 * DO NOT EDIT THIS FILE!! 
 *
 *  FOR CUSTOMIZE LocationBase PLEASE EDIT ../Location.java
 * 
 *  -- THIS FILE WILL BE OVERWRITTEN ON THE NEXT SKAFFOLDER CODE GENERATION --
 * 
 */
 

/**
 * This is the model of Location object
 * 
 */
 
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

import org.mongodb.morphia.annotations.Id;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.cars_showroom.utils.ObjectIdListSerializer;


//IMPORT RELATIONS
import com.cars_showroom.db.cars_showroom_db.entity.Showroom_list;

@Entity("Location")
public class LocationBase {
	
	@Id
	@JsonSerialize(using = ToStringSerializer.class)
	private ObjectId _id;
	
	// Attributes
    private String location;
	
	
	// Relations showrooms_list
	@JsonSerialize(using = ToStringSerializer.class)
	private ObjectId showrooms_list;
	
	
	
	

    // GETTER AND SETTER
    
	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId id) {
		this._id = id;
	}


	
	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}
    

	
    
    // Relations 1:m showrooms_list
	public ObjectId getShowrooms_list() {
		return showrooms_list;
	}

	public void setShowrooms_list(ObjectId showrooms_list) {
		this.showrooms_list = showrooms_list;
	}
    
    
    
    
}