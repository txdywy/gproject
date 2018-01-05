package p046b.p047a;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class C0533q extends ak implements Externalizable, Iterable, Set {
    public final boolean add(Object obj) {
        boolean z = false;
        int b = m3962b(obj);
        if (b < 0) {
            return false;
        }
        Object obj2 = this.i[b];
        this.i[b] = obj;
        if (obj2 == l) {
            z = true;
        }
        m3924a(z);
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() == size()) {
            return containsAll(set);
        }
        return false;
    }

    public final int hashCode() {
        ao c0535s = new C0535s(this);
        m3960a(c0535s);
        return c0535s.f3716a;
    }

    protected final void mo938d(int i) {
        int length = this.i.length;
        Object[] objArr = this.i;
        this.i = new Object[i];
        Arrays.fill(this.i, l);
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                return;
            }
            if (objArr[i2] == l || objArr[i2] == k) {
                length = i2;
            } else {
                Object obj = objArr[i2];
                int b = m3962b(obj);
                if (b < 0) {
                    ak.m3957b(this.i[(-b) - 1], obj);
                }
                this.i[b] = obj;
                length = i2;
            }
        }
    }

    public final Object[] toArray() {
        Object[] objArr = new Object[size()];
        m3960a(new aq(objArr));
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        int size = size();
        if (objArr.length < size) {
            objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else {
            objArr2 = objArr;
        }
        m3960a(new aq(objArr2));
        if (objArr2.length > size) {
            objArr2[size] = null;
        }
        return objArr2;
    }

    public final void clear() {
        super.clear();
        Arrays.fill(this.i, 0, this.i.length, l);
    }

    public final boolean remove(Object obj) {
        int a = m3959a(obj);
        if (a < 0) {
            return false;
        }
        mo933b(a);
        return true;
    }

    public final Iterator iterator() {
        return new al(this);
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean addAll(Collection collection) {
        int size = collection.size();
        m3923a(size);
        Iterator it = collection.iterator();
        boolean z = false;
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return z;
            }
            if (add(it.next())) {
                z = true;
                size = i;
            } else {
                size = i;
            }
        }
    }

    public final boolean removeAll(Collection collection) {
        int size = collection.size();
        Iterator it = collection.iterator();
        boolean z = false;
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return z;
            }
            if (remove(it.next())) {
                z = true;
                size = i;
            } else {
                size = i;
            }
        }
    }

    public final boolean retainAll(Collection collection) {
        int size = size();
        Iterator it = iterator();
        boolean z = false;
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return z;
            }
            if (collection.contains(it.next())) {
                size = i;
            } else {
                it.remove();
                z = true;
                size = i;
            }
        }
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        m3960a(new C0534r(stringBuffer));
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a);
        ao c0521c = new C0521c(objectOutput);
        if (!m3960a(c0521c)) {
            throw c0521c.f3697b;
        }
    }

    public final void readExternal(ObjectInput objectInput) {
        objectInput.readByte();
        int readInt = objectInput.readInt();
        mo934c(readInt);
        while (true) {
            int i = readInt - 1;
            if (readInt > 0) {
                add(objectInput.readObject());
                readInt = i;
            } else {
                return;
            }
        }
    }
}
