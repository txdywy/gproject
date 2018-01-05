package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ah extends C0758b {
    public int f30792a;
    public String f30793b;
    public String f30794c;
    public String f30795d;
    public String f30796e;
    public String f30797f;
    public String f30798g;
    public String f30799h;

    public ah() {
        this.f30792a = 0;
        this.f30793b = "";
        this.f30794c = "";
        this.f30795d = "";
        this.f30796e = "";
        this.f30797f = "";
        this.f30798g = "";
        this.f30799h = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        if ((this.f30792a & 1) != (ahVar.f30792a & 1)) {
            return false;
        }
        if (!this.f30793b.equals(ahVar.f30793b)) {
            return false;
        }
        if ((this.f30792a & 2) != (ahVar.f30792a & 2)) {
            return false;
        }
        if (!this.f30794c.equals(ahVar.f30794c)) {
            return false;
        }
        if ((this.f30792a & 4) != (ahVar.f30792a & 4)) {
            return false;
        }
        if (!this.f30795d.equals(ahVar.f30795d)) {
            return false;
        }
        if ((this.f30792a & 8) != (ahVar.f30792a & 8)) {
            return false;
        }
        if (!this.f30796e.equals(ahVar.f30796e)) {
            return false;
        }
        if ((this.f30792a & 16) != (ahVar.f30792a & 16)) {
            return false;
        }
        if (!this.f30797f.equals(ahVar.f30797f)) {
            return false;
        }
        if ((this.f30792a & 32) != (ahVar.f30792a & 32)) {
            return false;
        }
        if (!this.f30798g.equals(ahVar.f30798g)) {
            return false;
        }
        if ((this.f30792a & 64) != (ahVar.f30792a & 64)) {
            return false;
        }
        if (!this.f30799h.equals(ahVar.f30799h)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(ahVar.aO);
        }
        if (ahVar.aO == null || ahVar.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f30793b.hashCode()) * 31) + this.f30794c.hashCode()) * 31) + this.f30795d.hashCode()) * 31) + this.f30796e.hashCode()) * 31) + this.f30797f.hashCode()) * 31) + this.f30798g.hashCode()) * 31) + this.f30799h.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30792a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f30793b);
        }
        if ((this.f30792a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f30794c);
        }
        if ((this.f30792a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f30795d);
        }
        if ((this.f30792a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f30796e);
        }
        if ((this.f30792a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f30797f);
        }
        if ((this.f30792a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f30798g);
        }
        if ((this.f30792a & 64) != 0) {
            codedOutputByteBufferNano.a(7, this.f30799h);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30792a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f30793b);
        }
        if ((this.f30792a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f30794c);
        }
        if ((this.f30792a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f30795d);
        }
        if ((this.f30792a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f30796e);
        }
        if ((this.f30792a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f30797f);
        }
        if ((this.f30792a & 32) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f30798g);
        }
        if ((this.f30792a & 64) != 0) {
            return b + CodedOutputByteBufferNano.b(7, this.f30799h);
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
                    this.f30793b = aVar.f();
                    this.f30792a |= 1;
                    continue;
                case 18:
                    this.f30794c = aVar.f();
                    this.f30792a |= 2;
                    continue;
                case 26:
                    this.f30795d = aVar.f();
                    this.f30792a |= 4;
                    continue;
                case 34:
                    this.f30796e = aVar.f();
                    this.f30792a |= 8;
                    continue;
                case 42:
                    this.f30797f = aVar.f();
                    this.f30792a |= 16;
                    continue;
                case 50:
                    this.f30798g = aVar.f();
                    this.f30792a |= 32;
                    continue;
                case 58:
                    this.f30799h = aVar.f();
                    this.f30792a |= 64;
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
