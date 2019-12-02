package com.example.project_kelompok_delapan;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

//Variable field tombol-tombol yang sudah dibuat di layout activity_main.xml

    private Button btCreateDB;
    private Button btViewDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Inisialisasi tombol-tombol
        btCreateDB = (Button) findViewById(R.id.bt_createdata);
        btViewDB = (Button) findViewById(R.id.bt_viewdata);

        //Jika mengklik tombol "Tambahkan Data"

        btCreateDB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
// kelas yang akan dijalankan ketika tombol Create/Insert Data diklik
            }
        });
//Jika mengklik tombol "Lihat Data"

        btViewDB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//kelas yang akan dijalankan ketika tombol Lihat data diklik
            }
        });
    }
}