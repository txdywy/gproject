package com.google.android.finsky.dk;

import android.os.AsyncTask;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.bb;

final class C2828e extends AsyncTask {
    public long f15209a;
    public long f15210b;
    public final /* synthetic */ C2826c f15211c;

    C2828e(C2826c c2826c) {
        this.f15211c = c2826c;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.f15211c.f15204f = this.f15209a;
        this.f15211c.f15205g = this.f15210b;
        Long l = (Long) C0955b.jA.m28964b();
        if (l == null || l.longValue() <= 0) {
            this.f15211c.f15206h = this.f15211c.f15202d.m14974a(this.f15209a);
        } else {
            this.f15211c.f15206h = l.longValue();
        }
        this.f15211c.f15203e = C4678i.m21813b();
        this.f15211c.f15207i = false;
        C2826c c2826c = this.f15211c;
        bb.m21791a();
        for (C2829f cc_ : c2826c.f15201c) {
            cc_.cc_();
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.f15209a = C2830g.m14971g();
        this.f15210b = C2830g.m14970d();
        return null;
    }
}
