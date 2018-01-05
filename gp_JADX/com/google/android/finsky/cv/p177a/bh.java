package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class bh extends C0758b {
    public static volatile bh[] f11888a;
    public int f11889b;
    public long f11890c;
    public int f11891d;
    public boolean f11892e;
    public boolean f11893f;
    public long f11894g;

    public static bh[] aJ_() {
        if (f11888a == null) {
            synchronized (h.b) {
                if (f11888a == null) {
                    f11888a = new bh[0];
                }
            }
        }
        return f11888a;
    }

    public bh() {
        this.f11889b = 0;
        this.f11890c = 0;
        this.f11891d = 0;
        this.f11892e = false;
        this.f11893f = false;
        this.f11894g = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bh)) {
            return false;
        }
        bh bhVar = (bh) obj;
        if ((this.f11889b & 1) != (bhVar.f11889b & 1)) {
            return false;
        }
        if (this.f11890c != bhVar.f11890c) {
            return false;
        }
        if ((this.f11889b & 2) != (bhVar.f11889b & 2)) {
            return false;
        }
        if (this.f11891d != bhVar.f11891d) {
            return false;
        }
        if ((this.f11889b & 4) != (bhVar.f11889b & 4)) {
            return false;
        }
        if (this.f11892e != bhVar.f11892e) {
            return false;
        }
        if ((this.f11889b & 8) != (bhVar.f11889b & 8)) {
            return false;
        }
        if (this.f11893f != bhVar.f11893f) {
            return false;
        }
        if ((this.f11889b & 16) != (bhVar.f11889b & 16)) {
            return false;
        }
        if (this.f11894g != bhVar.f11894g) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(bhVar.aO);
        }
        if (bhVar.aO == null || bhVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = getClass().getName().hashCode() + 527;
        long j = this.f11890c;
        hashCode = ((this.f11892e ? 1231 : 1237) + (((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f11891d) * 31)) * 31;
        if (!this.f11893f) {
            i = 1237;
        }
        hashCode += i;
        long j2 = this.f11894g;
        i = ((hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11889b & 1) != 0) {
            codedOutputByteBufferNano.c(1, this.f11890c);
        }
        if ((this.f11889b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f11891d);
        }
        if ((this.f11889b & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f11892e);
        }
        if ((this.f11889b & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f11893f);
        }
        if ((this.f11889b & 16) != 0) {
            codedOutputByteBufferNano.b(5, this.f11894g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11889b & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1) + 8;
        }
        if ((this.f11889b & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f11891d);
        }
        if ((this.f11889b & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3) + 1;
        }
        if ((this.f11889b & 8) != 0) {
            b += CodedOutputByteBufferNano.d(4) + 1;
        }
        if ((this.f11889b & 16) != 0) {
            return b + CodedOutputByteBufferNano.f(5, this.f11894g);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f11890c = aVar.l();
                    this.f11889b |= 1;
                    continue;
                case 16:
                    this.f11891d = aVar.i();
                    this.f11889b |= 2;
                    continue;
                case 24:
                    this.f11892e = aVar.e();
                    this.f11889b |= 4;
                    continue;
                case 32:
                    this.f11893f = aVar.e();
                    this.f11889b |= 8;
                    continue;
                case 40:
                    this.f11894g = aVar.j();
                    this.f11889b |= 16;
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
