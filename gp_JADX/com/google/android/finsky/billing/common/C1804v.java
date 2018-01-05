package com.google.android.finsky.billing.common;

import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2227g;
import com.google.android.finsky.by.C2229h;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.lt;
import com.google.android.finsky.dfemodel.Document;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class C1804v {
    public C2227g f9352a;
    public final C2233o f9353b;

    public C1804v(C2233o c2233o) {
        this.f9353b = c2233o;
    }

    public static boolean m9803a(C2197a c2197a) {
        for (C2227g c2227g : c2197a.mo2793g(C2229h.f11125f)) {
            if (c2227g.f11105l == 29) {
                return true;
            }
        }
        return false;
    }

    public static Collection m9805b(C2197a c2197a) {
        Collection collection = null;
        for (C2227g c2227g : c2197a.mo2793g(C2229h.f11125f)) {
            if (c2227g.f11105l == 29) {
                if (collection == null) {
                    collection = new ArrayList();
                }
                collection.add(c2227g.f11104k);
            }
        }
        return collection == null ? Collections.emptySet() : collection;
    }

    public final boolean m9806a(Document document, C2197a c2197a) {
        boolean z;
        if (document.m14614C()) {
            for (lt ltVar : document.m14615D()) {
                if (m9804a(ltVar.f13059b.f12097d, (C2196e) c2197a)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z || this.f9353b.m11647a(document, (C2196e) c2197a)) {
            return false;
        }
        return true;
    }

    public final boolean m9807a(Document document, C2197a c2197a, int i) {
        boolean z;
        if (document.m14614C()) {
            loop0:
            for (lt ltVar : document.m14615D()) {
                if (m9804a(ltVar.f13059b.f12097d, (C2196e) c2197a)) {
                    for (bl blVar : ltVar.f13060c) {
                        if (blVar.f11926p == i) {
                            z = true;
                            break loop0;
                        }
                    }
                    continue;
                }
            }
        }
        z = false;
        if (!z || this.f9353b.m11648a(document, (C2196e) c2197a, i)) {
            return false;
        }
        return true;
    }

    private final synchronized boolean m9804a(String str, C2196e c2196e) {
        if (this.f9352a == null) {
            this.f9352a = new C2227g(C2227g.f11100g, C2229h.f11125f, 10, str, 29, 1);
        } else {
            this.f9352a.f11104k = str;
        }
        return c2196e.mo2782a(this.f9352a);
    }
}
