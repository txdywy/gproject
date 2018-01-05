package org.chromium.net;

import org.chromium.base.ApplicationStatus;
import org.chromium.base.C7885d;
import org.chromium.base.C7895l;

public final class ao extends af implements C7885d {
    public boolean f40672b;

    protected final void mo6586a(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.mo6586a(networkChangeNotifierAutoDetect);
        ApplicationStatus.m37782a(this);
        int stateForApplication = ApplicationStatus.getStateForApplication();
        if (stateForApplication == 1) {
            m37935a();
        } else if (stateForApplication == 2) {
            this.f40659a.m37850a();
        }
    }

    protected final void mo6587b() {
        if (!this.f40672b) {
            C7895l c7895l = ApplicationStatus.f40484f;
            if (this != null) {
                int indexOf = c7895l.f40528a.indexOf(this);
                if (indexOf != -1) {
                    if (c7895l.f40529b == 0) {
                        c7895l.f40528a.remove(indexOf);
                    } else {
                        c7895l.f40531d = true;
                        c7895l.f40528a.set(indexOf, null);
                    }
                    c7895l.f40530c--;
                }
            }
            this.f40672b = true;
        }
    }
}
