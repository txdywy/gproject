package com.google.android.finsky.activities.myapps;

import android.os.AsyncTask;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p229o.C3828c;
import com.google.wireless.android.finsky.dfe.a.a.l;
import com.google.wireless.android.finsky.dfe.b.a.a.a;

final class C1122v extends AsyncTask {
    public final C1254c f7077a;
    public final C3828c f7078b;
    public final C2495w f7079c;
    public final String f7080d;
    public final C0660x f7081e;
    public final C0657w f7082f;

    C1122v(C1254c c1254c, C3828c c3828c, C2495w c2495w, String str, C0660x c0660x, C0657w c0657w) {
        this.f7077a = c1254c;
        this.f7078b = c3828c;
        this.f7079c = c2495w;
        this.f7080d = str;
        this.f7081e = c0660x;
        this.f7082f = c0657w;
    }

    private final a m6858a() {
        try {
            return this.f7078b.m18283a(this.f7079c);
        } catch (InterruptedException e) {
            return new a();
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        a aVar = (a) obj;
        l lVar = new l();
        lVar.a = aVar;
        this.f7077a.mo1586a(this.f7080d, lVar, this.f7081e, this.f7082f);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m6858a();
    }
}
