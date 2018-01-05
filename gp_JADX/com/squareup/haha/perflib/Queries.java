package com.squareup.haha.perflib;

import com.squareup.haha.annotations.NonNull;
import com.squareup.haha.annotations.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Queries {
    public static final String DEFAULT_PACKAGE = "<default>";

    @NonNull
    public static Map allClasses(@NonNull Snapshot snapshot) {
        return classes(snapshot, null);
    }

    @NonNull
    public static Map classes(@NonNull Snapshot snapshot, @Nullable String[] strArr) {
        Map treeMap = new TreeMap();
        Set<ClassObj> treeSet = new TreeSet();
        ArrayList arrayList = snapshot.mHeaps;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            treeSet.addAll(((Heap) obj).getClasses());
        }
        if (strArr != null) {
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                String classObj = ((ClassObj) it.next()).toString();
                for (String startsWith : strArr) {
                    if (classObj.startsWith(startsWith)) {
                        it.remove();
                        break;
                    }
                }
            }
        }
        for (ClassObj classObj2 : treeSet) {
            Object substring;
            String str = DEFAULT_PACKAGE;
            i = classObj2.mClassName.lastIndexOf(46);
            if (i != -1) {
                substring = classObj2.mClassName.substring(0, i);
            } else {
                String str2 = str;
            }
            Set set = (Set) treeMap.get(substring);
            if (set == null) {
                set = new TreeSet();
                treeMap.put(substring, set);
            }
            set.add(classObj2);
        }
        return treeMap;
    }

    @NonNull
    public static Collection commonClasses(@NonNull Snapshot snapshot, @NonNull Snapshot snapshot2) {
        Collection arrayList = new ArrayList();
        for (Heap classes : snapshot.getHeaps()) {
            for (ClassObj classObj : classes.getClasses()) {
                if (snapshot2.findClass(classObj.getClassName()) != null) {
                    arrayList.add(classObj);
                }
            }
        }
        return arrayList;
    }

    public static ClassObj findClass(@NonNull Snapshot snapshot, String str) {
        return snapshot.findClass(str);
    }

    @NonNull
    public static Instance[] instancesOf(@NonNull Snapshot snapshot, String str) {
        ClassObj findClass = snapshot.findClass(str);
        if (findClass == null) {
            String str2 = "Class not found: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        List instancesList = findClass.getInstancesList();
        return (Instance[]) instancesList.toArray(new Instance[instancesList.size()]);
    }

    @NonNull
    public static Instance[] allInstancesOf(@NonNull Snapshot snapshot, String str) {
        ClassObj findClass = snapshot.findClass(str);
        if (findClass == null) {
            String str2 = "Class not found: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(findClass);
        arrayList.addAll(traverseSubclasses(findClass));
        ArrayList arrayList2 = new ArrayList();
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.addAll(((ClassObj) obj).getInstancesList());
        }
        Instance[] instanceArr = new Instance[arrayList2.size()];
        arrayList2.toArray(instanceArr);
        return instanceArr;
    }

    @NonNull
    private static ArrayList traverseSubclasses(@NonNull ClassObj classObj) {
        ArrayList arrayList = new ArrayList();
        for (ClassObj classObj2 : classObj.mSubclasses) {
            arrayList.add(classObj2);
            arrayList.addAll(traverseSubclasses(classObj2));
        }
        return arrayList;
    }

    public static Instance findObject(@NonNull Snapshot snapshot, String str) {
        return snapshot.findInstance(Long.parseLong(str, 16));
    }

    @NonNull
    public static Collection getRoots(@NonNull Snapshot snapshot) {
        Collection hashSet = new HashSet();
        ArrayList arrayList = snapshot.mHeaps;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hashSet.addAll(((Heap) obj).mRoots);
        }
        return hashSet;
    }

    @NonNull
    public static final Instance[] newInstances(@NonNull Snapshot snapshot, @NonNull Snapshot snapshot2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = snapshot2.mHeaps;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            Heap heap = (Heap) obj;
            Heap heap2 = snapshot.getHeap(heap.getName());
            if (heap2 != null) {
                for (Instance instance : heap.getInstances()) {
                    Instance instance2 = heap2.getInstance(instance.mId);
                    if (instance2 == null || instance.getClassObj() != instance2.getClassObj()) {
                        arrayList.add(instance);
                    }
                }
            }
        }
        return (Instance[]) arrayList.toArray(new Instance[arrayList.size()]);
    }
}
