package android.support.p010b;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.C0250o;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public final class C0036j {
    public final Intent f49a;
    public ArrayList f50b;
    public Bundle f51c;
    public ArrayList f52d;
    public boolean f53e;

    public C0036j() {
        this(null);
    }

    public C0036j(C0039m c0039m) {
        IBinder iBinder;
        Throwable e;
        this.f49a = new Intent("android.intent.action.VIEW");
        this.f50b = null;
        this.f51c = null;
        this.f52d = null;
        this.f53e = true;
        if (c0039m != null) {
            this.f49a.setPackage(c0039m.f56c.getPackageName());
        }
        Bundle bundle = new Bundle();
        String str = "android.support.customtabs.extra.SESSION";
        if (c0039m == null) {
            iBinder = null;
        } else {
            iBinder = c0039m.f55b.asBinder();
        }
        if (VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            if (!C0250o.f1587b) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    C0250o.f1586a = method;
                    method.setAccessible(true);
                } catch (Throwable e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e2);
                }
                C0250o.f1587b = true;
            }
            if (C0250o.f1586a != null) {
                try {
                    C0250o.f1586a.invoke(bundle, new Object[]{str, iBinder});
                } catch (InvocationTargetException e3) {
                    e = e3;
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e);
                    C0250o.f1586a = null;
                    this.f49a.putExtras(bundle);
                } catch (IllegalAccessException e4) {
                    e = e4;
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e);
                    C0250o.f1586a = null;
                    this.f49a.putExtras(bundle);
                } catch (IllegalArgumentException e5) {
                    e = e5;
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e);
                    C0250o.f1586a = null;
                    this.f49a.putExtras(bundle);
                }
            }
        }
        this.f49a.putExtras(bundle);
    }

    public final C0036j m41a(int i) {
        this.f49a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i);
        return this;
    }

    public final C0036j m40a() {
        this.f49a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        return this;
    }

    public final C0035i m42b() {
        if (this.f50b != null) {
            this.f49a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", this.f50b);
        }
        if (this.f52d != null) {
            this.f49a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", this.f52d);
        }
        this.f49a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f53e);
        return new C0035i(this.f49a, this.f51c);
    }
}
