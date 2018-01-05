package com.squareup.leakcanary;

import java.io.File;

public interface HeapDumper {
    public static final HeapDumper NONE = new C75801();
    public static final File RETRY_LATER = null;

    class C75801 implements HeapDumper {
        C75801() {
        }

        public File dumpHeap() {
            return RETRY_LATER;
        }
    }

    File dumpHeap();
}
