package com.example.facultyfinderit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class homepage1 extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage1);


        textView=(TextView) findViewById(R.id.floortv);
        textView.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent = new Intent(homepage1.this , floorview.class);
                                            startActivity(intent);
                                            Toast.makeText(homepage1.this, "Floor View  ", Toast.LENGTH_SHORT).show();
                                        }
                                    });
        textView =(TextView)findViewById(R.id.ajjutv);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage1.this,ajupage.class);
                startActivity(intent);
                Toast.makeText(homepage1.this,"Ajju Palleri  ", Toast.LENGTH_SHORT).show();
            }
        });
        textView =(TextView)findViewById(R.id.madhutv);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage1.this,madhupage.class);
                startActivity(intent);
                Toast.makeText(homepage1.this,"CC: Madhu Nashipudimath",Toast.LENGTH_SHORT).show();
            }
        });
        textView =(TextView)findViewById(R.id.apekshatv);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage1.this,apekshapage.class);
                startActivity(intent);
                Toast.makeText(homepage1.this,"Apeksha Chavan  ",Toast.LENGTH_SHORT).show();
            }
        });
        textView =(TextView)findViewById(R.id.satishtv);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage1.this,satishpage.class);
                startActivity(intent);
                Toast.makeText(homepage1.this,"HoD: SatishKumar Verma ",Toast.LENGTH_SHORT).show();
            }
        });

        textView =(TextView)findViewById(R.id.deeptitv);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage1.this,deeptipage.class);
                startActivity(intent);
                Toast.makeText(homepage1.this,"Deepti Lawand  ",Toast.LENGTH_SHORT).show();
            }
        });
        textView =(TextView)findViewById(R.id.lillytv);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage1.this,lillypage.class);
                startActivity(intent);
                Toast.makeText(homepage1.this,"Lilly Pradhan ",Toast.LENGTH_SHORT).show();
            }
        });
        textView =(TextView)findViewById(R.id.shubhangitv);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage1.this,shubhangitv.class);
                startActivity(intent);
                Toast.makeText(homepage1.this,"Shubhangi Rathod  ",Toast.LENGTH_SHORT).show();
            }
        });
        textView =(TextView)findViewById(R.id.stephytv);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage1.this,stephypage.class);
                startActivity(intent);
                Toast.makeText(homepage1.this,"Stephy Benny  ",Toast.LENGTH_SHORT).show();
            }
        });
        imageView=(ImageView)findViewById(R.id.ajuiv);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage1.this,ajupage.class);
                startActivity(intent);
                Toast.makeText(homepage1.this,"Ajju Palleri  ",Toast.LENGTH_SHORT).show();
            }
        });
        imageView=(ImageView)findViewById(R.id.madhuiv);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage1.this,madhupage.class);
                startActivity(intent);
                Toast.makeText(homepage1.this,"CC: Madhu Nashipudimath  ",Toast.LENGTH_SHORT).show();
            }
        });
        imageView=(ImageView)findViewById(R.id.apekshaiv);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage1.this,apekshapage.class);
                startActivity(intent);
                Toast.makeText(homepage1.this,"Apeksha Chavan  ",Toast.LENGTH_SHORT).show();
            }
        });
        imageView=(ImageView)findViewById(R.id.lillyiv);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage1.this,lillypage.class);
                startActivity(intent);
                Toast.makeText(homepage1.this,"Lilly Pradhan  ",Toast.LENGTH_SHORT).show();
            }
        });
        imageView=(ImageView)findViewById(R.id.stephyiv);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage1.this,stephypage.class);
                startActivity(intent);
                Toast.makeText(homepage1.this,"Stephy Benny  ",Toast.LENGTH_SHORT).show();
            }
        });
        imageView=(ImageView)findViewById(R.id.shubhangiiv);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage1.this,shubhangitv.class);
                startActivity(intent);
                Toast.makeText(homepage1.this,"Shubhangi Rathod  ",Toast.LENGTH_SHORT).show();
            }
        });
        imageView=(ImageView)findViewById(R.id.satishiv);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage1.this,satishpage.class);
                startActivity(intent);
                Toast.makeText(homepage1.this,"HoD : SatishKumar Verma  ",Toast.LENGTH_SHORT).show();
            }
        });
        imageView=(ImageView)findViewById(R.id.deeptiiv);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage1.this,deeptipage.class);
                startActivity(intent);
                Toast.makeText(homepage1.this,"Deepti Lawand  ",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
