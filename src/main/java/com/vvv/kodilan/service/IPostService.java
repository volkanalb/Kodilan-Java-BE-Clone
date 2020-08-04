package com.vvv.kodilan.service;

import com.vvv.kodilan.view.pub.PostView;

public interface IPostService {
	PostView getPublicPostView(Integer page);
}
