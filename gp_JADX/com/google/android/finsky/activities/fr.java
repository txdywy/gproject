package com.google.android.finsky.activities;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.widget.em;
import android.support.v7.widget.ff;
import com.google.android.finsky.bg.C1604d;
import com.google.android.finsky.stream.base.playcluster.PlayClusterViewContentV2;
import com.google.android.finsky.utils.FinskyLog;

public final class fr extends AsyncTask {
    public final ff f6821a;
    public final Context f6822b;
    public PlayClusterViewContentV2 f6823c;

    fr(Context context, ff ffVar) {
        this.f6821a = ffVar;
        this.f6822b = context;
    }

    protected final void onPreExecute() {
        super.onPreExecute();
        this.f6823c = new PlayClusterViewContentV2(this.f6822b);
    }

    private final Void m6563a(Integer... numArr) {
        if (numArr == null || numArr.length == 0 || numArr.length % 2 != 0) {
            FinskyLog.m21669e("Wrong PreInflateAsyncTask params, an even number of params is expected", new Object[0]);
        }
        FinskyLog.m21662b("Starting preinflation", new Object[0]);
        em fsVar = new fs(C1604d.m9232a(this.f6822b));
        int i = 0;
        while (i < numArr.length) {
            int intValue = numArr[i].intValue();
            int i2 = i + 1;
            int intValue2 = numArr[i2].intValue();
            for (i = 0; i < intValue2 && this.f6821a.mo2353a(intValue) < intValue2 && !isCancelled(); i++) {
                try {
                    android.support.v7.widget.fr b = fsVar.m3626b(this.f6823c, intValue);
                    if (b.f3211a != null) {
                        this.f6821a.mo2356a(b);
                    }
                } catch (RuntimeException e) {
                }
            }
            i = i2 + 1;
        }
        return null;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m6563a((Integer[]) objArr);
    }
}
