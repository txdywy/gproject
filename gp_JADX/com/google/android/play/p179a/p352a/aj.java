package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class aj extends C0758b {
    public int f30805a;
    public String f30806b;
    public String f30807c;
    public String f30808d;
    public String f30809e;
    public String f30810f;
    public String f30811g;
    public String f30812h;
    public String f30813i;

    public aj() {
        this.f30805a = 0;
        this.f30806b = "";
        this.f30807c = "";
        this.f30808d = "";
        this.f30809e = "";
        this.f30810f = "";
        this.f30811g = "";
        this.f30812h = "";
        this.f30813i = "";
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
        if ((this.f30805a & 1) != (ajVar.f30805a & 1)) {
            return false;
        }
        if (!this.f30806b.equals(ajVar.f30806b)) {
            return false;
        }
        if ((this.f30805a & 2) != (ajVar.f30805a & 2)) {
            return false;
        }
        if (!this.f30807c.equals(ajVar.f30807c)) {
            return false;
        }
        if ((this.f30805a & 4) != (ajVar.f30805a & 4)) {
            return false;
        }
        if (!this.f30808d.equals(ajVar.f30808d)) {
            return false;
        }
        if ((this.f30805a & 8) != (ajVar.f30805a & 8)) {
            return false;
        }
        if (!this.f30809e.equals(ajVar.f30809e)) {
            return false;
        }
        if ((this.f30805a & 16) != (ajVar.f30805a & 16)) {
            return false;
        }
        if (!this.f30810f.equals(ajVar.f30810f)) {
            return false;
        }
        if ((this.f30805a & 32) != (ajVar.f30805a & 32)) {
            return false;
        }
        if (!this.f30811g.equals(ajVar.f30811g)) {
            return false;
        }
        if ((this.f30805a & 64) != (ajVar.f30805a & 64)) {
            return false;
        }
        if (!this.f30812h.equals(ajVar.f30812h)) {
            return false;
        }
        if ((this.f30805a & 128) != (ajVar.f30805a & 128)) {
            return false;
        }
        if (!this.f30813i.equals(ajVar.f30813i)) {
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
        int hashCode = (((((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f30806b.hashCode()) * 31) + this.f30807c.hashCode()) * 31) + this.f30808d.hashCode()) * 31) + this.f30809e.hashCode()) * 31) + this.f30810f.hashCode()) * 31) + this.f30811g.hashCode()) * 31) + this.f30812h.hashCode()) * 31) + this.f30813i.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30805a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f30806b);
        }
        if ((this.f30805a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f30807c);
        }
        if ((this.f30805a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f30808d);
        }
        if ((this.f30805a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f30809e);
        }
        if ((this.f30805a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f30810f);
        }
        if ((this.f30805a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f30811g);
        }
        if ((this.f30805a & 64) != 0) {
            codedOutputByteBufferNano.a(7, this.f30812h);
        }
        if ((this.f30805a & 128) != 0) {
            codedOutputByteBufferNano.a(8, this.f30813i);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30805a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f30806b);
        }
        if ((this.f30805a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f30807c);
        }
        if ((this.f30805a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f30808d);
        }
        if ((this.f30805a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f30809e);
        }
        if ((this.f30805a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f30810f);
        }
        if ((this.f30805a & 32) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f30811g);
        }
        if ((this.f30805a & 64) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f30812h);
        }
        if ((this.f30805a & 128) != 0) {
            return b + CodedOutputByteBufferNano.b(8, this.f30813i);
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
                    this.f30806b = aVar.f();
                    this.f30805a |= 1;
                    continue;
                case 18:
                    this.f30807c = aVar.f();
                    this.f30805a |= 2;
                    continue;
                case 26:
                    this.f30808d = aVar.f();
                    this.f30805a |= 4;
                    continue;
                case 34:
                    this.f30809e = aVar.f();
                    this.f30805a |= 8;
                    continue;
                case 42:
                    this.f30810f = aVar.f();
                    this.f30805a |= 16;
                    continue;
                case 50:
                    this.f30811g = aVar.f();
                    this.f30805a |= 32;
                    continue;
                case 58:
                    this.f30812h = aVar.f();
                    this.f30805a |= 64;
                    continue;
                case 66:
                    this.f30813i = aVar.f();
                    this.f30805a |= 128;
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
