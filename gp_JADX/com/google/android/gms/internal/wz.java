package com.google.android.gms.internal;

public abstract class wz {
    public volatile int ai = -1;

    public static final byte[] m24212a(wz wzVar) {
        byte[] bArr = new byte[wzVar.m24217e()];
        try {
            wt a = wt.m25887a(bArr, bArr.length);
            wzVar.mo4702a(a);
            if (a.f27641a.remaining() == 0) {
                return bArr;
            }
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(a.f27641a.remaining())}));
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    protected int mo4701a() {
        return 0;
    }

    public abstract wz mo4705a(ws wsVar);

    public void mo4702a(wt wtVar) {
    }

    public /* synthetic */ Object clone() {
        return mo4704d();
    }

    public wz mo4704d() {
        return (wz) super.clone();
    }

    public final int m24217e() {
        int a = mo4701a();
        this.ai = a;
        return a;
    }

    public String toString() {
        return xa.m25930a(this);
    }

    public static wz m24211a(wz wzVar, byte[] bArr, int i) {
        try {
            ws wsVar = new ws(bArr, i);
            wzVar.mo4705a(wsVar);
            wsVar.m25866a(0);
            return wzVar;
        } catch (zzfyy e) {
            throw e;
        } catch (Throwable e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }
}
