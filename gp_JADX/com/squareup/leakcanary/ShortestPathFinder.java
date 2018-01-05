package com.squareup.leakcanary;

import com.squareup.haha.perflib.ArrayInstance;
import com.squareup.haha.perflib.ClassInstance;
import com.squareup.haha.perflib.ClassInstance.FieldValue;
import com.squareup.haha.perflib.ClassObj;
import com.squareup.haha.perflib.Field;
import com.squareup.haha.perflib.HahaSpy;
import com.squareup.haha.perflib.Instance;
import com.squareup.haha.perflib.RootObj;
import com.squareup.haha.perflib.RootType;
import com.squareup.haha.perflib.Snapshot;
import com.squareup.leakcanary.LeakTraceElement.Type;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

final class ShortestPathFinder {
    public boolean canIgnoreStrings;
    public final ExcludedRefs excludedRefs;
    public final Queue toVisitIfNoPathQueue = new LinkedList();
    public final LinkedHashSet toVisitIfNoPathSet = new LinkedHashSet();
    public final Queue toVisitQueue = new LinkedList();
    public final LinkedHashSet toVisitSet = new LinkedHashSet();
    public final LinkedHashSet visitedSet = new LinkedHashSet();

    /* synthetic */ class C75841 {
        public static final /* synthetic */ int[] $SwitchMap$com$squareup$haha$perflib$RootType = new int[RootType.values().length];

        static {
            try {
                $SwitchMap$com$squareup$haha$perflib$RootType[RootType.JAVA_LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$RootType[RootType.INTERNED_STRING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$RootType[RootType.DEBUGGER.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$RootType[RootType.INVALID_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$RootType[RootType.UNREACHABLE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$RootType[RootType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$RootType[RootType.FINALIZING.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$RootType[RootType.SYSTEM_CLASS.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$RootType[RootType.VM_INTERNAL.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$RootType[RootType.NATIVE_LOCAL.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$RootType[RootType.NATIVE_STATIC.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$RootType[RootType.THREAD_BLOCK.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$RootType[RootType.BUSY_MONITOR.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$RootType[RootType.NATIVE_MONITOR.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$RootType[RootType.REFERENCE_CLEANUP.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$RootType[RootType.NATIVE_STACK.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
            }
            try {
                $SwitchMap$com$squareup$haha$perflib$RootType[RootType.JAVA_STATIC.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
            }
        }
    }

    final class Result {
        public final boolean excludingKnownLeaks;
        public final LeakNode leakingNode;

        Result(LeakNode leakNode, boolean z) {
            this.leakingNode = leakNode;
            this.excludingKnownLeaks = z;
        }
    }

    ShortestPathFinder(ExcludedRefs excludedRefs) {
        this.excludedRefs = excludedRefs;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final com.squareup.leakcanary.ShortestPathFinder.Result findPath(com.squareup.haha.perflib.Snapshot r6, com.squareup.haha.perflib.Instance r7) {
        /*
        r5 = this;
        r1 = 1;
        r2 = 0;
        r5.clearState();
        r0 = r5.isString(r7);
        if (r0 != 0) goto L_0x003c;
    L_0x000b:
        r0 = r1;
    L_0x000c:
        r5.canIgnoreStrings = r0;
        r5.enqueueGcRoots(r6);
        r3 = 0;
    L_0x0012:
        r0 = r5.toVisitQueue;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0022;
    L_0x001a:
        r0 = r5.toVisitIfNoPathQueue;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00cc;
    L_0x0022:
        r0 = r5.toVisitQueue;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x003e;
    L_0x002a:
        r0 = r5.toVisitQueue;
        r0 = r0.poll();
        r0 = (com.squareup.leakcanary.LeakNode) r0;
    L_0x0032:
        r4 = r0.instance;
        if (r4 != r7) goto L_0x0073;
    L_0x0036:
        r1 = new com.squareup.leakcanary.ShortestPathFinder$Result;
        r1.<init>(r0, r2);
        return r1;
    L_0x003c:
        r0 = r2;
        goto L_0x000c;
    L_0x003e:
        r0 = r5.toVisitIfNoPathQueue;
        r0 = r0.poll();
        r0 = (com.squareup.leakcanary.LeakNode) r0;
        r2 = r0.exclusion;
        if (r2 != 0) goto L_0x0071;
    L_0x004a:
        r1 = new java.lang.IllegalStateException;
        r0 = java.lang.String.valueOf(r0);
        r2 = java.lang.String.valueOf(r0);
        r2 = r2.length();
        r2 = r2 + 35;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Expected node to have an exclusion ";
        r2 = r3.append(r2);
        r0 = r2.append(r0);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x0071:
        r2 = r1;
        goto L_0x0032;
    L_0x0073:
        r4 = r5.checkSeen(r0);
        if (r4 != 0) goto L_0x0012;
    L_0x0079:
        r4 = r0.instance;
        r4 = r4 instanceof com.squareup.haha.perflib.RootObj;
        if (r4 == 0) goto L_0x0083;
    L_0x007f:
        r5.visitRootObj(r0);
        goto L_0x0012;
    L_0x0083:
        r4 = r0.instance;
        r4 = r4 instanceof com.squareup.haha.perflib.ClassObj;
        if (r4 == 0) goto L_0x008d;
    L_0x0089:
        r5.visitClassObj(r0);
        goto L_0x0012;
    L_0x008d:
        r4 = r0.instance;
        r4 = r4 instanceof com.squareup.haha.perflib.ClassInstance;
        if (r4 == 0) goto L_0x0098;
    L_0x0093:
        r5.visitClassInstance(r0);
        goto L_0x0012;
    L_0x0098:
        r4 = r0.instance;
        r4 = r4 instanceof com.squareup.haha.perflib.ArrayInstance;
        if (r4 == 0) goto L_0x00a3;
    L_0x009e:
        r5.visitArrayInstance(r0);
        goto L_0x0012;
    L_0x00a3:
        r1 = new java.lang.IllegalStateException;
        r0 = r0.instance;
        r0 = java.lang.String.valueOf(r0);
        r2 = java.lang.String.valueOf(r0);
        r2 = r2.length();
        r2 = r2 + 20;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Unexpected type for ";
        r2 = r3.append(r2);
        r0 = r2.append(r0);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x00cc:
        r0 = r3;
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.leakcanary.ShortestPathFinder.findPath(com.squareup.haha.perflib.Snapshot, com.squareup.haha.perflib.Instance):com.squareup.leakcanary.ShortestPathFinder$Result");
    }

    private final void clearState() {
        this.toVisitQueue.clear();
        this.toVisitIfNoPathQueue.clear();
        this.toVisitSet.clear();
        this.toVisitIfNoPathSet.clear();
        this.visitedSet.clear();
    }

    private final void enqueueGcRoots(Snapshot snapshot) {
        for (RootObj rootObj : snapshot.getGCRoots()) {
            switch (rootObj.getRootType().ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 6:
                case 13:
                    break;
                case 4:
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 15:
                case 16:
                    enqueue(null, null, rootObj, null, null);
                    break;
                case 14:
                    Exclusion exclusion = (Exclusion) this.excludedRefs.threadNames.get(HahaHelper.threadName(HahaSpy.allocatingThread(rootObj)));
                    if (exclusion != null && exclusion.alwaysExclude) {
                        break;
                    }
                    enqueue(exclusion, null, rootObj, null, null);
                    break;
                default:
                    String valueOf = String.valueOf(rootObj.getRootType());
                    throw new UnsupportedOperationException(new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unknown root type:").append(valueOf).toString());
            }
        }
    }

    private final boolean checkSeen(LeakNode leakNode) {
        return !this.visitedSet.add(leakNode.instance);
    }

    private final void visitRootObj(LeakNode leakNode) {
        RootObj rootObj = (RootObj) leakNode.instance;
        Instance referredInstance = rootObj.getReferredInstance();
        if (rootObj.getRootType() == RootType.JAVA_LOCAL) {
            Exclusion exclusion;
            Instance allocatingThread = HahaSpy.allocatingThread(rootObj);
            if (leakNode.exclusion != null) {
                exclusion = leakNode.exclusion;
            } else {
                exclusion = null;
            }
            LeakNode leakNode2 = new LeakNode(null, allocatingThread, null, null, null);
            enqueue(exclusion, leakNode2, referredInstance, "<Java Local>", Type.LOCAL);
            return;
        }
        enqueue(null, leakNode, referredInstance, null, null);
    }

    private final void visitClassObj(LeakNode leakNode) {
        ClassObj classObj = (ClassObj) leakNode.instance;
        Map map = (Map) this.excludedRefs.staticFieldNameByClassName.get(classObj.getClassName());
        for (Entry entry : classObj.getStaticFieldValues().entrySet()) {
            Field field = (Field) entry.getKey();
            if (field.getType() == com.squareup.haha.perflib.Type.OBJECT) {
                String name = field.getName();
                if (!name.equals("$staticOverhead")) {
                    Instance instance = (Instance) entry.getValue();
                    Object obj = 1;
                    if (map != null) {
                        Exclusion exclusion = (Exclusion) map.get(name);
                        if (exclusion != null) {
                            if (!exclusion.alwaysExclude) {
                                enqueue(exclusion, leakNode, instance, name, Type.STATIC_FIELD);
                            }
                            obj = null;
                        }
                    }
                    if (obj != null) {
                        enqueue(null, leakNode, instance, name, Type.STATIC_FIELD);
                    }
                }
            }
        }
    }

    private final void visitClassInstance(LeakNode leakNode) {
        ClassInstance classInstance = (ClassInstance) leakNode.instance;
        Map linkedHashMap = new LinkedHashMap();
        Exclusion exclusion = null;
        for (ClassObj classObj = classInstance.getClassObj(); classObj != null; classObj = classObj.getSuperClassObj()) {
            Exclusion exclusion2;
            Exclusion exclusion3 = (Exclusion) this.excludedRefs.classNames.get(classObj.getClassName());
            if (exclusion3 == null || (exclusion != null && exclusion.alwaysExclude)) {
                exclusion2 = exclusion;
            } else {
                exclusion2 = exclusion3;
            }
            Map map = (Map) this.excludedRefs.fieldNameByClassName.get(classObj.getClassName());
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            exclusion = exclusion2;
        }
        if (exclusion == null || !exclusion.alwaysExclude) {
            for (FieldValue fieldValue : classInstance.getValues()) {
                Field field = fieldValue.getField();
                if (field.getType() == com.squareup.haha.perflib.Type.OBJECT) {
                    Instance instance = (Instance) fieldValue.getValue();
                    String name = field.getName();
                    Exclusion exclusion4 = (Exclusion) linkedHashMap.get(name);
                    if (exclusion4 == null || (exclusion != null && (!exclusion4.alwaysExclude || exclusion.alwaysExclude))) {
                        exclusion3 = exclusion;
                    } else {
                        exclusion3 = exclusion4;
                    }
                    enqueue(exclusion3, leakNode, instance, name, Type.INSTANCE_FIELD);
                }
            }
        }
    }

    private final void visitArrayInstance(LeakNode leakNode) {
        ArrayInstance arrayInstance = (ArrayInstance) leakNode.instance;
        if (arrayInstance.getArrayType() == com.squareup.haha.perflib.Type.OBJECT) {
            Object[] values = arrayInstance.getValues();
            for (int i = 0; i < values.length; i++) {
                enqueue(null, leakNode, (Instance) values[i], "[" + i + "]", Type.ARRAY_ENTRY);
            }
        }
    }

    private final void enqueue(Exclusion exclusion, LeakNode leakNode, Instance instance, String str, Type type) {
        if (instance != null && !HahaHelper.isPrimitiveOrWrapperArray(instance) && !HahaHelper.isPrimitiveWrapper(instance) && !this.toVisitSet.contains(instance)) {
            Object obj;
            if (exclusion == null) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null || !this.toVisitIfNoPathSet.contains(instance)) {
                if ((!this.canIgnoreStrings || !isString(instance)) && !this.visitedSet.contains(instance)) {
                    LeakNode leakNode2 = new LeakNode(exclusion, instance, leakNode, str, type);
                    if (obj != null) {
                        this.toVisitSet.add(instance);
                        this.toVisitQueue.add(leakNode2);
                        return;
                    }
                    this.toVisitIfNoPathSet.add(instance);
                    this.toVisitIfNoPathQueue.add(leakNode2);
                }
            }
        }
    }

    private final boolean isString(Instance instance) {
        return instance.getClassObj() != null && instance.getClassObj().getClassName().equals(String.class.getName());
    }
}
