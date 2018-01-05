package com.caverock.androidsvg;

import java.util.HashMap;
import java.util.Map;

final class dc {
    public static final Map f4478a;

    public static Integer m4768a(String str) {
        return (Integer) f4478a.get(str);
    }

    static {
        Map hashMap = new HashMap(13);
        f4478a = hashMap;
        hashMap.put("normal", Integer.valueOf(400));
        f4478a.put("bold", Integer.valueOf(700));
        f4478a.put("bolder", Integer.valueOf(1));
        f4478a.put("lighter", Integer.valueOf(-1));
        f4478a.put("100", Integer.valueOf(100));
        f4478a.put("200", Integer.valueOf(200));
        f4478a.put("300", Integer.valueOf(300));
        f4478a.put("400", Integer.valueOf(400));
        f4478a.put("500", Integer.valueOf(500));
        f4478a.put("600", Integer.valueOf(600));
        f4478a.put("700", Integer.valueOf(700));
        f4478a.put("800", Integer.valueOf(800));
        f4478a.put("900", Integer.valueOf(900));
    }
}
