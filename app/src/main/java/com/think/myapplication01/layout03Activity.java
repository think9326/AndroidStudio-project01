package com.think.myapplication01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class layout03Activity extends AppCompatActivity implements View.OnClickListener{
    Button btn03;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout03);
    }

    @Override
    public void onClick(View view) {

    }
}
