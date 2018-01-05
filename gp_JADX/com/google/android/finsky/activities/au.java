package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Looper;
import android.widget.EditText;
import com.google.android.finsky.aa.C0957n;

final class au implements OnClickListener {
    public final /* synthetic */ EditText f6464a;
    public final /* synthetic */ C0957n f6465b;
    public final /* synthetic */ C1033t f6466c;

    au(C1033t c1033t, EditText editText, C0957n c0957n) {
        this.f6466c = c1033t;
        this.f6464a = editText;
        this.f6465b = c0957n;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f6465b.m5763a(this.f6464a.getText().toString());
        C1033t.m6043c();
        new Handler(Looper.getMainLooper()).postDelayed(this.f6466c.f6307b, 3000);
    }
}
