package com.example.baikiemtra3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class TacPhamAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<TacPhamModel> listTacPham;

    public TacPhamAdapter(Context context, int layout, List<TacPhamModel> listTacPham) {
        this.context = context;
        this.layout = layout;
        this.listTacPham = listTacPham;
    }

    @Override
    public int getCount() {
        return listTacPham.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        TextView hoTen, moTa;
        ImageView imgView;
        RatingBar ratingBar;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TacPhamAdapter.ViewHolder holder;
        if(view == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new ViewHolder();
            holder.hoTen = (TextView) view.findViewById(R.id.tvTen);
            holder.moTa = (TextView) view.findViewById(R.id.tvMoTa);
            holder.imgView = (ImageView) view.findViewById(R.id.imgAvt);
//            holder.ratingBar = view.findViewById(R.id.ratingBar);
            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }

        TacPhamModel phim = listTacPham.get(i);

        holder.hoTen.setText(phim.getTen());
        holder.moTa.setText(phim.getMoTa());
        holder.imgView.setImageResource(phim.getHinhAnh());
//        holder.ratingBar.setRating(phim.getSao());
        return  view;
    }
}
