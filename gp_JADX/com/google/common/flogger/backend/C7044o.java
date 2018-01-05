package com.google.common.flogger.backend;

final class C7044o {
    public static final C7023n f34549a = C7044o.m32096a(C7023n.f34506d);

    private static C7023n m32096a(String[] strArr) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            try {
                return (C7023n) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                stringBuilder.append('\n').append(str).append(": ").append(th);
                i++;
            }
        }
        throw new IllegalStateException(stringBuilder.insert(0, "No logging platforms found:").toString());
    }
}
