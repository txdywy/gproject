package com.google.android.finsky.scheduler;

import android.support.v4.p037h.C0308c;
import android.util.SparseArray;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.scheduler.p238b.C4024b;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.scheduler.p238b.C4028f;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class C4031b {
    public static final int[] f20256a = new int[]{0, 1, 2, 3, 4, 5};
    public static final int f20257b = 6;
    public final List f20258c;

    C4031b(List list) {
        this.f20258c = list;
    }

    final List m18885a() {
        int i = 0;
        if (this.f20258c.isEmpty()) {
            return Collections.emptyList();
        }
        List list = this.f20258c;
        SparseArray sparseArray = new SparseArray(f20257b);
        for (int i2 = 0; i2 < f20257b; i2++) {
            sparseArray.append(i2, new HashSet());
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            C4023a a = ((C4026d) list.get(i3)).m18856a();
            if (a.f20246a.f20157e) {
                ((Set) sparseArray.get(0)).add(Integer.valueOf(i3));
            }
            if (a.f20246a.f20158f) {
                ((Set) sparseArray.get(1)).add(Integer.valueOf(i3));
            }
            if (a.f20246a.f20156d == 1) {
                ((Set) sparseArray.get(2)).add(Integer.valueOf(i3));
            }
            if (a.f20246a.f20156d == 3) {
                ((Set) sparseArray.get(3)).add(Integer.valueOf(i3));
            }
            if (a.f20246a.f20156d == 2) {
                ((Set) sparseArray.get(4)).add(Integer.valueOf(i3));
            }
            if (!(a.f20246a.f20157e || a.f20246a.f20158f || a.f20246a.f20156d != 0)) {
                ((Set) sparseArray.get(5)).add(Integer.valueOf(i3));
            }
        }
        for (Integer intValue : C4031b.m18881a(sparseArray)) {
            ((Set) sparseArray.get(intValue.intValue())).clear();
        }
        int[] b = C4031b.m18883b(sparseArray);
        List arrayList = new ArrayList(f20257b);
        int[] iArr = f20256a;
        int length = iArr.length;
        while (i < length) {
            int i4 = iArr[i];
            if (b[i4] == i4) {
                arrayList.add(Integer.valueOf(i4));
            }
            i++;
        }
        return m18880a(sparseArray, b, arrayList);
    }

    final C4023a m18884a(Set set, boolean z) {
        List<C4026d> list = this.f20258c;
        List arrayList = new ArrayList();
        if (set != null) {
            for (Integer intValue : set) {
                int intValue2 = intValue.intValue();
                if (z) {
                    arrayList.add(C4031b.m18882b((C4026d) list.get(intValue2)));
                } else {
                    arrayList.add(C4031b.m18879a((C4026d) list.get(intValue2)));
                }
            }
        } else {
            for (C4026d c4026d : list) {
                if (z) {
                    arrayList.add(C4031b.m18882b(c4026d));
                } else {
                    arrayList.add(C4031b.m18879a(c4026d));
                }
            }
        }
        List arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) arrayList;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            C4026d c4026d2 = (C4026d) obj;
            C4023a a = c4026d2.m18856a();
            C4024b a2 = a.m18836a();
            long a3 = C4678i.m21812a();
            a2.m18839a(Math.max(0, (a.f20246a.f20154b + c4026d2.f20249a.f20178f) - a3));
            a2.m18843b(Math.max(0, (a.f20246a.f20155c + c4026d2.f20249a.f20178f) - a3));
            arrayList2.add(c4026d2.m18861f().m18866a(a2.m18837a()).m18863a());
        }
        C4024b a4 = ((C4026d) arrayList2.get(0)).m18856a().m18836a();
        arrayList3 = (ArrayList) arrayList2;
        size = arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            obj = arrayList3.get(i2);
            i2++;
            c4026d2 = (C4026d) obj;
            a4.m18839a(Math.min(c4026d2.m18856a().f20246a.f20154b, a4.f20247a.f20154b));
            a4.m18843b(Math.min(c4026d2.m18856a().f20246a.f20155c, a4.f20247a.f20155c));
        }
        return a4.m18837a();
    }

    private final List m18880a(SparseArray sparseArray, int[] iArr, List list) {
        List arrayList = new ArrayList(list.size());
        for (Integer intValue : list) {
            int intValue2 = intValue.intValue();
            if (!((Set) sparseArray.get(intValue2)).isEmpty()) {
                C4023a a = m18884a((Set) sparseArray.get(intValue2), false);
                C4024b b = new C4024b().m18839a(a.f20246a.f20154b).m18843b(a.f20246a.f20155c);
                for (int i : f20256a) {
                    if (!((Set) sparseArray.get(i)).isEmpty() && iArr[i] == intValue2) {
                        switch (i) {
                            case 0:
                                b.m18840a(true);
                                break;
                            case 1:
                                b.m18844b(true);
                                break;
                            case 2:
                                b.m18838a(1);
                                break;
                            case 3:
                                b.m18838a(3);
                                break;
                            case 4:
                                b.m18838a(2);
                                break;
                            case 5:
                                break;
                            default:
                                FinskyLog.m21665c("Unknown constraint type: %d", Integer.valueOf(i));
                                break;
                        }
                    }
                }
                arrayList.add(b.m18837a());
            }
        }
        return arrayList;
    }

    private static C4026d m18879a(C4026d c4026d) {
        if (((Boolean) C0955b.jd.m28964b()).booleanValue()) {
            return c4026d;
        }
        int c = c4026d.m18858c();
        if (c == 0) {
            return c4026d;
        }
        C4028f[] b = c4026d.m18857b();
        int i = 0;
        c--;
        while (c >= 0 && b[c].f20251a.f20186c >= c4026d.f20249a.f20178f && b[c].f20251a.f20188e) {
            i++;
            c--;
        }
        if (i == 0) {
            return c4026d;
        }
        long longValue = ((Long) C0955b.je.m28964b()).longValue();
        if (((Long) C0955b.jc.m28964b()).longValue() <= Long.MAX_VALUE / ((long) Math.pow(2.0d, (double) Math.min(63, i)))) {
            longValue = ((long) Math.pow(2.0d, (double) i)) * ((Long) C0955b.jc.m28964b()).longValue();
        }
        long min = Math.min(longValue, ((Long) C0955b.je.m28964b()).longValue());
        C4028f c4028f = b[b.length - 1];
        return c4026d.m18861f().m18866a(c4026d.m18856a().m18836a().m18839a(Math.min((min + (c4028f.f20251a.f20190g + c4028f.f20251a.f20186c)) - c4026d.f20249a.f20178f, c4026d.m18856a().f20246a.f20155c)).m18837a()).m18863a();
    }

    private static C4026d m18882b(C4026d c4026d) {
        int c = c4026d.m18858c();
        if (c == 0) {
            return c4026d;
        }
        C4028f[] b = c4026d.m18857b();
        int i = 0;
        c--;
        while (c >= 0 && b[c].f20251a.f20186c >= c4026d.f20249a.f20178f) {
            i++;
            c--;
        }
        return c4026d.m18861f().m18866a(c4026d.m18856a().m18836a().m18839a(Math.min((((Long) C0955b.jf.m28964b()).longValue() * ((long) i)) + c4026d.m18856a().f20246a.f20154b, c4026d.m18856a().f20246a.f20155c)).m18837a()).m18863a();
    }

    private static Set m18881a(SparseArray sparseArray) {
        Set c0308c = new C0308c(f20257b);
        for (int i : f20256a) {
            for (int i2 = i + 1; i2 < f20257b; i2++) {
                if (((Set) sparseArray.get(i)).size() != ((Set) sparseArray.get(i2)).size()) {
                    int i3;
                    int i4;
                    if (((Set) sparseArray.get(i)).size() > ((Set) sparseArray.get(i2)).size()) {
                        i3 = i;
                        i4 = i2;
                    } else {
                        i3 = i2;
                        i4 = i;
                    }
                    if (((Set) sparseArray.get(i3)).containsAll((Set) sparseArray.get(i4))) {
                        c0308c.add(Integer.valueOf(i4));
                    }
                }
            }
        }
        return c0308c;
    }

    private static int[] m18883b(SparseArray sparseArray) {
        int[] iArr = new int[f20257b];
        for (int i : f20256a) {
            iArr[i] = i;
        }
        for (int i2 : f20256a) {
            Set set = (Set) sparseArray.get(i2);
            int i3 = i2 + 1;
            while (i3 < f20257b) {
                if (iArr[i3] == i3 && set.containsAll((Set) sparseArray.get(i3))) {
                    iArr[i3] = i2;
                }
                i3++;
            }
        }
        return iArr;
    }
}
