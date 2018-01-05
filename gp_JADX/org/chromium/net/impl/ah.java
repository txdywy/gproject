package org.chromium.net.impl;

import android.net.TrafficStats;

final class ah implements Runnable {
    public final /* synthetic */ Runnable f40796a;
    public final /* synthetic */ ag f40797b;

    ah(ag agVar, Runnable runnable) {
        this.f40797b = agVar;
        this.f40796a = runnable;
    }

    public final void run() {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        TrafficStats.setThreadStatsTag(this.f40797b.f40795b.f40782i);
        try {
            this.f40796a.run();
        } finally {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
    }
}
