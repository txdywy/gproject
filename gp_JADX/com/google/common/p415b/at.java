package com.google.common.p415b;

import com.google.common.p414a.C6934i;
import com.google.common.p414a.C6937m;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class at extends ar implements List, RandomAccess {
    public static final cf f34289b = new au(by.f34321c, 0);

    public static at m31740d() {
        return by.f34321c;
    }

    public static at m31736a(Object obj) {
        Object[] objArr = new Object[]{obj};
        for (int i = 0; i <= 0; i++) {
            if (objArr[0] == null) {
                throw new NullPointerException("at index 0");
            }
        }
        return new by(objArr, 1);
    }

    public static at m31737a(Collection collection) {
        Object[] toArray;
        int length;
        if (collection instanceof ar) {
            at b = ((ar) collection).mo5887b();
            if (!b.mo5890c()) {
                return b;
            }
            toArray = b.toArray();
            length = toArray.length;
            if (length == 0) {
                return by.f34321c;
            }
            return new by(toArray, length);
        }
        toArray = collection.toArray();
        length = toArray.length;
        for (int i = 0; i < length; i++) {
            if (toArray[i] == null) {
                throw new NullPointerException("at index " + i);
            }
        }
        length = toArray.length;
        if (length == 0) {
            return by.f34321c;
        }
        return new by(toArray, length);
    }

    public static at m31738a(Object[] objArr) {
        if (objArr.length == 0) {
            return by.f34321c;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        for (int i = 0; i < length; i++) {
            if (objArr2[i] == null) {
                throw new NullPointerException("at index " + i);
            }
        }
        length = objArr2.length;
        if (length == 0) {
            return by.f34321c;
        }
        return new by(objArr2, length);
    }

    static at m31739b(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return by.f34321c;
        }
        return new by(objArr, length);
    }

    at() {
    }

    public final ce mo5886a() {
        return (cf) listIterator();
    }

    public int indexOf(Object obj) {
        int i = 0;
        if (obj != null) {
            if (this instanceof RandomAccess) {
                int size = size();
                if (obj == null) {
                    while (i < size) {
                        if (get(i) == null) {
                            return i;
                        }
                        i++;
                    }
                } else {
                    while (i < size) {
                        if (obj.equals(get(i))) {
                            return i;
                        }
                        i++;
                    }
                }
                return -1;
            }
            ListIterator listIterator = listIterator();
            while (listIterator.hasNext()) {
                if (C6934i.m31620a(obj, listIterator.next())) {
                    return listIterator.previousIndex();
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj != null) {
            if (this instanceof RandomAccess) {
                int size;
                if (obj == null) {
                    for (size = size() - 1; size >= 0; size--) {
                        if (get(size) == null) {
                            return size;
                        }
                    }
                } else {
                    for (size = size() - 1; size >= 0; size--) {
                        if (obj.equals(get(size))) {
                            return size;
                        }
                    }
                }
                return -1;
            }
            ListIterator listIterator = listIterator(size());
            while (listIterator.hasPrevious()) {
                if (C6934i.m31620a(obj, listIterator.previous())) {
                    return listIterator.nextIndex();
                }
            }
        }
        return -1;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public at mo5889a(int i, int i2) {
        C6937m.m31629a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return by.f34321c;
        }
        return new aw(this, i, i2 - i);
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public final at mo5887b() {
        return this;
    }

    int mo5885a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2 + 0] = get(i2);
        }
        return size + 0;
    }

    public at mo5892e() {
        return size() <= 1 ? this : new av(this);
    }

    public boolean equals(Object obj) {
        if (obj == C6937m.m31623a((Object) this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                int i;
                if ((this instanceof RandomAccess) && (list instanceof RandomAccess)) {
                    i = 0;
                    while (i < size) {
                        if (C6934i.m31620a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                this = this;
                size = size();
                Iterator it = list.iterator();
                i = 0;
                while (i < size) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object obj2 = get(i);
                    i++;
                    if (!C6934i.m31620a(obj2, it.next())) {
                        break;
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return mo5886a();
    }

    public /* synthetic */ List subList(int i, int i2) {
        return mo5889a(i, i2);
    }

    public /* synthetic */ ListIterator listIterator(int i) {
        C6937m.m31634b(i, size());
        if (isEmpty()) {
            return f34289b;
        }
        return new au(this, i);
    }

    public /* synthetic */ ListIterator listIterator() {
        return (cf) listIterator(0);
    }
}
