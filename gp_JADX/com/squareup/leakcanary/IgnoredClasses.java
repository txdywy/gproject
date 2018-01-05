package com.squareup.leakcanary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class IgnoredClasses implements Serializable {
    public static final int NO_LIMIT = -1;
    public final Map ignoredClassToCurrentLeakCount;
    public final Set ignoredClasses;

    public final class Builder {
        public final Set ignoredClasses = new HashSet();

        public final Builder ignoreClass(String str) {
            Preconditions.checkNotNull(str, "class");
            this.ignoredClasses.add(str);
            return this;
        }

        public final IgnoredClasses build() {
            return new IgnoredClasses(this.ignoredClasses);
        }
    }

    private IgnoredClasses(Set set) {
        this.ignoredClassToCurrentLeakCount = new HashMap();
        this.ignoredClasses = Collections.unmodifiableSet(new HashSet(set));
    }

    @Deprecated
    public final synchronized boolean isNewLeakAllowed(Object obj) {
        boolean z = false;
        synchronized (this) {
            if (obj != null) {
                String name = obj.getClass().getName();
                if (this.ignoredClasses.contains(name)) {
                    Integer num = (Integer) this.ignoredClassToCurrentLeakCount.get(name);
                    if (num == null) {
                        num = Integer.valueOf(0);
                    }
                    this.ignoredClassToCurrentLeakCount.put(name, Integer.valueOf(num.intValue() + 1));
                    z = true;
                }
            }
        }
        return z;
    }

    public final String toString() {
        List arrayList = new ArrayList(this.ignoredClasses);
        Collections.sort(arrayList);
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        String str = "";
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str2 = (String) obj;
            str = String.valueOf(str);
            String count = getCount(str2, this.ignoredClassToCurrentLeakCount);
            str = new StringBuilder(((String.valueOf(str).length() + 24) + String.valueOf(str2).length()) + String.valueOf(count).length()).append(str).append("| Class: ").append(str2).append(" leaked ").append(count).append(" times\n").toString();
        }
        return str;
    }

    private static String getCount(String str, Map map) {
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return "0";
        }
        if (num.intValue() == -1) {
            return "unlimited";
        }
        return num.toString();
    }
}
