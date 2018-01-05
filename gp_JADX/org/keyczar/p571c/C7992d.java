package org.keyczar.p571c;

import java.util.HashMap;
import java.util.Map;
import org.keyczar.C7994c;

public final class C7992d {
    public static Map f40995a = new HashMap();

    static {
        for (C7990b c7990b : C7994c.values()) {
            String a = c7990b.mo6652a();
            if (f40995a.containsKey(a)) {
                String str = "Attempt to map two key types to the same name ";
                String valueOf = String.valueOf(a);
                throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
            f40995a.put(a, c7990b);
        }
    }
}
