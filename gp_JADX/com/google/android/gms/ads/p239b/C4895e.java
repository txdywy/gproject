package com.google.android.gms.ads.p239b;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.common.util.C5159n;
import com.google.android.gms.internal.tu;

final class C4895e extends tu {
    public final /* synthetic */ C4066d f25252a;

    C4895e(C4066d c4066d) {
        this.f25252a = c4066d;
    }

    public final void mo4464a(Bundle bundle) {
        synchronized (this.f25252a.f20414d) {
            if (this.f25252a.f20415e) {
                return;
            }
            Context context = this.f25252a;
            int callingUid = Binder.getCallingUid();
            if (callingUid != context.f20411a) {
                if (C5159n.m23895a(context, callingUid)) {
                    context.f20411a = callingUid;
                } else {
                    throw new SecurityException("Caller is not GooglePlayServices.");
                }
            }
            this.f25252a.f20412b.execute(new C4899i(this, bundle));
        }
    }
}
