package io.github.intellij.dlanguage.psi;

import com.intellij.psi.PsiElement;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public interface DLanguageDeclaration extends PsiElement {

    @Nullable
    DLanguageAliasThisDeclaration getAliasThisDeclaration();

    @Nullable
    DLanguageAliasDeclaration getAliasDeclaration();

    @Nullable
    DLanguageClassDeclaration getClassDeclaration();

    @Nullable
    DLanguageConditionalDeclaration getConditionalDeclaration();

    @Nullable
    DLanguageConstructor getConstructor();

    @Nullable
    DLanguageDestructor getDestructor();

    @Nullable
    DLanguageAnonymousEnumDeclaration getAnonymousEnumDeclaration();

    @Nullable
    DLanguageEponymousTemplateDeclaration getEponymousTemplateDeclaration();

    @Nullable
    DLanguageEnumDeclaration getEnumDeclaration();

    @Nullable
    DLanguageImportDeclaration getImportDeclaration();

    @Nullable
    DLanguageInterfaceDeclaration getInterfaceDeclaration();

    @Nullable
    DLanguageMixinTemplateDeclaration getMixinTemplateDeclaration();

    @Nullable
    DLanguageMixinDeclaration getMixinDeclaration();

    @Nullable
    DLanguagePragmaDeclaration getPragmaDeclaration();

    @Nullable
    DLanguageSharedStaticConstructor getSharedStaticConstructor();

    @Nullable
    DLanguageSharedStaticDestructor getSharedStaticDestructor();

    @Nullable
    DLanguageStaticConstructor getStaticConstructor();

    @Nullable
    DLanguageStaticDestructor getStaticDestructor();

    @Nullable
    DLanguageStaticAssertDeclaration getStaticAssertDeclaration();

    @Nullable
    DLanguageStructDeclaration getStructDeclaration();

    @Nullable
    DLanguageTemplateDeclaration getTemplateDeclaration();

    @Nullable
    DLanguageUnionDeclaration getUnionDeclaration();

    @Nullable
    DLanguageInvariant getInvariant();

    @Nullable
    DLanguageUnittest getUnittest();

    @Nullable
    DLanguageVersionSpecification getVersionSpecification();

    @Nullable
    DLanguageDebugSpecification getDebugSpecification();

    @NotNull
    List<DLanguageAttribute> getAttributes();

    @NotNull
    List<DLanguageDeclaration> getDeclarations();

    @Nullable
    PsiElement getOP_BRACES_RIGHT();

    @Nullable
    PsiElement getOP_BRACES_LEFT();

    @Nullable
    DLanguageFunctionDeclaration getFunctionDeclaration();

    @Nullable
    DLanguageVariableDeclaration getVariableDeclaration();

    @Nullable
    DLanguageAttributeDeclaration getAttributeDeclaration();
}
