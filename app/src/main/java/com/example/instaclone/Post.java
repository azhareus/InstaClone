package com.example.instaclone;

import android.os.Parcelable;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

import org.parceler.Parcel;

//@Parcel
@ParseClassName("Post")
public class Post extends ParseObject implements Parcelable {
    public Post(){}
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE= "image";
    public static final String KEY_USER= "user";
    public static final String KEY_CREATED_KEY = "createdAt";

    public String getDescription(){
        return getString(KEY_DESCRIPTION);
    }
    public void setDescription(String description){
        put(KEY_DESCRIPTION, description);
    }
    public ParseFile getImage(){
        return getParseFile(KEY_IMAGE);
    }
    public void setImage(ParseFile parseFile){
        put(KEY_IMAGE, parseFile);
    }
    public ParseUser getUser(){
        return getParseUser(KEY_USER);
    }
    public void setUser(ParseUser user){
        put(KEY_USER, user);
    }
    public String getKeyCreatedKey() { return getString(KEY_CREATED_KEY); }
    public void setKeyCreatedKey(String time){put(KEY_CREATED_KEY, time);}

}
