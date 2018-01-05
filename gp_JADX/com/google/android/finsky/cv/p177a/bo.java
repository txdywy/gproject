package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class bo extends C0758b {
    public bz f11948a;
    public bk f11949b;
    public bk f11950c;

    public bo() {
        this.f11948a = null;
        this.f11949b = null;
        this.f11950c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bo)) {
            return false;
        }
        bo boVar = (bo) obj;
        if (this.f11948a == null) {
            if (boVar.f11948a != null) {
                return false;
            }
        } else if (!this.f11948a.equals(boVar.f11948a)) {
            return false;
        }
        if (this.f11949b == null) {
            if (boVar.f11949b != null) {
                return false;
            }
        } else if (!this.f11949b.equals(boVar.f11949b)) {
            return false;
        }
        if (this.f11950c == null) {
            if (boVar.f11950c != null) {
                return false;
            }
        } else if (!this.f11950c.equals(boVar.f11950c)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(boVar.aO);
        }
        if (boVar.aO == null || boVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = getClass().getName().hashCode() + 527;
        bz bzVar = this.f11948a;
        hashCode = (bzVar == null ? 0 : bzVar.hashCode()) + (hashCode * 31);
        bk bkVar = this.f11949b;
        hashCode = (bkVar == null ? 0 : bkVar.hashCode()) + (hashCode * 31);
        bkVar = this.f11950c;
        hashCode = ((bkVar == null ? 0 : bkVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f11948a != null) {
            codedOutputByteBufferNano.b(1, this.f11948a);
        }
        if (this.f11949b != null) {
            codedOutputByteBufferNano.b(2, this.f11949b);
        }
        if (this.f11950c != null) {
            codedOutputByteBufferNano.b(3, this.f11950c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f11948a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f11948a);
        }
        if (this.f11949b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f11949b);
        }
        if (this.f11950c != null) {
            return b + CodedOutputByteBufferNano.d(3, this.f11950c);
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
                    if (this.f11948a == null) {
                        this.f11948a = new bz();
                    }
                    aVar.a(this.f11948a);
                    continue;
                case 18:
                    if (this.f11949b == null) {
                        this.f11949b = new bk();
                    }
                    aVar.a(this.f11949b);
                    continue;
                case 26:
                    if (this.f11950c == null) {
                        this.f11950c = new bk();
                    }
                    aVar.a(this.f11950c);
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
