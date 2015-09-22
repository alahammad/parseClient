package com.bowyer.app.parsesendclient.demo;

import android.app.Application;
import android.util.Log;

import com.bowyer.app.parsesendclient.demo.logic.ParseLogic;
import com.parse.ParseInstallation;

/**
 * Created by Bowyer on 2015/08/02.
 */
public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseLogic.ParseInit(getApplicationContext());
        String idd  = ParseInstallation.getCurrentInstallation().getInstallationId();
        Log.d("hammad", idd);
    }
}
