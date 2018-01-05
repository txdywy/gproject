package com.google.android.finsky.instantapps.p214b;

import android.accounts.Account;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.instantapps.C5265d;
import com.google.android.gms.instantapps.internal.OptInInfo;
import com.google.android.instantapps.common.p217e.bb;
import java.util.concurrent.atomic.AtomicBoolean;

final /* synthetic */ class C3406c implements C1643x {
    public final C3405b f17424a;
    public final AtomicBoolean f17425b;
    public final ConditionVariable f17426c;

    C3406c(C3405b c3405b, AtomicBoolean atomicBoolean, ConditionVariable conditionVariable) {
        this.f17424a = c3405b;
        this.f17425b = atomicBoolean;
        this.f17426c = conditionVariable;
    }

    public final void mo2367a(C4980w c4980w) {
        Object obj = null;
        C3405b c3405b = this.f17424a;
        AtomicBoolean atomicBoolean = this.f17425b;
        ConditionVariable conditionVariable = this.f17426c;
        C5265d c5265d = (C5265d) c4980w;
        if (c5265d.mo4505b().m23271a()) {
            OptInInfo a = c5265d.mo4691a();
            Account[] accountArr = a.f26427c;
            if (accountArr != null && accountArr.length > 0) {
                Object obj2 = a.f26426b;
                if (!TextUtils.isEmpty(obj2)) {
                    for (Account account : accountArr) {
                        if (obj2.equals(account.name)) {
                            obj = account.name;
                            break;
                        }
                    }
                }
                obj = accountArr[0].name;
            }
        }
        if (TextUtils.isEmpty(obj)) {
            c3405b.f17423c.mo5136a(1817);
            atomicBoolean.set(false);
            conditionVariable.open();
            return;
        }
        c3405b.f17423c.mo5136a(1815);
        bb bbVar = c3405b.f17422b;
        bbVar.m27106d().edit().putString("storedCurrentAccount", obj).apply();
        bbVar.m27103a();
        c3405b.f17423c.mo5136a(1816);
        atomicBoolean.set(true);
        conditionVariable.open();
    }
}
