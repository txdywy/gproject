package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C7601b;
import com.squareup.okhttp.C7678j;
import com.squareup.okhttp.C7684q;
import com.squareup.okhttp.C7691x;
import com.squareup.okhttp.ag;
import com.squareup.okhttp.ak;
import java.net.Authenticator;
import java.net.Authenticator.RequestorType;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.List;

public final class C7649a implements C7601b {
    public static final C7601b f39595a = new C7649a();

    public final ag mo6465a(Proxy proxy, ak akVar) {
        List b = akVar.m36652b();
        ag agVar = akVar.f39304a;
        C7691x c7691x = agVar.f39288a;
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C7678j c7678j = (C7678j) b.get(i);
            if ("Basic".equalsIgnoreCase(c7678j.f39714a)) {
                PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(c7691x.f39799e, C7649a.m36897a(proxy, c7691x), c7691x.f39800f, c7691x.f39796b, c7678j.f39715b, c7678j.f39714a, c7691x.m37038a(), RequestorType.SERVER);
                if (requestPasswordAuthentication != null) {
                    return agVar.m36632b().m36640a("Authorization", C7684q.m37007a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()))).m36636a();
                }
            }
        }
        return null;
    }

    public final ag mo6466b(Proxy proxy, ak akVar) {
        List b = akVar.m36652b();
        ag agVar = akVar.f39304a;
        C7691x c7691x = agVar.f39288a;
        int size = b.size();
        for (int i = 0; i < size; i++) {
            C7678j c7678j = (C7678j) b.get(i);
            if ("Basic".equalsIgnoreCase(c7678j.f39714a)) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), C7649a.m36897a(proxy, c7691x), inetSocketAddress.getPort(), c7691x.f39796b, c7678j.f39715b, c7678j.f39714a, c7691x.m37038a(), RequestorType.PROXY);
                if (requestPasswordAuthentication != null) {
                    return agVar.m36632b().m36640a("Proxy-Authorization", C7684q.m37007a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()))).m36636a();
                }
            }
        }
        return null;
    }

    private static InetAddress m36897a(Proxy proxy, C7691x c7691x) {
        if (proxy == null || proxy.type() == Type.DIRECT) {
            return InetAddress.getByName(c7691x.f39799e);
        }
        return ((InetSocketAddress) proxy.address()).getAddress();
    }
}
