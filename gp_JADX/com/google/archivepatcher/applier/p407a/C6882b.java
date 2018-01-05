package com.google.archivepatcher.applier.p407a;

import android.support.v7.widget.eq;
import com.google.archivepatcher.applier.PatchFormatException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.logging.Logger;

public class C6882b {
    public static void m31253a(RandomAccessFile randomAccessFile, OutputStream outputStream, InputStream inputStream) {
        C6882b.m31254a(randomAccessFile, outputStream, inputStream, null);
    }

    public static void m31254a(RandomAccessFile randomAccessFile, OutputStream outputStream, InputStream inputStream, Long l) {
        InputStream bufferedInputStream = new BufferedInputStream(inputStream, eq.FLAG_APPEARED_IN_PRE_LAYOUT);
        OutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 16384);
        try {
            C6882b.m31255b(randomAccessFile, bufferedOutputStream, bufferedInputStream, l);
        } finally {
            bufferedOutputStream.flush();
        }
    }

    private static void m31255b(RandomAccessFile randomAccessFile, OutputStream outputStream, InputStream inputStream, Long l) {
        byte[] bArr = new byte[16];
        try {
            C6882b.m31252a(inputStream, bArr, 16);
            if ("ENDSLEY/BSDIFF43".equals(new String(bArr, 0, 16, "US-ASCII"))) {
                long length = randomAccessFile.length();
                if (length > 2147483647L) {
                    throw new PatchFormatException("bad oldSize");
                }
                long a = C6882b.m31249a(inputStream);
                if (a < 0 || a > 2147483647L) {
                    throw new PatchFormatException("bad newSize");
                } else if (l == null || l.longValue() == a) {
                    byte[] bArr2 = new byte[51200];
                    byte[] bArr3 = new byte[51200];
                    long j = 0;
                    long j2 = 0;
                    while (j2 < a) {
                        long a2 = C6882b.m31249a(inputStream);
                        long a3 = C6882b.m31249a(inputStream);
                        long a4 = C6882b.m31249a(inputStream);
                        if (a2 < 0 || a2 > 2147483647L) {
                            throw new PatchFormatException("bad diffSegmentLength");
                        } else if (a3 < 0 || a3 > 2147483647L) {
                            throw new PatchFormatException("bad copySegmentLength");
                        } else if (a4 < -2147483648L || a4 > 2147483647L) {
                            throw new PatchFormatException("bad offsetToNextInput");
                        } else {
                            long j3 = (j2 + a2) + a3;
                            if (j3 > a) {
                                throw new PatchFormatException("expectedFinalNewDataBytesWritten too large");
                            }
                            a4 += j + a2;
                            if (a4 > length) {
                                throw new PatchFormatException("expectedFinalOldDataOffset too large");
                            } else if (a4 < 0) {
                                throw new PatchFormatException("expectedFinalOldDataOffset is negative");
                            } else {
                                randomAccessFile.seek(j);
                                if (a2 > 0) {
                                    C6882b.m31250a((int) a2, inputStream, randomAccessFile, outputStream, bArr2, bArr3);
                                }
                                if (a3 > 0) {
                                    C6882b.m31251a(inputStream, outputStream, bArr2, (int) a3);
                                }
                                j2 = j3;
                                j = a4;
                            }
                        }
                    }
                    return;
                } else {
                    throw new PatchFormatException("expectedNewSize != newSize");
                }
            }
            throw new PatchFormatException("bad signature");
        } catch (IOException e) {
            throw new PatchFormatException("truncated signature");
        }
    }

    private static void m31250a(int i, InputStream inputStream, RandomAccessFile randomAccessFile, OutputStream outputStream, byte[] bArr, byte[] bArr2) {
        while (i > 0) {
            int min = Math.min(i, bArr.length);
            randomAccessFile.readFully(bArr, 0, min);
            C6882b.m31252a(inputStream, bArr2, min);
            for (int i2 = 0; i2 < min; i2++) {
                bArr[i2] = (byte) (bArr[i2] + bArr2[i2]);
            }
            outputStream.write(bArr, 0, min);
            i -= min;
        }
    }

    private static long m31249a(InputStream inputStream) {
        int i = 0;
        long j = 0;
        while (i < 64) {
            long read = (((long) inputStream.read()) << i) | j;
            i += 8;
            j = read;
        }
        if (j == Long.MIN_VALUE) {
            throw new PatchFormatException("read negative zero");
        } else if ((j & Long.MIN_VALUE) != 0) {
            return -(j & Long.MAX_VALUE);
        } else {
            return j;
        }
    }

    private static void m31252a(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2 + 0, i - i2);
            if (read == -1) {
                throw new IOException("truncated input stream");
            }
            i2 += read;
        }
    }

    private static void m31251a(InputStream inputStream, OutputStream outputStream, byte[] bArr, int i) {
        while (i > 0) {
            int min = Math.min(bArr.length, i);
            C6882b.m31252a(inputStream, bArr, min);
            outputStream.write(bArr, 0, min);
            i -= min;
        }
    }

    static {
        Logger.getLogger(C6882b.class.getName());
    }
}
