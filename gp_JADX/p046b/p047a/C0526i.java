package p046b.p047a;

import java.util.Iterator;
import java.util.Map.Entry;

public final class C0526i extends C0525n {
    public final /* synthetic */ C0522f f3706a;

    protected C0526i(C0522f c0522f) {
        this.f3706a = c0522f;
        super(c0522f);
    }

    public final Iterator iterator() {
        return new C0527j(this, this.f3706a);
    }

    public final /* synthetic */ boolean mo949a(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f3706a.get(entry.getKey());
        Object value = entry.getValue();
        return value == obj2 || (obj2 != null && obj2.equals(value));
    }

    public final /* synthetic */ boolean mo950b(Object obj) {
        Entry entry = (Entry) obj;
        int a = this.f3706a.m3959a(entry.getKey());
        if (a >= 0) {
            Object value = entry.getValue();
            if (value == this.f3706a.f3698h[a] || (value != null && value.equals(this.f3706a.f3698h[a]))) {
                this.f3706a.mo933b(a);
                return true;
            }
        }
        return false;
    }
}
