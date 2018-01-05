package org.tensorflow.lite;

import java.util.Arrays;

final class Tensor {
    public final long f41069a;
    public final C8020a f41070b;
    public final int[] f41071c;

    private static native int dtype(long j);

    private static native void readMultiDimensionalArray(long j, Object obj);

    private static native int[] shape(long j);

    final Object m38276a(Object obj) {
        if (NativeInterpreterWrapper.m38271a(obj) != this.f41070b) {
            throw new IllegalArgumentException(String.format("Cannot convert an TensorFlowLite tensor with type %s to a Java object of type %s (which is compatible with the TensorFlowLite type %s)", new Object[]{this.f41070b, obj.getClass().getName(), NativeInterpreterWrapper.m38271a(obj)}));
        }
        if (Arrays.equals(NativeInterpreterWrapper.m38273b(obj), this.f41071c)) {
            readMultiDimensionalArray(this.f41069a, obj);
            return obj;
        }
        throw new IllegalArgumentException(String.format("Shape of output target %s does not match with the shape of the Tensor %s.", new Object[]{Arrays.toString(NativeInterpreterWrapper.m38273b(obj)), Arrays.toString(this.f41071c)}));
    }

    Tensor(long j) {
        this.f41069a = j;
        this.f41070b = C8020a.m38278a(dtype(j));
        this.f41071c = shape(j);
    }

    static {
        TensorFlowLite.m38277a();
    }
}
