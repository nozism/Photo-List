package com.example.pc.liveat500px.dao;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

/**
 * Created by Pc on 27/5/2559.
 */
public class PhotoListDao {

    @SerializedName("tags")
    private List<String> tags;
    @SerializedName("id")
    private String id;
    @SerializedName("focalLength")
    private String focalLength;
    @SerializedName("profilePicture")
    private String profilePicture;
    @SerializedName("username")
    private String username;
    @SerializedName("shutterSpeed")
    private String shutterSpeed;
    @SerializedName("iso")
    private String iso;
    @SerializedName("image_url")
    private String imageUrl;
    @SerializedName("camera")
    private String camera;
    @SerializedName("link")
    private String link;
    @SerializedName("userId")
    private String userId;
    @SerializedName("caption")
    private String caption;
    @SerializedName("createdTime")
    private Date createdTime;
    @SerializedName("lens")
    private String lens;
    @SerializedName("aperture")
    private String aperture;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFocalLength() {
        return focalLength;
    }

    public void setFocalLength(String focalLength) {
        this.focalLength = focalLength;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getShutterSpeed() {
        return shutterSpeed;
    }

    public void setShutterSpeed(String shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getLens() {
        return lens;
    }

    public void setLens(String lens) {
        this.lens = lens;
    }

    public String getAperture() {
        return aperture;
    }

    public void setAperture(String aperture) {
        this.aperture = aperture;
    }

    @Override
    public String toString() {
        return "ClassPojo [tags = " + tags + ", id = " + id + ", focalLength = " + focalLength + ", profilePicture = " + profilePicture + ", username = " + username + ", shutterSpeed = " + shutterSpeed + ", iso = " + iso + ", imageUrl = " + imageUrl + ", camera = " + camera + ", link = " + link + ", userId = " + userId + ", caption = " + caption + ", createdTime = " + createdTime + ", lens = " + lens + ", aperture = " + aperture + "]";
    }
}
