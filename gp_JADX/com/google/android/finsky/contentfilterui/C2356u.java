package com.google.android.finsky.contentfilterui;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.C4923a;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.p102c.C0919a;
import java.io.IOException;
import java.util.Arrays;

public final class C2356u {
    public static boolean m11979a(Context context, Account account) {
        try {
            return C2356u.m11980b(context, account);
        } catch (IOException e) {
            return false;
        } catch (GoogleAuthException e2) {
            return false;
        }
    }

    static boolean m11980b(Context context, Account account) {
        String a = C0919a.m5642a("uca");
        return Arrays.asList(C4923a.m22937a(context, account.type, new String[]{a})).contains(account);
    }
}
