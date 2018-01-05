package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class gz extends C0758b {
    public gy f12519a;
    public jq f12520b;
    public hc[] f12521c;
    public jr f12522d;

    public gz() {
        this.f12519a = null;
        this.f12520b = null;
        this.f12521c = hc.bh_();
        this.f12522d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gz)) {
            return false;
        }
        gz gzVar = (gz) obj;
        if (this.f12519a == null) {
            if (gzVar.f12519a != null) {
                return false;
            }
        } else if (!this.f12519a.equals(gzVar.f12519a)) {
            return false;
        }
        if (this.f12520b == null) {
            if (gzVar.f12520b != null) {
                return false;
            }
        } else if (!this.f12520b.equals(gzVar.f12520b)) {
            return false;
        }
        if (!h.a(this.f12521c, gzVar.f12521c)) {
            return false;
        }
        if (this.f12522d == null) {
            if (gzVar.f12522d != null) {
                return false;
            }
        } else if (!this.f12522d.equals(gzVar.f12522d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(gzVar.aO);
        }
        if (gzVar.aO == null || gzVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        gy gyVar = this.f12519a;
        hashCode = (gyVar == null ? 0 : gyVar.hashCode()) + (hashCode * 31);
        jq jqVar = this.f12520b;
        hashCode = (((jqVar == null ? 0 : jqVar.hashCode()) + (hashCode * 31)) * 31) + h.a(this.f12521c);
        jr jrVar = this.f12522d;
        hashCode = ((jrVar == null ? 0 : jrVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12519a != null) {
            codedOutputByteBufferNano.b(1, this.f12519a);
        }
        if (this.f12520b != null) {
            codedOutputByteBufferNano.b(2, this.f12520b);
        }
        if (this.f12521c != null && this.f12521c.length > 0) {
            for (C0757i c0757i : this.f12521c) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(3, c0757i);
                }
            }
        }
        if (this.f12522d != null) {
            codedOutputByteBufferNano.b(4, this.f12522d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12519a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f12519a);
        }
        if (this.f12520b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f12520b);
        }
        if (this.f12521c != null && this.f12521c.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f12521c) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(3, c0757i);
                }
            }
            b = i;
        }
        if (this.f12522d != null) {
            return b + CodedOutputByteBufferNano.d(4, this.f12522d);
        }
        return b;
    }

    public static gz m12689a(byte[] bArr) {
        return (gz) C0757i.m4905a(new gz(), bArr);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f12519a == null) {
                        this.f12519a = new gy();
                    }
                    aVar.a(this.f12519a);
                    continue;
                case 18:
                    if (this.f12520b == null) {
                        this.f12520b = new jq();
                    }
                    aVar.a(this.f12520b);
                    continue;
                case 26:
                    int a2 = l.a(aVar, 26);
                    a = this.f12521c == null ? 0 : this.f12521c.length;
                    Object obj = new hc[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12521c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new hc();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new hc();
                    aVar.a(obj[a]);
                    this.f12521c = obj;
                    continue;
                case 34:
                    if (this.f12522d == null) {
                        this.f12522d = new jr();
                    }
                    aVar.a(this.f12522d);
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
}
