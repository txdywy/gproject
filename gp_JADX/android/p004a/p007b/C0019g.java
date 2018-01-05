package android.p004a.p007b;

import android.app.Fragment;
import android.os.Bundle;

public final class C0019g extends Fragment {
    public C0020h f40a;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C0020h c0020h = this.f40a;
        if (c0020h != null) {
            c0020h.m22a();
        }
        m21a(C0014b.ON_CREATE);
    }

    public final void onStart() {
        super.onStart();
        C0020h c0020h = this.f40a;
        if (c0020h != null) {
            c0020h.m23b();
        }
        m21a(C0014b.ON_START);
    }

    public final void onResume() {
        super.onResume();
        C0020h c0020h = this.f40a;
        if (c0020h != null) {
            c0020h.m24c();
        }
        m21a(C0014b.ON_RESUME);
    }

    public final void onPause() {
        super.onPause();
        m21a(C0014b.ON_PAUSE);
    }

    public final void onStop() {
        super.onStop();
        m21a(C0014b.ON_STOP);
    }

    public final void onDestroy() {
        super.onDestroy();
        m21a(C0014b.ON_DESTROY);
        this.f40a = null;
    }

    private final void m21a(C0014b c0014b) {
        if (getActivity() instanceof C0018f) {
            ((C0018f) getActivity()).m20a().m19a(c0014b);
        }
    }
}
