package com.google.android.libraries.play.entertainment.p345f;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import com.google.android.libraries.play.entertainment.media.C6074a;
import com.google.android.libraries.play.entertainment.media.C6123b;
import com.google.android.libraries.play.entertainment.p192l.C2983e;
import com.google.android.libraries.play.entertainment.p192l.C6109a;
import com.google.android.libraries.play.entertainment.p192l.C6113c;
import com.google.android.libraries.play.entertainment.p344d.C6038t;
import com.google.android.libraries.play.entertainment.p344d.C6058e;
import com.google.android.libraries.play.entertainment.p344d.C6070w;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.wireless.android.finsky.dfe.g.a.ac;
import com.squareup.haha.perflib.StackFrame;
import java.util.concurrent.Executor;

public final class C6075b implements OnAudioFocusChangeListener, OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnPreparedListener, C6074a {
    public static final C6090b f30210a = C6090b.m28050a();
    public static final C6038t f30211m = new C6076c();
    public final AudioManager f30212b;
    public final C2983e f30213c;
    public final Executor f30214d;
    public final MediaPlayer f30215e;
    public final C6123b f30216f;
    public final C6070w f30217g;
    public final C6079e f30218h;
    public int f30219i = 0;
    public ac f30220j;
    public ac f30221k;
    public int f30222l;

    C6075b(Context context, C2983e c2983e, Executor executor, C6123b c6123b) {
        this.f30212b = (AudioManager) context.getSystemService("audio");
        this.f30213c = c2983e;
        this.f30214d = executor;
        this.f30216f = c6123b;
        this.f30215e = new MediaPlayer();
        this.f30215e.setAudioStreamType(3);
        this.f30215e.setOnBufferingUpdateListener(this);
        this.f30215e.setOnErrorListener(this);
        this.f30215e.setOnCompletionListener(this);
        this.f30215e.setOnPreparedListener(this);
        this.f30217g = C6070w.m27988a();
        this.f30218h = new C6079e(this);
    }

    private final void m28002a(int i) {
        if (i != this.f30219i) {
            this.f30219i = i;
            switch (i) {
                case 0:
                    this.f30216f.mo5313c(this.f30220j);
                    this.f30220j = null;
                    return;
                case 1:
                    this.f30216f.mo5309a((ac) C6116b.m28100a(this.f30221k));
                    return;
                case 2:
                    this.f30216f.mo5312b((ac) C6116b.m28100a(this.f30220j));
                    return;
                default:
                    return;
            }
        }
    }

    public final void mo5277a(ac acVar, boolean z) {
        if (!z) {
            Object obj;
            if (this.f30219i == 1) {
                obj = this.f30221k;
            } else {
                obj = this.f30220j;
            }
            if (acVar.equals(obj)) {
                return;
            }
        }
        this.f30221k = acVar;
        m28009f();
        this.f30217g.m27992c();
        C6113c c6113c = new C6113c(new C6109a(String.valueOf(acVar.b).concat("&mode=streaming")), 0);
        m28002a(1);
        this.f30213c.mo3213a(c6113c).m27964a(this.f30214d, f30211m).m27965a(this.f30217g, C6058e.f30188b, this.f30218h);
    }

    public final void mo5276a() {
        this.f30215e.pause();
    }

    public final void mo5278b() {
        this.f30215e.start();
    }

    public final boolean mo5279e() {
        return this.f30215e.isPlaying();
    }

    public final void m28009f() {
        this.f30217g.m27993d();
        this.f30212b.abandonAudioFocus(this);
        this.f30215e.reset();
        this.f30222l = 0;
        m28002a(0);
    }

    public final void mo5280g() {
        this.f30217g.m27993d();
        this.f30212b.abandonAudioFocus(this);
        this.f30215e.release();
        this.f30222l = 0;
    }

    public final float mo2655c() {
        if (this.f30219i != 2) {
            return 0.0f;
        }
        float duration = (float) this.f30215e.getDuration();
        if (duration > 0.0f) {
            return ((float) this.f30215e.getCurrentPosition()) / duration;
        }
        return 0.0f;
    }

    public final float mo2656d() {
        return 0.01f * ((float) this.f30222l);
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f30222l = i;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        return false;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        m28009f();
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f30220j = this.f30221k;
        m28002a(2);
        if (this.f30212b.requestAudioFocus(this, 3, 1) == 1) {
            this.f30215e.start();
        }
    }

    public final void onAudioFocusChange(int i) {
        switch (i) {
            case StackFrame.NATIVE_METHOD /*-3*/:
                if (this.f30215e.isPlaying()) {
                    this.f30215e.setVolume(0.1f, 0.1f);
                    return;
                }
                return;
            case StackFrame.COMPILED_METHOD /*-2*/:
            case -1:
                if (this.f30215e.isPlaying()) {
                    this.f30215e.pause();
                    return;
                }
                return;
            case 1:
                if (!this.f30215e.isPlaying()) {
                    this.f30215e.start();
                }
                this.f30215e.setVolume(1.0f, 1.0f);
                return;
            default:
                return;
        }
    }
}
