package com.google.android.wallet.p369c.p375c;

import android.os.AsyncTask;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.common.util.C6608t;
import com.google.p443h.p451c.p457c.p470c.p471a.C7189g;

public final class C6534b extends AsyncTask {
    public final byte[] f32608a;
    public final /* synthetic */ C6533a f32609b;

    public C6534b(C6533a c6533a, byte[] bArr) {
        this.f32609b = c6533a;
        this.f32608a = bArr;
    }

    protected final void onPreExecute() {
        this.f32609b.m29649b(1, 0);
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.f32609b.f32607i = (C7189g) obj;
        this.f32609b.m29649b(2, 0);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        C7189g c7189g = (C7189g) C6608t.m29983a(((C7189g[]) objArr)[0]);
        c7189g.f35060a = C6600l.m29938a(this.f32609b.d.f32686a, this.f32609b.e.f32713b, this.f32608a);
        return c7189g;
    }
}
