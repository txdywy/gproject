package android.support.v4.p037h;

public final class C0320p {
    public final Object f1762a;
    public final Object f1763b;

    public C0320p(Object obj, Object obj2) {
        this.f1762a = obj;
        this.f1763b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0320p)) {
            return false;
        }
        C0320p c0320p = (C0320p) obj;
        if (C0320p.m1698a(c0320p.f1762a, this.f1762a) && C0320p.m1698a(c0320p.f1763b, this.f1763b)) {
            return true;
        }
        return false;
    }

    private static boolean m1698a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f1762a == null ? 0 : this.f1762a.hashCode();
        if (this.f1763b != null) {
            i = this.f1763b.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.f1762a) + " " + String.valueOf(this.f1763b) + "}";
    }
}
