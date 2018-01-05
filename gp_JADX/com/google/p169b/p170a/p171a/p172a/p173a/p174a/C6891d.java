package com.google.p169b.p170a.p171a.p172a.p173a.p174a;

import android.content.Context;
import com.google.b.a.a.a.a.a.a;
import com.google.common.p414a.C6925j;
import com.google.common.p414a.C6926a;
import java.util.concurrent.Callable;

final class C6891d implements Callable {
    public final /* synthetic */ Context f34015a;
    public final /* synthetic */ a f34016b;

    C6891d(Context context, a aVar) {
        this.f34015a = context;
        this.f34016b = aVar;
    }

    private final C6925j m31278a() {
        try {
            return C6925j.m31605b(new C6890b(this.f34015a, this.f34016b));
        } catch (Exception e) {
            return C6926a.f34255a;
        }
    }

    public final /* synthetic */ Object call() {
        return m31278a();
    }
}
