package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class jc extends C0758b {
    public int f12753a;
    public String f12754b;
    public String f12755c;
    public byte[] f12756d;
    public bd f12757e;

    public jc() {
        this.f12753a = 0;
        this.f12754b = "";
        this.f12755c = "";
        this.f12756d = l.l;
        this.f12757e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jc)) {
            return false;
        }
        jc jcVar = (jc) obj;
        if ((this.f12753a & 1) != (jcVar.f12753a & 1)) {
            return false;
        }
        if (!this.f12754b.equals(jcVar.f12754b)) {
            return false;
        }
        if ((this.f12753a & 2) != (jcVar.f12753a & 2)) {
            return false;
        }
        if (!this.f12755c.equals(jcVar.f12755c)) {
            return false;
        }
        if ((this.f12753a & 4) != (jcVar.f12753a & 4)) {
            return false;
        }
        if (!Arrays.equals(this.f12756d, jcVar.f12756d)) {
            return false;
        }
        if (this.f12757e == null) {
            if (jcVar.f12757e != null) {
                return false;
            }
        } else if (!this.f12757e.equals(jcVar.f12757e)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jcVar.aO);
        }
        if (jcVar.aO == null || jcVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((getClass().getName().hashCode() + 527) * 31) + this.f12754b.hashCode()) * 31) + this.f12755c.hashCode()) * 31) + Arrays.hashCode(this.f12756d);
        bd bdVar = this.f12757e;
        hashCode = ((bdVar == null ? 0 : bdVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12753a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12754b);
        }
        if ((this.f12753a & 4) != 0) {
            codedOutputByteBufferNano.a(2, this.f12756d);
        }
        if (this.f12757e != null) {
            codedOutputByteBufferNano.b(3, this.f12757e);
        }
        if ((this.f12753a & 2) != 0) {
            codedOutputByteBufferNano.a(4, this.f12755c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12753a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12754b);
        }
        if ((this.f12753a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12756d);
        }
        if (this.f12757e != null) {
            b += CodedOutputByteBufferNano.d(3, this.f12757e);
        }
        if ((this.f12753a & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(4, this.f12755c);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f12754b = aVar.f();
                    this.f12753a |= 1;
                    continue;
                case 18:
                    this.f12756d = aVar.g();
                    this.f12753a |= 4;
                    continue;
                case 26:
                    if (this.f12757e == null) {
                        this.f12757e = new bd();
                    }
                    aVar.a(this.f12757e);
                    continue;
                case 34:
                    this.f12755c = aVar.f();
                    this.f12753a |= 2;
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
