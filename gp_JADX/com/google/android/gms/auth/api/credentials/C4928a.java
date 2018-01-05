package com.google.android.gms.auth.api.credentials;

import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.PasswordSpecification.InvalidSpecificationError;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public final class C4928a {
    public final TreeSet f25355a = new TreeSet();
    public final List f25356b = new ArrayList();
    public final List f25357c = new ArrayList();
    public int f25358d = 12;
    public int f25359e = 16;

    private static TreeSet m22940a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new InvalidSpecificationError(String.valueOf(str2).concat(" cannot be null or empty"));
        }
        TreeSet treeSet = new TreeSet();
        for (int i : str.toCharArray()) {
            if (PasswordSpecification.m22939a(i)) {
                throw new InvalidSpecificationError(String.valueOf(str2).concat(" must only contain ASCII printable characters"));
            }
            treeSet.add(Character.valueOf(i));
        }
        return treeSet;
    }

    public final C4928a m22941a() {
        this.f25358d = 12;
        this.f25359e = 16;
        return this;
    }

    public final C4928a m22942a(String str) {
        this.f25355a.addAll(C4928a.m22940a(str, "allowedChars"));
        return this;
    }

    public final PasswordSpecification m22943b() {
        if (this.f25355a.isEmpty()) {
            throw new InvalidSpecificationError("no allowed characters specified");
        }
        int i = 0;
        for (Integer intValue : this.f25357c) {
            i = intValue.intValue() + i;
        }
        if (i > this.f25359e) {
            throw new InvalidSpecificationError("required character count cannot be greater than the max password size");
        }
        boolean[] zArr = new boolean[95];
        for (String toCharArray : this.f25356b) {
            for (char c : toCharArray.toCharArray()) {
                if (zArr[c - 32]) {
                    throw new InvalidSpecificationError("character " + c + " occurs in more than one required character set");
                }
                zArr[c - 32] = true;
            }
        }
        return new PasswordSpecification(PasswordSpecification.m22938a(this.f25355a), this.f25356b, this.f25357c, this.f25358d, this.f25359e);
    }

    public final C4928a m22944b(String str) {
        this.f25356b.add(PasswordSpecification.m22938a(C4928a.m22940a(str, "requiredChars")));
        this.f25357c.add(Integer.valueOf(1));
        return this;
    }
}
