package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class dp extends C0758b {
    public static volatile dp[] f12191a;
    public int f12192b;
    public int f12193c;
    public String[] f12194d;

    public static int m12451a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum AvailabilityProblemType");
        }
    }

    public static dp[] aW_() {
        if (f12191a == null) {
            synchronized (h.b) {
                if (f12191a == null) {
                    f12191a = new dp[0];
                }
            }
        }
        return f12191a;
    }

    public dp() {
        this.f12192b = 0;
        this.f12193c = 1;
        this.f12194d = l.j;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dp)) {
            return false;
        }
        dp dpVar = (dp) obj;
        if ((this.f12192b & 1) != (dpVar.f12192b & 1)) {
            return false;
        }
        if (this.f12193c != dpVar.f12193c) {
            return false;
        }
        if (!h.a(this.f12194d, dpVar.f12194d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(dpVar.aO);
        }
        if (dpVar.aO == null || dpVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f12193c) * 31) + h.a(this.f12194d)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12192b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12193c);
        }
        if (this.f12194d != null && this.f12194d.length > 0) {
            for (String str : this.f12194d) {
                if (str != null) {
                    codedOutputByteBufferNano.a(2, str);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if ((this.f12192b & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12193c);
        }
        if (this.f12194d == null || this.f12194d.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f12194d.length) {
            String str = this.f12194d[i];
            if (str != null) {
                i3++;
                i2 += CodedOutputByteBufferNano.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private final dp m12452b(a aVar) {
        int o;
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f12192b |= 1;
                    o = aVar.o();
                    try {
                        this.f12193c = dp.m12451a(aVar.i());
                        this.f12192b |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 18:
                    o = l.a(aVar, 18);
                    a = this.f12194d == null ? 0 : this.f12194d.length;
                    Object obj = new String[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12194d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f12194d = obj;
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
        return m12452b(aVar);
    }
}
