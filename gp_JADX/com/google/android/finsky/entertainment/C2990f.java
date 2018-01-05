package com.google.android.finsky.entertainment;

import com.google.android.finsky.api.C1286g;
import com.google.android.libraries.play.entertainment.p192l.C2989f;
import com.google.android.libraries.play.entertainment.p192l.C6101b;
import com.google.android.libraries.play.entertainment.p192l.C6109a;
import com.google.android.libraries.play.entertainment.story.bc;

final class C2990f implements C2989f {
    C2990f() {
    }

    public final String mo3221a(C6101b c6101b) {
        switch (c6101b.mo5294a()) {
            case 0:
                return ((C6109a) c6101b).b;
            case 1:
                return C1286g.at.buildUpon().appendQueryParameter("storyid", ((bc) c6101b).b).toString();
            default:
                String valueOf = String.valueOf(c6101b);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 34).append("Unrecognized blobType for blobId: ").append(valueOf).toString());
        }
    }
}
