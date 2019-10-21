package com.example.implicitintentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button btncall, btncallfriend, btnopenMap, btnOpenWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncall = findViewById(R.id.btncall);
        btncallfriend = findViewById(R.id.btncallfriend);
        btnopenMap = findViewById(R.id.btnopenMap);
        btnOpenWeb = findViewById(R.id.btnOpenWeb);

        btncall.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);

            }
        });

        btncallfriend.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01711665055"));
                startActivity(intent);

            }
        });

        btnopenMap.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q=United International University"));
                startActivity(intent);


            }
        });

        btnOpenWeb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.uiu.ac.bd/"));
                startActivity(intent);


            }
        });

    }
}
