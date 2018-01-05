package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ay {
    public static final Map f8912a;

    private static void m9573a(Map map, C1709d c1709d, C1710e... c1710eArr) {
        map.put(c1709d, Collections.unmodifiableList(Arrays.asList(c1710eArr)));
    }

    static {
        Map hashMap = new HashMap();
        ay.m9573a(hashMap, C1709d.COUNTRY, C1710e.USING_UNUSED_FIELD, C1710e.MISSING_REQUIRED_FIELD, C1710e.UNKNOWN_VALUE);
        ay.m9573a(hashMap, C1709d.ADMIN_AREA, C1710e.USING_UNUSED_FIELD, C1710e.MISSING_REQUIRED_FIELD, C1710e.UNKNOWN_VALUE);
        ay.m9573a(hashMap, C1709d.LOCALITY, C1710e.USING_UNUSED_FIELD, C1710e.MISSING_REQUIRED_FIELD, C1710e.UNKNOWN_VALUE);
        ay.m9573a(hashMap, C1709d.DEPENDENT_LOCALITY, C1710e.USING_UNUSED_FIELD, C1710e.MISSING_REQUIRED_FIELD, C1710e.UNKNOWN_VALUE);
        ay.m9573a(hashMap, C1709d.POSTAL_CODE, C1710e.USING_UNUSED_FIELD, C1710e.MISSING_REQUIRED_FIELD, C1710e.UNRECOGNIZED_FORMAT, C1710e.MISMATCHING_VALUE);
        ay.m9573a(hashMap, C1709d.STREET_ADDRESS, C1710e.USING_UNUSED_FIELD, C1710e.MISSING_REQUIRED_FIELD);
        ay.m9573a(hashMap, C1709d.SORTING_CODE, C1710e.USING_UNUSED_FIELD, C1710e.MISSING_REQUIRED_FIELD);
        ay.m9573a(hashMap, C1709d.ORGANIZATION, C1710e.USING_UNUSED_FIELD, C1710e.MISSING_REQUIRED_FIELD);
        ay.m9573a(hashMap, C1709d.RECIPIENT, C1710e.USING_UNUSED_FIELD, C1710e.MISSING_REQUIRED_FIELD);
        f8912a = Collections.unmodifiableMap(hashMap);
    }
}
