package com.google.common.p415b;

import java.util.Comparator;
import java.util.SortedSet;

class C6963w extends C6958q implements SortedSet {
    public final /* synthetic */ C6943c f34357e;

    C6963w(C6943c c6943c, Object obj, SortedSet sortedSet, C6958q c6958q) {
        this.f34357e = c6943c;
        super(c6943c, obj, sortedSet, c6958q);
    }

    SortedSet mo5921d() {
        return (SortedSet) this.f34348b;
    }

    public Comparator comparator() {
        return mo5921d().comparator();
    }

    public Object first() {
        m31806a();
        return mo5921d().first();
    }

    public Object last() {
        m31806a();
        return mo5921d().last();
    }

    public SortedSet headSet(Object obj) {
        C6958q c6958q;
        m31806a();
        C6943c c6943c = this.f34357e;
        Object obj2 = this.f34347a;
        SortedSet headSet = mo5921d().headSet(obj);
        if (this.f34349c != null) {
            c6958q = this.f34349c;
        }
        return new C6963w(c6943c, obj2, headSet, c6958q);
    }

    public SortedSet subSet(Object obj, Object obj2) {
        C6958q c6958q;
        m31806a();
        C6943c c6943c = this.f34357e;
        Object obj3 = this.f34347a;
        SortedSet subSet = mo5921d().subSet(obj, obj2);
        if (this.f34349c != null) {
            c6958q = this.f34349c;
        }
        return new C6963w(c6943c, obj3, subSet, c6958q);
    }

    public SortedSet tailSet(Object obj) {
        C6958q c6958q;
        m31806a();
        C6943c c6943c = this.f34357e;
        Object obj2 = this.f34347a;
        SortedSet tailSet = mo5921d().tailSet(obj);
        if (this.f34349c != null) {
            c6958q = this.f34349c;
        }
        return new C6963w(c6943c, obj2, tailSet, c6958q);
    }
}
