package com.google.android.finsky.activities;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.wireless.android.finsky.dfe.nano.br;

public final class com.google.android.finsky.activities.ag implements com.android.volley.x
{

    public final String a;
    public final com.google.android.finsky.activities.t b;

    ag(com.google.android.finsky.activities.t p0, String p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void b_(Object p0) {
        if (!this.a.equals(((com.google.wireless.android.finsky.dfe.nano.br)p0).b))
            Toast.makeText(this.b, 2131952010, 1).show();
        else {
            v3 = new Object[1];
            if (TextUtils.isEmpty(((com.google.wireless.android.finsky.dfe.nano.br)p0).b))
                v0 = this.b.getString(2131952007);
            else
                v0 = ((com.google.wireless.android.finsky.dfe.nano.br)p0).b;
            v3[0] = v0;
            Toast.makeText(this.b, this.b.getString(2131952011, v3), 1).show();
            new Handler(Looper.getMainLooper()).postDelayed(this.b.b, 3000);
        }
    }

}
