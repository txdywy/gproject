package com.google.android.gms.peerdownloadmanager.common;

import java.io.Closeable;
import java.io.IOException;

public final class aa {
    public static void m26135a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }
}
