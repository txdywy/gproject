package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.Method;

final class bh implements OnClickListener {
    public final View f2352a;
    public final String f2353b;
    public Method f2354c;
    public Context f2355d;

    public bh(View view, String str) {
        this.f2352a = view;
        this.f2353b = str;
    }

    public final void onClick(View view) {
        if (this.f2354c == null) {
            String str;
            Context context = this.f2352a.getContext();
            while (context != null) {
                try {
                    if (!context.isRestricted()) {
                        Method method = context.getClass().getMethod(this.f2353b, new Class[]{View.class});
                        if (method != null) {
                            this.f2354c = method;
                            this.f2355d = context;
                        }
                    }
                } catch (NoSuchMethodException e) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id = this.f2352a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f2352a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f2353b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f2352a.getClass() + str);
        }
        try {
            this.f2354c.invoke(this.f2355d, new Object[]{view});
        } catch (Throwable e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (Throwable e22) {
            throw new IllegalStateException("Could not execute method for android:onClick", e22);
        }
    }
}
