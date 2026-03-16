package org.openpolicyagent.ideaplugin.lsp

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import org.openpolicyagent.ideaplugin.OpaTestBase

class RegalSemanticTokensColorsProviderTest : OpaTestBase() {

    private val provider = RegalSemanticTokensColorsProvider()

    private fun psiFile() = myFixture.configureByText("test.rego", "package test")

    fun `test variable declaration token maps to CONSTANT`() {
        val key = provider.getTextAttributesKey("variable", listOf("declaration"), psiFile())
        assertEquals(DefaultLanguageHighlighterColors.CONSTANT, key)
    }

    fun `test variable reference token maps to CONSTANT`() {
        val key = provider.getTextAttributesKey("variable", listOf("reference"), psiFile())
        assertEquals(DefaultLanguageHighlighterColors.CONSTANT, key)
    }

    fun `test namespace token maps to STRING`() {
        val key = provider.getTextAttributesKey("namespace", emptyList(), psiFile())
        assertEquals(DefaultLanguageHighlighterColors.STRING, key)
    }

    fun `test unknown token type returns null`() {
        val key = provider.getTextAttributesKey("unknown", emptyList(), psiFile())
        assertNull(key)
    }
}
