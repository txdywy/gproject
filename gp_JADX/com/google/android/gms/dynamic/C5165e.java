package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C5105f;
import com.google.android.gms.common.internal.am;

public abstract class C5165e {
    public final String f26106a;
    public Object f26107b;

    public C5165e(String str) {
        this.f26106a = str;
    }

    public final Object m23908a(Context context) {
        if (this.f26107b == null) {
            am.m23733a((Object) context);
            Context h = C5105f.m23698h(context);
            if (h == null) {
                throw new zzq("Could not get remote context.");
            }
            try {
                this.f26107b = mo4698a((IBinder) h.getClassLoader().loadClass(this.f26106a).newInstance());
            } catch (Throwable e) {
                throw new zzq("Could not load creator class.", e);
            } catch (Throwable e2) {
                throw new zzq("Could not instantiate creator.", e2);
            } catch (Throwable e22) {
                throw new zzq("Could not access creator.", e22);
            }
        }
        return this.f26107b;
    }

    public abstract Object mo4698a(IBinder iBinder);
}
