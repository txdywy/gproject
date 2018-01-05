package com.google.protobuf;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

final class ci {
    static void m33072a(cf cfVar, StringBuilder stringBuilder, int i) {
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        Set<String> treeSet = new TreeSet();
        for (Method method : cfVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String replaceFirst : treeSet) {
            String replaceFirst2;
            String valueOf;
            Method method2;
            String replaceFirst3 = replaceFirst2.replaceFirst("get", "");
            if (replaceFirst3.endsWith("List") && !replaceFirst3.endsWith("OrBuilderList")) {
                valueOf = String.valueOf(replaceFirst3.substring(0, 1).toLowerCase());
                replaceFirst2 = String.valueOf(replaceFirst3.substring(1, replaceFirst3.length() - 4));
                valueOf = replaceFirst2.length() != 0 ? valueOf.concat(replaceFirst2) : new String(valueOf);
                String str = "get";
                replaceFirst2 = String.valueOf(replaceFirst3);
                method2 = (Method) hashMap.get(replaceFirst2.length() != 0 ? str.concat(replaceFirst2) : new String(str));
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m33073a(stringBuilder, i, m33071a(valueOf), at.m32942a(method2, (Object) cfVar, new Object[0]));
                }
            }
            valueOf = "set";
            replaceFirst2 = String.valueOf(replaceFirst3);
            if (((Method) hashMap2.get(replaceFirst2.length() != 0 ? valueOf.concat(replaceFirst2) : new String(valueOf))) != null) {
                if (replaceFirst3.endsWith("Bytes")) {
                    valueOf = "get";
                    replaceFirst2 = String.valueOf(replaceFirst3.substring(0, replaceFirst3.length() - 5));
                    if (hashMap.containsKey(replaceFirst2.length() != 0 ? valueOf.concat(replaceFirst2) : new String(valueOf))) {
                    }
                }
                valueOf = String.valueOf(replaceFirst3.substring(0, 1).toLowerCase());
                replaceFirst2 = String.valueOf(replaceFirst3.substring(1));
                str = replaceFirst2.length() != 0 ? valueOf.concat(replaceFirst2) : new String(valueOf);
                valueOf = "get";
                replaceFirst2 = String.valueOf(replaceFirst3);
                method2 = (Method) hashMap.get(replaceFirst2.length() != 0 ? valueOf.concat(replaceFirst2) : new String(valueOf));
                String str2 = "has";
                valueOf = String.valueOf(replaceFirst3);
                Method method3 = (Method) hashMap.get(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                if (method2 != null) {
                    boolean equals;
                    cf a = at.m32942a(method2, (Object) cfVar, new Object[0]);
                    if (method3 == null) {
                        equals = a instanceof Boolean ? !((Boolean) a).booleanValue() : a instanceof Integer ? ((Integer) a).intValue() == 0 : a instanceof Float ? ((Float) a).floatValue() == 0.0f : a instanceof Double ? ((Double) a).doubleValue() == 0.0d : a instanceof String ? a.equals("") : a instanceof C7203j ? a.equals(C7203j.f35320a) : a instanceof cf ? a == ((cf) a).mo6121h() : a instanceof Enum ? ((Enum) a).ordinal() == 0 : false;
                        if (equals) {
                            equals = false;
                        } else {
                            equals = true;
                        }
                    } else {
                        equals = ((Boolean) at.m32942a(method3, (Object) cfVar, new Object[0])).booleanValue();
                    }
                    if (equals) {
                        m33073a(stringBuilder, i, m33071a(str), a);
                    }
                }
            }
        }
        if (cfVar instanceof aw) {
            Iterator b = ((aw) cfVar).f35186a.m32918b();
            if (b.hasNext()) {
                ((Entry) b.next()).getKey();
                throw new NoSuchMethodError();
            }
        }
        if (((at) cfVar).f35180h != null) {
            ((at) cfVar).f35180h.m33331a(stringBuilder, i);
        }
    }

    static final void m33073a(StringBuilder stringBuilder, int i, String str, Object obj) {
        int i2 = 0;
        if (obj instanceof List) {
            for (Object a : (List) obj) {
                m33073a(stringBuilder, i, str, a);
            }
            return;
        }
        stringBuilder.append('\n');
        for (int i3 = 0; i3 < i; i3++) {
            stringBuilder.append(' ');
        }
        stringBuilder.append(str);
        if (obj instanceof String) {
            stringBuilder.append(": \"").append(dr.m33300a(C7203j.m33198a((String) obj))).append('\"');
        } else if (obj instanceof C7203j) {
            stringBuilder.append(": \"").append(dr.m33300a((C7203j) obj)).append('\"');
        } else if (obj instanceof at) {
            stringBuilder.append(" {");
            m33072a((at) obj, stringBuilder, i + 2);
            stringBuilder.append("\n");
            while (i2 < i) {
                stringBuilder.append(' ');
                i2++;
            }
            stringBuilder.append("}");
        } else {
            stringBuilder.append(": ").append(obj.toString());
        }
    }

    private static final String m33071a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                stringBuilder.append("_");
            }
            stringBuilder.append(Character.toLowerCase(charAt));
        }
        return stringBuilder.toString();
    }
}
