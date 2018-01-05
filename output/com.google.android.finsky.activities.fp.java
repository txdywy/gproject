package com.google.android.finsky.activities;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.cs.b;

public final class com.google.android.finsky.activities.fp implements View$OnClickListener
{

    public final com.google.android.finsky.activities.fl a;

    fp(com.google.android.finsky.activities.fl p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        v0 = this.a.a.cZ();
        this.a.b.b(v0);
        this.a.b.c(v0);
        this.a.b.d(v0);
        Toast.makeText(this.a.f, 2131952003, 1).show();
        new Handler(Looper.getMainLooper()).postDelayed(this.a.e, 3000);
    }

}
