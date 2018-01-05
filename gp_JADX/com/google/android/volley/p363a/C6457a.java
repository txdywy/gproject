package com.google.android.volley.p363a;

import com.android.volley.aa;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.scheme.HostNameResolver;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public final class C6457a implements SocketFactory {
    public static final C6457a f32441a = new C6457a((byte) 0);
    public final HostNameResolver f32442b;

    private C6457a() {
        this.f32442b = null;
    }

    private C6457a(byte b) {
        this();
    }

    public final Socket createSocket() {
        return new Socket();
    }

    public final Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) {
        if (str == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        } else if (httpParams == null) {
            throw new IllegalArgumentException("Parameters may not be null.");
        } else {
            SocketAddress inetSocketAddress;
            if (socket == null) {
                socket = createSocket();
            }
            if (inetAddress != null || i2 > 0) {
                if (i2 < 0) {
                    i2 = 0;
                }
                socket.bind(new InetSocketAddress(inetAddress, i2));
            }
            int connectionTimeout = HttpConnectionParams.getConnectionTimeout(httpParams);
            if (this.f32442b != null) {
                inetSocketAddress = new InetSocketAddress(this.f32442b.resolve(str), i);
            } else {
                inetSocketAddress = new InetSocketAddress(str, i);
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                socket.connect(inetSocketAddress, connectionTimeout);
                currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                aa.a("Established connection to [host=%s] in [%s ms]", new Object[]{str, Long.valueOf(currentTimeMillis)});
                return socket;
            } catch (SocketTimeoutException e) {
                String valueOf = String.valueOf(inetSocketAddress);
                throw new ConnectTimeoutException(new StringBuilder(String.valueOf(valueOf).length() + 21).append("Connect to ").append(valueOf).append(" timed out").toString());
            }
        }
    }

    public final boolean isSecure(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null.");
        } else if (socket.getClass() != Socket.class) {
            throw new IllegalArgumentException("Socket not created by this factory.");
        } else if (!socket.isClosed()) {
            return false;
        } else {
            throw new IllegalArgumentException("Socket is closed.");
        }
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return C6457a.class.hashCode();
    }
}
