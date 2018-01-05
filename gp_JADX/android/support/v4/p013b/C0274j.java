package android.support.v4.p013b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v4.p028a.p029a.C0203c;
import android.support.v4.p028a.p029a.C0204d;
import android.support.v4.p035f.C0295h;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

class C0274j implements C0273f {
    C0274j() {
    }

    private static Object m1565a(Object[] objArr, int i, C0278m c0278m) {
        boolean z;
        int i2 = (i & 1) == 0 ? 400 : 700;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        int i3 = Integer.MAX_VALUE;
        int length = objArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5;
            Object obj2;
            Object obj3 = objArr[i4];
            int abs = Math.abs(c0278m.mo370b(obj3) - i2) * 2;
            if (c0278m.mo369a(obj3) == z) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            i5 += abs;
            if (obj == null || r3 > i5) {
                i3 = i5;
                obj2 = obj3;
            } else {
                obj2 = obj;
            }
            i4++;
            obj = obj2;
        }
        return obj;
    }

    protected static C0295h m1564a(C0295h[] c0295hArr, int i) {
        return (C0295h) C0274j.m1565a((Object[]) c0295hArr, i, new C0279k());
    }

    protected static Typeface m1563a(Context context, InputStream inputStream) {
        Typeface typeface = null;
        File a = C0281n.m1592a(context);
        if (a != null) {
            try {
                if (C0281n.m1598a(a, inputStream)) {
                    typeface = Typeface.createFromFile(a.getPath());
                    a.delete();
                }
            } catch (RuntimeException e) {
            } finally {
                a.delete();
            }
        }
        return typeface;
    }

    public Typeface mo368a(Context context, C0295h[] c0295hArr, int i) {
        Closeable openInputStream;
        Throwable th;
        Typeface typeface = null;
        if (c0295hArr.length > 0) {
            try {
                openInputStream = context.getContentResolver().openInputStream(C0274j.m1564a(c0295hArr, i).f1680a);
                try {
                    typeface = C0274j.m1563a(context, (InputStream) openInputStream);
                    C0281n.m1596a(openInputStream);
                } catch (IOException e) {
                    C0281n.m1596a(openInputStream);
                    return typeface;
                } catch (Throwable th2) {
                    th = th2;
                    C0281n.m1596a(openInputStream);
                    throw th;
                }
            } catch (IOException e2) {
                openInputStream = typeface;
                C0281n.m1596a(openInputStream);
                return typeface;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                openInputStream = typeface;
                th = th4;
                C0281n.m1596a(openInputStream);
                throw th;
            }
        }
        return typeface;
    }

    public Typeface mo367a(Context context, C0203c c0203c, Resources resources, int i) {
        C0204d c0204d = (C0204d) C0274j.m1565a(c0203c.f1179a, i, new C0280l());
        if (c0204d == null) {
            return null;
        }
        return C0272e.m1557a(context, resources, c0204d.f1183d, c0204d.f1180a, i);
    }

    public Typeface mo366a(Context context, Resources resources, int i, String str, int i2) {
        Typeface typeface = null;
        File a = C0281n.m1592a(context);
        if (a != null) {
            try {
                if (C0281n.m1597a(a, resources, i)) {
                    typeface = Typeface.createFromFile(a.getPath());
                    a.delete();
                }
            } catch (RuntimeException e) {
            } finally {
                a.delete();
            }
        }
        return typeface;
    }
}
