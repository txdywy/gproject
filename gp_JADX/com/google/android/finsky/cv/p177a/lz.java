package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class lz extends C0758b {
    public int f13091a;
    public String f13092b;
    public ma[] f13093c;

    public lz() {
        this.f13091a = 0;
        this.f13092b = "";
        this.f13093c = ma.bU_();
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lz)) {
            return false;
        }
        lz lzVar = (lz) obj;
        if ((this.f13091a & 1) != (lzVar.f13091a & 1)) {
            return false;
        }
        if (!this.f13092b.equals(lzVar.f13092b)) {
            return false;
        }
        if (!h.a(this.f13093c, lzVar.f13093c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(lzVar.aO);
        }
        if (lzVar.aO == null || lzVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f13092b.hashCode()) * 31) + h.a(this.f13093c)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f13091a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f13092b);
        }
        if (this.f13093c != null && this.f13093c.length > 0) {
            for (C0757i c0757i : this.f13093c) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f13091a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f13092b);
        }
        if (this.f13093c == null || this.f13093c.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f13093c) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(2, c0757i);
            }
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
                    this.f13092b = aVar.f();
                    this.f13091a |= 1;
                    continue;
                case 18:
                    int a2 = l.a(aVar, 18);
                    a = this.f13093c == null ? 0 : this.f13093c.length;
                    Object obj = new ma[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f13093c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ma();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ma();
                    aVar.a(obj[a]);
                    this.f13093c = obj;
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
