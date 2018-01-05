package com.google.android.p103d;

import android.support.v7.widget.eq;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

public final class C0939d implements Closeable {
    public RandomAccessFile f5742a;
    public final LinkedHashMap f5743b = new LinkedHashMap();
    public final List f5744c = new ArrayList();

    public C0939d(File file) {
        this.f5742a = new RandomAccessFile(file.getPath(), "r");
        m5679a();
    }

    public final void close() {
        RandomAccessFile randomAccessFile = this.f5742a;
        if (randomAccessFile != null) {
            synchronized (randomAccessFile) {
                this.f5742a = null;
                randomAccessFile.close();
            }
        }
    }

    public final InputStream m5681a(C0938c c0938c, boolean z) {
        String str = c0938c.f5735a;
        if (this.f5742a == null) {
            throw new IllegalStateException("Zip file closed");
        } else if (str == null) {
            throw new NullPointerException("entryName == null");
        } else {
            C0938c c0938c2;
            C0938c c0938c3 = (C0938c) this.f5743b.get(str);
            if (c0938c3 == null) {
                c0938c2 = (C0938c) this.f5743b.get(String.valueOf(str).concat("/"));
            } else {
                c0938c2 = c0938c3;
            }
            if (c0938c2 == null) {
                return null;
            }
            RandomAccessFile randomAccessFile = this.f5742a;
            synchronized (randomAccessFile) {
                InputStream c0940e = new C0940e(randomAccessFile, c0938c2.f5740f);
                DataInputStream dataInputStream = new DataInputStream(c0940e);
                int reverseBytes = Integer.reverseBytes(dataInputStream.readInt());
                if (((long) reverseBytes) != 67324752) {
                    C0939d.m5680a("Local File Header", reverseBytes);
                }
                dataInputStream.skipBytes(2);
                reverseBytes = Short.reverseBytes(dataInputStream.readShort()) & 65535;
                if ((reverseBytes & 1) != 0) {
                    throw new ZipException("Invalid General Purpose Bit Flag: " + reverseBytes);
                }
                dataInputStream.skipBytes(18);
                reverseBytes = Short.reverseBytes(dataInputStream.readShort()) & 65535;
                int reverseBytes2 = Short.reverseBytes(dataInputStream.readShort()) & 65535;
                dataInputStream.close();
                if (reverseBytes != c0938c2.f5739e) {
                    c0938c2.f5741g |= 8;
                }
                if (reverseBytes2 >= 32768) {
                    c0938c2.f5741g |= 4;
                }
                if (z) {
                    return null;
                }
                c0940e.skip((long) (reverseBytes + reverseBytes2));
                if (c0938c2.f5738d == 0) {
                    c0940e.f5746b = c0940e.f5747c + c0938c2.f5737c;
                    return c0940e;
                }
                c0940e.f5746b = c0940e.f5747c + c0938c2.f5736b;
                InputStream c0941f = new C0941f(c0940e, new Inflater(true), Math.max(MemoryMappedFileBuffer.DEFAULT_PADDING, (int) Math.min(c0938c2.f5737c, 4096)), c0938c2);
                return c0941f;
            }
        }
    }

    private final void m5679a() {
        long j = 0;
        long length = this.f5742a.length() - 22;
        if (length < 0) {
            throw new ZipException("File too short to be a zip file: " + this.f5742a.length());
        }
        this.f5742a.seek(0);
        if (((long) Integer.reverseBytes(this.f5742a.readInt())) != 67324752) {
            throw new ZipException("Not a zip archive");
        }
        long j2 = length - 65536;
        if (j2 < 0) {
            j2 = length;
        } else {
            j = j2;
            j2 = length;
        }
        do {
            this.f5742a.seek(j2);
            if (((long) Integer.reverseBytes(this.f5742a.readInt())) != 101010256) {
                j2--;
            } else {
                byte[] bArr = new byte[18];
                this.f5742a.readFully(bArr);
                C0936a c0936a = new C0936a(bArr);
                int b = c0936a.m5675b() & 65535;
                int b2 = c0936a.m5675b() & 65535;
                int b3 = c0936a.m5675b() & 65535;
                int b4 = c0936a.m5675b() & 65535;
                c0936a.f5734c += 4;
                long a = ((long) c0936a.m5674a()) & 4294967295L;
                if (b3 == b4 && b == 0 && b2 == 0) {
                    InputStream bufferedInputStream = new BufferedInputStream(new C0940e(this.f5742a, a), eq.FLAG_APPEARED_IN_PRE_LAYOUT);
                    byte[] bArr2 = new byte[46];
                    for (int i = 0; i < b3; i++) {
                        C0938c c0938c = new C0938c(bArr2, bufferedInputStream);
                        if (c0938c.f5740f >= a) {
                            throw new ZipException("Local file header offset is after central directory");
                        }
                        C0938c c0938c2 = (C0938c) this.f5743b.put(c0938c.f5735a, c0938c);
                        if (c0938c2 != null) {
                            c0938c2.f5741g |= 32;
                            c0938c.f5741g |= 32;
                        }
                        this.f5744c.add(c0938c);
                    }
                    return;
                }
                throw new ZipException("Spanned archives not supported");
            }
        } while (j2 >= j);
        throw new ZipException("End Of Central Directory signature not found");
    }

    static void m5680a(String str, int i) {
        String format = String.format("%08x", new Object[]{Integer.valueOf(i)});
        throw new ZipException(new StringBuilder((String.valueOf(str).length() + 26) + String.valueOf(format).length()).append(str).append(" signature not found; was ").append(format).toString());
    }
}
