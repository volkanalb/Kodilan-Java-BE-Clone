package com.vvv.kodilan.service.impl;

import java.io.File;
import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vvv.kodilan.service.ITagService;
import com.vvv.kodilan.view.TagView;

@Service
public class TagService implements ITagService {

	public TagView getTagData(Integer page) {
		// TODO Check by page Id
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			File resource = new ClassPathResource("data/data-tagview-p1.json").getFile();
			return mapper.readValue(resource, TagView.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
