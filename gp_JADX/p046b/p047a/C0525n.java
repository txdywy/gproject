package p046b.p047a;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

abstract class C0525n extends AbstractSet implements Iterable, Set {
    public final /* synthetic */ C0522f f3705a;

    private C0525n(C0522f c0522f) {
        this.f3705a = c0522f;
    }

    public abstract boolean mo949a(Object obj);

    public abstract boolean mo950b(Object obj);

    public abstract Iterator iterator();

    public boolean contains(Object obj) {
        return mo949a(obj);
    }

    public boolean remove(Object obj) {
        return mo950b(obj);
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        this.f3705a.clear();
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f3705a.size();
    }

    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    public Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        int size = size();
        if (objArr.length < size) {
            objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else {
            objArr2 = objArr;
        }
        Iterator it = iterator();
        for (int i = 0; i < size; i++) {
            objArr2[i] = it.next();
        }
        if (objArr2.length > size) {
            objArr2[size] = null;
        }
        return objArr2;
    }

    public boolean isEmpty() {
        return this.f3705a.isEmpty();
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection collection) {
        boolean z = false;
        Iterator it = iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
