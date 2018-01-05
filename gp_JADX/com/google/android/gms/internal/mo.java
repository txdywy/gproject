package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class mo {
    public final jp f27184a;
    public final String f27185b;
    public final String f27186c;
    public volatile Method f27187d = null;
    public final Class[] f27188e;
    public CountDownLatch f27189f = new CountDownLatch(1);

    static {
        mo.class.getSimpleName();
    }

    public mo(jp jpVar, String str, String str2, Class... clsArr) {
        this.f27184a = jpVar;
        this.f27185b = str;
        this.f27186c = str2;
        this.f27188e = clsArr;
        this.f27184a.f27074d.submit(new mp(this));
    }

    public final Method m25171a() {
        if (this.f27187d != null) {
            return this.f27187d;
        }
        try {
            return this.f27189f.await(2, TimeUnit.SECONDS) ? this.f27187d : null;
        } catch (InterruptedException e) {
            return null;
        }
    }

    private final String m25169a(byte[] bArr, String str) {
        jm jmVar = this.f27184a.f27076f;
        return new String(jm.m24962a(bArr, str), "UTF-8");
    }

    static /* synthetic */ void m25170a(mo moVar) {
        try {
            Class loadClass = moVar.f27184a.f27075e.loadClass(moVar.m25169a(moVar.f27184a.f27077g, moVar.f27185b));
            if (loadClass != null) {
                moVar.f27187d = loadClass.getMethod(moVar.m25169a(moVar.f27184a.f27077g, moVar.f27186c), moVar.f27188e);
                if (moVar.f27187d == null) {
                    moVar.f27189f.countDown();
                } else {
                    moVar.f27189f.countDown();
                }
            }
        } catch (zzcy e) {
        } catch (UnsupportedEncodingException e2) {
        } catch (ClassNotFoundException e3) {
        } catch (NoSuchMethodException e4) {
        } catch (NullPointerException e5) {
        } finally {
            moVar.f27189f.countDown();
        }
    }
}
