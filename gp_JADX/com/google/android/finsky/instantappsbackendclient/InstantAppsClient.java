package com.google.android.finsky.instantappsbackendclient;

import com.google.e.a.a.a.a.a.l;
import java.util.List;

public interface InstantAppsClient {

    public class InstantAppsClientException extends Exception {
        public InstantAppsClientException(String str, Throwable th) {
            super(String.format("%s due to %s", new Object[]{str, th.getMessage()}), th);
        }

        public InstantAppsClientException(String str, int i) {
            super(new StringBuilder(String.valueOf(str).length() + 18).append("HTTP(").append(i).append(") ").append(str).toString());
        }
    }

    C3565a mo3548a(String str, String str2, String str3, int i);

    l mo3549a(String str, List list);

    void mo3550a(String str, boolean z);
}
