package android.support.design.widget;

import android.support.v4.p037h.C0304u;
import android.support.v4.p037h.C0321q;
import android.support.v4.p037h.C0322r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

final class au {
    public final C0321q f813a = new C0322r(10);
    public final C0304u f814b = new C0304u();
    public final ArrayList f815c = new ArrayList();
    public final HashSet f816d = new HashSet();

    au() {
    }

    final void m646a(Object obj) {
        if (!this.f814b.containsKey(obj)) {
            this.f814b.put(obj, null);
        }
    }

    final List m647b(Object obj) {
        return (List) this.f814b.get(obj);
    }

    final ArrayList m645a() {
        this.f815c.clear();
        this.f816d.clear();
        int size = this.f814b.size();
        for (int i = 0; i < size; i++) {
            m644a(this.f814b.m1629b(i), this.f815c, this.f816d);
        }
        return this.f815c;
    }

    private final void m644a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (hashSet.contains(obj)) {
                throw new RuntimeException("This graph contains cyclic dependencies");
            }
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) this.f814b.get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    m644a(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
        }
    }
}
