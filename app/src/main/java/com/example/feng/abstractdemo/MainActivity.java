package com.example.feng.abstractdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Father son;
    public  String type="son2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (type.equals("son")){
            son=new Son();
        }else if (type.equals("son2")){
            son= new SecondSon();
        }
    }

    public void add(View view){
        son.add();
    }
    public void del(View view){
        son.del();
    }
    public void update(View view){
        son.update();
    }
    public void find(View view){
        son.find();
    }
    public  void get(View view){
        son.get();
    }

}
