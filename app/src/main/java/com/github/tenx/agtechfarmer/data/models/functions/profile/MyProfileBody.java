package com.github.tenx.agtechfarmer.data.models.functions.profile;

import com.google.gson.annotations.SerializedName;

public class MyProfileBody {

    @SerializedName("firstName")
    private String firstName;

    @SerializedName("lastName")
    private String lastNAme;

    @SerializedName("location")
    private String location;

    @SerializedName("bio")
    private String bio ;

    @SerializedName("token")
    private String token ;

    public MyProfileBody(String firstName, String lastNAme, String location, String bio, String token) {
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.location = location;
        this.bio = bio;
        this.token = token;
    }

    public MyProfileBody() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
