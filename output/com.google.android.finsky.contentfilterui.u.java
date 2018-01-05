package com.google.android.finsky.contentfilterui;

import android.accounts.Account;
import android.content.Context;
import com.google.android.c.a;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.a;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

static class com.google.android.finsky.contentfilterui.u
{

    public static boolean a(Context p0, Account p1) {
  0:    v0 = com.google.android.finsky.contentfilterui.u.b(p0, p1);
  4:    return v0;
  6:    v0 = 0;
  7:    return v0;
  9:    goto 6;
 10:    try
            run 0...3
        catch (IOException ex) {
  0:        goto 5;
        }
        catch (GoogleAuthException ex) {
  0:        goto 8;
        }
    }

    static boolean b(Context p0, Account p1) {
        v2 = new String[1];
        v2[0] = com.google.android.c.a.a("uca");
        return Arrays.asList(com.google.android.gms.auth.a.a(p0, p1.type, v2)).contains(p1);
    }

}
