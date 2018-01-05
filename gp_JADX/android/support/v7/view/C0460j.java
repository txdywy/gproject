package android.support.v7.view;

import android.view.InflateException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;

final class C0460j implements OnMenuItemClickListener {
    public static final Class[] f2577a = new Class[]{MenuItem.class};
    public Object f2578b;
    public Method f2579c;

    public C0460j(Object obj, String str) {
        this.f2578b = obj;
        Class cls = obj.getClass();
        try {
            this.f2579c = cls.getMethod(str, f2577a);
        } catch (Throwable e) {
            InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.f2579c.getReturnType() == Boolean.TYPE) {
                return ((Boolean) this.f2579c.invoke(this.f2578b, new Object[]{menuItem})).booleanValue();
            }
            this.f2579c.invoke(this.f2578b, new Object[]{menuItem});
            return true;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
