package com.google.android.gms.ocr;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.internal.C5123l;
import com.google.android.gms.common.internal.am;

public final class C5344a {
    public final Context f27856a;
    public final Intent f27857b = new Intent("com.google.android.gms.ocr.ACTION_CREDIT_CARD_OCR");

    public C5344a(Context context) {
        this.f27856a = context;
        this.f27857b.setPackage("com.google.android.gms");
    }

    public final C5344a m26067a() {
        am.m23744b(true, "Unexpected value for theme=%d", Integer.valueOf(0));
        this.f27857b.putExtra("com.google.android.gms.ocr.THEME", 0);
        return this;
    }

    public final C5344a m26068a(String str) {
        this.f27857b.putExtra("com.google.android.gms.ocr.ACCOUNT_NAME", str);
        return this;
    }

    public final Intent m26069b() {
        if (this.f27856a.getPackageManager().checkPermission("android.permission.CAMERA", "com.google.android.gms") != 0) {
            return null;
        }
        if (C5123l.m23809a(this.f27856a.getPackageManager(), this.f27857b)) {
            int a = C5095d.m23655a(this.f27856a);
            if (a == 0) {
                return this.f27857b;
            }
            Log.w("CreditCardOcrIntentBuilder", "Google Play services is unavailable. Result=" + a);
            return null;
        }
        Log.d("CreditCardOcrIntentBuilder", "Google Play services OCR activity is disabled or not available");
        return null;
    }
}
