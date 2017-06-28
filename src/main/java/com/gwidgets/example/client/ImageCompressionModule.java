package com.gwidgets.example.client;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ImageCompressionModule {

	@Provides
	public ImageDownloader getImageDowloader(){
		return new ImageDownloader(15);
	}
	
	
	
}
