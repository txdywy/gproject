package com.squareup.haha.perflib.analysis;

import com.squareup.haha.annotations.NonNull;
import com.squareup.haha.perflib.Instance;
import com.squareup.haha.perflib.NonRecursiveVisitor;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ShortestDistanceVisitor extends NonRecursiveVisitor {
    public Instance mPreviousInstance = null;
    public PriorityQueue mPriorityQueue = new PriorityQueue(MemoryMappedFileBuffer.DEFAULT_PADDING, new C75541(this));
    public int mVisitDistance = 0;

    class C75541 implements Comparator {
        C75541(ShortestDistanceVisitor shortestDistanceVisitor) {
        }

        public int compare(Instance instance, Instance instance2) {
            return instance.getDistanceToGcRoot() - instance2.getDistanceToGcRoot();
        }
    }

    public void visitLater(Instance instance, @NonNull Instance instance2) {
        if (this.mVisitDistance >= instance2.getDistanceToGcRoot()) {
            return;
        }
        if (instance == null || instance2.getSoftReferences() == null || !instance2.getSoftReferences().contains(instance) || instance2.getIsSoftReference()) {
            instance2.setDistanceToGcRoot(this.mVisitDistance);
            instance2.setNextInstanceToGcRoot(this.mPreviousInstance);
            this.mPriorityQueue.add(instance2);
        }
    }

    public void doVisit(Iterable iterable) {
        Instance instance;
        for (Instance instance2 : iterable) {
            instance2.accept(this);
        }
        while (!this.mPriorityQueue.isEmpty()) {
            instance2 = (Instance) this.mPriorityQueue.poll();
            this.mVisitDistance = instance2.getDistanceToGcRoot() + 1;
            this.mPreviousInstance = instance2;
            instance2.accept(this);
        }
    }
}
