{
  "filepath": "/tmp/Lang-57f/src/java/org/apache/commons/lang/LocaleUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LocaleUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 291,
      "comment": "\n * \u003cp\u003eOperations to assist when working with a {@link Locale}.\u003c/p\u003e\n *\n * \u003cp\u003eThis class tries to handle \u003ccode\u003enull\u003c/code\u003e input gracefully.\n * An exception will not be thrown for a \u003ccode\u003enull\u003c/code\u003e input.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "cAvailableLocaleList"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Unmodifiable list of available locales. "
    },
    {
      "type": "field",
      "varNames": [
        "cAvailableLocaleSet"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Unmodifiable set of available locales. "
    },
    {
      "type": "field",
      "varNames": [
        "cLanguagesByCountry"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Unmodifiable map of language locales by country. "
    },
    {
      "type": "field",
      "varNames": [
        "cCountriesByLanguage"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Unmodifiable map of country locales by language. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.LocaleUtils.LocaleUtils()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eLocaleUtils\u003c/code\u003e instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eLocaleUtils.toLocale(\"en_GB\");\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtils.toLocale(java.lang.String)",
      "begin_line": 94,
      "end_line": 127,
      "comment": "\n     * \u003cp\u003eConverts a String to a Locale.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method takes the string format of a locale and creates the\n     * locale object from it.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   LocaleUtils.toLocale(\"en\")         \u003d new Locale(\"en\", \"\")\n     *   LocaleUtils.toLocale(\"en_GB\")      \u003d new Locale(\"en\", \"GB\")\n     *   LocaleUtils.toLocale(\"en_GB_xxx\")  \u003d new Locale(\"en\", \"GB\", \"xxx\")   (#)\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e(#) The behaviour of the JDK variant constructor changed between JDK1.3 and JDK1.4.\n     * In JDK1.3, the constructor upper cases the variant, in JDK1.4, it doesn\u0027t.\n     * Thus, the result from getVariant() may vary depending on your JDK.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method validates the input strictly.\n     * The language code must be lowercase.\n     * The country code must be uppercase.\n     * The separator must be an underscore.\n     * The length must be correct.\n     * \u003c/p\u003e\n     *\n     * @param str  the locale String to convert, null returns null\n     * @return a Locale, null if null input\n     * @throws IllegalArgumentException if the string is an invalid format\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtils.localeLookupList(java.util.Locale)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * \u003cp\u003eObtains the list of locales to search through when performing\n     * a locale search.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * localeLookupList(Locale(\"fr\",\"CA\",\"xxx\"))\n     *   \u003d [Locale(\"fr\",\"CA\",\"xxx\"), Locale(\"fr\",\"CA\"), Locale(\"fr\")]\n     * \u003c/pre\u003e\n     *\n     * @param locale  the locale to start from\n     * @return the unmodifiable list of Locale objects, 0 being locale, never null\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtils.localeLookupList(java.util.Locale, java.util.Locale)",
      "begin_line": 164,
      "end_line": 179,
      "comment": "\n     * \u003cp\u003eObtains the list of locales to search through when performing\n     * a locale search.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * localeLookupList(Locale(\"fr\", \"CA\", \"xxx\"), Locale(\"en\"))\n     *   \u003d [Locale(\"fr\",\"CA\",\"xxx\"), Locale(\"fr\",\"CA\"), Locale(\"fr\"), Locale(\"en\"]\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eThe result list begins with the most specific locale, then the\n     * next more general and so on, finishing with the default locale.\n     * The list will never contain the same locale twice.\u003c/p\u003e\n     *\n     * @param locale  the locale to start from, null returns empty list\n     * @param defaultLocale  the default locale to use if no other is found\n     * @return the unmodifiable list of Locale objects, 0 being locale, never null\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtils.availableLocaleList()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * \u003cp\u003eObtains an unmodifiable list of installed locales.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method is a wrapper around {@link Locale#getAvailableLocales()}.\n     * It is more efficient, as the JDK method must create a new array each\n     * time it is called.\u003c/p\u003e\n     *\n     * @return the unmodifiable list of available locales\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtils.availableLocaleSet()",
      "begin_line": 205,
      "end_line": 213,
      "comment": "\n     * \u003cp\u003eObtains an unmodifiable set of installed locales.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method is a wrapper around {@link Locale#getAvailableLocales()}.\n     * It is more efficient, as the JDK method must create a new array each\n     * time it is called.\u003c/p\u003e\n     *\n     * @return the unmodifiable set of available locales\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtils.isAvailableLocale(java.util.Locale)",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * \u003cp\u003eChecks if the locale specified is in the list of available locales.\u003c/p\u003e\n     *\n     * @param locale the Locale object to check if it is available\n     * @return true if the locale is a known locale\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtils.languagesByCountry(java.lang.String)",
      "begin_line": 236,
      "end_line": 256,
      "comment": "\n     * \u003cp\u003eObtains the list of languages supported for a given country.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method takes a country code and searches to find the\n     * languages available for that country. Variant locales are removed.\u003c/p\u003e\n     *\n     * @param countryCode  the 2 letter country code, null returns empty\n     * @return an unmodifiable List of Locale objects, never null\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.LocaleUtils.countriesByLanguage(java.lang.String)",
      "begin_line": 268,
      "end_line": 289,
      "comment": "\n     * \u003cp\u003eObtains the list of countries supported for a given language.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method takes a language code and searches to find the\n     * countries available for that language. Variant locales are removed.\u003c/p\u003e\n     *\n     * @param languageCode  the 2 letter language code, null returns empty\n     * @return an unmodifiable List of Locale objects, never null\n     "
    }
  ]
}