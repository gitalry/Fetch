package com.example.jamesg.fetch;

/**
 * Created by jamesg on 7/6/16.
 */
 import android.app.Application;
        import com.firebase.client.Firebase;

public class ToDoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }

}