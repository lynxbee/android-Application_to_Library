package com.example.myapplication;

import android.util.Log;

public class AppToLibrary {
    public static final String TAG = "MyLibrary:AppToLibrary";
    public void AppToLibrary() {
    }

    public void HelloFromAppToLibraryClass() {
	    Log.d(TAG, "called function: HelloFromAppToLibraryClass");
    }
}
