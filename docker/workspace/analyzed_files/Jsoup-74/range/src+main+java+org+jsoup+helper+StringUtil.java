{
  "filepath": "/tmp/Jsoup-74f/src/main/java/org/jsoup/helper/StringUtil.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtil",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 12,
      "end_line": 255,
      "comment": "\n * A minimal String utility class. Designed for internal jsoup use only.\n "
    },
    {
      "type": "field",
      "varNames": [
        "padding"
      ],
      "begin_line": 14,
      "end_line": 16,
      "comment": " memoised padding up to 21"
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.join(java.util.Collection, java.lang.String)",
      "begin_line": 24,
      "end_line": 26,
      "comment": "\n     * Join a collection of strings by a separator\n     * @param strings collection of string objects\n     * @param sep string to place between strings\n     * @return joined string\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.join(java.util.Iterator, java.lang.String)",
      "begin_line": 34,
      "end_line": 48,
      "comment": "\n     * Join a collection of strings by a separator\n     * @param strings iterator of string objects\n     * @param sep string to place between strings\n     * @return joined string\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.join(java.lang.String[], java.lang.String)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Join an array of strings by a separator\n     * @param strings collection of string objects\n     * @param sep string to place between strings\n     * @return joined string\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.padding(int)",
      "begin_line": 65,
      "end_line": 75,
      "comment": "\n     * Returns space padding\n     * @param width amount of padding desired\n     * @return string of spaces * width\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.isBlank(java.lang.String)",
      "begin_line": 82,
      "end_line": 92,
      "comment": "\n     * Tests if a string is blank: null, empty, or only whitespace (\" \", \\r\\n, \\t, etc)\n     * @param string string to test\n     * @return if string is blank\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.isNumeric(java.lang.String)",
      "begin_line": 99,
      "end_line": 109,
      "comment": "\n     * Tests if a string is numeric, i.e. contains only digit characters\n     * @param string string to test\n     * @return true if only digit chars, false if empty or null or contains non-digit chars\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.isWhitespace(int)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Tests if a code point is \"whitespace\" as defined in the HTML spec. Used for output HTML.\n     * @param c code point to test\n     * @return true if code point is whitespace, false otherwise\n     * @see #isActuallyWhitespace(int)\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.isActuallyWhitespace(int)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "\n     * Tests if a code point is \"whitespace\" as defined by what it looks like. Used for Element.text etc.\n     * @param c code point to test\n     * @return true if code point is whitespace, false otherwise\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.isInvisibleChar(int)",
      "begin_line": 131,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.normaliseWhitespace(java.lang.String)",
      "begin_line": 142,
      "end_line": 146,
      "comment": "\n     * Normalise the whitespace within this string; multiple spaces collapse to a single, and all whitespace characters\n     * (e.g. newline, tab) convert to a simple space\n     * @param string content to normalise\n     * @return normalised string\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.appendNormalisedWhitespace(java.lang.StringBuilder, java.lang.String, boolean)",
      "begin_line": 154,
      "end_line": 174,
      "comment": "\n     * After normalizing the whitespace within a string, appends it to a string builder.\n     * @param accum builder to append to\n     * @param string string to normalize whitespace within\n     * @param stripLeading set to true if you wish to remove any leading whitespace\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.in(java.lang.String, java.lang.String...)",
      "begin_line": 176,
      "end_line": 183,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.inSorted(java.lang.String, java.lang.String[])",
      "begin_line": 185,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.resolve(java.net.URL, java.lang.String)",
      "begin_line": 196,
      "end_line": 205,
      "comment": "\n     * Create a new absolute URL, from a provided existing absolute URL and a relative URL component.\n     * @param base the existing absolute base URL\n     * @param relUrl the relative URL to resolve. (If it\u0027s already absolute, it will be returned)\n     * @return the resolved absolute URL\n     * @throws MalformedURLException if an error occurred generating the URL\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.resolve(java.lang.String, java.lang.String)",
      "begin_line": 213,
      "end_line": 227,
      "comment": "\n     * Create a new absolute URL, from a provided existing absolute URL and a relative URL component.\n     * @param baseUrl the existing absolute base URL\n     * @param relUrl the relative URL to resolve. (If it\u0027s already absolute, it will be returned)\n     * @return an absolute URL if one was able to be generated, or the empty string if not\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.stringBuilder()",
      "begin_line": 234,
      "end_line": 244,
      "comment": "\n     * Maintains a cached StringBuilder, to minimize new StringBuilder GCs. Prevents it from growing to big per thread.\n     * Care must be taken to not grab more than one in the same stack (not locked or mutexed or anything).\n     * @return an empty StringBuilder\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MaxCachedBuilderSize"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stringLocal"
      ],
      "begin_line": 247,
      "end_line": 252,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.StringUtil.Anonymous-4fe2ef47-a47c-4f7e-953d-147470ecc9bd.initialValue()",
      "begin_line": 248,
      "end_line": 251,
      "comment": ""
    }
  ]
}