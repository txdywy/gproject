package com.squareup.haha.perflib;

import b.a.v;
import com.squareup.haha.annotations.NonNull;
import com.squareup.haha.annotations.Nullable;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

public class ClassObj extends Instance implements Comparable {
    public long mClassLoaderId;
    @NonNull
    public final String mClassName;
    public Field[] mFields;
    @NonNull
    public v mHeapData = new v();
    public int mInstanceSize;
    public boolean mIsSoftReference = false;
    public Field[] mStaticFields;
    public final long mStaticFieldsOffset;
    @NonNull
    public Set mSubclasses = new HashSet();
    public long mSuperClassId;

    public class HeapData {
        public List mInstances = new ArrayList();
        public int mShallowSize = 0;
    }

    public ClassObj(long j, @NonNull StackTrace stackTrace, @NonNull String str, long j2) {
        super(j, stackTrace);
        this.mClassName = str;
        this.mStaticFieldsOffset = j2;
    }

    public final void addSubclass(ClassObj classObj) {
        this.mSubclasses.add(classObj);
    }

    @NonNull
    public final Set getSubclasses() {
        return this.mSubclasses;
    }

    public final void dumpSubclasses() {
        for (ClassObj classObj : this.mSubclasses) {
            PrintStream printStream = System.out;
            String str = "     ";
            String valueOf = String.valueOf(classObj.mClassName);
            printStream.println(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    @NonNull
    public final String toString() {
        return this.mClassName.replace('/', '.');
    }

    public final void addInstance(int i, @NonNull Instance instance) {
        if (instance instanceof ClassInstance) {
            instance.setSize(this.mInstanceSize);
        }
        HeapData heapData = (HeapData) this.mHeapData.h(i);
        if (heapData == null) {
            heapData = new HeapData();
            this.mHeapData.a(i, heapData);
        }
        heapData.mInstances.add(instance);
        heapData.mShallowSize += instance.getSize();
    }

    public final void setSuperClassId(long j) {
        this.mSuperClassId = j;
    }

    public final void setClassLoaderId(long j) {
        this.mClassLoaderId = j;
    }

    public int getAllFieldsCount() {
        int i = 0;
        while (this != null) {
            i += getFields().length;
            this = getSuperClassObj();
        }
        return i;
    }

    public Field[] getFields() {
        return this.mFields;
    }

    public void setFields(@NonNull Field[] fieldArr) {
        this.mFields = fieldArr;
    }

    public void setStaticFields(@NonNull Field[] fieldArr) {
        this.mStaticFields = fieldArr;
    }

    public void setInstanceSize(int i) {
        this.mInstanceSize = i;
    }

    public int getInstanceSize() {
        return this.mInstanceSize;
    }

    public int getShallowSize(int i) {
        return ((HeapData) this.mHeapData.h(i)) == null ? 0 : ((HeapData) this.mHeapData.h(i)).mShallowSize;
    }

    public void setIsSoftReference() {
        this.mIsSoftReference = true;
    }

    public boolean getIsSoftReference() {
        return this.mIsSoftReference;
    }

    @NonNull
    public Map getStaticFieldValues() {
        Map hashMap = new HashMap();
        getBuffer().setPosition(this.mStaticFieldsOffset);
        int readUnsignedShort = readUnsignedShort();
        for (int i = 0; i < readUnsignedShort; i++) {
            Field field = this.mStaticFields[i];
            readId();
            readUnsignedByte();
            hashMap.put(field, readValue(field.getType()));
        }
        return hashMap;
    }

    public final void dump() {
        while (true) {
            PrintStream printStream = System.out;
            String str = "+----------  ClassObj dump for: ";
            String valueOf = String.valueOf(this.mClassName);
            printStream.println(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            System.out.println("+-----  Static fields");
            Map staticFieldValues = getStaticFieldValues();
            for (Field field : staticFieldValues.keySet()) {
                PrintStream printStream2 = System.out;
                String name = field.getName();
                String valueOf2 = String.valueOf(field.getType());
                valueOf = String.valueOf(staticFieldValues.get(field));
                printStream2.println(new StringBuilder(((String.valueOf(name).length() + 5) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf).length()).append(name).append(": ").append(valueOf2).append(" = ").append(valueOf).toString());
            }
            System.out.println("+-----  Instance fields");
            for (Field field2 : this.mFields) {
                PrintStream printStream3 = System.out;
                valueOf2 = field2.getName();
                String valueOf3 = String.valueOf(field2.getType());
                printStream3.println(new StringBuilder((String.valueOf(valueOf2).length() + 2) + String.valueOf(valueOf3).length()).append(valueOf2).append(": ").append(valueOf3).toString());
            }
            if (getSuperClassObj() != null) {
                this = getSuperClassObj();
            } else {
                return;
            }
        }
    }

    @NonNull
    public final String getClassName() {
        return this.mClassName;
    }

    public final void accept(@NonNull Visitor visitor) {
        visitor.visitClassObj(this);
        for (Entry entry : getStaticFieldValues().entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Instance) {
                if (!this.mReferencesAdded) {
                    ((Instance) value).addReference((Field) entry.getKey(), this);
                }
                visitor.visitLater(this, (Instance) value);
            }
        }
        this.mReferencesAdded = true;
    }

    public final int compareTo(@NonNull ClassObj classObj) {
        if (getId() == classObj.getId()) {
            return 0;
        }
        int compareTo = this.mClassName.compareTo(classObj.mClassName);
        if (compareTo == 0) {
            return getId() - classObj.getId() > 0 ? 1 : -1;
        } else {
            return compareTo;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ClassObj) && compareTo((ClassObj) obj) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.mClassName.hashCode();
    }

    Object getStaticField(Type type, String str) {
        return getStaticFieldValues().get(new Field(type, str));
    }

    public ClassObj getSuperClassObj() {
        return this.mHeap.mSnapshot.findClass(this.mSuperClassId);
    }

    @Nullable
    public Instance getClassLoader() {
        return this.mHeap.mSnapshot.findInstance(this.mClassLoaderId);
    }

    public List getInstancesList() {
        List arrayList = new ArrayList(getInstanceCount());
        for (int heapInstances : this.mHeapData.c()) {
            arrayList.addAll(getHeapInstances(heapInstances));
        }
        return arrayList;
    }

    @NonNull
    public List getHeapInstances(int i) {
        HeapData heapData = (HeapData) this.mHeapData.h(i);
        return heapData == null ? new ArrayList(0) : heapData.mInstances;
    }

    public int getHeapInstancesCount(int i) {
        HeapData heapData = (HeapData) this.mHeapData.h(i);
        return heapData == null ? 0 : heapData.mInstances.size();
    }

    public int getInstanceCount() {
        int i = 0;
        for (Object obj : this.mHeapData.b()) {
            i += ((HeapData) obj).mInstances.size();
        }
        return i;
    }

    public int getShallowSize() {
        int i = 0;
        for (Object obj : this.mHeapData.b()) {
            i += ((HeapData) obj).mShallowSize;
        }
        return i;
    }

    @NonNull
    public static String getReferenceClassName() {
        return "java.lang.ref.Reference";
    }

    @NonNull
    public List getDescendantClasses() {
        List arrayList = new ArrayList();
        Stack stack = new Stack();
        stack.push(this);
        while (!stack.isEmpty()) {
            ClassObj classObj = (ClassObj) stack.pop();
            arrayList.add(classObj);
            for (ClassObj classObj2 : classObj2.getSubclasses()) {
                stack.push(classObj2);
            }
        }
        return arrayList;
    }
}
