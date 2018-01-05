package com.caverock.androidsvg;

import java.util.HashMap;
import java.util.Map;

public static class com.caverock.androidsvg.dc
{

    public static final Map a;

    static {
        v0 = new HashMap(13);
        com.caverock.androidsvg.dc.a = v0;
        v0.put("normal", Integer.valueOf(400));
        com.caverock.androidsvg.dc.a.put("bold", Integer.valueOf(700));
        com.caverock.androidsvg.dc.a.put("bolder", Integer.valueOf(1));
        com.caverock.androidsvg.dc.a.put("lighter", Integer.valueOf(-1));
        com.caverock.androidsvg.dc.a.put("100", Integer.valueOf(100));
        com.caverock.androidsvg.dc.a.put("200", Integer.valueOf(200));
        com.caverock.androidsvg.dc.a.put("300", Integer.valueOf(300));
        com.caverock.androidsvg.dc.a.put("400", Integer.valueOf(400));
        com.caverock.androidsvg.dc.a.put("500", Integer.valueOf(500));
        com.caverock.androidsvg.dc.a.put("600", Integer.valueOf(600));
        com.caverock.androidsvg.dc.a.put("700", Integer.valueOf(700));
        com.caverock.androidsvg.dc.a.put("800", Integer.valueOf(800));
        com.caverock.androidsvg.dc.a.put("900", Integer.valueOf(900));
    }

    public static Integer a(String p0) {
        return (Integer)com.caverock.androidsvg.dc.a.get(p0);
    }

}
