package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import java.util.List;

public class TokenData extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new C4970f();
    public int f25275a;
    public final String f25276b;
    public final Long f25277c;
    public final boolean f25278d;
    public final boolean f25279e;
    public final List f25280f;

    TokenData(int i, String str, Long l, boolean z, boolean z2, List list) {
        this.f25275a = i;
        this.f25276b = am.m23735a(str);
        this.f25277c = l;
        this.f25278d = z;
        this.f25279e = z2;
        this.f25280f = list;
    }

    public static TokenData m22930a(Bundle bundle, String str) {
        bundle.setClassLoader(TokenData.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(TokenData.class.getClassLoader());
        return (TokenData) bundle2.getParcelable("TokenData");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f25276b, tokenData.f25276b) && ad.m23722a(this.f25277c, tokenData.f25277c) && this.f25278d == tokenData.f25278d && this.f25279e == tokenData.f25279e && ad.m23722a(this.f25280f, tokenData.f25280f);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25276b, this.f25277c, Boolean.valueOf(this.f25278d), Boolean.valueOf(this.f25279e), this.f25280f});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f25275a);
        C5130b.m23844a(parcel, 2, this.f25276b);
        C5130b.m23843a(parcel, 3, this.f25277c);
        C5130b.m23846a(parcel, 4, this.f25278d);
        C5130b.m23846a(parcel, 5, this.f25279e);
        C5130b.m23845a(parcel, 6, this.f25280f);
        C5130b.m23853b(parcel, a);
    }
}
