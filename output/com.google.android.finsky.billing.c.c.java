package com.google.android.finsky.billing.c;

import android.os.AsyncTask;
import com.google.android.finsky.billing.e.k;
import com.google.android.finsky.billing.e.r;
import com.google.android.finsky.dialogbuilder.b.h;
import com.google.wireless.android.finsky.dfe.c.a.ea;

protected final class com.google.android.finsky.billing.c.c extends AsyncTask
{

    public final com.google.wireless.android.finsky.dfe.c.a.ea a;
    public final com.google.android.finsky.billing.c.f b;
    public final com.google.android.finsky.billing.c.b c;

    c(com.google.android.finsky.billing.c.b p0, com.google.wireless.android.finsky.dfe.c.a.ea p1, com.google.android.finsky.billing.c.f p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
        AsyncTask();
    }

    protected final Object doInBackground(Object[] p0) {
        v0 = 0;
        if (this.a.a & 8)
            v1 = 1;
        else
            v1 = 0;
        if (v1 != 0) {
            v0 = this.c.c.b(this.a.e);
            if (v0 == 0 && this.a.d()) {
                v0 = this.a.d;
                this.c.c.a(this.a.e, v0);
            }
        }
        return this.c.a.a(this.c.b, ((String[])p0)[0], this.a.c, v0);
    }

    protected final void onPostExecute(Object p0) {
        this.c.h = ((com.google.android.finsky.billing.e.r)p0).a;
        if (((com.google.android.finsky.billing.e.r)p0).a == 0) {
            this.c.f = ((com.google.android.finsky.billing.e.r)p0).b;
            this.c.e = Boolean.TRUE;
            this.c.d.b();
            this.b.a(this.c.f);
        }
        else {
            this.c.g = this.c.g + 1;
            this.c.e = Boolean.FALSE;
            if (this.c.g < this.a.b)
                v0 = 1;
            else
                v0 = 0;
            this.b.a(v0);
        }
    }

}
