package com.squareup.okhttp.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

final class C7675i implements InvocationHandler {
    public final List f39708a;
    public boolean f39709b;
    public String f39710c;

    public C7675i(List list) {
        this.f39708a = list;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class returnType = method.getReturnType();
        if (objArr == null) {
            objArr = k.b;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.valueOf(true);
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f39709b = true;
            return null;
        } else if (name.equals("protocols") && objArr.length == 0) {
            return this.f39708a;
        } else {
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                List list = (List) objArr[0];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (this.f39708a.contains(list.get(i))) {
                        name = (String) list.get(i);
                        this.f39710c = name;
                        return name;
                    }
                }
                name = (String) this.f39708a.get(0);
                this.f39710c = name;
                return name;
            } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            } else {
                this.f39710c = (String) objArr[0];
                return null;
            }
        }
    }
}
