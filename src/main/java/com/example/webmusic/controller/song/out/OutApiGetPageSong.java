package com.example.webmusic.controller.song.out;

import com.example.webmusic.models.song.Song;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OutApiGetPageSong {
    private List<Song> data;
    private long code;
    private long totals;
}
