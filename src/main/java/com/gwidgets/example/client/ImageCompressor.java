package com.gwidgets.example.client;

import javax.inject.Inject;
import javax.inject.Provider;


import com.google.gwt.core.client.GWT;

public class ImageCompressor {
	
	@Inject public ImageDownloader downloader;
	@Inject public ImageUploader uploader;
	
	@Inject
	public ImageCompressor(){	
	}

	
	public void compress(String url) {
		downloader.download(url);
		GWT.log("compressing image");
		uploader.upload(url);
	}

}
