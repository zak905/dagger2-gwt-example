package com.gwidgets.example.client;

import javax.inject.Singleton;

import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.web.bindery.event.shared.EventBus;


import dagger.Component;



@Component(modules=ImageCompressionModule.class)
public interface AppComponent {
	
	ImageCompressor getImageCompressor();
	
}
