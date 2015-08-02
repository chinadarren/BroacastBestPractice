package com.example.BroacastBestPractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c on 2015/8/2.
 */
public class ActivityCollector {

    public static List<Activity> activities = new ArrayList<Activity>();
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
public static void finishAll(){
    for(Activity activity : activities){
        if(!activity.isFinishing()){
            activity.finish();
        }
    }
}
}
