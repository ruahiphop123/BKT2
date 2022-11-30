package com.example.baikiemtra3;

import android.content.Context;
import android.media.Rating;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatCheckBox;

import java.util.List;

public class TacGiaAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<TacGia> listTacGia;

    public TacGiaAdapter(Context context, int layout, List<TacGia> listTacGia) {
        this.context = context;
        this.layout = layout;
        this.listTacGia = listTacGia;
    }

    @Override
    public int getCount() {
        return listTacGia.size();
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
        ViewHolder holder;
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

        TacGia phim = listTacGia.get(i);

        holder.hoTen.setText(phim.getTenTacGia());
        holder.moTa.setText(phim.getMoTa());
        holder.imgView.setImageResource(phim.getHinhAnh());
//        holder.ratingBar.setRating(phim.getSao());
        return  view;
    }
}
