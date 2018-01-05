package com.squareup.okhttp.internal;

import com.squareup.okhttp.af;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

final class C7648h extends C7646f {
    public final Method f39588b;
    public final Method f39589c;
    public final Method f39590d;
    public final Class f39591e;
    public final Class f39592f;

    public C7648h(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f39588b = method;
        this.f39589c = method2;
        this.f39590d = method3;
        this.f39591e = cls;
        this.f39592f = cls2;
    }

    public final void mo6462a(SSLSocket sSLSocket, String str, List list) {
        Object newProxyInstance;
        List arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            af afVar = (af) list.get(i);
            if (afVar != af.a) {
                arrayList.add(afVar.toString());
            }
        }
        try {
            newProxyInstance = Proxy.newProxyInstance(C7646f.class.getClassLoader(), new Class[]{this.f39591e, this.f39592f}, new C7675i(arrayList));
            this.f39588b.invoke(null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e) {
            newProxyInstance = e;
            throw new AssertionError(newProxyInstance);
        } catch (IllegalAccessException e2) {
            newProxyInstance = e2;
            throw new AssertionError(newProxyInstance);
        }
    }

    public final void mo6464a(SSLSocket sSLSocket) {
        try {
            this.f39590d.invoke(null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e) {
            throw new AssertionError();
        } catch (InvocationTargetException e2) {
            throw new AssertionError();
        }
    }

    public final String mo6463b(SSLSocket sSLSocket) {
        try {
            C7675i c7675i = (C7675i) Proxy.getInvocationHandler(this.f39589c.invoke(null, new Object[]{sSLSocket}));
            if (!c7675i.f39709b && c7675i.f39710c == null) {
                C7600b.f39286a.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            } else if (c7675i.f39709b) {
                return null;
            } else {
                return c7675i.f39710c;
            }
        } catch (InvocationTargetException e) {
            throw new AssertionError();
        } catch (IllegalAccessException e2) {
            throw new AssertionError();
        }
    }
}
