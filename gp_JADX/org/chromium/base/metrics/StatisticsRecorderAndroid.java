package org.chromium.base.metrics;

public final class StatisticsRecorderAndroid {
    private StatisticsRecorderAndroid() {
    }

    private static native String nativeToJson();
}
