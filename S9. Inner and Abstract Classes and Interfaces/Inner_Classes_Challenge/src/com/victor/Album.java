package com.victor;
// Modify the playlist challenge  so that the Album class uses an inner class.
// Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
// The inner SongList class will use an ArrayList and will provide a method to add a song.
// It will also provide findSong() methods which will be used by the containing Album class to add songs to the playlist.
// Neither the Song class or Main class be changed.
/**
 * Created by dev on 26.10.2018.
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    //private ArrayList<String> songs;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        //this.songs = new ArrayList<String>();
        this.songs = new SongList();
    }
//-------- inner class
    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public ArrayList<Song> getSongs() {
        return songs;
    }

        private Song findSong(String title) {
            for(Song checkedSong: this.songs) {
                if(checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if (index >= 0 && index < this.songs.size()) {
                return this.songs.get(index);
            }
            return null;
        }

        public boolean addSongInner(Song song) {
            if(songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }
    }
// ----------- end of inner class

    public boolean addSong(String title, double duration) {
        return this.songs.addSongInner(new Song(title, duration)); // method from inner class
    }
/*    public boolean addSongInner(String title, double duration) {
        if(findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }*/

/*    private Song findSong(String title) {
        for(Song checkedSong: this.songs) {
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }*/

/*    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber -1;
        if((index >0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }*/
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = songs.findSong(trackNumber);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }

        return false;
    }

/*    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }*/
public boolean addToPlayList(String title, LinkedList<Song> playList) {
    Song checkedSong = songs.findSong(title);
    if(checkedSong != null) {
        playList.add(checkedSong);
        return true;
    }

    return false;
}

// Modify the playlist challenge  so that the Album class uses an inner class.
// Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
// The inner SongList class will use an ArrayList and will provide a method to add a song.
// It will also provide findSong() methods which will be used by the containing Album class to add songs to the playlist.
// Neither the Song class or Main class be changed.
}