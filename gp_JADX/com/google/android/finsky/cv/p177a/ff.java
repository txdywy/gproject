package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ff extends C0758b {
    public int f12359a;
    public String f12360b;
    public int f12361c;
    public jj f12362d;

    public ff() {
        this.f12359a = 0;
        this.f12360b = "";
        this.f12361c = 0;
        this.f12362d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ff)) {
            return false;
        }
        ff ffVar = (ff) obj;
        if ((this.f12359a & 1) != (ffVar.f12359a & 1)) {
            return false;
        }
        if (!this.f12360b.equals(ffVar.f12360b)) {
            return false;
        }
        if ((this.f12359a & 2) != (ffVar.f12359a & 2)) {
            return false;
        }
        if (this.f12361c != ffVar.f12361c) {
            return false;
        }
        if (this.f12362d == null) {
            if (ffVar.f12362d != null) {
                return false;
            }
        } else if (!this.f12362d.equals(ffVar.f12362d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ffVar.aO);
        }
        if (ffVar.aO == null || ffVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + this.f12360b.hashCode()) * 31) + this.f12361c;
        jj jjVar = this.f12362d;
        hashCode = ((jjVar == null ? 0 : jjVar.hashCode()) + (hashCode * 31)) * 31;
        if (!(this.aO == null || this.aO.b())) {
            i = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12359a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12360b);
        }
        if ((this.f12359a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12361c);
        }
        if (this.f12362d != null) {
            codedOutputByteBufferNano.b(3, this.f12362d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12359a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12360b);
        }
        if ((this.f12359a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f12361c);
        }
        if (this.f12362d != null) {
            return b + CodedOutputByteBufferNano.d(3, this.f12362d);
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
                    this.f12360b = aVar.f();
                    this.f12359a |= 1;
                    continue;
                case 16:
                    this.f12361c = aVar.i();
                    this.f12359a |= 2;
                    continue;
                case 26:
                    if (this.f12362d == null) {
                        this.f12362d = new jj();
                    }
                    aVar.a(this.f12362d);
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
