package com.google.android.finsky.verifier.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserHandle;
import android.os.UserManager;
import android.support.v4.os.C0327a;
import com.google.android.finsky.dw.C2909c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class av {
    public static av f24406b;
    public C2909c f24407a;
    public SharedPreferences f24408c;
    public Context f24409d;
    public boolean f24410e = false;
    public boolean f24411f = false;

    private av(Context context) {
        this.f24409d = context;
        this.f24408c = context.getSharedPreferences("verify_app_single_user_settings_shared_prefs", 0);
        ((ac) C3947d.m18649a(ac.class)).mo1982a(this);
    }

    public static synchronized av m22086a(Context context) {
        av avVar;
        synchronized (av.class) {
            if (f24406b == null) {
                f24406b = new av(context.getApplicationContext());
            }
            avVar = f24406b;
        }
        return avVar;
    }

    final void m22091a(String str, String str2) {
        List a = m22088a(str2);
        if (!a.contains(str)) {
            a.add(str);
            m22092a(str2, a);
        }
    }

    final List m22088a(String str) {
        List a = m22089a(false);
        m22090a();
        List arrayList = new ArrayList(this.f24408c.getStringSet(str, Collections.emptySet()));
        if (!this.f24411f) {
            Iterator it = arrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                boolean z2;
                if (a.contains((String) it.next())) {
                    z2 = z;
                } else {
                    z2 = true;
                    it.remove();
                }
                z = z2;
            }
            if (z) {
                m22092a(str, arrayList);
            }
        }
        return arrayList;
    }

    final void m22092a(String str, List list) {
        m22090a();
        this.f24408c.edit().putStringSet(str, new HashSet(list)).apply();
    }

    final List m22089a(boolean z) {
        List<UserHandle> c = this.f24407a.f15463a.mo3194c();
        List arrayList = new ArrayList();
        for (UserHandle userHandle : c) {
            if (z) {
                boolean isUserUnlocked;
                if (((UserManager) this.f24409d.getSystemService("user")).isUserRunning(userHandle)) {
                    UserManager userManager = (UserManager) this.f24409d.getSystemService("user");
                    if (C0327a.m1721a()) {
                        isUserUnlocked = userManager.isUserUnlocked(userHandle);
                    } else {
                        isUserUnlocked = true;
                    }
                } else {
                    isUserUnlocked = false;
                }
                if (!isUserUnlocked) {
                }
            }
            arrayList.add(m22087a(this.f24409d, userHandle));
        }
        return arrayList;
    }

    final void m22090a() {
        if (C4671b.m21788e() && !this.f24407a.f15463a.mo3195d()) {
            throw new IllegalStateException("This method must be called in primary profile");
        }
    }

    @TargetApi(21)
    public static String m22087a(Context context, UserHandle userHandle) {
        if (userHandle != null) {
            return Long.valueOf(((UserManager) context.getSystemService("user")).getSerialNumberForUser(userHandle)).toString();
        }
        FinskyLog.m21669e("UserHandle should not be null!", new Object[0]);
        return null;
    }
}
