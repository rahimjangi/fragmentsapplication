package com.raiseup.fragmentsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DialogFragmentActivity extends AppCompatActivity {
    private Button btn_show_dialog_fragment;
    private TextView txt_data_from_user_name,txt_data_from_user_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_fragment);

        txt_data_from_user_name = findViewById(R.id.txt_data_from_user_name);
        txt_data_from_user_email = findViewById(R.id.txt_data_from_user_email);
        btn_show_dialog_fragment = findViewById(R.id.btn_show_dialog_fragment);
        btn_show_dialog_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogFragment();
            }
        });



    }

    private void showDialogFragment() {


        Intent intent= getIntent();
        String name = intent.getExtras().getString("name");
        String email = intent.getExtras().getString("email");
        txt_data_from_user_name.setText(name);
        txt_data_from_user_email.setText(email);
    }
}