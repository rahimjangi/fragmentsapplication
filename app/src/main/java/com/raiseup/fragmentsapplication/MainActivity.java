package com.raiseup.fragmentsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private FrameLayout frame_1;
    private Button btn_replace;
    boolean firstFragmentUp=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frame_1 = findViewById(R.id.frame_1);
        btn_replace = findViewById(R.id.btn_replace);

        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame_1,new FirstFragment());
        fragmentTransaction.commit();
        System.out.println("First is up");

        btn_replace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragment(firstFragmentUp);
            }
        });

    }

    private void showFragment(boolean flag) {

        if(flag){
            FragmentManager fragmentManager= getSupportFragmentManager();
            FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frame_1,new SecondFragment());
            System.out.println("Second is up");
            firstFragmentUp=false;
            fragmentTransaction.commit();
        }else{
            FragmentManager fragmentManager1= getSupportFragmentManager();
            FragmentTransaction fragmentTransaction1= fragmentManager1.beginTransaction();
            fragmentTransaction1.replace(R.id.frame_1,new FirstFragment());
            System.out.println(flag);
            System.out.println("First is up");
            firstFragmentUp=true;
            fragmentTransaction1.commit();
        }


    }
}