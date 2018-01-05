package com.google.android.volley;

import android.content.Context;
import com.android.volley.aa;
import com.android.volley.p060a.C0671l;

public final class C6326k extends C0671l {
    public C6326k(Context context, boolean z) {
        this(new GoogleHttpClient(context, "unused/0"), z);
    }

    private C6326k(GoogleHttpClient googleHttpClient, boolean z) {
        super(googleHttpClient);
        if (z) {
            String str = aa.f4123a;
            a aVar = googleHttpClient.f31616a;
            if (str == null) {
                throw new NullPointerException("name");
            }
            aVar.e = new f(str);
        }
    }
}
