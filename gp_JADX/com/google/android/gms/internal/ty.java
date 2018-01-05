package com.google.android.gms.internal;

public abstract class ty implements vk {
    public int f27254g = 0;

    public final ud mo4845e() {
        try {
            ui c = ud.m25656c(mo4851c());
            mo4850a(c.f27520a);
            c.f27520a.m25735b();
            return new uk(c.f27521b);
        } catch (Throwable e) {
            String str = "ByteString";
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder((String.valueOf(name).length() + 62) + String.valueOf(str).length()).append("Serializing ").append(name).append(" to a ").append(str).append(" threw an IOException (should never happen).").toString(), e);
        }
    }

    public final byte[] mo4846f() {
        try {
            byte[] bArr = new byte[mo4851c()];
            zzfwg a = zzfwg.m25717a(bArr);
            mo4850a(a);
            a.m25735b();
            return bArr;
        } catch (Throwable e) {
            String str = "byte array";
            String name = getClass().getName();
            throw new RuntimeException(new StringBuilder((String.valueOf(name).length() + 62) + String.valueOf(str).length()).append("Serializing ").append(name).append(" to a ").append(str).append(" threw an IOException (should never happen).").toString(), e);
        }
    }
}
