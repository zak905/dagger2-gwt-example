package com.gwidgets.example.client;

import javax.inject.Inject;

import com.google.gwt.core.client.GWT;

public class ImageUploader {
	
	
	@Inject
	public ImageUploader() {

	}

	public void upload(String url) {
		GWT.log("uploading compresesed image at " + url);
	}

}
