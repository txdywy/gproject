package com.google.android.finsky.bn;

import android.content.Intent;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.a.a;
import com.google.android.finsky.installer.b.a.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.b.a;

public final class com.google.android.finsky.bn.c
{

    public static final String[] N;
    public long A;
    public long B;
    public String C;
    public long D;
    public com.google.android.finsky.d.a.a E;
    public com.google.android.finsky.d.a.a F;
    public long G;
    public String H;
    public int I;
    public Intent J;
    public int K;
    public String[] L;
    public com.google.android.finsky.installer.b.a.d M;
    public final String a;
    public int b;
    public int c;
    public int d;
    public com.google.wireless.android.finsky.b.a e;
    public long f;
    public int g;
    public String h;
    public String i;
    public long j;
    public String k;
    public String l;
    public int m;
    public String n;
    public long o;
    public String p;
    public long q;
    public int r;
    public int s;
    public String t;
    public String[] u;
    public String v;
    public String w;
    public byte[] x;
    public long y;
    public com.google.android.finsky.cv.a.n z;

    static {
        com.google.android.finsky.bn.c.N = new String[0];
    }

    c(String p0) {
        this.b = 1;
        this.c = -1;
        this.d = -1;
        this.H = "unknown";
        this.I = 0;
        this.K = 1;
        this.a = p0;
    }

    c(String p0, int p1, int p2, int p3, int p4, com.google.wireless.android.finsky.b.a p5, long p6, int p8, String p9, long p10, String p12, String p13, String p14, String p15, int p16, long p17, String p19, long p20, int p22, int p23, String p24, String[] p25, String p26, String p27, byte[] p28, long p29, com.google.android.finsky.cv.a.n p31, long p32, long p34, String p36, long p37, com.google.android.finsky.d.a.a p39, com.google.android.finsky.d.a.a p40, long p41, int p43, Intent p44, String p45, String[] p46, com.google.android.finsky.installer.b.a.d p47) {
        this.b = 1;
        this.c = -1;
        this.d = -1;
        this.H = "unknown";
        this.I = 0;
        this.K = 1;
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.K = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p8;
        this.h = p9;
        this.j = p10;
        this.k = p12;
        this.n = p13;
        this.i = p14;
        this.l = p15;
        this.m = p16;
        this.o = p17;
        this.p = p19;
        this.q = p20;
        this.r = p22;
        this.s = p23;
        this.t = p24;
        this.u = p25;
        this.v = p26;
        this.w = p27;
        this.x = p28;
        this.y = p29;
        this.z = p31;
        this.A = p32;
        this.B = p34;
        this.C = p36;
        this.D = p37;
        this.E = p39;
        this.F = p40;
        this.G = p41;
        this.I = p43;
        this.J = p44;
        this.H = p45;
        this.L = p46;
        this.M = p47;
    }

    public final String[] a() {
        if (this.u == 0)
            v0 = com.google.android.finsky.bn.c.N;
        else
            v0 = this.u;
        return v0;
    }

    public final int b() {
        if (this.m & 16384)
            v0 = 1;
        else if (this.m & 32768)
            v0 = 2;
        else
            v0 = 3;
        return v0;
    }

    public final com.google.android.finsky.d.a.a c() {
        if (this.E != 0)
            v0 = this.E;
        else
            v0 = new com.google.android.finsky.d.a.a();
        return v0;
    }

    public final com.google.android.finsky.d.a.a d() {
        if (this.F != 0)
            v0 = this.F;
        else
            v0 = new com.google.android.finsky.d.a.a();
        return v0;
    }

    public final String toString() {
        v0 = 1;
        v3 = new Object[10];
        v3[0] = this.a;
        v3[1] = Integer.valueOf(this.b);
        v3[2] = Integer.valueOf(this.c);
        if (this.e == 0)
            v0 = 0;
        v3[3] = Boolean.valueOf(v0);
        v3[4] = Integer.valueOf(this.g);
        v3[5] = this.h;
        v3[6] = Long.valueOf(this.j);
        v3[7] = this.k;
        v3[8] = this.n;
        v3[9] = FinskyLog.a(this.i);
        return String.format("(packageName=%s,autoUpdate=%d,desiredVersion=%d,hasDeliveryData=%b,installerState=%d,downloadUri=%s,firstDownloadMs=%d,externalReferrer=%s,continueUrl=%s,account=%s)", v3);
    }

}
