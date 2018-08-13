package com.example.pratyush.imageuploadfirebase;

public class UploadModel {
    private String mName;
    private String mImageUrl;

    public UploadModel() {
        //This empty constructor is needed
    }

    public UploadModel(String name, String imageUrl) {

        if (name.trim().equals("")){
            name="No Name";
        }
        this.mName = name;
        this.mImageUrl = imageUrl;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }
}
