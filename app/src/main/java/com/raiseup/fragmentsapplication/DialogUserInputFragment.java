package com.raiseup.fragmentsapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class DialogUserInputFragment extends DialogFragment {
    private EditText fragment_user_name,fragment_user_email;
    private Button btn_frag_ok,btn_frag_cancel;


    public DialogUserInputFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dialog_user_input, container, false);
        fragment_user_name = view.findViewById(R.id.fragment_user_name);
        fragment_user_email = view.findViewById(R.id.fragment_user_email);
        btn_frag_cancel = view.findViewById(R.id.btn_frag_cancel);
        btn_frag_cancel = view.findViewById(R.id.btn_frag_ok);
        btn_frag_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getContext(),DialogFragmentActivity.class);
                intent.putExtra("name",fragment_user_name.getText().toString());
                intent.putExtra("email",fragment_user_email.getText().toString());
                startActivity(intent);
            }
        });

        return view;
    }
}