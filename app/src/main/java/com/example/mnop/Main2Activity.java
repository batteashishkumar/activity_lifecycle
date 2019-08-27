package com.example.mnop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.e("on create2","this is on create2")   ;
        Intent i=new Intent(this,MainActivity.class);
//        startActivity(i);
        finish();

    }
    protected void onStart()
    {
        super.onStart();
        Log.e("on Stra2","this is on strat2")   ;
        Toast.makeText(this,"Start_Mainactivity",Toast.LENGTH_SHORT).show();
    }
    public void shift(View view)
    {

        startActivity(new Intent(this,Main2Activity.class));

    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.e("on REasume2","this is on REsume2")   ;
        Toast.makeText(this,"Resume_Mainactivity",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.e("on pause2","this is on pause2")   ;
        Toast.makeText(this,"Pause_Mainactivity",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.e("on stop2","this is on stop2")   ;
        Toast.makeText(this,"Stop_Mainactivity",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("on destroy2","this is on destroy2");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestar2","this is on restart2");
    }
}
