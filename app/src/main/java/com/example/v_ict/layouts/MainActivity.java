package com.example.v_ict.layouts;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nombre;
    private Button changeBtn;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = (EditText) findViewById(R.id.text);
        changeBtn = (Button) findViewById(R.id.but);
        texto = (TextView) findViewById(R.id.h3);
        changeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreTxt = nombre.getText().toString();
                texto.setText(nombreTxt);
                nombre.setVisibility(View.GONE);
                changeBtn.setVisibility(View.GONE);
                Intent intent =  new Intent(MainActivity.this, LayoutActivity.class);
                startActivity(intent);
            }
        });
        RelativeLayout relative = (RelativeLayout) findViewById(R.id.main);

        AnimationDrawable animationDrawable = (AnimationDrawable) relative.getBackground();

        animationDrawable.setEnterFadeDuration(1000);
        animationDrawable.setExitFadeDuration(1000);

        animationDrawable.start();
    }
}
