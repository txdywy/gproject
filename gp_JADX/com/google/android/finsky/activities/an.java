package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.widget.Toast;
import com.google.android.finsky.al.C1216i;
import com.google.android.finsky.al.C1225k;

final class an implements OnClickListener {
    public final /* synthetic */ C1216i f6454a;
    public final /* synthetic */ C1225k f6455b;
    public final /* synthetic */ String f6456c;
    public final /* synthetic */ C1033t f6457d;

    an(C1033t c1033t, C1216i c1216i, C1225k c1225k, String str) {
        this.f6457d = c1033t;
        this.f6454a = c1216i;
        this.f6455b = c1225k;
        this.f6456c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f6454a.mo1529a(((Pair) this.f6455b.f7361b.get(i)).second)) {
            Toast.makeText(this.f6457d, this.f6456c, 1).show();
            new Handler(Looper.getMainLooper()).postDelayed(this.f6457d.f6307b, 3000);
        }
    }
}
