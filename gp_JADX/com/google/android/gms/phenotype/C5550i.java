package com.google.android.gms.phenotype;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;

public abstract class C5550i {
    public static final Object f28452a = new Object();
    public static Context f28453b = null;
    public static boolean f28454c = false;
    public final C5551j f28455d;
    public final String f28456e;
    public final String f28457f;
    public final Object f28458g;
    public Object f28459h = null;

    C5550i(C5551j c5551j, String str, Object obj) {
        String str2 = null;
        if (c5551j.f28460a == null && c5551j.f28461b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (c5551j.f28460a == null || c5551j.f28461b == null) {
            String valueOf;
            this.f28455d = c5551j;
            if (!c5551j.f28464e) {
                valueOf = String.valueOf(c5551j.f28462c);
                str2 = String.valueOf(str);
                str2 = str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf);
            }
            this.f28457f = str2;
            valueOf = String.valueOf(c5551j.f28463d);
            str2 = String.valueOf(str);
            this.f28456e = str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf);
            this.f28458g = obj;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    static Object m26531a(C5552k c5552k) {
        Object a;
        long clearCallingIdentity;
        try {
            a = c5552k.mo5047a();
        } catch (SecurityException e) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            a = c5552k.mo5047a();
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return a;
    }

    public abstract Object mo5049a(SharedPreferences sharedPreferences);

    public abstract Object mo5050a(String str);

    public final Object m26535b() {
        if (this.f28457f != null) {
            String str = (String) C5550i.m26531a(new C5558q(this));
            if (str != null) {
                return mo5050a(str);
            }
        }
        return null;
    }

    public final Object m26532a() {
        if (!((Boolean) C5550i.m26531a(C5559r.f28477a)).booleanValue()) {
            if (this.f28455d.f28461b != null) {
                ContentResolver contentResolver = f28453b.getContentResolver();
                Uri uri = this.f28455d.f28461b;
                C5501a c5501a = (C5501a) C5501a.f28315a.get(uri);
                if (c5501a == null) {
                    C5501a c5501a2 = new C5501a(contentResolver, uri);
                    c5501a = (C5501a) C5501a.f28315a.putIfAbsent(uri, c5501a2);
                    if (c5501a == null) {
                        c5501a2.f28317b.registerContentObserver(c5501a2.f28318c, false, c5501a2.f28319d);
                        c5501a = c5501a2;
                    }
                }
                String str = (String) C5550i.m26531a(new C5557p(this, c5501a));
                if (str != null) {
                    return mo5050a(str);
                }
            } else if (this.f28455d.f28460a != null) {
                SharedPreferences sharedPreferences = f28453b.getSharedPreferences(this.f28455d.f28460a, 0);
                if (sharedPreferences.contains(this.f28456e)) {
                    return mo5049a(sharedPreferences);
                }
            }
        }
        return null;
    }
}
