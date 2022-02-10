package io.github.intellij.dlanguage.highlighting.annotation;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public abstract class DProblem {
    public int startLine;
    public int startColumn;

    public abstract void createAnnotations(@NotNull PsiFile file, @NotNull AnnotationHolder holder);

    public int getOffsetStart(final String fileText) {
        return StringUtil.lineColToOffset(fileText, startLine - 1, startColumn - 1);
    }
}

