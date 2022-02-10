package io.github.intellij.dlanguage.highlighting.annotation;

import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;

@Deprecated
public class Problems extends ArrayList<DProblem> {
    public Problems() {
        super();
    }

    public Problems(@NotNull final DProblem[] problems) {
        super(Arrays.asList(problems));
    }

    public void addAllNotNull(final Iterable<? extends DProblem> elements) {
        if (elements != null) {
            ContainerUtil.addAllNotNull(this, elements);
        }
    }
}
