package p046b.p047a;

final class C0539w implements C0520y {
    public final C0538v f3721a;

    C0539w(C0538v c0538v) {
        this.f3721a = c0538v;
    }

    public final boolean mo946a(int i, Object obj) {
        if (this.f3721a.mo952e(i) >= 0) {
            boolean z;
            Object h = this.f3721a.m4010h(i);
            if (obj == h || (obj != null && obj.equals(h))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
