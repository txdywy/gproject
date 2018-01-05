package com.google.android.gms.peerdownloadmanager.comms.p298e;

import javax.crypto.Cipher;

final class C5432a {
    public final Cipher f28086a;
    public final byte[] f28087b = new byte[64];
    public byte[] f28088c;
    public int f28089d;

    public C5432a(Cipher cipher) {
        this.f28086a = cipher;
        for (int i = 0; i < this.f28087b.length; i++) {
            this.f28087b[i] = (byte) 0;
        }
        this.f28088c = null;
    }

    public final void m26257a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = 0;
        Object obj = new byte[i3];
        int i5 = 0;
        while (i5 < i3) {
            while (this.f28088c == null) {
                this.f28088c = this.f28086a.update(this.f28087b);
                this.f28089d = 0;
            }
            int min = Math.min(i3 - i5, this.f28088c.length - this.f28089d);
            System.arraycopy(this.f28088c, this.f28089d, obj, i5, min);
            this.f28089d += min;
            if (this.f28089d == this.f28088c.length) {
                this.f28088c = null;
            }
            i5 += min;
        }
        while (i4 < i3) {
            bArr[i4 + i] = (byte) (bArr2[i4 + i2] ^ obj[i4]);
            i4++;
        }
    }
}
