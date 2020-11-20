package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);





        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("HVNDEqHsswsAVdMdeFEDNQGyqfl6DSuRIGMKOXuV")
                .clientKey("Nj9mtl3UuwAHH2WEqR7wB3Hid2hBkyMl3j25w8GI")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
