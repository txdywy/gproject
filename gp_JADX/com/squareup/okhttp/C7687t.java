package com.squareup.okhttp;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

final class C7687t implements C7686s {
    C7687t() {
    }

    public final List mo6477a(String str) {
        if (str != null) {
            return Arrays.asList(InetAddress.getAllByName(str));
        }
        throw new UnknownHostException("hostname == null");
    }
}
