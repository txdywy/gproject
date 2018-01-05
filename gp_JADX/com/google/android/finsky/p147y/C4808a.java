package com.google.android.finsky.p147y;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.ratereview.C3974q;
import java.util.HashSet;
import java.util.Set;

@Deprecated
public final class C4808a {
    public final C3974q f25084a;
    public final ab f25085b;
    public Set f25086c = new HashSet();
    public Boolean f25087d;
    public boolean f25088e;

    public C4808a(C3974q c3974q, ab abVar) {
        this.f25084a = c3974q;
        this.f25085b = abVar;
    }

    public final boolean m22586a() {
        if (this.f25087d == null) {
            this.f25087d = Boolean.valueOf(this.f25085b.dn().f14881a.f31774q);
        }
        return this.f25087d.booleanValue();
    }

    public final boolean m22588a(String str) {
        return this.f25086c.contains(str);
    }

    public final void m22589b(String str) {
        this.f25086c.add(str);
    }

    public final boolean m22587a(Document document, boolean z) {
        cv cvVar = document.f14885a;
        int intValue = z ? ((Integer) C0955b.dO.m28964b()).intValue() : 0;
        for (cv cvVar2 : cvVar.f12110q) {
            if (!(cvVar2 == null || m22588a(cvVar2.f12096c))) {
                iu a = this.f25084a.m18689a(cvVar2.f12096c, null, false);
                if (a == null) {
                    return false;
                }
                if (z && a.f12717e >= intValue) {
                    return false;
                }
            }
        }
        return true;
    }
}
