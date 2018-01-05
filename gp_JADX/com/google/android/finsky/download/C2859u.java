package com.google.android.finsky.download;

import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;

final class C2859u extends AsyncTask {
    public final /* synthetic */ C2839b f15310a;
    public final /* synthetic */ C2851n f15311b;

    C2859u(C2851n c2851n, C2839b c2839b) {
        this.f15311b = c2851n;
        this.f15310a = c2839b;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Uri uri = (Uri) obj;
        if (uri == null) {
            FinskyLog.m21667d("null uri for %s", this.f15310a);
            this.f15311b.mo3174a(this.f15310a, 6);
            return;
        }
        FinskyLog.m21659a("Enqueued %s as %s", this.f15310a, uri.toString());
        if (this.f15310a.mo3165o()) {
            this.f15311b.f15295d.mo3187a(uri);
            return;
        }
        this.f15310a.mo3149a(uri);
        this.f15311b.mo3174a(this.f15310a, 2);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f15311b.f15295d.mo3185a(this.f15310a);
    }
}
