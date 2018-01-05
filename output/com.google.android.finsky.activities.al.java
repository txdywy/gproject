package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.os.Build$VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Locale;

public final class com.google.android.finsky.activities.al implements DialogInterface$OnClickListener
{

    public final EditText a;
    public final EditText b;
    public final com.google.android.finsky.activities.t c;

    al(com.google.android.finsky.activities.t p0, EditText p1, EditText p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onClick(DialogInterface p0, int p1) {
        v0 = this.a.getText().toString();
        v1 = this.b.getText().toString();
        v4 = com.google.android.finsky.aa.a.ao.b(com.google.android.finsky.m.a.cZ());
        if (TextUtils.isEmpty(v0) && TextUtils.isEmpty(v1)) {
            v4.c();
            v0 = Locale.getDefault().toString();
        }
        else {
            if (TextUtils.isEmpty(v0))
                v0 = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(v1))
                v1 = Locale.getDefault().getCountry();
            if (Build$VERSION.SDK_INT >= 21) {
                v0 = new Locale(v0, v1).toLanguageTag();
                v4.a(v0);
            }
            else {
                v0 = v0 + "-" + v1;
                v4.a(v0);
            }
        }
        v2 = new Object[1];
        v2[0] = v0;
        FinskyLog.a("New locale: %s", v2);
        Toast.makeText(this.c, (String.valueOf(v0).length() + 23) + "New locale:\n" + v0 + "\nRestarting", 1).show();
        com.google.android.finsky.activities.t.c();
        new Handler(Looper.getMainLooper()).postDelayed(this.c.b, 3000);
    }

}
