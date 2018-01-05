package com.google.android.libraries.performance.primes.metriccapture;

import d.a.a.a.a.a.bl;
import d.a.a.a.a.a.bm;
import d.a.a.a.a.a.q;
import java.util.HashSet;
import java.util.Iterator;

public final class C6009a {
    public static q m27873a(HashSet hashSet) {
        q qVar = new q();
        qVar.a = new bm[hashSet.size()];
        Iterator it = hashSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) it.next();
            int length = stackTraceElementArr.length;
            bl[] blVarArr = new bl[length];
            for (int i2 = 0; i2 < length; i2++) {
                StackTraceElement stackTraceElement = stackTraceElementArr[i2];
                bl blVar = new bl();
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                blVar.b = new StringBuilder((String.valueOf(className).length() + 1) + String.valueOf(methodName).length()).append(className).append(".").append(methodName).toString();
                blVarArr[i2] = blVar;
            }
            bm bmVar = new bm();
            bmVar.b = blVarArr;
            qVar.a[i] = bmVar;
            i++;
        }
        return qVar;
    }
}
