package io.reactivex;

import io.reactivex.exceptions.C7788d;
import io.reactivex.internal.p557b.C7811n;
import io.reactivex.p553c.C7767b;
import io.reactivex.p554d.C7773a;

public abstract class C7772c implements C7771f {
    public abstract void mo6558b(C7789g c7789g);

    public final void mo6535a(C7789g c7789g) {
        C7811n.m37615a((Object) c7789g, "observer is null");
        try {
            Object obj;
            C7767b c7767b = C7773a.f40295l;
            if (c7767b != null) {
                obj = (C7789g) C7773a.m37564a(c7767b);
            } else {
                C7789g c7789g2 = c7789g;
            }
            C7811n.m37615a(obj, "Plugin returned null Observer");
            mo6558b(obj);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C7788d.m37579a(th);
            C7773a.m37567a(th);
            new NullPointerException("Actually not, but can't throw other exceptions due to RS").initCause(th);
        }
    }
}
