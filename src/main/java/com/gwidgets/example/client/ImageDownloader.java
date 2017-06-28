package com.gwidgets.example.client;

import javax.inject.Inject;

import com.google.gwt.core.client.GWT;

public class ImageDownloader {
	
	int timeout;
	
	//@Inject we cannot use inject on the constructor anymore
	public ImageDownloader(int timeout) {
            this.timeout = timeout;
	}

	public void download(String url) {
		GWT.log("downloading image at" + url);
	}
	
	

}
