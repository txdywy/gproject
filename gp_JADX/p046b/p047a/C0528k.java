package p046b.p047a;

import java.util.Map;

final class C0528k implements an {
    public final Map f3708a;

    C0528k(Map map) {
        this.f3708a = map;
    }

    public final boolean mo947a(Object obj, Object obj2) {
        if (obj2 == null && !this.f3708a.containsKey(obj)) {
            return false;
        }
        Object obj3 = this.f3708a.get(obj);
        if (obj3 == obj2 || (obj3 != null && obj3.equals(obj2))) {
            return true;
        }
        return false;
    }
}
