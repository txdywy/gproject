package org.tensorflow.lite;

import java.io.File;
import java.util.Map;

public final class C8021b implements AutoCloseable {
    public NativeInterpreterWrapper f41080a;

    public C8021b(File file) {
        if (file != null) {
            this.f41080a = new NativeInterpreterWrapper(file.getAbsolutePath());
        }
    }

    public final void m38279a(Object[] objArr, Map map) {
        if (this.f41080a == null) {
            throw new IllegalStateException("The Interpreter has already been closed.");
        }
        Tensor[] a = this.f41080a.m38275a(objArr);
        if (map == null || a == null || map.size() > a.length) {
            throw new IllegalArgumentException("Outputs do not match with model outputs.");
        }
        int length = a.length;
        for (Integer num : map.keySet()) {
            if (num == null || num.intValue() < 0 || num.intValue() >= length) {
                throw new IllegalArgumentException(String.format("Invalid index of output %d (should be in range [0, %d))", new Object[]{num, Integer.valueOf(length)}));
            }
            a[num.intValue()].m38276a(map.get(num));
        }
    }

    public final void close() {
        this.f41080a.close();
        this.f41080a = null;
    }
}
