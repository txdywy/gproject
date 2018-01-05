package com.google.android.gms.wearable;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.nx;
import com.google.android.gms.internal.ny;
import com.google.android.gms.internal.nz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public final class C5620h {
    public final HashMap f28575a = new HashMap();

    private static C5620h m26633a(Bundle bundle) {
        bundle.setClassLoader(Asset.class.getClassLoader());
        C5620h c5620h = new C5620h();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                c5620h.m26646a(str, (String) obj);
            } else if (obj instanceof Integer) {
                c5620h.m26642a(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                c5620h.m26643a(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                c5620h.m26640a(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Float) {
                c5620h.m26641a(str, ((Float) obj).floatValue());
            } else if (obj instanceof Boolean) {
                c5620h.m26648a(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                c5620h.m26639a(str, ((Byte) obj).byteValue());
            } else if (obj instanceof byte[]) {
                c5620h.m26649a(str, (byte[]) obj);
            } else if (obj instanceof String[]) {
                c5620h.m26652a(str, (String[]) obj);
            } else if (obj instanceof long[]) {
                c5620h.m26651a(str, (long[]) obj);
            } else if (obj instanceof float[]) {
                c5620h.m26650a(str, (float[]) obj);
            } else if (obj instanceof Asset) {
                c5620h.m26644a(str, (Asset) obj);
            } else if (obj instanceof Bundle) {
                c5620h.m26645a(str, C5620h.m26633a((Bundle) obj));
            } else if (obj instanceof ArrayList) {
                Object obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    obj2 = null;
                } else {
                    arrayList = arrayList;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj3 = arrayList.get(i);
                        i++;
                        if (obj3 != null) {
                            if (obj3 instanceof Integer) {
                                obj2 = 2;
                            } else if (obj3 instanceof String) {
                                obj2 = 3;
                            } else if (obj3 instanceof C5620h) {
                                obj2 = 4;
                            } else if (obj3 instanceof Bundle) {
                                obj2 = 5;
                            }
                        }
                    }
                    obj2 = 1;
                }
                switch (obj2) {
                    case null:
                        c5620h.m26656c(str, (ArrayList) obj);
                        break;
                    case 1:
                        c5620h.m26656c(str, (ArrayList) obj);
                        break;
                    case 2:
                        c5620h.m26655b(str, (ArrayList) obj);
                        break;
                    case 3:
                        c5620h.m26656c(str, (ArrayList) obj);
                        break;
                    case 5:
                        c5620h.m26647a(str, C5620h.m26635a((ArrayList) obj));
                        break;
                    default:
                        break;
                }
            }
        }
        return c5620h;
    }

    public static C5620h m26634a(byte[] bArr) {
        try {
            return nx.m25242a(new ny(nz.m25246a(bArr), new ArrayList()));
        } catch (Throwable e) {
            throw new IllegalArgumentException("Unable to convert data", e);
        }
    }

    public static ArrayList m26635a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(C5620h.m26633a((Bundle) obj));
        }
        return arrayList2;
    }

    private static void m26636a(String str, Object obj, String str2, ClassCastException classCastException) {
        C5620h.m26637a(str, obj, str2, "<null>", classCastException);
    }

    private static void m26637a(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Key ");
        stringBuilder.append(str);
        stringBuilder.append(" expected ");
        stringBuilder.append(str2);
        stringBuilder.append(" but value was a ");
        stringBuilder.append(obj.getClass().getName());
        stringBuilder.append(".  The default value ");
        stringBuilder.append(obj2);
        stringBuilder.append(" was returned.");
        Log.w("DataMap", stringBuilder.toString());
        Log.w("DataMap", "Attempt to cast generated internal exception:", classCastException);
    }

    public final void m26639a(String str, byte b) {
        this.f28575a.put(str, Byte.valueOf(b));
    }

    public final void m26640a(String str, double d) {
        this.f28575a.put(str, Double.valueOf(d));
    }

    public final void m26641a(String str, float f) {
        this.f28575a.put(str, Float.valueOf(f));
    }

    public final void m26642a(String str, int i) {
        this.f28575a.put(str, Integer.valueOf(i));
    }

    public final void m26643a(String str, long j) {
        this.f28575a.put(str, Long.valueOf(j));
    }

    public final void m26644a(String str, Asset asset) {
        this.f28575a.put(str, asset);
    }

    public final void m26645a(String str, C5620h c5620h) {
        this.f28575a.put(str, c5620h);
    }

    public final void m26646a(String str, String str2) {
        this.f28575a.put(str, str2);
    }

    public final void m26647a(String str, ArrayList arrayList) {
        this.f28575a.put(str, arrayList);
    }

    public final void m26648a(String str, boolean z) {
        this.f28575a.put(str, Boolean.valueOf(z));
    }

    public final void m26649a(String str, byte[] bArr) {
        this.f28575a.put(str, bArr);
    }

    public final void m26650a(String str, float[] fArr) {
        this.f28575a.put(str, fArr);
    }

    public final void m26651a(String str, long[] jArr) {
        this.f28575a.put(str, jArr);
    }

    public final void m26652a(String str, String[] strArr) {
        this.f28575a.put(str, strArr);
    }

    public final boolean m26653a(String str) {
        return this.f28575a.containsKey(str);
    }

    public final Object m26654b(String str) {
        return this.f28575a.get(str);
    }

    public final void m26655b(String str, ArrayList arrayList) {
        this.f28575a.put(str, arrayList);
    }

    public final void m26656c(String str, ArrayList arrayList) {
        this.f28575a.put(str, arrayList);
    }

    public final boolean m26657c(String str) {
        Object obj = this.f28575a.get(str);
        if (obj == null) {
            return false;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e) {
            C5620h.m26637a(str, obj, "Boolean", Boolean.valueOf(false), e);
            return false;
        }
    }

    public final int m26658d(String str) {
        Object obj = this.f28575a.get(str);
        if (obj == null) {
            return 0;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e) {
            C5620h.m26636a(str, obj, "Integer", e);
            return 0;
        }
    }

    public final long m26659e(String str) {
        Object obj = this.f28575a.get(str);
        if (obj == null) {
            return 0;
        }
        try {
            return ((Long) obj).longValue();
        } catch (ClassCastException e) {
            C5620h.m26636a(str, obj, "long", e);
            return 0;
        }
    }

    public final String m26660f(String str) {
        Object obj = this.f28575a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (ClassCastException e) {
            C5620h.m26636a(str, obj, "String", e);
            return null;
        }
    }

    public final ArrayList m26661g(String str) {
        Object obj = this.f28575a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            C5620h.m26636a(str, obj, "ArrayList<String>", e);
            return null;
        }
    }

    public final ArrayList m26662h(String str) {
        Object obj = this.f28575a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            C5620h.m26636a(str, obj, "ArrayList<DataMap>", e);
            return null;
        }
    }

    public final int hashCode() {
        return this.f28575a.hashCode() * 29;
    }

    public final byte[] m26663i(String str) {
        Object obj = this.f28575a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (byte[]) obj;
        } catch (ClassCastException e) {
            C5620h.m26636a(str, obj, "byte[]", e);
            return null;
        }
    }

    public final String[] m26664j(String str) {
        Object obj = this.f28575a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String[]) obj;
        } catch (ClassCastException e) {
            C5620h.m26636a(str, obj, "String[]", e);
            return null;
        }
    }

    public final String toString() {
        return this.f28575a.toString();
    }

    public final void m26638a(C5620h c5620h) {
        for (String str : c5620h.f28575a.keySet()) {
            this.f28575a.put(str, c5620h.m26654b(str));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5620h)) {
            return false;
        }
        C5620h c5620h = (C5620h) obj;
        if (this.f28575a.size() != c5620h.f28575a.size()) {
            return false;
        }
        for (String str : this.f28575a.keySet()) {
            Object b = m26654b(str);
            Object b2 = c5620h.m26654b(str);
            if (b instanceof Asset) {
                if (!(b2 instanceof Asset)) {
                    return false;
                }
                Asset asset = (Asset) b;
                Asset asset2 = (Asset) b2;
                boolean equals = (asset == null || asset2 == null) ? asset == asset2 : !TextUtils.isEmpty(asset.f28555b) ? asset.f28555b.equals(asset2.f28555b) : Arrays.equals(asset.f28554a, asset2.f28554a);
                if (!equals) {
                    return false;
                }
            } else if (b instanceof String[]) {
                if (!(b2 instanceof String[])) {
                    return false;
                }
                if (!Arrays.equals((String[]) b, (String[]) b2)) {
                    return false;
                }
            } else if (b instanceof long[]) {
                if (!(b2 instanceof long[])) {
                    return false;
                }
                if (!Arrays.equals((long[]) b, (long[]) b2)) {
                    return false;
                }
            } else if (b instanceof float[]) {
                if (!(b2 instanceof float[])) {
                    return false;
                }
                if (!Arrays.equals((float[]) b, (float[]) b2)) {
                    return false;
                }
            } else if (b instanceof byte[]) {
                if (!(b2 instanceof byte[])) {
                    return false;
                }
                if (!Arrays.equals((byte[]) b, (byte[]) b2)) {
                    return false;
                }
            } else if (b == null || b2 == null) {
                if (b != b2) {
                    return false;
                }
                return true;
            } else if (!b.equals(b2)) {
                return false;
            }
        }
        return true;
    }
}
