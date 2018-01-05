package com.google.common.p416c;

import com.google.common.p414a.C6937m;
import com.google.common.p419e.C6975a;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class C6972g extends FilterInputStream implements DataInput {
    public C6972g(InputStream inputStream) {
        super((InputStream) C6937m.m31623a((Object) inputStream));
    }

    public final String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    public final void readFully(byte[] bArr) {
        C6967b.m31817a((InputStream) this, bArr);
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        C6967b.m31818a(this, bArr, i, i2);
    }

    public final int skipBytes(int i) {
        return (int) this.in.skip((long) i);
    }

    public final int readUnsignedByte() {
        int read = this.in.read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    public final int readUnsignedShort() {
        return C6975a.m31829a((byte) 0, (byte) 0, m31822a(), m31822a());
    }

    public final int readInt() {
        byte a = m31822a();
        byte a2 = m31822a();
        return C6975a.m31829a(m31822a(), m31822a(), a2, a);
    }

    public final long readLong() {
        byte a = m31822a();
        byte a2 = m31822a();
        byte a3 = m31822a();
        byte a4 = m31822a();
        byte a5 = m31822a();
        return (((long) a) & 255) | ((((((long) a3) & 255) << 16) | ((((((long) a5) & 255) << 32) | ((((((long) m31822a()) & 255) << 48) | ((((long) m31822a()) & 255) << 56)) | ((((long) m31822a()) & 255) << 40))) | ((((long) a4) & 255) << 24))) | ((((long) a2) & 255) << 8));
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final String readUTF() {
        return new DataInputStream(this.in).readUTF();
    }

    public final short readShort() {
        return (short) readUnsignedShort();
    }

    public final char readChar() {
        return (char) readUnsignedShort();
    }

    public final byte readByte() {
        return (byte) readUnsignedByte();
    }

    public final boolean readBoolean() {
        return readUnsignedByte() != 0;
    }

    private final byte m31822a() {
        int read = this.in.read();
        if (-1 != read) {
            return (byte) read;
        }
        throw new EOFException();
    }
}
