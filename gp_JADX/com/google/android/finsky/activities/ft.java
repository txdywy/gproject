package com.google.android.finsky.activities;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.em;
import android.support.v7.widget.ff;
import android.support.v7.widget.fr;
import com.google.android.finsky.bg.C1604d;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.utils.FinskyLog;

public final class ft extends AsyncTask {
    public final ff f6825a;
    public final Context f6826b;
    public PlayRecyclerView f6827c;

    ft(Context context, ff ffVar) {
        this.f6825a = ffVar;
        this.f6826b = context;
    }

    protected final void onPreExecute() {
        super.onPreExecute();
        this.f6827c = new PlayRecyclerView(this.f6826b);
        this.f6827c.setLayoutManager(new LinearLayoutManager());
    }

    private final Void m6567a(Integer... numArr) {
        if (numArr == null || numArr.length == 0 || numArr.length % 2 != 0) {
            FinskyLog.m21669e("Wrong PreInflateAsyncTask params, an even number of params is expected", new Object[0]);
        }
        FinskyLog.m21662b("Starting preinflation", new Object[0]);
        em fuVar = new fu(C1604d.m9232a(this.f6826b));
        int i = 0;
        while (i < numArr.length) {
            int intValue = numArr[i].intValue();
            int i2 = i + 1;
            int intValue2 = numArr[i2].intValue();
            for (i = 0; i < intValue2 && this.f6825a.mo2353a(intValue) < intValue2 && !isCancelled(); i++) {
                try {
                    fr b = fuVar.m3626b(this.f6827c, intValue);
                    if (b.f3211a != null) {
                        this.f6825a.mo2356a(b);
                    }
                } catch (RuntimeException e) {
                }
            }
            i = i2 + 1;
        }
        return null;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m6567a((Integer[]) objArr);
    }
}
