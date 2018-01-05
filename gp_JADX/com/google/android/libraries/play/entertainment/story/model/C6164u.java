package com.google.android.libraries.play.entertainment.story.model;

import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.libraries.play.entertainment.p191c.C2993b;
import com.google.android.libraries.play.entertainment.p196j.C3006a;
import com.google.android.libraries.play.entertainment.story.C6127s;

public final class C6164u {
    public final C6127s f30666a;
    public final C3006a f30667b;
    public final C2993b f30668c;
    public final SparseArray f30669d = new SparseArray();

    C6164u(C6127s c6127s, C3006a c3006a, C2993b c2993b, Parcelable[] parcelableArr) {
        this.f30666a = c6127s;
        this.f30667b = c3006a;
        this.f30668c = c2993b;
        if (parcelableArr instanceof StateSaver[]) {
            for (StateSaver stateSaver : (StateSaver[]) parcelableArr) {
                this.f30669d.put(stateSaver.f30523a, stateSaver);
            }
        }
    }
}
