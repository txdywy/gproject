package com.caverock.androidsvg;

import java.util.List;
import org.xml.sax.SAXException;

public final class com.caverock.androidsvg.bx extends com.caverock.androidsvg.bg
{

    bx() {
        com.caverock.androidsvg.bg();
    }

    public final void a(com.caverock.androidsvg.bm p0) {
        if (p0 instanceof com.caverock.androidsvg.bw) {
            this.i.add(p0);
            return;
        }
        v1 = String.valueOf(p0);
        throw new SAXException((String.valueOf(v1).length() + 47) + "Text content elements cannot contain " + v1 + " elements.");
    }

}
