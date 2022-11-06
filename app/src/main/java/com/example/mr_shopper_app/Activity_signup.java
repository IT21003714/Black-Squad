package com.example.mr_shopper_app;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Activity_signup extends AppCompatActivity {
    EditText singup_user,singup_email,singup_pwd;
    Button btn_singup;

    FirebaseDatabase rootNode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        singup_user=findViewById(R.id.singup_user);
        singup_email=findViewById(R.id.singup_email);
        singup_pwd=findViewById(R.id.singup_pwd);
        btn_singup=findViewById(R.id.btn_singup);

        btn_singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode=FirebaseDatabase.getInstance();
                reference=rootNode.getReference("users");
                reference.setValue("First data Storage");

            }
        });



    }
}