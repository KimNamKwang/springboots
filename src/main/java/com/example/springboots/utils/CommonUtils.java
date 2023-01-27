package com.example.springboots.utils;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class CommonUtils {
    public String getUniqueSequence() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    // "src/main/resources/static/files/" -> root directory + 상대 경로
    public String getRelativeToAbsolutePath(String relativePath) {
        String relativePathWithSeparator = relativePath.replace("/", File.separator);
        /* linux와 Window인지 OS에 따라 경로를 수정해줌 */
        String absolutePath = new File(relativePathWithSeparator).getAbsolutePath() + File.separator;/* 폴더 경로 가져옴 */
        return absolutePath;
    }
}