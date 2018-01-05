package com.caverock.androidsvg;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;

public class C0707z extends bk implements bi {
    public List f4351a = new ArrayList();
    public Boolean f4352b;
    public Matrix f4353c;
    public aa f4354d;
    public String f4355e;

    protected C0707z() {
    }

    public final List mo1095a() {
        return this.f4351a;
    }

    public final void mo1096a(bm bmVar) {
        if (bmVar instanceof au) {
            this.f4351a.add(bmVar);
        } else {
            String valueOf = String.valueOf(bmVar);
            throw new SAXException(new StringBuilder(String.valueOf(valueOf).length() + 43).append("Gradient elements cannot contain ").append(valueOf).append(" elements.").toString());
        }
    }
}
