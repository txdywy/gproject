package android.p004a.p005a.p006a;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class C0006b implements Iterable {
    public C0011e f7b;
    public C0011e f8c;
    public WeakHashMap f9d = new WeakHashMap();
    public int f10e = 0;

    public Iterator iterator() {
        Iterator c0009c = new C0009c(this.f7b, this.f8c);
        this.f9d.put(c0009c, Boolean.valueOf(false));
        return c0009c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0006b)) {
            return false;
        }
        C0006b c0006b = (C0006b) obj;
        if (this.f10e != c0006b.f10e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0006b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuilder.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
