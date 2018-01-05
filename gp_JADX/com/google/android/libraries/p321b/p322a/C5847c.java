package com.google.android.libraries.p321b.p322a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.UserManager;
import android.support.v4.p028a.C0232v;
import android.util.Log;

public abstract class C5847c {
    public static final Object f29336a = new Object();
    @SuppressLint({"StaticFieldLeak"})
    public static Context f29337b = null;
    public static boolean f29338c = false;
    public static Boolean f29339d = null;
    public final C5854j f29340e;
    public final String f29341f;
    public final String f29342g;
    public final Object f29343h;
    public Object f29344i = null;

    C5847c(C5854j c5854j, String str, Object obj) {
        if (c5854j.f29350a == null && c5854j.f29351b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (c5854j.f29350a == null || c5854j.f29351b == null) {
            this.f29340e = c5854j;
            String valueOf = String.valueOf(c5854j.f29352c);
            String valueOf2 = String.valueOf(str);
            this.f29342g = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            valueOf = String.valueOf(c5854j.f29353d);
            valueOf2 = String.valueOf(str);
            this.f29341f = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            this.f29343h = obj;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    protected abstract Object mo5176a(SharedPreferences sharedPreferences);

    protected abstract Object mo5177a(String str);

    public final Object m27280a() {
        if (this.f29344i != null) {
            return this.f29344i;
        }
        if (f29338c) {
            String str = "PhenotypeFlag";
            String str2 = "Test mode, using default for flag: ";
            String valueOf = String.valueOf(this.f29341f);
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return this.f29343h;
        } else if (f29337b == null) {
            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
        } else {
            Object c;
            if (this.f29340e.f29355f) {
                c = m27278c();
                if (c != null) {
                    return c;
                }
                c = m27276b();
                if (c != null) {
                    return c;
                }
            }
            c = m27276b();
            if (c != null) {
                return c;
            }
            c = m27278c();
            if (c != null) {
                return c;
            }
            return this.f29343h;
        }
    }

    @TargetApi(24)
    private final Object m27276b() {
        String valueOf;
        if (C5847c.m27277b("gms:phenotype:phenotype_flag:debug_bypass_phenotype")) {
            String str = "PhenotypeFlag";
            String str2 = "Bypass reading Phenotype values for flag: ";
            valueOf = String.valueOf(this.f29341f);
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (this.f29340e.f29351b != null) {
            ContentResolver contentResolver = f29337b.getContentResolver();
            Uri uri = this.f29340e.f29351b;
            C5845a c5845a = (C5845a) C5845a.f29328a.get(uri);
            if (c5845a == null) {
                C5845a c5845a2 = new C5845a(contentResolver, uri);
                c5845a = (C5845a) C5845a.f29328a.putIfAbsent(uri, c5845a2);
                if (c5845a == null) {
                    c5845a2.f29330b.registerContentObserver(c5845a2.f29331c, false, c5845a2.f29332d);
                    c5845a = c5845a2;
                }
            }
            valueOf = (String) C5847c.m27275a(new C5849d(this, c5845a));
            if (valueOf != null) {
                return mo5177a(valueOf);
            }
        } else if (this.f29340e.f29350a != null) {
            if (VERSION.SDK_INT >= 24 && !f29337b.isDeviceProtectedStorage() && !((UserManager) f29337b.getSystemService(UserManager.class)).isUserUnlocked()) {
                return null;
            }
            SharedPreferences sharedPreferences = f29337b.getSharedPreferences(this.f29340e.f29350a, 0);
            if (sharedPreferences.contains(this.f29341f)) {
                return mo5176a(sharedPreferences);
            }
        }
        return null;
    }

    private final Object m27278c() {
        if (!this.f29340e.f29354e && C5847c.m27279d()) {
            String str = (String) C5847c.m27275a(new C5850e(this));
            if (str != null) {
                return mo5177a(str);
            }
        }
        return null;
    }

    private static Object m27275a(C5848i c5848i) {
        Object a;
        long clearCallingIdentity;
        try {
            a = c5848i.mo5175a();
        } catch (SecurityException e) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            a = c5848i.mo5175a();
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return a;
    }

    static boolean m27277b(String str) {
        if (C5847c.m27279d()) {
            return ((Boolean) C5847c.m27275a(new C5851f(str))).booleanValue();
        }
        return false;
    }

    private static boolean m27279d() {
        if (f29339d == null) {
            if (f29337b == null) {
                return false;
            }
            boolean z;
            Context context = f29337b;
            if (C0232v.m1136a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null) == 0) {
                z = true;
            } else {
                z = false;
            }
            f29339d = Boolean.valueOf(z);
        }
        return f29339d.booleanValue();
    }

    public static C5847c m27273a(C5854j c5854j, String str, int i) {
        return new C5852g(c5854j, str, Integer.valueOf(i));
    }

    public static C5847c m27274a(C5854j c5854j, String str, boolean z) {
        return new C5853h(c5854j, str, Boolean.valueOf(z));
    }
}
