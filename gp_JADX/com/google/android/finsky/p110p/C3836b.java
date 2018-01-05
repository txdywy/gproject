package com.google.android.finsky.p110p;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

final class C3836b implements OnCompletionListener, OnErrorListener, OnPreparedListener {
    public int f19198a;
    public OnPreparedListener f19199b;
    public OnCompletionListener f19200c;
    public OnErrorListener f19201d;
    public MediaPlayer f19202e;
    public final C1004h f19203f;
    public final WakeLock f19204g;

    public C3836b(Context context, C1004h c1004h) {
        this(context, c1004h, new MediaPlayer());
    }

    private C3836b(Context context, C1004h c1004h, MediaPlayer mediaPlayer) {
        this.f19198a = 1;
        this.f19199b = null;
        this.f19200c = null;
        this.f19201d = null;
        this.f19202e = mediaPlayer;
        this.f19202e.setOnPreparedListener(this);
        this.f19202e.setOnCompletionListener(this);
        this.f19202e.setOnErrorListener(this);
        this.f19203f = c1004h;
        this.f19204g = ((PowerManager) context.getSystemService("power")).newWakeLock(6, "MediaPlayerWrapper");
    }

    public final void m18297a() {
        this.f19202e.start();
        this.f19198a = 5;
        this.f19203f.mo1210b(5);
        if (!this.f19204g.isHeld()) {
            this.f19204g.acquire();
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f19198a = 4;
        this.f19203f.mo1210b(4);
        if (this.f19199b != null) {
            this.f19199b.onPrepared(mediaPlayer);
        }
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f19198a = 8;
        this.f19203f.mo1210b(8);
        if (this.f19200c != null) {
            this.f19200c.onCompletion(mediaPlayer);
        }
        m18298b();
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.f19198a = 9;
        this.f19203f.mo1210b(9);
        if (this.f19201d != null) {
            return this.f19201d.onError(mediaPlayer, i, i2);
        }
        m18298b();
        return false;
    }

    final void m18298b() {
        if (this.f19204g.isHeld()) {
            this.f19204g.release();
        }
    }
}
