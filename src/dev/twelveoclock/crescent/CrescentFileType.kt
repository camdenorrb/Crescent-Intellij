package dev.twelveoclock.crescent

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object CrescentFileType : LanguageFileType(CrescentLanguage) {

    override fun getName(): String {
        return "Crescent File"
    }

    override fun getDescription(): String {
        return "Crescent language file"
    }

    override fun getDefaultExtension(): String {
        return "moon"
    }

    override fun getIcon(): Icon {
        return CrescentIcons.iconFile
    }

}