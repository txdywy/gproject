package android.support.v7.p041b.p042a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p028a.C0216d;
import android.support.v7.widget.ag;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

public final class C0436b {
    public static final ThreadLocal f2509a = new ThreadLocal();
    public static final WeakHashMap f2510b = new WeakHashMap(0);
    public static final Object f2511c = new Object();

    public static ColorStateList m2649a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = C0436b.m2652d(context, i);
        if (d != null) {
            return d;
        }
        ColorStateList c = C0436b.m2651c(context, i);
        if (c == null) {
            return C0216d.m1115b(context, i);
        }
        synchronized (f2511c) {
            SparseArray sparseArray = (SparseArray) f2510b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f2510b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0437c(c, context.getResources().getConfiguration()));
        }
        return c;
    }

    public static Drawable m2650b(Context context, int i) {
        return ag.m3175a().m3184a(context, i, false);
    }

    private static ColorStateList m2651c(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue typedValue = (TypedValue) f2509a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f2509a.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        boolean z = typedValue.type >= 28 && typedValue.type <= 31;
        if (z) {
            return null;
        }
        Resources resources2 = context.getResources();
        try {
            return C0435a.m2647a(resources2, resources2.getXml(i), context.getTheme());
        } catch (Throwable e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m2652d(android.content.Context r5, int r6) {
        /*
        r2 = f2511c;
        monitor-enter(r2);
        r0 = f2510b;	 Catch:{ all -> 0x0035 }
        r0 = r0.get(r5);	 Catch:{ all -> 0x0035 }
        r0 = (android.util.SparseArray) r0;	 Catch:{ all -> 0x0035 }
        if (r0 == 0) goto L_0x0032;
    L_0x000d:
        r1 = r0.size();	 Catch:{ all -> 0x0035 }
        if (r1 <= 0) goto L_0x0032;
    L_0x0013:
        r1 = r0.get(r6);	 Catch:{ all -> 0x0035 }
        r1 = (android.support.v7.p041b.p042a.C0437c) r1;	 Catch:{ all -> 0x0035 }
        if (r1 == 0) goto L_0x0032;
    L_0x001b:
        r3 = r1.f2513b;	 Catch:{ all -> 0x0035 }
        r4 = r5.getResources();	 Catch:{ all -> 0x0035 }
        r4 = r4.getConfiguration();	 Catch:{ all -> 0x0035 }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x0035 }
        if (r3 == 0) goto L_0x002f;
    L_0x002b:
        r0 = r1.f2512a;	 Catch:{ all -> 0x0035 }
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
    L_0x002e:
        return r0;
    L_0x002f:
        r0.remove(r6);	 Catch:{ all -> 0x0035 }
    L_0x0032:
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
        r0 = 0;
        goto L_0x002e;
    L_0x0035:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0035 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.b.a.b.d(android.content.Context, int):android.content.res.ColorStateList");
    }
}
