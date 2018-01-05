package com.google.android.play.dfe.p353a;

import com.google.protobuf.nano.C0757i;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public final class C6283a {
    public static final Map f31338a = new HashMap();

    public static C0757i m28819a(C0757i c0757i, Class cls, Class cls2) {
        try {
            Field field = (Field) f31338a.get(cls2);
            if (field == null) {
                Field[] fields = cls.getFields();
                int length = fields.length;
                int i = 0;
                while (i < length) {
                    field = fields[i];
                    if (field.getType().equals(cls2) && Modifier.isPublic(field.getModifiers())) {
                        f31338a.put(cls2, field);
                    } else {
                        i++;
                    }
                }
                String valueOf = String.valueOf(cls2);
                String valueOf2 = String.valueOf(cls);
                throw new IllegalArgumentException(new StringBuilder((String.valueOf(valueOf).length() + 17) + String.valueOf(valueOf2).length()).append("No field for ").append(valueOf).append(" in ").append(valueOf2).toString());
            }
            return (C0757i) field.get(c0757i);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
