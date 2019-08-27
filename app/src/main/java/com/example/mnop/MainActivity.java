package com.example.mnop;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("on create1","this is on creeate1")   ;
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
        //finish();


        //Toast.makeText(this,"Create_Mainactivity",Toast.LENGTH_SHORT).show();
    }


    protected void onStart()
    {
        super.onStart();
        Log.e("on Strat1","this is on strat1")   ;
        Toast.makeText(this,"Start_Mainactivity",Toast.LENGTH_SHORT).show();
    }
    public void shift(View view)
    {

 startActivity(new Intent(this,Main2Activity.class));

    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.e("on REasume1","this is on REsume1")   ;
        Toast.makeText(this,"Resume_Mainactivity",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.e("on pause1","this is on pause1")   ;
        Toast.makeText(this,"Pause_Mainactivity",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.e("on stop1","this is on stop1")   ;
        Toast.makeText(this,"Stop_Mainactivity",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("on destroy1","this is on destroy1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart1","this is on restart1");
    }
}
