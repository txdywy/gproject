package com.google.android.play.p179a.p352a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C6203n extends C0758b {
    public int f30971a;
    public String f30972b;
    public String f30973c;
    public String f30974d;
    public String f30975e;
    public String f30976f;
    public String f30977g;
    public String f30978h;
    public String f30979i;
    public String f30980j;
    public int f30981k;
    public int f30982l;
    public String f30983m;

    public C6203n() {
        this.f30971a = 0;
        this.f30972b = "";
        this.f30973c = "";
        this.f30974d = "";
        this.f30975e = "";
        this.f30976f = "";
        this.f30977g = "";
        this.f30978h = "";
        this.f30979i = "";
        this.f30980j = "";
        this.f30981k = 0;
        this.f30982l = 0;
        this.f30983m = "";
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6203n)) {
            return false;
        }
        C6203n c6203n = (C6203n) obj;
        if ((this.f30971a & 1) != (c6203n.f30971a & 1)) {
            return false;
        }
        if (!this.f30972b.equals(c6203n.f30972b)) {
            return false;
        }
        if ((this.f30971a & 2) != (c6203n.f30971a & 2)) {
            return false;
        }
        if (!this.f30973c.equals(c6203n.f30973c)) {
            return false;
        }
        if ((this.f30971a & 4) != (c6203n.f30971a & 4)) {
            return false;
        }
        if (!this.f30974d.equals(c6203n.f30974d)) {
            return false;
        }
        if ((this.f30971a & 8) != (c6203n.f30971a & 8)) {
            return false;
        }
        if (!this.f30975e.equals(c6203n.f30975e)) {
            return false;
        }
        if ((this.f30971a & 16) != (c6203n.f30971a & 16)) {
            return false;
        }
        if (!this.f30976f.equals(c6203n.f30976f)) {
            return false;
        }
        if ((this.f30971a & 32) != (c6203n.f30971a & 32)) {
            return false;
        }
        if (!this.f30977g.equals(c6203n.f30977g)) {
            return false;
        }
        if ((this.f30971a & 64) != (c6203n.f30971a & 64)) {
            return false;
        }
        if (!this.f30978h.equals(c6203n.f30978h)) {
            return false;
        }
        if ((this.f30971a & 128) != (c6203n.f30971a & 128)) {
            return false;
        }
        if (!this.f30979i.equals(c6203n.f30979i)) {
            return false;
        }
        if ((this.f30971a & 256) != (c6203n.f30971a & 256)) {
            return false;
        }
        if (!this.f30980j.equals(c6203n.f30980j)) {
            return false;
        }
        if ((this.f30971a & 512) != (c6203n.f30971a & 512)) {
            return false;
        }
        if (this.f30981k != c6203n.f30981k) {
            return false;
        }
        if ((this.f30971a & MemoryMappedFileBuffer.DEFAULT_PADDING) != (c6203n.f30971a & MemoryMappedFileBuffer.DEFAULT_PADDING)) {
            return false;
        }
        if (this.f30982l != c6203n.f30982l) {
            return false;
        }
        if ((this.f30971a & eq.FLAG_MOVED) != (c6203n.f30971a & eq.FLAG_MOVED)) {
            return false;
        }
        if (!this.f30983m.equals(c6203n.f30983m)) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6203n.aO);
        }
        if (c6203n.aO == null || c6203n.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f30972b.hashCode()) * 31) + this.f30973c.hashCode()) * 31) + this.f30974d.hashCode()) * 31) + this.f30975e.hashCode()) * 31) + this.f30976f.hashCode()) * 31) + this.f30977g.hashCode()) * 31) + this.f30978h.hashCode()) * 31) + this.f30979i.hashCode()) * 31) + this.f30980j.hashCode()) * 31) + this.f30981k) * 31) + this.f30982l) * 31) + this.f30983m.hashCode()) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f30971a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f30972b);
        }
        if ((this.f30971a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f30973c);
        }
        if ((this.f30971a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f30974d);
        }
        if ((this.f30971a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f30975e);
        }
        if ((this.f30971a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f30976f);
        }
        if ((this.f30971a & 64) != 0) {
            codedOutputByteBufferNano.a(6, this.f30978h);
        }
        if ((this.f30971a & 128) != 0) {
            codedOutputByteBufferNano.a(7, this.f30979i);
        }
        if ((this.f30971a & 256) != 0) {
            codedOutputByteBufferNano.a(8, this.f30980j);
        }
        if ((this.f30971a & 512) != 0) {
            codedOutputByteBufferNano.a(9, this.f30981k);
        }
        if ((this.f30971a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.a(10, this.f30982l);
        }
        if ((this.f30971a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.a(11, this.f30983m);
        }
        if ((this.f30971a & 32) != 0) {
            codedOutputByteBufferNano.a(12, this.f30977g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f30971a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f30972b);
        }
        if ((this.f30971a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f30973c);
        }
        if ((this.f30971a & 4) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f30974d);
        }
        if ((this.f30971a & 8) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f30975e);
        }
        if ((this.f30971a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f30976f);
        }
        if ((this.f30971a & 64) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f30978h);
        }
        if ((this.f30971a & 128) != 0) {
            b += CodedOutputByteBufferNano.b(7, this.f30979i);
        }
        if ((this.f30971a & 256) != 0) {
            b += CodedOutputByteBufferNano.b(8, this.f30980j);
        }
        if ((this.f30971a & 512) != 0) {
            b += CodedOutputByteBufferNano.d(9, this.f30981k);
        }
        if ((this.f30971a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.d(10, this.f30982l);
        }
        if ((this.f30971a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.b(11, this.f30983m);
        }
        if ((this.f30971a & 32) != 0) {
            return b + CodedOutputByteBufferNano.b(12, this.f30977g);
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
                    this.f30972b = aVar.f();
                    this.f30971a |= 1;
                    continue;
                case 18:
                    this.f30973c = aVar.f();
                    this.f30971a |= 2;
                    continue;
                case 26:
                    this.f30974d = aVar.f();
                    this.f30971a |= 4;
                    continue;
                case 34:
                    this.f30975e = aVar.f();
                    this.f30971a |= 8;
                    continue;
                case 42:
                    this.f30976f = aVar.f();
                    this.f30971a |= 16;
                    continue;
                case 50:
                    this.f30978h = aVar.f();
                    this.f30971a |= 64;
                    continue;
                case 58:
                    this.f30979i = aVar.f();
                    this.f30971a |= 128;
                    continue;
                case 66:
                    this.f30980j = aVar.f();
                    this.f30971a |= 256;
                    continue;
                case 72:
                    this.f30981k = aVar.i();
                    this.f30971a |= 512;
                    continue;
                case 80:
                    this.f30982l = aVar.i();
                    this.f30971a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 90:
                    this.f30983m = aVar.f();
                    this.f30971a |= eq.FLAG_MOVED;
                    continue;
                case 98:
                    this.f30977g = aVar.f();
                    this.f30971a |= 32;
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
