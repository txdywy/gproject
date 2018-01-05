package com.squareup.haha.perflib;

public final class HahaSpy {
    public static Instance allocatingThread(Instance instance) {
        int i;
        Snapshot snapshot = instance.mHeap.mSnapshot;
        if (instance instanceof RootObj) {
            i = ((RootObj) instance).mThread;
        } else {
            i = instance.mStack.mThreadSerialNumber;
        }
        return snapshot.findInstance(snapshot.getThread(i).mId);
    }

    private HahaSpy() {
        throw new AssertionError();
    }
}
