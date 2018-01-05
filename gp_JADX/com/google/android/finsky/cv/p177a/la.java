package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class la extends C0758b {
    public int f12993a;
    public int f12994b;
    public int f12995c;
    public int f12996d;
    public String f12997e;
    public String f12998f;
    public String f12999g;
    public String f13000h;
    public String f13001i;
    public String f13002j;

    public final boolean bK_() {
        return (this.f12993a & 64) != 0;
    }

    public la() {
        this.f12993a = 0;
        this.f12994b = 0;
        this.f12995c = 0;
        this.f12996d = 0;
        this.f12997e = "";
        this.f12998f = "";
        this.f12999g = "";
        this.f13000h = "";
        this.f13001i = "";
        this.f13002j = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof la)) {
            return false;
        }
        la laVar = (la) obj;
        if ((this.f12993a & 1) != (laVar.f12993a & 1)) {
            return false;
        }
        if (this.f12994b != laVar.f12994b) {
            return false;
        }
        if ((this.f12993a & 2) != (laVar.f12993a & 2)) {
            return false;
        }
        if (this.f12995c != laVar.f12995c) {
            return false;
        }
        if ((this.f12993a & 4) != (laVar.f12993a & 4)) {
            return false;
        }
        if (this.f12996d != laVar.f12996d) {
            return false;
        }
        if ((this.f12993a & 8) != (laVar.f12993a & 8)) {
            return false;
        }
        if (!this.f12997e.equals(laVar.f12997e)) {
            return false;
        }
        if ((this.f12993a & 16) != (laVar.f12993a & 16)) {
            return false;
        }
        if (!this.f12998f.equals(laVar.f12998f)) {
            return false;
        }
        if ((this.f12993a & 32) != (laVar.f12993a & 32)) {
            return false;
        }
        if (!this.f12999g.equals(laVar.f12999g)) {
            return false;
        }
        if ((this.f12993a & 64) != (laVar.f12993a & 64)) {
            return false;
        }
        if (!this.f13000h.equals(laVar.f13000h)) {
            return false;
        }
        if ((this.f12993a & 128) != (laVar.f12993a & 128)) {
            return false;
        }
        if (!this.f13001i.equals(laVar.f13001i)) {
            return false;
        }
        if ((this.f12993a & 256) != (laVar.f12993a & 256)) {
            return false;
        }
        if (!this.f13002j.equals(laVar.f13002j)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(laVar.aO);
        }
        if (laVar.aO == null || laVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f12994b) * 31) + this.f12995c) * 31) + this.f12996d) * 31) + this.f12997e.hashCode()) * 31) + this.f12998f.hashCode()) * 31) + this.f12999g.hashCode()) * 31) + this.f13000h.hashCode()) * 31) + this.f13001i.hashCode()) * 31) + this.f13002j.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f12993a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f12994b);
        }
        if ((this.f12993a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f12995c);
        }
        if ((this.f12993a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f12996d);
        }
        if ((this.f12993a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f12997e);
        }
        if ((this.f12993a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f12998f);
        }
        if ((this.f12993a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f12999g);
        }
        if ((this.f12993a & 64) != 0) {
            codedOutputByteBufferNano.a(7, this.f13000h);
        }
        if ((this.f12993a & 128) != 0) {
            codedOutputByteBufferNano.a(8, this.f13001i);
        }
        if ((this.f12993a & 256) != 0) {
            codedOutputByteBufferNano.a(9, this.f13002j);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f12993a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f12994b);
        }
        if ((this.f12993a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f12995c);
        }
        if ((this.f12993a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f12996d);
        }
        if ((this.f12993a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f12997e);
        }
        if ((this.f12993a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f12998f);
        }
        if ((this.f12993a & 32) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f12999g);
        }
        if ((this.f12993a & 64) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f13000h);
        }
        if ((this.f12993a & 128) != 0) {
            b += CodedOutputByteBufferNano.b(8, this.f13001i);
        }
        if ((this.f12993a & 256) != 0) {
            return b + CodedOutputByteBufferNano.b(9, this.f13002j);
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
                    this.f12994b = aVar.i();
                    this.f12993a |= 1;
                    continue;
                case 16:
                    this.f12995c = aVar.i();
                    this.f12993a |= 2;
                    continue;
                case 24:
                    this.f12996d = aVar.i();
                    this.f12993a |= 4;
                    continue;
                case 34:
                    this.f12997e = aVar.f();
                    this.f12993a |= 8;
                    continue;
                case 42:
                    this.f12998f = aVar.f();
                    this.f12993a |= 16;
                    continue;
                case 50:
                    this.f12999g = aVar.f();
                    this.f12993a |= 32;
                    continue;
                case 58:
                    this.f13000h = aVar.f();
                    this.f12993a |= 64;
                    continue;
                case 66:
                    this.f13001i = aVar.f();
                    this.f12993a |= 128;
                    continue;
                case 74:
                    this.f13002j = aVar.f();
                    this.f12993a |= 256;
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
