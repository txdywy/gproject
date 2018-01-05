package com.google.android.finsky.tos;

import android.app.Activity;
import android.os.AsyncTask;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.instantapps.C5263b;

final class C4566b extends AsyncTask {
    public final C5263b f23348a;
    public final C5058o f23349b;
    public final String f23350c;
    public final Activity f23351d;
    public final C2495w f23352e;

    C4566b(C5263b c5263b, C5058o c5058o, String str, Activity activity, C2495w c2495w) {
        this.f23348a = c5263b;
        this.f23349b = c5058o;
        this.f23350c = str;
        this.f23351d = activity;
        this.f23352e = c2495w;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.f23348a.mo4676a(this.f23349b, this.f23350c).mo4490a(new C4567c(this));
        return null;
    }
}
