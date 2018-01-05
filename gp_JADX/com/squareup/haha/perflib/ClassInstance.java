package com.squareup.haha.perflib;

import com.squareup.haha.annotations.NonNull;
import com.squareup.haha.annotations.Nullable;
import java.util.ArrayList;
import java.util.List;

public class ClassInstance extends Instance {
    public final long mValuesOffset;

    public class FieldValue {
        public Field mField;
        public Object mValue;

        public FieldValue(@NonNull Field field, @Nullable Object obj) {
            this.mField = field;
            this.mValue = obj;
        }

        public Field getField() {
            return this.mField;
        }

        public Object getValue() {
            return this.mValue;
        }
    }

    public ClassInstance(long j, @NonNull StackTrace stackTrace, long j2) {
        super(j, stackTrace);
        this.mValuesOffset = j2;
    }

    @NonNull
    List getFields(String str) {
        List arrayList = new ArrayList();
        for (FieldValue fieldValue : getValues()) {
            if (fieldValue.getField().getName().equals(str)) {
                arrayList.add(fieldValue);
            }
        }
        return arrayList;
    }

    @NonNull
    public List getValues() {
        List arrayList = new ArrayList();
        ClassObj classObj = getClassObj();
        getBuffer().setPosition(this.mValuesOffset);
        for (ClassObj classObj2 = classObj; classObj2 != null; classObj2 = classObj2.getSuperClassObj()) {
            for (Field field : classObj2.getFields()) {
                arrayList.add(new FieldValue(field, readValue(field.getType())));
            }
        }
        return arrayList;
    }

    public final void accept(@NonNull Visitor visitor) {
        visitor.visitClassInstance(this);
        for (FieldValue fieldValue : getValues()) {
            if (fieldValue.getValue() instanceof Instance) {
                if (!this.mReferencesAdded) {
                    ((Instance) fieldValue.getValue()).addReference(fieldValue.getField(), this);
                }
                visitor.visitLater(this, (Instance) fieldValue.getValue());
            }
        }
        this.mReferencesAdded = true;
    }

    public boolean getIsSoftReference() {
        return getClassObj().getIsSoftReference();
    }

    public final String toString() {
        return String.format("%s@%d (0x%x)", new Object[]{getClassObj().getClassName(), Long.valueOf(getUniqueId()), Long.valueOf(getUniqueId())});
    }
}
