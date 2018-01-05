package com.google.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.RandomAccess;

final class dg {
    public static final Class f35339a = m33245a();
    public static final du f35340b = m33244a(false);
    public static final du f35341c = m33244a(true);
    public static final du f35342d = new dw();

    public static void m33253a(Class cls) {
        if (!at.class.isAssignableFrom(cls) && f35339a != null && !f35339a.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void m33249a(int i, List list, eq eqVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqVar.mo6084g(i, list, z);
        }
    }

    public static void m33260b(int i, List list, eq eqVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqVar.mo6083f(i, list, z);
        }
    }

    public static void m33264c(int i, List list, eq eqVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqVar.mo6074c(i, list, z);
        }
    }

    public static void m33268d(int i, List list, eq eqVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqVar.mo6078d(i, list, z);
        }
    }

    public static void m33270e(int i, List list, eq eqVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqVar.mo6091n(i, list, z);
        }
    }

    public static void m33272f(int i, List list, eq eqVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqVar.mo6081e(i, list, z);
        }
    }

    public static void m33274g(int i, List list, eq eqVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqVar.mo6089l(i, list, z);
        }
    }

    public static void m33276h(int i, List list, eq eqVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqVar.mo6062a(i, list, z);
        }
    }

    public static void m33278i(int i, List list, eq eqVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqVar.mo6087j(i, list, z);
        }
    }

    public static void m33280j(int i, List list, eq eqVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqVar.mo6090m(i, list, z);
        }
    }

    public static void m33281k(int i, List list, eq eqVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqVar.mo6069b(i, list, z);
        }
    }

    public static void m33282l(int i, List list, eq eqVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqVar.mo6088k(i, list, z);
        }
    }

    public static void m33283m(int i, List list, eq eqVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqVar.mo6085h(i, list, z);
        }
    }

    public static void m33284n(int i, List list, eq eqVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            eqVar.mo6086i(i, list, z);
        }
    }

    public static void m33248a(int i, List list, eq eqVar) {
        if (list != null && !list.isEmpty()) {
            eqVar.mo6061a(i, list);
        }
    }

    public static void m33259b(int i, List list, eq eqVar) {
        if (list != null && !list.isEmpty()) {
            eqVar.mo6068b(i, list);
        }
    }

    public static void m33263c(int i, List list, eq eqVar) {
        if (list != null && !list.isEmpty()) {
            eqVar.mo6073c(i, list);
        }
    }

    public static void m33267d(int i, List list, eq eqVar) {
        if (list != null && !list.isEmpty()) {
            eqVar.mo6077d(i, list);
        }
    }

    static int m33243a(int i, List list, boolean z) {
        int i2 = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3;
        int d;
        if (list instanceof bs) {
            bs bsVar = (bs) list;
            i3 = 0;
            while (i3 < size) {
                d = CodedOutputStream.m32599d(bsVar.m33034b(i3)) + i2;
                i3++;
                i2 = d;
            }
        } else {
            i3 = 0;
            for (d = 0; d < size; d++) {
                i3 += CodedOutputStream.m32599d(((Long) list.get(d)).longValue());
            }
            i2 = i3;
        }
        if (!z) {
            return i2 + (CodedOutputStream.m32620m(i) * size);
        }
        return CodedOutputStream.m32625r(i2) + CodedOutputStream.m32620m(i);
    }

    static int m33257b(int i, List list, boolean z) {
        int i2 = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3;
        int e;
        if (list instanceof bs) {
            bs bsVar = (bs) list;
            i3 = 0;
            while (i3 < size) {
                e = CodedOutputStream.m32602e(bsVar.m33034b(i3)) + i2;
                i3++;
                i2 = e;
            }
        } else {
            i3 = 0;
            for (e = 0; e < size; e++) {
                i3 += CodedOutputStream.m32602e(((Long) list.get(e)).longValue());
            }
            i2 = i3;
        }
        if (!z) {
            return i2 + (CodedOutputStream.m32620m(i) * size);
        }
        return CodedOutputStream.m32625r(i2) + CodedOutputStream.m32620m(i);
    }

    static int m33262c(int i, List list, boolean z) {
        int i2 = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3;
        int f;
        if (list instanceof bs) {
            bs bsVar = (bs) list;
            i3 = 0;
            while (i3 < size) {
                f = CodedOutputStream.m32608f(bsVar.m33034b(i3)) + i2;
                i3++;
                i2 = f;
            }
        } else {
            i3 = 0;
            for (f = 0; f < size; f++) {
                i3 += CodedOutputStream.m32608f(((Long) list.get(f)).longValue());
            }
            i2 = i3;
        }
        if (!z) {
            return i2 + (CodedOutputStream.m32620m(i) * size);
        }
        return CodedOutputStream.m32625r(i2) + CodedOutputStream.m32620m(i);
    }

    static int m33266d(int i, List list, boolean z) {
        int i2 = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3;
        int q;
        if (list instanceof ba) {
            ba baVar = (ba) list;
            i3 = 0;
            while (i3 < size) {
                q = CodedOutputStream.m32624q(baVar.mo6131c(i3)) + i2;
                i3++;
                i2 = q;
            }
        } else {
            i3 = 0;
            for (q = 0; q < size; q++) {
                i3 += CodedOutputStream.m32624q(((Integer) list.get(q)).intValue());
            }
            i2 = i3;
        }
        if (!z) {
            return i2 + (CodedOutputStream.m32620m(i) * size);
        }
        return CodedOutputStream.m32625r(i2) + CodedOutputStream.m32620m(i);
    }

    static int m33269e(int i, List list, boolean z) {
        int i2 = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3;
        int n;
        if (list instanceof ba) {
            ba baVar = (ba) list;
            i3 = 0;
            while (i3 < size) {
                n = CodedOutputStream.m32621n(baVar.mo6131c(i3)) + i2;
                i3++;
                i2 = n;
            }
        } else {
            i3 = 0;
            for (n = 0; n < size; n++) {
                i3 += CodedOutputStream.m32621n(((Integer) list.get(n)).intValue());
            }
            i2 = i3;
        }
        if (!z) {
            return i2 + (CodedOutputStream.m32620m(i) * size);
        }
        return CodedOutputStream.m32625r(i2) + CodedOutputStream.m32620m(i);
    }

    static int m33271f(int i, List list, boolean z) {
        int i2 = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3;
        int o;
        if (list instanceof ba) {
            ba baVar = (ba) list;
            i3 = 0;
            while (i3 < size) {
                o = CodedOutputStream.m32622o(baVar.mo6131c(i3)) + i2;
                i3++;
                i2 = o;
            }
        } else {
            i3 = 0;
            for (o = 0; o < size; o++) {
                i3 += CodedOutputStream.m32622o(((Integer) list.get(o)).intValue());
            }
            i2 = i3;
        }
        if (!z) {
            return i2 + (CodedOutputStream.m32620m(i) * size);
        }
        return CodedOutputStream.m32625r(i2) + CodedOutputStream.m32620m(i);
    }

    static int m33273g(int i, List list, boolean z) {
        int i2 = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3;
        int p;
        if (list instanceof ba) {
            ba baVar = (ba) list;
            i3 = 0;
            while (i3 < size) {
                p = CodedOutputStream.m32623p(baVar.mo6131c(i3)) + i2;
                i3++;
                i2 = p;
            }
        } else {
            i3 = 0;
            for (p = 0; p < size; p++) {
                i3 += CodedOutputStream.m32623p(((Integer) list.get(p)).intValue());
            }
            i2 = i3;
        }
        if (!z) {
            return i2 + (CodedOutputStream.m32620m(i) * size);
        }
        return CodedOutputStream.m32625r(i2) + CodedOutputStream.m32620m(i);
    }

    static int m33275h(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return size * CodedOutputStream.m32604f(i);
        }
        size *= 4;
        return CodedOutputStream.m32625r(size) + CodedOutputStream.m32620m(i);
    }

    static int m33277i(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return size * CodedOutputStream.m32613h(i);
        }
        size *= 8;
        return CodedOutputStream.m32625r(size) + CodedOutputStream.m32620m(i);
    }

    static int m33279j(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return size * CodedOutputStream.m32619l(i);
        }
        return CodedOutputStream.m32625r(size) + CodedOutputStream.m32620m(i);
    }

    static int m33242a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = CodedOutputStream.m32620m(i) * size;
        int i2;
        Object b;
        int b2;
        if (list instanceof bo) {
            bo boVar = (bo) list;
            i2 = 0;
            while (i2 < size) {
                b = boVar.mo6137b(i2);
                if (b instanceof C7203j) {
                    b2 = CodedOutputStream.m32588b((C7203j) b) + m;
                } else {
                    b2 = CodedOutputStream.m32589b((String) b) + m;
                }
                i2++;
                m = b2;
            }
            return m;
        }
        i2 = 0;
        while (i2 < size) {
            b = list.get(i2);
            if (b instanceof C7203j) {
                b2 = CodedOutputStream.m32588b((C7203j) b) + m;
            } else {
                b2 = CodedOutputStream.m32589b((String) b) + m;
            }
            i2++;
            m = b2;
        }
        return m;
    }

    static int m33241a(int i, Object obj) {
        if (obj instanceof bm) {
            return CodedOutputStream.m32579a(i, (bm) obj);
        }
        return CodedOutputStream.m32592c(i, (cf) obj);
    }

    static int m33256b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = CodedOutputStream.m32620m(i) * size;
        int i2 = 0;
        while (i2 < size) {
            int a;
            Object obj = list.get(i2);
            if (obj instanceof bm) {
                a = CodedOutputStream.m32580a((bm) obj) + m;
            } else {
                a = CodedOutputStream.m32587b((cf) obj) + m;
            }
            i2++;
            m = a;
        }
        return m;
    }

    static int m33261c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m = size * CodedOutputStream.m32620m(i);
        for (size = 0; size < list.size(); size++) {
            m += CodedOutputStream.m32588b((C7203j) list.get(size));
        }
        return m;
    }

    static int m33265d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m32607f(i, (cf) list.get(i3));
        }
        return i2;
    }

    public static boolean m33254a(int i, int i2, int i3) {
        return (4 + ((((long) i2) - ((long) i)) + 1)) + 9 <= ((2 * ((long) i3)) + 3) + (((long) i3) * 3);
    }

    private static du m33244a(boolean z) {
        try {
            Class b = m33258b();
            if (b == null) {
                return null;
            }
            return (du) b.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable th) {
            return null;
        }
    }

    private static Class m33245a() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            return null;
        }
    }

    private static Class m33258b() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th) {
            return null;
        }
    }

    static boolean m33255a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static void m33251a(ca caVar, Object obj, Object obj2, long j) {
        ea.m33370a(obj, j, caVar.mo6148a(ea.m33385f(obj, j), ea.m33385f(obj2, j)));
    }

    static void m33250a(aj ajVar, Object obj, Object obj2) {
        am a = ajVar.mo6103a(obj);
        am a2 = ajVar.mo6103a(obj2);
        for (int i = 0; i < a2.f35114a.m33290b(); i++) {
            a.m32917a(a2.f35114a.m33291b(i));
        }
        for (Entry a3 : a2.f35114a.m33292c()) {
            a.m32917a(a3);
        }
    }

    static void m33252a(du duVar, Object obj, Object obj2) {
        duVar.mo6192a(obj, duVar.mo6200c(duVar.mo6195b(obj), duVar.mo6195b(obj2)));
    }

    static Object m33247a(int i, List list, bd bdVar, Object obj, du duVar) {
        if (bdVar == null) {
            return obj;
        }
        Object obj2;
        int intValue;
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            int i3 = 0;
            obj2 = obj;
            while (i2 < size) {
                Object obj3;
                intValue = ((Integer) list.get(i2)).intValue();
                if (bdVar.m33001a(intValue) != null) {
                    if (i2 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    intValue = i3 + 1;
                    obj3 = obj2;
                } else {
                    int i4 = i3;
                    obj3 = m33246a(i, intValue, obj2, duVar);
                    intValue = i4;
                }
                i2++;
                obj2 = obj3;
                i3 = intValue;
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                intValue = ((Integer) it.next()).intValue();
                if (bdVar.m33001a(intValue) == null) {
                    obj = m33246a(i, intValue, obj, duVar);
                    it.remove();
                }
            }
            obj2 = obj;
        }
        return obj2;
    }

    static Object m33246a(int i, int i2, Object obj, du duVar) {
        if (obj == null) {
            obj = duVar.mo6194b();
        }
        duVar.mo6188a(obj, i, (long) i2);
        return obj;
    }
}
