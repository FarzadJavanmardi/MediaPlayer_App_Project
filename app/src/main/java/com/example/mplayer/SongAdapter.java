package com.example.mplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends BaseAdapter {

    private ArrayList<Song> songs;
    private LayoutInflater songInf;

    public SongAdapter(Context context, ArrayList<Song> songs){
       this.songs=songs;
       songInf=LayoutInflater.from(context);

    }
    @Override
    public int getCount() {
        return
                songs.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

       LinearLayout songLay=(LinearLayout)songInf.inflate(R.layout.song,viewGroup,false);
        TextView songView=songLay.findViewById(R.id.song_title);
        TextView artistView=songLay.findViewById(R.id.song_artist);

        Song currentSong=songs.get(i);
        songView.setText(currentSong.getTitle());
        artistView.setText(currentSong.getArtist());
        songLay.setTag(i);
        return songLay;
    }
}
