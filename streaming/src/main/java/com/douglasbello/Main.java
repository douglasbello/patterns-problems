package com.douglasbello;

import com.douglasbello.models.Video;
import com.douglasbello.player.impl.VideoPlayer;
import com.douglasbello.player.proxy.VideoPlayerProxy;

public class Main {
    public static void main(String[] args) {
        Video premiumVideo = new Video("https://youtube.com/xyjz8a7", false, "YouTube");
        Video freeVideo = new Video("https://youtube.com/lm1kj32z", true, "YouTube");

        VideoPlayer videoPlayer = new VideoPlayer();
        VideoPlayerProxy proxy = new VideoPlayerProxy(videoPlayer);

        proxy.play(freeVideo);
        proxy.play(premiumVideo);
    }
}