package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import com.google.android.gms.internal.nj;
import com.google.android.gms.internal.nk;

final class C4969e implements C4967c {
    public /* synthetic */ String f25473a;
    public /* synthetic */ String[] f25474b;

    C4969e(String str, String[] strArr) {
        this.f25473a = str;
        this.f25474b = strArr;
    }

    public final /* synthetic */ Object mo4499a(IBinder iBinder) {
        nj a = nk.m25199a(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("accountType", this.f25473a);
        bundle.putStringArray("account_features", this.f25474b);
        Parcelable[] parcelableArray = ((Bundle) C4922b.m22933a(a.mo4828a(bundle))).getParcelableArray("accounts");
        Object obj = new Account[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            obj[i] = (Account) parcelableArray[i];
        }
        return obj;
    }
}
