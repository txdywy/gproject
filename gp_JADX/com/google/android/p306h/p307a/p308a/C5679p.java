package com.google.android.p306h.p307a.p308a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C5679p extends C0758b {
    public static volatile C5679p[] f28801a;
    public String f28802b;
    public Boolean f28803c;
    public Boolean f28804d;
    public Boolean f28805e;
    public Integer f28806f;
    public Integer f28807g;

    public static C5679p[] m26905a() {
        if (f28801a == null) {
            synchronized (h.b) {
                if (f28801a == null) {
                    f28801a = new C5679p[0];
                }
            }
        }
        return f28801a;
    }

    public C5679p() {
        this.f28802b = null;
        this.f28803c = null;
        this.f28804d = null;
        this.f28805e = null;
        this.f28806f = null;
        this.f28807g = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f28802b != null) {
            codedOutputByteBufferNano.a(1, this.f28802b);
        }
        if (this.f28803c != null) {
            codedOutputByteBufferNano.a(2, this.f28803c.booleanValue());
        }
        if (this.f28804d != null) {
            codedOutputByteBufferNano.a(3, this.f28804d.booleanValue());
        }
        if (this.f28805e != null) {
            codedOutputByteBufferNano.a(4, this.f28805e.booleanValue());
        }
        if (this.f28806f != null) {
            codedOutputByteBufferNano.a(5, this.f28806f.intValue());
        }
        if (this.f28807g != null) {
            codedOutputByteBufferNano.a(6, this.f28807g.intValue());
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f28802b != null) {
            b += CodedOutputByteBufferNano.b(1, this.f28802b);
        }
        if (this.f28803c != null) {
            this.f28803c.booleanValue();
            b += CodedOutputByteBufferNano.d(2) + 1;
        }
        if (this.f28804d != null) {
            this.f28804d.booleanValue();
            b += CodedOutputByteBufferNano.d(3) + 1;
        }
        if (this.f28805e != null) {
            this.f28805e.booleanValue();
            b += CodedOutputByteBufferNano.d(4) + 1;
        }
        if (this.f28806f != null) {
            b += CodedOutputByteBufferNano.d(5, this.f28806f.intValue());
        }
        if (this.f28807g != null) {
            return b + CodedOutputByteBufferNano.d(6, this.f28807g.intValue());
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
                    this.f28802b = aVar.f();
                    continue;
                case 16:
                    this.f28803c = Boolean.valueOf(aVar.e());
                    continue;
                case 24:
                    this.f28804d = Boolean.valueOf(aVar.e());
                    continue;
                case 32:
                    this.f28805e = Boolean.valueOf(aVar.e());
                    continue;
                case 40:
                    this.f28806f = Integer.valueOf(aVar.i());
                    continue;
                case 48:
                    this.f28807g = Integer.valueOf(aVar.i());
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
