package dev.twelveoclock.crescent.psi

import com.intellij.psi.tree.IElementType
import dev.twelveoclock.crescent.CrescentLanguage

class CrescentTokenType(debugName: String) : IElementType(debugName, CrescentLanguage) {

    override fun toString(): String {
        return "CrescentTokenType.${super.toString()}"
    }

}