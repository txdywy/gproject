package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C6211v extends C0758b {
    public int f31054a;
    public String f31055b;
    public String f31056c;
    public String f31057d;
    public String f31058e;
    public String f31059f;
    public String f31060g;
    public String f31061h;

    public C6211v() {
        this.f31054a = 0;
        this.f31055b = "";
        this.f31056c = "";
        this.f31057d = "";
        this.f31058e = "";
        this.f31059f = "";
        this.f31060g = "";
        this.f31061h = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6211v)) {
            return false;
        }
        C6211v c6211v = (C6211v) obj;
        if ((this.f31054a & 1) != (c6211v.f31054a & 1)) {
            return false;
        }
        if (!this.f31055b.equals(c6211v.f31055b)) {
            return false;
        }
        if ((this.f31054a & 2) != (c6211v.f31054a & 2)) {
            return false;
        }
        if (!this.f31056c.equals(c6211v.f31056c)) {
            return false;
        }
        if ((this.f31054a & 4) != (c6211v.f31054a & 4)) {
            return false;
        }
        if (!this.f31057d.equals(c6211v.f31057d)) {
            return false;
        }
        if ((this.f31054a & 8) != (c6211v.f31054a & 8)) {
            return false;
        }
        if (!this.f31058e.equals(c6211v.f31058e)) {
            return false;
        }
        if ((this.f31054a & 16) != (c6211v.f31054a & 16)) {
            return false;
        }
        if (!this.f31059f.equals(c6211v.f31059f)) {
            return false;
        }
        if ((this.f31054a & 32) != (c6211v.f31054a & 32)) {
            return false;
        }
        if (!this.f31060g.equals(c6211v.f31060g)) {
            return false;
        }
        if ((this.f31054a & 64) != (c6211v.f31054a & 64)) {
            return false;
        }
        if (!this.f31061h.equals(c6211v.f31061h)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6211v.aO);
        }
        if (c6211v.aO == null || c6211v.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f31055b.hashCode()) * 31) + this.f31056c.hashCode()) * 31) + this.f31057d.hashCode()) * 31) + this.f31058e.hashCode()) * 31) + this.f31059f.hashCode()) * 31) + this.f31060g.hashCode()) * 31) + this.f31061h.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f31054a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f31055b);
        }
        if ((this.f31054a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f31057d);
        }
        if ((this.f31054a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f31058e);
        }
        if ((this.f31054a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f31059f);
        }
        if ((this.f31054a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f31060g);
        }
        if ((this.f31054a & 2) != 0) {
            codedOutputByteBufferNano.a(7, this.f31056c);
        }
        if ((this.f31054a & 64) != 0) {
            codedOutputByteBufferNano.a(8, this.f31061h);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f31054a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f31055b);
        }
        if ((this.f31054a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f31057d);
        }
        if ((this.f31054a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f31058e);
        }
        if ((this.f31054a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f31059f);
        }
        if ((this.f31054a & 32) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f31060g);
        }
        if ((this.f31054a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f31056c);
        }
        if ((this.f31054a & 64) != 0) {
            return b + CodedOutputByteBufferNano.b(8, this.f31061h);
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
                    this.f31055b = aVar.f();
                    this.f31054a |= 1;
                    continue;
                case 26:
                    this.f31057d = aVar.f();
                    this.f31054a |= 4;
                    continue;
                case 34:
                    this.f31058e = aVar.f();
                    this.f31054a |= 8;
                    continue;
                case 42:
                    this.f31059f = aVar.f();
                    this.f31054a |= 16;
                    continue;
                case 50:
                    this.f31060g = aVar.f();
                    this.f31054a |= 32;
                    continue;
                case 58:
                    this.f31056c = aVar.f();
                    this.f31054a |= 2;
                    continue;
                case 66:
                    this.f31061h = aVar.f();
                    this.f31054a |= 64;
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
