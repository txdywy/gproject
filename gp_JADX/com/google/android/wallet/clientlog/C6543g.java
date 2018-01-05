package com.google.android.wallet.clientlog;

import android.text.TextUtils;
import android.util.SparseArray;

final class C6543g {
    public static ThreadLocal f32638a = new C6544h();
    public final SparseArray f32639b = new SparseArray();
    public String f32640c;

    public static C6543g m29717a() {
        return (C6543g) f32638a.get();
    }

    C6543g() {
    }

    public final void m29718a(String str, LogContext logContext) {
        if (!TextUtils.equals(str, this.f32640c)) {
            this.f32640c = str;
            this.f32639b.clear();
        }
        this.f32639b.put(logContext.f32615e, logContext);
    }
}
