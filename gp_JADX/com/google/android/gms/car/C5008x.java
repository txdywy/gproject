package com.google.android.gms.car;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.api.C4931e;
import com.google.android.gms.common.api.C4949i;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.bd;

final class C5008x extends C4931e {
    C5008x() {
    }

    public final /* synthetic */ C4949i mo4472a(Context context, Looper looper, bd bdVar, Object obj, C1632q c1632q, C1634r c1634r) {
        obj = (C4990e) obj;
        am.m23734a(obj, (Object) "Setting the API options is required.");
        return new ab(context, looper, bdVar, obj.f25492a, obj.f25493b, c1632q, c1634r);
    }
}
