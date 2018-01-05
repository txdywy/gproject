package com.google.android.finsky.p2p;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.android.p2putils.C0600g;
import com.android.p2putils.SigBlockUtil;
import com.android.p2putils.SigBlockUtil.BlockNotFoundException;
import com.google.android.finsky.utils.FinskyLog;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.wireless.android.finsky.c.a.k;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class FrostingUtil {
    public final C3842a f19219a;

    class FailureException extends Exception {
    }

    public FrostingUtil(C3842a c3842a) {
        this.f19219a = c3842a;
    }

    private static C3848g m18311a(File file) {
        try {
            ByteBuffer b = m18315b(file);
            int a = m18310a(b, Integer.valueOf(m18309a(b)));
            byte[] bArr = new byte[a];
            b.get(bArr, 0, a);
            try {
                return new C3848g((k) C0757i.m4905a(new k(), bArr));
            } catch (InvalidProtocolBufferNanoException e) {
                return C3848g.m18322a();
            }
        } catch (FailureException e2) {
            return C3848g.m18322a();
        }
    }

    private static ByteBuffer m18315b(File file) {
        Throwable th;
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                Pair a = C0600g.m4212a(randomAccessFile2);
                if (a == null) {
                    throw new BlockNotFoundException("Not an APK file: ZIP End of Central Directory record not found");
                }
                ByteBuffer byteBuffer = (ByteBuffer) a.first;
                long longValue = ((Long) a.second).longValue();
                if (C0600g.m4214a(randomAccessFile2, longValue)) {
                    throw new BlockNotFoundException("ZIP64 APK not supported");
                }
                long a2 = C0600g.m4210a(byteBuffer);
                if (a2 >= longValue) {
                    throw new BlockNotFoundException("ZIP Central Directory offset out of range: " + a2 + ". ZIP End of Central Directory offset: " + longValue);
                } else if (C0600g.m4215b(byteBuffer) + a2 != longValue) {
                    throw new BlockNotFoundException("ZIP Central Directory is not immediately followed by End of Central Directory");
                } else if (a2 < 32) {
                    throw new BlockNotFoundException("APK too small for APK Signing Block. ZIP Central Directory offset: " + a2);
                } else {
                    byteBuffer = ByteBuffer.allocate(24);
                    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                    randomAccessFile2.seek(a2 - ((long) byteBuffer.capacity()));
                    randomAccessFile2.readFully(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                    if (byteBuffer.getLong(8) == 2334950737559900225L && byteBuffer.getLong(16) == 3617552046287187010L) {
                        longValue = byteBuffer.getLong(0);
                        if (longValue < ((long) byteBuffer.capacity()) || longValue > 2147483639) {
                            throw new BlockNotFoundException("APK Signing Block size out of range: " + longValue);
                        }
                        int i = (int) (8 + longValue);
                        a2 -= (long) i;
                        if (a2 < 0) {
                            throw new BlockNotFoundException("APK Signing Block offset out of range: " + a2);
                        }
                        byteBuffer = ByteBuffer.allocate(i);
                        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                        randomAccessFile2.seek(a2);
                        randomAccessFile2.readFully(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                        long j = byteBuffer.getLong(0);
                        if (j != longValue) {
                            throw new BlockNotFoundException("APK Signing Block sizes in header and footer do not match: " + j + " vs " + longValue);
                        }
                        byteBuffer = SigBlockUtil.m4201a((ByteBuffer) Pair.create(byteBuffer, Long.valueOf(a2)).first);
                        if (byteBuffer.limit() < 4) {
                            throw new FailureException();
                        }
                        randomAccessFile2.close();
                        return byteBuffer;
                    }
                    throw new BlockNotFoundException("No APK Signing Block before ZIP Central Directory");
                }
            } catch (BlockNotFoundException e) {
                throw new FailureException();
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            throw th;
        }
    }

    private static int m18309a(ByteBuffer byteBuffer) {
        try {
            int b = m18313b(byteBuffer);
            if (b <= 0) {
                throw new FailureException();
            } else if (b <= byteBuffer.limit() - byteBuffer.position()) {
                return b;
            } else {
                throw new FailureException();
            }
        } catch (IllegalArgumentException e) {
            throw new FailureException();
        }
    }

    public static String m18312a(PackageInfo packageInfo) {
        if (packageInfo.applicationInfo != null) {
            return packageInfo.applicationInfo.sourceDir;
        }
        return null;
    }

    private static int m18310a(ByteBuffer byteBuffer, Integer num) {
        int position = byteBuffer.position();
        try {
            int b = m18313b(byteBuffer);
            if (b <= 0) {
                throw new FailureException();
            } else if (b > num.intValue() - (byteBuffer.position() - position)) {
                throw new FailureException();
            } else if (b <= byteBuffer.limit() - byteBuffer.position()) {
                return b;
            } else {
                throw new FailureException();
            }
        } catch (IllegalArgumentException e) {
            throw new FailureException();
        }
    }

    private static int m18313b(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        if (b >= (byte) 0) {
            return b;
        }
        int i = b & 127;
        byte b2 = byteBuffer.get();
        if (b2 >= (byte) 0) {
            return i | (b2 << 7);
        }
        i |= (b2 & 127) << 7;
        b2 = byteBuffer.get();
        if (b2 >= (byte) 0) {
            return i | (b2 << 14);
        }
        i |= (b2 & 127) << 14;
        b2 = byteBuffer.get();
        if (b2 >= (byte) 0) {
            return i | (b2 << 21);
        }
        i |= (b2 & 127) << 21;
        b2 = byteBuffer.get();
        i |= b2 << 28;
        if (b2 >= (byte) 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static k m18314b(PackageInfo packageInfo) {
        try {
            Object a = m18312a(packageInfo);
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            C3848g a2 = m18311a(new File(a));
            if ((a2.f19223a != null ? 1 : 0) != 0) {
                return a2.f19223a;
            }
            return null;
        } catch (IOException e) {
            FinskyLog.m21659a("App file cannot be read %s", packageInfo.packageName);
            return null;
        }
    }
}
