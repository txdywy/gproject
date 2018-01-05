package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class ak extends C0758b {
    public int f11803a;
    public byte[] f11804b;
    public byte[] f11805c;
    public String f11806d;

    public ak() {
        this.f11803a = 0;
        this.f11804b = l.l;
        this.f11805c = l.l;
        this.f11806d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj;
        if ((this.f11803a & 1) != (akVar.f11803a & 1)) {
            return false;
        }
        if (!Arrays.equals(this.f11804b, akVar.f11804b)) {
            return false;
        }
        if ((this.f11803a & 2) != (akVar.f11803a & 2)) {
            return false;
        }
        if (!Arrays.equals(this.f11805c, akVar.f11805c)) {
            return false;
        }
        if ((this.f11803a & 4) != (akVar.f11803a & 4)) {
            return false;
        }
        if (!this.f11806d.equals(akVar.f11806d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(akVar.aO);
        }
        if (akVar.aO == null || akVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f11804b)) * 31) + Arrays.hashCode(this.f11805c)) * 31) + this.f11806d.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11803a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f11804b);
        }
        if ((this.f11803a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f11805c);
        }
        if ((this.f11803a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f11806d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11803a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f11804b);
        }
        if ((this.f11803a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f11805c);
        }
        if ((this.f11803a & 4) != 0) {
            return b + CodedOutputByteBufferNano.b(3, this.f11806d);
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
                    this.f11804b = aVar.g();
                    this.f11803a |= 1;
                    continue;
                case 18:
                    this.f11805c = aVar.g();
                    this.f11803a |= 2;
                    continue;
                case 26:
                    this.f11806d = aVar.f();
                    this.f11803a |= 4;
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
