package p046b.p047a;

import java.util.Iterator;

public final class C0530m extends C0525n {
    public final /* synthetic */ C0522f f3711a;

    protected C0530m(C0522f c0522f) {
        this.f3711a = c0522f;
        super(c0522f);
    }

    public final Iterator iterator() {
        return new al(this.f3711a);
    }

    public final boolean mo950b(Object obj) {
        return this.f3711a.remove(obj) != null;
    }

    public final boolean mo949a(Object obj) {
        return this.f3711a.contains(obj);
    }
}
