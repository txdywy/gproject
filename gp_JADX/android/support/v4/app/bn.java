package android.support.v4.app;

import android.os.AsyncTask;

final class bn extends AsyncTask {
    public final /* synthetic */ bm f1423a;

    bn(bm bmVar) {
        this.f1423a = bmVar;
    }

    protected final /* synthetic */ void onCancelled(Object obj) {
        this.f1423a.m1347a();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.f1423a.m1347a();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        while (true) {
            br b = this.f1423a.m1350b();
            if (b == null) {
                return null;
            }
            this.f1423a.mo3486a(b.mo307a());
            b.mo308b();
        }
    }
}
