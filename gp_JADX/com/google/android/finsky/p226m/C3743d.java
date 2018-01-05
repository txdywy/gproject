package com.google.android.finsky.p226m;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.bb;
import java.util.HashMap;
import java.util.Map;

final class C3743d extends AsyncTask {
    public final Context f18890a;
    public final C2495w f18891b;
    public final /* synthetic */ C3741b f18892c;

    C3743d(C3741b c3741b, Context context, C2495w c2495w) {
        this.f18892c = c3741b;
        this.f18890a = context;
        this.f18891b = c2495w;
    }

    private final Map m17623a() {
        Map a;
        synchronized (this.f18892c.f18886a) {
            Context context = this.f18890a;
            C2495w c2495w = this.f18891b;
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - 31449600000L;
            Context applicationContext = context.getApplicationContext();
            if (VERSION.SDK_INT < 21) {
                a = C3744e.m17625a(applicationContext, c2495w);
            } else {
                a = C3744e.m17624a(applicationContext, j, currentTimeMillis, c2495w);
            }
        }
        return a;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.f18892c.f18887b.putAll((Map) obj);
        C3741b c3741b = this.f18892c;
        bb.m21791a();
        Map hashMap = new HashMap(c3741b.f18887b);
        for (C3742c a : (C3742c[]) c3741b.f18888c.toArray(new C3742c[c3741b.f18888c.size()])) {
            a.mo4134a(hashMap);
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m17623a();
    }
}
