package com.google.android.gms.internal;

import java.io.IOException;
import java.util.logging.Logger;

public abstract class zzfwg extends uc {
    public static final Logger f27531a = Logger.getLogger(zzfwg.class.getName());
    public static final boolean f27532b = wc.f27597i;

    public final class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(String str, Throwable th) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String valueOf2 = String.valueOf(str);
            super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), th);
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    zzfwg() {
    }

    public static zzfwg m25717a(byte[] bArr) {
        return new uo(bArr, bArr.length);
    }

    public static int m25720c(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (-268435456 & i) == 0 ? 4 : 5;
    }

    private static int m25723d(int i) {
        return i >= 0 ? m25720c(i) : 10;
    }

    private static int m25725d(String str) {
        int a;
        try {
            a = wi.m25848a((CharSequence) str);
        } catch (zzfyg e) {
            a = str.getBytes(vd.f27560a).length;
        }
        return a + m25720c(a);
    }

    public abstract int mo4915a();

    public abstract void mo4916a(int i);

    public abstract void mo4917a(int i, int i2);

    public abstract void mo4918a(int i, ud udVar);

    public abstract void mo4919a(int i, vk vkVar);

    public abstract void mo4920a(long j);

    public abstract void mo4921a(ud udVar);

    public abstract void mo4922a(vk vkVar);

    public abstract void mo4923a(String str);

    public final void m25735b() {
        if (mo4915a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void mo4925b(int i);

    public abstract void mo4926b(int i, int i2);

    public abstract void mo4927b(String str);

    public abstract void mo4928b(byte[] bArr, int i, int i2);

    public static int m25721c(int i, int i2) {
        return m25720c(i << 3) + m25723d(i2);
    }

    public static int m25724d(int i, int i2) {
        return m25720c(i << 3) + m25723d(i2);
    }

    public static int m25722c(String str) {
        return m25720c(8) + m25725d(str);
    }

    public static int m25718b(int i, ud udVar) {
        int c = m25720c(i << 3);
        int a = udVar.mo4892a();
        return c + (a + m25720c(a));
    }

    public static int m25719b(int i, vk vkVar) {
        int c = m25720c(i << 3);
        int c2 = vkVar.mo4851c();
        return c + (c2 + m25720c(c2));
    }
}
