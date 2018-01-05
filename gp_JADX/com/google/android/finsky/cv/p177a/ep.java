package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ep extends C0758b {
    public int f12296a;
    public String f12297b;
    public int f12298c;
    public jj f12299d;
    public boolean f12300e;
    public boolean f12301f;

    public ep() {
        this.f12296a = 0;
        this.f12297b = "";
        this.f12298c = 0;
        this.f12299d = null;
        this.f12300e = false;
        this.f12301f = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ep)) {
            return false;
        }
        ep epVar = (ep) obj;
        if ((this.f12296a & 1) != (epVar.f12296a & 1)) {
            return false;
        }
        if (!this.f12297b.equals(epVar.f12297b)) {
            return false;
        }
        if ((this.f12296a & 2) != (epVar.f12296a & 2)) {
            return false;
        }
        if (this.f12298c != epVar.f12298c) {
            return false;
        }
        if (this.f12299d == null) {
            if (epVar.f12299d != null) {
                return false;
            }
        } else if (!this.f12299d.equals(epVar.f12299d)) {
            return false;
        }
        if ((this.f12296a & 4) != (epVar.f12296a & 4)) {
            return false;
        }
        if (this.f12300e != epVar.f12300e) {
            return false;
        }
        if ((this.f12296a & 8) != (epVar.f12296a & 8)) {
            return false;
        }
        if (this.f12301f != epVar.f12301f) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(epVar.aO);
        }
        if (epVar.aO == null || epVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + this.f12297b.hashCode()) * 31) + this.f12298c;
        jj jjVar = this.f12299d;
        int hashCode2 = ((jjVar == null ? 0 : jjVar.hashCode()) + (hashCode * 31)) * 31;
        if (this.f12300e) {
            hashCode = 1231;
        } else {
            hashCode = 1237;
        }
        hashCode = (hashCode + hashCode2) * 31;
        if (!this.f12301f) {
            i = 1237;
        }
        hashCode = (hashCode + i) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i2 = this.aO.hashCode();
        }
        return hashCode + i2;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12296a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12297b);
        }
        if ((this.f12296a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12298c);
        }
        if (this.f12299d != null) {
            codedOutputByteBufferNano.b(3, this.f12299d);
        }
        if ((this.f12296a & 4) != 0) {
            codedOutputByteBufferNano.a(4, this.f12300e);
        }
        if ((this.f12296a & 8) != 0) {
            codedOutputByteBufferNano.a(5, this.f12301f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12296a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12297b);
        }
        if ((this.f12296a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f12298c);
        }
        if (this.f12299d != null) {
            b += CodedOutputByteBufferNano.d(3, this.f12299d);
        }
        if ((this.f12296a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(4) + 1;
        }
        if ((this.f12296a & 8) != 0) {
            return b + (CodedOutputByteBufferNano.d(5) + 1);
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
                    this.f12297b = aVar.f();
                    this.f12296a |= 1;
                    continue;
                case 16:
                    this.f12298c = aVar.i();
                    this.f12296a |= 2;
                    continue;
                case 26:
                    if (this.f12299d == null) {
                        this.f12299d = new jj();
                    }
                    aVar.a(this.f12299d);
                    continue;
                case 32:
                    this.f12300e = aVar.e();
                    this.f12296a |= 4;
                    continue;
                case 40:
                    this.f12301f = aVar.e();
                    this.f12296a |= 8;
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
