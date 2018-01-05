package io.reactivex.internal.p563f;

import io.reactivex.internal.p556c.C7792c;
import java.util.concurrent.atomic.AtomicReference;

public final class C7830a implements C7792c {
    public final AtomicReference f40361a = new AtomicReference();
    public final AtomicReference f40362b = new AtomicReference();

    public C7830a() {
        C7831b c7831b = new C7831b();
        m37661b(c7831b);
        m37660a(c7831b);
    }

    public final boolean mo6537a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        C7831b c7831b = new C7831b(obj);
        m37660a(c7831b).lazySet(c7831b);
        return true;
    }

    public final Object mo6538b() {
        C7831b c7831b = (C7831b) this.f40362b.get();
        C7831b c7831b2 = (C7831b) c7831b.get();
        Object a;
        if (c7831b2 != null) {
            a = c7831b2.m37666a();
            m37661b(c7831b2);
            return a;
        } else if (c7831b == m37659a()) {
            return null;
        } else {
            do {
                c7831b2 = (C7831b) c7831b.get();
            } while (c7831b2 == null);
            a = c7831b2.m37666a();
            m37661b(c7831b2);
            return a;
        }
    }

    public final void mo6540d() {
        while (mo6538b() != null) {
            if (mo6539c()) {
                return;
            }
        }
    }

    private final C7831b m37659a() {
        return (C7831b) this.f40361a.get();
    }

    private final C7831b m37660a(C7831b c7831b) {
        return (C7831b) this.f40361a.getAndSet(c7831b);
    }

    private final void m37661b(C7831b c7831b) {
        this.f40362b.lazySet(c7831b);
    }

    public final boolean mo6539c() {
        return ((C7831b) this.f40362b.get()) == m37659a();
    }
}
