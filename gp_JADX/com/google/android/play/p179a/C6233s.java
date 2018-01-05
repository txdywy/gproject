package com.google.android.play.p179a;

import android.util.Log;
import java.lang.reflect.Array;

public final class C6233s {
    public final int f31216a;
    public int f31217b = 0;
    public int f31218c = 0;
    public Object[] f31219d;
    public Class f31220e;

    public C6233s(Class cls, int i) {
        this.f31216a = i;
        this.f31219d = (Object[]) Array.newInstance(cls, i);
        this.f31220e = cls;
    }

    public final Object m28735a() {
        Object obj = null;
        synchronized (this) {
            if (this.f31217b > 0) {
                this.f31217b--;
                obj = this.f31219d[this.f31217b];
                this.f31219d[this.f31217b] = null;
            } else {
                try {
                    obj = this.f31220e.newInstance();
                } catch (Throwable e) {
                    Log.wtf(C6232r.f31210a, "Exception from mClazz.newInstance ", e);
                }
            }
        }
        return obj;
    }

    public final void m28736a(Object obj) {
        synchronized (this) {
            if (this.f31217b < this.f31216a) {
                this.f31219d[this.f31217b] = obj;
                this.f31217b++;
                if (this.f31217b > this.f31218c) {
                    this.f31218c = this.f31217b;
                }
            }
        }
    }
}
