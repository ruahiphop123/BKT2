package com.example.baikiemtra3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TacPham extends AppCompatActivity {
    ArrayList<TacPhamModel> arrayTacPham;
    TacPhamAdapter adapter;
    ListView listView;
    TextView tenTacGia;
    int viTri;
    ImageFilterView imgBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tac_pham);

        listView = findViewById(R.id.listViewTacPham);
        tenTacGia = findViewById(R.id.titleTacPham);
        arrayTacPham = new ArrayList<>();

        imgBack = findViewById(R.id.imgViewBack);
        Intent intent = getIntent();
        tenTacGia.setText(intent.getStringExtra("tenTacGia"));
        viTri = intent.getIntExtra("viTri", -1);
        switch (viTri) {
            case 0:{
                arrayTacPham.add(new TacPhamModel("Tràng Giang", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,4));
                arrayTacPham.add(new TacPhamModel("Đoàn Thuyền Đánh Cá", "là đặc trưng to lớn của nền văn học Việt Nam", R.drawable.sach, 4));
                arrayTacPham.add(new TacPhamModel("Ta viết bài thơ gọi biển về", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,5));
                arrayTacPham.add(new TacPhamModel("Ngậm ngùi", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,5));
            }
            case 1:{
                arrayTacPham.add(new TacPhamModel("Châu Chấu Đỏ", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,5));
                arrayTacPham.add(new TacPhamModel("Cao lương đỏ", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,4));
                arrayTacPham.add(new TacPhamModel("Cây Tỏi Nổi Giận", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,5));
                arrayTacPham.add(new TacPhamModel("Báu Vật Của Đời", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,4));
            }
            case 2:{
                arrayTacPham.add(new TacPhamModel("Nhat Anh", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,5));
                arrayTacPham.add(new TacPhamModel("Cao đỏ", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,4));
                arrayTacPham.add(new TacPhamModel("Cây Tỏi Nổi Giận", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,5));
                arrayTacPham.add(new TacPhamModel("Báu Vật Của Đời", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,4));
            }
            case 3:{
                arrayTacPham.add(new TacPhamModel("Shake", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,5));
                arrayTacPham.add(new TacPhamModel("Cao lương đỏ", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,4));
                arrayTacPham.add(new TacPhamModel("Cây Tỏi Nổi Giận", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,5));
                arrayTacPham.add(new TacPhamModel("Báu Vật Của Đời", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,4));
            }
            case 4:{
                arrayTacPham.add(new TacPhamModel("Heming", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,5));
                arrayTacPham.add(new TacPhamModel("Cao lương đỏ", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,4));
                arrayTacPham.add(new TacPhamModel("Cây Tỏi Nổi Giận", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,5));
                arrayTacPham.add(new TacPhamModel("Báu Vật Của Đời", "là một trong những bài thơ xuất sắc nhất của nền văn học Việt Nam", R.drawable.sach,4));
            }
        };
        adapter = new TacPhamAdapter(this,R.layout.line_tacgia, arrayTacPham);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent1 = new Intent(TacPham.this, ChiTietTacPham.class);
                intent1.putExtra("ten", arrayTacPham.get(i).getTen());
                intent1.putExtra("moTa", arrayTacPham.get(i).getMoTa());
                startActivity(intent1);
            }
        });


        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}