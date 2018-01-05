package com.google.android.finsky.bm;

import android.support.v4.app.ab;
import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.libraries.play.entertainment.media.C2125d;
import com.google.android.youtube.player.b;
import com.google.android.youtube.player.e;
import com.google.android.youtube.player.f;
import com.google.android.youtube.player.h;
import com.google.android.youtube.player.i;
import com.google.android.youtube.player.j;
import com.google.android.youtube.player.k;
import com.squareup.leakcanary.C7582R;

public final class C2126i implements C2125d, h, i, j {
    public int f10766a = -2;
    public final ab f10767b;
    public final int f10768c;
    public final C2121j f10769d;
    public C2124h f10770e;
    public e f10771f;
    public String f10772g;
    public int f10773h = -1;

    public C2126i(ab abVar, C2121j c2121j) {
        this.f10767b = abVar;
        this.f10768c = C7582R.id.pe_youtube_player_fragment_container;
        this.f10769d = c2121j;
    }

    public final boolean m11061a() {
        if (this.f10770e == null) {
            FinskyLog.m21667d("Cannot determine if video is playing with uninitialized fragment", new Object[0]);
            return false;
        } else if (this.f10766a == 3 || this.f10766a == 4) {
            return true;
        } else {
            return false;
        }
    }

    final int m11062b() {
        if (this.f10770e != null && this.f10771f != null) {
            return this.f10771f.c();
        }
        FinskyLog.m21667d("Cannot determine video play position with uninitialized fragment or YouTube player", new Object[0]);
        return -1;
    }

    public final float mo2655c() {
        if (this.f10770e == null || this.f10771f == null) {
            return 0.0f;
        }
        try {
            float d = (float) this.f10771f.d();
            if (d > 0.0f) {
                return ((float) this.f10771f.c()) / d;
            }
            return 0.0f;
        } catch (RuntimeException e) {
            if (!(e instanceof IllegalStateException) || e.getMessage() == null || !e.getMessage().contains("has been released")) {
                return 0.0f;
            }
            FinskyLog.m21665c("Unexpected youtube release: %s", e);
            m11054m();
            return 0.0f;
        }
    }

    public final float mo2656d() {
        return 0.0f;
    }

    public final void m11057a(e eVar) {
        if (this.f10766a == -1) {
            this.f10771f = eVar;
            eVar.f();
            eVar.a(this.f10772g);
            eVar.a(k.b);
            eVar.a(this);
            eVar.a(this);
            m11063b(0);
            if (this.f10769d != null) {
                this.f10769d.mo2653c();
            }
        }
    }

    public final void m11056a(b bVar) {
        FinskyLog.m21665c("Youtube error", bVar.name());
        this.f10771f = null;
        this.f10772g = null;
        m11063b(-2);
        if (this.f10769d != null) {
            this.f10769d.mo2649a(bVar);
        }
    }

    public final void cD_() {
        m11063b(3);
    }

    public final void cE_() {
        if (this.f10766a == 3 || this.f10766a == 4) {
            m11063b(5);
            return;
        }
        FinskyLog.m21665c("unexpected onPaused() when not playing (state: %d)", Integer.valueOf(this.f10766a));
    }

    public final void cF_() {
        if (this.f10766a == 3 || this.f10766a == 4 || this.f10766a == 5) {
            m11063b(6);
            if (this.f10769d != null) {
                this.f10769d.mo2652b();
            }
        }
    }

    public final void m11060a(boolean z) {
        if (z) {
            switch (this.f10766a) {
                case 1:
                case 2:
                case 5:
                    return;
                case 3:
                    m11063b(4);
                    return;
                default:
                    new Object[1][0] = Integer.valueOf(this.f10766a);
                    return;
            }
        }
        switch (this.f10766a) {
            case 0:
            case 1:
            case 5:
                return;
            case 2:
            case 3:
            case 4:
                m11063b(3);
                return;
            default:
                new Object[1][0] = Integer.valueOf(this.f10766a);
                return;
        }
    }

    public final void m11055a(int i) {
        new Object[1][0] = Integer.valueOf(i);
    }

    public final void cz_() {
        m11063b(1);
    }

    public final void m11059a(String str) {
    }

    public final void cA_() {
    }

    public final void cB_() {
        if (this.f10766a == 1) {
            m11063b(2);
            if (this.f10773h >= 0 && this.f10771f != null) {
                this.f10771f.a(this.f10773h);
                this.f10773h = -1;
                return;
            }
            return;
        }
        FinskyLog.m21665c("unexpected onVideoStarted() when not LOADING (state: %d)", Integer.valueOf(this.f10766a));
    }

    public final void cC_() {
        if (this.f10766a <= 0 || this.f10766a > 5) {
            FinskyLog.m21665c("unexpected onVideoEnded() when state not between LOADING and PAUSED (state: %d)", Integer.valueOf(this.f10766a));
        } else {
            m11063b(6);
            if (!(this.f10769d == null || TextUtils.isEmpty(this.f10772g))) {
                this.f10769d.mo2650a(this.f10772g);
            }
        }
        this.f10773h = -1;
    }

    public final void m11058a(f fVar) {
        FinskyLog.m21667d("Youtube error: %s", fVar.name());
        this.f10772g = null;
        m11063b(0);
        m11054m();
    }

    final void m11066l() {
        try {
            this.f10767b.mo284a().mo327a(this.f10770e).mo336d();
        } catch (IllegalStateException e) {
        }
        int hashCode = this.f10770e.hashCode();
        this.f10770e = null;
        this.f10771f = null;
        this.f10772g = null;
        this.f10773h = -1;
        m11063b(-2);
        new Object[1][0] = Integer.valueOf(hashCode);
    }

    final void m11063b(int i) {
        if (this.f10766a != i) {
            new Object[1][0] = Integer.valueOf(i);
            this.f10766a = i;
        }
    }

    private final void m11054m() {
        if (this.f10771f != null || this.f10766a != -2) {
            this.f10771f = null;
            m11063b(-2);
            if (this.f10769d != null) {
                this.f10769d.mo2654d();
            }
        }
    }
}
