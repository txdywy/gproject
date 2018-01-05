package org.tensorflow.lite;

enum C8020a {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4),
    BYTEBUFFER(999);
    
    public static final C8020a[] f41077g = null;
    public final int f41079f;

    private C8020a(int i) {
        this.f41079f = i;
    }

    static C8020a m38278a(int i) {
        for (C8020a c8020a : f41077g) {
            if (c8020a.f41079f == i) {
                return c8020a;
            }
        }
        String version = TensorFlowLite.version();
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(version).length() + 57).append("DataType ").append(i).append(" is not recognized in Java (version ").append(version).append(")").toString());
    }

    static {
        f41077g = C8020a.values();
    }
}
