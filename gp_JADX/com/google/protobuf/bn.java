package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class bn extends C7198f implements bo, RandomAccess {
    public final List f35230b;

    public bn() {
        this(10);
    }

    public bn(int i) {
        this(new ArrayList(i));
    }

    private bn(ArrayList arrayList) {
        this.f35230b = arrayList;
    }

    public final int size() {
        return this.f35230b.size();
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection collection) {
        m32868c();
        if (collection instanceof bo) {
            collection = ((bo) collection).mo6139d();
        }
        boolean addAll = this.f35230b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        m32868c();
        this.f35230b.clear();
        this.modCount++;
    }

    public final void mo6135a(C7203j c7203j) {
        m32868c();
        this.f35230b.add(c7203j);
        this.modCount++;
    }

    public final Object mo6137b(int i) {
        return this.f35230b.get(i);
    }

    private static String m33010a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C7203j) {
            return ((C7203j) obj).m33214b();
        }
        return bb.m32998b((byte[]) obj);
    }

    public final List mo6139d() {
        return Collections.unmodifiableList(this.f35230b);
    }

    public final bo mo6140e() {
        if (mo6092a()) {
            return new dx(this);
        }
        return this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        m32868c();
        return m33010a(this.f35230b.set(i, str));
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* synthetic */ Object remove(int i) {
        m32868c();
        Object remove = this.f35230b.remove(i);
        this.modCount++;
        return m33010a(remove);
    }

    public final /* bridge */ /* synthetic */ boolean mo6092a() {
        return super.mo6092a();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        m32868c();
        this.f35230b.add(i, str);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ bh mo6094a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f35230b);
        return new bn(arrayList);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f35230b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        String b;
        if (obj instanceof C7203j) {
            C7203j c7203j = (C7203j) obj;
            b = c7203j.m33214b();
            if (c7203j.mo6177c()) {
                this.f35230b.set(i, b);
            }
            return b;
        }
        byte[] bArr = (byte[]) obj;
        b = bb.m32998b(bArr);
        if (bb.m32997a(bArr)) {
            this.f35230b.set(i, b);
        }
        return b;
    }

    static {
        new bn().f35102a = false;
    }
}
