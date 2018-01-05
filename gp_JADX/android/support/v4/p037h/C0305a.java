package android.support.v4.p037h;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C0305a extends C0304u implements Map {
    public C0306j f1716a;

    public C0305a(int i) {
        super(i);
    }

    public C0305a(C0304u c0304u) {
        super(c0304u);
    }

    private final C0306j m1632a() {
        if (this.f1716a == null) {
            this.f1716a = new C0307b(this);
        }
        return this.f1716a;
    }

    public void putAll(Map map) {
        m1627a(this.h + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Set entrySet() {
        C0306j a = m1632a();
        if (a.f1717b == null) {
            a.f1717b = new C0316l(a);
        }
        return a.f1717b;
    }

    public Set keySet() {
        return m1632a().m1646d();
    }

    public Collection values() {
        C0306j a = m1632a();
        if (a.f1719d == null) {
            a.f1719d = new C0319o(a);
        }
        return a.f1719d;
    }
}
