package com.google.vr.p479a.p480a.p481a;

import android.graphics.Bitmap;
import com.google.vr.p479a.p480a.C7233a;
import com.google.vr.p479a.p480a.C7243f;
import com.google.vr.p479a.p480a.C7245h;
import com.google.vr.p479a.p480a.C7250m;

public class C7234b extends C7233a {
    public final C7243f f35517a;

    public C7234b(C7243f c7243f) {
        this.f35517a = c7243f;
    }

    public final long mo6304b() {
        try {
            return this.f35517a.mo6311a();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void m33825a(Bitmap bitmap) {
        try {
            this.f35517a.mo6313a(C7250m.m33871a((Object) bitmap));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final long m33829c() {
        try {
            return this.f35517a.mo6316b();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private final C7235c m33824d(String str) {
        try {
            C7245h b = this.f35517a.mo6317b(str);
            m33829c();
            return new C7235c(b);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    protected final /* synthetic */ void mo6303a(Object obj, String str, Object obj2, String str2) {
        C7235c c7235c = (C7235c) obj;
        if (obj2 != null) {
            Class cls = obj2.getClass();
            try {
                if (String.class == cls) {
                    c7235c.f35518a.mo6324a(str, (String) obj2, str2);
                } else if (Integer.class == cls) {
                    c7235c.f35518a.mo6321a(str, ((Integer) obj2).intValue(), str2);
                } else if (Long.class == cls) {
                    c7235c.f35518a.mo6322a(str, ((Long) obj2).longValue(), str2);
                } else if (Float.class == cls) {
                    c7235c.f35518a.mo6320a(str, ((Float) obj2).floatValue(), str2);
                } else if (Double.class == cls) {
                    c7235c.f35518a.mo6319a(str, ((Double) obj2).doubleValue(), str2);
                } else if (Boolean.class == cls) {
                    c7235c.f35518a.mo6325a(str, ((Boolean) obj2).booleanValue(), str2);
                } else {
                    c7235c.f35518a.mo6323a(str, C7250m.m33871a(obj2), str2);
                }
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    protected final /* synthetic */ Object mo6306c(String str) {
        return m33824d(str);
    }

    protected final /* synthetic */ void mo6305b(Object obj) {
        try {
            this.f35517a.mo6312a(((C7235c) obj).f35518a);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
