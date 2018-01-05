package com.google.android.finsky.stream.myapps;

import android.content.Context;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.cv.p177a.C2427b;
import com.google.android.finsky.cv.p177a.C2450w;
import com.google.android.finsky.cv.p177a.cm;
import com.google.android.finsky.cv.p177a.ls;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p229o.C3827b;
import com.google.android.finsky.stream.base.C1169s;
import com.google.android.finsky.stream.base.C4278u;
import com.google.android.finsky.stream.myapps.view.C4542a;
import java.util.ArrayList;

public final class C4539f {
    public final ab f23231a;
    public final C0988c f23232b;
    public final C4536c f23233c;
    public final C3748a f23234d;
    public final C3827b f23235e;
    public final Context f23236f;
    public final C2495w f23237g;
    public final C4549n f23238h;
    public final String f23239i;
    public final cm f23240j;
    public C4278u f23241k;

    C4539f(Context context, C3748a c3748a, ab abVar, C0988c c0988c, C4536c c4536c, C3827b c3827b, C4550p c4550p, C2495w c2495w, C1169s c1169s, String str, C2450w c2450w) {
        this.f23236f = context;
        this.f23234d = c3748a;
        this.f23231a = abVar;
        this.f23232b = c0988c;
        this.f23233c = c4536c;
        this.f23235e = c3827b;
        ls lsVar = c2450w.f13215b;
        C4540o c4541g = new C4541g(this, c1169s);
        ArrayList arrayList = new ArrayList();
        if (lsVar != null) {
            if (lsVar.f13054a != null) {
                arrayList.add(new C4551q(lsVar.f13054a, c4550p.f23265d, c4550p.f23266e));
            }
            if (lsVar.f13055b != null) {
                arrayList.add(new ac(lsVar.f13055b, c4550p.f23267f));
            }
            if (lsVar.f13057d != null) {
                arrayList.add(new C4534a(lsVar.f13057d, c4550p.f23262a.getPackageManager(), c4550p.f23268g));
            }
            if (lsVar.f13056c != null) {
                arrayList.add(new C4535b(lsVar.f13056c, c4550p.f23262a, c2495w, c4550p.f23264c));
            }
        }
        this.f23238h = new C4549n(c4541g, arrayList, c4550p.f23263b, str);
        this.f23237g = c2495w;
        this.f23239i = str;
        this.f23240j = c2450w.f13216c;
    }

    public final C4542a m21155a(C2427b c2427b, int i) {
        if (c2427b == null) {
            return null;
        }
        return new C4543h(this, i, c2427b);
    }

    public final C4542a m21154a() {
        return new C4544i(this);
    }
}
