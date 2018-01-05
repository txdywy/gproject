package android.support.v4.p037h;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class C0306j {
    public C0316l f1717b;
    public C0317m f1718c;
    public C0319o f1719d;

    C0306j() {
    }

    protected abstract int mo372a();

    protected abstract int mo373a(Object obj);

    protected abstract Object mo374a(int i, int i2);

    protected abstract Object mo375a(int i, Object obj);

    protected abstract void mo376a(int i);

    protected abstract void mo377a(Object obj, Object obj2);

    protected abstract int mo378b(Object obj);

    protected abstract Map mo379b();

    protected abstract void mo380c();

    public static boolean m1633a(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public final Object[] m1644b(int i) {
        int a = mo372a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo374a(i2, i);
        }
        return objArr;
    }

    public final Object[] m1641a(Object[] objArr, int i) {
        Object[] objArr2;
        int a = mo372a();
        if (objArr.length < a) {
            objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), a);
        } else {
            objArr2 = objArr;
        }
        for (int i2 = 0; i2 < a; i2++) {
            objArr2[i2] = mo374a(i2, i);
        }
        if (objArr2.length > a) {
            objArr2[a] = null;
        }
        return objArr2;
    }

    public static boolean m1634a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size() && set.containsAll(set2)) {
                return true;
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    public final Set m1646d() {
        if (this.f1718c == null) {
            this.f1718c = new C0317m(this);
        }
        return this.f1718c;
    }
}
