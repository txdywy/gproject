package p046b.p047a;

final class ag implements ai {
    public final af f3681a;

    ag(af afVar) {
        this.f3681a = afVar;
    }

    public final boolean mo940a(long j, Object obj) {
        if (this.f3681a.m3934b(j) >= 0) {
            boolean z;
            Object e = this.f3681a.m3951e(j);
            if (obj == e || (obj != null && obj.equals(e))) {
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
