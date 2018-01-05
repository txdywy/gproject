package com.google.android.finsky.p111d;

import com.google.android.finsky.utils.FinskyLog;
import java.lang.reflect.Array;

final class C2479i {
    public final int f13362a;
    public int f13363b = 0;
    public int f13364c = 0;
    public Object[] f13365d;
    public Class f13366e;

    public C2479i(Class cls, int i) {
        this.f13362a = i;
        this.f13365d = (Object[]) Array.newInstance(cls, i);
        this.f13366e = cls;
    }

    public final Object m13275a() {
        Object obj = null;
        synchronized (this) {
            if (this.f13363b > 0) {
                this.f13363b--;
                obj = this.f13365d[this.f13363b];
                this.f13365d[this.f13363b] = null;
            } else {
                try {
                    obj = this.f13366e.newInstance();
                } catch (Throwable e) {
                    FinskyLog.m21663b(e, "Exception from mClazz.newInstance", new Object[0]);
                }
            }
        }
        return obj;
    }

    public final void m13276a(Object obj) {
        synchronized (this) {
            if (this.f13363b < this.f13362a) {
                this.f13365d[this.f13363b] = obj;
                this.f13363b++;
                if (this.f13363b > this.f13364c) {
                    this.f13364c = this.f13363b;
                }
            }
        }
    }
}
