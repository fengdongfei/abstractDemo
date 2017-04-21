package com.example.feng.abstractdemo;

import android.util.Log;

/**
 * Created by Chexiangjia-MAC on 17/4/21.
 */

public class Son extends Father {
    String Tag="FatherSon";
    @Override
    public void add() {
        Log.d(Tag,"add");
    }

    @Override
    public void del() {
        Log.d(Tag,"del");
    }

    @Override
    public void update() {
        Log.d(Tag,"update");
    }

    @Override
    public void find() {
        Log.d(Tag,"find");
    }

    @Override
    public void get() {
        Log.d(Tag,"get son");
    }
}
