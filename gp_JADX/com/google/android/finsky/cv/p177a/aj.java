package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class aj extends C0758b {
    public int f11800a;
    public String f11801b;
    public boolean f11802c;

    public aj() {
        this.f11800a = 0;
        this.f11801b = "";
        this.f11802c = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        if ((this.f11800a & 1) != (ajVar.f11800a & 1)) {
            return false;
        }
        if (!this.f11801b.equals(ajVar.f11801b)) {
            return false;
        }
        if ((this.f11800a & 2) != (ajVar.f11800a & 2)) {
            return false;
        }
        if (this.f11802c != ajVar.f11802c) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ajVar.aO);
        }
        if (ajVar.aO == null || ajVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.f11802c ? 1231 : 1237) + ((((getClass().getName().hashCode() + 527) * 31) + this.f11801b.hashCode()) * 31)) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11800a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f11801b);
        }
        if ((this.f11800a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f11802c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11800a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f11801b);
        }
        if ((this.f11800a & 2) != 0) {
            return b + (CodedOutputByteBufferNano.d(2) + 1);
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
                    this.f11801b = aVar.f();
                    this.f11800a |= 1;
                    continue;
                case 16:
                    this.f11802c = aVar.e();
                    this.f11800a |= 2;
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
