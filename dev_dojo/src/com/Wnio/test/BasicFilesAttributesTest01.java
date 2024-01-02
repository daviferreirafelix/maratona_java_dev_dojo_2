package com.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFilesAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("home/arquivo.txt");
        FileTime fileTime = FileTime.from(LocalDateTime.now().minusDays(10).toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
    }
}
