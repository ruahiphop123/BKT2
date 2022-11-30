package com.example.baikiemtra3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChiTietTacPham extends AppCompatActivity {
    TextView ten,moTa;
    ImageFilterView imgBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_tac_pham);

        imgBack = findViewById(R.id.imgViewBackToList);
        ten = findViewById(R.id.chiTiet_Ten);
        moTa = findViewById(R.id.chiTiet_moTa);

        Intent intent = getIntent();
        ten.setText(intent.getStringExtra("ten"));
        moTa.setText(intent.getStringExtra("moTa"));

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}