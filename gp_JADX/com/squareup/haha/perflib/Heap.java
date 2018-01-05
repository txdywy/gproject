package com.squareup.haha.perflib;

import b.a.af;
import b.a.ao;
import b.a.v;
import com.google.common.p415b.ac;
import com.google.common.p415b.bt;
import com.squareup.haha.annotations.NonNull;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

public class Heap {
    @NonNull
    public af mClassesById = new af();
    @NonNull
    public bt mClassesByName = new ac();
    @NonNull
    public af mFrames = new af();
    public final int mId;
    public final af mInstances = new af();
    @NonNull
    public final String mName;
    @NonNull
    public ArrayList mRoots = new ArrayList();
    public Snapshot mSnapshot;
    @NonNull
    public v mThreads = new v();
    @NonNull
    public v mTraces = new v();

    public Heap(int i, @NonNull String str) {
        this.mId = i;
        this.mName = str;
    }

    public int getId() {
        return this.mId;
    }

    @NonNull
    public String getName() {
        return this.mName;
    }

    public final void addStackFrame(@NonNull StackFrame stackFrame) {
        this.mFrames.a(stackFrame.mId, stackFrame);
    }

    public final StackFrame getStackFrame(long j) {
        return (StackFrame) this.mFrames.e(j);
    }

    public final void addStackTrace(@NonNull StackTrace stackTrace) {
        this.mTraces.a(stackTrace.mSerialNumber, stackTrace);
    }

    public final StackTrace getStackTrace(int i) {
        return (StackTrace) this.mTraces.h(i);
    }

    public final StackTrace getStackTraceAtDepth(int i, int i2) {
        StackTrace stackTrace = (StackTrace) this.mTraces.h(i);
        if (stackTrace != null) {
            return stackTrace.fromDepth(i2);
        }
        return stackTrace;
    }

    public final void addRoot(@NonNull RootObj rootObj) {
        rootObj.mIndex = this.mRoots.size();
        this.mRoots.add(rootObj);
    }

    public final void addThread(ThreadObj threadObj, int i) {
        this.mThreads.a(i, threadObj);
    }

    public final ThreadObj getThread(int i) {
        return (ThreadObj) this.mThreads.h(i);
    }

    public final void addInstance(long j, Instance instance) {
        this.mInstances.a(j, instance);
    }

    public final Instance getInstance(long j) {
        return (Instance) this.mInstances.e(j);
    }

    public final void addClass(long j, @NonNull ClassObj classObj) {
        this.mClassesById.a(j, classObj);
        this.mClassesByName.mo5850a(classObj.mClassName, classObj);
    }

    public final ClassObj getClass(long j) {
        return (ClassObj) this.mClassesById.e(j);
    }

    public final ClassObj getClass(String str) {
        Collection b = this.mClassesByName.mo5855b(str);
        if (b.size() == 1) {
            return (ClassObj) b.iterator().next();
        }
        return null;
    }

    public final Collection getClasses(String str) {
        return this.mClassesByName.mo5855b(str);
    }

    public final void dumpInstanceCounts() {
        for (Object obj : this.mClassesById.b()) {
            ClassObj classObj = (ClassObj) obj;
            int instanceCount = classObj.getInstanceCount();
            if (instanceCount > 0) {
                PrintStream printStream = System.out;
                String valueOf = String.valueOf(classObj);
                printStream.println(new StringBuilder(String.valueOf(valueOf).length() + 13).append(valueOf).append(": ").append(instanceCount).toString());
            }
        }
    }

    public final void dumpSubclasses() {
        for (Object obj : this.mClassesById.b()) {
            ClassObj classObj = (ClassObj) obj;
            if (classObj.mSubclasses.size() > 0) {
                System.out.println(classObj);
                classObj.dumpSubclasses();
            }
        }
    }

    public final void dumpSizes() {
        for (Object obj : this.mClassesById.b()) {
            ClassObj classObj = (ClassObj) obj;
            int i = 0;
            for (Instance compositeSize : classObj.getHeapInstances(getId())) {
                i = compositeSize.getCompositeSize() + i;
            }
            if (i > 0) {
                PrintStream printStream = System.out;
                String valueOf = String.valueOf(classObj);
                printStream.println(new StringBuilder(String.valueOf(valueOf).length() + 41).append(valueOf).append(": base ").append(classObj.getSize()).append(", composite ").append(i).toString());
            }
        }
    }

    @NonNull
    public Collection getClasses() {
        return this.mClassesByName.mo5853k();
    }

    @NonNull
    public Collection getInstances() {
        final Collection arrayList = new ArrayList(this.mInstances.size());
        this.mInstances.a(new ao(this) {
            public boolean execute(Instance instance) {
                arrayList.add(instance);
                return true;
            }
        });
        return arrayList;
    }

    public int getInstancesCount() {
        return this.mInstances.size();
    }
}
