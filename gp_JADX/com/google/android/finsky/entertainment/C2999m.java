package com.google.android.finsky.entertainment;

import android.content.Context;
import android.content.pm.PackageManager;
import com.android.volley.C0700r;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.ee.C2974a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.libraries.play.entertainment.C2998a;
import com.google.android.libraries.play.entertainment.bitmap.C2986a;
import com.google.android.libraries.play.entertainment.media.C3000i;
import com.google.android.libraries.play.entertainment.media.C6077c;
import com.google.android.libraries.play.entertainment.p191c.C2993b;
import com.google.android.libraries.play.entertainment.p192l.C2983e;
import com.google.android.libraries.play.entertainment.p192l.C2989f;
import com.google.android.libraries.play.entertainment.p194a.C3002b;
import com.google.android.libraries.play.entertainment.p195e.C3004a;
import com.google.android.libraries.play.entertainment.p196j.C3006a;
import com.google.android.libraries.play.entertainment.p344d.C6053b;
import com.google.android.libraries.play.entertainment.p345f.C6073a;
import com.google.android.libraries.play.entertainment.p345f.C6078d;
import com.google.android.libraries.play.entertainment.p345f.C6081f;
import com.google.android.libraries.play.entertainment.p346h.C6080a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.play.image.C1294w;
import p002a.C0002a;

public final class C2999m extends C2998a {
    public final C0002a f15714a;
    public final C0002a f15715b;
    public final C0002a f15716c;
    public final C0002a f15717d;
    public final C0002a f15718e;
    public final C0002a f15719f;
    public final C0002a f15720g;
    public final C0002a f15721h;
    public final C0002a f15722i;
    public final C0002a f15723j;
    public final C0002a f15724k;
    public final C0002a f15725l;
    public final C0002a f15726m;
    public final C0002a f15727n;
    public final C0002a f15728o;

    public C2999m(Context context, C0002a c0002a, C0002a c0002a2, C0002a c0002a3, C0002a c0002a4, C0002a c0002a5, C0002a c0002a6, C0002a c0002a7, C0002a c0002a8, C0002a c0002a9, C0002a c0002a10, C0002a c0002a11, C0002a c0002a12, C0002a c0002a13, C0002a c0002a14, C0002a c0002a15) {
        super(context);
        this.f15714a = c0002a;
        this.f15715b = c0002a2;
        this.f15716c = c0002a3;
        this.f15717d = c0002a4;
        this.f15718e = c0002a5;
        this.f15719f = c0002a6;
        this.f15720g = c0002a7;
        this.f15721h = c0002a8;
        this.f15722i = c0002a9;
        this.f15723j = c0002a10;
        this.f15724k = c0002a11;
        this.f15725l = c0002a12;
        this.f15726m = c0002a13;
        this.f15727n = c0002a14;
        this.f15728o = c0002a15;
    }

    protected final C6080a mo3242a() {
        return new C6081f();
    }

    protected final C6053b mo3243b() {
        return new C6073a();
    }

    protected final C3000i mo3244c() {
        return C3001n.f15729a;
    }

    protected final C6077c mo3245d() {
        return new C6078d(this.f15705r, m15511n(), m15516s().mo5274a());
    }

    protected final C3002b mo3246e() {
        return new C3003o((C0988c) C6116b.m28100a((C0988c) this.f15714a.mo1a()));
    }

    protected final C2986a mo3247f() {
        return new C2987d(((C1294w) C6116b.m28100a((C1294w) this.f15715b.mo1a())).mo1670a());
    }

    protected final C2983e mo3248g() {
        C2983e c2985c = new C2985c(m15512o(), (C0700r) C6116b.m28100a((C0700r) this.f15716c.mo1a()));
        C2989f o = m15512o();
        C6116b.m28100a((C0700r) this.f15717d.mo1a());
        return new C2988e(m15512o(), c2985c, new C2991g(o, (C1287h) C6116b.m28100a((C1287h) this.f15718e.mo1a())));
    }

    protected final C2989f mo3249h() {
        return new C2990f();
    }

    protected final C2993b mo3250i() {
        return new C2994i((C2471a) C6116b.m28100a((C2471a) this.f15720g.mo1a()));
    }

    protected final C3006a mo3251j() {
        return new C3007q((C2974a) C6116b.m28100a((C2974a) this.f15721h.mo1a()), (C0988c) C6116b.m28100a((C0988c) this.f15714a.mo1a()), (C2206c) C6116b.m28100a((C2206c) this.f15722i.mo1a()), (C2233o) C6116b.m28100a((C2233o) this.f15723j.mo1a()), (C2171b) C6116b.m28100a((C2171b) this.f15724k.mo1a()), (C1287h) C6116b.m28100a((C1287h) this.f15718e.mo1a()), (C2162a) C6116b.m28100a((C2162a) this.f15725l.mo1a()), (C3028c) C6116b.m28100a((C3028c) this.f15726m.mo1a()), (C2994i) m15515r(), m15520w(), (C3851f) C6116b.m28100a((C3851f) this.f15727n.mo1a()), (PackageManager) C6116b.m28100a((PackageManager) this.f15728o.mo1a()));
    }

    protected final C3004a mo3252k() {
        return new C3005p((C1461c) C6116b.m28100a((C1461c) this.f15719f.mo1a()));
    }
}
