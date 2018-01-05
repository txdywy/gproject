package com.squareup.haha.perflib;

import com.google.common.p415b.at;
import com.squareup.haha.annotations.NonNull;
import com.squareup.haha.annotations.Nullable;
import com.squareup.haha.perflib.io.HprofBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Instance {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public long mClassId;
    public int mDistanceToGcRoot = Integer.MAX_VALUE;
    public final ArrayList mHardReferences = new ArrayList();
    public Heap mHeap;
    public final long mId;
    @Nullable
    public Instance mImmediateDominator;
    public Instance mNextInstanceToGcRoot = null;
    public boolean mReferencesAdded = false;
    public long[] mRetainedSizes;
    public int mSize;
    public ArrayList mSoftReferences = null;
    @NonNull
    public final StackTrace mStack;
    public int mTopologicalOrder;

    /* synthetic */ class C75521 {
        public static final /* synthetic */ int[] $SwitchMap$com$squareup$haha$perflib$Type = new int[Type.values().length];

        static {
            try {
                $SwitchMap$com$squareup$haha$perflib$Type[Type.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$Type[Type.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$Type[Type.CHAR.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$Type[Type.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$Type[Type.DOUBLE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$Type[Type.BYTE.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$Type[Type.SHORT.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$Type[Type.INT.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$Type[Type.LONG.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
        }
    }

    public class CompositeSizeVisitor extends NonRecursiveVisitor {
        public int mSize = 0;

        protected void defaultAction(Instance instance) {
            this.mSize += instance.getSize();
        }

        public int getCompositeSize() {
            return this.mSize;
        }
    }

    Instance(long j, @NonNull StackTrace stackTrace) {
        this.mId = j;
        this.mStack = stackTrace;
    }

    public abstract void accept(Visitor visitor);

    public long getId() {
        return this.mId;
    }

    public long getUniqueId() {
        return getId() & this.mHeap.mSnapshot.getIdSizeMask();
    }

    public void setClassId(long j) {
        this.mClassId = j;
    }

    public ClassObj getClassObj() {
        return this.mHeap.mSnapshot.findClass(this.mClassId);
    }

    public final int getCompositeSize() {
        NonRecursiveVisitor compositeSizeVisitor = new CompositeSizeVisitor();
        compositeSizeVisitor.doVisit(at.m31736a((Object) this));
        return compositeSizeVisitor.getCompositeSize();
    }

    public int getSize() {
        return this.mSize;
    }

    public void setSize(int i) {
        this.mSize = i;
    }

    public void setHeap(Heap heap) {
        this.mHeap = heap;
    }

    public Heap getHeap() {
        return this.mHeap;
    }

    public int getTopologicalOrder() {
        return this.mTopologicalOrder;
    }

    public void setTopologicalOrder(int i) {
        this.mTopologicalOrder = i;
    }

    @Nullable
    public Instance getImmediateDominator() {
        return this.mImmediateDominator;
    }

    public void setImmediateDominator(@NonNull Instance instance) {
        this.mImmediateDominator = instance;
    }

    public int getDistanceToGcRoot() {
        return this.mDistanceToGcRoot;
    }

    public Instance getNextInstanceToGcRoot() {
        return this.mNextInstanceToGcRoot;
    }

    public void setDistanceToGcRoot(int i) {
        this.mDistanceToGcRoot = i;
    }

    public void setNextInstanceToGcRoot(Instance instance) {
        this.mNextInstanceToGcRoot = instance;
    }

    public void resetRetainedSize() {
        List list = this.mHeap.mSnapshot.mHeaps;
        if (this.mRetainedSizes == null) {
            this.mRetainedSizes = new long[list.size()];
        } else {
            Arrays.fill(this.mRetainedSizes, 0);
        }
        this.mRetainedSizes[list.indexOf(this.mHeap)] = (long) getSize();
    }

    public void addRetainedSize(int i, long j) {
        long[] jArr = this.mRetainedSizes;
        jArr[i] = jArr[i] + j;
    }

    public long getRetainedSize(int i) {
        return this.mRetainedSizes[i];
    }

    public long getTotalRetainedSize() {
        long j = 0;
        if (this.mRetainedSizes != null) {
            long[] jArr = this.mRetainedSizes;
            int i = 0;
            while (i < jArr.length) {
                long j2 = jArr[i] + j;
                i++;
                j = j2;
            }
        }
        return j;
    }

    public void addReference(@Nullable Field field, @NonNull Instance instance) {
        if (instance.getIsSoftReference() && field != null && field.getName().equals("referent")) {
            if (this.mSoftReferences == null) {
                this.mSoftReferences = new ArrayList();
            }
            this.mSoftReferences.add(instance);
            return;
        }
        this.mHardReferences.add(instance);
    }

    @NonNull
    public ArrayList getHardReferences() {
        return this.mHardReferences;
    }

    @Nullable
    public ArrayList getSoftReferences() {
        return this.mSoftReferences;
    }

    public boolean getIsSoftReference() {
        return false;
    }

    @Nullable
    protected Object readValue(@NonNull Type type) {
        switch (type.ordinal()) {
            case 0:
                return this.mHeap.mSnapshot.findInstance(readId());
            case 1:
                return Boolean.valueOf(getBuffer().readByte() != (byte) 0);
            case 2:
                return Character.valueOf(getBuffer().readChar());
            case 3:
                return Float.valueOf(getBuffer().readFloat());
            case 4:
                return Double.valueOf(getBuffer().readDouble());
            case 5:
                return Byte.valueOf(getBuffer().readByte());
            case 6:
                return Short.valueOf(getBuffer().readShort());
            case 7:
                return Integer.valueOf(getBuffer().readInt());
            case 8:
                return Long.valueOf(getBuffer().readLong());
            default:
                return null;
        }
    }

    protected long readId() {
        switch (this.mHeap.mSnapshot.getTypeSize(Type.OBJECT)) {
            case 1:
                return (long) getBuffer().readByte();
            case 2:
                return (long) getBuffer().readShort();
            case 4:
                return (long) getBuffer().readInt();
            case 8:
                return getBuffer().readLong();
            default:
                return 0;
        }
    }

    protected int readUnsignedByte() {
        return getBuffer().readByte() & HprofParser.ROOT_UNKNOWN;
    }

    protected int readUnsignedShort() {
        return getBuffer().readShort() & 65535;
    }

    protected HprofBuffer getBuffer() {
        return this.mHeap.mSnapshot.mBuffer;
    }
}
