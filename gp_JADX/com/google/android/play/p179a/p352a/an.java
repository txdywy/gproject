package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class an extends C0758b {
    public int f30828a;
    public String f30829b;
    public String f30830c;
    public String f30831d;
    public String f30832e;
    public String f30833f;
    public String f30834g;
    public String f30835h;
    public String f30836i;
    public String f30837j;

    public an() {
        this.f30828a = 0;
        this.f30829b = "";
        this.f30830c = "";
        this.f30831d = "";
        this.f30832e = "";
        this.f30833f = "";
        this.f30834g = "";
        this.f30835h = "";
        this.f30836i = "";
        this.f30837j = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof an)) {
            return false;
        }
        an anVar = (an) obj;
        if ((this.f30828a & 1) != (anVar.f30828a & 1)) {
            return false;
        }
        if (!this.f30829b.equals(anVar.f30829b)) {
            return false;
        }
        if ((this.f30828a & 2) != (anVar.f30828a & 2)) {
            return false;
        }
        if (!this.f30830c.equals(anVar.f30830c)) {
            return false;
        }
        if ((this.f30828a & 4) != (anVar.f30828a & 4)) {
            return false;
        }
        if (!this.f30831d.equals(anVar.f30831d)) {
            return false;
        }
        if ((this.f30828a & 8) != (anVar.f30828a & 8)) {
            return false;
        }
        if (!this.f30832e.equals(anVar.f30832e)) {
            return false;
        }
        if ((this.f30828a & 16) != (anVar.f30828a & 16)) {
            return false;
        }
        if (!this.f30833f.equals(anVar.f30833f)) {
            return false;
        }
        if ((this.f30828a & 32) != (anVar.f30828a & 32)) {
            return false;
        }
        if (!this.f30834g.equals(anVar.f30834g)) {
            return false;
        }
        if ((this.f30828a & 64) != (anVar.f30828a & 64)) {
            return false;
        }
        if (!this.f30835h.equals(anVar.f30835h)) {
            return false;
        }
        if ((this.f30828a & 128) != (anVar.f30828a & 128)) {
            return false;
        }
        if (!this.f30836i.equals(anVar.f30836i)) {
            return false;
        }
        if ((this.f30828a & 256) != (anVar.f30828a & 256)) {
            return false;
        }
        if (!this.f30837j.equals(anVar.f30837j)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(anVar.aO);
        }
        if (anVar.aO == null || anVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f30829b.hashCode()) * 31) + this.f30830c.hashCode()) * 31) + this.f30831d.hashCode()) * 31) + this.f30832e.hashCode()) * 31) + this.f30833f.hashCode()) * 31) + this.f30834g.hashCode()) * 31) + this.f30835h.hashCode()) * 31) + this.f30836i.hashCode()) * 31) + this.f30837j.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30828a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f30829b);
        }
        if ((this.f30828a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f30831d);
        }
        if ((this.f30828a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f30832e);
        }
        if ((this.f30828a & 32) != 0) {
            codedOutputByteBufferNano.a(5, this.f30834g);
        }
        if ((this.f30828a & 64) != 0) {
            codedOutputByteBufferNano.a(6, this.f30835h);
        }
        if ((this.f30828a & 2) != 0) {
            codedOutputByteBufferNano.a(7, this.f30830c);
        }
        if ((this.f30828a & 256) != 0) {
            codedOutputByteBufferNano.a(8, this.f30837j);
        }
        if ((this.f30828a & 128) != 0) {
            codedOutputByteBufferNano.a(9, this.f30836i);
        }
        if ((this.f30828a & 16) != 0) {
            codedOutputByteBufferNano.a(10, this.f30833f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30828a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f30829b);
        }
        if ((this.f30828a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f30831d);
        }
        if ((this.f30828a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f30832e);
        }
        if ((this.f30828a & 32) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f30834g);
        }
        if ((this.f30828a & 64) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f30835h);
        }
        if ((this.f30828a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f30830c);
        }
        if ((this.f30828a & 256) != 0) {
            b += CodedOutputByteBufferNano.b(8, this.f30837j);
        }
        if ((this.f30828a & 128) != 0) {
            b += CodedOutputByteBufferNano.b(9, this.f30836i);
        }
        if ((this.f30828a & 16) != 0) {
            return b + CodedOutputByteBufferNano.b(10, this.f30833f);
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
                    this.f30829b = aVar.f();
                    this.f30828a |= 1;
                    continue;
                case 26:
                    this.f30831d = aVar.f();
                    this.f30828a |= 4;
                    continue;
                case 34:
                    this.f30832e = aVar.f();
                    this.f30828a |= 8;
                    continue;
                case 42:
                    this.f30834g = aVar.f();
                    this.f30828a |= 32;
                    continue;
                case 50:
                    this.f30835h = aVar.f();
                    this.f30828a |= 64;
                    continue;
                case 58:
                    this.f30830c = aVar.f();
                    this.f30828a |= 2;
                    continue;
                case 66:
                    this.f30837j = aVar.f();
                    this.f30828a |= 256;
                    continue;
                case 74:
                    this.f30836i = aVar.f();
                    this.f30828a |= 128;
                    continue;
                case 82:
                    this.f30833f = aVar.f();
                    this.f30828a |= 16;
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
