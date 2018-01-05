package android.support.p017d;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

final class C0088b {
    static void m192a(ClassLoader classLoader, List list, File file) {
        Object obj = C0087a.m184a((Object) classLoader, "pathList").get(classLoader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        C0087a.m188a(obj, "dexElements", (Object[]) C0087a.m185a(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, new Object[]{arrayList2, file, arrayList}));
        if (arrayList.size() > 0) {
            Object obj2;
            Object obj3;
            arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                obj2 = arrayList2.get(i);
                i++;
                Log.w("MultiDex", "Exception in makeDexElement", (IOException) obj2);
            }
            Field a = C0087a.m184a(obj, "dexElementsSuppressedExceptions");
            IOException[] iOExceptionArr = (IOException[]) a.get(obj);
            if (iOExceptionArr == null) {
                obj3 = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
            } else {
                obj2 = new IOException[(arrayList.size() + iOExceptionArr.length)];
                arrayList.toArray(obj2);
                System.arraycopy(iOExceptionArr, 0, obj2, arrayList.size(), iOExceptionArr.length);
                obj3 = obj2;
            }
            a.set(obj, obj3);
        }
    }
}
