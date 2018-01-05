package com.google.android.finsky.dfemodel;

import android.text.TextUtils;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.utils.FinskyLog;
import java.util.HashMap;
import java.util.Map;

public final class C2730u {
    public C2712a f14950a;
    public final Map f14951b;

    C2730u(C2712a c2712a) {
        this(c2712a, new HashMap());
    }

    private C2730u(C2712a c2712a, Map map) {
        this.f14950a = c2712a;
        this.f14951b = map;
    }

    public final Document m14765a(int i) {
        return (Document) this.f14950a.m14679a(i, true);
    }

    public final C2720j m14766a(String str) {
        Document document;
        int i = 0;
        for (int i2 = 0; i2 < this.f14950a.m14698m(); i2++) {
            Document document2 = (Document) this.f14950a.m14679a(i2, false);
            if (document2 != null && TextUtils.equals(str, document2.f14885a.f12096c)) {
                document = document2;
                break;
            }
        }
        document = null;
        C2720j c2720j = (C2720j) this.f14951b.get(str);
        if (c2720j == null) {
            if (document == null) {
                FinskyLog.m21669e("Trying to create secondary level list for null cluster doc", new Object[0]);
                c2720j = null;
            } else {
                boolean z;
                C1254c c1254c = this.f14950a.f14909b;
                if (!TextUtils.isEmpty(document.m14652g())) {
                    z = true;
                }
                c2720j = new C2720j(c1254c, document, z);
            }
            if (c2720j != null) {
                this.f14951b.put(str, c2720j);
            }
        } else if (document != null) {
            Document[] b = document.m14643b();
            if (b != null) {
                int min = Math.min(b.length, c2720j.o.size());
                while (i < min) {
                    c2720j.o.set(i, b[i]);
                    i++;
                }
            }
        }
        return c2720j;
    }

    public final void m14767a(C1254c c1254c) {
        if (this.f14950a != null) {
            this.f14950a.f14909b = c1254c;
        }
        for (C2720j c2720j : this.f14951b.values()) {
            if (c2720j != null) {
                c2720j.f14909b = c1254c;
            }
        }
    }
}
