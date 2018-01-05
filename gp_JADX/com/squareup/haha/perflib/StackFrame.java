package com.squareup.haha.perflib;

import com.squareup.haha.annotations.NonNull;

public class StackFrame {
    public static final int COMPILED_METHOD = -2;
    public static final int NATIVE_METHOD = -3;
    public static final int NO_LINE_NUMBER = 0;
    public static final int UNKNOWN_LOCATION = -1;
    public String mFilename;
    public long mId;
    public int mLineNumber;
    public String mMethodName;
    public int mSerialNumber;
    public String mSignature;

    public StackFrame(long j, String str, String str2, String str3, int i, int i2) {
        this.mId = j;
        this.mMethodName = str;
        this.mSignature = str2;
        this.mFilename = str3;
        this.mSerialNumber = i;
        this.mLineNumber = i2;
    }

    @NonNull
    private String lineNumberString() {
        switch (this.mLineNumber) {
            case NATIVE_METHOD /*-3*/:
                return "Native method";
            case COMPILED_METHOD /*-2*/:
                return "Compiled method";
            case -1:
                return "Unknown line number";
            case 0:
                return "No line number";
            default:
                return String.valueOf(this.mLineNumber);
        }
    }

    @NonNull
    public final String toString() {
        String str = this.mMethodName;
        String replace = this.mSignature.replace('/', '.');
        String str2 = this.mFilename;
        String lineNumberString = lineNumberString();
        return new StringBuilder((((String.valueOf(str).length() + 4) + String.valueOf(replace).length()) + String.valueOf(str2).length()) + String.valueOf(lineNumberString).length()).append(str).append(replace).append(" - ").append(str2).append(":").append(lineNumberString).toString();
    }
}
