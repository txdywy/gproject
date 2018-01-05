package com.google.android.libraries.flowlayoutmanager;

import android.content.res.TypedArray;
import android.os.Looper;
import android.util.TypedValue;

public final class C5918a {
    public static final TypedValue f29504a = new TypedValue();
    public static final ThreadLocal f29505b = new ThreadLocal();

    public static boolean m27465a(int i) {
        switch (-16777216 & i) {
            case -16777216:
            case 0:
                return true;
            default:
                return false;
        }
    }

    public static boolean m27466b(int i) {
        switch (-16777216 & i) {
            case Integer.MIN_VALUE:
            case -16777216:
            case 0:
            case 2130706432:
                return false;
            default:
                return true;
        }
    }

    public static int m27463a() {
        int floatToIntBits = Float.floatToIntBits(0.5f);
        if (C5918a.m27466b(floatToIntBits)) {
            return floatToIntBits;
        }
        throw new IllegalArgumentException("Float length 0.5 out of range or NaN");
    }

    public static int m27464a(TypedArray typedArray, String str, int i, boolean z) {
        TypedValue typedValue;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            typedValue = f29504a;
        } else {
            typedValue = (TypedValue) f29505b.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                f29505b.set(typedValue);
            }
        }
        String positionDescription;
        if (typedArray.getValue(i, typedValue)) {
            int floatToIntBits;
            String positionDescription2;
            switch (typedValue.type) {
                case 4:
                    float f = typedValue.getFloat();
                    if (!z || f >= 0.0f) {
                        floatToIntBits = f == 0.0f ? 0 : Float.floatToIntBits(typedValue.getFloat());
                        if (!C5918a.m27466b(floatToIntBits)) {
                            positionDescription = typedArray.getPositionDescription();
                            throw new IllegalArgumentException(new StringBuilder((String.valueOf(positionDescription).length() + 32) + String.valueOf(str).length()).append(positionDescription).append(": out-of-range float length for ").append(str).toString());
                        }
                    }
                    positionDescription = typedArray.getPositionDescription();
                    throw new IllegalArgumentException(new StringBuilder((String.valueOf(positionDescription).length() + 55) + String.valueOf(str).length()).append(positionDescription).append(": negative float length not allowed for size attribute ").append(str).toString());
                    break;
                case 5:
                    float dimension = typedValue.getDimension(typedArray.getResources().getDisplayMetrics());
                    if (!z || dimension >= 1.0f) {
                        floatToIntBits = Math.round(dimension);
                    } else if (dimension < 0.0f) {
                        positionDescription = typedArray.getPositionDescription();
                        throw new IllegalArgumentException(new StringBuilder((String.valueOf(positionDescription).length() + 55) + String.valueOf(str).length()).append(positionDescription).append(": negative dimen length not allowed for size attribute ").append(str).toString());
                    } else {
                        floatToIntBits = dimension == 0.0f ? 0 : 1;
                    }
                    if (floatToIntBits < -16777216 || floatToIntBits > 16777215) {
                        positionDescription = typedArray.getPositionDescription();
                        throw new IllegalArgumentException(new StringBuilder((String.valueOf(positionDescription).length() + 36) + String.valueOf(str).length()).append(positionDescription).append(": out-of-range dimension length for ").append(str).toString());
                    }
                    break;
                case 16:
                case 17:
                    floatToIntBits = typedValue.data;
                    int i2 = floatToIntBits & -16777216;
                    if (!(i2 == 2130706432 || (z && i2 == -16777216))) {
                        positionDescription2 = typedArray.getPositionDescription();
                        throw new IllegalArgumentException(new StringBuilder((String.valueOf(positionDescription2).length() + 37) + String.valueOf(str).length()).append(positionDescription2).append(": invalid enum value ").append(floatToIntBits).append(" for ").append(str).toString());
                    }
                default:
                    positionDescription2 = typedArray.getPositionDescription();
                    String valueOf = String.valueOf(typedValue.coerceToString());
                    throw new IllegalArgumentException(new StringBuilder(((String.valueOf(positionDescription2).length() + 25) + String.valueOf(str).length()) + String.valueOf(valueOf).length()).append(positionDescription2).append(": unaccepted value for ").append(str).append(": ").append(valueOf).toString());
            }
            return floatToIntBits;
        }
        positionDescription = typedArray.getPositionDescription();
        throw new IllegalArgumentException(new StringBuilder((String.valueOf(positionDescription).length() + 10) + String.valueOf(str).length()).append(positionDescription).append(": missing ").append(str).toString());
    }
}
