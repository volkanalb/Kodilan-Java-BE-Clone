package com.vvv.kodilan.view.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum POST_TYPE {
	FULLTIME(1, "TAM ZAMANLI"), PARTTIME(2, "YARI ZAMANLI"), TRAINEE(3, "STAJYER"), FREELANCER(4, "FREELANCE");

	private Integer id;
	private String name;

	POST_TYPE(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@JsonCreator
    public static POST_TYPE fromString(String id) {
        if(id == null) return null;
        else {
        	for(POST_TYPE type:POST_TYPE.values()) {
        		if(type.getId().toString().equals(id))
        			return type;
        	}
        }
		return null;
    }
	
	@JsonValue
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
