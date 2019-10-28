package com.example.myapptruyen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapptruyen.app.TruyenTranh;

public class ChapActivity extends AppCompatActivity {
    TextView txvTenTruyens;
    ImageView imgAnhTruyens;
    TruyenTranh truyenTranh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap);
        init();
        anhxa();
        setUp();
        setClick();
        
    }

    private void setClick() {
    }

    private void setUp() {
        txvTenTruyens.setText(truyenTranh.getTenTruyen());
        Glide.with(this).load(truyenTranh.getLinkAnh()).into(imgAnhTruyens);
    }

    private void anhxa() {
        imgAnhTruyens = findViewById(R.id.imgAnhTruyens);
        txvTenTruyens = findViewById(R.id.txvTenTruyens);
    }

    private void init(){
        Bundle b = getIntent().getBundleExtra("data");
        truyenTranh =(TruyenTranh) b.getSerializable("truyen");

    }
}
