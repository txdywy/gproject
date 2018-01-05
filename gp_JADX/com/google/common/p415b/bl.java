package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.util.Map;
import java.util.Map.Entry;

public final class bl {
    public static Entry m31765a(Object obj, Object obj2) {
        return new as(obj, obj2);
    }

    static Object m31764a(Map map, Object obj) {
        C6937m.m31623a((Object) map);
        try {
            return map.get(obj);
        } catch (ClassCastException e) {
            return null;
        } catch (NullPointerException e2) {
            return null;
        }
    }

    static boolean m31766b(Map map, Object obj) {
        C6937m.m31623a((Object) map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException e) {
            return false;
        } catch (NullPointerException e2) {
            return false;
        }
    }

    static Object m31767c(Map map, Object obj) {
        C6937m.m31623a((Object) map);
        try {
            return map.remove(obj);
        } catch (ClassCastException e) {
            return null;
        } catch (NullPointerException e2) {
            return null;
        }
    }
}
