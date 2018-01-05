package com.google.p169b.p170a.p171a.p172a.p173a;

import com.google.p438f.p439a.C7121a;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

final class C6909q {
    static byte[] m31550a(List list) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C7121a.m32344a(list.size(), byteArrayOutputStream);
        for (Integer intValue : list) {
            C7121a.m32344a(intValue.intValue(), byteArrayOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }

    static List m31549a(DataInputStream dataInputStream) {
        int a = C7121a.m32342a((InputStream) dataInputStream);
        List arrayList = new ArrayList();
        for (int i = 0; i < a; i++) {
            arrayList.add(Integer.valueOf(C7121a.m32342a((InputStream) dataInputStream)));
        }
        return arrayList;
    }
}
