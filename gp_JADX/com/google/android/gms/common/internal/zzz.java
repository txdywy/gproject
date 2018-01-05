package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.zzc;

public final class zzz extends zza {
    public static final Creator CREATOR = new C5115b();
    public int f26071a;
    public int f26072b;
    public int f26073c;
    public String f26074d;
    public IBinder f26075e;
    public Scope[] f26076f;
    public Bundle f26077g;
    public Account f26078h;
    public zzc[] f26079i;

    public zzz(int i) {
        this.f26071a = 3;
        this.f26073c = C5095d.f25936c;
        this.f26072b = i;
    }

    zzz(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, zzc[] com_google_android_gms_common_zzcArr) {
        Account account2 = null;
        this.f26071a = i;
        this.f26072b = i2;
        this.f26073c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f26074d = "com.google.android.gms";
        } else {
            this.f26074d = str;
        }
        if (i < 2) {
            if (iBinder != null) {
                C5110o c5126q;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                    c5126q = queryLocalInterface instanceof C5110o ? (C5110o) queryLocalInterface : new C5126q(iBinder);
                }
                account2 = C5112a.m23714a(c5126q);
            }
            this.f26078h = account2;
        } else {
            this.f26075e = iBinder;
            this.f26078h = account;
        }
        this.f26076f = scopeArr;
        this.f26077g = bundle;
        this.f26079i = com_google_android_gms_common_zzcArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f26071a);
        C5130b.m23854b(parcel, 2, this.f26072b);
        C5130b.m23854b(parcel, 3, this.f26073c);
        C5130b.m23844a(parcel, 4, this.f26074d);
        C5130b.m23841a(parcel, 5, this.f26075e);
        C5130b.m23849a(parcel, 6, this.f26076f, i);
        C5130b.m23840a(parcel, 7, this.f26077g);
        C5130b.m23842a(parcel, 8, this.f26078h, i);
        C5130b.m23849a(parcel, 10, this.f26079i, i);
        C5130b.m23853b(parcel, a);
    }
}
