package com.vvv.kodilan.model;

import java.util.Date;
import java.util.List;

import com.vvv.kodilan.model.enums.POST_STATUS;
import com.vvv.kodilan.model.enums.POST_TYPE;


public class Post {
	private String slug;
	private String position;
	private String description;
	private String apply_url;
	private String apply_email;
	private Location location;
	private POST_TYPE type;
	private POST_STATUS status;
	private Integer is_featured;
	private Date created_at;
	private Date updated_at;
	private String post_url;
	private Company company;
	private List<Tag> tags;
}