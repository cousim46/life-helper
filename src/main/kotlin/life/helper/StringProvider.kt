fun String.replaceSpecialWordToBlank(specialWord: String): String = this.replace(Regex("[$specialWord]+"), "")
