package com.google.android.gms.p155f;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;

final class C5187c extends AsyncTask {
    public /* synthetic */ Context f26127a;
    public /* synthetic */ C1693b f26128b;

    C5187c(Context context, C1693b c1693b) {
        this.f26127a = context;
        this.f26128b = c1693b;
    }

    private final Integer m23948a() {
        try {
            C5186a.m23946a(this.f26127a);
            return Integer.valueOf(0);
        } catch (GooglePlayServicesRepairableException e) {
            return Integer.valueOf(e.f25616a);
        } catch (GooglePlayServicesNotAvailableException e2) {
            return Integer.valueOf(e2.f25614a);
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m23948a();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f26128b.cS_();
            return;
        }
        this.f26128b.mo2396a(num.intValue(), C5095d.m23656a(this.f26127a, num.intValue(), "pi"));
    }
}
