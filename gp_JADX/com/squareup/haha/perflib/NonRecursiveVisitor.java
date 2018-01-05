package com.squareup.haha.perflib;

import b.a.ab;
import com.squareup.haha.annotations.NonNull;
import java.util.ArrayDeque;
import java.util.Deque;

public class NonRecursiveVisitor implements Visitor {
    public final ab mSeen = new ab();
    public final Deque mStack = new ArrayDeque();

    protected void defaultAction(Instance instance) {
    }

    public void visitRootObj(@NonNull RootObj rootObj) {
        defaultAction(rootObj);
    }

    public void visitArrayInstance(@NonNull ArrayInstance arrayInstance) {
        defaultAction(arrayInstance);
    }

    public void visitClassInstance(@NonNull ClassInstance classInstance) {
        defaultAction(classInstance);
    }

    public void visitClassObj(@NonNull ClassObj classObj) {
        defaultAction(classObj);
    }

    public void visitLater(Instance instance, @NonNull Instance instance2) {
        this.mStack.push(instance2);
    }

    public void doVisit(Iterable iterable) {
        for (Instance instance : iterable) {
            Instance instance2;
            if (instance2 instanceof RootObj) {
                instance2.accept(this);
            } else {
                visitLater(null, instance2);
            }
        }
        while (!this.mStack.isEmpty()) {
            instance2 = (Instance) this.mStack.pop();
            if (this.mSeen.e(instance2.getId())) {
                instance2.accept(this);
            }
        }
    }
}
