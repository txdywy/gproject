package com.google.android.finsky.contentfilterui;

import android.os.AsyncTask;
import com.android.volley.VolleyError;
import com.google.protobuf.nano.i;

protected final class com.google.android.finsky.contentfilterui.b extends AsyncTask
{

    public VolleyError a;
    public final com.google.android.finsky.contentfilterui.a b;

    b(com.google.android.finsky.contentfilterui.a p0) {
        this.b = p0;
        AsyncTask();
    }

    protected final Object doInBackground(Object[] p0) {
        this.a = ((VolleyError[])p0)[0];
        return this.b.b();
    }

    protected final void onPostExecute(Object p0) {
        if ((com.google.protobuf.nano.i)p0 == 0)
            com.google.android.finsky.contentfilterui.a.a(this.b, this.a);
        else
            this.b.b((com.google.protobuf.nano.i)p0);
    }

}
