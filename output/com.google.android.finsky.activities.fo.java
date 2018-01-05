package com.google.android.finsky.activities;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.cs.b;
import com.google.android.finsky.phenotypedebug.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class com.google.android.finsky.activities.fo implements View$OnClickListener
{

    public final com.google.android.finsky.activities.fl a;

    fo(com.google.android.finsky.activities.fl p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        v1 = this.a.a.cZ();
        v3 = new HashMap();
        v4 = this.a.c.iterator();
        while (v4.hasNext()) {
            v0 = (com.google.android.finsky.phenotypedebug.a)v4.next();
            if (!v0.a())
                continue;
            v3.put(v0.a, v0.b());
        }
        this.a.b.a(v1, v3);
        this.a.b.b(v1, com.google.android.finsky.activities.fl.a(this.a.d));
        this.a.b.d(v1);
        Toast.makeText(this.a.f, 2131952024, 1).show();
        new Handler(Looper.getMainLooper()).postDelayed(this.a.e, 3000);
    }

}
