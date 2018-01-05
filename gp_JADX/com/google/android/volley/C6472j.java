package com.google.android.volley;

import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpParams;

class C6472j implements SocketFactory {
    public SocketFactory f32466b;
    public final /* synthetic */ GoogleHttpClient f32467c;

    C6472j(GoogleHttpClient googleHttpClient, SocketFactory socketFactory) {
        this.f32467c = googleHttpClient;
        this.f32466b = socketFactory;
    }

    public final Socket createSocket() {
        return this.f32466b.createSocket();
    }

    public final boolean isSecure(Socket socket) {
        return this.f32466b.isSecure(socket);
    }

    public final Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) {
        this.f32467c.e.set(Boolean.TRUE);
        return this.f32466b.connectSocket(socket, str, i, inetAddress, i2, httpParams);
    }
}
