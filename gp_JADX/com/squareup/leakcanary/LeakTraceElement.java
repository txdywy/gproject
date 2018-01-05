package com.squareup.leakcanary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class LeakTraceElement implements Serializable {
    public final String className;
    public final Exclusion exclusion;
    public final String extra;
    public final List fields;
    public final Holder holder;
    public final String referenceName;
    public final Type type;

    public enum Holder {
        OBJECT,
        CLASS,
        THREAD,
        ARRAY
    }

    public enum Type {
        INSTANCE_FIELD,
        STATIC_FIELD,
        LOCAL,
        ARRAY_ENTRY
    }

    LeakTraceElement(String str, Type type, Holder holder, String str2, String str3, Exclusion exclusion, List list) {
        this.referenceName = str;
        this.type = type;
        this.holder = holder;
        this.className = str2;
        this.extra = str3;
        this.exclusion = exclusion;
        this.fields = Collections.unmodifiableList(new ArrayList(list));
    }

    public final String toString() {
        String valueOf;
        String toLowerCase;
        Object obj = "";
        if (this.type == Type.STATIC_FIELD) {
            obj = String.valueOf(obj).concat("static ");
        }
        if (this.holder == Holder.ARRAY || this.holder == Holder.THREAD) {
            valueOf = String.valueOf(obj);
            toLowerCase = this.holder.name().toLowerCase(Locale.US);
            obj = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(toLowerCase).length()).append(valueOf).append(toLowerCase).append(" ").toString();
        }
        toLowerCase = String.valueOf(obj);
        valueOf = String.valueOf(this.className);
        obj = valueOf.length() != 0 ? toLowerCase.concat(valueOf) : new String(toLowerCase);
        if (this.referenceName != null) {
            valueOf = String.valueOf(obj);
            toLowerCase = this.referenceName;
            valueOf = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(toLowerCase).length()).append(valueOf).append(".").append(toLowerCase).toString();
        } else {
            valueOf = String.valueOf(obj).concat(" instance");
        }
        if (this.extra != null) {
            valueOf = String.valueOf(valueOf);
            toLowerCase = this.extra;
            valueOf = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(toLowerCase).length()).append(valueOf).append(" ").append(toLowerCase).toString();
        }
        if (this.exclusion == null) {
            return valueOf;
        }
        valueOf = String.valueOf(valueOf);
        toLowerCase = this.exclusion.matching;
        return new StringBuilder((String.valueOf(valueOf).length() + 22) + String.valueOf(toLowerCase).length()).append(valueOf).append(" , matching exclusion ").append(toLowerCase).toString();
    }

    public final String toDetailedString() {
        Object concat;
        String str = "* ";
        if (this.holder == Holder.ARRAY) {
            concat = String.valueOf(str).concat("Array of");
        } else if (this.holder == Holder.CLASS) {
            concat = String.valueOf(str).concat("Class");
        } else {
            concat = String.valueOf(str).concat("Instance of");
        }
        str = String.valueOf(concat);
        String str2 = this.className;
        str = new StringBuilder((String.valueOf(str).length() + 2) + String.valueOf(str2).length()).append(str).append(" ").append(str2).append("\n").toString();
        str2 = str;
        for (String str3 : this.fields) {
            str2 = String.valueOf(str2);
            str2 = new StringBuilder((String.valueOf(str2).length() + 5) + String.valueOf(str3).length()).append(str2).append("|   ").append(str3).append("\n").toString();
        }
        return str2;
    }
}
