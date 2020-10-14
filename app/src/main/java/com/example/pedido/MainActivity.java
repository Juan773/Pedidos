package com.example.pedido;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab=findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "fab", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void Pollo(View view){
        Toast.makeText( this, "rico p ", Toast.LENGTH_SHORT).show();
    }
    public void Monstrito(View view){
        Toast.makeText( this, "rico ", Toast.LENGTH_SHORT).show();
    }
    public void Salchipapa(View view){
        Toast.makeText( this, "mmm ", Toast.LENGTH_SHORT).show();
    }
    FloatingActionButton fab;

}