package com.google.android.finsky.activities;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;
import com.google.android.finsky.ba.e;

public final class com.google.android.finsky.activities.fk implements View$OnClickListener
{

    public final com.google.android.finsky.activities.ff a;

    fk(com.google.android.finsky.activities.ff p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        this.a.a.a(0);
        Toast.makeText(this.a.e, 2131952025, 1).show();
        new Handler(Looper.getMainLooper()).postDelayed(this.a.h, 3000);
    }

}
