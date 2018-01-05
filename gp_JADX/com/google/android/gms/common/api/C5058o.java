package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.bo;
import com.google.android.gms.common.api.internal.cn;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public abstract class C5058o {
    public static final Set f25642a = Collections.newSetFromMap(new WeakHashMap());

    public static Set m23308a() {
        Set set;
        synchronized (f25642a) {
            set = f25642a;
        }
        return set;
    }

    public abstract ConnectionResult mo4542a(long j, TimeUnit timeUnit);

    public C4949i mo4543a(C5056g c5056g) {
        throw new UnsupportedOperationException();
    }

    public cn mo4544a(cn cnVar) {
        throw new UnsupportedOperationException();
    }

    public void mo4545a(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void mo4549a(C1634r c1634r);

    public abstract void mo4550a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public boolean mo4551a(bo boVar) {
        throw new UnsupportedOperationException();
    }

    public Context mo4552b() {
        throw new UnsupportedOperationException();
    }

    public cn mo4553b(cn cnVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void mo4554b(C1634r c1634r);

    public Looper mo4555c() {
        throw new UnsupportedOperationException();
    }

    public void mo4556d() {
        throw new UnsupportedOperationException();
    }

    public abstract void mo4557e();

    public abstract ConnectionResult mo4558f();

    public abstract void mo4559g();

    public abstract void mo4560h();

    public abstract C4954s mo4561i();

    public abstract boolean mo4562j();

    public abstract boolean mo4563k();
}
