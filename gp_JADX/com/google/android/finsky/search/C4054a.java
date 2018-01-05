package com.google.android.finsky.search;

import android.os.AsyncTask;
import java.util.List;

final class C4054a extends AsyncTask {
    public C4056i f20374a;
    public final /* synthetic */ String f20375b;
    public final /* synthetic */ FinskySearch f20376c;

    C4054a(FinskySearch finskySearch, String str) {
        this.f20376c = finskySearch;
        this.f20375b = str;
    }

    private final List m18973a() {
        synchronized (this.f20376c) {
            long j = this.f20376c.f20367f;
        }
        if (j > 0) {
            long currentTimeMillis = j - System.currentTimeMillis();
            if (currentTimeMillis > 0) {
                try {
                    Thread.sleep(currentTimeMillis);
                } catch (InterruptedException e) {
                    cancel(false);
                }
            }
        }
        if (isCancelled()) {
            return null;
        }
        synchronized (this.f20376c) {
            this.f20376c.f20367f = System.currentTimeMillis() + ((long) this.f20376c.f20366e);
        }
        C4065l c4065l = new C4065l(this.f20376c.f20363b, this.f20376c.f20368g);
        this.f20374a = new C4059e(this.f20376c.f20363b, this.f20376c.f20368g, this.f20376c.f20369h, this.f20375b, c4065l, this.f20376c.f20364c, this.f20376c.f20365d, this.f20376c.f20373l);
        this.f20376c.f20372k = this.f20375b;
        new C4057c(this.f20375b, this.f20376c.f20363b, c4065l).m18976b();
        this.f20374a.m18976b();
        return c4065l.f20407b;
    }

    protected final void onCancelled() {
        if (this.f20374a != null) {
            this.f20374a.mo3896a();
            this.f20374a = null;
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        List list = (List) obj;
        if (!isCancelled()) {
            this.f20376c.setSuggestions(list);
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m18973a();
    }
}
