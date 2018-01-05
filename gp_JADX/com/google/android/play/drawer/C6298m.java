package com.google.android.play.drawer;

public final class C6298m {
    public final String f31476a;
    public final String f31477b;
    public final int f31478c;
    public final int f31479d;
    public final boolean f31480e;
    public final boolean f31481f;
    public final Runnable f31482g;
    public final boolean f31483h;
    public final boolean f31484i;
    public final int f31485j;
    public final int f31486k;
    public final int f31487l;
    public final C3692j f31488m;
    public final C3692j f31489n;

    public C6298m() {
        this.f31476a = null;
        this.f31477b = null;
        this.f31486k = -1;
        this.f31487l = -1;
        this.f31478c = -1;
        this.f31479d = -1;
        this.f31480e = false;
        this.f31481f = false;
        this.f31482g = null;
        this.f31483h = true;
        this.f31484i = false;
        this.f31485j = 0;
        this.f31488m = null;
        this.f31489n = null;
    }

    public C6298m(String str, C3692j c3692j, int i, boolean z, Runnable runnable) {
        this(str, c3692j, i, z, runnable, (byte) 0);
    }

    public C6298m(String str, C3692j c3692j, int i, boolean z, Runnable runnable, byte b) {
        this(str, c3692j, null, i, z, false, 0, runnable, null);
    }

    public C6298m(String str, C3692j c3692j, C3692j c3692j2, int i, boolean z, boolean z2, Runnable runnable) {
        this(str, c3692j, c3692j2, i, z, z2, 0, runnable, null);
    }

    public C6298m(String str, C3692j c3692j, C3692j c3692j2, int i, boolean z, boolean z2, int i2, Runnable runnable, String str2) {
        this.f31476a = str;
        this.f31479d = i;
        this.f31478c = -1;
        this.f31480e = z;
        this.f31481f = false;
        this.f31482g = runnable;
        this.f31486k = 0;
        this.f31487l = 0;
        this.f31483h = false;
        this.f31484i = z2;
        this.f31485j = i2;
        this.f31477b = str2;
        this.f31488m = c3692j;
        this.f31489n = c3692j2;
    }
}
