package com.google.common.p415b;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

public abstract class aq extends ap implements SortedSet {
    protected aq() {
    }

    protected abstract SortedSet mo5900d();

    public Comparator comparator() {
        return mo5900d().comparator();
    }

    public Object first() {
        return mo5900d().first();
    }

    public SortedSet headSet(Object obj) {
        return mo5900d().headSet(obj);
    }

    public Object last() {
        return mo5900d().last();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return mo5900d().subSet(obj, obj2);
    }

    public SortedSet tailSet(Object obj) {
        return mo5900d().tailSet(obj);
    }

    protected /* synthetic */ Set mo5881c() {
        return mo5900d();
    }

    protected /* synthetic */ Collection mo5880a() {
        return mo5900d();
    }

    protected /* synthetic */ Object mo5879b() {
        return mo5900d();
    }
}
