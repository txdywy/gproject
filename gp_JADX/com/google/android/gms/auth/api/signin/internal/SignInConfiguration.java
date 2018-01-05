package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class SignInConfiguration extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new C4965s();
    public final String f25399a;
    public GoogleSignInOptions f25400b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f25399a = am.m23735a(str);
        this.f25400b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
            if (!this.f25399a.equals(signInConfiguration.f25399a)) {
                return false;
            }
            if (this.f25400b == null) {
                if (signInConfiguration.f25400b != null) {
                    return false;
                }
            } else if (!this.f25400b.equals(signInConfiguration.f25400b)) {
                return false;
            }
            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f25399a);
        C5130b.m23842a(parcel, 5, this.f25400b, i);
        C5130b.m23853b(parcel, a);
    }

    public final int hashCode() {
        return new C4959k().m23090a(this.f25399a).m23090a(this.f25400b).f25459b;
    }
}
