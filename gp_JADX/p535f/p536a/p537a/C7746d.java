package p535f.p536a.p537a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7746d extends b {
    public double f40260a;
    public double f40261b;
    public double f40262c;
    public float f40263d;
    public double f40264e;

    public C7746d() {
        this.f40260a = 0.0d;
        this.f40261b = 0.0d;
        this.f40262c = 0.0d;
        this.f40263d = 0.0f;
        this.f40264e = -1.0d;
        this.aP = -1;
    }

    public final void m37514a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (Double.doubleToLongBits(this.f40260a) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.m33516a(1, this.f40260a);
        }
        if (Double.doubleToLongBits(this.f40261b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.m33516a(2, this.f40261b);
        }
        if (Double.doubleToLongBits(this.f40262c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.m33516a(3, this.f40262c);
        }
        if (Float.floatToIntBits(this.f40263d) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.m33517a(4, this.f40263d);
        }
        if (Double.doubleToLongBits(this.f40264e) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.m33516a(5, this.f40264e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37515b() {
        int b = super.b();
        if (Double.doubleToLongBits(this.f40260a) != Double.doubleToLongBits(0.0d)) {
            b += CodedOutputByteBufferNano.m33501d(1) + 8;
        }
        if (Double.doubleToLongBits(this.f40261b) != Double.doubleToLongBits(0.0d)) {
            b += CodedOutputByteBufferNano.m33501d(2) + 8;
        }
        if (Double.doubleToLongBits(this.f40262c) != Double.doubleToLongBits(0.0d)) {
            b += CodedOutputByteBufferNano.m33501d(3) + 8;
        }
        if (Float.floatToIntBits(this.f40263d) != Float.floatToIntBits(0.0f)) {
            b += CodedOutputByteBufferNano.m33501d(4) + 4;
        }
        if (Double.doubleToLongBits(this.f40264e) != Double.doubleToLongBits(-1.0d)) {
            return b + (CodedOutputByteBufferNano.m33501d(5) + 8);
        }
        return b;
    }

    public final /* synthetic */ i m37513a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f40260a = Double.longBitsToDouble(c7213a.m33570l());
                    continue;
                case 17:
                    this.f40261b = Double.longBitsToDouble(c7213a.m33570l());
                    continue;
                case 25:
                    this.f40262c = Double.longBitsToDouble(c7213a.m33570l());
                    continue;
                case 37:
                    this.f40263d = Float.intBitsToFloat(c7213a.m33569k());
                    continue;
                case 41:
                    this.f40264e = Double.longBitsToDouble(c7213a.m33570l());
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
