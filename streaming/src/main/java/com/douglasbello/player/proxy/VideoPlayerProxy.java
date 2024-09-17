package com.douglasbello.player.proxy;

import com.douglasbello.models.Media;
import com.douglasbello.models.User;
import com.douglasbello.player.Player;
import com.douglasbello.player.impl.VideoPlayer;

public class VideoPlayerProxy implements Player {
    private VideoPlayer player;

    public VideoPlayerProxy(VideoPlayer player) {
        this.player = player;
    }

    @Override
    public void play(Media media) {
        boolean hasAccess = checkAccess(getAuthUser(), media);

        if (hasAccess) {
            player.play(media);
            return;
        }

        System.out.println("You don't have access to watch this video.");
    }

    private boolean checkAccess(User authUser, Media media) {
        if (!media.isFree()) {
            return authUser.isPremium();
        }

        return true;
    }

    private User getAuthUser() {
        return new User("douglasbello", false);
    }
}