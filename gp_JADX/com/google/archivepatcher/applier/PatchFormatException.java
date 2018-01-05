package com.google.archivepatcher.applier;

import java.io.IOException;

public class PatchFormatException extends IOException {
    public PatchFormatException(String str) {
        super(str);
    }
}
