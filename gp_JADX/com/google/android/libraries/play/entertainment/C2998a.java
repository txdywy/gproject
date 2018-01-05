package com.google.android.libraries.play.entertainment;

import android.content.Context;
import com.google.android.libraries.play.entertainment.bitmap.BitmapStore;
import com.google.android.libraries.play.entertainment.bitmap.C2986a;
import com.google.android.libraries.play.entertainment.media.C3000i;
import com.google.android.libraries.play.entertainment.media.C6077c;
import com.google.android.libraries.play.entertainment.p191c.C2993b;
import com.google.android.libraries.play.entertainment.p192l.C2983e;
import com.google.android.libraries.play.entertainment.p192l.C2989f;
import com.google.android.libraries.play.entertainment.p192l.p350a.C6104d;
import com.google.android.libraries.play.entertainment.p194a.C3002b;
import com.google.android.libraries.play.entertainment.p195e.C3004a;
import com.google.android.libraries.play.entertainment.p196j.C3006a;
import com.google.android.libraries.play.entertainment.p344d.C6053b;
import com.google.android.libraries.play.entertainment.p346h.C6080a;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p349k.C6096a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;

public abstract class C2998a {
    public static final Object f15684p = new Object();
    public static volatile C2998a f15685q;
    public boolean f15686A;
    public C6096a f15687B;
    public boolean f15688C;
    public BitmapStore f15689D;
    public boolean f15690E;
    public C2986a f15691F;
    public boolean f15692G;
    public C2993b f15693H;
    public boolean f15694I;
    public C6053b f15695J;
    public boolean f15696K;
    public C3006a f15697L;
    public boolean f15698M;
    public C3000i f15699N;
    public boolean f15700O;
    public C6077c f15701P;
    public boolean f15702Q;
    public C3004a f15703R;
    public boolean f15704S;
    public final Context f15705r;
    public final Object f15706s = new Object();
    public C3002b f15707t;
    public boolean f15708u;
    public C2983e f15709v;
    public boolean f15710w;
    public C2989f f15711x;
    public boolean f15712y;
    public C6104d f15713z;

    public static C2998a m15496l() {
        C2998a c2998a = f15685q;
        if (c2998a != null) {
            return c2998a;
        }
        throw new IllegalStateException("PEGlobals hasn't been set!");
    }

    public abstract C6080a mo3242a();

    public abstract C6053b mo3243b();

    public abstract C3000i mo3244c();

    public abstract C6077c mo3245d();

    public abstract C3002b mo3246e();

    public abstract C2986a mo3247f();

    public abstract C2983e mo3248g();

    public abstract C2989f mo3249h();

    public abstract C2993b mo3250i();

    public abstract C3006a mo3251j();

    public static void m15495a(C2998a c2998a) {
        C6080a a;
        C6116b.m28100a((Object) c2998a);
        synchronized (f15684p) {
            C6116b.m28104a(f15685q == null, "A root PEGlobals instance already exists.");
            f15685q = c2998a;
        }
        synchronized (c2998a.f15706s) {
            a = c2998a.mo3242a();
        }
        C6090b.m28052a(a);
    }

    public C2998a(Context context) {
        this.f15705r = context.getApplicationContext();
    }

    public final C3002b m15510m() {
        C3002b c3002b;
        boolean z = true;
        synchronized (this.f15706s) {
            if (this.f15707t == null) {
                if (this.f15708u) {
                    z = false;
                }
                C6116b.m28104a(z, "Cyclic dependency involving accountProvider");
                this.f15708u = true;
                this.f15707t = mo3246e();
                this.f15708u = false;
            }
            c3002b = this.f15707t;
        }
        return c3002b;
    }

    public final C2983e m15511n() {
        C2983e c2983e;
        boolean z = true;
        synchronized (this.f15706s) {
            if (this.f15709v == null) {
                if (this.f15710w) {
                    z = false;
                }
                C6116b.m28104a(z, "Cyclic dependency involving blobStore");
                this.f15710w = true;
                this.f15709v = mo3248g();
                this.f15710w = false;
            }
            c2983e = this.f15709v;
        }
        return c2983e;
    }

    public final C2989f m15512o() {
        C2989f c2989f;
        boolean z = true;
        synchronized (this.f15706s) {
            if (this.f15711x == null) {
                if (this.f15712y) {
                    z = false;
                }
                C6116b.m28104a(z, "Cyclic dependency involving blobUrlResolver");
                this.f15712y = true;
                this.f15711x = mo3249h();
                this.f15712y = false;
            }
            c2989f = this.f15711x;
        }
        return c2989f;
    }

    private final C6104d m15497x() {
        C6104d c6104d;
        boolean z = true;
        synchronized (this.f15706s) {
            if (this.f15713z == null) {
                if (this.f15686A) {
                    z = false;
                }
                C6116b.m28104a(z, "Cyclic dependency involving protoStore");
                this.f15686A = true;
                this.f15713z = new C6104d(m15511n(), m15516s().mo5274a());
                this.f15686A = false;
            }
            c6104d = this.f15713z;
        }
        return c6104d;
    }

    public final C6096a m15513p() {
        C6096a c6096a;
        boolean z = true;
        synchronized (this.f15706s) {
            if (this.f15687B == null) {
                if (this.f15688C) {
                    z = false;
                }
                C6116b.m28104a(z, "Cyclic dependency involving dataRepositories");
                this.f15688C = true;
                this.f15687B = new C6096a(m15497x());
                this.f15688C = false;
            }
            c6096a = this.f15687B;
        }
        return c6096a;
    }

    public final BitmapStore m15514q() {
        BitmapStore bitmapStore;
        boolean z = true;
        synchronized (this.f15706s) {
            if (this.f15689D == null) {
                if (this.f15690E) {
                    z = false;
                }
                C6116b.m28104a(z, "Cyclic dependency involving bitmapStore");
                this.f15690E = true;
                this.f15689D = new BitmapStore(m15511n(), m15498y(), m15516s().mo5274a(), m15516s().mo5275b());
                this.f15690E = false;
            }
            bitmapStore = this.f15689D;
        }
        return bitmapStore;
    }

    private final C2986a m15498y() {
        C2986a c2986a;
        boolean z = true;
        synchronized (this.f15706s) {
            if (this.f15691F == null) {
                if (this.f15692G) {
                    z = false;
                }
                C6116b.m28104a(z, "Cyclic dependency involving bitmapCache");
                this.f15692G = true;
                this.f15691F = mo3247f();
                this.f15692G = false;
            }
            c2986a = this.f15691F;
        }
        return c2986a;
    }

    public final C2993b m15515r() {
        C2993b c2993b;
        boolean z = true;
        synchronized (this.f15706s) {
            if (this.f15693H == null) {
                if (this.f15694I) {
                    z = false;
                }
                C6116b.m28104a(z, "Cyclic dependency involving eventLogger");
                this.f15694I = true;
                this.f15693H = mo3250i();
                this.f15694I = false;
            }
            c2993b = this.f15693H;
        }
        return c2993b;
    }

    public final C6053b m15516s() {
        C6053b c6053b;
        boolean z = true;
        synchronized (this.f15706s) {
            if (this.f15695J == null) {
                if (this.f15696K) {
                    z = false;
                }
                C6116b.m28104a(z, "Cyclic dependency involving executors");
                this.f15696K = true;
                this.f15695J = mo3243b();
                this.f15696K = false;
            }
            c6053b = this.f15695J;
        }
        return c6053b;
    }

    public final C3006a m15517t() {
        C3006a c3006a;
        boolean z = true;
        synchronized (this.f15706s) {
            if (this.f15697L == null) {
                if (this.f15698M) {
                    z = false;
                }
                C6116b.m28104a(z, "Cyclic dependency involving playStore");
                this.f15698M = true;
                this.f15697L = mo3251j();
                this.f15698M = false;
            }
            c3006a = this.f15697L;
        }
        return c3006a;
    }

    public final C3000i m15518u() {
        C3000i c3000i;
        boolean z = true;
        synchronized (this.f15706s) {
            if (this.f15699N == null) {
                if (this.f15700O) {
                    z = false;
                }
                C6116b.m28104a(z, "Cyclic dependency involving ytVideoPlayerFactory");
                this.f15700O = true;
                this.f15699N = mo3244c();
                this.f15700O = false;
            }
            c3000i = this.f15699N;
        }
        return c3000i;
    }

    public final C6077c m15519v() {
        C6077c c6077c;
        boolean z = true;
        synchronized (this.f15706s) {
            if (this.f15701P == null) {
                if (this.f15702Q) {
                    z = false;
                }
                C6116b.m28104a(z, "Cyclic dependency involving musicPlayerFactory");
                this.f15702Q = true;
                this.f15701P = mo3245d();
                this.f15702Q = false;
            }
            c6077c = this.f15701P;
        }
        return c6077c;
    }

    public final C3004a m15520w() {
        C3004a c3004a;
        boolean z = true;
        synchronized (this.f15706s) {
            if (this.f15703R == null) {
                if (this.f15704S) {
                    z = false;
                }
                C6116b.m28104a(z, "Cyclic dependency involving config");
                this.f15704S = true;
                this.f15703R = mo3252k();
                this.f15704S = false;
            }
            c3004a = this.f15703R;
        }
        return c3004a;
    }

    public C3004a mo3252k() {
        return new C3004a();
    }
}
