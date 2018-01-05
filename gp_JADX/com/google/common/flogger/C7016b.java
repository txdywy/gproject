package com.google.common.flogger;

import com.google.common.flogger.parser.C7069f;
import com.google.common.flogger.parser.C7071b;
import com.google.common.flogger.parser.C7073c;
import java.util.logging.Level;

public abstract class C7016b extends C7015i implements C7014s {
    public C7064l f34498a = C7064l.PRINTF_STYLE;

    protected C7016b(Level level, boolean z) {
        super(level, z);
    }

    protected final C7069f mo5980a() {
        switch (this.f34498a.ordinal()) {
            case 0:
                return C7073c.f34587a;
            case 1:
                return C7071b.f34586a;
            default:
                String valueOf = String.valueOf(this.f34498a);
                throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 25).append("unsupported format type: ").append(valueOf).toString());
        }
    }
}
