package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class ch extends C0758b {
    public static volatile ch[] f12033a;
    public int f12034b;
    public String f12035c;
    public int f12036d;
    public int f12037e;
    public boolean f12038f;
    public boolean f12039g;

    public static ch[] aP_() {
        if (f12033a == null) {
            synchronized (h.b) {
                if (f12033a == null) {
                    f12033a = new ch[0];
                }
            }
        }
        return f12033a;
    }

    public ch() {
        this.f12034b = 0;
        this.f12035c = "";
        this.f12036d = 0;
        this.f12037e = 0;
        this.f12038f = false;
        this.f12039g = false;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ch)) {
            return false;
        }
        ch chVar = (ch) obj;
        if ((this.f12034b & 1) != (chVar.f12034b & 1)) {
            return false;
        }
        if (!this.f12035c.equals(chVar.f12035c)) {
            return false;
        }
        if ((this.f12034b & 2) != (chVar.f12034b & 2)) {
            return false;
        }
        if (this.f12036d != chVar.f12036d) {
            return false;
        }
        if ((this.f12034b & 4) != (chVar.f12034b & 4)) {
            return false;
        }
        if (this.f12037e != chVar.f12037e) {
            return false;
        }
        if ((this.f12034b & 8) != (chVar.f12034b & 8)) {
            return false;
        }
        if (this.f12038f != chVar.f12038f) {
            return false;
        }
        if ((this.f12034b & 16) != (chVar.f12034b & 16)) {
            return false;
        }
        if (this.f12039g != chVar.f12039g) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(chVar.aO);
        }
        if (chVar.aO == null || chVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = ((this.f12038f ? 1231 : 1237) + ((((((((getClass().getName().hashCode() + 527) * 31) + this.f12035c.hashCode()) * 31) + this.f12036d) * 31) + this.f12037e) * 31)) * 31;
        if (!this.f12039g) {
            i = 1237;
        }
        i = (hashCode + i) * 31;
        if (this.aO == null || this.aO.b()) {
            hashCode = 0;
        } else {
            hashCode = this.aO.hashCode();
        }
        return hashCode + i;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12034b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12035c);
        }
        if ((this.f12034b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12036d);
        }
        if ((this.f12034b & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12037e);
        }
        if ((this.f12034b & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f12038f);
        }
        if ((this.f12034b & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f12039g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12034b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f12035c);
        }
        if ((this.f12034b & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f12036d);
        }
        if ((this.f12034b & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f12037e);
        }
        if ((this.f12034b & 8) != 0) {
            b += CodedOutputByteBufferNano.d(4) + 1;
        }
        if ((this.f12034b & 16) != 0) {
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
                    this.f12035c = aVar.f();
                    this.f12034b |= 1;
                    continue;
                case 16:
                    this.f12036d = aVar.i();
                    this.f12034b |= 2;
                    continue;
                case 24:
                    this.f12037e = aVar.i();
                    this.f12034b |= 4;
                    continue;
                case 32:
                    this.f12038f = aVar.e();
                    this.f12034b |= 8;
                    continue;
                case 40:
                    this.f12039g = aVar.e();
                    this.f12034b |= 16;
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
