package com.example.feng.abstractdemo;

import android.util.Log;

/**
 * Created by Chexiangjia-MAC on 17/4/21.
 */

public class SecondSon extends Father {

    String Tag="FatherSon";
    @Override
    public void add() {
        Log.d(Tag,"add "+2);
    }

    @Override
    public void del() {
        Log.d(Tag,"del "+2);
    }

    @Override
    public void update() {
        Log.d(Tag,"update "+2);
    }

    @Override
    public void find() {
        Log.d(Tag,"find "+2);
    }

    @Override
    public void get() {
        super.get();
        Log.d(Tag,"get SecondSon");
    }
}
