package com.google.android.libraries.performance.primes.p333b;

import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.p333b.p334a.C5955a;
import com.squareup.haha.perflib.HprofParser;
import java.io.File;
import java.io.FileInputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.Charset;

public final class C5970j {
    public final ByteBuffer f29752a;
    public final int f29753b;
    public final int[] f29754c;
    public final C5955a f29755d;
    public final ByteBuffer f29756e;

    private C5970j(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        this.f29752a = byteBuffer;
        this.f29756e = byteBuffer.duplicate();
        do {
        } while (byteBuffer.get() != (byte) 0);
        this.f29753b = byteBuffer.getInt();
        C5916a.m27410b(this.f29753b > 0);
        byteBuffer.getLong();
        this.f29754c = new int[12];
        this.f29754c[2] = this.f29753b;
        this.f29754c[4] = 1;
        this.f29754c[5] = 2;
        this.f29754c[6] = 4;
        this.f29754c[7] = 8;
        this.f29754c[8] = 1;
        this.f29754c[9] = 2;
        this.f29754c[10] = 4;
        this.f29754c[11] = 8;
        this.f29755d = new C5955a();
        this.f29755d.m27657a(HprofParser.ROOT_INTERNED_STRING, this.f29753b);
        this.f29755d.m27657a(HprofParser.ROOT_UNKNOWN, this.f29753b);
        this.f29755d.m27657a(HprofParser.ROOT_DEBUGGER, this.f29753b);
        this.f29755d.m27657a(HprofParser.ROOT_UNREACHABLE, this.f29753b);
        this.f29755d.m27657a(HprofParser.ROOT_FINALIZING, this.f29753b);
        this.f29755d.m27657a(5, this.f29753b);
        this.f29755d.m27657a(7, this.f29753b);
        this.f29755d.m27657a(HprofParser.ROOT_REFERENCE_CLEANUP, this.f29753b);
        this.f29755d.m27657a(HprofParser.ROOT_VM_INTERNAL, this.f29753b);
        this.f29755d.m27657a(1, this.f29753b + this.f29753b);
        this.f29755d.m27657a(3, this.f29753b + 8);
        this.f29755d.m27657a(2, this.f29753b + 8);
        this.f29755d.m27657a(8, this.f29753b + 8);
        this.f29755d.m27657a(HprofParser.ROOT_JNI_MONITOR, this.f29753b + 8);
        this.f29755d.m27657a(4, this.f29753b + 4);
        this.f29755d.m27657a(6, this.f29753b + 4);
    }

    public static C5970j m27704a(File file) {
        FileInputStream fileInputStream;
        Throwable th;
        FileChannel fileChannel = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream2.getChannel();
                try {
                    C5970j c5970j = new C5970j(channel.map(MapMode.READ_ONLY, 0, channel.size()));
                    if (channel != null) {
                        channel.close();
                    }
                    fileInputStream2.close();
                    return c5970j;
                } catch (Throwable th2) {
                    fileInputStream = fileInputStream2;
                    FileChannel fileChannel2 = channel;
                    th = th2;
                    fileChannel = fileChannel2;
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            if (fileChannel != null) {
                fileChannel.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public final String m27707a(int i) {
        C5916a.m27408a(i >= 0);
        byte[] bArr = new byte[(this.f29756e.getInt(i) - this.f29753b)];
        this.f29756e.position((i + 4) + this.f29753b);
        this.f29756e.get(bArr);
        return new String(bArr, Charset.defaultCharset());
    }

    public final int m27708b(int i) {
        int i2 = this.f29754c[i];
        C5916a.m27410b(i2 > 0);
        return i2;
    }

    public final void m27709c(int i) {
        C5916a.m27408a(i >= 0);
        int position = this.f29752a.position() + i;
        if (position > this.f29752a.limit()) {
            throw new BufferUnderflowException();
        }
        this.f29752a.position(position);
    }

    public final int m27706a() {
        switch (this.f29753b) {
            case 1:
                return this.f29752a.get();
            case 2:
                return this.f29752a.getShort();
            case 4:
                return this.f29752a.getInt();
            default:
                throw new IllegalStateException();
        }
    }

    public final int m27710d(int i) {
        switch (this.f29753b) {
            case 1:
                return this.f29752a.get(i);
            case 2:
                return this.f29752a.getShort(i);
            case 4:
                return this.f29752a.getInt(i);
            default:
                throw new IllegalStateException();
        }
    }

    public static boolean m27705e(int i) {
        return i == 2;
    }
}
