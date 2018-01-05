package com.squareup.haha.perflib;

import java.util.HashMap;
import java.util.Map;

public enum Type {
    OBJECT(2, 0),
    BOOLEAN(4, 1),
    CHAR(5, 2),
    FLOAT(6, 4),
    DOUBLE(7, 8),
    BYTE(8, 1),
    SHORT(9, 2),
    INT(10, 4),
    LONG(11, 8);
    
    public static Map sTypeMap;
    public int mId;
    public int mSize;

    /* synthetic */ class C75531 {
        public static final /* synthetic */ int[] $SwitchMap$com$squareup$haha$perflib$Type = null;

        static {
            $SwitchMap$com$squareup$haha$perflib$Type = new int[Type.values().length];
            try {
                $SwitchMap$com$squareup$haha$perflib$Type[Type.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$Type[Type.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$Type[Type.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$Type[Type.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$Type[Type.BYTE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$Type[Type.SHORT.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$Type[Type.INT.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$Type[Type.LONG.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
        }
    }

    private Type(int i, int i2) {
        this.mId = i;
        this.mSize = i2;
    }

    public static Type getType(int i) {
        return (Type) sTypeMap.get(Integer.valueOf(i));
    }

    public final int getSize() {
        return this.mSize;
    }

    public final int getTypeId() {
        return this.mId;
    }

    public static String getClassNameOfPrimitiveArray(Type type) {
        switch (type.ordinal()) {
            case 1:
                return "boolean[]";
            case 2:
                return "char[]";
            case 3:
                return "float[]";
            case 4:
                return "double[]";
            case 5:
                return "byte[]";
            case 6:
                return "short[]";
            case 7:
                return "int[]";
            case 8:
                return "long[]";
            default:
                throw new IllegalArgumentException("OBJECT type is not a primitive type");
        }
    }

    static {
        sTypeMap = new HashMap();
        Type[] values = values();
        int length = values.length;
        int i;
        while (i < length) {
            Type type = values[i];
            sTypeMap.put(Integer.valueOf(type.mId), type);
            i++;
        }
    }
}
