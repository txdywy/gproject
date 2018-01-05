package com.squareup.haha.perflib;

import com.squareup.haha.annotations.NonNull;

public interface Visitor {
    void visitArrayInstance(@NonNull ArrayInstance arrayInstance);

    void visitClassInstance(@NonNull ClassInstance classInstance);

    void visitClassObj(@NonNull ClassObj classObj);

    void visitLater(Instance instance, @NonNull Instance instance2);

    void visitRootObj(@NonNull RootObj rootObj);
}
