package com.squareup.haha.perflib;

import com.squareup.haha.annotations.NonNull;
import com.squareup.haha.annotations.Nullable;

public class StackTrace {
    public StackFrame[] mFrames;
    public int mOffset = 0;
    @Nullable
    public StackTrace mParent = null;
    public int mSerialNumber;
    public int mThreadSerialNumber;

    private StackTrace() {
    }

    public StackTrace(int i, int i2, StackFrame[] stackFrameArr) {
        this.mSerialNumber = i;
        this.mThreadSerialNumber = i2;
        this.mFrames = stackFrameArr;
    }

    @NonNull
    public final StackTrace fromDepth(int i) {
        StackTrace stackTrace = new StackTrace();
        if (this.mParent != null) {
            stackTrace.mParent = this.mParent;
        } else {
            stackTrace.mParent = this;
        }
        stackTrace.mOffset = this.mOffset + i;
        return stackTrace;
    }

    public final void dump() {
        for (StackFrame stackFrame : this.mFrames) {
            System.out.println(stackFrame.toString());
        }
    }
}
