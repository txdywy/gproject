package org.keyczar;

import java.util.ArrayList;
import java.util.HashMap;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.p569a.C7980b;
import org.keyczar.p569a.C7981c;
import org.keyczar.p570b.C7985a;
import org.keyczar.p571c.C7988e;
import org.keyczar.p571c.C7989a;

abstract class C8007m {
    public static final byte[] f41037a = new byte[]{(byte) 0};
    public final C8005k f41038b;
    public C8006l f41039c;
    public final HashMap f41040d = new HashMap();
    public final HashMap f41041e = new HashMap();

    public C8007m(C7988e c7988e) {
        this.f41038b = C8005k.m38230a(c7988e.mo6659a());
        if (!mo6661a(this.f41038b.f41029b)) {
            throw new KeyczarException(C7985a.m38177a("Keyczar.UnacceptablePurpose", this.f41038b.f41029b));
        } else if (!this.f41038b.f41032e || (c7988e instanceof C7989a)) {
            for (C8006l c8006l : this.f41038b.f41031d) {
                if (c8006l.f41035b == C7981c.PRIMARY) {
                    if (this.f41039c != null) {
                        throw new KeyczarException(C7985a.m38177a("Keyczar.SinglePrimary", new Object[0]));
                    }
                    this.f41039c = c8006l;
                }
                C7983p a = this.f41038b.f41030c.mo6653b().mo6654a(c7988e.mo6660a(c8006l.f41036c));
                m38232a(a.mo6649a(), a);
                for (byte[] a2 : a.mo6655d()) {
                    m38232a(a2, a);
                }
                this.f41040d.put(c8006l, a);
            }
        } else {
            throw new KeyczarException(C7985a.m38177a("Keyczar.NeedEncryptedReader", new Object[0]));
        }
    }

    abstract boolean mo6661a(C7980b c7980b);

    private final void m38232a(byte[] bArr, C7983p c7983p) {
        C8008n c8008n = new C8008n(bArr);
        if (this.f41041e.get(c8008n) == null) {
            this.f41041e.put(c8008n, new ArrayList());
        }
        ((ArrayList) this.f41041e.get(c8008n)).add(c7983p);
    }

    public String toString() {
        return this.f41038b.toString();
    }
}
