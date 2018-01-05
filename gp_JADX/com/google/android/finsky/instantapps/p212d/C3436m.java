package com.google.android.finsky.instantapps.p212d;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.UUID;

public final class C3436m {
    public final Intent f17581a;
    public final String f17582b;
    public final boolean f17583c;
    public boolean f17584d;
    public IntentSender f17585e;
    public IntentSender f17586f;

    C3436m(Intent intent) {
        String uuid;
        this.f17581a = intent;
        String stringExtra = this.f17581a.getStringExtra("android.intent.extra.EPHEMERAL_TOKEN");
        this.f17583c = stringExtra != null;
        if (stringExtra == null) {
            uuid = UUID.randomUUID().toString();
        } else {
            uuid = stringExtra;
        }
        this.f17582b = uuid;
        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.EPHEMERAL_SUCCESS");
        if (parcelableExtra instanceof IntentSender) {
            this.f17585e = (IntentSender) parcelableExtra;
        }
        parcelableExtra = intent.getParcelableExtra("android.intent.extra.EPHEMERAL_FAILURE");
        if (parcelableExtra instanceof PendingIntent) {
            this.f17586f = ((PendingIntent) parcelableExtra).getIntentSender();
        } else if (parcelableExtra instanceof IntentSender) {
            this.f17586f = (IntentSender) parcelableExtra;
        }
    }

    public final boolean m16982a() {
        return (this.f17585e == null || TextUtils.isEmpty(m16986e())) ? false : true;
    }

    public final boolean m16983b() {
        return m16982a() && !this.f17583c;
    }

    public final String m16984c() {
        return this.f17581a.getStringExtra("android.intent.extra.EPHEMERAL_HOSTNAME");
    }

    public final boolean m16985d() {
        return this.f17586f != null;
    }

    public final void m16981a(Context context) {
        if (this.f17584d) {
            throw new IllegalStateException("Launch intent has already been sent.");
        }
        this.f17586f.sendIntent(context, 0, null, null, null);
        this.f17584d = true;
    }

    public final String m16986e() {
        return this.f17581a.getStringExtra("android.intent.extra.PACKAGE_NAME");
    }

    public final Integer m16987f() {
        return Integer.valueOf(this.f17581a.getIntExtra("android.intent.extra.VERSION_CODE", 0));
    }

    public final String m16988g() {
        return this.f17581a.getStringExtra("android.intent.extra.CALLING_PACKAGE");
    }
}
