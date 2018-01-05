package com.google.android.libraries.play.entertainment.p344d;

import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.p351m.C6119e;
import java.util.concurrent.atomic.AtomicBoolean;

public final class C6061h {
    public static final C6090b f30190a = C6090b.m28050a();
    public static final C6061h f30191b = new C6061h(null, null);
    public final Object f30192c;
    public final Throwable f30193d;
    public final AtomicBoolean f30194e = new AtomicBoolean(false);

    private C6061h(Object obj, Throwable th) {
        this.f30192c = obj;
        this.f30193d = th;
    }

    public static C6061h m27972a(Object obj) {
        return new C6061h(C6116b.m28100a(obj), null);
    }

    public static C6061h m27973a(Throwable th) {
        return new C6061h(null, (Throwable) C6116b.m28100a((Object) th));
    }

    public final boolean m27974a() {
        return this.f30192c != null;
    }

    public final Object m27975b() {
        C6116b.m28104a(this.f30192c != null, "Not a success");
        return this.f30192c;
    }

    public final Throwable m27976c() {
        C6116b.m28104a(this.f30193d != null, "Not a failure");
        return this.f30193d;
    }

    public final C6061h m27977d() {
        C6116b.m28104a(!m27974a(), "Not an unsuccessful outcome");
        return this;
    }

    final void m27978e() {
        if (!this.f30194e.compareAndSet(false, true)) {
            f30190a.m28055a(null, "Already disposed", new Object[0]);
        } else if (this.f30192c != null && (this.f30192c instanceof C6033a)) {
            ((C6033a) this.f30192c).mo5263a();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6061h)) {
            return false;
        }
        C6061h c6061h = (C6061h) obj;
        if (C6119e.m28112a(this.f30193d, c6061h.f30193d) && C6119e.m28112a(this.f30192c, c6061h.f30192c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((C6119e.m28111a(this.f30192c) + 133) * 19) + C6119e.m28111a(this.f30193d);
    }
}
