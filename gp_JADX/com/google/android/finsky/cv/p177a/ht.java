package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class ht extends C0758b {
    public static volatile ht[] f12612a;
    public int f12613b;
    public String f12614c;
    public String f12615d;
    public int f12616e;
    public long f12617f;
    public String f12618g;
    public String[] f12619h;
    public String[] f12620i;

    public static ht[] bk_() {
        if (f12612a == null) {
            synchronized (h.b) {
                if (f12612a == null) {
                    f12612a = new ht[0];
                }
            }
        }
        return f12612a;
    }

    public ht() {
        this.f12613b = 0;
        this.f12614c = "";
        this.f12615d = "";
        this.f12616e = 0;
        this.f12617f = 0;
        this.f12618g = "";
        this.f12619h = l.j;
        this.f12620i = l.j;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ht)) {
            return false;
        }
        ht htVar = (ht) obj;
        if ((this.f12613b & 1) != (htVar.f12613b & 1)) {
            return false;
        }
        if (!this.f12614c.equals(htVar.f12614c)) {
            return false;
        }
        if ((this.f12613b & 2) != (htVar.f12613b & 2)) {
            return false;
        }
        if (!this.f12615d.equals(htVar.f12615d)) {
            return false;
        }
        if ((this.f12613b & 4) != (htVar.f12613b & 4)) {
            return false;
        }
        if (this.f12616e != htVar.f12616e) {
            return false;
        }
        if ((this.f12613b & 8) != (htVar.f12613b & 8)) {
            return false;
        }
        if (this.f12617f != htVar.f12617f) {
            return false;
        }
        if ((this.f12613b & 16) != (htVar.f12613b & 16)) {
            return false;
        }
        if (!this.f12618g.equals(htVar.f12618g)) {
            return false;
        }
        if (!h.a(this.f12619h, htVar.f12619h)) {
            return false;
        }
        if (!h.a(this.f12620i, htVar.f12620i)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(htVar.aO);
        }
        if (htVar.aO == null || htVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((getClass().getName().hashCode() + 527) * 31) + this.f12614c.hashCode()) * 31) + this.f12615d.hashCode()) * 31) + this.f12616e;
        long j = this.f12617f;
        int hashCode2 = ((((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f12618g.hashCode()) * 31) + h.a(this.f12619h)) * 31) + h.a(this.f12620i)) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + hashCode2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f12613b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12614c);
        }
        if ((this.f12613b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12615d);
        }
        if ((this.f12613b & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12616e);
        }
        if ((this.f12613b & 8) != 0) {
            codedOutputByteBufferNano.b(4, this.f12617f);
        }
        if ((this.f12613b & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f12618g);
        }
        if (this.f12620i != null && this.f12620i.length > 0) {
            for (String str : this.f12620i) {
                if (str != null) {
                    codedOutputByteBufferNano.a(6, str);
                }
            }
        }
        if (this.f12619h != null && this.f12619h.length > 0) {
            while (i < this.f12619h.length) {
                String str2 = this.f12619h[i];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(7, str2);
                }
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.mo1128b();
        if ((this.f12613b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12614c);
        }
        if ((this.f12613b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12615d);
        }
        if ((this.f12613b & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f12616e);
        }
        if ((this.f12613b & 8) != 0) {
            b += CodedOutputByteBufferNano.f(4, this.f12617f);
        }
        if ((this.f12613b & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f12618g);
        }
        if (this.f12620i != null && this.f12620i.length > 0) {
            i = 0;
            int i4 = 0;
            for (String str : this.f12620i) {
                if (str != null) {
                    i4++;
                    i += CodedOutputByteBufferNano.b(str);
                }
            }
            b = (b + i) + (i4 * 1);
        }
        if (this.f12619h == null || this.f12619h.length <= 0) {
            return b;
        }
        i2 = 0;
        i = 0;
        while (i3 < this.f12619h.length) {
            String str2 = this.f12619h[i3];
            if (str2 != null) {
                i++;
                i2 += CodedOutputByteBufferNano.b(str2);
            }
            i3++;
        }
        return (b + i2) + (i * 1);
    }

    private final ht m12748b(a aVar) {
        while (true) {
            int a = aVar.a();
            int o;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f12614c = aVar.f();
                    this.f12613b |= 1;
                    continue;
                case 18:
                    this.f12615d = aVar.f();
                    this.f12613b |= 2;
                    continue;
                case 24:
                    this.f12613b |= 4;
                    o = aVar.o();
                    try {
                        this.f12616e = br.m12295a(aVar.i());
                        this.f12613b |= 4;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 32:
                    this.f12617f = aVar.j();
                    this.f12613b |= 8;
                    continue;
                case 42:
                    this.f12618g = aVar.f();
                    this.f12613b |= 16;
                    continue;
                case 50:
                    o = l.a(aVar, 50);
                    a = this.f12620i == null ? 0 : this.f12620i.length;
                    obj = new String[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12620i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f12620i = obj;
                    continue;
                case 58:
                    o = l.a(aVar, 58);
                    a = this.f12619h == null ? 0 : this.f12619h.length;
                    obj = new String[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12619h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f12619h = obj;
                    continue;
                default:
                    if (!super.m4918a(aVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12748b(aVar);
    }
}
