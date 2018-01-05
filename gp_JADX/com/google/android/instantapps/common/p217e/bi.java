package com.google.android.instantapps.common.p217e;

import android.os.Binder;
import android.util.Log;
import com.google.android.gms.phenotype.C5550i;

final class bi implements bf {
    public final Object f29100a;
    public final C5550i f29101b;
    public final String f29102c;

    bi(Object obj, C5550i c5550i, String str) {
        this.f29100a = obj;
        this.f29101b = c5550i;
        this.f29102c = str;
    }

    private final Object m27120b() {
        C5550i c5550i = this.f29101b;
        if (c5550i.f28459h != null) {
            return c5550i.f28459h;
        }
        if (C5550i.f28454c) {
            String str = "PhenotypeFlag";
            String str2 = "Ignoring GService & Phenotype values, using default for flag: ";
            String valueOf = String.valueOf(c5550i.f28456e);
            Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (C5550i.f28453b == null) {
            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
        } else if (c5550i.f28455d.f28465f) {
            r0 = c5550i.m26535b();
            if (r0 != null) {
                return r0;
            }
            r0 = c5550i.m26532a();
            if (r0 != null) {
                return r0;
            }
        } else {
            r0 = c5550i.m26532a();
            if (r0 != null) {
                return r0;
            }
            r0 = c5550i.m26535b();
            if (r0 != null) {
                return r0;
            }
        }
        return c5550i.f28458g;
    }

    private final Object m27121c() {
        Object b;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            b = m27120b();
        } catch (Throwable e) {
            bg.f29097a.m27208a(e, "Could not get value from PhenotypeFlag for %s.", this.f29102c);
            b = this.f29100a;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return b;
    }

    public final Object mo5158a() {
        try {
            return m27120b();
        } catch (SecurityException e) {
            return m27121c();
        }
    }
}
