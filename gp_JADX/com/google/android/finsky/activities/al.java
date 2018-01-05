package com.google.android.finsky.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Locale;

final class al implements OnClickListener {
    public final /* synthetic */ EditText f6449a;
    public final /* synthetic */ EditText f6450b;
    public final /* synthetic */ C1033t f6451c;

    al(C1033t c1033t, EditText editText, EditText editText2) {
        this.f6451c = c1033t;
        this.f6449a = editText;
        this.f6450b = editText2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String obj = this.f6449a.getText().toString();
        String obj2 = this.f6450b.getText().toString();
        Context context = this.f6451c;
        C0957n b = C0954a.ao.m5777b(C1473m.f7980a.cZ());
        String locale = Locale.getDefault().toString();
        if (TextUtils.isEmpty(obj) && TextUtils.isEmpty(obj2)) {
            b.m5765c();
            obj = locale;
        } else {
            if (TextUtils.isEmpty(obj)) {
                obj = Locale.getDefault().getLanguage();
            }
            if (TextUtils.isEmpty(obj2)) {
                obj2 = Locale.getDefault().getCountry();
            }
            Object toLanguageTag;
            if (VERSION.SDK_INT >= 21) {
                toLanguageTag = new Locale(obj, obj2).toLanguageTag();
                b.m5763a(toLanguageTag);
            } else {
                toLanguageTag = obj + "-" + obj2;
                b.m5763a(toLanguageTag);
            }
        }
        FinskyLog.m21659a("New locale: %s", obj);
        Toast.makeText(context, new StringBuilder(String.valueOf(obj).length() + 23).append("New locale:\n").append(obj).append("\nRestarting").toString(), 1).show();
        C1033t.m6043c();
        new Handler(Looper.getMainLooper()).postDelayed(context.f6307b, 3000);
    }
}
