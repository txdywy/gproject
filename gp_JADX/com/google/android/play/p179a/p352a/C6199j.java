package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C6199j extends C0758b {
    public int f30947a;
    public String f30948b;
    public String f30949c;
    public String f30950d;
    public String f30951e;
    public String f30952f;
    public String f30953g;
    public String f30954h;
    public int f30955i;
    public int f30956j;

    public C6199j() {
        this.f30947a = 0;
        this.f30948b = "";
        this.f30949c = "";
        this.f30950d = "";
        this.f30951e = "";
        this.f30952f = "";
        this.f30953g = "";
        this.f30954h = "";
        this.f30955i = 0;
        this.f30956j = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6199j)) {
            return false;
        }
        C6199j c6199j = (C6199j) obj;
        if ((this.f30947a & 1) != (c6199j.f30947a & 1)) {
            return false;
        }
        if (!this.f30948b.equals(c6199j.f30948b)) {
            return false;
        }
        if ((this.f30947a & 2) != (c6199j.f30947a & 2)) {
            return false;
        }
        if (!this.f30949c.equals(c6199j.f30949c)) {
            return false;
        }
        if ((this.f30947a & 4) != (c6199j.f30947a & 4)) {
            return false;
        }
        if (!this.f30950d.equals(c6199j.f30950d)) {
            return false;
        }
        if ((this.f30947a & 8) != (c6199j.f30947a & 8)) {
            return false;
        }
        if (!this.f30951e.equals(c6199j.f30951e)) {
            return false;
        }
        if ((this.f30947a & 16) != (c6199j.f30947a & 16)) {
            return false;
        }
        if (!this.f30952f.equals(c6199j.f30952f)) {
            return false;
        }
        if ((this.f30947a & 32) != (c6199j.f30947a & 32)) {
            return false;
        }
        if (!this.f30953g.equals(c6199j.f30953g)) {
            return false;
        }
        if ((this.f30947a & 64) != (c6199j.f30947a & 64)) {
            return false;
        }
        if (!this.f30954h.equals(c6199j.f30954h)) {
            return false;
        }
        if ((this.f30947a & 128) != (c6199j.f30947a & 128)) {
            return false;
        }
        if (this.f30955i != c6199j.f30955i) {
            return false;
        }
        if ((this.f30947a & 256) != (c6199j.f30947a & 256)) {
            return false;
        }
        if (this.f30956j != c6199j.f30956j) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6199j.aO);
        }
        if (c6199j.aO == null || c6199j.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f30948b.hashCode()) * 31) + this.f30949c.hashCode()) * 31) + this.f30950d.hashCode()) * 31) + this.f30951e.hashCode()) * 31) + this.f30952f.hashCode()) * 31) + this.f30953g.hashCode()) * 31) + this.f30954h.hashCode()) * 31) + this.f30955i) * 31) + this.f30956j) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30947a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f30948b);
        }
        if ((this.f30947a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f30949c);
        }
        if ((this.f30947a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f30950d);
        }
        if ((this.f30947a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f30951e);
        }
        if ((this.f30947a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f30952f);
        }
        if ((this.f30947a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f30953g);
        }
        if ((this.f30947a & 64) != 0) {
            codedOutputByteBufferNano.a(7, this.f30954h);
        }
        if ((this.f30947a & 128) != 0) {
            codedOutputByteBufferNano.a(8, this.f30955i);
        }
        if ((this.f30947a & 256) != 0) {
            codedOutputByteBufferNano.a(9, this.f30956j);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30947a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f30948b);
        }
        if ((this.f30947a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f30949c);
        }
        if ((this.f30947a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f30950d);
        }
        if ((this.f30947a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f30951e);
        }
        if ((this.f30947a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f30952f);
        }
        if ((this.f30947a & 32) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f30953g);
        }
        if ((this.f30947a & 64) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f30954h);
        }
        if ((this.f30947a & 128) != 0) {
            b += CodedOutputByteBufferNano.d(8, this.f30955i);
        }
        if ((this.f30947a & 256) != 0) {
            return b + CodedOutputByteBufferNano.d(9, this.f30956j);
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
                    this.f30948b = aVar.f();
                    this.f30947a |= 1;
                    continue;
                case 18:
                    this.f30949c = aVar.f();
                    this.f30947a |= 2;
                    continue;
                case 26:
                    this.f30950d = aVar.f();
                    this.f30947a |= 4;
                    continue;
                case 34:
                    this.f30951e = aVar.f();
                    this.f30947a |= 8;
                    continue;
                case 42:
                    this.f30952f = aVar.f();
                    this.f30947a |= 16;
                    continue;
                case 50:
                    this.f30953g = aVar.f();
                    this.f30947a |= 32;
                    continue;
                case 58:
                    this.f30954h = aVar.f();
                    this.f30947a |= 64;
                    continue;
                case 64:
                    this.f30955i = aVar.i();
                    this.f30947a |= 128;
                    continue;
                case 72:
                    this.f30956j = aVar.i();
                    this.f30947a |= 256;
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
