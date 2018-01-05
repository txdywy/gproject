package android.support.v4.p013b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v4.p028a.p029a.C0202b;
import android.support.v4.p028a.p029a.C0203c;
import android.support.v4.p028a.p029a.C0205e;
import android.support.v4.p028a.p029a.C0207g;
import android.support.v4.p035f.C0288b;
import android.support.v4.p037h.C0314i;
import android.util.Log;

public final class C0272e {
    public static final C0273f f1646a;
    public static final C0314i f1647b = new C0314i(16);

    public static String m1559a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static Typeface m1558a(Context context, C0202b c0202b, Resources resources, int i, int i2, C0207g c0207g) {
        Typeface a;
        if (c0202b instanceof C0205e) {
            C0205e c0205e = (C0205e) c0202b;
            a = C0288b.m1606a(context, c0205e.f1184a, c0207g, c0205e.f1186c == 0, c0205e.f1185b, i2);
        } else {
            a = f1646a.mo367a(context, (C0203c) c0202b, resources, i2);
            if (c0207g != null) {
                if (a != null) {
                    c0207g.m1069a(a, null);
                } else {
                    c0207g.m1070a(null);
                }
            }
        }
        if (a != null) {
            f1647b.m1693a(C0272e.m1559a(resources, i, i2), a);
        }
        return a;
    }

    public static Typeface m1557a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f1646a.mo366a(context, resources, i, str, i2);
        if (a != null) {
            f1647b.m1693a(C0272e.m1559a(resources, i, i2), a);
        }
        return a;
    }

    static {
        if (VERSION.SDK_INT >= 26) {
            f1646a = new C0277i();
        } else {
            if (VERSION.SDK_INT >= 24) {
                if (C0276h.f1650c == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if ((C0276h.f1650c != null ? 1 : null) != null) {
                    f1646a = new C0276h();
                }
            }
            if (VERSION.SDK_INT >= 21) {
                f1646a = new C0275g();
            } else {
                f1646a = new C0274j();
            }
        }
    }
}
