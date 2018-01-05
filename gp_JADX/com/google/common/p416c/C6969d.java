package com.google.common.p416c;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;

final class C6969d implements C6966a {
    public final DataOutput f34360a;
    public final ByteArrayOutputStream f34361b;

    C6969d(ByteArrayOutputStream byteArrayOutputStream) {
        this.f34361b = byteArrayOutputStream;
        this.f34360a = new DataOutputStream(byteArrayOutputStream);
    }

    public final void write(int i) {
        try {
            this.f34360a.write(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void write(byte[] bArr) {
        try {
            this.f34360a.write(bArr);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.f34360a.write(bArr, i, i2);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeBoolean(boolean z) {
        try {
            this.f34360a.writeBoolean(z);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeByte(int i) {
        try {
            this.f34360a.writeByte(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeBytes(String str) {
        try {
            this.f34360a.writeBytes(str);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeChar(int i) {
        try {
            this.f34360a.writeChar(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeChars(String str) {
        try {
            this.f34360a.writeChars(str);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeDouble(double d) {
        try {
            this.f34360a.writeDouble(d);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeFloat(float f) {
        try {
            this.f34360a.writeFloat(f);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeInt(int i) {
        try {
            this.f34360a.writeInt(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeLong(long j) {
        try {
            this.f34360a.writeLong(j);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeShort(int i) {
        try {
            this.f34360a.writeShort(i);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeUTF(String str) {
        try {
            this.f34360a.writeUTF(str);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] mo5923a() {
        return this.f34361b.toByteArray();
    }
}
