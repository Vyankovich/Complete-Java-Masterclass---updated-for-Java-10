package com.victor;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by dev on 20.10.2018.
 */
// create a program that implements a playlist for album
// create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of album.
// The album will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list
// in the order they are added.
// Once the album have been added to the playlist, create a menu of options to:-
// Quit, Skip, forward to the next song, skip backwards to a previous song. Replay the
// current song.
// List the album in the playlist
// A song must exist in an album before it can be added to the playlist ( so you can
// only play album that
// you own).
// Hint: To replay a song, consider what happened when we went bach and forth from a
// city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listIterator.remove()
public class Album {
    private String name;
    private ArrayList<Song> album;

    // constructor. Create album X and empty arrayList of album
    public Album(String name) {
        this.name = name;
        this.album = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getAlbum() {
        return album;
    }

// check if song already in an Album. return object if exist otherwise null
    private Song findSong(String songName) {
        for (int i = 0; i < this.album.size(); i++) {
            Song existingSong = this.album.get(i);
            if (existingSong.getTitle().equals(songName)) {
                return existingSong;
            }
        }
        return null;
    }
// add song if not in an album
    public boolean addSongToAlbum(String songName, double duration) {
        // trying to find a song by given name. if song not in an album then add it into
        Song existingSong = findSong(songName);
        if (existingSong != null) { // song exists, do not add
            System.out.println("Error of adding a " + songName + ". Song already in an album.");
            return false;
        }
        this.album.add(new Song(songName, duration));
        return true;
    }
//
    public boolean removeSongFromAlbum(String songName) {
        // trying to find a song by given name. if song not in an album then add it into
        Song existingSong = findSong(songName);
        if (existingSong == null) { // song exists, do not add
            System.out.println("Error of deleting a " + songName + ". No such song in an album.");
            return false;
        }
        this.album.remove(existingSong);
        System.out.println(existingSong.getTitle() + " deleted from the album");
        return true;
    }

    public boolean addToPlaylist(String songName, LinkedList<Song> playlist) {
        // trying to find a song by given name.
        Song existingSong = findSong(songName);
        if (existingSong != null) { // song exists, so we can add it to playlist
            playlist.add(existingSong);
            return true;
        }
        return false;
    }

    public boolean removeFromPlaylist(String songName, LinkedList<Song> playlist) {
        // trying to find a song by given name.
        Song existingSong = findSong(songName);
        if (existingSong != null) { // song exists, so we can add it to playlist
            playlist.remove(existingSong);
            return true;
        }
        return false;
    }

}
