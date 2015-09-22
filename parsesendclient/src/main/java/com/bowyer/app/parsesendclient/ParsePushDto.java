package com.bowyer.app.parsesendclient;

/**
 * Created by Bowyer on 2015/08/02.
 */
public class ParsePushDto {

    public Object data;
    public String[] channels;
    public String push_time;

    public ParsePushDto setParsePushModel(Object model) {
        this.data = model;
        return this;
    }

    public ParsePushDto setChannels(String[] channels) {
        this.channels = channels;
        return this;
    }

    public ParsePushDto setPushTime(String pushTime) {
        this.push_time = pushTime;
        return this;
    }
}
