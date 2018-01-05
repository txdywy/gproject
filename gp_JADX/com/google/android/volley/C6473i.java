package com.google.android.volley;

import java.net.Socket;
import org.apache.http.conn.scheme.LayeredSocketFactory;

final class C6473i extends C6472j implements LayeredSocketFactory {
    public LayeredSocketFactory f32468a;

    C6473i(GoogleHttpClient googleHttpClient, LayeredSocketFactory layeredSocketFactory) {
        super(googleHttpClient, layeredSocketFactory);
        this.f32468a = layeredSocketFactory;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.f32468a.createSocket(socket, str, i, z);
    }
}
