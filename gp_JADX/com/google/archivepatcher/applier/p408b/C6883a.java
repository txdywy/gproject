package com.google.archivepatcher.applier.p408b;

import android.support.v7.widget.eq;
import com.google.archivepatcher.applier.PatchFormatException;
import com.squareup.haha.perflib.HprofParser;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

public final class C6883a {
    public static long m31256a(RandomAccessFile randomAccessFile, InputStream inputStream, OutputStream outputStream, long j) {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, eq.FLAG_APPEARED_IN_PRE_LAYOUT));
        if (dataInputStream.readInt() != -771763713) {
            String str = "Unexpected magic=";
            String valueOf = String.valueOf(String.format("%x", new Object[]{Integer.valueOf(dataInputStream.readInt())}));
            throw new PatchFormatException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        int read = dataInputStream.read();
        if (read != 4) {
            throw new PatchFormatException("Unexpected version=" + read);
        }
        long j2 = 0;
        while (true) {
            int i;
            long j3 = j - j2;
            int read2 = dataInputStream.read();
            long readUnsignedShort;
            switch (read2) {
                case -1:
                    throw new IOException("Patch file overrun");
                case 0:
                    outputStream.flush();
                    return j2;
                case 247:
                    try {
                        read2 = dataInputStream.readUnsignedShort();
                        C6883a.m31257a(bArr, dataInputStream, outputStream, read2, j3);
                        i = read2;
                        break;
                    } catch (Throwable th) {
                        outputStream.flush();
                    }
                case 248:
                    read2 = dataInputStream.readInt();
                    C6883a.m31257a(bArr, dataInputStream, outputStream, read2, j3);
                    i = read2;
                    break;
                case 249:
                    readUnsignedShort = (long) dataInputStream.readUnsignedShort();
                    i = dataInputStream.read();
                    if (i != -1) {
                        C6883a.m31258a(bArr, randomAccessFile, outputStream, readUnsignedShort, i, j3);
                        break;
                    }
                    throw new IOException("Unexpected end of patch");
                case 250:
                    readUnsignedShort = (long) dataInputStream.readUnsignedShort();
                    i = dataInputStream.readUnsignedShort();
                    C6883a.m31258a(bArr, randomAccessFile, outputStream, readUnsignedShort, i, j3);
                    break;
                case 251:
                    readUnsignedShort = (long) dataInputStream.readUnsignedShort();
                    i = dataInputStream.readInt();
                    C6883a.m31258a(bArr, randomAccessFile, outputStream, readUnsignedShort, i, j3);
                    break;
                case 252:
                    readUnsignedShort = (long) dataInputStream.readInt();
                    i = dataInputStream.read();
                    if (i != -1) {
                        C6883a.m31258a(bArr, randomAccessFile, outputStream, readUnsignedShort, i, j3);
                        break;
                    }
                    throw new IOException("Unexpected end of patch");
                case 253:
                    readUnsignedShort = (long) dataInputStream.readInt();
                    i = dataInputStream.readUnsignedShort();
                    C6883a.m31258a(bArr, randomAccessFile, outputStream, readUnsignedShort, i, j3);
                    break;
                case HprofParser.ROOT_HEAP_DUMP_INFO /*254*/:
                    readUnsignedShort = (long) dataInputStream.readInt();
                    i = dataInputStream.readInt();
                    C6883a.m31258a(bArr, randomAccessFile, outputStream, readUnsignedShort, i, j3);
                    break;
                case HprofParser.ROOT_UNKNOWN /*255*/:
                    readUnsignedShort = dataInputStream.readLong();
                    i = dataInputStream.readInt();
                    C6883a.m31258a(bArr, randomAccessFile, outputStream, readUnsignedShort, i, j3);
                    break;
                default:
                    C6883a.m31257a(bArr, dataInputStream, outputStream, read2, j3);
                    i = read2;
                    break;
            }
            j2 = ((long) i) + j2;
        }
    }

    private static void m31257a(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i, long j) {
        if (i < 0) {
            throw new IOException("copyLength negative");
        } else if (((long) i) > j) {
            throw new IOException("Output length overrun");
        } else {
            int i2 = i;
            while (i2 > 0) {
                int i3;
                if (i2 < 16384) {
                    i3 = i2;
                } else {
                    i3 = 16384;
                }
                try {
                    dataInputStream.readFully(bArr, 0, i3);
                    outputStream.write(bArr, 0, i3);
                    i2 -= i3;
                } catch (EOFException e) {
                    throw new IOException("patch underrun");
                }
            }
        }
    }

    private static void m31258a(byte[] bArr, RandomAccessFile randomAccessFile, OutputStream outputStream, long j, int i, long j2) {
        if (i < 0) {
            throw new IOException("copyLength negative");
        } else if (j < 0) {
            throw new IOException("inputOffset negative");
        } else if (((long) i) > j2) {
            throw new IOException("Output length overrun");
        } else {
            try {
                randomAccessFile.seek(j);
                int i2 = i;
                while (i2 > 0) {
                    int i3;
                    if (i2 < 16384) {
                        i3 = i2;
                    } else {
                        i3 = 16384;
                    }
                    randomAccessFile.readFully(bArr, 0, i3);
                    outputStream.write(bArr, 0, i3);
                    i2 -= i3;
                }
            } catch (Throwable e) {
                throw new IOException("patch underrun", e);
            }
        }
    }
}
