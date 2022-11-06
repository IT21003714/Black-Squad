package com.example.mr_shopper_app;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;


import com.example.mr_shopper_app.Domain.CategoryDomain;
import com.example.mr_shopper_app.Domain.ShopDomain;
import com.example.mr_shopper_app.adapter.CategoryAdaptor;
import com.example.mr_shopper_app.adapter.poplurarAdaptor;

import java.util.ArrayList;



public class activity_home extends AppCompatActivity {
    private RecyclerView.Adapter adapter,adapter2;
    private RecyclerView recyclerViewCategoryList,recyclerViewpoplurarList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView setting_img=(ImageView) findViewById(R.id.setting_img);

        setting_img.setOnClickListener(view -> startActivity(new Intent(activity_home.this, Activity_setting.class)));

        recyclerViewCategoryList();
        RecyclerViewpoplurar();


    }


    private void recyclerViewCategoryList() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList = findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category = new ArrayList<>();
        category.add(new CategoryDomain("T-shirt", "shop"));
        category.add(new CategoryDomain("car", "shp"));
        category.add(new CategoryDomain("bus", "sho"));
        category.add(new CategoryDomain("yes", "sho"));
        category.add(new CategoryDomain("bue", "sop"));
        category.add(new CategoryDomain("yee", "sop"));
        category.add(new CategoryDomain("bus", "sho"));
        category.add(new CategoryDomain("yes", "sho"));
        category.add(new CategoryDomain("bue", "sop"));
        category.add(new CategoryDomain("yee", "sop"));

        adapter = new CategoryAdaptor(category);
        recyclerViewCategoryList.setAdapter(adapter);

    }
    private void RecyclerViewpoplurar() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewpoplurarList = findViewById(R.id.recyclerView2);
        recyclerViewpoplurarList.setLayoutManager(linearLayoutManager);

        ArrayList<ShopDomain> shopList = new ArrayList<>();
        shopList.add(new ShopDomain(" Popoular T-shirt", "shop", "man new t-shird idams", "8.76"));
        shopList.add(new ShopDomain("shirt", "shop", "man new t-shird idams", "8.76"));
        shopList.add(new ShopDomain("kids shirt", "shop", "man new t-shird idams", "8.76"));
        shopList.add(new ShopDomain(" Popoular T-shirt", "shop", "man new t-shird idams", "8.76"));
        shopList.add(new ShopDomain("shirt", "shop", "man new t-shird idams", "8.76"));
        shopList.add(new ShopDomain("kids shirt", "shop", "man new t-shird idams", "8.76"));


        adapter2=new poplurarAdaptor(shopList);
        recyclerViewpoplurarList.setAdapter(adapter2);

    }

    }















