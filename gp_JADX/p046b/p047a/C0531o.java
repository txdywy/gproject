package p046b.p047a;

import java.util.Iterator;

public final class C0531o extends C0525n {
    public final /* synthetic */ C0522f f3712a;

    protected C0531o(C0522f c0522f) {
        this.f3712a = c0522f;
        super(c0522f);
    }

    public final Iterator iterator() {
        return new C0532p(this, this.f3712a);
    }

    public final boolean mo949a(Object obj) {
        return this.f3712a.containsValue(obj);
    }

    public final boolean mo950b(Object obj) {
        int i;
        Object[] objArr = this.f3712a.f3698h;
        Object[] objArr2 = this.f3712a.i;
        int length = objArr.length;
        while (true) {
            i = length - 1;
            if (length <= 0) {
                return false;
            }
            if ((objArr2[i] == ak.f3685l || objArr2[i] == ak.f3684k || obj != objArr[i]) && (objArr[i] == null || !objArr[i].equals(obj))) {
                length = i;
            }
        }
        this.f3712a.mo933b(i);
        return true;
    }
}
