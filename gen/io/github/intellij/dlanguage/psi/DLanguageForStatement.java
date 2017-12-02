package io.github.intellij.dlanguage.psi;

import com.intellij.psi.PsiElement;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public interface DLanguageForStatement extends PsiElement {

    @NotNull
    List<DLanguageDeclarationOrStatement> getDeclarationOrStatements();

    @NotNull
    List<DLanguageExpression> getExpressions();

    @Nullable
    PsiElement getOP_BRACES_RIGHT();

    @Nullable
    PsiElement getOP_BRACES_LEFT();

    @Nullable
    PsiElement getKW_FOR();

    @Nullable
    PsiElement getOP_SCOLON();

}
