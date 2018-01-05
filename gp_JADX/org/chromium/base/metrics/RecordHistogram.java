package org.chromium.base.metrics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class RecordHistogram {
    public static Throwable f40540a;
    public static Map f40541b = Collections.synchronizedMap(new HashMap());

    private static native int nativeGetHistogramTotalCountForTesting(String str);

    private static native int nativeGetHistogramValueCountForTesting(String str, int i);

    private static native void nativeInitialize();

    private static native long nativeRecordBooleanHistogram(String str, long j, boolean z);

    private static native long nativeRecordCustomCountHistogram(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordCustomTimesHistogramMilliseconds(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordEnumeratedHistogram(String str, long j, int i, int i2);

    private static native long nativeRecordLinearCountHistogram(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordSparseHistogram(String str, long j, int i);

    private static long m37822a(String str) {
        Long l = (Long) f40541b.get(str);
        return l == null ? 0 : l.longValue();
    }

    public static void m37824a(String str, boolean z) {
        if (f40540a == null) {
            long a = m37822a(str);
            long nativeRecordBooleanHistogram = nativeRecordBooleanHistogram(str, a, z);
            if (nativeRecordBooleanHistogram != a) {
                f40541b.put(str, Long.valueOf(nativeRecordBooleanHistogram));
            }
        }
    }

    public static void m37823a(String str, long j, TimeUnit timeUnit) {
        long toMillis = timeUnit.toMillis(j);
        long toMillis2 = TimeUnit.SECONDS.toMillis(10);
        if (f40540a == null) {
            long a = m37822a(str);
            toMillis = nativeRecordCustomTimesHistogramMilliseconds(str, a, m37821a(toMillis), m37821a(1), m37821a(toMillis2), 50);
            if (toMillis != a) {
                f40541b.put(str, Long.valueOf(toMillis));
            }
        }
    }

    private static int m37821a(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
