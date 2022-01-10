
package com.cookandroid.capstone_1;

import java.io.File;

import android.Manifest;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("아이엠 아이언");


        Button btnWeb1 = (Button) findViewById(R.id.btnWeb1);
        Button btnWeb2 = (Button) findViewById(R.id.btnWeb2);
        Button btnWeb3 = (Button) findViewById(R.id.btnWeb3);
        Button btnWeb4 = (Button) findViewById(R.id.btnWeb4);
        Button btnWeb5 = (Button) findViewById(R.id.btnWeb5);
        Button btnWeb6 = (Button) findViewById(R.id.btnWeb6);
        Button btnWeb7 = (Button) findViewById(R.id.btnWeb7);
        Button btnWeb8 = (Button) findViewById(R.id.btnWeb8);

        btnWeb1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=03mI2J22XgI");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnWeb2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=D2l8uyhS5jk");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnWeb3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=-9kgZV_7294");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnWeb4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=UAbjUnyLZL4");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnWeb5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=Ns3mR6Ct4fQ");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnWeb6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=EeBuxjcNUqs");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnWeb7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=TKXWm1T2ixo");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnWeb8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=xUHIScmtdCg");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }

}
