package com.google.android.finsky.p110p;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.squareup.haha.perflib.StackFrame;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class C3837c implements OnAudioFocusChangeListener {
    public final C1004h f19205a = new C3838d(this, new Handler(Looper.getMainLooper()));
    public final C3836b f19206b;
    public final List f19207c = new ArrayList();
    public final AudioManager f19208d;
    public int f19209e = -1;
    public boolean f19210f = false;
    public final OnPreparedListener f19211g = new C3840f(this);
    public final OnCompletionListener f19212h = new C3841g(this);

    public C3837c(Context context) {
        this.f19208d = (AudioManager) context.getSystemService("audio");
        this.f19206b = new C3836b(context, this.f19205a);
        this.f19206b.f19199b = this.f19211g;
        this.f19206b.f19200c = this.f19212h;
    }

    public final void m18304a(String str) {
        switch (this.f19206b.f19198a) {
            case 3:
                m18307c();
                return;
            case 5:
                m18302a();
                return;
            case 6:
                m18299d();
                return;
            default:
                bb.m21791a();
                m18300e();
                try {
                    C3836b c3836b = this.f19206b;
                    c3836b.f19202e.setDataSource(str);
                    c3836b.f19198a = 2;
                    c3836b.f19203f.mo1210b(2);
                    c3836b = this.f19206b;
                    c3836b.f19202e.prepareAsync();
                    c3836b.f19198a = 3;
                    c3836b.f19203f.mo1210b(3);
                    return;
                } catch (IllegalStateException e) {
                    FinskyLog.m21667d("Error trying to play %s", str);
                    return;
                } catch (IOException e2) {
                    FinskyLog.m21667d("IOException: %s", e2.getMessage());
                    this.f19205a.mo1210b(9);
                    return;
                }
        }
    }

    public final void m18302a() {
        if (this.f19206b.f19198a == 5 || this.f19206b.f19198a == 4) {
            C3836b c3836b = this.f19206b;
            c3836b.f19202e.pause();
            c3836b.f19198a = 6;
            c3836b.f19203f.mo1210b(6);
            c3836b.m18298b();
            m18301f();
        }
    }

    private final void m18299d() {
        if (this.f19206b.f19198a == 6) {
            m18300e();
            this.f19206b.m18297a();
        }
    }

    public final void m18305b() {
        switch (this.f19206b.f19198a) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                C3836b c3836b = this.f19206b;
                c3836b.f19202e.stop();
                c3836b.f19198a = 7;
                c3836b.f19203f.mo1210b(7);
                c3836b.m18298b();
                m18301f();
                return;
            default:
                return;
        }
    }

    public final void m18307c() {
        C3836b c3836b = this.f19206b;
        c3836b.f19202e.reset();
        c3836b.f19198a = 1;
        c3836b.f19203f.mo1210b(1);
        c3836b.m18298b();
        m18301f();
    }

    public final void m18303a(C1004h c1004h) {
        if (!this.f19207c.contains(c1004h)) {
            this.f19207c.add(c1004h);
        }
    }

    public final void m18306b(C1004h c1004h) {
        this.f19207c.remove(c1004h);
    }

    private final void m18300e() {
        if (this.f19209e != 1 && this.f19208d != null && this.f19208d.requestAudioFocus(this, 3, 1) == 1) {
            this.f19209e = 1;
        }
    }

    private final void m18301f() {
        if (this.f19209e != -1 && this.f19208d != null) {
            this.f19208d.abandonAudioFocus(this);
            this.f19209e = -1;
        }
    }

    public final void onAudioFocusChange(int i) {
        this.f19209e = i;
        switch (i) {
            case StackFrame.NATIVE_METHOD /*-3*/:
            case StackFrame.COMPILED_METHOD /*-2*/:
                if (this.f19206b.f19198a == 5) {
                    m18302a();
                    this.f19210f = true;
                    return;
                }
                return;
            case -1:
                m18302a();
                return;
            case 1:
                if (this.f19210f) {
                    m18299d();
                    this.f19210f = false;
                    return;
                }
                return;
            default:
                return;
        }
    }
}
