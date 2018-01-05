package com.squareup.haha.perflib.analysis;

import b.a.ab;
import com.google.common.p415b.at;
import com.google.common.p415b.bh;
import com.squareup.haha.annotations.NonNull;
import com.squareup.haha.perflib.Instance;
import com.squareup.haha.perflib.NonRecursiveVisitor;
import com.squareup.haha.perflib.Snapshot;
import java.util.ArrayList;
import java.util.List;

public class TopologicalSort {

    class TopologicalSortVisitor extends NonRecursiveVisitor {
        public final List mPostorder;
        public final ab mVisited;

        private TopologicalSortVisitor() {
            this.mVisited = new ab();
            this.mPostorder = new ArrayList();
        }

        public void visitLater(Instance instance, @NonNull Instance instance2) {
            if (!this.mSeen.a(instance2.getId())) {
                this.mStack.push(instance2);
            }
        }

        public void doVisit(Iterable iterable) {
            for (Instance accept : iterable) {
                Instance accept2;
                accept2.accept(this);
            }
            while (!this.mStack.isEmpty()) {
                accept2 = (Instance) this.mStack.peek();
                if (this.mSeen.e(accept2.getId())) {
                    accept2.accept(this);
                } else {
                    this.mStack.pop();
                    if (this.mVisited.e(accept2.getId())) {
                        this.mPostorder.add(accept2);
                    }
                }
            }
        }

        at getOrderedInstances() {
            return at.m31737a(bh.m31761a(this.mPostorder));
        }
    }

    @NonNull
    public static at compute(@NonNull Iterable iterable) {
        NonRecursiveVisitor topologicalSortVisitor = new TopologicalSortVisitor();
        topologicalSortVisitor.doVisit(iterable);
        at orderedInstances = topologicalSortVisitor.getOrderedInstances();
        Snapshot.SENTINEL_ROOT.setTopologicalOrder(0);
        at atVar = orderedInstances;
        int size = atVar.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Object obj = atVar.get(i);
            i++;
            i2++;
            ((Instance) obj).setTopologicalOrder(i2);
        }
        return orderedInstances;
    }
}
