package com.google.android.finsky.heterodyne;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1301y;
import com.google.android.finsky.deviceconfig.C2699l;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p230q.C3948a;
import com.google.android.gms.phenotype.core.p176c.C3168b;
import com.google.android.gms.phenotype.core.p176c.C5518a;
import com.google.android.gms.phenotype.core.p304a.C5505c;
import com.google.android.volley.GoogleHttpClient;

public final class C3170c {
    public final C3948a f16419a;
    public final C5505c f16420b;
    public final C0988c f16421c;

    public C3170c(C5505c c5505c, C3948a c3948a, C0988c c0988c, C2699l c2699l) {
        this.f16420b = c5505c;
        this.f16419a = c3948a;
        this.f16421c = c0988c;
    }

    public final C3169b m16168a(Context context, C2495w c2495w) {
        return new C3169b((ConnectivityManager) context.getSystemService("connectivity"), this.f16420b, new C5518a(new GoogleHttpClient(context, C1301y.m7755a(context)), (String) C0955b.iu.m28964b(), C3168b.f16404k), new C3174g(), context, c2495w, (TelephonyManager) context.getSystemService("phone"), this.f16419a, this.f16421c);
    }
}
