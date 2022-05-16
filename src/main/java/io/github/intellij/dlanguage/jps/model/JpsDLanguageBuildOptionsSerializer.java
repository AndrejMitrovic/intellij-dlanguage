package io.github.intellij.dlanguage.jps.model;

import com.intellij.util.xmlb.XmlSerializer;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.model.JpsProject;
import org.jetbrains.jps.model.serialization.JpsProjectExtensionSerializer;

public class JpsDLanguageBuildOptionsSerializer extends JpsProjectExtensionSerializer {
    public static final String DLANGUAGE_BUILD_OPTIONS_COMPONENT_NAME = "DLanguageBuildOptions";

    public JpsDLanguageBuildOptionsSerializer() {
        super("compiler.xml", DLANGUAGE_BUILD_OPTIONS_COMPONENT_NAME);
    }

    @Override
    public void loadExtension(@NotNull final JpsProject project, @NotNull final Element componentTag) {
        @NotNull final JpsDLanguageBuildOptionsExtension extension = JpsDLanguageBuildOptionsExtension.getOrCreateExtension(project);
        @NotNull final DLanguageBuildOptions options = XmlSerializer.deserialize(componentTag, DLanguageBuildOptions.class);
        extension.setOptions(options);
    }
}
