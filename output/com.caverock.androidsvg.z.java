package com.caverock.androidsvg;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;

public final class com.caverock.androidsvg.z extends com.caverock.androidsvg.bk implements com.caverock.androidsvg.bi
{

    public List a;
    public Boolean b;
    public Matrix c;
    public com.caverock.androidsvg.aa d;
    public String e;

    z() {
        com.caverock.androidsvg.bk();
        this.a = new ArrayList();
    }

    public final List a() {
        return this.a;
    }

    public final void a(com.caverock.androidsvg.bm p0) {
        if (p0 instanceof com.caverock.androidsvg.au) {
            this.a.add(p0);
            return;
        }
        v1 = String.valueOf(p0);
        throw new SAXException((String.valueOf(v1).length() + 43) + "Gradient elements cannot contain " + v1 + " elements.");
    }

}
