package com.example.leonardo.soan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
       final Intent i = new Intent(this,Cursos.class);
        setContentView(R.layout.activity_main);

        Button buttonCurso = (Button)findViewById(R.id.buttonCurso);
        buttonCurso.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(i);
            }
        });
    }
}
