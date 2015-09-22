package com.bowyer.app.parsesendclient.demo.logic;

import android.content.Context;
import android.util.Log;

import com.bowyer.app.parsesendclient.demo.constant.EnvConst;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.ParsePush;
import com.parse.SaveCallback;


/**
 * Created by Bowyer on 2015/08/01.
 */
public class ParseLogic {

    private static final String TAG ="Parse" ;

    public static void ParseInit(Context context) {
        Parse.initialize(context, EnvConst.PARSE_APPLICATION_ID,
                EnvConst.PARSE_CLIENT_KEY);
        setChannel("ala");
    }

    public static void setChannel(String channel) {
//        ParseInstallation install = ParseInstallation.getCurrentInstallation();
//        List<String> channels = new ArrayList<>();
//        channels.add(channel);
//        install.put("channels", channels);
//        install.saveInBackground();


        ParseInstallation.getCurrentInstallation().saveInBackground();

        ParsePush.subscribeInBackground(channel, new SaveCallback() {
            @Override
            public void done(ParseException e) {
                Log.e(TAG, "Successfully subscribed to Parse!");
            }
        });
    }

      public static String getID(){
          return  ParseInstallation.getCurrentInstallation().getInstallationId();
     }
}
