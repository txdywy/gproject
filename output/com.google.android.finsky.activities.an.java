package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.widget.Toast;
import com.google.android.finsky.al.i;
import com.google.android.finsky.al.k;
import java.util.List;

public final class com.google.android.finsky.activities.an implements DialogInterface$OnClickListener
{

    public final com.google.android.finsky.al.i a;
    public final com.google.android.finsky.al.k b;
    public final String c;
    public final com.google.android.finsky.activities.t d;

    an(com.google.android.finsky.activities.t p0, com.google.android.finsky.al.i p1, com.google.android.finsky.al.k p2, String p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void onClick(DialogInterface p0, int p1) {
        p0.dismiss();
        if (this.a.a(((Pair)this.b.b.get(p1)).second)) {
            Toast.makeText(this.d, this.c, 1).show();
            new Handler(Looper.getMainLooper()).postDelayed(this.d.b, 3000);
        }
    }

}
