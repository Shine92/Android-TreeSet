package com.example.iii_user.brad02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.sh);

    }
    public void show (View vi){
        Log.i("Brad", "ok");
        tv.setText(Lott());
    }
    String Lott (){
        TreeSet<Integer> set =new TreeSet<>();
        while(set.size()<6){
            set.add((int)(Math.random()*49+1));
        }
        return set.toString();
    }
}
