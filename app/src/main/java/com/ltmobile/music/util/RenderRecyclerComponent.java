package com.ltmobile.music.util;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ltmobile.music.ui.adapter.CircleItemRecyclerAdapter;
import com.ltmobile.music.ui.adapter.SquareItemRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class RenderRecyclerComponent {
    // Tạo RecyclerView và thiết lập LayoutManager
    public static List<RecyclerView> renderRecyclerViews(Context context, int ...recyclerViewIds) {
        List<RecyclerView> recyclerViews = new ArrayList<>();
        for (Integer idView : recyclerViewIds) {
            RecyclerView recyclerView = ((Activity) context).findViewById(idView);
//            if (recyclerView == null) {
//                Log.e("RenderRecyclerComponent", "RecyclerView ID không tìm thấy: " + idView);
//                continue;
//            }
            // Lấy ra context và setLayoutManager
            recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
            recyclerViews.add(recyclerView);
        }
        return recyclerViews;
    }

    public static void setAdapterForSquareItem(List<List<String>> urlList, List<RecyclerView> recyclerViews, int ...layoutViewIds) {
        for (int i = 0; i < recyclerViews.size(); i++) {
            // Khởi tạo Adapter và set Adapter cho từng RecyclerView
            SquareItemRecyclerAdapter adapter = new SquareItemRecyclerAdapter(urlList.get(i), layoutViewIds[i]);
            recyclerViews.get(i).setAdapter(adapter);
        }
    }

    public static void setAdapterForCircleItem(List<List<String>> urlList, List<RecyclerView> recyclerViews, int ...layoutViewIds) {
        for (int i = 0; i < recyclerViews.size(); i++) {
//            if (i >= urlList.size() || i >= layoutViewIds.length) {
//                Log.e("RenderRecyclerComponent", "Lỗi index");
//                continue;
//            }
            // Khởi tạo Adapter và set Adapter cho từng RecyclerView
            CircleItemRecyclerAdapter adapter = new CircleItemRecyclerAdapter(urlList.get(i), layoutViewIds[i]);
            recyclerViews.get(i).setAdapter(adapter);
        }
    }
}
