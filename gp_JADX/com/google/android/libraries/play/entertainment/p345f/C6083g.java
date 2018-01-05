package com.google.android.libraries.play.entertainment.p345f;

import android.support.v4.app.ab;
import com.google.android.libraries.play.entertainment.media.C6082f;
import com.google.android.libraries.play.entertainment.media.C6125h;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.youtube.player.k;

public final class C6083g implements C6082f {
    public static final C6090b f30227a = C6090b.m28050a();
    public final ab f30228b;
    public final int f30229c;
    public final C6125h f30230d;
    public C6086i f30231e;

    public C6083g(ab abVar, int i, C6125h c6125h) {
        this.f30228b = (ab) C6116b.m28100a((Object) abVar);
        this.f30229c = i;
        this.f30230d = (C6125h) C6116b.m28100a((Object) c6125h);
    }

    public final void mo5285a(String str) {
        if (this.f30231e == null) {
            this.f30231e = (C6086i) this.f30228b.mo281a(this.f30229c);
            if (this.f30231e != null) {
                f30227a.m28054a("Recovered YTFragment@%x", Integer.valueOf(this.f30231e.hashCode()));
            }
        }
        if (!(this.f30231e == null || str.equals(this.f30231e.f30235c))) {
            f30227a.m28054a("Not reusing old player for new video playback", new Object[0]);
            m28023e();
        }
        if (this.f30231e == null) {
            this.f30231e = new C6086i();
            this.f30228b.mo284a().mo331b(this.f30229c, this.f30231e).mo334c();
        }
        this.f30231e.f30236d = this.f30230d;
        f30227a.m28054a("Playing vid %s in YTFragment@%x", str, Integer.valueOf(this.f30231e.hashCode()));
        this.f30231e.m28045b(str);
    }

    public final void mo5283a() {
        if (this.f30231e != null) {
            m28023e();
        }
    }

    private final void m28023e() {
        C6116b.m28100a(this.f30231e);
        try {
            this.f30228b.mo284a().mo327a(this.f30231e).mo336d();
        } catch (IllegalStateException e) {
        }
        int hashCode = this.f30231e.hashCode();
        this.f30231e.f30236d = null;
        this.f30231e = null;
        f30227a.m28054a("YTFragment@%x rm'd", Integer.valueOf(hashCode));
    }

    public final float mo2655c() {
        return this.f30231e != null ? this.f30231e.m28035W() : 0.0f;
    }

    public final float mo2656d() {
        return 0.0f;
    }

    public final void mo5284a(int i) {
        if (this.f30231e != null) {
            C6086i c6086i = this.f30231e;
            if (c6086i.f30234b != null) {
                k kVar;
                switch (i) {
                    case 1:
                        kVar = k.b;
                        break;
                    case 2:
                        kVar = k.c;
                        break;
                    default:
                        kVar = k.a;
                        break;
                }
                try {
                    c6086i.f30234b.a(kVar);
                } catch (RuntimeException e) {
                    c6086i.m28042a(e);
                }
            }
        }
    }

    public final void mo5286a(boolean z) {
        if (this.f30231e != null) {
            C6086i c6086i = this.f30231e;
            if (!z) {
                c6086i.m28036X();
            }
            if (c6086i.f30234b != null) {
                try {
                    c6086i.f30234b.b(z ? 7 : 0);
                } catch (RuntimeException e) {
                    c6086i.m28042a(e);
                }
            }
        }
    }

    public final boolean mo5287b() {
        return this.f30231e != null && this.f30231e.m28036X();
    }
}
