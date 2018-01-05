package com.google.common.p415b;

import com.google.common.p414a.C6934i;
import java.util.Map.Entry;

abstract class C6945x implements Entry {
    C6945x() {
    }

    public abstract Object getKey();

    public abstract Object getValue();

    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        if (C6934i.m31620a(getKey(), entry.getKey()) && C6934i.m31620a(getValue(), entry.getValue())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        Object key = getKey();
        Object value = getValue();
        int hashCode = key == null ? 0 : key.hashCode();
        if (value != null) {
            i = value.hashCode();
        }
        return i ^ hashCode;
    }

    public String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        return new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append("=").append(valueOf2).toString();
    }
}
