package com.example.baikiemtra3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<TacGia> arrayTacGia;
    TacGiaAdapter adapter;
    ListView listView;
    int vt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        adapter = new TacGiaAdapter(this,R.layout.line_tacgia,arrayTacGia);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, TacPham.class);
                intent.putExtra("tenTacGia", arrayTacGia.get(i).getTenTacGia());
                vt = i;
                intent.putExtra("viTri", vt);
                startActivity(intent);
            }
        });
    }

    private void AnhXa() {
        listView = findViewById(R.id.listViewTacGia);
        arrayTacGia = new ArrayList<>();
        //ten, tyoi, gioi tinh, img, mota
        arrayTacGia.add(new TacGia("Huy Cận", "Cù Huy Cận không chỉ là một nhà thơ. Ông là một nhà văn hóa, nhà hoạt động chính trị-xã hội với những dấu ấn quan trọng", R.drawable.huycan, 4));
        arrayTacGia.add(new TacGia("Mạc Ngôn", "Mạc Ngôn là một nhà văn người Trung Quốc xuất thân từ nông dân. Ông đã từng được thế giới biết đến", R.drawable.macngon, 5));
        arrayTacGia.add(new TacGia("Nhật Ánh", "Nguyễn Nhật Ánh là một nhà văn, nhà thơ, bình luận viên Việt Nam.", R.drawable.nhatanh, 4));
        arrayTacGia.add(new TacGia("HemingWay", "Ernest Miller Hemingway là một tiểu thuyết gia người Mỹ, nhà văn viết truyện ngắn và là một nhà báo", R.drawable.hemingway, 5));
        arrayTacGia.add(new TacGia("ShakeSpare", "William Shakespeare là một nhà văn và nhà viết kịch Anh, được coi là nhà văn vĩ đại nhất của Anh", R.drawable.shakespare, 5));

    }
}