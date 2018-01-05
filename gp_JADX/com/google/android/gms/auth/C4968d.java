package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.auth.p274a.p275a.C4921a;
import com.google.android.gms.internal.nk;
import java.io.IOException;

final class C4968d implements C4967c {
    public /* synthetic */ Account f25470a;
    public /* synthetic */ String f25471b;
    public /* synthetic */ Bundle f25472c;

    C4968d(Account account, String str, Bundle bundle) {
        this.f25470a = account;
        this.f25471b = str;
        this.f25472c = bundle;
    }

    public final /* synthetic */ Object mo4499a(IBinder iBinder) {
        Bundle bundle = (Bundle) C4922b.m22933a(nk.m25199a(iBinder).mo4827a(this.f25470a, this.f25471b, this.f25472c));
        TokenData a = TokenData.m22930a(bundle, "tokenDetails");
        if (a != null) {
            return a;
        }
        int i;
        String string = bundle.getString("Error");
        bundle.getParcelable("userRecoveryIntent");
        C4921a a2 = C4921a.m22931a(string);
        if (C4921a.BAD_AUTHENTICATION.equals(a2) || C4921a.CAPTCHA.equals(a2) || C4921a.NEED_PERMISSION.equals(a2) || C4921a.NEED_REMOTE_CONSENT.equals(a2) || C4921a.NEEDS_BROWSER.equals(a2) || C4921a.USER_CANCEL.equals(a2) || C4921a.DEVICE_MANAGEMENT_REQUIRED.equals(a2) || C4921a.DM_INTERNAL_ERROR.equals(a2) || C4921a.DM_SYNC_DISABLED.equals(a2) || C4921a.DM_ADMIN_BLOCKED.equals(a2) || C4921a.DM_ADMIN_PENDING_APPROVAL.equals(a2) || C4921a.DM_STALE_SYNC_REQUIRED.equals(a2) || C4921a.DM_DEACTIVATED.equals(a2) || C4921a.DM_REQUIRED.equals(a2) || C4921a.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(a2) || C4921a.DM_SCREENLOCK_REQUIRED.equals(a2)) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            Object[] objArr = new Object[1];
            String valueOf = String.valueOf(a2);
            objArr[0] = new StringBuilder(String.valueOf(valueOf).length() + 31).append("isUserRecoverableError status: ").append(valueOf).toString();
            C4922b.f25336d.m24291b("GoogleAuthUtil", objArr);
            throw new UserRecoverableAuthException(string);
        }
        if (C4921a.NETWORK_ERROR.equals(a2) || C4921a.SERVICE_UNAVAILABLE.equals(a2)) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            throw new IOException(string);
        }
        throw new GoogleAuthException(string);
    }
}
