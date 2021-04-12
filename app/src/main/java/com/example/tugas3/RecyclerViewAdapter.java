package com.example.tugas3;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;


import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> tanaman = new ArrayList<>();
    private ArrayList<String> namaTanaman = new ArrayList<>();
    private ArrayList<String> namaIlmiah = new ArrayList<>();
    private ArrayList<String> tanamanDetail = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> tanaman, ArrayList<String> namaTanaman, ArrayList<String> namaIlmiah, ArrayList<String> tanamanDetail, ArrayList<String> info, Context context) {
        this.tanaman = tanaman;
        this.namaTanaman = namaTanaman;
        this.namaIlmiah = namaIlmiah;
        this.tanamanDetail = tanamanDetail;
        this.info = info;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler_view_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(tanaman.get(position)).into(holder.iv_tanaman);

        holder.tv_namaIlmiah.setText(namaIlmiah.get(position));
        holder.tv_namaTanaman.setText(namaTanaman.get(position));


        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("tanaman", tanaman.get(position));
                intent.putExtra("nama_tanaman", namaTanaman.get(position));
                intent.putExtra("nama_ilmiah", namaIlmiah.get(position));
                intent.putExtra("info", info.get(position));
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return namaTanaman.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView iv_tanaman, iv_tanamanDetail;
        TextView tv_namaTanaman, tv_namaIlmiah, tv_info;
        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_tanaman = itemView.findViewById(R.id.iv_tanaman);
            iv_tanamanDetail = itemView.findViewById(R.id.iv_tanamanDetail);
            tv_namaTanaman = itemView.findViewById(R.id.tv_namaTanaman);
            tv_namaIlmiah = itemView.findViewById(R.id.tv_namaIlmiah);
            tv_info = itemView.findViewById(R.id.tv_info);
            linearLayout = itemView.findViewById(R.id.linearLayout);

        }
    }
}