package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.p037h.C0305a;
import android.support.v4.view.ai;
import android.support.v7.p040a.C0403j;
import android.support.v7.view.C0455e;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

final class bg {
    public static final Class[] f2347a = new Class[]{Context.class, AttributeSet.class};
    public static final int[] f2348b = new int[]{16843375};
    public static final String[] f2349c = new String[]{"android.widget.", "android.view.", "android.webkit."};
    public static final Map f2350d = new C0305a();
    public final Object[] f2351e = new Object[2];

    bg() {
    }

    final View m2491a(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f2351e[0] = context;
            this.f2351e[1] = attributeSet;
            View a;
            if (-1 == str.indexOf(46)) {
                for (String a2 : f2349c) {
                    a = m2489a(context, str, a2);
                    if (a != null) {
                        return a;
                    }
                }
                this.f2351e[0] = null;
                this.f2351e[1] = null;
                return null;
            }
            a = m2489a(context, str, null);
            this.f2351e[0] = null;
            this.f2351e[1] = null;
            return a;
        } catch (Exception e) {
            return null;
        } finally {
            this.f2351e[0] = null;
            this.f2351e[1] = null;
        }
    }

    static void m2490a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (VERSION.SDK_INT < 15 || ai.f1848a.mo383a(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2348b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new bh(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private final View m2489a(Context context, String str, String str2) {
        Constructor constructor = (Constructor) f2350d.get(str);
        if (constructor == null) {
            try {
                constructor = context.getClassLoader().loadClass(str2 != null ? str2 + str : str).asSubclass(View.class).getConstructor(f2347a);
                f2350d.put(str, constructor);
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2351e);
    }

    static Context m2488a(Context context, AttributeSet attributeSet, boolean z) {
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0403j.View, 0, 0);
        if (z) {
            resourceId = obtainStyledAttributes.getResourceId(C0403j.View_android_theme, 0);
        } else {
            resourceId = 0;
        }
        if (resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(C0403j.View_theme, 0);
            if (resourceId != 0) {
                Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
            }
        }
        int i = resourceId;
        obtainStyledAttributes.recycle();
        if (i == 0) {
            return context;
        }
        if ((context instanceof C0455e) && ((C0455e) context).f2555a == i) {
            return context;
        }
        return new C0455e(context, i);
    }
}
