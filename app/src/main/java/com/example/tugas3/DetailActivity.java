package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView iv_tanamanDetail;
    TextView tv_namaTanaman, tv_namaIlmiah, tv_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        iv_tanamanDetail = findViewById(R.id.iv_tanamanDetail);
        tv_namaTanaman = findViewById(R.id.tv_namaTanaman);
        tv_namaIlmiah = findViewById(R.id.tv_namaIlmiah);
        tv_info = findViewById(R.id.tv_info);

        getIncomingExtra();
    }
    private void getIncomingExtra(){
        if(getIntent().hasExtra("tanaman_detail") && getIntent().hasExtra("namaTanaman") && getIntent().hasExtra("namaIlmiah") && getIntent().hasExtra("info")){
            String tanamanDetail = getIntent().getStringExtra("tanaman_detail");
            String namaTanman = getIntent().getStringExtra("nama_tanaman");
            String namaIlmiah = getIntent().getStringExtra("nama_ilmiah");
            String info = getIntent().getStringExtra("info");

            setDataActivity(tanamanDetail, namaTanman, namaIlmiah, info);
        }
    }

    private void setDataActivity(String tanamanDetail, String namaTanaman, String namaIlmiah, String info){
        Glide.with(this).asBitmap().load(tanamanDetail).into(iv_tanamanDetail);
        tv_namaTanaman.setText(namaTanaman);
        tv_namaIlmiah.setText(namaIlmiah);
        tv_info.setText(info);
    }
}

/**



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView iv_Tanaman_detail;
    TextView tv_namaTanaman, tv_namaIlmiah, tv_Info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        iv_Tanaman_detail = findViewById(R.id.iv_tanaman_detail);
        tv_namaTanaman = findViewById(R.id.tv_NamaTanaman);
        tv_namaIlmiah = findViewById(R.id.tv_NamaIlmiah);
        tv_Info = findViewById(R.id.tv_info);

        getIncomingExtra();
    }
    private void getIncomingExtra(){
        if(getIntent().hasExtra("tanaman_detail") && getIntent().hasExtra("nama_tanaman") && getIntent().hasExtra("nama_ilmiah") && getIntent().hasExtra("info")){
            String tanaman_detail = getIntent().getStringExtra("tanaman_detail");
            String NamaTanaman = getIntent().getStringExtra("nama_tanaman");
            String NamaIlmiah = getIntent().getStringExtra("nama_ilmiah");
            String info = getIntent().getStringExtra("info");

            setDataActivity(tanaman_detail, NamaTanaman, NamaIlmiah, info);
        }
    }

    private void setDataActivity(String tanaman_detail, String NamaTanaman, String NamaIlmiah, String info){
        Glide.with(this).asBitmap().load(tanaman_detail).into(iv_Tanaman_detail);
        tv_namaTanaman.setText(NamaTanaman);
        tv_namaIlmiah.setText(NamaIlmiah);
        tv_Info.setText(info);
    }
}

 */