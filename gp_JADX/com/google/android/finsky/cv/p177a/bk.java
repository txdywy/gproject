package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class bk extends C0758b {
    public int f11902a;
    public int f11903b;
    public int f11904c;

    public bk() {
        this.f11902a = 0;
        this.f11903b = 0;
        this.f11904c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bk)) {
            return false;
        }
        bk bkVar = (bk) obj;
        if ((this.f11902a & 1) != (bkVar.f11902a & 1)) {
            return false;
        }
        if (this.f11903b != bkVar.f11903b) {
            return false;
        }
        if ((this.f11902a & 2) != (bkVar.f11902a & 2)) {
            return false;
        }
        if (this.f11904c != bkVar.f11904c) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(bkVar.aO);
        }
        if (bkVar.aO == null || bkVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f11903b) * 31) + this.f11904c) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11902a & 1) != 0) {
            codedOutputByteBufferNano.c(1, this.f11903b);
        }
        if ((this.f11902a & 2) != 0) {
            codedOutputByteBufferNano.c(2, this.f11904c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11902a & 1) != 0) {
            b += CodedOutputByteBufferNano.e(1, this.f11903b);
        }
        if ((this.f11902a & 2) != 0) {
            return b + CodedOutputByteBufferNano.e(2, this.f11904c);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f11903b = aVar.i();
                    this.f11902a |= 1;
                    continue;
                case 16:
                    this.f11904c = aVar.i();
                    this.f11902a |= 2;
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
