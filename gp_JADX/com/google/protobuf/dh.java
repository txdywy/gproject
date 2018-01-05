package com.google.protobuf;

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

class dh extends AbstractMap {
    public final int f35343a;
    public List f35344b;
    public Map f35345c;
    public boolean f35346d;
    public volatile dq f35347e;
    public Map f35348f;
    public volatile dk f35349g;

    static dh m33286a(int i) {
        return new di(i);
    }

    private dh(int i) {
        this.f35343a = i;
        this.f35344b = Collections.emptyList();
        this.f35345c = Collections.emptyMap();
        this.f35348f = Collections.emptyMap();
    }

    public void mo6182a() {
        if (!this.f35346d) {
            Map emptyMap;
            if (this.f35345c.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.f35345c);
            }
            this.f35345c = emptyMap;
            if (this.f35348f.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.f35348f);
            }
            this.f35348f = emptyMap;
            this.f35346d = true;
        }
    }

    public final int m33290b() {
        return this.f35344b.size();
    }

    public final Entry m33291b(int i) {
        return (Entry) this.f35344b.get(i);
    }

    public final Iterable m33292c() {
        if (this.f35345c.isEmpty()) {
            return dl.f35356b;
        }
        return this.f35345c.entrySet();
    }

    public int size() {
        return this.f35344b.size() + this.f35345c.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m33285a(comparable) >= 0 || this.f35345c.containsKey(comparable);
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m33285a(comparable);
        if (a >= 0) {
            return ((C7204do) this.f35344b.get(a)).getValue();
        }
        return this.f35345c.get(comparable);
    }

    public final Object m33288a(Comparable comparable, Object obj) {
        m33295e();
        int a = m33285a(comparable);
        if (a >= 0) {
            return ((C7204do) this.f35344b.get(a)).setValue(obj);
        }
        m33295e();
        if (this.f35344b.isEmpty() && !(this.f35344b instanceof ArrayList)) {
            this.f35344b = new ArrayList(this.f35343a);
        }
        int i = -(a + 1);
        if (i >= this.f35343a) {
            return m33287f().put(comparable, obj);
        }
        if (this.f35344b.size() == this.f35343a) {
            C7204do c7204do = (C7204do) this.f35344b.remove(this.f35343a - 1);
            m33287f().put((Comparable) c7204do.getKey(), c7204do.getValue());
        }
        this.f35344b.add(i, new C7204do(this, comparable, obj));
        return null;
    }

    public void clear() {
        m33295e();
        if (!this.f35344b.isEmpty()) {
            this.f35344b.clear();
        }
        if (!this.f35345c.isEmpty()) {
            this.f35345c.clear();
        }
    }

    public Object remove(Object obj) {
        m33295e();
        Comparable comparable = (Comparable) obj;
        int a = m33285a(comparable);
        if (a >= 0) {
            return m33293c(a);
        }
        if (this.f35345c.isEmpty()) {
            return null;
        }
        return this.f35345c.remove(comparable);
    }

    final Object m33293c(int i) {
        m33295e();
        Object value = ((C7204do) this.f35344b.remove(i)).getValue();
        if (!this.f35345c.isEmpty()) {
            Iterator it = m33287f().entrySet().iterator();
            this.f35344b.add(new C7204do(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private final int m33285a(Comparable comparable) {
        int compareTo;
        int size = this.f35344b.size() - 1;
        if (size >= 0) {
            compareTo = comparable.compareTo((Comparable) ((C7204do) this.f35344b.get(size)).getKey());
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
            compareTo = comparable.compareTo((Comparable) ((C7204do) this.f35344b.get(size)).getKey());
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

    public Set entrySet() {
        if (this.f35347e == null) {
            this.f35347e = new dq(this);
        }
        return this.f35347e;
    }

    final Set m33294d() {
        if (this.f35349g == null) {
            this.f35349g = new dk(this);
        }
        return this.f35349g;
    }

    final void m33295e() {
        if (this.f35346d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap m33287f() {
        m33295e();
        if (this.f35345c.isEmpty() && !(this.f35345c instanceof TreeMap)) {
            this.f35345c = new TreeMap();
            this.f35348f = ((TreeMap) this.f35345c).descendingMap();
        }
        return (SortedMap) this.f35345c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh)) {
            return super.equals(obj);
        }
        dh dhVar = (dh) obj;
        int size = size();
        if (size != dhVar.size()) {
            return false;
        }
        int b = m33290b();
        if (b != dhVar.m33290b()) {
            return entrySet().equals(dhVar.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!m33291b(i).equals(dhVar.m33291b(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f35345c.equals(dhVar.f35345c);
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < m33290b(); i2++) {
            i += ((C7204do) this.f35344b.get(i2)).hashCode();
        }
        if (this.f35345c.size() > 0) {
            return this.f35345c.hashCode() + i;
        }
        return i;
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return m33288a((Comparable) obj, obj2);
    }
}
