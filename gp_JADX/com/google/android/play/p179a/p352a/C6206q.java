package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C6206q extends C0758b {
    public static volatile C6206q[] f31018a;
    public int f31019b;
    public String f31020c;
    public String f31021d;

    public static C6206q[] cH_() {
        if (f31018a == null) {
            synchronized (h.b) {
                if (f31018a == null) {
                    f31018a = new C6206q[0];
                }
            }
        }
        return f31018a;
    }

    public C6206q() {
        this.f31019b = 0;
        this.f31020c = "";
        this.f31021d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6206q)) {
            return false;
        }
        C6206q c6206q = (C6206q) obj;
        if ((this.f31019b & 1) != (c6206q.f31019b & 1)) {
            return false;
        }
        if (!this.f31020c.equals(c6206q.f31020c)) {
            return false;
        }
        if ((this.f31019b & 2) != (c6206q.f31019b & 2)) {
            return false;
        }
        if (!this.f31021d.equals(c6206q.f31021d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6206q.aO);
        }
        if (c6206q.aO == null || c6206q.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f31020c.hashCode()) * 31) + this.f31021d.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f31019b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f31020c);
        }
        if ((this.f31019b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f31021d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f31019b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f31020c);
        }
        if ((this.f31019b & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(2, this.f31021d);
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
                    this.f31020c = aVar.f();
                    this.f31019b |= 1;
                    continue;
                case 18:
                    this.f31021d = aVar.f();
                    this.f31019b |= 2;
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
