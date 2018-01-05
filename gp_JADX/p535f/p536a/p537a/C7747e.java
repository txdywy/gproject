package p535f.p536a.p537a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7747e extends b {
    public static volatile C7747e[] f40265a;
    public String f40266b;
    public String f40267c;
    public long f40268d;
    public long f40269e;
    public String f40270f;

    public static C7747e[] m37516d() {
        if (f40265a == null) {
            synchronized (C7219h.f35465b) {
                if (f40265a == null) {
                    f40265a = new C7747e[0];
                }
            }
        }
        return f40265a;
    }

    public C7747e() {
        this.f40266b = "";
        this.f40267c = "";
        this.f40268d = -1;
        this.f40269e = -1;
        this.f40270f = "";
        this.aP = -1;
    }

    public final void m37518a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f40266b == null || this.f40266b.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f40266b);
        }
        if (!(this.f40267c == null || this.f40267c.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f40267c);
        }
        if (this.f40268d != -1) {
            codedOutputByteBufferNano.m33531b(3, this.f40268d);
        }
        if (this.f40269e != -1) {
            codedOutputByteBufferNano.m33531b(4, this.f40269e);
        }
        if (!(this.f40270f == null || this.f40270f.equals(""))) {
            codedOutputByteBufferNano.m33521a(5, this.f40270f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37519b() {
        int b = super.b();
        if (!(this.f40266b == null || this.f40266b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f40266b);
        }
        if (!(this.f40267c == null || this.f40267c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f40267c);
        }
        if (this.f40268d != -1) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f40268d);
        }
        if (this.f40269e != -1) {
            b += CodedOutputByteBufferNano.m33508f(4, this.f40269e);
        }
        if (this.f40270f == null || this.f40270f.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(5, this.f40270f);
    }

    public final /* synthetic */ i m37517a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f40266b = c7213a.m33564f();
                    continue;
                case 18:
                    this.f40267c = c7213a.m33564f();
                    continue;
                case 24:
                    this.f40268d = c7213a.m33568j();
                    continue;
                case 32:
                    this.f40269e = c7213a.m33568j();
                    continue;
                case 42:
                    this.f40270f = c7213a.m33564f();
                    continue;
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
