package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class SignInAccount extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new C4941g();
    @Deprecated
    public String f25388a;
    public GoogleSignInAccount f25389b;
    @Deprecated
    public String f25390c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f25389b = googleSignInAccount;
        this.f25388a = am.m23736a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.f25390c = am.m23736a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 4, this.f25388a);
        C5130b.m23842a(parcel, 7, this.f25389b, i);
        C5130b.m23844a(parcel, 8, this.f25390c);
        C5130b.m23853b(parcel, a);
    }
}
