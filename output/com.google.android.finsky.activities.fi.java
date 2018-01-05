package com.google.android.finsky.activities;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.h.h;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.layout.ak;
import java.util.Arrays;

public final class com.google.android.finsky.activities.fi implements View$OnClickListener
{

    public final com.google.android.finsky.activities.ff a;

    fi(com.google.android.finsky.activities.ff p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        v2 = 0;
        v1 = 0;
        while (v1 < this.a.f) {
            this.a.g[v1] = ((CheckBox)(TextView)this.a.j.getChildAt(v1)).isChecked();
            v1 = v1 + 1;
        }
        v3 = new long[this.a.f];
        v0 = 0;
        while (v2 < this.a.f) {
            if (this.a.g[v2] != 0) {
                v3[v0] = this.a.b.a(this.a.b.a(this.a.n[v2]));
                v0 = v0 + 1;
            }
            v2 = v2 + 1;
        }
        this.a.a.a(Arrays.copyOf(v3, v0));
        Toast.makeText(this.a.e, 2131952024, 1).show();
        new Handler(Looper.getMainLooper()).postDelayed(this.a.h, 3000);
    }

}
