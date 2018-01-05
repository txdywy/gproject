package android.support.p017d;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

final class C0093g {
    static long m204a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long a = C0093g.m205a(randomAccessFile, C0093g.m206a(randomAccessFile));
            return a;
        } finally {
            randomAccessFile.close();
        }
    }

    private static C0094h m206a(RandomAccessFile randomAccessFile) {
        long j = 0;
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j2 = length - 65536;
        if (j2 >= 0) {
            j = j2;
        }
        int reverseBytes = Integer.reverseBytes(101010256);
        j2 = length;
        do {
            randomAccessFile.seek(j2);
            if (randomAccessFile.readInt() != reverseBytes) {
                j2--;
            } else {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                C0094h c0094h = new C0094h();
                c0094h.f420b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                c0094h.f419a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return c0094h;
            }
        } while (j2 >= j);
        throw new ZipException("End Of Central Directory signature not found");
    }

    private static long m205a(RandomAccessFile randomAccessFile, C0094h c0094h) {
        CRC32 crc32 = new CRC32();
        long j = c0094h.f420b;
        randomAccessFile.seek(c0094h.f419a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= (long) read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        }
        return crc32.getValue();
    }
}
