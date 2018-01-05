package com.squareup.leakcanary;

import com.squareup.haha.perflib.ArrayInstance;
import com.squareup.haha.perflib.ClassInstance;
import com.squareup.haha.perflib.ClassInstance.FieldValue;
import com.squareup.haha.perflib.ClassObj;
import com.squareup.haha.perflib.Field;
import com.squareup.haha.perflib.Instance;
import com.squareup.haha.perflib.Type;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class HahaHelper {
    public static final Set WRAPPER_TYPES = new HashSet(Arrays.asList(new String[]{Boolean.class.getName(), Character.class.getName(), Float.class.getName(), Double.class.getName(), Byte.class.getName(), Short.class.getName(), Integer.class.getName(), Long.class.getName()}));

    static String fieldToString(Entry entry) {
        return fieldToString((Field) entry.getKey(), entry.getValue());
    }

    static String fieldToString(FieldValue fieldValue) {
        return fieldToString(fieldValue.getField(), fieldValue.getValue());
    }

    static String fieldToString(Field field, Object obj) {
        String name = field.getName();
        String valueOf = String.valueOf(obj);
        return new StringBuilder((String.valueOf(name).length() + 3) + String.valueOf(valueOf).length()).append(name).append(" = ").append(valueOf).toString();
    }

    static String threadName(Instance instance) {
        Object fieldValue = fieldValue(classInstanceValues(instance), "name");
        if (fieldValue == null) {
            return "Thread name not available";
        }
        return asString(fieldValue);
    }

    static boolean extendsThread(ClassObj classObj) {
        for (ClassObj classObj2 = classObj; classObj2.getSuperClassObj() != null; classObj2 = classObj2.getSuperClassObj()) {
            if (classObj.getClassName().equals(Thread.class.getName())) {
                return true;
            }
        }
        return false;
    }

    static String asString(Object obj) {
        Instance instance = (Instance) obj;
        List classInstanceValues = classInstanceValues(instance);
        Integer num = (Integer) fieldValue(classInstanceValues, "count");
        Preconditions.checkNotNull(num, "count");
        if (num.intValue() == 0) {
            return "";
        }
        Object fieldValue = fieldValue(classInstanceValues, "value");
        Preconditions.checkNotNull(fieldValue, "value");
        ArrayInstance arrayInstance;
        if (isCharArray(fieldValue)) {
            arrayInstance = (ArrayInstance) fieldValue;
            Integer valueOf = Integer.valueOf(0);
            if (hasField(classInstanceValues, "offset")) {
                valueOf = (Integer) fieldValue(classInstanceValues, "offset");
                Preconditions.checkNotNull(valueOf, "offset");
            }
            return new String(arrayInstance.asCharArray(valueOf.intValue(), num.intValue()));
        } else if (isByteArray(fieldValue)) {
            arrayInstance = (ArrayInstance) fieldValue;
            try {
                Method declaredMethod = ArrayInstance.class.getDeclaredMethod("asRawByteArray", new Class[]{Integer.TYPE, Integer.TYPE});
                declaredMethod.setAccessible(true);
                return new String((byte[]) declaredMethod.invoke(arrayInstance, new Object[]{Integer.valueOf(0), num}), Charset.forName("UTF-8"));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            } catch (Throwable e2) {
                throw new RuntimeException(e2);
            } catch (Throwable e22) {
                throw new RuntimeException(e22);
            }
        } else {
            String valueOf2 = String.valueOf(instance);
            throw new UnsupportedOperationException(new StringBuilder(String.valueOf(valueOf2).length() + 29).append("Could not find char array in ").append(valueOf2).toString());
        }
    }

    public static boolean isPrimitiveWrapper(Object obj) {
        if (obj instanceof ClassInstance) {
            return WRAPPER_TYPES.contains(((ClassInstance) obj).getClassObj().getClassName());
        }
        return false;
    }

    public static boolean isPrimitiveOrWrapperArray(Object obj) {
        if (!(obj instanceof ArrayInstance)) {
            return false;
        }
        ArrayInstance arrayInstance = (ArrayInstance) obj;
        if (arrayInstance.getArrayType() != Type.OBJECT) {
            return true;
        }
        return WRAPPER_TYPES.contains(arrayInstance.getClassObj().getClassName());
    }

    private static boolean isCharArray(Object obj) {
        return (obj instanceof ArrayInstance) && ((ArrayInstance) obj).getArrayType() == Type.CHAR;
    }

    private static boolean isByteArray(Object obj) {
        return (obj instanceof ArrayInstance) && ((ArrayInstance) obj).getArrayType() == Type.BYTE;
    }

    static List classInstanceValues(Instance instance) {
        return ((ClassInstance) instance).getValues();
    }

    static Object fieldValue(List list, String str) {
        for (FieldValue fieldValue : list) {
            if (fieldValue.getField().getName().equals(str)) {
                return fieldValue.getValue();
            }
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 22).append("Field ").append(str).append(" does not exists").toString());
    }

    static boolean hasField(List list, String str) {
        for (FieldValue field : list) {
            if (field.getField().getName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private HahaHelper() {
        throw new AssertionError();
    }
}
