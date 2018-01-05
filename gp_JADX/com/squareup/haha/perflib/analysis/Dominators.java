package com.squareup.haha.perflib.analysis;

import com.google.common.p414a.C6937m;
import com.google.common.p415b.al;
import com.google.common.p415b.at;
import com.squareup.haha.annotations.NonNull;
import com.squareup.haha.perflib.Heap;
import com.squareup.haha.perflib.Instance;
import com.squareup.haha.perflib.RootObj;
import com.squareup.haha.perflib.Snapshot;
import java.util.Collection;

public class Dominators {
    @NonNull
    public final Snapshot mSnapshot;
    @NonNull
    public final at mTopSort;

    public Dominators(@NonNull Snapshot snapshot, @NonNull at atVar) {
        this.mSnapshot = snapshot;
        this.mTopSort = atVar;
        for (RootObj referredInstance : snapshot.getGCRoots()) {
            Instance referredInstance2 = referredInstance.getReferredInstance();
            if (referredInstance2 != null) {
                referredInstance2.setImmediateDominator(Snapshot.SENTINEL_ROOT);
            }
        }
    }

    private void computeDominators() {
        Object obj = 1;
        while (obj != null) {
            int i = 0;
            obj = null;
            while (i < this.mTopSort.size()) {
                Object obj2;
                Instance instance = (Instance) this.mTopSort.get(i);
                if (instance.getImmediateDominator() != Snapshot.SENTINEL_ROOT) {
                    Instance instance2 = null;
                    int i2 = 0;
                    while (i2 < instance.getHardReferences().size()) {
                        Instance instance3 = (Instance) instance.getHardReferences().get(i2);
                        if (instance3.getImmediateDominator() == null) {
                            instance3 = instance2;
                        } else if (instance2 != null) {
                            Instance instance4 = instance3;
                            instance3 = instance2;
                            instance2 = instance4;
                            while (instance3 != instance2) {
                                if (instance3.getTopologicalOrder() < instance2.getTopologicalOrder()) {
                                    instance2 = instance2.getImmediateDominator();
                                } else {
                                    instance3 = instance3.getImmediateDominator();
                                }
                            }
                        }
                        i2++;
                        instance2 = instance3;
                    }
                    if (instance.getImmediateDominator() != instance2) {
                        instance.setImmediateDominator(instance2);
                        obj2 = 1;
                        i++;
                        obj = obj2;
                    }
                }
                obj2 = obj;
                i++;
                obj = obj2;
            }
        }
    }

    public void computeRetainedSizes() {
        for (Heap heap : this.mSnapshot.getHeaps()) {
            Collection classes = heap.getClasses();
            Collection instances = heap.getInstances();
            Iterable[] iterableArr = new Iterable[]{classes, instances};
            for (int i = 0; i < 2; i++) {
                C6937m.m31623a(iterableArr[i]);
            }
            for (Instance resetRetainedSize : new al(iterableArr)) {
                resetRetainedSize.resetRetainedSize();
            }
        }
        computeDominators();
        for (Instance resetRetainedSize2 : this.mSnapshot.getReachableInstances()) {
            int heapIndex = this.mSnapshot.getHeapIndex(resetRetainedSize2.getHeap());
            for (Instance immediateDominator = resetRetainedSize2.getImmediateDominator(); immediateDominator != Snapshot.SENTINEL_ROOT; immediateDominator = immediateDominator.getImmediateDominator()) {
                immediateDominator.addRetainedSize(heapIndex, (long) resetRetainedSize2.getSize());
            }
        }
    }
}
