package com.example.BroacastBestPractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by c on 2015/8/2.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }
   @Override
    protected void onDestroy(){
       super.onDestroy();
       ActivityCollector.removeActivity(this);
   }

}
