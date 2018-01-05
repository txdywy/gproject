package p046b.p047a;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class C0522f extends ak implements Externalizable, Map {
    public transient Object[] f3698h;

    protected final int mo934c(int i) {
        int c = super.mo934c(i);
        this.f3698h = new Object[c];
        return c;
    }

    public final Object put(Object obj, Object obj2) {
        Object obj3;
        int i;
        boolean z;
        boolean z2 = true;
        int b = m3962b(obj);
        if (b < 0) {
            b = (-b) - 1;
            obj3 = this.f3698h[b];
            i = b;
            z = false;
        } else {
            obj3 = null;
            i = b;
            z = true;
        }
        Object obj4 = this.i[i];
        this.i[i] = obj;
        this.f3698h[i] = obj2;
        if (z) {
            if (obj4 != l) {
                z2 = false;
            }
            m3924a(z2);
        }
        return obj3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() == size()) {
            return m3978a(new C0528k(map));
        }
        return false;
    }

    public final int hashCode() {
        Object c0529l = new C0529l(this);
        m3978a(c0529l);
        return c0529l.f3709a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        m3978a(new C0523g(stringBuffer));
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    private final boolean m3978a(an anVar) {
        Object[] objArr = this.i;
        Object[] objArr2 = this.f3698h;
        int length = objArr.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return true;
            }
            if (objArr[i] != l && objArr[i] != k && !anVar.mo947a(objArr[i], objArr2[i])) {
                return false;
            }
            length = i;
        }
    }

    protected final void mo938d(int i) {
        int length = this.i.length;
        Object[] objArr = this.i;
        Object[] objArr2 = this.f3698h;
        this.i = new Object[i];
        Arrays.fill(this.i, l);
        this.f3698h = new Object[i];
        int i2 = length;
        while (true) {
            length = i2 - 1;
            if (i2 <= 0) {
                return;
            }
            if (objArr[length] == l || objArr[length] == k) {
                i2 = length;
            } else {
                Object obj = objArr[length];
                int b = m3962b(obj);
                if (b < 0) {
                    ak.m3957b(this.i[(-b) - 1], obj);
                }
                this.i[b] = obj;
                this.f3698h[b] = objArr2[length];
                i2 = length;
            }
        }
    }

    public final Object get(Object obj) {
        int a = m3959a(obj);
        return a < 0 ? null : this.f3698h[a];
    }

    public final void clear() {
        if (size() != 0) {
            super.clear();
            Arrays.fill(this.i, 0, this.i.length, l);
            Arrays.fill(this.f3698h, 0, this.f3698h.length, null);
        }
    }

    public final Object remove(Object obj) {
        int a = m3959a(obj);
        if (a < 0) {
            return null;
        }
        Object obj2 = this.f3698h[a];
        mo933b(a);
        return obj2;
    }

    protected final void mo933b(int i) {
        this.f3698h[i] = null;
        super.mo933b(i);
    }

    public final Collection values() {
        return new C0531o(this);
    }

    public final Set keySet() {
        return new C0530m(this);
    }

    public final Set entrySet() {
        return new C0526i(this);
    }

    public final boolean containsValue(Object obj) {
        Object[] objArr = this.i;
        Object[] objArr2 = this.f3698h;
        int length;
        int i;
        if (obj != null) {
            length = objArr2.length;
            while (true) {
                i = length - 1;
                if (length <= 0) {
                    break;
                } else if (objArr[i] != l && objArr[i] != k && (obj == objArr2[i] || obj.equals(objArr2[i]))) {
                    return true;
                } else {
                    length = i;
                }
            }
        } else {
            length = objArr2.length;
            while (true) {
                i = length - 1;
                if (length <= 0) {
                    break;
                } else if (objArr[i] != l && objArr[i] != k && obj == objArr2[i]) {
                    return true;
                } else {
                    length = i;
                }
            }
        }
        return false;
    }

    public final boolean containsKey(Object obj) {
        return contains(obj);
    }

    public final void putAll(Map map) {
        m3923a(map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a);
        Object c0521c = new C0521c(objectOutput);
        if (!m3978a(c0521c)) {
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
                put(objectInput.readObject(), objectInput.readObject());
                readInt = i;
            } else {
                return;
            }
        }
    }

    public final /* synthetic */ ak mo948b() {
        return (C0522f) clone();
    }

    public final /* synthetic */ Object clone() {
        C0522f c0522f = (C0522f) super.mo948b();
        c0522f.f3698h = (Object[]) this.f3698h.clone();
        return c0522f;
    }
}
