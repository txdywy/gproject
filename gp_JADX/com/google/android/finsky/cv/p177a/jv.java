package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class jv extends C0758b {
    public int f12820a;
    public String f12821b;
    public String f12822c;
    public String f12823d;
    public int f12824e;
    public boolean f12825f;
    public ly f12826g;

    public jv() {
        this.f12820a = 0;
        this.f12821b = "";
        this.f12822c = "";
        this.f12823d = "";
        this.f12824e = 0;
        this.f12825f = false;
        this.f12826g = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jv)) {
            return false;
        }
        jv jvVar = (jv) obj;
        if ((this.f12820a & 1) != (jvVar.f12820a & 1)) {
            return false;
        }
        if (!this.f12821b.equals(jvVar.f12821b)) {
            return false;
        }
        if ((this.f12820a & 2) != (jvVar.f12820a & 2)) {
            return false;
        }
        if (!this.f12822c.equals(jvVar.f12822c)) {
            return false;
        }
        if ((this.f12820a & 4) != (jvVar.f12820a & 4)) {
            return false;
        }
        if (!this.f12823d.equals(jvVar.f12823d)) {
            return false;
        }
        if ((this.f12820a & 8) != (jvVar.f12820a & 8)) {
            return false;
        }
        if (this.f12824e != jvVar.f12824e) {
            return false;
        }
        if ((this.f12820a & 16) != (jvVar.f12820a & 16)) {
            return false;
        }
        if (this.f12825f != jvVar.f12825f) {
            return false;
        }
        if (this.f12826g == null) {
            if (jvVar.f12826g != null) {
                return false;
            }
        } else if (!this.f12826g.equals(jvVar.f12826g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(jvVar.aO);
        }
        if (jvVar.aO == null || jvVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (this.f12825f ? 1231 : 1237) + ((((((((((getClass().getName().hashCode() + 527) * 31) + this.f12821b.hashCode()) * 31) + this.f12822c.hashCode()) * 31) + this.f12823d.hashCode()) * 31) + this.f12824e) * 31);
        ly lyVar = this.f12826g;
        hashCode = ((lyVar == null ? 0 : lyVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12820a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12821b);
        }
        if ((this.f12820a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12822c);
        }
        if ((this.f12820a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12823d);
        }
        if ((this.f12820a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f12824e);
        }
        if ((this.f12820a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f12825f);
        }
        if (this.f12826g != null) {
            codedOutputByteBufferNano.b(6, this.f12826g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12820a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12821b);
        }
        if ((this.f12820a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12822c);
        }
        if ((this.f12820a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f12823d);
        }
        if ((this.f12820a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f12824e);
        }
        if ((this.f12820a & 16) != 0) {
            b += CodedOutputByteBufferNano.d(5) + 1;
        }
        if (this.f12826g != null) {
            return b + CodedOutputByteBufferNano.d(6, this.f12826g);
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
                    this.f12821b = aVar.f();
                    this.f12820a |= 1;
                    continue;
                case 18:
                    this.f12822c = aVar.f();
                    this.f12820a |= 2;
                    continue;
                case 26:
                    this.f12823d = aVar.f();
                    this.f12820a |= 4;
                    continue;
                case 32:
                    this.f12824e = aVar.i();
                    this.f12820a |= 8;
                    continue;
                case 40:
                    this.f12825f = aVar.e();
                    this.f12820a |= 16;
                    continue;
                case 50:
                    if (this.f12826g == null) {
                        this.f12826g = new ly();
                    }
                    aVar.a(this.f12826g);
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
