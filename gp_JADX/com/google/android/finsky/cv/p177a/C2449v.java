package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C2449v extends C0758b {
    public int f13210a;
    public String[] f13211b;
    public String f13212c;
    public String f13213d;

    public C2449v() {
        this.f13210a = 0;
        this.f13211b = l.j;
        this.f13212c = "";
        this.f13213d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2449v)) {
            return false;
        }
        C2449v c2449v = (C2449v) obj;
        if (!h.a(this.f13211b, c2449v.f13211b)) {
            return false;
        }
        if ((this.f13210a & 1) != (c2449v.f13210a & 1)) {
            return false;
        }
        if (!this.f13212c.equals(c2449v.f13212c)) {
            return false;
        }
        if ((this.f13210a & 2) != (c2449v.f13210a & 2)) {
            return false;
        }
        if (!this.f13213d.equals(c2449v.f13213d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2449v.aO);
        }
        if (c2449v.aO == null || c2449v.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f13211b)) * 31) + this.f13212c.hashCode()) * 31) + this.f13213d.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f13211b != null && this.f13211b.length > 0) {
            for (String str : this.f13211b) {
                if (str != null) {
                    codedOutputByteBufferNano.a(1, str);
                }
            }
        }
        if ((this.f13210a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f13212c);
        }
        if ((this.f13210a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f13213d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f13211b == null || this.f13211b.length <= 0) {
            i = b;
        } else {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f13211b.length) {
                String str = this.f13211b[i];
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.b(str);
                }
                i++;
            }
            i = (b + i2) + (i3 * 1);
        }
        if ((this.f13210a & 1) != 0) {
            i += CodedOutputByteBufferNano.b(2, this.f13212c);
        }
        if ((this.f13210a & 2) != 0) {
            return i + CodedOutputByteBufferNano.b(3, this.f13213d);
        }
        return i;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int a2 = l.a(aVar, 10);
                    a = this.f13211b == null ? 0 : this.f13211b.length;
                    Object obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f13211b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f13211b = obj;
                    continue;
                case 18:
                    this.f13212c = aVar.f();
                    this.f13210a |= 1;
                    continue;
                case 26:
                    this.f13213d = aVar.f();
                    this.f13210a |= 2;
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
