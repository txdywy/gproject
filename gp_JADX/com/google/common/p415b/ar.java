package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public abstract class ar extends AbstractCollection implements Serializable {
    public static final Object[] f34286a = new Object[0];

    ar() {
    }

    public abstract ce mo5886a();

    abstract boolean mo5890c();

    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return f34286a;
        }
        Object[] objArr = new Object[size];
        mo5885a(objArr, 0);
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        C6937m.m31623a((Object) objArr);
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo5885a(objArr, 0);
        return objArr;
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public at mo5887b() {
        return isEmpty() ? at.m31740d() : at.m31739b(toArray());
    }

    int mo5885a(Object[] objArr, int i) {
        ce ceVar = (ce) iterator();
        while (ceVar.hasNext()) {
            int i2 = i + 1;
            objArr[i] = ceVar.next();
            i = i2;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return mo5886a();
    }
}
