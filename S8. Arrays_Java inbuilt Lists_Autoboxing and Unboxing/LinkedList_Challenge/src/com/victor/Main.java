package com.victor;

import java.util.*;

// create a program that implements a playlist for songs
// create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The album will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list
// in the order they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit, Skip, forward to the next song, skip backwards to a previous song. Replay the
// current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist ( so you can
// only play songs that
// you own).
// Hint: To replay a song, consider what happened when we went bach and forth from a
// city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listIterator.remove()
public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album1 = new Album("First album");
        albums.add(album1);
        Album album2 = new Album("Second album");
        albums.add(album2);

        album1.addSongToAlbum("1st Song", 2.15);
        album1.addSongToAlbum("2nd Song", 3.41);
        album1.addSongToAlbum("3rd Song", 3.41);
        album1.addSongToAlbum("4th Song", 3.41);
        album1.addSongToAlbum("5th Song", 3.41);
        album2.addSongToAlbum("6th Song", 4.13);
        album2.addSongToAlbum("7th Song", 4.13);
        album2.addSongToAlbum("8th Song", 4.13);
        album2.addSongToAlbum("9th Song", 4.13);
        album2.addSongToAlbum("10th Song", 4.13);

        LinkedList<Song> playlist = new LinkedList<Song>();
        // there are no 1st,2nd,10th songs in a playlist
/*        album1.addToPlaylist("3rd Song", playlist);
        album1.addToPlaylist("4th Song", playlist);
        album1.addToPlaylist("5th Song", playlist);
        album2.addToPlaylist("6th Song", playlist);
        album2.addToPlaylist("7th Song", playlist);
        album2.addToPlaylist("8th Song", playlist);*/
        album2.addToPlaylist("9th Song", playlist);

        //printPlaylist(playlist);
        //printMenu();

        actions(playlist);

    }

    private static void printMenu() {
        System.out.println("Available options:\n" +
                "1 - Print menu\n" +
                "2 - Forward\n" +
                "3 - Backwards\n" +
                "4 - Repeat\n" +
                "6 - Print playlist\n" +
                "7 - Remove song from playlist\n" +
                "5 - Quit menu");
    }

    private static void printPlaylist(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("=======");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }
        System.out.println("=======");

    }

    private static void actions(LinkedList<Song> songs) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<Song> listIterator = songs.listIterator();
        if (songs.isEmpty()) {
            System.out.println("There are no tracks in a playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().getTitle());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 1:
                    printMenu();
                    break;
                case 2: // forward
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().getTitle());
                    } else {
                        System.out.println("End of playlist reached");
                        listIterator.previous();
                        goingForward = false;
                    }
                    break;
                case 3: // backwards
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("We are at the start of playlist");
                        listIterator.next();
                        goingForward = true;
                    }
                    break;
                case 4: // repeat
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.previous().getTitle());
                        listIterator.next(); // change iterator in order to avoid error
                    } else {
                        System.out.println("Now playing " + listIterator.next().getTitle());
                        listIterator.previous(); // change iterator in order to avoid error
                    }
                    break;
                case 5: // quit
                    quit = true;
                    break;
                case 6:
                    printPlaylist(songs);
                    break;
                case 7: // remove song from playlist
                    if (songs.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().getTitle());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().getTitle());
                        } else {
                            System.out.println("-Playlist is empty");
                        }
                    } else {
                        System.out.println("Playlist is empty");
                    }
                    break;
            }
        }

    }

}


