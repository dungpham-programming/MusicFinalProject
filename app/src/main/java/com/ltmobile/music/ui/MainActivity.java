package com.ltmobile.music.ui;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.RecyclerView;

import com.ltmobile.music.R;
import com.ltmobile.music.util.RenderRecyclerComponent;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set theme mặc định là theme tối
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        EdgeToEdge.enable(this);
        this.setContentView(R.layout.activity_main);

        // Khởi tạo dữ liệu mẫu (list các URL ảnh)
        List<String> podcastUrlList = new ArrayList<>();
        podcastUrlList.add("https://i.scdn.co/image/ab6765630000ba8aba6206e9e46f1e9ddabd0ed3");
        podcastUrlList.add("https://i.scdn.co/image/ab6765630000ba8ab8c2ea6689e5497fcf248ea9");
        podcastUrlList.add("https://i.scdn.co/image/ab6765630000ba8a0194fea3b62b99b4088d19a6");

        List<String> trackUrlList = new ArrayList<>();
        trackUrlList.add("https://i.scdn.co/image/ab67616d0000b27365a4420fd76223a14d5d3d81");
        trackUrlList.add("https://i.scdn.co/image/ab67616d0000b273ae71c97bfe3e39d1f63e7ebc");
        trackUrlList.add("https://i.scdn.co/image/ab67616d0000b2738e04b5ec21c60f8745a435e5");

        List<String> artistUrlList = new ArrayList<>();
        artistUrlList.add("https://i.scdn.co/image/ab6761610000e5eb8de0c8ed480aabd579520b48");

        // Render ra các RecyclerView có image là hình vuông (Đã viết một util chung để render)
        List<RecyclerView> squareRecyclerViews = RenderRecyclerComponent.renderRecyclerViews(this, R.id.podcast_recycler_view, R.id.track_recycler_view);
        List<List<String>> squareImageList = new ArrayList<>();
        squareImageList.add(podcastUrlList);
        squareImageList.add(trackUrlList);

        List<RecyclerView> circleRecyclerViews = RenderRecyclerComponent.renderRecyclerViews(this, R.id.artist_recycler_view);
        List<List<String>> circleImageList = new ArrayList<>();
        circleImageList.add(artistUrlList);

        // Khởi tạo Adapter và set Adapter cho các RecyclerView
        // (đối với các item có hình vuông như Track, Podcast)
        RenderRecyclerComponent.setAdapterForSquareItem(squareImageList, squareRecyclerViews, R.layout.podcast_item, R.layout.track_item);

        // (đối với các item có hình tròn như Artist)
        RenderRecyclerComponent.setAdapterForCircleItem(circleImageList, circleRecyclerViews, R.layout.artist_item);
    }
}