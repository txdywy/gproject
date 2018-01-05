package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class nd implements Callable {
    public final jp f27109d;
    public String f27110e;
    public String f27111f;
    public final ci f27112g;
    public Method f27113h;
    public int f27114i;
    public int f27115j;

    public nd(jp jpVar, String str, String str2, ci ciVar, int i, int i2) {
        getClass().getSimpleName();
        this.f27109d = jpVar;
        this.f27110e = str;
        this.f27111f = str2;
        this.f27112g = ciVar;
        this.f27114i = i;
        this.f27115j = i2;
    }

    protected abstract void mo4764a();

    public Void mo4791b() {
        try {
            long nanoTime = System.nanoTime();
            this.f27113h = this.f27109d.m24977a(this.f27110e, this.f27111f);
            if (this.f27113h != null) {
                mo4764a();
                fz fzVar = this.f27109d.f27083m;
                if (!(fzVar == null || this.f27114i == Integer.MIN_VALUE)) {
                    int i = this.f27115j;
                    int i2 = this.f27114i;
                    nanoTime = (System.nanoTime() - nanoTime) / 1000;
                    try {
                        fz.f26765b.block();
                        if (fzVar.f26769d.booleanValue() && fz.f26766c != null) {
                            wz bqVar = new bq();
                            bqVar.f26503a = fzVar.f26768a.f27072b.getPackageName();
                            bqVar.f26504b = Long.valueOf(nanoTime);
                            xt xtVar = new xt(fz.f26766c, wz.m24212a(bqVar));
                            xtVar.f27720b = i2;
                            xtVar.f27721c = i;
                            xtVar.m25986a();
                        }
                    } catch (Exception e) {
                    }
                }
            }
        } catch (IllegalAccessException e2) {
        } catch (InvocationTargetException e3) {
        }
        return null;
    }

    public /* synthetic */ Object call() {
        return mo4791b();
    }
}
