package com.google.android.instantapps.common.p217e;

public final class C5740b extends br {
    public String f29060a;
    public String f29061b;
    public Boolean f29062c;
    public Boolean f29063d;
    public Boolean f29064e;
    public Boolean f29065f;
    public Boolean f29066g;

    public final br mo5151a(String str) {
        if (str == null) {
            throw new NullPointerException("Null loadingPackageName");
        }
        this.f29060a = str;
        return this;
    }

    public final br mo5154b(String str) {
        if (str == null) {
            throw new NullPointerException("Null callingPackageName");
        }
        this.f29061b = str;
        return this;
    }

    public final br mo5152a(boolean z) {
        this.f29062c = Boolean.valueOf(z);
        return this;
    }

    public final br mo5150a() {
        this.f29063d = Boolean.valueOf(false);
        return this;
    }

    public final br mo5155b(boolean z) {
        this.f29064e = Boolean.valueOf(z);
        return this;
    }

    public final br mo5156c(boolean z) {
        this.f29065f = Boolean.valueOf(z);
        return this;
    }

    public final br mo5157d(boolean z) {
        this.f29066g = Boolean.valueOf(z);
        return this;
    }

    public final bq mo5153b() {
        String str = "";
        if (this.f29060a == null) {
            str = String.valueOf(str).concat(" loadingPackageName");
        }
        if (this.f29061b == null) {
            str = String.valueOf(str).concat(" callingPackageName");
        }
        if (this.f29062c == null) {
            str = String.valueOf(str).concat(" optedInJustNow");
        }
        if (this.f29063d == null) {
            str = String.valueOf(str).concat(" isNfc");
        }
        if (this.f29064e == null) {
            str = String.valueOf(str).concat(" isUserConfirmedLaunch");
        }
        if (this.f29065f == null) {
            str = String.valueOf(str).concat(" isInternalNavigation");
        }
        if (this.f29066g == null) {
            str = String.valueOf(str).concat(" isPreviouslyLaunched");
        }
        if (str.isEmpty()) {
            return new C5739a(this.f29060a, this.f29061b, this.f29062c.booleanValue(), this.f29063d.booleanValue(), this.f29064e.booleanValue(), this.f29065f.booleanValue(), this.f29066g.booleanValue());
        }
        String str2 = "Missing required properties:";
        str = String.valueOf(str);
        throw new IllegalStateException(str.length() != 0 ? str2.concat(str) : new String(str2));
    }
}
