package com.google.android.finsky.verifier.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.verifier.impl.p261b.C4740a;
import com.google.android.finsky.verifier.impl.p261b.C4745g;
import java.util.ArrayList;

final class df extends BroadcastReceiver {
    public final /* synthetic */ de f24592a;

    df(de deVar) {
        this.f24592a = deVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getIntExtra("android.content.pm.extra.VERIFICATION_ID", -1) == this.f24592a.f24584d) {
            ArrayList arrayList;
            if (this.f24592a.f24591k != null) {
                this.f24592a.f24591k.m13367a(new C2474c(2624));
            }
            int intExtra = intent.getIntExtra("android.content.pm.extra.VERIFICATION_RESULT", 1);
            synchronized (this.f24592a) {
                this.f24592a.f24589i = true;
                arrayList = new ArrayList(this.f24592a.f24586f);
            }
            arrayList = arrayList;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C4740a c4740a = ((C4745g) obj).f24429a;
                if (c4740a instanceof dg) {
                    ((dg) c4740a).mo4370b(intExtra);
                }
            }
            this.f24592a.m22069l();
        }
    }
}
