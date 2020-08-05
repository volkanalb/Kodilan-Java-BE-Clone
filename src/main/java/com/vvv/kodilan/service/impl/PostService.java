package com.vvv.kodilan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vvv.kodilan.repository.IPostRepository;
import com.vvv.kodilan.service.IPostService;
import com.vvv.kodilan.view.pub.PostView;



@Service
public class PostService implements IPostService {

	@Autowired
	private IPostRepository postRepository; 
	
	@Override
	public PostView getPublicPostView(Integer page) {
		// TODO Auto-generated method stub
		return new PostView();
	}

}
