package com.example.facultyfinderit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class loginpage extends AppCompatActivity {
private Button login;
    EditText emailtf ;
    EditText password;
    user user;

    FirebaseDatabase database;
    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        emailtf = (EditText) findViewById(R.id.emailtf);
        password=(EditText)findViewById(R.id.passwordtf);
        database= FirebaseDatabase.getInstance();
        ref=database.getReference("user");
        user = new user();

    login= (Button)findViewById(R.id.login);
    login.setOnClickListener(new View.OnClickListener() {



        @Override
        public void onClick(View view) {
ref.addValueEventListener(new ValueEventListener() {
    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
        getvalues();
ref.child("user02").setValue(user);
        Toast.makeText(loginpage.this,"inserted in database",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }
});
            openhomepage();

        }
    });
    }
    private void getvalues(){
        user.setEmailid(emailtf.getText().toString());
        user.setPss(password.getText().toString());

    }
    public void openhomepage(){
        String email = emailtf.getText().toString();
        String pass = password.getText().toString();


        if(pass.isEmpty()||email.isEmpty())
        {
            Toast.makeText(loginpage.this,"Enter email and password",Toast.LENGTH_SHORT).show();
        }else{
            String collegeEmail = email.substring(email.indexOf("@"),email.length());
            if(collegeEmail.equals("@student.mes.ac.in")){
                Intent intent = new Intent(this,homepage1.class);
                startActivity(intent);
                finish();
                Toast.makeText(loginpage.this,"Successfully logged in",Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(loginpage.this, "Invalid email",Toast.LENGTH_SHORT).show();
            }
        }



    }
}
