package com.squareup.leakcanary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LeakTrace implements Serializable {
    public final List elements;

    LeakTrace(List list) {
        this.elements = Collections.unmodifiableList(new ArrayList(list));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.elements.size(); i++) {
            LeakTraceElement leakTraceElement = (LeakTraceElement) this.elements.get(i);
            stringBuilder.append("* ");
            if (i == 0) {
                stringBuilder.append("GC ROOT ");
            } else if (i == this.elements.size() - 1) {
                stringBuilder.append("leaks ");
            } else {
                stringBuilder.append("references ");
            }
            stringBuilder.append(leakTraceElement).append("\n");
        }
        return stringBuilder.toString();
    }

    public final String toDetailedString() {
        String str = "";
        for (LeakTraceElement leakTraceElement : this.elements) {
            str = String.valueOf(str);
            String valueOf = String.valueOf(leakTraceElement.toDetailedString());
            str = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        }
        return str;
    }
}
