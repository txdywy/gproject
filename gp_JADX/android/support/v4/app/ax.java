package android.support.v4.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.p037h.C0304u;
import android.support.v4.p037h.C0305a;
import android.support.v4.p037h.C0306j;
import android.support.v4.view.ai;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

final class ax {
    public static final int[] f1356a = new int[]{0, 3, 0, 1, 5, 4, 7, 6, 9, 8};
    public static final bi f1357b = (VERSION.SDK_INT >= 21 ? new bd() : null);
    public static final bi f1358c = m1306a();

    private static bi m1306a() {
        try {
            return (bi) Class.forName("android.support.e.v").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    static void m1318a(ae aeVar, ArrayList arrayList, ArrayList arrayList2, int i, int i2, boolean z) {
        if (aeVar.f1314m > 0) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0245j c0245j = (C0245j) arrayList.get(i3);
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    m1327b(c0245j, sparseArray, z);
                } else {
                    m1321a(c0245j, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(aeVar.f1315n.f1285c);
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C0304u a = m1308a(keyAt, arrayList, arrayList2, i, i2);
                    bc bcVar = (bc) sparseArray.valueAt(i4);
                    Fragment fragment;
                    bi a2;
                    boolean z2;
                    Object a3;
                    Object b;
                    Fragment fragment2;
                    Fragment fragment3;
                    Object obj;
                    C0305a b2;
                    if (z) {
                        View view2;
                        if (aeVar.f1316o.mo280a()) {
                            view2 = (ViewGroup) aeVar.f1316o.mo279a(keyAt);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null) {
                            fragment = bcVar.f1389a;
                            Fragment fragment4 = bcVar.f1392d;
                            a2 = m1307a(fragment4, fragment);
                            if (a2 != null) {
                                Object obj2;
                                boolean z3 = bcVar.f1390b;
                                z2 = bcVar.f1393e;
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = new ArrayList();
                                a3 = m1312a(a2, fragment, z3);
                                b = m1326b(a2, fragment4, z2);
                                fragment2 = bcVar.f1389a;
                                fragment3 = bcVar.f1392d;
                                if (fragment2 != null) {
                                    fragment2.f746R.setVisibility(0);
                                }
                                if (fragment2 == null || fragment3 == null) {
                                    obj2 = null;
                                } else {
                                    boolean z4 = bcVar.f1390b;
                                    if (a.isEmpty()) {
                                        obj = null;
                                    } else {
                                        obj = m1311a(a2, fragment2, fragment3, z4);
                                    }
                                    b2 = m1325b(a2, a, obj, bcVar);
                                    C0305a a4 = m1309a(a2, (C0305a) a, obj, bcVar);
                                    if (a.isEmpty()) {
                                        obj = null;
                                        if (b2 != null) {
                                            b2.clear();
                                        }
                                        if (a4 != null) {
                                            a4.clear();
                                        }
                                    } else {
                                        m1323a(arrayList4, b2, a.keySet());
                                        m1323a(arrayList3, a4, a.values());
                                    }
                                    if (a3 == null && b == null && obj == null) {
                                        obj2 = null;
                                    } else {
                                        Rect rect;
                                        View a5;
                                        m1317a(fragment2, fragment3, z4, b2, true);
                                        if (obj != null) {
                                            arrayList3.add(view);
                                            a2.mo254a(obj, view, arrayList4);
                                            m1319a(a2, obj, b, b2, bcVar.f1393e, bcVar.f1394f);
                                            rect = new Rect();
                                            a5 = m1310a(a4, bcVar, a3, z4);
                                            if (a5 != null) {
                                                a2.mo252a(a3, rect);
                                            }
                                        } else {
                                            rect = null;
                                            a5 = null;
                                        }
                                        cn.m1440a(view2, new ba(fragment2, fragment3, z4, a4, a5, rect));
                                        obj2 = obj;
                                    }
                                }
                                if (a3 != null || obj2 != null || b != null) {
                                    ArrayList a6 = m1315a(a2, b, fragment4, arrayList4, view);
                                    ArrayList a7 = m1315a(a2, a3, fragment, arrayList3, view);
                                    m1322a(a7, 4);
                                    Object a8 = m1313a(a2, a3, b, obj2, fragment, z3);
                                    if (a8 != null) {
                                        if (fragment4 != null && b != null && fragment4.f764u && fragment4.f738J && fragment4.aa) {
                                            fragment4.m597d(true);
                                            a2.mo262b(b, fragment4.f746R, a6);
                                            cn.m1440a(fragment4.f745Q, new ay(a6));
                                        }
                                        ArrayList a9 = bi.m1009a(arrayList3);
                                        a2.mo255a(a8, a3, a7, b, a6, obj2, arrayList3);
                                        a2.mo251a((ViewGroup) view2, a8);
                                        bi.m1011a(view2, arrayList4, arrayList3, a9, a);
                                        m1322a(a7, 0);
                                        a2.mo257a(obj2, arrayList4, arrayList3);
                                    }
                                }
                            }
                        }
                    } else {
                        View view3;
                        if (aeVar.f1316o.mo280a()) {
                            view3 = (ViewGroup) aeVar.f1316o.mo279a(keyAt);
                        } else {
                            view3 = null;
                        }
                        if (view3 != null) {
                            fragment2 = bcVar.f1389a;
                            fragment3 = bcVar.f1392d;
                            a2 = m1307a(fragment3, fragment2);
                            if (a2 != null) {
                                z2 = bcVar.f1390b;
                                boolean z5 = bcVar.f1393e;
                                Object a10 = m1312a(a2, fragment2, z2);
                                b = m1326b(a2, fragment3, z5);
                                ArrayList arrayList5 = new ArrayList();
                                ArrayList arrayList6 = new ArrayList();
                                fragment = bcVar.f1389a;
                                Fragment fragment5 = bcVar.f1392d;
                                if (fragment == null || fragment5 == null) {
                                    a3 = null;
                                } else {
                                    boolean z6 = bcVar.f1390b;
                                    if (a.isEmpty()) {
                                        obj = null;
                                    } else {
                                        obj = m1311a(a2, fragment, fragment5, z6);
                                    }
                                    b2 = m1325b(a2, a, obj, bcVar);
                                    if (a.isEmpty()) {
                                        obj = null;
                                    } else {
                                        arrayList5.addAll(b2.values());
                                    }
                                    if (a10 == null && b == null && obj == null) {
                                        a3 = null;
                                    } else {
                                        Rect rect2;
                                        m1317a(fragment, fragment5, z6, b2, true);
                                        if (obj != null) {
                                            rect2 = new Rect();
                                            a2.mo254a(obj, view, arrayList5);
                                            m1319a(a2, obj, b, b2, bcVar.f1393e, bcVar.f1394f);
                                            if (a10 != null) {
                                                a2.mo252a(a10, rect2);
                                            }
                                        } else {
                                            rect2 = null;
                                        }
                                        cn.m1440a(view3, new bb(a2, a, obj, bcVar, arrayList6, view, fragment, fragment5, z6, arrayList5, a10, rect2));
                                        a3 = obj;
                                    }
                                }
                                if (a10 != null || a3 != null || b != null) {
                                    Object obj3;
                                    ArrayList a11 = m1315a(a2, b, fragment3, arrayList5, view);
                                    if (a11 == null || a11.isEmpty()) {
                                        obj3 = null;
                                    } else {
                                        obj3 = b;
                                    }
                                    a2.mo261b(a10, view);
                                    obj = m1313a(a2, a10, obj3, a3, fragment2, bcVar.f1390b);
                                    if (obj != null) {
                                        ArrayList arrayList7 = new ArrayList();
                                        a2.mo255a(obj, a10, arrayList7, obj3, a11, a3, arrayList6);
                                        cn.m1440a(view3, new az(a10, a2, view, fragment2, arrayList6, arrayList7, a11, obj3));
                                        cn.m1440a(view3, new bk(arrayList6, a));
                                        a2.mo251a((ViewGroup) view3, obj);
                                        cn.m1440a(view3, new bl(arrayList6, a));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static C0305a m1308a(int i, ArrayList arrayList, ArrayList arrayList2, int i2, int i3) {
        C0304u c0305a = new C0305a();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0245j c0245j = (C0245j) arrayList.get(i4);
            if (c0245j.m1480b(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                if (c0245j.f1574r != null) {
                    ArrayList arrayList3;
                    ArrayList arrayList4;
                    int size = c0245j.f1574r.size();
                    if (booleanValue) {
                        arrayList3 = c0245j.f1574r;
                        arrayList4 = c0245j.f1575s;
                    } else {
                        ArrayList arrayList5 = c0245j.f1574r;
                        arrayList3 = c0245j.f1575s;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String str3 = (String) c0305a.remove(str2);
                        if (str3 != null) {
                            c0305a.put(str, str3);
                        } else {
                            c0305a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c0305a;
    }

    private static bi m1307a(Fragment fragment, Fragment fragment2) {
        Object A;
        List arrayList = new ArrayList();
        if (fragment != null) {
            A = fragment.m549A();
            if (A != null) {
                arrayList.add(A);
            }
            A = fragment.m620z();
            if (A != null) {
                arrayList.add(A);
            }
            A = fragment.m552D();
            if (A != null) {
                arrayList.add(A);
            }
        }
        if (fragment2 != null) {
            A = fragment2.m619y();
            if (A != null) {
                arrayList.add(A);
            }
            A = fragment2.m550B();
            if (A != null) {
                arrayList.add(A);
            }
            A = fragment2.m551C();
            if (A != null) {
                arrayList.add(A);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (f1357b != null && m1324a(f1357b, arrayList)) {
            return f1357b;
        }
        if (f1358c != null && m1324a(f1358c, arrayList)) {
            return f1358c;
        }
        if (f1357b == null && f1358c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    private static boolean m1324a(bi biVar, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!biVar.mo258a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static Object m1311a(bi biVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        Object D;
        if (z) {
            D = fragment2.m552D();
        } else {
            D = fragment.m551C();
        }
        return biVar.mo264c(biVar.mo259b(D));
    }

    private static Object m1312a(bi biVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        Object B;
        if (z) {
            B = fragment.m550B();
        } else {
            B = fragment.m619y();
        }
        return biVar.mo259b(B);
    }

    private static Object m1326b(bi biVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        Object z2;
        if (z) {
            z2 = fragment.m620z();
        } else {
            z2 = fragment.m549A();
        }
        return biVar.mo259b(z2);
    }

    private static void m1323a(ArrayList arrayList, C0305a c0305a, Collection collection) {
        for (int size = c0305a.size() - 1; size >= 0; size--) {
            View view = (View) c0305a.m1630c(size);
            if (collection.contains(ai.f1848a.mo422u(view))) {
                arrayList.add(view);
            }
        }
    }

    private static C0305a m1325b(bi biVar, C0305a c0305a, Object obj, bc bcVar) {
        if (c0305a.isEmpty() || obj == null) {
            c0305a.clear();
            return null;
        }
        Collection collection;
        cq cqVar;
        Fragment fragment = bcVar.f1392d;
        Map c0305a2 = new C0305a();
        biVar.m1024a(c0305a2, fragment.f746R);
        C0245j c0245j = bcVar.f1394f;
        cq P;
        if (bcVar.f1393e) {
            P = fragment.m564P();
            collection = c0245j.f1575s;
            cqVar = P;
        } else {
            P = fragment.m565Q();
            Object obj2 = c0245j.f1574r;
            cqVar = P;
        }
        C0306j.m1633a(c0305a2, collection);
        if (cqVar != null) {
            for (int size = collection.size() - 1; size >= 0; size--) {
                String str = (String) collection.get(size);
                View view = (View) c0305a2.get(str);
                if (view == null) {
                    c0305a.remove(str);
                } else if (!str.equals(ai.f1848a.mo422u(view))) {
                    c0305a.put(ai.f1848a.mo422u(view), (String) c0305a.remove(str));
                }
            }
        } else {
            C0306j.m1633a((Map) c0305a, c0305a2.keySet());
        }
        return c0305a2;
    }

    static C0305a m1309a(bi biVar, C0305a c0305a, Object obj, bc bcVar) {
        Fragment fragment = bcVar.f1389a;
        View view = fragment.f746R;
        if (c0305a.isEmpty() || obj == null || view == null) {
            c0305a.clear();
            return null;
        }
        cq cqVar;
        Map c0305a2 = new C0305a();
        biVar.m1024a(c0305a2, view);
        C0245j c0245j = bcVar.f1391c;
        cq Q;
        if (bcVar.f1390b) {
            Q = fragment.m565Q();
            Collection collection = c0245j.f1574r;
            cqVar = Q;
        } else {
            Q = fragment.m564P();
            Object obj2 = c0245j.f1575s;
            cqVar = Q;
        }
        if (collection != null) {
            C0306j.m1633a(c0305a2, collection);
        }
        if (cqVar != null) {
            for (int size = collection.size() - 1; size >= 0; size--) {
                String str = (String) collection.get(size);
                view = (View) c0305a2.get(str);
                if (view == null) {
                    str = m1314a(c0305a, str);
                    if (str != null) {
                        c0305a.remove(str);
                    }
                } else if (!str.equals(ai.f1848a.mo422u(view))) {
                    str = m1314a(c0305a, str);
                    if (str != null) {
                        c0305a.put(str, ai.f1848a.mo422u(view));
                    }
                }
            }
        } else {
            for (int size2 = c0305a.size() - 1; size2 >= 0; size2--) {
                if (!c0305a2.containsKey((String) c0305a.m1630c(size2))) {
                    c0305a.m1631d(size2);
                }
            }
        }
        return c0305a2;
    }

    private static String m1314a(C0305a c0305a, String str) {
        int size = c0305a.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(c0305a.m1630c(i))) {
                return (String) c0305a.m1629b(i);
            }
        }
        return null;
    }

    static View m1310a(C0305a c0305a, bc bcVar, Object obj, boolean z) {
        C0245j c0245j = bcVar.f1391c;
        if (obj == null || c0305a == null || c0245j.f1574r == null || c0245j.f1574r.isEmpty()) {
            return null;
        }
        Object obj2;
        if (z) {
            obj2 = (String) c0245j.f1574r.get(0);
        } else {
            String str = (String) c0245j.f1575s.get(0);
        }
        return (View) c0305a.get(obj2);
    }

    private static void m1319a(bi biVar, Object obj, Object obj2, C0305a c0305a, boolean z, C0245j c0245j) {
        if (c0245j.f1574r != null && !c0245j.f1574r.isEmpty()) {
            Object obj3;
            if (z) {
                obj3 = (String) c0245j.f1575s.get(0);
            } else {
                String str = (String) c0245j.f1574r.get(0);
            }
            View view = (View) c0305a.get(obj3);
            biVar.mo253a(obj, view);
            if (obj2 != null) {
                biVar.mo253a(obj2, view);
            }
        }
    }

    private static void m1317a(Fragment fragment, Fragment fragment2, boolean z, C0305a c0305a, boolean z2) {
        cq P;
        int i = 0;
        if (z) {
            P = fragment2.m564P();
        } else {
            P = fragment.m564P();
        }
        if (P != null) {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            int size = c0305a == null ? 0 : c0305a.size();
            while (i < size) {
                arrayList2.add(c0305a.m1629b(i));
                arrayList.add(c0305a.m1630c(i));
                i++;
            }
            if (z2) {
                P.mo3050a(arrayList2, arrayList);
            } else {
                P.mo3049a();
            }
        }
    }

    static ArrayList m1315a(bi biVar, Object obj, Fragment fragment, ArrayList arrayList, View view) {
        ArrayList arrayList2 = null;
        if (obj != null) {
            arrayList2 = new ArrayList();
            View view2 = fragment.f746R;
            if (view2 != null) {
                biVar.m1023a(arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view);
                biVar.mo256a(obj, arrayList2);
            }
        }
        return arrayList2;
    }

    static void m1322a(ArrayList arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    private static Object m1313a(bi biVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2 = true;
        if (!(obj == null || obj2 == null || fragment == null)) {
            if (z) {
                if (!(fragment.f753Y == null || fragment.f753Y.f1602m == null)) {
                    z2 = fragment.f753Y.f1602m.booleanValue();
                }
            } else if (!(fragment.f753Y == null || fragment.f753Y.f1603n == null)) {
                z2 = fragment.f753Y.f1603n.booleanValue();
            }
        }
        if (z2) {
            return biVar.mo250a(obj2, obj, obj3);
        }
        return biVar.mo260b(obj2, obj, obj3);
    }

    private static void m1321a(C0245j c0245j, SparseArray sparseArray, boolean z) {
        int size = c0245j.f1558b.size();
        for (int i = 0; i < size; i++) {
            m1320a(c0245j, (C0246k) c0245j.f1558b.get(i), sparseArray, false, z);
        }
    }

    private static void m1327b(C0245j c0245j, SparseArray sparseArray, boolean z) {
        if (c0245j.f1557a.f1316o.mo280a()) {
            for (int size = c0245j.f1558b.size() - 1; size >= 0; size--) {
                m1320a(c0245j, (C0246k) c0245j.f1558b.get(size), sparseArray, true, z);
            }
        }
    }

    private static void m1320a(C0245j c0245j, C0246k c0246k, SparseArray sparseArray, boolean z, boolean z2) {
        Fragment fragment = c0246k.f1579b;
        if (fragment != null) {
            int i = fragment.f736H;
            if (i != 0) {
                int i2;
                int i3;
                bc a;
                boolean z3;
                int i4;
                int i5;
                boolean z4;
                int i6;
                switch (z ? f1356a[c0246k.f1578a] : c0246k.f1578a) {
                    case 1:
                    case 7:
                        z3 = z2 ? fragment.f754Z : (fragment.f764u || fragment.f738J) ? false : true;
                        i4 = 1;
                        i2 = 0;
                        i5 = 0;
                        z4 = z3;
                        break;
                    case 3:
                    case 6:
                        i6 = z2 ? (fragment.f764u || fragment.f746R == null || fragment.f746R.getVisibility() != 0 || fragment.ab < 0.0f) ? 0 : 1 : (!fragment.f764u || fragment.f738J) ? 0 : 1;
                        i4 = 0;
                        i2 = i6;
                        i5 = 1;
                        i3 = 0;
                        break;
                    case 4:
                        i6 = z2 ? (fragment.aa && fragment.f764u && fragment.f738J) ? 1 : 0 : (!fragment.f764u || fragment.f738J) ? 0 : 1;
                        i4 = 0;
                        i2 = i6;
                        i5 = 1;
                        i3 = 0;
                        break;
                    case 5:
                        if (!z2) {
                            z3 = fragment.f738J;
                        } else if (fragment.aa && !fragment.f738J && fragment.f764u) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        i4 = 1;
                        i2 = 0;
                        i5 = 0;
                        z4 = z3;
                        break;
                    default:
                        i4 = 0;
                        i2 = 0;
                        i5 = 0;
                        i3 = 0;
                        break;
                }
                bc bcVar = (bc) sparseArray.get(i);
                if (i3 != 0) {
                    a = m1305a(bcVar, sparseArray, i);
                    a.f1389a = fragment;
                    a.f1390b = z;
                    a.f1391c = c0245j;
                } else {
                    a = bcVar;
                }
                if (!(z2 || r4 == 0)) {
                    if (a != null && a.f1392d == fragment) {
                        a.f1392d = null;
                    }
                    ae aeVar = c0245j.f1557a;
                    if (fragment.f755l <= 0 && aeVar.f1314m > 0 && !c0245j.f1576t) {
                        aeVar.m1245b(fragment);
                        aeVar.m1230a(fragment, 1, 0, 0, false);
                    }
                }
                if (i2 == 0 || !(a == null || a.f1392d == null)) {
                    bcVar = a;
                } else {
                    bcVar = m1305a(a, sparseArray, i);
                    bcVar.f1392d = fragment;
                    bcVar.f1393e = z;
                    bcVar.f1394f = c0245j;
                }
                if (!z2 && r7 != 0 && bcVar != null && bcVar.f1389a == fragment) {
                    bcVar.f1389a = null;
                }
            }
        }
    }

    private static bc m1305a(bc bcVar, SparseArray sparseArray, int i) {
        if (bcVar != null) {
            return bcVar;
        }
        bcVar = new bc();
        sparseArray.put(i, bcVar);
        return bcVar;
    }
}
