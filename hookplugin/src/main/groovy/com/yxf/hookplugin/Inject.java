package com.yxf.hookplugin;

import java.io.File;

public interface Inject {
    boolean isInject(File file);

    byte[] injectClass(byte[] file);

    File injectJar(File file, File tempDir);
}
