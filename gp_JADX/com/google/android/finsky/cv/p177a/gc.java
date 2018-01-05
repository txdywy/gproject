package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class gc extends C0758b {
    public int f12419a;
    public String f12420b;
    public String f12421c;
    public ah f12422d;
    public String f12423e;
    public String f12424f;
    public String f12425g;

    public gc() {
        this.f12419a = 0;
        this.f12420b = "";
        this.f12421c = "";
        this.f12422d = null;
        this.f12423e = "";
        this.f12424f = "";
        this.f12425g = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        if ((this.f12419a & 1) != (gcVar.f12419a & 1)) {
            return false;
        }
        if (!this.f12420b.equals(gcVar.f12420b)) {
            return false;
        }
        if ((this.f12419a & 2) != (gcVar.f12419a & 2)) {
            return false;
        }
        if (!this.f12421c.equals(gcVar.f12421c)) {
            return false;
        }
        if (this.f12422d == null) {
            if (gcVar.f12422d != null) {
                return false;
            }
        } else if (!this.f12422d.equals(gcVar.f12422d)) {
            return false;
        }
        if ((this.f12419a & 4) != (gcVar.f12419a & 4)) {
            return false;
        }
        if (!this.f12423e.equals(gcVar.f12423e)) {
            return false;
        }
        if ((this.f12419a & 8) != (gcVar.f12419a & 8)) {
            return false;
        }
        if (!this.f12424f.equals(gcVar.f12424f)) {
            return false;
        }
        if ((this.f12419a & 16) != (gcVar.f12419a & 16)) {
            return false;
        }
        if (!this.f12425g.equals(gcVar.f12425g)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(gcVar.aO);
        }
        if (gcVar.aO == null || gcVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + this.f12420b.hashCode()) * 31) + this.f12421c.hashCode();
        ah ahVar = this.f12422d;
        hashCode = ((((((((ahVar == null ? 0 : ahVar.hashCode()) + (hashCode * 31)) * 31) + this.f12423e.hashCode()) * 31) + this.f12424f.hashCode()) * 31) + this.f12425g.hashCode()) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12419a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12420b);
        }
        if ((this.f12419a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12421c);
        }
        if (this.f12422d != null) {
            codedOutputByteBufferNano.b(3, this.f12422d);
        }
        if ((this.f12419a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f12423e);
        }
        if ((this.f12419a & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f12424f);
        }
        if ((this.f12419a & 16) != 0) {
            codedOutputByteBufferNano.a(6, this.f12425g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12419a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12420b);
        }
        if ((this.f12419a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f12421c);
        }
        if (this.f12422d != null) {
            b += CodedOutputByteBufferNano.d(3, this.f12422d);
        }
        if ((this.f12419a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12423e);
        }
        if ((this.f12419a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f12424f);
        }
        if ((this.f12419a & 16) != 0) {
            return b + CodedOutputByteBufferNano.b(6, this.f12425g);
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
                    this.f12420b = aVar.f();
                    this.f12419a |= 1;
                    continue;
                case 18:
                    this.f12421c = aVar.f();
                    this.f12419a |= 2;
                    continue;
                case 26:
                    if (this.f12422d == null) {
                        this.f12422d = new ah();
                    }
                    aVar.a(this.f12422d);
                    continue;
                case 34:
                    this.f12423e = aVar.f();
                    this.f12419a |= 4;
                    continue;
                case 42:
                    this.f12424f = aVar.f();
                    this.f12419a |= 8;
                    continue;
                case 50:
                    this.f12425g = aVar.f();
                    this.f12419a |= 16;
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
