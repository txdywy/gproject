package com.google.android.finsky.permissionui;

import android.content.Context;
import com.google.android.finsky.cq.C2360a;
import com.google.android.finsky.cq.C2363d;

public final class C3879f {
    public final C2360a f19302a;
    public final C2363d f19303b;

    public C3879f(C2363d c2363d, C2360a c2360a) {
        this.f19303b = c2363d;
        this.f19302a = c2360a;
    }

    public final C3875a m18370a(Context context, String str, String[] strArr, boolean z, boolean z2) {
        return new C3875a(context, this.f19303b, this.f19302a, str, strArr, z, z2);
    }
}
