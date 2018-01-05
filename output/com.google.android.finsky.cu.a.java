package com.google.android.finsky.cu;

import android.media.MediaPlayer;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnPreparedListener;
import android.os.PowerManager;
import android.os.PowerManager$WakeLock;
import com.google.android.finsky.m;

public final class com.google.android.finsky.cu.a extends MediaPlayer implements MediaPlayer$OnCompletionListener, MediaPlayer$OnErrorListener, MediaPlayer$OnPreparedListener
{

    public int a;
    public MediaPlayer$OnPreparedListener b;
    public MediaPlayer$OnCompletionListener c;
    public MediaPlayer$OnErrorListener d;
    public final com.google.android.finsky.cu.l e;
    public final PowerManager$WakeLock f;

    a(com.google.android.finsky.cu.l p0) {
        MediaPlayer();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        super.setOnPreparedListener(this);
        super.setOnCompletionListener(this);
        super.setOnErrorListener(this);
        this.e = p0;
        this.f = ((PowerManager)com.google.android.finsky.m.a.a("power")).newWakeLock(6, "MediaPlayerWrapper");
    }

    private final void b() {
        if (this.f.isHeld())
            this.f.release();
    }

    public final void a() {
        super.reset();
        this.a = 0;
        this.e.h();
    }

    public final void onCompletion(MediaPlayer p0) {
        this.a = 7;
        this.e.c();
        if (this.c != 0)
            this.c.onCompletion(p0);
        if (this.a != 10)
            this.b();
    }

    public final boolean onError(MediaPlayer p0, int p1, int p2) {
        this.a = 8;
        this.e.g();
        if (this.d != 0)
            v0 = this.d.onError(p0, p1, p2);
        else
            v0 = 0;
        return v0;
    }

    public final void onPrepared(MediaPlayer p0) {
        this.a = 3;
        this.e.e();
        if (this.b != 0)
            this.b.onPrepared(p0);
    }

    public final void pause() {
        super.pause();
        this.a = 5;
        this.e.b();
        this.b();
    }

    public final void prepare() {
        super.prepare();
        this.a = 3;
        this.e.e();
    }

    public final void prepareAsync() {
        super.prepareAsync();
        this.a = 2;
        this.e.d();
    }

    public final void release() {
        super.release();
        this.a = 9;
        this.b();
    }

    public final void reset() {
        super.reset();
        this.a = 0;
        this.e.h();
        this.b();
    }

    public final void setDataSource(String p0) {
        super.setDataSource(p0);
        this.a = 1;
    }

    public final void setOnCompletionListener(MediaPlayer$OnCompletionListener p0) {
        this.c = p0;
    }

    public final void setOnPreparedListener(MediaPlayer$OnPreparedListener p0) {
        this.b = p0;
    }

    public final void start() {
        super.start();
        this.a = 4;
        this.e.a();
        if (!this.f.isHeld())
            this.f.acquire();
    }

    public final void stop() {
        super.stop();
        this.a = 6;
        this.b();
    }

}
