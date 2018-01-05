package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C6208s extends C0758b {
    public int f31037a;
    public String f31038b;
    public String f31039c;
    public String f31040d;
    public String f31041e;
    public int f31042f;
    public int f31043g;
    public String f31044h;

    public C6208s() {
        this.f31037a = 0;
        this.f31038b = "";
        this.f31039c = "";
        this.f31040d = "";
        this.f31041e = "";
        this.f31042f = 0;
        this.f31043g = 0;
        this.f31044h = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6208s)) {
            return false;
        }
        C6208s c6208s = (C6208s) obj;
        if ((this.f31037a & 1) != (c6208s.f31037a & 1)) {
            return false;
        }
        if (!this.f31038b.equals(c6208s.f31038b)) {
            return false;
        }
        if ((this.f31037a & 2) != (c6208s.f31037a & 2)) {
            return false;
        }
        if (!this.f31039c.equals(c6208s.f31039c)) {
            return false;
        }
        if ((this.f31037a & 4) != (c6208s.f31037a & 4)) {
            return false;
        }
        if (!this.f31040d.equals(c6208s.f31040d)) {
            return false;
        }
        if ((this.f31037a & 8) != (c6208s.f31037a & 8)) {
            return false;
        }
        if (!this.f31041e.equals(c6208s.f31041e)) {
            return false;
        }
        if ((this.f31037a & 16) != (c6208s.f31037a & 16)) {
            return false;
        }
        if (this.f31042f != c6208s.f31042f) {
            return false;
        }
        if ((this.f31037a & 32) != (c6208s.f31037a & 32)) {
            return false;
        }
        if (this.f31043g != c6208s.f31043g) {
            return false;
        }
        if ((this.f31037a & 64) != (c6208s.f31037a & 64)) {
            return false;
        }
        if (!this.f31044h.equals(c6208s.f31044h)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6208s.aO);
        }
        if (c6208s.aO == null || c6208s.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f31038b.hashCode()) * 31) + this.f31039c.hashCode()) * 31) + this.f31040d.hashCode()) * 31) + this.f31041e.hashCode()) * 31) + this.f31042f) * 31) + this.f31043g) * 31) + this.f31044h.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f31037a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f31038b);
        }
        if ((this.f31037a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f31039c);
        }
        if ((this.f31037a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f31040d);
        }
        if ((this.f31037a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f31041e);
        }
        if ((this.f31037a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f31042f);
        }
        if ((this.f31037a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f31043g);
        }
        if ((this.f31037a & 64) != 0) {
            codedOutputByteBufferNano.a(7, this.f31044h);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f31037a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f31038b);
        }
        if ((this.f31037a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f31039c);
        }
        if ((this.f31037a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f31040d);
        }
        if ((this.f31037a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f31041e);
        }
        if ((this.f31037a & 16) != 0) {
            b += CodedOutputByteBufferNano.d(5, this.f31042f);
        }
        if ((this.f31037a & 32) != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f31043g);
        }
        if ((this.f31037a & 64) != 0) {
            return b + CodedOutputByteBufferNano.b(7, this.f31044h);
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
                    this.f31038b = aVar.f();
                    this.f31037a |= 1;
                    continue;
                case 18:
                    this.f31039c = aVar.f();
                    this.f31037a |= 2;
                    continue;
                case 26:
                    this.f31040d = aVar.f();
                    this.f31037a |= 4;
                    continue;
                case 34:
                    this.f31041e = aVar.f();
                    this.f31037a |= 8;
                    continue;
                case 40:
                    this.f31042f = aVar.i();
                    this.f31037a |= 16;
                    continue;
                case 48:
                    this.f31043g = aVar.i();
                    this.f31037a |= 32;
                    continue;
                case 58:
                    this.f31044h = aVar.f();
                    this.f31037a |= 64;
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
