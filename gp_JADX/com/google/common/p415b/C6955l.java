package com.google.common.p415b;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

final class C6955l extends C6954o implements NavigableMap {
    public final /* synthetic */ C6943c f34344b;

    C6955l(C6943c c6943c, NavigableMap navigableMap) {
        this.f34344b = c6943c;
        super(c6943c, navigableMap);
    }

    public final Entry lowerEntry(Object obj) {
        Entry lowerEntry = ((NavigableMap) super.mo5913d()).lowerEntry(obj);
        return lowerEntry == null ? null : m31791a(lowerEntry);
    }

    public final Object lowerKey(Object obj) {
        return ((NavigableMap) super.mo5913d()).lowerKey(obj);
    }

    public final Entry floorEntry(Object obj) {
        Entry floorEntry = ((NavigableMap) super.mo5913d()).floorEntry(obj);
        return floorEntry == null ? null : m31791a(floorEntry);
    }

    public final Object floorKey(Object obj) {
        return ((NavigableMap) super.mo5913d()).floorKey(obj);
    }

    public final Entry ceilingEntry(Object obj) {
        Entry ceilingEntry = ((NavigableMap) super.mo5913d()).ceilingEntry(obj);
        return ceilingEntry == null ? null : m31791a(ceilingEntry);
    }

    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) super.mo5913d()).ceilingKey(obj);
    }

    public final Entry higherEntry(Object obj) {
        Entry higherEntry = ((NavigableMap) super.mo5913d()).higherEntry(obj);
        return higherEntry == null ? null : m31791a(higherEntry);
    }

    public final Object higherKey(Object obj) {
        return ((NavigableMap) super.mo5913d()).higherKey(obj);
    }

    public final Entry firstEntry() {
        Entry firstEntry = ((NavigableMap) super.mo5913d()).firstEntry();
        return firstEntry == null ? null : m31791a(firstEntry);
    }

    public final Entry lastEntry() {
        Entry lastEntry = ((NavigableMap) super.mo5913d()).lastEntry();
        return lastEntry == null ? null : m31791a(lastEntry);
    }

    public final Entry pollFirstEntry() {
        return m31798a(entrySet().iterator());
    }

    public final Entry pollLastEntry() {
        return m31798a(descendingMap().entrySet().iterator());
    }

    private final Entry m31798a(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object a;
        Entry entry = (Entry) it.next();
        Collection b = this.f34344b.mo5862b();
        b.addAll((Collection) entry.getValue());
        it.remove();
        Object key = entry.getKey();
        if (b instanceof NavigableSet) {
            a = ca.m31780a((NavigableSet) b);
        } else if (b instanceof SortedSet) {
            a = Collections.unmodifiableSortedSet((SortedSet) b);
        } else if (b instanceof Set) {
            a = Collections.unmodifiableSet((Set) b);
        } else if (b instanceof List) {
            a = Collections.unmodifiableList((List) b);
        } else {
            a = Collections.unmodifiableCollection(b);
        }
        return bl.m31765a(key, a);
    }

    public final NavigableMap descendingMap() {
        return new C6955l(this.f34344b, ((NavigableMap) super.mo5913d()).descendingMap());
    }

    private final NavigableSet m31799f() {
        return new C6957m(this.f34344b, (NavigableMap) super.mo5913d());
    }

    public final NavigableSet navigableKeySet() {
        return (NavigableSet) keySet();
    }

    public final NavigableSet descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new C6955l(this.f34344b, ((NavigableMap) super.mo5913d()).subMap(obj, z, obj2, z2));
    }

    public final NavigableMap headMap(Object obj, boolean z) {
        return new C6955l(this.f34344b, ((NavigableMap) super.mo5913d()).headMap(obj, z));
    }

    public final NavigableMap tailMap(Object obj, boolean z) {
        return new C6955l(this.f34344b, ((NavigableMap) super.mo5913d()).tailMap(obj, z));
    }

    final /* synthetic */ SortedSet mo5911b() {
        return m31799f();
    }

    public final /* synthetic */ SortedSet mo5912c() {
        return (NavigableSet) keySet();
    }

    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    final /* synthetic */ SortedMap mo5913d() {
        return (NavigableMap) super.mo5913d();
    }

    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.mo5912c();
    }

    final /* synthetic */ Set mo5910e() {
        return m31799f();
    }
}
