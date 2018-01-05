package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import com.google.c.a.a.a.a.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public final class C0722q {
    public static cq f4613a = new cq();
    public be f4614b = null;
    public ct f4615c = null;
    public float f4616d = 96.0f;
    public C0713h f4617e = new C0713h();
    public Map f4618f = new HashMap();
    public float f4619g = 1.0f;

    protected C0722q() {
    }

    public static C0722q m4787a(InputStream inputStream) {
        return new cy().m4747a(inputStream);
    }

    public static C0722q m4788a(String str) {
        return new cy().m4747a(new ByteArrayInputStream(str.getBytes()));
    }

    public static C0722q m4784a(Context context, int i) {
        return C0722q.m4786a(context.getResources(), i);
    }

    private static C0722q m4786a(Resources resources, int i) {
        cy cyVar = new cy();
        InputStream openRawResource = resources.openRawResource(i);
        try {
            C0722q a = cyVar.m4747a(openRawResource);
            return a;
        } finally {
            try {
                openRawResource.close();
            } catch (IOException e) {
            }
        }
    }

    @Deprecated
    public static Drawable m4781a(Resources resources, int i, int i2) {
        as asVar = new as();
        if (i2 != 0) {
            asVar.m4593b(resources.getColor(i2));
        }
        try {
            return C0722q.m4782a(resources, i, asVar);
        } catch (Throwable e) {
            a.a.a(e);
            return null;
        }
    }

    public static Drawable m4782a(Resources resources, int i, as asVar) {
        C0722q a = f4613a.m4689a(i, C0722q.m4779a(resources));
        if (a == null) {
            a = C0722q.m4786a(resources, i);
            a.m4792a(C0722q.m4779a(resources));
            f4613a.m4691a(a, i);
        }
        return new cs(a, asVar);
    }

    public static C0722q m4785a(AssetManager assetManager, String str) {
        cy cyVar = new cy();
        InputStream open = assetManager.open(str);
        try {
            C0722q a = cyVar.m4747a(open);
            return a;
        } finally {
            try {
                open.close();
            } catch (IOException e) {
            }
        }
    }

    public final Picture m4791a(as asVar) {
        af afVar = this.f4614b.f4349c;
        if (afVar == null) {
            return m4780a(512, 512, asVar);
        }
        float f;
        float a = afVar.m4570a(this.f4616d);
        C0723r c0723r = this.f4614b.w;
        if (c0723r != null) {
            f = (c0723r.f4623d * a) / c0723r.f4622c;
        } else {
            afVar = this.f4614b.f4350d;
            f = afVar != null ? afVar.m4570a(this.f4616d) : a;
        }
        return m4780a((int) Math.ceil((double) a), (int) Math.ceil((double) f), asVar);
    }

    public static float m4779a(Resources resources) {
        return ((float) resources.getDisplayMetrics().densityDpi) / 160.0f;
    }

    public final void m4792a(float f) {
        float b = m4793b();
        float a = m4790a();
        if (b > 0.0f && a > 0.0f) {
            m4796c(b * f);
            m4795b(a * f);
            this.f4619g *= f;
        }
    }

    private final Picture m4780a(int i, int i2, as asVar) {
        Picture picture = new Picture();
        cf cfVar = new cf(picture.beginRecording(i, i2), new C0723r(0.0f, 0.0f, (float) i, (float) i2), this.f4616d);
        if (asVar != null) {
            cfVar.f4403e = asVar.f4273b;
            cfVar.f4404f = asVar.f4272a;
        }
        cfVar.f4405g = this;
        cfVar.f4402d = false;
        bm bmVar = this.f4614b;
        if (bmVar == null) {
            cf.m4636a("Nothing to render. Document is empty.", new Object[0]);
        } else {
            cfVar.f4406h = new cm();
            cfVar.f4407i = new Stack();
            cfVar.m4662a(cfVar.f4406h, av.m4598a());
            cfVar.f4406h.f4441f = cfVar.f4400b;
            cfVar.f4406h.f4443h = false;
            cfVar.f4406h.f4444i = cfVar.f4402d;
            cfVar.f4407i.push((cm) cfVar.f4406h.clone());
            cfVar.f4410l = new Stack();
            cfVar.f4411m = new Stack();
            cfVar.f4409k = new Stack();
            cfVar.f4408j = new Stack();
            cfVar.m4661a(bmVar);
            cfVar.m4660a(bmVar, bmVar.f4349c, bmVar.f4350d, bmVar.w, bmVar.v);
        }
        picture.endRecording();
        return picture;
    }

    public final float m4790a() {
        if (this.f4614b != null) {
            return m4789d(this.f4616d).f4622c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public final void m4795b(float f) {
        if (this.f4614b == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        this.f4614b.f4349c = new af(f);
    }

    public final float m4793b() {
        if (this.f4614b != null) {
            return m4789d(this.f4616d).f4623d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public final void m4796c(float f) {
        if (this.f4614b == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        this.f4614b.f4350d = new af(f);
    }

    protected final bm m4794b(String str) {
        if (str == null || str.length() <= 1 || !str.startsWith("#")) {
            return null;
        }
        String substring = str.substring(1);
        if (substring == null || substring.length() == 0) {
            return null;
        }
        if (substring.equals(this.f4614b.o)) {
            return this.f4614b;
        }
        if (this.f4618f.containsKey(substring)) {
            return (bm) this.f4618f.get(substring);
        }
        bm a = m4783a(this.f4614b, substring);
        this.f4618f.put(substring, a);
        return a;
    }

    private final C0723r m4789d(float f) {
        af afVar = this.f4614b.f4349c;
        af afVar2 = this.f4614b.f4350d;
        if (afVar == null || afVar.m4573a() || afVar.f4231b == cc.percent || afVar.f4231b == cc.em || afVar.f4231b == cc.ex) {
            return new C0723r(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float f2;
        float a = afVar.m4570a(f);
        if (afVar2 == null) {
            f2 = this.f4614b.w != null ? (this.f4614b.w.f4623d * a) / this.f4614b.w.f4622c : a;
        } else if (afVar2.m4573a() || afVar2.f4231b == cc.percent || afVar2.f4231b == cc.em || afVar2.f4231b == cc.ex) {
            return new C0723r(-1.0f, -1.0f, -1.0f, -1.0f);
        } else {
            f2 = afVar2.m4570a(f);
        }
        return new C0723r(0.0f, 0.0f, a, f2);
    }

    private final bk m4783a(bi biVar, String str) {
        bk bkVar = (bk) biVar;
        if (str.equals(bkVar.f4205o)) {
            return bkVar;
        }
        for (bm bmVar : biVar.mo1095a()) {
            if (bmVar instanceof bk) {
                bk bkVar2 = (bk) bmVar;
                if (str.equals(bkVar2.f4205o)) {
                    return bkVar2;
                }
                if (bmVar instanceof bi) {
                    bkVar = m4783a((bi) bmVar, str);
                    if (bkVar != null) {
                        return bkVar;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }
}
