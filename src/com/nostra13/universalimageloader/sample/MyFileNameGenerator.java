package com.nostra13.universalimageloader.sample;

import android.util.Log;

import com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator;

public class MyFileNameGenerator implements FileNameGenerator{

	private static final String TAG = "MyFileNameGenerator";

	@Override
	public String generate(String imageUri) {
		Log.i(TAG,"==1=========µØÖ·£º"+imageUri);
		imageUri = imageUri.substring(imageUri.lastIndexOf("/")+1);
		Log.i(TAG,"===2========Ãû×Ö£º"+imageUri);
		return imageUri;
	}

}
