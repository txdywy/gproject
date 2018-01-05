package com.squareup.leakcanary;

import com.squareup.haha.perflib.Instance;
import com.squareup.leakcanary.LeakTraceElement.Type;

final class LeakNode {
    public final Exclusion exclusion;
    public final Instance instance;
    public final LeakNode parent;
    public final String referenceName;
    public final Type referenceType;

    LeakNode(Exclusion exclusion, Instance instance, LeakNode leakNode, String str, Type type) {
        this.exclusion = exclusion;
        this.instance = instance;
        this.parent = leakNode;
        this.referenceName = str;
        this.referenceType = type;
    }
}
