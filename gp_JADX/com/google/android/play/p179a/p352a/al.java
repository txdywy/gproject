package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class al extends C0758b {
    public static volatile al[] f30821a;
    public int f30822b;
    public String f30823c;
    public String f30824d;

    public static al[] m28572a() {
        if (f30821a == null) {
            synchronized (h.b) {
                if (f30821a == null) {
                    f30821a = new al[0];
                }
            }
        }
        return f30821a;
    }

    public al() {
        m28576c();
    }

    public final al m28576c() {
        this.f30822b = 0;
        this.f30823c = "";
        this.f30824d = "";
        this.aO = null;
        this.aP = -1;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        if ((this.f30822b & 1) != (alVar.f30822b & 1)) {
            return false;
        }
        if (!this.f30823c.equals(alVar.f30823c)) {
            return false;
        }
        if ((this.f30822b & 2) != (alVar.f30822b & 2)) {
            return false;
        }
        if (!this.f30824d.equals(alVar.f30824d)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(alVar.aO);
        }
        if (alVar.aO == null || alVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.f30823c.hashCode()) * 31) + this.f30824d.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30822b & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f30823c);
        }
        if ((this.f30822b & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f30824d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30822b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f30823c);
        }
        if ((this.f30822b & 2) != 0) {
            return b + CodedOutputByteBufferNano.b(2, this.f30824d);
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
                    this.f30823c = aVar.f();
                    this.f30822b |= 1;
                    continue;
                case 18:
                    this.f30824d = aVar.f();
                    this.f30822b |= 2;
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
