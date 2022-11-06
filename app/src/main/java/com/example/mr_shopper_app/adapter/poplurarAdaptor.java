package com.example.mr_shopper_app.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mr_shopper_app.Domain.ShopDomain;
import com.example.mr_shopper_app.R;

import java.util.ArrayList;

public class poplurarAdaptor extends RecyclerView.Adapter<poplurarAdaptor.ViewHolder> {
    ArrayList<ShopDomain> popularShop;

    public poplurarAdaptor(ArrayList<ShopDomain> popularShop) {
        this.popularShop = popularShop;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_popular,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(popularShop.get(position).getTitle());
        holder.fee.setText(String.valueOf(popularShop.get(position).getPrice()));
        

        int drawableResourceId=holder.itemView.getContext().getResources().getIdentifier(popularShop.get(position).getPic(),"drawable",holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.pic);


    }

    @Override
    public int getItemCount() {
        return popularShop.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView title,fee;
        ImageView pic;
        TextView addbtn;
        

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            fee=itemView.findViewById(R.id.fee);
            pic=itemView.findViewById(R.id.pic);
            addbtn=itemView.findViewById(R.id.addbtn);

        }
    }
}
