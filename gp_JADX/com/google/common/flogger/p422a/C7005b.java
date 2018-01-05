package com.google.common.flogger.p422a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum C7005b {
    TIME_HOUR_OF_DAY_PADDED('H'),
    TIME_HOUR_OF_DAY('k'),
    TIME_HOUR_12H_PADDED('I'),
    TIME_HOUR_12H('l'),
    TIME_MINUTE_OF_HOUR_PADDED('M'),
    TIME_SECONDS_OF_MINUTE_PADDED('S'),
    TIME_MILLIS_OF_SECOND_PADDED('L'),
    TIME_NANOS_OF_SECOND_PADDED('N'),
    TIME_AM_PM('p'),
    TIME_TZ_NUMERIC('z'),
    TIME_TZ_SHORT('Z'),
    TIME_EPOCH_SECONDS('s'),
    TIME_EPOCH_MILLIS('Q'),
    DATE_MONTH_FULL('B'),
    DATE_MONTH_SHORT('b'),
    DATE_MONTH_SHORT_ALT('h'),
    DATE_DAY_FULL('A'),
    DATE_DAY_SHORT('a'),
    DATE_CENTURY_PADDED('C'),
    DATE_YEAR_PADDED('Y'),
    DATE_YEAR_OF_CENTURY_PADDED('y'),
    DATE_DAY_OF_YEAR_PADDED('j'),
    DATE_MONTH_PADDED('m'),
    DATE_DAY_OF_MONTH_PADDED('d'),
    DATE_DAY_OF_MONTH('e'),
    DATETIME_HOURS_MINUTES('R'),
    DATETIME_HOURS_MINUTES_SECONDS('T'),
    DATETIME_HOURS_MINUTES_SECONDS_12H('r'),
    DATETIME_MONTH_DAY_YEAR('D'),
    DATETIME_YEAR_MONTH_DAY('F'),
    DATETIME_FULL('c');
    
    public static final Map f34454F = null;
    public final char f34482G;

    private C7005b(char c) {
        this.f34482G = c;
    }

    static {
        Map hashMap = new HashMap();
        C7005b[] values = C7005b.values();
        int length = values.length;
        int i;
        while (i < length) {
            C7005b c7005b = values[i];
            if (hashMap.put(Character.valueOf(c7005b.f34482G), c7005b) != null) {
                String valueOf = String.valueOf(c7005b);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 28).append("duplicate format character: ").append(valueOf).toString());
            }
            i++;
        }
        f34454F = Collections.unmodifiableMap(hashMap);
    }
}
