package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.HashMap;
import java.util.Map;

enum C1708c {
    COUNTRIES,
    FMT,
    ID,
    KEY,
    LANG,
    LFMT,
    REQUIRE,
    STATE_NAME_TYPE,
    SUB_KEYS,
    SUB_LNAMES,
    SUB_MORES,
    SUB_NAMES,
    XZIP,
    ZIP,
    ZIP_NAME_TYPE;
    
    public static final Map f8931p = null;

    static {
        f8931p = new HashMap();
        C1708c[] values = C1708c.values();
        int length = values.length;
        int i;
        while (i < length) {
            C1708c c1708c = values[i];
            f8931p.put(c1708c.toString().toLowerCase(), c1708c);
            i++;
        }
    }
}
