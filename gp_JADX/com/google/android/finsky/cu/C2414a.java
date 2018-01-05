package com.google.android.finsky.cu;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.google.android.finsky.C1473m;

public final class C2414a extends MediaPlayer implements OnCompletionListener, OnErrorListener, OnPreparedListener {
    public int f11717a = 0;
    public OnPreparedListener f11718b = null;
    public OnCompletionListener f11719c = null;
    public OnErrorListener f11720d = null;
    public final C2418l f11721e;
    public final WakeLock f11722f;

    public C2414a(C2418l c2418l) {
        super.setOnPreparedListener(this);
        super.setOnCompletionListener(this);
        super.setOnErrorListener(this);
        this.f11721e = c2418l;
        this.f11722f = ((PowerManager) C1473m.f7980a.m8581a("power")).newWakeLock(6, "MediaPlayerWrapper");
    }

    public final void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.f11718b = onPreparedListener;
    }

    public final void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        this.f11719c = onCompletionListener;
    }

    public final void reset() {
        super.reset();
        this.f11717a = 0;
        this.f11721e.mo2909h();
        m12122b();
    }

    public final void m12123a() {
        super.reset();
        this.f11717a = 0;
        this.f11721e.mo2909h();
    }

    public final void setDataSource(String str) {
        super.setDataSource(str);
        this.f11717a = 1;
    }

    public final void prepareAsync() {
        super.prepareAsync();
        this.f11717a = 2;
        this.f11721e.mo2905d();
    }

    public final void prepare() {
        super.prepare();
        this.f11717a = 3;
        this.f11721e.mo2906e();
    }

    public final void start() {
        super.start();
        this.f11717a = 4;
        this.f11721e.mo2901a();
        if (!this.f11722f.isHeld()) {
            this.f11722f.acquire();
        }
    }

    public final void stop() {
        super.stop();
        this.f11717a = 6;
        m12122b();
    }

    public final void pause() {
        super.pause();
        this.f11717a = 5;
        this.f11721e.mo2903b();
        m12122b();
    }

    public final void release() {
        super.release();
        this.f11717a = 9;
        m12122b();
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f11717a = 3;
        this.f11721e.mo2906e();
        if (this.f11718b != null) {
            this.f11718b.onPrepared(mediaPlayer);
        }
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f11717a = 7;
        this.f11721e.mo2904c();
        if (this.f11719c != null) {
            this.f11719c.onCompletion(mediaPlayer);
        }
        if (this.f11717a != 10) {
            m12122b();
        }
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.f11717a = 8;
        this.f11721e.mo2908g();
        if (this.f11720d != null) {
            return this.f11720d.onError(mediaPlayer, i, i2);
        }
        return false;
    }

    private final void m12122b() {
        if (this.f11722f.isHeld()) {
            this.f11722f.release();
        }
    }
}
