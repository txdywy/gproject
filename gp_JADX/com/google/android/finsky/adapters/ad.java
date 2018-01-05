package com.google.android.finsky.adapters;

import android.content.Context;
import com.google.android.finsky.dfemodel.C2711x;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.ee.C1016f;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.play.image.C1294w;
import java.util.HashSet;
import java.util.Set;

public final class ad extends CardRecyclerViewAdapter implements C1016f {
    public Set f7151E = new HashSet();

    public ad(Context context, C3748a c3748a, C1294w c1294w, C4808a c4808a, C2730u c2730u, com.google.android.finsky.p111d.ad adVar, boolean z, C2495w c2495w) {
        super(context, c3748a, c1294w, c4808a, c2730u, z, adVar, c2495w);
    }

    public final void m_() {
        this.f7151E.clear();
        super.m_();
    }

    public final void mo1217a(String str, boolean z, boolean z2) {
        if (!z2) {
            if (z) {
                this.f7151E.remove(str);
            } else {
                this.f7151E.add(str);
            }
            this.f3433a.m3638b();
        } else if (!z) {
            this.f7151E.remove(str);
            C2711x c2711x = this.H.f14950a;
            for (int i = 0; i < c2711x.m14698m(); i++) {
                if (str.equals(((Document) c2711x.m14679a(i, true)).f14885a.f12096c)) {
                    c2711x.m14695e(i);
                    break;
                }
            }
            mo1449a(c2711x);
        }
    }

    protected final boolean mo1476a(Document document) {
        return this.f7151E.contains(document.f14885a.f12096c);
    }
}
