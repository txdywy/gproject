package com.squareup.leakcanary;

import b.a.ak;
import b.a.ao;
import b.a.f;
import com.squareup.haha.perflib.ArrayInstance;
import com.squareup.haha.perflib.ClassInstance;
import com.squareup.haha.perflib.ClassInstance.FieldValue;
import com.squareup.haha.perflib.ClassObj;
import com.squareup.haha.perflib.Field;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.Instance;
import com.squareup.haha.perflib.RootObj;
import com.squareup.haha.perflib.RootType;
import com.squareup.haha.perflib.Snapshot;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.LeakTraceElement.Holder;
import com.squareup.leakcanary.LeakTraceElement.Type;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

public final class HeapAnalyzer {
    public static final String ANONYMOUS_CLASS_NAME_PATTERN = "^.+\\$\\d+$";
    public final ExcludedRefs excludedRefs;

    public HeapAnalyzer(ExcludedRefs excludedRefs) {
        this.excludedRefs = excludedRefs;
    }

    public final List findTrackedReferences(File file) {
        String asString;
        if (file.exists()) {
            try {
                Snapshot parse = new HprofParser(new MemoryMappedFileBuffer(file)).parse();
                deduplicateGcRoots(parse);
                ClassObj findClass = parse.findClass(KeyedWeakReference.class.getName());
                List arrayList = new ArrayList();
                for (Instance classInstanceValues : findClass.getInstancesList()) {
                    List classInstanceValues2 = HahaHelper.classInstanceValues(classInstanceValues);
                    String asString2 = HahaHelper.asString(HahaHelper.fieldValue(classInstanceValues2, "key"));
                    asString = HahaHelper.hasField(classInstanceValues2, "name") ? HahaHelper.asString(HahaHelper.fieldValue(classInstanceValues2, "name")) : "(No name field)";
                    Instance classInstanceValues3 = (Instance) HahaHelper.fieldValue(classInstanceValues2, "referent");
                    if (classInstanceValues3 != null) {
                        arrayList.add(new TrackedReference(asString2, asString, getClassName(classInstanceValues3), describeFields(classInstanceValues3)));
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                RuntimeException runtimeException = new RuntimeException(th);
            }
        } else {
            asString = String.valueOf(file);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(asString).length() + 21).append("File does not exist: ").append(asString).toString());
        }
    }

    public final AnalysisResult checkForLeak(File file, String str) {
        long nanoTime = System.nanoTime();
        if (file.exists()) {
            try {
                Snapshot parse = new HprofParser(new MemoryMappedFileBuffer(file)).parse();
                deduplicateGcRoots(parse);
                Instance findLeakingReference = findLeakingReference(str, parse);
                if (findLeakingReference == null) {
                    return AnalysisResult.noLeak(since(nanoTime));
                }
                return findLeakTrace(nanoTime, parse, findLeakingReference);
            } catch (Throwable th) {
                return AnalysisResult.failure(th, since(nanoTime));
            }
        }
        String valueOf = String.valueOf(file);
        return AnalysisResult.failure(new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 21).append("File does not exist: ").append(valueOf).toString()), since(nanoTime));
    }

    final void deduplicateGcRoots(Snapshot snapshot) {
        final ak fVar = new f();
        final Collection<RootObj> gCRoots = snapshot.getGCRoots();
        for (RootObj rootObj : gCRoots) {
            String generateRootKey = generateRootKey(rootObj);
            if (!fVar.containsKey(generateRootKey)) {
                fVar.put(generateRootKey, rootObj);
            }
        }
        gCRoots.clear();
        fVar.a(new ao(this) {
            public boolean execute(String str) {
                return gCRoots.add((RootObj) fVar.get(str));
            }
        });
    }

    private final String generateRootKey(RootObj rootObj) {
        return String.format("%s@0x%08x", new Object[]{rootObj.getRootType().getName(), Long.valueOf(rootObj.getId())});
    }

    private final Instance findLeakingReference(String str, Snapshot snapshot) {
        ClassObj findClass = snapshot.findClass(KeyedWeakReference.class.getName());
        List arrayList = new ArrayList();
        for (Instance classInstanceValues : findClass.getInstancesList()) {
            List classInstanceValues2 = HahaHelper.classInstanceValues(classInstanceValues);
            String asString = HahaHelper.asString(HahaHelper.fieldValue(classInstanceValues2, "key"));
            if (asString.equals(str)) {
                return (Instance) HahaHelper.fieldValue(classInstanceValues2, "referent");
            }
            arrayList.add(asString);
        }
        String valueOf = String.valueOf(arrayList);
        throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 43) + String.valueOf(valueOf).length()).append("Could not find weak reference with key ").append(str).append(" in ").append(valueOf).toString());
    }

    private final AnalysisResult findLeakTrace(long j, Snapshot snapshot, Instance instance) {
        Result findPath = new ShortestPathFinder(this.excludedRefs).findPath(snapshot, instance);
        if (findPath.leakingNode == null) {
            return AnalysisResult.noLeak(since(j));
        }
        LeakTrace buildLeakTrace = buildLeakTrace(findPath.leakingNode);
        String className = instance.getClassObj().getClassName();
        snapshot.computeDominators();
        Instance instance2 = findPath.leakingNode.instance;
        return AnalysisResult.leakDetected(findPath.excludingKnownLeaks, className, buildLeakTrace, instance2.getTotalRetainedSize() + computeIgnoredBitmapRetainedSize(snapshot, instance2), since(j));
    }

    private final long computeIgnoredBitmapRetainedSize(Snapshot snapshot, Instance instance) {
        long j = 0;
        for (Instance instance2 : snapshot.findClass("android.graphics.Bitmap").getInstancesList()) {
            long totalRetainedSize;
            if (isIgnoredDominator(instance, instance2)) {
                List classInstanceValues = HahaHelper.classInstanceValues(instance2);
                if (HahaHelper.hasField(classInstanceValues, "mBuffer")) {
                    ArrayInstance arrayInstance = (ArrayInstance) HahaHelper.fieldValue(classInstanceValues, "mBuffer");
                    if (arrayInstance != null) {
                        long totalRetainedSize2 = arrayInstance.getTotalRetainedSize();
                        totalRetainedSize = instance2.getTotalRetainedSize();
                        if (totalRetainedSize < totalRetainedSize2) {
                            totalRetainedSize += totalRetainedSize2;
                        }
                        totalRetainedSize += j;
                    }
                }
            } else {
                totalRetainedSize = j;
            }
            j = totalRetainedSize;
        }
        return j;
    }

    private final boolean isIgnoredDominator(Instance instance, Instance instance2) {
        boolean z = false;
        while (true) {
            boolean z2;
            Instance immediateDominator = instance2.getImmediateDominator();
            if ((immediateDominator instanceof RootObj) && ((RootObj) immediateDominator).getRootType() == RootType.UNKNOWN) {
                instance2 = instance2.getNextInstanceToGcRoot();
                z2 = true;
            } else {
                z2 = z;
                instance2 = immediateDominator;
            }
            if (instance2 == null) {
                return false;
            }
            if (instance2 == instance) {
                return z2;
            }
            z = z2;
        }
    }

    private final LeakTrace buildLeakTrace(LeakNode leakNode) {
        List arrayList = new ArrayList();
        for (LeakNode leakNode2 = new LeakNode(null, null, leakNode, null, null); leakNode2 != null; leakNode2 = leakNode2.parent) {
            LeakTraceElement buildLeakElement = buildLeakElement(leakNode2);
            if (buildLeakElement != null) {
                arrayList.add(0, buildLeakElement);
            }
        }
        return new LeakTrace(arrayList);
    }

    private final LeakTraceElement buildLeakElement(LeakNode leakNode) {
        String str = null;
        if (leakNode.parent == null) {
            return null;
        }
        Instance instance = leakNode.parent.instance;
        if (instance instanceof RootObj) {
            return null;
        }
        Holder holder;
        Type type = leakNode.referenceType;
        String str2 = leakNode.referenceName;
        List describeFields = describeFields(instance);
        String className = getClassName(instance);
        if (instance instanceof ClassObj) {
            holder = Holder.CLASS;
        } else if (instance instanceof ArrayInstance) {
            holder = Holder.ARRAY;
        } else {
            ClassObj classObj = instance.getClassObj();
            String threadName;
            if (HahaHelper.extendsThread(classObj)) {
                holder = Holder.THREAD;
                threadName = HahaHelper.threadName(instance);
                str = new StringBuilder(String.valueOf(threadName).length() + 10).append("(named '").append(threadName).append("')").toString();
            } else if (className.matches(ANONYMOUS_CLASS_NAME_PATTERN)) {
                threadName = classObj.getSuperClassObj().getClassName();
                if (Object.class.getName().equals(threadName)) {
                    holder = Holder.OBJECT;
                    try {
                        Class[] interfaces = Class.forName(classObj.getClassName()).getInterfaces();
                        if (interfaces.length > 0) {
                            threadName = interfaces[0].getName();
                            str = new StringBuilder(String.valueOf(threadName).length() + 30).append("(anonymous implementation of ").append(threadName).append(")").toString();
                        } else {
                            str = "(anonymous subclass of java.lang.Object)";
                        }
                    } catch (ClassNotFoundException e) {
                    }
                } else {
                    holder = Holder.OBJECT;
                    str = new StringBuilder(String.valueOf(threadName).length() + 24).append("(anonymous subclass of ").append(threadName).append(")").toString();
                }
            } else {
                holder = Holder.OBJECT;
            }
        }
        return new LeakTraceElement(str2, type, holder, className, str, leakNode.exclusion, describeFields);
    }

    private final List describeFields(Instance instance) {
        List arrayList = new ArrayList();
        String valueOf;
        if (instance instanceof ClassObj) {
            for (Entry entry : ((ClassObj) instance).getStaticFieldValues().entrySet()) {
                Field field = (Field) entry.getKey();
                Object value = entry.getValue();
                String name = field.getName();
                valueOf = String.valueOf(value);
                arrayList.add(new StringBuilder((String.valueOf(name).length() + 10) + String.valueOf(valueOf).length()).append("static ").append(name).append(" = ").append(valueOf).toString());
            }
        } else if (instance instanceof ArrayInstance) {
            ArrayInstance arrayInstance = (ArrayInstance) instance;
            if (arrayInstance.getArrayType() == com.squareup.haha.perflib.Type.OBJECT) {
                Object[] values = arrayInstance.getValues();
                for (int i = 0; i < values.length; i++) {
                    r3 = String.valueOf(values[i]);
                    arrayList.add(new StringBuilder(String.valueOf(r3).length() + 16).append("[").append(i).append("] = ").append(r3).toString());
                }
            }
        } else {
            for (Entry entry2 : instance.getClassObj().getStaticFieldValues().entrySet()) {
                r3 = "static ";
                valueOf = String.valueOf(HahaHelper.fieldToString(entry2));
                arrayList.add(valueOf.length() != 0 ? r3.concat(valueOf) : new String(r3));
            }
            for (FieldValue fieldToString : ((ClassInstance) instance).getValues()) {
                arrayList.add(HahaHelper.fieldToString(fieldToString));
            }
        }
        return arrayList;
    }

    private final String getClassName(Instance instance) {
        if (instance instanceof ClassObj) {
            return ((ClassObj) instance).getClassName();
        }
        if (instance instanceof ArrayInstance) {
            return ((ArrayInstance) instance).getClassObj().getClassName();
        }
        return instance.getClassObj().getClassName();
    }

    private final long since(long j) {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j);
    }
}
