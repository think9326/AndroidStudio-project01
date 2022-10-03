package com.think.myapplication01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class layout01Activity extends AppCompatActivity implements View.OnClickListener{

    Button btn01;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout01);
    }

    @Override
    public void onClick(View view) {

    }
}
