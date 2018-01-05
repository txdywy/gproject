package com.google.android.gms.internal;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.C5620h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public final class nx {
    private static int m25240a(String str, ob[] obVarArr) {
        int i = 14;
        for (ob obVar : obVarArr) {
            if (i == 14) {
                if (obVar.f27221b == 9 || obVar.f27221b == 2 || obVar.f27221b == 6) {
                    i = obVar.f27221b;
                } else if (obVar.f27221b != 14) {
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 48).append("Unexpected TypedValue type: ").append(obVar.f27221b).append(" for key ").append(str).toString());
                }
            } else if (obVar.f27221b != i) {
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 126).append("The ArrayList elements should all be the same type, but ArrayList with key ").append(str).append(" contains items of type ").append(i).append(" and ").append(obVar.f27221b).toString());
            }
        }
        return i;
    }

    public static C5620h m25242a(ny nyVar) {
        C5620h c5620h = new C5620h();
        for (oa oaVar : nyVar.f27214a.f27216a) {
            m25244a(nyVar.f27215b, c5620h, oaVar.f27218b, oaVar.f27219c);
        }
        return c5620h;
    }

    private static ArrayList m25243a(List list, oc ocVar, int i) {
        ArrayList arrayList = new ArrayList(ocVar.f27232j.length);
        for (ob obVar : ocVar.f27232j) {
            if (obVar.f27221b == 14) {
                arrayList.add(null);
            } else if (i == 9) {
                C5620h c5620h = new C5620h();
                for (oa oaVar : obVar.f27222c.f27231i) {
                    m25244a(list, c5620h, oaVar.f27218b, oaVar.f27219c);
                }
                arrayList.add(c5620h);
            } else if (i == 2) {
                arrayList.add(obVar.f27222c.f27224b);
            } else if (i == 6) {
                arrayList.add(Integer.valueOf(obVar.f27222c.f27228f));
            } else {
                throw new IllegalArgumentException("Unexpected typeOfArrayList: " + i);
            }
        }
        return arrayList;
    }

    private static void m25244a(List list, C5620h c5620h, String str, ob obVar) {
        int i = obVar.f27221b;
        if (i == 14) {
            c5620h.m26646a(str, null);
            return;
        }
        oc ocVar = obVar.f27222c;
        if (i == 1) {
            c5620h.m26649a(str, ocVar.f27223a);
        } else if (i == 11) {
            c5620h.m26652a(str, ocVar.f27233k);
        } else if (i == 12) {
            c5620h.m26651a(str, ocVar.f27234l);
        } else if (i == 15) {
            c5620h.m26650a(str, ocVar.f27235m);
        } else if (i == 2) {
            c5620h.m26646a(str, ocVar.f27224b);
        } else if (i == 3) {
            c5620h.m26640a(str, ocVar.f27225c);
        } else if (i == 4) {
            c5620h.m26641a(str, ocVar.f27226d);
        } else if (i == 5) {
            c5620h.m26643a(str, ocVar.f27227e);
        } else if (i == 6) {
            c5620h.m26642a(str, ocVar.f27228f);
        } else if (i == 7) {
            c5620h.m26639a(str, (byte) ocVar.f27229g);
        } else if (i == 8) {
            c5620h.m26648a(str, ocVar.f27230h);
        } else if (i == 13) {
            if (list == null) {
                String str2 = "populateBundle: unexpected type for: ";
                String valueOf = String.valueOf(str);
                throw new RuntimeException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            c5620h.m26644a(str, (Asset) list.get((int) ocVar.f27236n));
        } else if (i == 9) {
            C5620h c5620h2 = new C5620h();
            for (oa oaVar : ocVar.f27231i) {
                m25244a(list, c5620h2, oaVar.f27218b, oaVar.f27219c);
            }
            c5620h.m26645a(str, c5620h2);
        } else if (i == 10) {
            i = m25240a(str, ocVar.f27232j);
            ArrayList a = m25243a(list, ocVar, i);
            if (i == 14) {
                c5620h.m26656c(str, a);
            } else if (i == 9) {
                c5620h.m26647a(str, a);
            } else if (i == 2) {
                c5620h.m26656c(str, a);
            } else if (i == 6) {
                c5620h.m26655b(str, a);
            } else {
                throw new IllegalStateException("Unexpected typeOfArrayList: " + i);
            }
        } else {
            throw new RuntimeException("populateBundle: unexpected type " + i);
        }
    }

    public static oa[] m25245a(C5620h c5620h, List list) {
        TreeSet treeSet = new TreeSet(c5620h.f28575a.keySet());
        oa[] oaVarArr = new oa[treeSet.size()];
        Iterator it = treeSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            Object b = c5620h.m26654b(str);
            oaVarArr[i] = new oa();
            oaVarArr[i].f27218b = str;
            oaVarArr[i].f27219c = m25241a(list, b);
            i++;
        }
        return oaVarArr;
    }

    private static ob m25241a(List list, Object obj) {
        ob obVar = new ob();
        if (obj == null) {
            obVar.f27221b = 14;
            return obVar;
        }
        obVar.f27222c = new oc();
        if (obj instanceof String) {
            obVar.f27221b = 2;
            obVar.f27222c.f27224b = (String) obj;
        } else if (obj instanceof Integer) {
            obVar.f27221b = 6;
            obVar.f27222c.f27228f = ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            obVar.f27221b = 5;
            obVar.f27222c.f27227e = ((Long) obj).longValue();
        } else if (obj instanceof Double) {
            obVar.f27221b = 3;
            obVar.f27222c.f27225c = ((Double) obj).doubleValue();
        } else if (obj instanceof Float) {
            obVar.f27221b = 4;
            obVar.f27222c.f27226d = ((Float) obj).floatValue();
        } else if (obj instanceof Boolean) {
            obVar.f27221b = 8;
            obVar.f27222c.f27230h = ((Boolean) obj).booleanValue();
        } else if (obj instanceof Byte) {
            obVar.f27221b = 7;
            obVar.f27222c.f27229g = ((Byte) obj).byteValue();
        } else if (obj instanceof byte[]) {
            obVar.f27221b = 1;
            obVar.f27222c.f27223a = (byte[]) obj;
        } else if (obj instanceof String[]) {
            obVar.f27221b = 11;
            obVar.f27222c.f27233k = (String[]) obj;
        } else if (obj instanceof long[]) {
            obVar.f27221b = 12;
            obVar.f27222c.f27234l = (long[]) obj;
        } else if (obj instanceof float[]) {
            obVar.f27221b = 15;
            obVar.f27222c.f27235m = (float[]) obj;
        } else if (obj instanceof Asset) {
            obVar.f27221b = 13;
            oc ocVar = obVar.f27222c;
            list.add((Asset) obj);
            ocVar.f27236n = (long) (list.size() - 1);
        } else if (obj instanceof C5620h) {
            obVar.f27221b = 9;
            C5620h c5620h = (C5620h) obj;
            TreeSet treeSet = new TreeSet(c5620h.f28575a.keySet());
            oa[] oaVarArr = new oa[treeSet.size()];
            Iterator it = treeSet.iterator();
            r1 = 0;
            while (it.hasNext()) {
                r0 = (String) it.next();
                oaVarArr[r1] = new oa();
                oaVarArr[r1].f27218b = r0;
                oaVarArr[r1].f27219c = m25241a(list, c5620h.m26654b(r0));
                r1++;
            }
            obVar.f27222c.f27231i = oaVarArr;
        } else if (obj instanceof ArrayList) {
            obVar.f27221b = 10;
            ArrayList arrayList = (ArrayList) obj;
            ob[] obVarArr = new ob[arrayList.size()];
            Object obj2 = null;
            int size = arrayList.size();
            int i = 0;
            int i2 = 14;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                ob a = m25241a(list, obj3);
                if (a.f27221b == 14 || a.f27221b == 2 || a.f27221b == 6 || a.f27221b == 9) {
                    if (i2 == 14 && a.f27221b != 14) {
                        r1 = a.f27221b;
                    } else if (a.f27221b != i2) {
                        String valueOf = String.valueOf(obj2.getClass());
                        r0 = String.valueOf(obj3.getClass());
                        throw new IllegalArgumentException(new StringBuilder((String.valueOf(valueOf).length() + 80) + String.valueOf(r0).length()).append("ArrayList elements must all be of the sameclass, but this one contains a ").append(valueOf).append(" and a ").append(r0).toString());
                    } else {
                        obj3 = obj2;
                        r1 = i2;
                    }
                    obVarArr[i] = a;
                    i++;
                    i2 = r1;
                    obj2 = obj3;
                } else {
                    r0 = String.valueOf(obj3.getClass());
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(r0).length() + 130).append("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ").append(r0).toString());
                }
            }
            obVar.f27222c.f27232j = obVarArr;
        } else {
            String str = "newFieldValueFromValue: unexpected value ";
            r0 = String.valueOf(obj.getClass().getSimpleName());
            throw new RuntimeException(r0.length() != 0 ? str.concat(r0) : new String(str));
        }
        return obVar;
    }
}
