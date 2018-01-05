package com.google.android.wallet.common.p374d;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.w;
import com.google.android.wallet.common.p367c.p368a.C6517c;
import com.google.android.wallet.common.p377b.p379b.C6567a;
import com.google.android.wallet.p355a.C6487c;

public class C6574c implements w {
    public C6517c f32703a;
    public final byte[] f32704b;
    public final /* synthetic */ C6532b f32705c;

    public C6574c(C6532b c6532b, byte[] bArr) {
        this.f32705c = c6532b;
        this.f32704b = bArr;
    }

    public void mo5543a(VolleyError volleyError) {
        if ((volleyError instanceof AuthFailureError) && !this.f32705c.f32599a) {
            this.f32705c.m29656a(4, 22, null);
            Intent intent = ((AuthFailureError) volleyError).a;
            if (intent != null) {
                intent.setFlags(intent.getFlags() & -268435457);
                this.f32705c.startActivityForResult(intent, 100);
                this.f32705c.m29649b(1, 1);
                this.f32705c.m29658a(this.f32703a, true);
                return;
            }
            this.f32705c.m29649b(3, 1);
        } else if ((volleyError instanceof NoConnectionError) && this.f32705c.mo5541a(this.f32705c.f32604f)) {
            this.f32705c.m29656a(4, 21, null);
            C6532b c6532b = this.f32705c;
            c6532b.f32604f++;
            C6567a.m29801a(this.f32703a.mo5463s(), this.f32705c.f32604f, this.f32704b);
            new Handler(Looper.getMainLooper()).postDelayed(new C6575d(this), (long) ((Integer) C6487c.f32491b.a()).intValue());
            return;
        } else if (volleyError instanceof ServerError) {
            this.f32705c.m29656a(4, 20, null);
            this.f32705c.m29649b(3, 3);
        } else if ((volleyError instanceof NetworkError) || (volleyError instanceof TimeoutError)) {
            this.f32705c.m29656a(4, 21, null);
            this.f32705c.m29649b(3, 2);
        } else if (volleyError instanceof AuthFailureError) {
            this.f32705c.m29656a(4, 22, null);
            this.f32705c.m29649b(3, 1);
        } else {
            this.f32705c.m29656a(4, 20, null);
            Log.i("BaseOrchSidecar", "Unexpected error returned from Volley", volleyError);
            this.f32705c.m29649b(3, 3);
        }
        C6567a.m29800a(this.f32703a.mo5464t(), 1, volleyError.getClass().getSimpleName(), this.f32703a.m29569a(), -1, this.f32704b);
    }
}
