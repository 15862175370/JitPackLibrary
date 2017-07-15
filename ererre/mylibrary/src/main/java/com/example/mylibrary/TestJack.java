package com.example.mylibrary;

import android.util.Log;

/**
 * Created by Administrator on 2017/7/15.
 */

public class TestJack {

    public static TestJack testJack = null;
    public static  TestJack getInstance(){
        if(testJack == null){
          synchronized (TestJack.class){
              if(testJack == null){

                  testJack = new TestJack();
              }
          }


        }
        return  testJack;

    }

    public void init(){
        Log.i("hello","bei diaoyong le");
    }
}
