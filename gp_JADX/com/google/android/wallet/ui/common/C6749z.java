package com.google.android.wallet.ui.common;

import android.text.TextUtils;
import android.view.View;
import com.google.android.wallet.common.util.C6591c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class C6749z {
    public final long f33284d;
    public final Object f33285e;

    public C6749z(ai aiVar) {
        this(aiVar.mo5520Y(), aiVar);
    }

    public C6749z(long j, Object obj) {
        this.f33284d = j;
        this.f33285e = obj;
    }

    public static boolean m30559a(List list, long[] jArr, boolean z) {
        if (jArr != null && jArr.length == 0) {
            return true;
        }
        int size = list.size();
        int i = 0;
        boolean z2 = true;
        while (i < size) {
            boolean z3;
            C6749z c6749z = (C6749z) list.get(i);
            Object obj = c6749z.f33285e;
            if (obj instanceof ay) {
                long[] jArr2;
                ay ayVar = (ay) obj;
                if (C6749z.m30556a(c6749z.f33284d, jArr)) {
                    jArr2 = null;
                } else {
                    jArr2 = jArr;
                }
                if (z) {
                    z3 = ayVar.mo5524a(jArr2) && z2;
                } else if (!ayVar.mo5526b(jArr2)) {
                    return false;
                } else {
                    z3 = z2;
                }
            } else {
                if (C6749z.m30556a(c6749z.f33284d, jArr)) {
                    if (obj instanceof aa) {
                        aa aaVar = (aa) obj;
                        if (z) {
                            z3 = aaVar.cQ_() && z2;
                        } else if (!aaVar.mo5581e()) {
                            return false;
                        } else {
                            z3 = z2;
                        }
                    } else if (!(obj instanceof View)) {
                        throw new IllegalStateException(String.format("Unexpected field type: %s", new Object[]{obj.getClass().getName()}));
                    } else if (z) {
                        z3 = cp.m30907a((View) obj, true) && z2;
                    } else if (!cp.m30907a((View) obj, false)) {
                        return false;
                    }
                }
                z3 = z2;
            }
            i++;
            z2 = z3;
        }
        return z2;
    }

    public static boolean m30558a(List list, long[] jArr) {
        if (jArr != null && jArr.length == 0) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C6749z c6749z = (C6749z) list.get(i);
            Object obj = c6749z.f33285e;
            if (obj instanceof ay) {
                if (((ay) obj).mo5527c(jArr)) {
                    return true;
                }
            } else if (!C6749z.m30556a(c6749z.f33284d, jArr)) {
                continue;
            } else if (obj instanceof aa) {
                if (!TextUtils.isEmpty(((aa) obj).getError())) {
                    return true;
                }
            } else if (!(obj instanceof View)) {
                throw new IllegalStateException(String.format("Unexpected field type: %s", new Object[]{obj.getClass().getName()}));
            } else if (!TextUtils.isEmpty(cp.m30909b((View) obj))) {
                return true;
            }
        }
        return false;
    }

    public static boolean m30557a(List list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            Object obj = ((C6749z) list.get(i)).f33285e;
            if (obj instanceof ai) {
                if (((ai) obj).cP_()) {
                    return true;
                }
                i++;
            } else if (obj instanceof aa) {
                ((aa) obj).cT_();
                return true;
            } else if (obj instanceof View) {
                ci.m30875b((View) obj);
                return true;
            } else {
                throw new IllegalStateException(String.format("Unexpected field type: %s", new Object[]{obj.getClass().getName()}));
            }
        }
        return false;
    }

    public static boolean m30560b(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((C6749z) list.get(i)).f33285e;
            if (obj instanceof ai) {
                if (((ai) obj).mo5529e()) {
                    return true;
                }
            } else if (obj instanceof aa) {
                aa aaVar = (aa) obj;
                if (!TextUtils.isEmpty(aaVar.getError())) {
                    aaVar.cT_();
                    return true;
                }
            } else if (obj instanceof View) {
                View view = (View) obj;
                if (!TextUtils.isEmpty(cp.m30909b(view))) {
                    ci.m30875b(view);
                    return true;
                }
            } else {
                throw new IllegalStateException(String.format("Unexpected field type: %s", new Object[]{obj.getClass().getName()}));
            }
        }
        return false;
    }

    public static boolean m30561c(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((C6749z) list.get(i)).f33285e;
            if (obj instanceof ai) {
                if (((ai) obj).mo5530f()) {
                    return true;
                }
            } else if (obj instanceof aa) {
                aa aaVar = (aa) obj;
                if (!aaVar.mo5581e() || !TextUtils.isEmpty(aaVar.getError())) {
                    aaVar.cT_();
                    return true;
                }
            } else if (obj instanceof View) {
                View view = (View) obj;
                if (!cp.m30907a(view, false) || !TextUtils.isEmpty(cp.m30909b(view))) {
                    ci.m30875b(view);
                    return true;
                }
            } else {
                String str = "Unexpected field type: ";
                String valueOf = String.valueOf(obj.getClass().getName());
                throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        return false;
    }

    public static String m30554a(List list, String str) {
        String str2 = null;
        if (!C6749z.m30559a(list, null, false)) {
            return "";
        }
        int size = list.size();
        int i = 0;
        while (i < size) {
            String a;
            Object obj = ((C6749z) list.get(i)).f33285e;
            String str3 = "";
            if (obj instanceof at) {
                a = ((at) obj).mo5522a(str);
            } else if (obj instanceof View) {
                a = cp.m30902a((View) obj);
            } else {
                a = str3;
            }
            if (TextUtils.isEmpty(a)) {
                a = str2;
            } else if (str2 != null) {
                a = String.format(str, new Object[]{str2, a});
            }
            i++;
            str2 = a;
        }
        return str2;
    }

    public static void m30555a(List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ((C6749z) list.get(i2)).f33285e;
            if (obj instanceof ai) {
                ((ai) obj).r_(i);
            } else if (obj instanceof View) {
                ((View) obj).setVisibility(i);
            }
        }
    }

    public static ArrayList m30562d(List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((C6749z) list.get(i)).f33285e;
            if (obj instanceof ai) {
                Collection ad = ((ai) obj).ad();
                if (ad != null) {
                    arrayList.addAll(ad);
                }
            } else if (obj instanceof View) {
                arrayList.add((View) obj);
            }
        }
        return arrayList;
    }

    public static View m30563e(List list) {
        if (!list.isEmpty()) {
            Object obj = ((C6749z) list.get(0)).f33285e;
            if (obj instanceof au) {
                return ((au) obj).aj();
            }
            if (obj instanceof RegionCodeView) {
                return ((RegionCodeView) obj).getIconAlignToView();
            }
            if (obj instanceof View) {
                return cp.m30912c((View) obj);
            }
        }
        return null;
    }

    public static FormEditText m30564f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            Object obj = ((C6749z) list.get(size)).f33285e;
            if (obj instanceof au) {
                FormEditText f = C6749z.m30564f(((au) obj).aa());
                if (f != null) {
                    return f;
                }
            } else if (obj instanceof View) {
                View c = cp.m30912c((View) obj);
                if (c instanceof FormEditText) {
                    return (FormEditText) c;
                }
            } else {
                continue;
            }
        }
        return null;
    }

    public static boolean m30565g(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((C6749z) list.get(i)).f33285e;
            if (obj instanceof au) {
                boolean g;
                au auVar = (au) obj;
                if (auVar.l()) {
                    g = C6749z.m30565g(auVar.aa());
                } else {
                    g = false;
                }
                if (!g) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean m30556a(long j, long[] jArr) {
        return jArr == null || (j > 100 && C6591c.m29907a(jArr, j));
    }
}
