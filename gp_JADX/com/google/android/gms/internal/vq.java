package com.google.android.gms.internal;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class vq extends AbstractMap {
    public final int f27568a;
    public List f27569b;
    public Map f27570c;
    public boolean f27571d;
    public volatile vx f27572e;
    public Map f27573f;

    private vq(int i) {
        this.f27568a = i;
        this.f27569b = Collections.emptyList();
        this.f27570c = Collections.emptyMap();
        this.f27573f = Collections.emptyMap();
    }

    private final int m25796a(Comparable comparable) {
        int compareTo;
        int size = this.f27569b.size() - 1;
        if (size >= 0) {
            compareTo = comparable.compareTo((Comparable) ((vv) this.f27569b.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        int i2 = size;
        while (i <= i2) {
            size = (i + i2) / 2;
            compareTo = comparable.compareTo((Comparable) ((vv) this.f27569b.get(size)).getKey());
            if (compareTo < 0) {
                i2 = size - 1;
            } else if (compareTo <= 0) {
                return size;
            } else {
                i = size + 1;
            }
        }
        return -(i + 1);
    }

    static vq m25797a(int i) {
        return new vr(i);
    }

    private final SortedMap m25798e() {
        m25805d();
        if (this.f27570c.isEmpty() && !(this.f27570c instanceof TreeMap)) {
            this.f27570c = new TreeMap();
            this.f27573f = ((TreeMap) this.f27570c).descendingMap();
        }
        return (SortedMap) this.f27570c;
    }

    public final Object m25799a(Comparable comparable, Object obj) {
        m25805d();
        int a = m25796a(comparable);
        if (a >= 0) {
            return ((vv) this.f27569b.get(a)).setValue(obj);
        }
        m25805d();
        if (this.f27569b.isEmpty() && !(this.f27569b instanceof ArrayList)) {
            this.f27569b = new ArrayList(this.f27568a);
        }
        int i = -(a + 1);
        if (i >= this.f27568a) {
            return m25798e().put(comparable, obj);
        }
        if (this.f27569b.size() == this.f27568a) {
            vv vvVar = (vv) this.f27569b.remove(this.f27568a - 1);
            m25798e().put((Comparable) vvVar.getKey(), vvVar.getValue());
        }
        this.f27569b.add(i, new vv(this, comparable, obj));
        return null;
    }

    public void mo4941a() {
        if (!this.f27571d) {
            this.f27570c = this.f27570c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f27570c);
            this.f27573f = this.f27573f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f27573f);
            this.f27571d = true;
        }
    }

    public final int m25801b() {
        return this.f27569b.size();
    }

    public final Entry m25802b(int i) {
        return (Entry) this.f27569b.get(i);
    }

    public final Iterable m25803c() {
        if (this.f27570c.isEmpty()) {
            return vs.f27575b;
        }
        return this.f27570c.entrySet();
    }

    final Object m25804c(int i) {
        m25805d();
        Object value = ((vv) this.f27569b.remove(i)).getValue();
        if (!this.f27570c.isEmpty()) {
            Iterator it = m25798e().entrySet().iterator();
            this.f27569b.add(new vv(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        m25805d();
        if (!this.f27569b.isEmpty()) {
            this.f27569b.clear();
        }
        if (!this.f27570c.isEmpty()) {
            this.f27570c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m25796a(comparable) >= 0 || this.f27570c.containsKey(comparable);
    }

    final void m25805d() {
        if (this.f27571d) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq)) {
            return super.equals(obj);
        }
        vq vqVar = (vq) obj;
        int size = size();
        if (size != vqVar.size()) {
            return false;
        }
        int b = m25801b();
        if (b != vqVar.m25801b()) {
            return entrySet().equals(vqVar.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!m25802b(i).equals(vqVar.m25802b(i))) {
                return false;
            }
        }
        return b != size ? this.f27570c.equals(vqVar.f27570c) : true;
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m25796a(comparable);
        return a >= 0 ? ((vv) this.f27569b.get(a)).getValue() : this.f27570c.get(comparable);
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < m25801b(); i2++) {
            i += ((vv) this.f27569b.get(i2)).hashCode();
        }
        return this.f27570c.size() > 0 ? this.f27570c.hashCode() + i : i;
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return m25799a((Comparable) obj, obj2);
    }

    public Object remove(Object obj) {
        m25805d();
        Comparable comparable = (Comparable) obj;
        int a = m25796a(comparable);
        return a >= 0 ? m25804c(a) : this.f27570c.isEmpty() ? null : this.f27570c.remove(comparable);
    }

    public int size() {
        return this.f27569b.size() + this.f27570c.size();
    }

    public Set entrySet() {
        if (this.f27572e == null) {
            this.f27572e = new vx(this);
        }
        return this.f27572e;
    }
}
