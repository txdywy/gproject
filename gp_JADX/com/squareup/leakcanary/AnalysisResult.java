package com.squareup.leakcanary;

import java.io.Serializable;

public final class AnalysisResult implements Serializable {
    public final long analysisDurationMs;
    public final String className;
    public final boolean excludedLeak;
    public final Throwable failure;
    public final boolean leakFound;
    public final LeakTrace leakTrace;
    public final long retainedHeapSize;

    public static AnalysisResult noLeak(long j) {
        return new AnalysisResult(false, false, null, null, null, 0, j);
    }

    public static AnalysisResult leakDetected(boolean z, String str, LeakTrace leakTrace, long j, long j2) {
        return new AnalysisResult(true, z, str, leakTrace, null, j, j2);
    }

    public static AnalysisResult failure(Throwable th, long j) {
        return new AnalysisResult(false, false, null, null, th, 0, j);
    }

    private AnalysisResult(boolean z, boolean z2, String str, LeakTrace leakTrace, Throwable th, long j, long j2) {
        this.leakFound = z;
        this.excludedLeak = z2;
        this.className = str;
        this.leakTrace = leakTrace;
        this.failure = th;
        this.retainedHeapSize = j;
        this.analysisDurationMs = j2;
    }
}
