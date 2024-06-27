package com.ltmobile.music.service;

import com.ltmobile.music.model.Album;
import com.ltmobile.music.model.Artist;
import com.ltmobile.music.model.Track;
import com.ltmobile.music.ui.adapter.search.AlbumAdapter;
import com.ltmobile.music.ui.adapter.search.ArtistAdapter;
import com.ltmobile.music.ui.adapter.search.TrackAdapter;

import java.util.ArrayList;
import java.util.List;

public class SearchService {
    public void filterTracks(String query, List<Track> trackList, TrackAdapter trackAdapter) {
        List<Track> filteredTracks = new ArrayList<>();
        for (Track track : trackList) {
            if (track.getName().toLowerCase().contains(query.toLowerCase()) ||
                    track.getArtist().toLowerCase().contains(query.toLowerCase())) {
                filteredTracks.add(track);
            }
        }
        trackAdapter.updateTracks(filteredTracks);
    }

    public void filterAlbums(String query, List<Album> albumList, AlbumAdapter albumAdapter) {
        List<Album> filteredAlbums = new ArrayList<>();
        for (Album album : albumList) {
            if (album.getName().toLowerCase().contains(query.toLowerCase()) ||
                    album.getArtist().toLowerCase().contains(query.toLowerCase())) {
                filteredAlbums.add(album);
            }
        }
        albumAdapter.updateAlbums(filteredAlbums);
    }

    public void filterArtists(String string, List<Artist> artistList, ArtistAdapter artistAdapter) {
        List<Artist> filteredArtists = new ArrayList<>();
        for (Artist artist : artistList) {
            if (artist.getName().toLowerCase().contains(string.toLowerCase())) {
                filteredArtists.add(artist);
            }
        }
        artistAdapter.updateArtists(filteredArtists);
    }
}
