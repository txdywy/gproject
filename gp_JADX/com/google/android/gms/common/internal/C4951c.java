package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.C5096b;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.api.C4949i;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import java.util.Set;

public abstract class C4951c extends ar implements C4949i, C4950g {
    public final Set f25434c;
    public final Account f25435d;

    public C4951c(Context context, Looper looper, int i, bd bdVar, C1632q c1632q, C1634r c1634r) {
        this(context, looper, C5119h.m23789a(context), C5096b.f25938a, i, bdVar, (C1632q) am.m23733a((Object) c1632q), (C1634r) am.m23733a((Object) c1634r));
    }

    public final Account mo4479o() {
        return this.f25435d;
    }

    protected final Set mo4480p() {
        return this.f25434c;
    }

    public final zzc[] mo4481q() {
        return new zzc[0];
    }

    private C4951c(Context context, Looper looper, C5119h c5119h, C5096b c5096b, int i, bd bdVar, C1632q c1632q, C1634r c1634r) {
        super(context, looper, c5119h, c5096b, i, c1632q == null ? null : new C5116d(c1632q), c1634r == null ? null : new C5117e(c1634r), bdVar.f26009f);
        this.f25435d = bdVar.f26004a;
        Set<Scope> set = bdVar.f26006c;
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f25434c = set;
    }
}
