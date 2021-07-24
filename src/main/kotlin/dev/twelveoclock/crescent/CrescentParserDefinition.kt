package dev.twelveoclock.crescent

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class CrescentParserDefinition : ParserDefinition {
    override fun createLexer(p0: Project?): Lexer {
        TODO("Not yet implemented")
    }

    override fun createParser(p0: Project?): PsiParser {
        TODO("Not yet implemented")
    }

    override fun getFileNodeType(): IFileElementType {
        TODO("Not yet implemented")
    }

    override fun getCommentTokens(): TokenSet {
        TODO("Not yet implemented")
    }

    override fun getStringLiteralElements(): TokenSet {
        TODO("Not yet implemented")
    }

    override fun createElement(p0: ASTNode?): PsiElement {
        TODO("Not yet implemented")
    }

    override fun createFile(p0: FileViewProvider): PsiFile {
        TODO("Not yet implemented")
    }
}