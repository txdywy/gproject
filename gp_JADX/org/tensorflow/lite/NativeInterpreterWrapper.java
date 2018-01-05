package org.tensorflow.lite;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

final class NativeInterpreterWrapper implements AutoCloseable {
    public long f41066a = createErrorReporter(512);
    public long f41067b;
    public long f41068c;

    NativeInterpreterWrapper(String str) {
        this.f41068c = createModel(str, this.f41066a);
        this.f41067b = createInterpreter(this.f41068c);
    }

    private static native long createErrorReporter(int i);

    private static native long createInterpreter(long j);

    private static native long createModel(String str, long j);

    private static native long createModelWithBuffer(MappedByteBuffer mappedByteBuffer, long j);

    private static native void delete(long j, long j2, long j3);

    private static native int[] getInputDims(long j, int i, int i2);

    private static native String[] getInputNames(long j);

    private static native String[] getOutputNames(long j);

    private static native void resizeInput(long j, long j2, int i, int[] iArr);

    private static native long[] run(long j, long j2, Object[] objArr, int[] iArr, int[] iArr2, Object[] objArr2);

    private static native void useNNAPI(long j, boolean z);

    public final void close() {
        delete(this.f41066a, this.f41068c, this.f41067b);
        this.f41066a = 0;
        this.f41068c = 0;
        this.f41067b = 0;
    }

    final Tensor[] m38275a(Object[] objArr) {
        int i = 0;
        if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException("Invalid inputs. Inputs should not be null or empty.");
        }
        int[] iArr = new int[objArr.length];
        Object[] objArr2 = new Object[objArr.length];
        int[] iArr2 = new int[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            C8020a a = m38271a(objArr[i2]);
            iArr[i2] = a.f41079f;
            if (a == C8020a.BYTEBUFFER) {
                ByteBuffer byteBuffer = (ByteBuffer) objArr[i2];
                if (byteBuffer.order() != ByteOrder.nativeOrder()) {
                    throw new IllegalArgumentException("Invalid ByteBuffer. It shoud use ByteOrder.nativeOrder().");
                }
                iArr2[i2] = byteBuffer.limit();
                objArr2[i2] = getInputDims(this.f41067b, i2, iArr2[i2]);
            } else {
                Object obj = objArr[i2];
                int i3 = (obj == null || !obj.getClass().isArray() || Array.getLength(obj) == 0) ? 0 : 1;
                if (i3 != 0) {
                    int[] b = m38273b(objArr[i2]);
                    objArr2[i2] = b;
                    switch (a.ordinal()) {
                        case 0:
                            i3 = 4;
                            break;
                        case 1:
                            i3 = 4;
                            break;
                        case 2:
                            i3 = 1;
                            break;
                        case 3:
                            i3 = 8;
                            break;
                        case 4:
                            i3 = 1;
                            break;
                        default:
                            String valueOf = String.valueOf(a);
                            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 30).append("DataType ").append(valueOf).append(" is not supported yet").toString());
                    }
                    iArr2[i2] = i3 * m38270a(b);
                } else {
                    throw new IllegalArgumentException(String.format("%d-th element of the %d inputs is not an array or a ByteBuffer.", new Object[]{Integer.valueOf(i2), Integer.valueOf(objArr.length)}));
                }
            }
        }
        long[] run = run(this.f41067b, this.f41066a, objArr2, iArr, iArr2, objArr);
        if (run == null || run.length == 0) {
            throw new IllegalStateException("Interpreter has no outputs.");
        }
        Tensor[] tensorArr = new Tensor[run.length];
        while (i < run.length) {
            tensorArr[i] = new Tensor(run[i]);
            i++;
        }
        return tensorArr;
    }

    private static int m38270a(int[] iArr) {
        int i = 0;
        if (iArr == null) {
            return 0;
        }
        int i2 = 1;
        while (i < iArr.length) {
            i2 *= iArr[i];
            i++;
        }
        return i2;
    }

    static C8020a m38271a(Object obj) {
        if (obj != null) {
            Class cls = obj.getClass();
            while (cls.isArray()) {
                cls = cls.getComponentType();
            }
            if (Float.TYPE.equals(cls)) {
                return C8020a.FLOAT32;
            }
            if (Integer.TYPE.equals(cls)) {
                return C8020a.INT32;
            }
            if (Byte.TYPE.equals(cls)) {
                return C8020a.UINT8;
            }
            if (Long.TYPE.equals(cls)) {
                return C8020a.INT64;
            }
            if (ByteBuffer.class.isInstance(obj)) {
                return C8020a.BYTEBUFFER;
            }
        }
        String str = "cannot resolve DataType of ";
        String valueOf = String.valueOf(obj.getClass().getName());
        throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    static int[] m38273b(Object obj) {
        int[] iArr = new int[m38274c(obj)];
        m38272a(obj, 0, iArr);
        return iArr;
    }

    private static int m38274c(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) != 0) {
            return m38274c(Array.get(obj, 0)) + 1;
        }
        throw new IllegalArgumentException("array lengths cannot be 0.");
    }

    private static void m38272a(Object obj, int i, int[] iArr) {
        int i2 = 0;
        if (iArr != null && i != iArr.length) {
            int length = Array.getLength(obj);
            if (iArr[i] == 0) {
                iArr[i] = length;
            } else if (iArr[i] != length) {
                throw new IllegalArgumentException(String.format("mismatched lengths (%d and %d) in dimension %d", new Object[]{Integer.valueOf(iArr[i]), Integer.valueOf(length), Integer.valueOf(i)}));
            }
            while (i2 < length) {
                m38272a(Array.get(obj, i2), i + 1, iArr);
                i2++;
            }
        }
    }

    static {
        TensorFlowLite.m38277a();
    }
}
