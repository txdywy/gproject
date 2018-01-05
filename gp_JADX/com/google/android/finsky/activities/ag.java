package com.google.android.finsky.activities;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.volley.C0660x;
import com.google.wireless.android.finsky.dfe.nano.br;
import com.squareup.leakcanary.C7582R;

final class ag implements C0660x {
    public final /* synthetic */ String f6444a;
    public final /* synthetic */ C1033t f6445b;

    ag(C1033t c1033t, String str) {
        this.f6445b = c1033t;
        this.f6444a = str;
    }

    public final /* synthetic */ void b_(Object obj) {
        br brVar = (br) obj;
        if (this.f6444a.equals(brVar.b)) {
            String string;
            C1033t c1033t = this.f6445b;
            Object[] objArr = new Object[1];
            if (TextUtils.isEmpty(brVar.b)) {
                string = this.f6445b.getString(C7582R.string.debug_play_country_override_none);
            } else {
                string = brVar.b;
            }
            objArr[0] = string;
            Toast.makeText(this.f6445b, c1033t.getString(C7582R.string.debug_play_country_override_update_success, objArr), 1).show();
            new Handler(Looper.getMainLooper()).postDelayed(this.f6445b.f6307b, 3000);
            return;
        }
        Toast.makeText(this.f6445b, C7582R.string.debug_play_country_override_update_failed, 1).show();
    }
}
