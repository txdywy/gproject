package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class gz extends ContextWrapper {
    public static final Object f3547a = new Object();
    public static ArrayList f3548b;
    public final Resources f3549c;
    public final Theme f3550d;

    public static Context m3765a(Context context) {
        Object obj = null;
        if (!((context instanceof gz) || (context.getResources() instanceof hb) || (context.getResources() instanceof hv) || (VERSION.SDK_INT >= 21 && !hv.m3848a()))) {
            obj = 1;
        }
        if (obj == null) {
            return context;
        }
        synchronized (f3547a) {
            Context context2;
            if (f3548b == null) {
                f3548b = new ArrayList();
            } else {
                int size;
                WeakReference weakReference;
                for (size = f3548b.size() - 1; size >= 0; size--) {
                    weakReference = (WeakReference) f3548b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f3548b.remove(size);
                    }
                }
                size = f3548b.size() - 1;
                while (size >= 0) {
                    weakReference = (WeakReference) f3548b.get(size);
                    context2 = weakReference != null ? (gz) weakReference.get() : null;
                    if (context2 == null || context2.getBaseContext() != context) {
                        size--;
                    } else {
                        return context2;
                    }
                }
            }
            context2 = new gz(context);
            f3548b.add(new WeakReference(context2));
            return context2;
        }
    }

    private gz(Context context) {
        super(context);
        if (hv.m3848a()) {
            this.f3549c = new hv(this, context.getResources());
            this.f3550d = this.f3549c.newTheme();
            this.f3550d.setTo(context.getTheme());
            return;
        }
        this.f3549c = new hb(this, context.getResources());
        this.f3550d = null;
    }

    public final Theme getTheme() {
        return this.f3550d == null ? super.getTheme() : this.f3550d;
    }

    public final void setTheme(int i) {
        if (this.f3550d == null) {
            super.setTheme(i);
        } else {
            this.f3550d.applyStyle(i, true);
        }
    }

    public final Resources getResources() {
        return this.f3549c;
    }

    public final AssetManager getAssets() {
        return this.f3549c.getAssets();
    }
}
