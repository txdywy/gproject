package com.google.common.p416c;

import com.google.common.p414a.C6937m;
import com.squareup.haha.perflib.HprofParser;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;

public final class C6973h extends FilterOutputStream implements DataOutput {
    public C6973h(OutputStream outputStream) {
        super(new DataOutputStream((OutputStream) C6937m.m31623a((Object) outputStream)));
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
    }

    public final void writeBoolean(boolean z) {
        ((DataOutputStream) this.out).writeBoolean(z);
    }

    public final void writeByte(int i) {
        ((DataOutputStream) this.out).writeByte(i);
    }

    @Deprecated
    public final void writeBytes(String str) {
        ((DataOutputStream) this.out).writeBytes(str);
    }

    public final void writeChar(int i) {
        writeShort(i);
    }

    public final void writeChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            writeChar(str.charAt(i));
        }
    }

    public final void writeDouble(double d) {
        writeLong(Double.doubleToLongBits(d));
    }

    public final void writeFloat(float f) {
        writeInt(Float.floatToIntBits(f));
    }

    public final void writeInt(int i) {
        this.out.write(i & HprofParser.ROOT_UNKNOWN);
        this.out.write((i >> 8) & HprofParser.ROOT_UNKNOWN);
        this.out.write((i >> 16) & HprofParser.ROOT_UNKNOWN);
        this.out.write((i >> 24) & HprofParser.ROOT_UNKNOWN);
    }

    public final void writeLong(long j) {
        long reverseBytes = Long.reverseBytes(j);
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) ((int) (255 & reverseBytes));
            reverseBytes >>= 8;
        }
        write(bArr, 0, 8);
    }

    public final void writeShort(int i) {
        this.out.write(i & HprofParser.ROOT_UNKNOWN);
        this.out.write((i >> 8) & HprofParser.ROOT_UNKNOWN);
    }

    public final void writeUTF(String str) {
        ((DataOutputStream) this.out).writeUTF(str);
    }

    public final void close() {
        this.out.close();
    }
}
