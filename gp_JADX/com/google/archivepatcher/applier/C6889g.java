package com.google.archivepatcher.applier;

public final class C6889g {
    static final long m31264a(long j, String str) {
        if (j >= 0) {
            return j;
        }
        throw new PatchFormatException(new StringBuilder(String.valueOf(str).length() + 36).append("Bad value for ").append(str).append(": ").append(j).toString());
    }

    static final long m31263a(long j, long j2, long j3, String str) {
        if (j >= j2 && j <= j3) {
            return j;
        }
        throw new PatchFormatException(new StringBuilder(String.valueOf(str).length() + 94).append("Bad value for ").append(str).append(": ").append(j).append(" (valid range: [").append(j2).append(",").append(j3).append("]").toString());
    }
}
