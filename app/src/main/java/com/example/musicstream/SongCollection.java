 package com.example.musicstream;

 import android.content.Intent;

 public class SongCollection {

    private Song songs[] = new Song[3];
    public SongCollection()
    {
        Song theWayYouLookTonight = new Song("S1001", "1. The Way You Look Tonight", "Michael Buble", "https://p.scdn.co/mp3-preview/a5b8972e764025020625bbf9c1c2bbb06e394a60?cid=2afe87a64b0042dabf51f37318616965", 4.66, R.drawable.michael_buble_collection);
        Song billieJean = new Song("S1002", "Billie Jean", "Michael Jackson", "https://p.scdn.co/mp3-preview/f504e6b8e037771318656394f532dede4f9bcaea?cid=2afe87a64b0042dabf51f37318616965", 4.9, R.drawable.billie_jean);
        Song ed = new Song("S1003", "3.One", "Ed Sheeran", "https://p.scdn.co/mp3-preview/daa8679253ba20620db6e1db9c88edfcf1f4069f?cid=2afe87a64b0042dabf51f37318616965", 4.21, R.drawable.photograph);


        songs[0] = theWayYouLookTonight;
        songs[1] = billieJean;
        songs[2] = ed;
    }

    public int searchSongById(String id)
    {
        for(int index = 0; index < songs.length; index ++)
        {
            Song tempsong = songs[index];
            if(tempsong.getId().equals(id))
            {
                return index;
            }
    }
        return -1;
    }
}
