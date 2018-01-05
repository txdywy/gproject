package com.google.protobuf.nano;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class com.google.protobuf.nano.i
{

    public volatile int aP;

    i() {
        this.aP = -1;
    }

    public static final com.google.protobuf.nano.i a(com.google.protobuf.nano.i p0, byte[] p1) {
        return com.google.protobuf.nano.i.a(p0, p1, 0, p1.length);
    }

    public static final com.google.protobuf.nano.i a(com.google.protobuf.nano.i p0, byte[] p1, int p2, int p3) {
        try {
            v0 = com.google.protobuf.nano.a.a(p1, p2, p3);
            p0.a(v0);
            v0.a(0);
        }
        catch (InvalidProtocolBufferNanoException ex) {
            throw ex;
        }
        catch (IOException ex) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", ex);
        }
        return p0;
    }

    private static void a(com.google.protobuf.nano.i p0, byte[] p1, int p2) {
        try {
            v0 = CodedOutputByteBufferNano.a(p1, p2);
            p0.a(v0);
            if (v0.a.remaining() == 0)
                return;
            v3 = new Object[1];
            v3[0] = Integer.valueOf(v0.a.remaining());
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", v3));
        }
        catch (IOException ex) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", ex);
        }
    }

    public static final boolean a(com.google.protobuf.nano.i p0, com.google.protobuf.nano.i p1) {
        v0 = 0;
        if (p0 == p1)
            v0 = 1;
        else if (p0 != 0 && p1 != 0 && p0.getClass() == p1.getClass()) {
            v1 = p0.n();
            if (p1.n() == v1) {
                v0 = new byte[v1];
                v2 = new byte[v1];
                com.google.protobuf.nano.i.a(p0, v0, v1);
                com.google.protobuf.nano.i.a(p1, v2, v1);
                v0 = Arrays.equals(v0, v2);
            }
        }
        return v0;
    }

    public static final byte[] a(com.google.protobuf.nano.i p0) {
        v0 = new byte[p0.n()];
        com.google.protobuf.nano.i.a(p0, v0, v0.length);
        return v0;
    }

    public static final com.google.protobuf.nano.i b(com.google.protobuf.nano.i p0) {
        try {
            return com.google.protobuf.nano.i.a((com.google.protobuf.nano.i)p0.getClass().getConstructor(new Class[0]).newInstance(new Object[0]), com.google.protobuf.nano.i.a(p0));
        }
        catch (NoSuchMethodException ex) {
            throw new IllegalStateException(ex);
        }
        catch (InstantiationException ex) {
            throw new IllegalStateException(ex);
        }
        catch (InvocationTargetException ex) {
            throw new IllegalStateException(ex);
        }
        catch (IllegalAccessException ex) {
            throw new IllegalStateException(ex);
        }
        catch (InvalidProtocolBufferNanoException ex) {
            throw new IllegalStateException(ex);
        }
    }

    public abstract com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0);

    public void a(CodedOutputByteBufferNano p0) {
    }

    public int b() {
        return 0;
    }

    public com.google.protobuf.nano.i cJ_() {
        return (com.google.protobuf.nano.i)super.clone();
    }

    public Object clone() {
        return this.cJ_();
    }

    public final int m() {
        if (this.aP < 0)
            this.n();
        return this.aP;
    }

    public final int n() {
        v0 = this.b();
        this.aP = v0;
        return v0;
    }

    public String toString() {
        return com.google.protobuf.nano.j.a(this);
    }

}
