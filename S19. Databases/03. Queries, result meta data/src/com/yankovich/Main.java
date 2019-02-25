package com.yankovich;

import com.yankovich.model.Artist;
import com.yankovich.model.DataSource;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        DataSource datasource = new DataSource();
        if (!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }
        List<Artist> artists = datasource.queryArtists(DataSource.ORDER_BY_DESC);
        if (artists == null) {
            System.out.println("No artists");
            return;
        }

        for (Artist artist : artists) {
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }

        List<String> albumsForArtist = datasource.queryAlbumsForArtist("Iron Maiden", DataSource.ORDER_BY_ASC);

        for (String album : albumsForArtist) {
            System.out.println(album);
        }

        datasource.querySongsMetadata();


        datasource.close();
    }






}
