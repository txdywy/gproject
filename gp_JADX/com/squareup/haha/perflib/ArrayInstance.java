package com.squareup.haha.perflib;

import com.squareup.haha.annotations.NonNull;
import com.squareup.haha.perflib.io.HprofBuffer;
import java.nio.ByteBuffer;

public class ArrayInstance extends Instance {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public final int mLength;
    public final Type mType;
    public final long mValuesOffset;

    public ArrayInstance(long j, @NonNull StackTrace stackTrace, @NonNull Type type, int i, long j2) {
        super(j, stackTrace);
        this.mType = type;
        this.mLength = i;
        this.mValuesOffset = j2;
    }

    @NonNull
    public Object[] getValues() {
        Object[] objArr = new Object[this.mLength];
        getBuffer().setPosition(this.mValuesOffset);
        for (int i = 0; i < this.mLength; i++) {
            objArr[i] = readValue(this.mType);
        }
        return objArr;
    }

    @NonNull
    private byte[] asRawByteArray(int i, int i2) {
        getBuffer().setPosition(this.mValuesOffset);
        byte[] bArr = new byte[(this.mType.getSize() * i2)];
        getBuffer().readSubSequence(bArr, this.mType.getSize() * i, this.mType.getSize() * i2);
        return bArr;
    }

    @NonNull
    public char[] asCharArray(int i, int i2) {
        char[] cArr = new char[i2];
        ByteBuffer.wrap(asRawByteArray(i, i2)).order(HprofBuffer.HPROF_BYTE_ORDER).asCharBuffer().get(cArr);
        return cArr;
    }

    public final int getSize() {
        return this.mLength * this.mHeap.mSnapshot.getTypeSize(this.mType);
    }

    public final void accept(@NonNull Visitor visitor) {
        visitor.visitArrayInstance(this);
        if (this.mType == Type.OBJECT) {
            for (Object obj : getValues()) {
                if (obj instanceof Instance) {
                    if (!this.mReferencesAdded) {
                        ((Instance) obj).addReference(null, this);
                    }
                    visitor.visitLater(this, (Instance) obj);
                }
            }
            this.mReferencesAdded = true;
        }
    }

    public ClassObj getClassObj() {
        if (this.mType == Type.OBJECT) {
            return super.getClassObj();
        }
        return this.mHeap.mSnapshot.findClass(Type.getClassNameOfPrimitiveArray(this.mType));
    }

    public Type getArrayType() {
        return this.mType;
    }

    public final String toString() {
        String className = getClassObj().getClassName();
        if (className.endsWith("[]")) {
            className = className.substring(0, className.length() - 2);
        }
        return String.format("%s[%d]@%d (0x%x)", new Object[]{className, Integer.valueOf(this.mLength), Long.valueOf(getUniqueId()), Long.valueOf(getUniqueId())});
    }
}
