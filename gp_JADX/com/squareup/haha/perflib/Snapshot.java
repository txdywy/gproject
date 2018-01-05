package com.squareup.haha.perflib;

import b.a.q;
import com.google.common.p415b.at;
import com.squareup.haha.annotations.NonNull;
import com.squareup.haha.annotations.Nullable;
import com.squareup.haha.perflib.analysis.Dominators;
import com.squareup.haha.perflib.analysis.ShortestDistanceVisitor;
import com.squareup.haha.perflib.analysis.TopologicalSort;
import com.squareup.haha.perflib.io.HprofBuffer;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Snapshot {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DEFAULT_HEAP_ID = 0;
    public static final String JAVA_LANG_CLASS = "java.lang.Class";
    public static final Instance SENTINEL_ROOT = new RootObj(RootType.UNKNOWN);
    @NonNull
    public final HprofBuffer mBuffer;
    @NonNull
    public Heap mCurrentHeap;
    public Dominators mDominators;
    @NonNull
    public ArrayList mHeaps = new ArrayList();
    public long mIdSizeMask = 4294967295L;
    public q mReferenceClasses = new q();
    public at mTopSort;
    public int[] mTypeSizes;

    public Snapshot(@NonNull HprofBuffer hprofBuffer) {
        this.mBuffer = hprofBuffer;
        setToDefaultHeap();
    }

    @NonNull
    public Heap setToDefaultHeap() {
        return setHeapTo(0, "default");
    }

    @NonNull
    public Heap setHeapTo(int i, @NonNull String str) {
        Heap heap = getHeap(i);
        if (heap == null) {
            heap = new Heap(i, str);
            heap.mSnapshot = this;
            this.mHeaps.add(heap);
        }
        this.mCurrentHeap = heap;
        return this.mCurrentHeap;
    }

    public int getHeapIndex(@NonNull Heap heap) {
        return this.mHeaps.indexOf(heap);
    }

    @Nullable
    public Heap getHeap(int i) {
        for (int i2 = 0; i2 < this.mHeaps.size(); i2++) {
            if (((Heap) this.mHeaps.get(i2)).getId() == i) {
                return (Heap) this.mHeaps.get(i2);
            }
        }
        return null;
    }

    @Nullable
    public Heap getHeap(@NonNull String str) {
        for (int i = 0; i < this.mHeaps.size(); i++) {
            if (str.equals(((Heap) this.mHeaps.get(i)).getName())) {
                return (Heap) this.mHeaps.get(i);
            }
        }
        return null;
    }

    @NonNull
    public Collection getHeaps() {
        return this.mHeaps;
    }

    @NonNull
    public Collection getGCRoots() {
        return ((Heap) this.mHeaps.get(0)).mRoots;
    }

    public final void addStackFrame(@NonNull StackFrame stackFrame) {
        this.mCurrentHeap.addStackFrame(stackFrame);
    }

    public final StackFrame getStackFrame(long j) {
        return this.mCurrentHeap.getStackFrame(j);
    }

    public final void addStackTrace(@NonNull StackTrace stackTrace) {
        this.mCurrentHeap.addStackTrace(stackTrace);
    }

    public final StackTrace getStackTrace(int i) {
        return this.mCurrentHeap.getStackTrace(i);
    }

    public final StackTrace getStackTraceAtDepth(int i, int i2) {
        return this.mCurrentHeap.getStackTraceAtDepth(i, i2);
    }

    public final void addRoot(@NonNull RootObj rootObj) {
        this.mCurrentHeap.addRoot(rootObj);
        rootObj.setHeap(this.mCurrentHeap);
    }

    public final void addThread(ThreadObj threadObj, int i) {
        this.mCurrentHeap.addThread(threadObj, i);
    }

    public final ThreadObj getThread(int i) {
        return this.mCurrentHeap.getThread(i);
    }

    public final void setIdSize(int i) {
        int i2 = 0;
        int i3 = -1;
        for (Type typeId : Type.values()) {
            i3 = Math.max(typeId.getTypeId(), i3);
        }
        this.mTypeSizes = new int[(i3 + 1)];
        Arrays.fill(this.mTypeSizes, -1);
        while (i2 < Type.values().length) {
            this.mTypeSizes[Type.values()[i2].getTypeId()] = Type.values()[i2].getSize();
            i2++;
        }
        this.mTypeSizes[Type.OBJECT.getTypeId()] = i;
        this.mIdSizeMask = -1 >>> ((8 - i) * 8);
    }

    public final int getTypeSize(Type type) {
        return this.mTypeSizes[type.getTypeId()];
    }

    public final long getIdSizeMask() {
        return this.mIdSizeMask;
    }

    public final void addInstance(long j, @NonNull Instance instance) {
        this.mCurrentHeap.addInstance(j, instance);
        instance.setHeap(this.mCurrentHeap);
    }

    public final void addClass(long j, @NonNull ClassObj classObj) {
        this.mCurrentHeap.addClass(j, classObj);
        classObj.setHeap(this.mCurrentHeap);
    }

    @Nullable
    public final Instance findInstance(long j) {
        for (int i = 0; i < this.mHeaps.size(); i++) {
            Instance instance = ((Heap) this.mHeaps.get(i)).getInstance(j);
            if (instance != null) {
                return instance;
            }
        }
        return findClass(j);
    }

    @Nullable
    public final ClassObj findClass(long j) {
        for (int i = 0; i < this.mHeaps.size(); i++) {
            ClassObj classObj = ((Heap) this.mHeaps.get(i)).getClass(j);
            if (classObj != null) {
                return classObj;
            }
        }
        return null;
    }

    @Nullable
    public final ClassObj findClass(String str) {
        for (int i = 0; i < this.mHeaps.size(); i++) {
            ClassObj classObj = ((Heap) this.mHeaps.get(i)).getClass(str);
            if (classObj != null) {
                return classObj;
            }
        }
        return null;
    }

    @NonNull
    public final Collection findClasses(String str) {
        Collection arrayList = new ArrayList();
        for (int i = 0; i < this.mHeaps.size(); i++) {
            arrayList.addAll(((Heap) this.mHeaps.get(i)).getClasses(str));
        }
        return arrayList;
    }

    public void resolveClasses() {
        ClassObj findClass = findClass(JAVA_LANG_CLASS);
        int instanceSize = findClass != null ? findClass.getInstanceSize() : 0;
        ArrayList arrayList = this.mHeaps;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Heap heap = (Heap) arrayList.get(i);
            for (ClassObj classObj : heap.getClasses()) {
                ClassObj superClassObj = classObj.getSuperClassObj();
                if (superClassObj != null) {
                    superClassObj.addSubclass(classObj);
                }
                int i3 = instanceSize;
                for (Field type : classObj.mStaticFields) {
                    i3 += getTypeSize(type.getType());
                }
                classObj.setSize(i3);
            }
            for (Instance instance : heap.getInstances()) {
                ClassObj classObj2 = instance.getClassObj();
                if (classObj2 != null) {
                    classObj2.addInstance(heap.getId(), instance);
                }
            }
            i = i2;
        }
    }

    public void resolveReferences() {
        for (ClassObj classObj : findAllDescendantClasses(ClassObj.getReferenceClassName())) {
            classObj.setIsSoftReference();
            this.mReferenceClasses.add(classObj);
        }
    }

    @NonNull
    public List findAllDescendantClasses(@NonNull String str) {
        Collection<ClassObj> findClasses = findClasses(str);
        List arrayList = new ArrayList();
        for (ClassObj descendantClasses : findClasses) {
            arrayList.addAll(descendantClasses.getDescendantClasses());
        }
        return arrayList;
    }

    public void computeDominators() {
        if (this.mDominators == null) {
            this.mTopSort = TopologicalSort.compute(getGCRoots());
            this.mDominators = new Dominators(this, this.mTopSort);
            this.mDominators.computeRetainedSizes();
            new ShortestDistanceVisitor().doVisit(getGCRoots());
        }
    }

    @NonNull
    public List getReachableInstances() {
        List arrayList = new ArrayList(this.mTopSort.size());
        at atVar = this.mTopSort;
        int size = atVar.size();
        int i = 0;
        while (i < size) {
            Object obj = atVar.get(i);
            i++;
            Instance instance = (Instance) obj;
            if (instance.getImmediateDominator() != null) {
                arrayList.add(instance);
            }
        }
        return arrayList;
    }

    public at getTopologicalOrdering() {
        return this.mTopSort;
    }

    public final void dumpInstanceCounts() {
        ArrayList arrayList = this.mHeaps;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Heap heap = (Heap) arrayList.get(i);
            PrintStream printStream = System.out;
            String str = "+------------------ instance counts for heap: ";
            String valueOf = String.valueOf(heap.getName());
            printStream.println(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            heap.dumpInstanceCounts();
            i = i2;
        }
    }

    public final void dumpSizes() {
        ArrayList arrayList = this.mHeaps;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Heap heap = (Heap) arrayList.get(i);
            PrintStream printStream = System.out;
            String str = "+------------------ sizes for heap: ";
            String valueOf = String.valueOf(heap.getName());
            printStream.println(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            heap.dumpSizes();
            i = i2;
        }
    }

    public final void dumpSubclasses() {
        ArrayList arrayList = this.mHeaps;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Heap heap = (Heap) arrayList.get(i);
            PrintStream printStream = System.out;
            String str = "+------------------ subclasses for heap: ";
            String valueOf = String.valueOf(heap.getName());
            printStream.println(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            heap.dumpSubclasses();
            i = i2;
        }
    }
}
