package android.p004a.p007b;

import android.p004a.p005a.p006a.C0006b;
import android.p004a.p005a.p006a.C0007a;
import android.p004a.p005a.p006a.C0010d;
import android.p004a.p005a.p006a.C0012f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

public final class C0016d extends C0013a {
    public C0007a f33a = new C0007a();
    public C0015c f34b = C0015c.INITIALIZED;
    public int f35c = 0;
    public boolean f36d = false;
    public boolean f37e = false;
    public ArrayList f38f = new ArrayList();

    public final void m19a(C0014b c0014b) {
        this.f34b = C0016d.m16b(c0014b);
        if (this.f36d || this.f35c != 0) {
            this.f37e = true;
            return;
        }
        C0015c c0015c;
        C0017e c0017e;
        C0014b c0014b2;
        this.f36d = true;
        loop0:
        while (true) {
            boolean z;
            if (this.f33a.f10e == 0) {
                z = true;
            } else {
                C0015c c0015c2 = ((C0017e) this.f33a.f7b.getValue()).f39a;
                c0015c = ((C0017e) this.f33a.f8c.getValue()).f39a;
                z = c0015c2 == c0015c && this.f34b == c0015c;
            }
            if (z) {
                this.f37e = false;
                this.f36d = false;
                return;
            }
            Entry entry;
            this.f37e = false;
            if (this.f34b.compareTo(((C0017e) this.f33a.f7b.getValue()).f39a) < 0) {
                C0006b c0006b = this.f33a;
                Iterator c0010d = new C0010d(c0006b.f8c, c0006b.f7b);
                c0006b.f9d.put(c0010d, Boolean.valueOf(false));
                while (c0010d.hasNext() && !this.f37e) {
                    entry = (Entry) c0010d.next();
                    c0017e = (C0017e) entry.getValue();
                    if (c0017e.f39a.compareTo(this.f34b) > 0 && !this.f37e && this.f33a.m10a(entry.getKey())) {
                        break loop0;
                    }
                }
            }
            entry = this.f33a.f8c;
            if (!(this.f37e || entry == null || this.f34b.compareTo(((C0017e) entry.getValue()).f39a) <= 0)) {
                m17b();
            }
        }
        c0015c = c0017e.f39a;
        switch (c0015c.ordinal()) {
            case 0:
                throw new IllegalArgumentException();
            case 1:
                throw new IllegalArgumentException();
            case 2:
                c0014b2 = C0014b.ON_DESTROY;
                break;
            case 3:
                c0014b2 = C0014b.ON_STOP;
                break;
            case 4:
                c0014b2 = C0014b.ON_PAUSE;
                break;
            default:
                throw new IllegalArgumentException("Unexpected state value " + c0015c);
        }
        m15a(C0016d.m16b(c0014b2));
        throw new NoSuchMethodError();
    }

    private final void m15a(C0015c c0015c) {
        this.f38f.add(c0015c);
    }

    public final C0015c mo3a() {
        return this.f34b;
    }

    private static C0015c m16b(C0014b c0014b) {
        switch (c0014b.ordinal()) {
            case 0:
            case 4:
                return C0015c.CREATED;
            case 1:
            case 3:
                return C0015c.STARTED;
            case 2:
                return C0015c.RESUMED;
            case 5:
                return C0015c.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + c0014b);
        }
    }

    private final void m17b() {
        C0006b c0006b = this.f33a;
        Iterator c0012f = new C0012f(c0006b);
        c0006b.f9d.put(c0012f, Boolean.valueOf(false));
        while (c0012f.hasNext() && !this.f37e) {
            Entry entry = (Entry) c0012f.next();
            C0017e c0017e = (C0017e) entry.getValue();
            if (c0017e.f39a.compareTo(this.f34b) < 0 && !this.f37e && this.f33a.m10a(entry.getKey())) {
                m15a(c0017e.f39a);
                C0015c c0015c = c0017e.f39a;
                switch (c0015c.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        throw new NoSuchMethodError();
                    case 4:
                        throw new IllegalArgumentException();
                    default:
                        throw new IllegalArgumentException("Unexpected state value " + c0015c);
                }
            }
        }
    }
}
