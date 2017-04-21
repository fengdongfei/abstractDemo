package com.example.feng.abstractdemo;

import android.util.Log;

/**
 * Created by Chexiangjia-MAC on 17/4/21.
 */

public abstract class Father {
    String Tag="FatherSon";

    public  abstract  void  add();
    public  abstract  void  del();
    public  abstract  void  update();
    public  abstract  void  find();

    public void get(){
        Log.d(Tag,"get father");
    }

}
