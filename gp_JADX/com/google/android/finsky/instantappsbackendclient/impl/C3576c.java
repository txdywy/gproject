package com.google.android.finsky.instantappsbackendclient.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.android.vending.p057c.C0638a;
import com.android.vending.p057c.C0640c;

final class C3576c {
    public final Context f17875a;

    C3576c(Context context) {
        this.f17875a = context;
    }

    final Bundle m17164a() {
        Context context = null;
        Intent intent = new Intent("com.android.vending.contentfilters.IContentFiltersService.BIND");
        intent.setPackage(this.f17875a.getPackageName());
        ConditionVariable conditionVariable = new ConditionVariable();
        IBinder[] iBinderArr = new IBinder[1];
        ServiceConnection c3577d = new C3577d(iBinderArr, conditionVariable);
        try {
            if (!this.f17875a.bindService(intent, c3577d, 1)) {
                return context;
            }
            conditionVariable.block();
            if (iBinderArr[0] == null) {
                this.f17875a.unbindService(c3577d);
                return null;
            }
            C0638a c0638a;
            IBinder iBinder = iBinderArr[0];
            if (iBinder == null) {
                c0638a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.contentfilters.IContentFiltersService");
                if (queryLocalInterface instanceof C0638a) {
                    c0638a = (C0638a) queryLocalInterface;
                } else {
                    c0638a = new C0640c(iBinder);
                }
            }
            Bundle a = c0638a.mo1051a(new int[]{1});
            if (a == null) {
                this.f17875a.unbindService(c3577d);
                return null;
            }
            a = a.getBundle("1");
            this.f17875a.unbindService(c3577d);
            return a;
        } catch (Throwable e) {
            Log.e("ContentFilterProvider", "Error calling IContentFiltersService", e);
            return context;
        } finally {
            context = this.f17875a;
            context.unbindService(c3577d);
        }
    }
}
