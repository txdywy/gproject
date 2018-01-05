package com.google.android.gms.internal;

import com.google.android.gms.internal.zzfwg.zzb;
import java.util.logging.Level;

final class uo extends zzfwg {
    public final byte[] f27533c;
    public final int f27534d;
    public int f27535e;

    uo(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        } else if (((i | 0) | (bArr.length - (i + 0))) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(0), Integer.valueOf(i)}));
        } else {
            this.f27533c = bArr;
            this.f27535e = 0;
            this.f27534d = i + 0;
        }
    }

    public final int mo4915a() {
        return this.f27534d - this.f27535e;
    }

    public final void mo4916a(int i) {
        if (i >= 0) {
            mo4925b(i);
        } else {
            mo4920a((long) i);
        }
    }

    public final void mo4917a(int i, int i2) {
        mo4925b((i << 3) | i2);
    }

    public final void mo4918a(int i, ud udVar) {
        mo4917a(i, 2);
        mo4921a(udVar);
    }

    public final void mo4919a(int i, vk vkVar) {
        mo4917a(i, 2);
        mo4922a(vkVar);
    }

    public final void mo4921a(ud udVar) {
        mo4925b(udVar.mo4892a());
        udVar.mo4894a((uc) this);
    }

    public final void mo4922a(vk vkVar) {
        mo4925b(vkVar.mo4851c());
        vkVar.mo4850a(this);
    }

    public final void mo4923a(String str) {
        mo4917a(1, 2);
        mo4927b(str);
    }

    public final void mo4924a(byte[] bArr, int i, int i2) {
        mo4928b(bArr, i, i2);
    }

    public final void mo4926b(int i, int i2) {
        mo4917a(i, 0);
        mo4916a(i2);
    }

    public final void mo4928b(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.f27533c, this.f27535e, i2);
            this.f27535e += i2;
        } catch (Throwable e) {
            throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f27535e), Integer.valueOf(this.f27534d), Integer.valueOf(i2)}), e);
        }
    }

    public final void mo4925b(int i) {
        byte[] bArr;
        int i2;
        if (!zzfwg.f27532b || mo4915a() < 10) {
            while ((i & -128) != 0) {
                try {
                    bArr = this.f27533c;
                    i2 = this.f27535e;
                    this.f27535e = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (Throwable e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f27535e), Integer.valueOf(this.f27534d), Integer.valueOf(1)}), e);
                }
            }
            bArr = this.f27533c;
            i2 = this.f27535e;
            this.f27535e = i2 + 1;
            bArr[i2] = (byte) i;
            return;
        }
        while ((i & -128) != 0) {
            bArr = this.f27533c;
            i2 = this.f27535e;
            this.f27535e = i2 + 1;
            wc.m25827a(bArr, (long) i2, (byte) ((i & 127) | 128));
            i >>>= 7;
        }
        bArr = this.f27533c;
        i2 = this.f27535e;
        this.f27535e = i2 + 1;
        wc.m25827a(bArr, (long) i2, (byte) i);
    }

    public final void mo4920a(long j) {
        byte[] bArr;
        int i;
        if (!zzfwg.f27532b || mo4915a() < 10) {
            while ((j & -128) != 0) {
                try {
                    bArr = this.f27533c;
                    i = this.f27535e;
                    this.f27535e = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (Throwable e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f27535e), Integer.valueOf(this.f27534d), Integer.valueOf(1)}), e);
                }
            }
            bArr = this.f27533c;
            i = this.f27535e;
            this.f27535e = i + 1;
            bArr[i] = (byte) ((int) j);
            return;
        }
        while ((j & -128) != 0) {
            bArr = this.f27533c;
            i = this.f27535e;
            this.f27535e = i + 1;
            wc.m25827a(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        bArr = this.f27533c;
        i = this.f27535e;
        this.f27535e = i + 1;
        wc.m25827a(bArr, (long) i, (byte) ((int) j));
    }

    public final void mo4927b(String str) {
        int i = this.f27535e;
        try {
            int c = zzfwg.m25720c(str.length() * 3);
            int c2 = zzfwg.m25720c(str.length());
            if (c2 == c) {
                this.f27535e = i + c2;
                c = wi.m25849a(str, this.f27533c, this.f27535e, mo4915a());
                this.f27535e = i;
                mo4925b((c - i) - c2);
                this.f27535e = c;
                return;
            }
            mo4925b(wi.m25848a((CharSequence) str));
            this.f27535e = wi.m25849a(str, this.f27533c, this.f27535e, mo4915a());
        } catch (Throwable e) {
            this.f27535e = i;
            zzfwg.f27531a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e);
            byte[] bytes = str.getBytes(vd.f27560a);
            try {
                mo4925b(bytes.length);
                mo4924a(bytes, 0, bytes.length);
            } catch (Throwable e2) {
                throw new zzb(e2);
            } catch (zzb e3) {
                throw e3;
            }
        } catch (Throwable e22) {
            throw new zzb(e22);
        }
    }
}
