package p046b.p047a;

import java.util.ConcurrentModificationException;
import java.util.Map.Entry;

final class C0524h implements Entry {
    public Object f3701a;
    public Object f3702b;
    public final int f3703c;
    public final /* synthetic */ C0522f f3704d;

    C0524h(C0522f c0522f, Object obj, Object obj2, int i) {
        this.f3704d = c0522f;
        this.f3701a = obj;
        this.f3702b = obj2;
        this.f3703c = i;
    }

    public final Object getKey() {
        return this.f3701a;
    }

    public final Object getValue() {
        return this.f3702b;
    }

    public final Object setValue(Object obj) {
        if (this.f3704d.f3698h[this.f3703c] != this.f3702b) {
            throw new ConcurrentModificationException();
        }
        this.f3704d.f3698h[this.f3703c] = obj;
        Object obj2 = this.f3702b;
        this.f3702b = obj2;
        return obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (getKey() == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!getKey().equals(entry.getKey())) {
            return false;
        }
        if (getValue() == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!getValue().equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getKey() == null ? 0 : getKey().hashCode();
        if (getValue() != null) {
            i = getValue().hashCode();
        }
        return hashCode ^ i;
    }
}
