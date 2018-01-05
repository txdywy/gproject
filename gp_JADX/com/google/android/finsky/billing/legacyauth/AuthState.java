package com.google.android.finsky.billing.legacyauth;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p030c.p031a.C0282a;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.billing.p131e.C1817e;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.a.a.a.a.z;
import com.squareup.leakcanary.C7582R;

public class AuthState implements Parcelable {
    public static final Creator CREATOR = new C1881h();
    public final boolean f9573a;
    public final String f9574b;
    public final String f9575c;
    public final int f9576d;
    public final boolean f9577e;
    public final String f9578f;
    public final String f9579g;
    public final C1817e f9580h = new C1817e(C0282a.m1599a(this.f9581i));
    public Context f9581i;
    public C1461c f9582j;
    public boolean f9583k;

    public AuthState(boolean z, String str, String str2, int i, boolean z2, boolean z3, String str3, String str4) {
        ((C1355j) C3947d.m18649a(C1355j.class)).mo1743a(this);
        this.f9573a = z;
        this.f9574b = str;
        this.f9575c = str2;
        this.f9576d = i;
        boolean z4 = z2 && this.f9580h.m9821a();
        this.f9583k = z4;
        this.f9577e = z3;
        this.f9578f = str3;
        this.f9579g = str4;
    }

    public final int m10001a() {
        if (this.f9583k) {
            return 3;
        }
        if (this.f9573a) {
            return 2;
        }
        return 1;
    }

    public final z m10003b() {
        int i;
        if (this.f9583k) {
            i = 3;
        } else if (this.f9573a) {
            i = 2;
        } else {
            i = 1;
        }
        z zVar = new z();
        zVar.a(i);
        if (this.f9577e) {
            zVar.d();
        }
        return zVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3 = 1;
        parcel.writeInt(this.f9573a ? 1 : 0);
        parcel.writeString(this.f9574b);
        parcel.writeString(this.f9575c);
        parcel.writeInt(this.f9576d);
        if (this.f9583k) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (!this.f9577e) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeString(this.f9578f);
        parcel.writeString(this.f9579g);
    }

    public final int m10005c() {
        if (!this.f9583k) {
            return C7582R.string.confirm;
        }
        if (this.f9573a) {
            return C7582R.string.use_pin;
        }
        return C7582R.string.use_password;
    }

    public final int m10006d() {
        if (this.f9583k) {
            return C7582R.string.fingerprint_title;
        }
        if (this.f9573a) {
            return C7582R.string.pin_dialog_title;
        }
        return C7582R.string.password_dialog_title;
    }

    public final String m10002a(String str) {
        if (this.f9583k) {
            throw new IllegalStateException("Call for fingerprint is not supported");
        } else if (this.f9573a) {
            return this.f9574b;
        } else {
            return ((String) C0955b.dc.m28964b()).replace("%email%", str);
        }
    }

    public final String m10004b(String str) {
        if (this.f9583k) {
            throw new IllegalStateException("Call for fingerprint is not supported");
        } else if (this.f9573a && this.f9582j.mo2249j(str).mo2294a(12603105) && !TextUtils.isEmpty(this.f9575c)) {
            return this.f9575c;
        } else {
            if (this.f9573a || !this.f9582j.mo2249j(str).mo2294a(12606634) || TextUtils.isEmpty(this.f9578f)) {
                return m10002a(str);
            }
            return this.f9578f;
        }
    }

    public final int m10007e() {
        if (this.f9583k) {
            throw new IllegalStateException("Call for fingerprint is not supported");
        } else if (this.f9573a) {
            return C7582R.string.recover_pin_help_text;
        } else {
            return C7582R.string.password_help_text;
        }
    }

    public final int m10008f() {
        if (this.f9583k) {
            throw new IllegalStateException("Call for fingerprint is not supported");
        } else if (this.f9573a) {
            return C7582R.string.invalid_account_pin_max_attempts_exceeded;
        } else {
            return C7582R.string.invalid_account_password_max_attempts_exceeded;
        }
    }
}
