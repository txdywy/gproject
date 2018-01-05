package com.google.android.finsky.notification.impl;

import android.content.Context;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.ak.C1215q;
import com.google.android.finsky.cd.C2263f;
import com.google.android.finsky.cd.C2265h;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.notification.C3779c;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.ba;
import com.google.wireless.android.a.a.a.a.bb;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.b;

public final class C3788c implements C3779c {
    public static int f19046a = 0;
    public Context f19047b;
    public aa f19048c;
    public C3792g f19049d;
    public C3798m f19050e;
    public C2471a f19051f;
    public b f19052g;
    public HashMap f19053h;
    public int f19054i = 0;
    public long f19055j = 43200000;
    public long f19056k = 86400000;
    public boolean f19057l = true;

    public C3788c(Context context, aa aaVar, C3792g c3792g, C3798m c3798m, C2471a c2471a) {
        this.f19047b = context;
        this.f19048c = aaVar;
        this.f19049d = c3792g;
        this.f19050e = c3798m;
        this.f19051f = c2471a;
    }

    public final void mo3764a(int i) {
        this.f19054i = i;
    }

    public final void mo3765a(long j) {
        this.f19055j = j;
    }

    public final void mo3768b(long j) {
        this.f19056k = j;
    }

    private static boolean m18127a(String str) {
        if (str.startsWith("arm")) {
            try {
                TensorFlowLite.version();
                return true;
            } catch (UnsatisfiedLinkError e) {
            } catch (Exception e2) {
            }
        }
        return false;
    }

    public static boolean m18128d() {
        if (f19046a == 0) {
            int i;
            if (C3788c.m18127a(ba.m21790a()[0])) {
                i = 1;
            } else {
                i = -1;
            }
            f19046a = i;
        }
        if (f19046a == 1) {
            return true;
        }
        return false;
    }

    final File m18138e() {
        return new File(this.f19047b.getDir("models", 0), "notification_delay.tflite");
    }

    final void m18131a(int i, C2263f c2263f, bb bbVar) {
        if (C1473m.f7980a.dj().mo2294a(12644827)) {
            C2495w a = this.f19051f.m13183a(c2263f.f11241e);
            bbVar.b = c2263f.f11243g;
            bbVar.a |= 1;
            long j = c2263f.f11242f;
            bbVar.a |= 2;
            bbVar.c = j;
            j = C4678i.m21812a() - c2263f.f11242f;
            bbVar.a |= 4;
            bbVar.d = j;
            C2474c c2474c = new C2474c(i);
            c2474c.f13342a.aI = bbVar;
            a.m13367a(c2474c);
            c2263f.f11241e = a.m13381c();
        }
    }

    public final boolean m18134a(String str, int i, List list, int i2, C2495w c2495w) {
        if ((this.f19054i == 0 && !C3788c.m18128d()) || !str.equals("updates")) {
            return false;
        }
        long a = C4678i.m21812a();
        Object c2263f = new C2263f();
        c2263f.f11238b |= 1;
        c2263f.f11239c = str;
        c2263f.f11243g = i;
        c2263f.f11238b |= 4;
        C2265h c2265h = new C2265h();
        c2265h.f11246b = new cv[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            c2265h.f11246b[i3] = ((Document) list.get(i3)).f14885a;
        }
        c2265h.m11713a(i2);
        c2263f.m11706a(c2265h);
        c2263f.f11238b |= 2;
        c2263f.f11242f = a;
        c2263f.f11241e = c2495w.m13381c();
        this.f19048c.f19011b.mo1524b(c2263f).mo4398a(new C3789d(this));
        return true;
    }

    public final void mo3766a(boolean z) {
        this.f19057l = z;
    }

    public final void mo3763a() {
        this.f19049d.m18144a();
    }

    public final int mo3767b() {
        try {
            return ((List) this.f19048c.m18077a().get()).size();
        } catch (ExecutionException e) {
            return -1;
        } catch (InterruptedException e2) {
            return -1;
        }
    }

    public final void mo3769c() {
        aa aaVar = this.f19048c;
        aaVar.f19011b.mo1523b(new C1215q());
    }
}
