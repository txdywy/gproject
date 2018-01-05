package com.google.android.finsky.family.remoteescalation.p202a;

import android.widget.Toast;
import com.android.volley.C0660x;
import com.google.wireless.android.finsky.dfe.h.a.ae;
import com.google.wireless.android.finsky.dfe.h.a.ar;

final class C3079b implements C0660x {
    public final /* synthetic */ ae f15997a;
    public final /* synthetic */ C3078a f15998b;

    C3079b(C3078a c3078a, ae aeVar) {
        this.f15998b = c3078a;
        this.f15997a = aeVar;
    }

    public final /* synthetic */ void b_(Object obj) {
        Toast.makeText(this.f15998b.f15992b, ((ar) obj).c, 1).show();
        this.f15998b.f15995e.m15803a(this.f15997a);
    }
}
