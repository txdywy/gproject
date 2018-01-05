package com.caverock.androidsvg;

import java.util.HashMap;
import java.util.Map;

enum de {
    svg,
    a,
    circle,
    clipPath,
    defs,
    desc,
    ellipse,
    g,
    image,
    line,
    linearGradient,
    marker,
    mask,
    path,
    pattern,
    polygon,
    polyline,
    radialGradient,
    rect,
    solidColor,
    stop,
    style,
    SWITCH,
    symbol,
    text,
    textPath,
    title,
    tref,
    tspan,
    use,
    view,
    UNSUPPORTED;
    
    public static final Map f4537G = null;

    public static de m4770a(String str) {
        de deVar = (de) f4537G.get(str);
        if (deVar != null) {
            return deVar;
        }
        if (str.equals("switch")) {
            f4537G.put(str, SWITCH);
            return SWITCH;
        }
        try {
            deVar = valueOf(str);
            if (deVar != SWITCH) {
                f4537G.put(str, deVar);
                return deVar;
            }
        } catch (IllegalArgumentException e) {
        }
        f4537G.put(str, UNSUPPORTED);
        return UNSUPPORTED;
    }

    static {
        f4537G = new HashMap();
    }
}
