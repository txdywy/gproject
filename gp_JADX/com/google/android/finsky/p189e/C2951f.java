package com.google.android.finsky.p189e;

import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.finsky.au.C1518d;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.C4688t;
import com.google.android.finsky.utils.C4689u;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.t;
import java.io.InputStream;

public final class C2951f extends AsyncTask {
    public final /* synthetic */ Uri f15583a;
    public final /* synthetic */ C1518d f15584b;
    public final /* synthetic */ t f15585c;
    public final /* synthetic */ String f15586d;
    public final /* synthetic */ C2956k f15587e;
    public final /* synthetic */ C2950e f15588f;

    public C2951f(C2950e c2950e, Uri uri, C1518d c1518d, t tVar, String str, C2956k c2956k) {
        this.f15588f = c2950e;
        this.f15583a = uri;
        this.f15584b = c1518d;
        this.f15585c = tVar;
        this.f15586d = str;
        this.f15587e = c2956k;
    }

    private final C2957l m15333a() {
        try {
            InputStream openInputStream = this.f15588f.f15580a.getContentResolver().openInputStream(this.f15583a);
            try {
                Object a;
                if (this.f15586d.equals("SHA-256")) {
                    a = C4688t.m21837a(openInputStream, "SHA-256");
                } else {
                    a = C4688t.m21837a(openInputStream, "SHA-1");
                }
                return C2957l.m15348a(a);
            } catch (Exception e) {
                return this.f15588f.m15331a(this.f15584b, this.f15585c, "verify-ioxn-copying", e);
            }
        } catch (Exception e2) {
            return this.f15588f.m15331a(this.f15584b, this.f15585c, "verify-file-not-found", e2);
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        C2957l c2957l = (C2957l) obj;
        if (c2957l.f15602a == null) {
            this.f15587e.mo3411a(c2957l.f15603b);
            return;
        }
        int a = C2955j.m15344a(this.f15584b, (C4689u) c2957l.f15602a);
        if (a == 0) {
            this.f15587e.mo3410a();
            return;
        }
        FinskyLog.m21667d("Error while verifying download for %s (%s)", this.f15584b.f8208f, this.f15584b.f8207e);
        this.f15588f.f15581b.m11221a(this.f15584b.f8208f, new C2474c(111).m13244b("verification").m13210a(a).m13231a(this.f15585c).m13236a(this.f15584b.f8208f).f13342a);
        this.f15587e.mo3411a(a);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m15333a();
    }
}
