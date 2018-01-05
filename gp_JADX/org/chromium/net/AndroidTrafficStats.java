package org.chromium.net;

import android.net.TrafficStats;
import android.os.Process;
import org.chromium.base.annotations.CalledByNative;

public class AndroidTrafficStats {
    private AndroidTrafficStats() {
    }

    @CalledByNative
    private static long getTotalTxBytes() {
        long totalTxBytes = TrafficStats.getTotalTxBytes();
        return totalTxBytes != -1 ? totalTxBytes : 0;
    }

    @CalledByNative
    private static long getTotalRxBytes() {
        long totalRxBytes = TrafficStats.getTotalRxBytes();
        return totalRxBytes != -1 ? totalRxBytes : 0;
    }

    @CalledByNative
    private static long getCurrentUidTxBytes() {
        long uidTxBytes = TrafficStats.getUidTxBytes(Process.myUid());
        return uidTxBytes != -1 ? uidTxBytes : 0;
    }

    @CalledByNative
    private static long getCurrentUidRxBytes() {
        long uidRxBytes = TrafficStats.getUidRxBytes(Process.myUid());
        return uidRxBytes != -1 ? uidRxBytes : 0;
    }
}
