package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class jd extends C0758b {
    public int f12758a;
    public je[] f12759b;
    public byte[] f12760c;

    public jd() {
        this.f12758a = 0;
        this.f12759b = je.bv_();
        this.f12760c = l.l;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jd)) {
            return false;
        }
        jd jdVar = (jd) obj;
        if (!h.a(this.f12759b, jdVar.f12759b)) {
            return false;
        }
        if ((this.f12758a & 1) != (jdVar.f12758a & 1)) {
            return false;
        }
        if (!Arrays.equals(this.f12760c, jdVar.f12760c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jdVar.aO);
        }
        if (jdVar.aO == null || jdVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + h.a(this.f12759b)) * 31) + Arrays.hashCode(this.f12760c)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f12759b != null && this.f12759b.length > 0) {
            for (C0757i c0757i : this.f12759b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if ((this.f12758a & 1) != 0) {
            codedOutputByteBufferNano.a(2, this.f12760c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f12759b != null && this.f12759b.length > 0) {
            for (C0757i c0757i : this.f12759b) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
        }
        if ((this.f12758a & 1) != 0) {
            return b + CodedOutputByteBufferNano.b(2, this.f12760c);
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
                    int a2 = l.a(aVar, 10);
                    a = this.f12759b == null ? 0 : this.f12759b.length;
                    Object obj = new je[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f12759b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new je();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new je();
                    aVar.a(obj[a]);
                    this.f12759b = obj;
                    continue;
                case 18:
                    this.f12760c = aVar.g();
                    this.f12758a |= 1;
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
