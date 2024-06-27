package com.ltmobile.music.ui.adapter.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ltmobile.music.R;
import com.ltmobile.music.model.Album;

import java.util.List;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {
    private List<Album> albums;

    public AlbumAdapter(List<Album> albums) {
        this.albums = albums;
    }

    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.search_result_item, parent, false);
        return new AlbumViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumAdapter.AlbumViewHolder holder, int position) {
        Album album = albums.get(position);
        holder.bindData(album);
    }

    @Override
    public int getItemCount() {
        return albums.size();
    }

    public void updateAlbums(List<Album> albums) {
        this.albums = albums;
        notifyDataSetChanged();
    }


    public static class AlbumViewHolder extends RecyclerView.ViewHolder {
        private TextView nameTextView;
        private TextView artistTextView;

        public AlbumViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.name);
            artistTextView = itemView.findViewById(R.id.artist);
        }

        public void bindData(Album album) {
            nameTextView.setText(album.getName());
            artistTextView.setText(album.getArtist());
        }
    }
}
