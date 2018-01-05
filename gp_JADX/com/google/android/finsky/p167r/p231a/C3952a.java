package com.google.android.finsky.p167r.p231a;

import android.content.Context;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bs.C2177a;
import com.google.android.finsky.bz.C2235a;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.p167r.C3951d;
import com.google.android.finsky.p167r.C3960a;
import com.google.android.finsky.tos.C4569e;
import java.util.ArrayList;
import java.util.List;
import p002a.C0002a;

public final class C3952a implements C3951d {
    public final C1461c f19950a;
    public final C4569e f19951b;
    public final C1500a f19952c;
    public final Context f19953d;
    public final C0988c f19954e;
    public final C0002a f19955f;
    public final C3960a f19956g;
    public final C2320a f19957h;
    public final C3654j f19958i;

    public C3952a(C1461c c1461c, C4569e c4569e, C1500a c1500a, Context context, C0988c c0988c, C0002a c0002a, C3960a c3960a, C2320a c2320a, C3654j c3654j) {
        this.f19950a = c1461c;
        this.f19951b = c4569e;
        this.f19952c = c1500a;
        this.f19953d = context;
        this.f19954e = c0988c;
        this.f19955f = c0002a;
        this.f19956g = c3960a;
        this.f19957h = c2320a;
        this.f19958i = c3654j;
    }

    public final List mo3873a() {
        List arrayList = new ArrayList();
        arrayList.add(new C3953b(this.f19950a, this.f19956g));
        arrayList.add(new C3957f(this.f19950a, this.f19951b));
        arrayList.add(new C3955d(this.f19956g, this.f19953d, this.f19950a));
        arrayList.add(new C2177a(this.f19950a, this.f19956g));
        arrayList.add(new C3956e(this.f19950a));
        arrayList.add(new C2235a(this.f19952c));
        if (this.f19950a.dj().mo2294a(12631511) && C1503a.m8831b(this.f19953d)) {
            arrayList.add(new C3954c(this.f19953d, this.f19950a));
        }
        arrayList.add(new C3959h(this.f19950a, this.f19954e, this.f19955f, this.f19957h, this.f19958i));
        return arrayList;
    }
}
