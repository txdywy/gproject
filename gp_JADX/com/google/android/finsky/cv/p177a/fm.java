package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class fm extends C0758b {
    public int f12383a;
    public String f12384b;
    public String f12385c;
    public String f12386d;
    public String f12387e;
    public String f12388f;

    public fm() {
        this.f12383a = 0;
        this.f12384b = "";
        this.f12385c = "";
        this.f12386d = "";
        this.f12387e = "";
        this.f12388f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fm)) {
            return false;
        }
        fm fmVar = (fm) obj;
        if ((this.f12383a & 1) != (fmVar.f12383a & 1)) {
            return false;
        }
        if (!this.f12384b.equals(fmVar.f12384b)) {
            return false;
        }
        if ((this.f12383a & 2) != (fmVar.f12383a & 2)) {
            return false;
        }
        if (!this.f12385c.equals(fmVar.f12385c)) {
            return false;
        }
        if ((this.f12383a & 4) != (fmVar.f12383a & 4)) {
            return false;
        }
        if (!this.f12386d.equals(fmVar.f12386d)) {
            return false;
        }
        if ((this.f12383a & 8) != (fmVar.f12383a & 8)) {
            return false;
        }
        if (!this.f12387e.equals(fmVar.f12387e)) {
            return false;
        }
        if ((this.f12383a & 16) != (fmVar.f12383a & 16)) {
            return false;
        }
        if (!this.f12388f.equals(fmVar.f12388f)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(fmVar.aO);
        }
        if (fmVar.aO == null || fmVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + this.f12384b.hashCode()) * 31) + this.f12385c.hashCode()) * 31) + this.f12386d.hashCode()) * 31) + this.f12387e.hashCode()) * 31) + this.f12388f.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12383a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12384b);
        }
        if ((this.f12383a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12385c);
        }
        if ((this.f12383a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12386d);
        }
        if ((this.f12383a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f12387e);
        }
        if ((this.f12383a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f12388f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12383a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12384b);
        }
        if ((this.f12383a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12385c);
        }
        if ((this.f12383a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12386d);
        }
        if ((this.f12383a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12387e);
        }
        if ((this.f12383a & 16) != 0) {
            return b + CodedOutputByteBufferNano.b(5, this.f12388f);
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
                    this.f12384b = aVar.f();
                    this.f12383a |= 1;
                    continue;
                case 18:
                    this.f12385c = aVar.f();
                    this.f12383a |= 2;
                    continue;
                case 26:
                    this.f12386d = aVar.f();
                    this.f12383a |= 4;
                    continue;
                case 34:
                    this.f12387e = aVar.f();
                    this.f12383a |= 8;
                    continue;
                case 42:
                    this.f12388f = aVar.f();
                    this.f12383a |= 16;
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
