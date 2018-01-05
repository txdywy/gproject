package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C6214y extends C0758b {
    public int f31077a;
    public String f31078b;
    public String f31079c;
    public String f31080d;
    public String f31081e;
    public String f31082f;
    public String f31083g;

    public C6214y() {
        this.f31077a = 0;
        this.f31078b = "";
        this.f31079c = "";
        this.f31080d = "";
        this.f31081e = "";
        this.f31082f = "";
        this.f31083g = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6214y)) {
            return false;
        }
        C6214y c6214y = (C6214y) obj;
        if ((this.f31077a & 1) != (c6214y.f31077a & 1)) {
            return false;
        }
        if (!this.f31078b.equals(c6214y.f31078b)) {
            return false;
        }
        if ((this.f31077a & 2) != (c6214y.f31077a & 2)) {
            return false;
        }
        if (!this.f31079c.equals(c6214y.f31079c)) {
            return false;
        }
        if ((this.f31077a & 4) != (c6214y.f31077a & 4)) {
            return false;
        }
        if (!this.f31080d.equals(c6214y.f31080d)) {
            return false;
        }
        if ((this.f31077a & 8) != (c6214y.f31077a & 8)) {
            return false;
        }
        if (!this.f31081e.equals(c6214y.f31081e)) {
            return false;
        }
        if ((this.f31077a & 16) != (c6214y.f31077a & 16)) {
            return false;
        }
        if (!this.f31082f.equals(c6214y.f31082f)) {
            return false;
        }
        if ((this.f31077a & 32) != (c6214y.f31077a & 32)) {
            return false;
        }
        if (!this.f31083g.equals(c6214y.f31083g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6214y.aO);
        }
        if (c6214y.aO == null || c6214y.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f31078b.hashCode()) * 31) + this.f31079c.hashCode()) * 31) + this.f31080d.hashCode()) * 31) + this.f31081e.hashCode()) * 31) + this.f31082f.hashCode()) * 31) + this.f31083g.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f31077a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f31078b);
        }
        if ((this.f31077a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f31079c);
        }
        if ((this.f31077a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f31080d);
        }
        if ((this.f31077a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f31081e);
        }
        if ((this.f31077a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f31082f);
        }
        if ((this.f31077a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f31083g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f31077a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f31078b);
        }
        if ((this.f31077a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f31079c);
        }
        if ((this.f31077a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f31080d);
        }
        if ((this.f31077a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f31081e);
        }
        if ((this.f31077a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f31082f);
        }
        if ((this.f31077a & 32) != 0) {
            return b + CodedOutputByteBufferNano.b(6, this.f31083g);
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
                    this.f31078b = aVar.f();
                    this.f31077a |= 1;
                    continue;
                case 18:
                    this.f31079c = aVar.f();
                    this.f31077a |= 2;
                    continue;
                case 26:
                    this.f31080d = aVar.f();
                    this.f31077a |= 4;
                    continue;
                case 34:
                    this.f31081e = aVar.f();
                    this.f31077a |= 8;
                    continue;
                case 42:
                    this.f31082f = aVar.f();
                    this.f31077a |= 16;
                    continue;
                case 50:
                    this.f31083g = aVar.f();
                    this.f31077a |= 32;
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
