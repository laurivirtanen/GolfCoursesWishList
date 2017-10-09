package com.example.k8455.golfcourseswishlist;


import android.content.Context;

/**
 * Created by K8455 on 9.10.2017.
 */

public class Place {
    public String name;
    public String imageName;

    public int getImageResourceId(Context context) {
        return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());
    }

}
