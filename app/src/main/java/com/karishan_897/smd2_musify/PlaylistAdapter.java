package com.karishan_897.smd2_musify;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistAdapter.ViewHolder> {
    Context mContext;
    List<Playlists> playlistsList;

    public PlaylistAdapter(Context mContext, List<Playlists> playlistsList) {
        this.mContext = mContext;
        this.playlistsList = playlistsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.playlist_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.playlistName.setText(playlistsList.get(position).getPlaylistName());
        Glide.with(mContext).load(playlistsList.get(position).getImageURL()).into(holder.playlistImage);
    }

    @Override
    public int getItemCount() {
        return playlistsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView playlistName;
        public ImageView playlistImage;
        public ViewHolder(View itemView) {
            super(itemView);
            playlistName = (TextView) itemView.findViewById(R.id.playListName);
            playlistImage = (ImageView) itemView.findViewById(R.id.playListImage);
        }
    }
}