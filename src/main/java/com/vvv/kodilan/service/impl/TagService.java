package com.vvv.kodilan.service.impl;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vvv.kodilan.service.ITagService;
import com.vvv.kodilan.view.TagView;

@Service
public class TagService implements ITagService {

	public TagView getTagData(Integer page) {
		// TODO Check by page Id

		File file = new File(this.getClass().getClassLoader().getResource("data/data-tagview-p1.json").getFile());
		ObjectMapper mapper = new ObjectMapper();
		try {
			TagView tv = mapper.readValue(file, TagView.class);
			return tv;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
