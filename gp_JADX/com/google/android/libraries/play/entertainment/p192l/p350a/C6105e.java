package com.google.android.libraries.play.entertainment.p192l.p350a;

import com.google.android.libraries.play.entertainment.p192l.C6099d;
import com.google.android.libraries.play.entertainment.p344d.C6038t;
import com.google.android.libraries.play.entertainment.p344d.C6054d;
import com.google.android.libraries.play.entertainment.p344d.C6061h;
import com.google.android.libraries.play.entertainment.p351m.C6117c;
import com.google.android.libraries.play.entertainment.p351m.C6118d;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.a;
import java.io.Closeable;

final class C6105e implements C6038t {
    public final Class f30270a;
    public final /* synthetic */ C6104d f30271b;

    C6105e(C6104d c6104d, Class cls) {
        this.f30271b = c6104d;
        this.f30270a = cls;
    }

    public final C6061h mo5264a(C6061h c6061h, C6054d c6054d) {
        if (!c6061h.m27974a()) {
            return c6061h.m27977d();
        }
        C0757i c0757i;
        C6099d c6099d = (C6099d) c6061h.m27975b();
        if (c6099d instanceof C6100a) {
            c0757i = ((C6100a) c6099d).f30257b;
            if (c0757i.getClass() == this.f30270a) {
                C0757i c0757i2 = (C0757i) this.f30270a.cast(c0757i);
                C6104d.f30264a.m28054a("ProtoXform to %1$s: using direct result", this.f30270a.getSimpleName());
                return C6061h.m27972a(new C6107g(c0757i2, c0757i2.m4915n()));
            }
        }
        try {
            c0757i = (C0757i) this.f30270a.newInstance();
            try {
                a a = C6105e.m28079a(c6099d);
                if (a == null) {
                    return C6061h.f30191b;
                }
                c0757i.mo1131a(a);
                C6104d.f30264a.m28054a("ProtoXform to %1$s: parsed from blob", this.f30270a.getSimpleName());
                return C6061h.m27972a(new C6107g(c0757i, (int) c6099d.mo5291a()));
            } catch (Throwable e) {
                this.f30271b.f30265b.mo3215a(c6099d.f30256a);
                C6104d.f30264a.m28058b(e, "ProtoXform to %1$s failed", this.f30270a.getSimpleName());
                return C6061h.m27973a(e);
            }
        } catch (Throwable e2) {
            C6104d.f30264a.m28058b(e2, "ProtoXform to %1$s failed", this.f30270a.getSimpleName());
            return C6061h.m27973a(e2);
        }
    }

    private static a m28079a(C6099d c6099d) {
        Closeable b = c6099d.mo5292b();
        try {
            C6117c c6117c = (C6117c) b;
            a a = a.a(c6117c.m28108a(), c6117c.f30289a, c6117c.f30290b);
            return a;
        } finally {
            C6118d.m28110a(b);
        }
    }
}
