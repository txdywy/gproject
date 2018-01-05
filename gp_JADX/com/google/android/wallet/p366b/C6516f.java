package com.google.android.wallet.p366b;

import android.text.TextUtils;
import android.view.View;
import com.google.a.a.a.a.b.a.b.a.t;
import com.google.a.a.a.a.b.a.b.a.u;
import com.google.a.a.a.a.b.a.b.a.v;
import com.google.a.a.a.a.b.a.b.a.x;
import com.google.android.wallet.common.util.C6591c;
import com.google.android.wallet.ui.common.cp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

public final class C6516f {
    public static void m29562a(Object obj, long j, C6513c c6513c, C6512i c6512i) {
        if (c6513c != null) {
            if (obj instanceof View) {
                obj = cp.m30912c((View) obj);
            }
            ArrayList arrayList = (ArrayList) c6513c.f32570b.a(j);
            C6508h a = C6516f.m29559a(obj);
            if (!(arrayList == null || a == null)) {
                c6513c.f32569a.a(j, a);
                a.setTriggerListener(c6512i);
                a.mo5456a(arrayList);
            }
            C6511g b = C6516f.m29566b(obj);
            if (b != null) {
                Boolean bool = (Boolean) c6513c.f32572d.a(j);
                Object obj2 = (bool == null || !bool.booleanValue()) ? null : 1;
                if (obj2 != null) {
                    c6513c.m29554a(j, b);
                }
            }
        }
    }

    private static C6508h m29559a(Object obj) {
        if (obj instanceof C6508h) {
            return (C6508h) obj;
        }
        return obj instanceof C6510b ? ((C6510b) obj).getTriggerComponentDelegate() : null;
    }

    private static C6511g m29566b(Object obj) {
        if (obj instanceof C6511g) {
            return (C6511g) obj;
        }
        return obj instanceof C6510b ? ((C6510b) obj).getResultingActionComponentDelegate() : null;
    }

    public static void m29561a(Object obj, long j, C6513c c6513c) {
        if (c6513c != null) {
            if (obj instanceof View) {
                obj = cp.m30912c((View) obj);
            }
            if (C6516f.m29559a(obj) != null) {
                c6513c.f32569a.b(j);
            }
            if (C6516f.m29566b(obj) != null) {
                c6513c.f32571c.b(j);
            }
        }
    }

    public static void m29560a(C6512i c6512i, List list, String str) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C6515e c6515e = (C6515e) list.get(i);
            if (C6516f.m29563a(c6515e.f32578a)) {
                u c = C6516f.m29568c(c6515e.f32578a);
                if (c == null || TextUtils.isEmpty(c.b) || (str != null && Pattern.matches(c.b, str))) {
                    c6512i.mo5460a(c6515e);
                }
            }
        }
    }

    public static boolean m29564a(t tVar, long j) {
        if (C6516f.m29567b(tVar)) {
            u c = C6516f.m29568c(tVar);
            if (c != null && c.a.length != 0) {
                return C6591c.m29907a(c.a, j);
            }
            throw new IllegalStateException("Trigger needs set of values to check against.");
        }
        throw new IllegalArgumentException("Unsupported trigger type: " + tVar.d);
    }

    public static boolean m29563a(t tVar) {
        return tVar.d == 1 || tVar.d == 4;
    }

    public static boolean m29567b(t tVar) {
        return tVar.d == 3 || tVar.d == 4;
    }

    static boolean m29565a(t tVar, t tVar2) {
        if (tVar.c != tVar2.c || tVar.d != tVar2.d) {
            return false;
        }
        switch (tVar.d) {
            case 1:
            case 3:
            case 4:
                u c = C6516f.m29568c(tVar);
                u c2 = C6516f.m29568c(tVar2);
                if (c == null || c2 == null) {
                    if (c != c2) {
                        return false;
                    }
                    return true;
                } else if (c.a.length > 0) {
                    return Arrays.equals(c.a, c2.a);
                } else {
                    if (!TextUtils.isEmpty(c.b)) {
                        return c.b.equals(c2.b);
                    }
                    throw new IllegalArgumentException("ComponentValue has unexpected value.");
                }
            case 2:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                return true;
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Unknown trigger type %d for trigger on component %s", new Object[]{Integer.valueOf(tVar.d), Long.valueOf(tVar.c)}));
        }
    }

    public static u m29568c(t tVar) {
        v vVar = null;
        switch (tVar.d) {
            case 1:
                return tVar.c().a;
            case 2:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                return null;
            case 3:
                x xVar;
                if (tVar.a == 1) {
                    xVar = tVar.f;
                }
                return xVar.a;
            case 4:
                if (tVar.a == 2) {
                    vVar = tVar.g;
                }
                return vVar.a;
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Unknown trigger type for trigger on component %s", new Object[]{Long.valueOf(tVar.c)}));
        }
    }
}
