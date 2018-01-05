package com.google.android.libraries.play.entertainment.p345f;

import android.os.Bundle;
import android.os.StrictMode;
import android.os.StrictMode.VmPolicy;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.libraries.play.entertainment.media.C6125h;
import com.google.android.youtube.player.b;
import com.google.android.youtube.player.e;
import com.google.android.youtube.player.f;
import com.google.android.youtube.player.g;
import com.google.android.youtube.player.h;
import com.google.android.youtube.player.i;
import com.google.android.youtube.player.j;
import com.google.android.youtube.player.k;
import com.google.android.youtube.player.l;
import java.lang.reflect.Field;

public final class C6086i extends l implements g, h, i, j {
    public VmPolicy f30233a;
    public e f30234b;
    public String f30235c;
    public C6125h f30236d;
    public int f30237e = -2;
    public boolean f30238f = false;

    public C6086i() {
        C6083g.f30227a.m28054a("YTFragment@%x instantiated", Integer.valueOf(hashCode()));
        try {
            Field declaredField = l.class.getDeclaredField("ah");
            declaredField.setAccessible(true);
            declaredField.set(this, Boolean.valueOf(true));
        } catch (Throwable e) {
            C6083g.f30227a.m28055a(e, "Youtube texture optimization failed", new Object[0]);
        }
    }

    public final View m28037a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C6083g.f30227a.m28054a("YTFragment@%x onCreateView", Integer.valueOf(hashCode()));
        this.f30233a = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(VmPolicy.LAX);
        return super.a(layoutInflater, viewGroup, bundle);
    }

    public final void m28048e(Bundle bundle) {
        C6083g.f30227a.m28054a("YTFragment@%x onSaveInstanceState", Integer.valueOf(hashCode()));
        try {
            super.e(bundle);
        } catch (Throwable e) {
            C6083g.f30227a.m28058b(e, "YT failed to save instance state", new Object[0]);
        }
    }

    public final void m28047d() {
        C6083g.f30227a.m28054a("YTFragment@%x onDestroyView", Integer.valueOf(hashCode()));
        this.f30234b = null;
        this.f30237e = -2;
        super.d();
        if (this.f30233a != null) {
            StrictMode.setVmPolicy(this.f30233a);
            this.f30233a = null;
        }
    }

    public final void m28045b(String str) {
        boolean equals = str.equals(this.f30235c);
        this.f30235c = str;
        if (this.f30234b != null && equals && this.f30237e == 5) {
            this.f30234b.a();
        } else if (this.f30234b != null && (!equals || this.f30237e == 6 || this.f30237e == 0)) {
            this.f30237e = 0;
            this.f30234b.a(str);
        } else if (this.f30237e == -2) {
            this.f30237e = -1;
            a("AIzaSyAga_pG3jPjExrrO02LQ3qpicmjRadlS9g", this);
        }
    }

    public final float m28035W() {
        if (this.f30234b == null) {
            return 0.0f;
        }
        try {
            float d = (float) this.f30234b.d();
            if (d > 0.0f) {
                return ((float) this.f30234b.c()) / d;
            }
            return 0.0f;
        } catch (RuntimeException e) {
            m28042a(e);
            return 0.0f;
        }
    }

    final void m28042a(RuntimeException runtimeException) {
        if ((runtimeException instanceof IllegalStateException) && runtimeException.getMessage() != null && runtimeException.getMessage().contains("has been released")) {
            C6083g.f30227a.m28055a(runtimeException, "Unexpected youtube release", new Object[0]);
            m28033Y();
        }
    }

    private final void m28033Y() {
        if (this.f30234b != null || this.f30237e != -2) {
            this.f30234b = null;
            this.f30237e = -2;
            if (this.f30236d != null) {
                this.f30236d.mo5314a();
            }
        }
    }

    public final void m28040a(e eVar) {
        if (this.f30237e == -1) {
            eVar.a(k.b);
            eVar.a(this);
            eVar.a(this);
            eVar.a(this);
            eVar.b(0);
            this.f30234b = eVar;
            this.f30237e = 0;
            if (this.f30235c != null) {
                m28045b(this.f30235c);
            }
        }
    }

    public final void m28039a(b bVar) {
        this.f30234b = null;
        this.f30235c = null;
        this.f30237e = -2;
        if (this.f30236d != null) {
            this.f30236d.mo5315a(new C6085h(bVar));
        }
    }

    public final boolean m28036X() {
        if (!this.f30238f || this.f30234b == null) {
            return false;
        }
        try {
            this.f30234b.e();
        } catch (RuntimeException e) {
            m28042a(e);
            if (this.f30234b == null) {
                this.f30238f = false;
            }
        }
        return true;
    }

    public final void cz_() {
        C6083g.f30227a.m28054a("loading", new Object[0]);
        this.f30237e = 1;
    }

    public final void m28043a(String str) {
        C6083g.f30227a.m28054a("loaded %s (not firing any event)", str);
    }

    public final void cA_() {
        C6083g.f30227a.m28054a("adStarted", new Object[0]);
    }

    public final void cB_() {
        if (this.f30237e == 1) {
            C6083g.f30227a.m28054a("videoStarted", new Object[0]);
            this.f30237e = 2;
            return;
        }
        C6083g.f30227a.m28054a("unexpected onVideoStarted() when not LOADING (state: %d)", Integer.valueOf(this.f30237e));
    }

    public final void cC_() {
        if (this.f30237e <= 0 || this.f30237e > 5) {
            C6083g.f30227a.m28054a("unexpected onVideoEnded() when state not between LOADING and PAUSED (state: %d)", Integer.valueOf(this.f30237e));
            return;
        }
        C6083g.f30227a.m28054a("videoEnded", new Object[0]);
        this.f30237e = 6;
        if (this.f30236d != null && !TextUtils.isEmpty(this.f30235c)) {
            this.f30236d.mo5316a(this.f30235c);
        }
    }

    public final void m28041a(f fVar) {
        C6083g.f30227a.m28054a("error %s", fVar);
        this.f30235c = null;
        this.f30237e = 0;
        if (fVar == f.l) {
            m28033Y();
        }
    }

    public final void cD_() {
        C6083g.f30227a.m28054a("playing", new Object[0]);
        this.f30237e = 3;
    }

    public final void cE_() {
        if (this.f30237e == 3 || this.f30237e == 4) {
            C6083g.f30227a.m28054a("paused", new Object[0]);
            this.f30237e = 5;
            return;
        }
        C6083g.f30227a.m28054a("unexpected onPaused() when not playing (state: %d)", Integer.valueOf(this.f30237e));
    }

    public final void cF_() {
        if (this.f30237e == 3 || this.f30237e == 4 || this.f30237e == 5) {
            C6083g.f30227a.m28054a("stopped", new Object[0]);
            this.f30237e = 6;
            return;
        }
        C6083g.f30227a.m28054a("swallowed onStopped() for IDLE/LOADING/STOPPED states", new Object[0]);
    }

    public final void m28044a(boolean z) {
        if (z) {
            switch (this.f30237e) {
                case 1:
                case 2:
                case 5:
                    C6083g.f30227a.m28054a("swallowed onBuffering(true) when loading, video_started or paused", new Object[0]);
                    return;
                case 3:
                    C6083g.f30227a.m28054a("buffering", new Object[0]);
                    this.f30237e = 4;
                    return;
                default:
                    C6083g.f30227a.m28054a("unexpected onBuffering(true) when not loading/playing/paused (state: %d)", Integer.valueOf(this.f30237e));
                    return;
            }
        }
        if (this.f746R instanceof ViewGroup) {
            m28034a((ViewGroup) this.f746R);
        }
        switch (this.f30237e) {
            case 0:
            case 1:
            case 5:
                C6083g.f30227a.m28054a("swallowed onBuffering(false) when paused", new Object[0]);
                return;
            case 2:
            case 3:
            case 4:
                C6083g.f30227a.m28054a("notBuffering", new Object[0]);
                this.f30237e = 3;
                return;
            default:
                C6083g.f30227a.m28054a("unexpected onBuffering(true) when stopped or unknown state (state: %d)", Integer.valueOf(this.f30237e));
                return;
        }
    }

    private final void m28034a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if ((childAt instanceof ProgressBar) && ((ProgressBar) childAt).isIndeterminate()) {
                    childAt.setVisibility(8);
                }
                if (childAt instanceof ViewGroup) {
                    m28034a((ViewGroup) childAt);
                }
            }
        }
    }

    public final void m28038a(int i) {
        C6083g.f30227a.m28054a("seekTo %s", Integer.valueOf(i));
    }

    public final void m28046b(boolean z) {
        this.f30238f = z;
    }
}
