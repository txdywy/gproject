package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class cb extends C0758b {
    public int f12006a;
    public String f12007b;
    public String f12008c;
    public String f12009d;
    public dl[] f12010e;
    public eu f12011f;
    public byte[] f12012g;

    public cb() {
        this.f12006a = 0;
        this.f12007b = "";
        this.f12008c = "";
        this.f12009d = "";
        this.f12010e = dl.aU_();
        this.f12011f = null;
        this.f12012g = l.l;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        if ((this.f12006a & 1) != (cbVar.f12006a & 1)) {
            return false;
        }
        if (!this.f12007b.equals(cbVar.f12007b)) {
            return false;
        }
        if ((this.f12006a & 2) != (cbVar.f12006a & 2)) {
            return false;
        }
        if (!this.f12008c.equals(cbVar.f12008c)) {
            return false;
        }
        if ((this.f12006a & 4) != (cbVar.f12006a & 4)) {
            return false;
        }
        if (!this.f12009d.equals(cbVar.f12009d)) {
            return false;
        }
        if (!h.a(this.f12010e, cbVar.f12010e)) {
            return false;
        }
        if (this.f12011f == null) {
            if (cbVar.f12011f != null) {
                return false;
            }
        } else if (!this.f12011f.equals(cbVar.f12011f)) {
            return false;
        }
        if ((this.f12006a & 8) != (cbVar.f12006a & 8)) {
            return false;
        }
        if (!Arrays.equals(this.f12012g, cbVar.f12012g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(cbVar.aO);
        }
        if (cbVar.aO == null || cbVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((((getClass().getName().hashCode() + 527) * 31) + this.f12007b.hashCode()) * 31) + this.f12008c.hashCode()) * 31) + this.f12009d.hashCode()) * 31) + h.a(this.f12010e);
        eu euVar = this.f12011f;
        hashCode = ((((euVar == null ? 0 : euVar.hashCode()) + (hashCode * 31)) * 31) + Arrays.hashCode(this.f12012g)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12006a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12007b);
        }
        if ((this.f12006a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12008c);
        }
        if ((this.f12006a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12009d);
        }
        if (this.f12010e != null && this.f12010e.length > 0) {
            for (C0757i c0757i : this.f12010e) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(4, c0757i);
                }
            }
        }
        if (this.f12011f != null) {
            codedOutputByteBufferNano.b(5, this.f12011f);
        }
        if ((this.f12006a & 8) != 0) {
            codedOutputByteBufferNano.a(6, this.f12012g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12006a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12007b);
        }
        if ((this.f12006a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12008c);
        }
        if ((this.f12006a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12009d);
        }
        if (this.f12010e != null && this.f12010e.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f12010e) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(4, c0757i);
                }
            }
            b = i;
        }
        if (this.f12011f != null) {
            b += CodedOutputByteBufferNano.d(5, this.f12011f);
        }
        if ((this.f12006a & 8) != 0) {
            return b + CodedOutputByteBufferNano.b(6, this.f12012g);
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
                    this.f12007b = aVar.f();
                    this.f12006a |= 1;
                    continue;
                case 18:
                    this.f12008c = aVar.f();
                    this.f12006a |= 2;
                    continue;
                case 26:
                    this.f12009d = aVar.f();
                    this.f12006a |= 4;
                    continue;
                case 34:
                    int a2 = l.a(aVar, 34);
                    a = this.f12010e == null ? 0 : this.f12010e.length;
                    Object obj = new dl[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12010e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new dl();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new dl();
                    aVar.a(obj[a]);
                    this.f12010e = obj;
                    continue;
                case 42:
                    if (this.f12011f == null) {
                        this.f12011f = new eu();
                    }
                    aVar.a(this.f12011f);
                    continue;
                case 50:
                    this.f12012g = aVar.g();
                    this.f12006a |= 8;
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
