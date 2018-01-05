package com.squareup.haha.perflib;

import com.squareup.haha.annotations.NonNull;
import com.squareup.haha.annotations.Nullable;

public class RootObj extends Instance {
    public static final String UNDEFINED_CLASS_NAME = "no class defined!!";
    public int mIndex;
    public int mThread;
    public RootType mType;

    public RootObj(RootType rootType) {
        this(rootType, 0, 0, null);
    }

    public RootObj(RootType rootType, long j) {
        this(rootType, j, 0, null);
    }

    public RootObj(RootType rootType, long j, int i, StackTrace stackTrace) {
        super(j, stackTrace);
        this.mType = RootType.UNKNOWN;
        this.mType = rootType;
        this.mThread = i;
    }

    public final String getClassName(@NonNull Snapshot snapshot) {
        ClassObj findClass;
        if (this.mType == RootType.SYSTEM_CLASS) {
            findClass = snapshot.findClass(this.mId);
        } else {
            findClass = snapshot.findInstance(this.mId).getClassObj();
        }
        if (findClass == null) {
            return UNDEFINED_CLASS_NAME;
        }
        return findClass.mClassName;
    }

    public final void accept(Visitor visitor) {
        visitor.visitRootObj(this);
        Instance referredInstance = getReferredInstance();
        if (referredInstance != null) {
            visitor.visitLater(null, referredInstance);
        }
    }

    public final String toString() {
        return String.format("%s@0x%08x", new Object[]{this.mType.getName(), Long.valueOf(this.mId)});
    }

    @Nullable
    public Instance getReferredInstance() {
        if (this.mType == RootType.SYSTEM_CLASS) {
            return this.mHeap.mSnapshot.findClass(this.mId);
        }
        return this.mHeap.mSnapshot.findInstance(this.mId);
    }

    public RootType getRootType() {
        return this.mType;
    }
}
