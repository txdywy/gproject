package com.google.android.finsky.verifier.impl;

import android.os.AsyncTask;
import android.os.Bundle;
import com.google.android.finsky.aa.C0955b;
import com.google.android.gms.safetynet.C5571a;
import com.google.android.gms.safetynet.C5573h;

final class cl extends AsyncTask {
    public final /* synthetic */ ck f24547a;

    cl(ck ckVar) {
        this.f24547a = ckVar;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        if (((Boolean) C0955b.cQ.m28964b()).booleanValue() && this.f24547a.f24546a.f24338b.m22254e() == 0) {
            C5573h a = C5571a.m26561a(this.f24547a.f24546a.f24338b.f24499h);
            Bundle bundle = new Bundle();
            bundle.putString("threat_type", this.f24547a.f24546a.f24337a.f24370g);
            bundle.putString("description_string", this.f24547a.f24546a.f24337a.f24365b);
            a.m26565a(1, bundle);
        }
        this.f24547a.f24546a.f24338b.m22069l();
        return null;
    }
}
