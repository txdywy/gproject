package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzbt extends zza {
    public static final Creator CREATOR = new an();
    public int f26062a;
    public final Account f26063b;
    public final int f26064c;
    public final GoogleSignInAccount f26065d;

    zzbt(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f26062a = i;
        this.f26063b = account;
        this.f26064c = i2;
        this.f26065d = googleSignInAccount;
    }

    public zzbt(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f26062a);
        C5130b.m23842a(parcel, 2, this.f26063b, i);
        C5130b.m23854b(parcel, 3, this.f26064c);
        C5130b.m23842a(parcel, 4, this.f26065d, i);
        C5130b.m23853b(parcel, a);
    }
}
