{
  "filepath": "/tmp/Lang-63f/src/java/org/apache/commons/lang/time/DurationFormatUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DurationFormatUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 618,
      "comment": "\n * \u003cp\u003eDuration formatting utilities and constants. The following table describes the tokens \n * used in the pattern language for formatting. \u003c/p\u003e\n * \u003ctable border\u003d\"1\"\u003e\n *  \u003ctr\u003e\u003cth\u003echaracter\u003c/th\u003e\u003cth\u003eduration element\u003c/th\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003ey\u003c/td\u003e\u003ctd\u003eyears\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003eM\u003c/td\u003e\u003ctd\u003emonths\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003ed\u003c/td\u003e\u003ctd\u003edays\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003eH\u003c/td\u003e\u003ctd\u003ehours\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003em\u003c/td\u003e\u003ctd\u003eminutes\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003es\u003c/td\u003e\u003ctd\u003eseconds\u003c/td\u003e\u003c/tr\u003e\n *  \u003ctr\u003e\u003ctd\u003eS\u003c/td\u003e\u003ctd\u003emilliseconds\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n *\n * @author Apache Ant - DateUtils\n * @author \u003ca href\u003d\"mailto:sbailliez@apache.org\"\u003eStephane Bailliez\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:stefan.bodewig@epost.de\"\u003eStefan Bodewig\u003c/a\u003e\n * @author Stephen Colebourne\n * @author \u003ca href\u003d\"mailto:ggregory@seagullsw.com\"\u003eGary Gregory\u003c/a\u003e\n * @author Henri Yandell\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.DurationFormatUtils()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * \u003cp\u003eDurationFormatUtils instances should NOT be constructed in standard programming.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ISO_EXTENDED_FORMAT_PATTERN"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * \u003cp\u003ePattern used with \u003ccode\u003eFastDateFormat\u003c/code\u003e and \u003ccode\u003eSimpleDateFormat\u003c/code\u003e\n     * for the ISO8601 period format used in durations.\u003c/p\u003e\n     * \n     * @see org.apache.commons.lang.time.FastDateFormat\n     * @see java.text.SimpleDateFormat\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS(long)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format used is ISO8601-like:\n     * \u003ci\u003eH\u003c/i\u003e:\u003ci\u003em\u003c/i\u003e:\u003ci\u003es\u003c/i\u003e.\u003ci\u003eS\u003c/i\u003e.\u003c/p\u003e\n     * \n     * @param durationMillis  the duration to format\n     * @return the time as a String\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO(long)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format used is the ISO8601 period format.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method formats durations using the days and lower fields of the\n     * ISO format pattern, such as P7D6TH5M4.321S.\u003c/p\u003e\n     * \n     * @param durationMillis  the duration to format\n     * @return the time as a String\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.formatDuration(long, java.lang.String)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string, using the specified format, and padding with zeros and \n     * using the default timezone.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method formats durations using the days and lower fields of the\n     * format pattern. Months and larger are not used.\u003c/p\u003e\n     * \n     * @param durationMillis  the duration to format\n     * @param format  the way in which to format the duration\n     * @return the time as a String\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.formatDuration(long, java.lang.String, boolean)",
      "begin_line": 126,
      "end_line": 157,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string, using the specified format.\n     * Padding the left hand side of numbers with zeroes is optional and \n     * the timezone may be specified.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method formats durations using the days and lower fields of the\n     * format pattern. Months and larger are not used.\u003c/p\u003e\n     * \n     * @param durationMillis  the duration to format\n     * @param format  the way in which to format the duration\n     * @param padWithZeros  whether to pad the left hand side of numbers with 0\u0027s\n     * @return the time as a String\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords(long, boolean, boolean)",
      "begin_line": 170,
      "end_line": 221,
      "comment": "\n     * \u003cp\u003eFormats an elapsed time into a plurialization correct string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method formats durations using the days and lower fields of the\n     * format pattern. Months and larger are not used.\u003c/p\u003e\n     * \n     * @param durationMillis  the elapsed time to report in milliseconds\n     * @param suppressLeadingZeroElements  suppresses leading 0 elements\n     * @param suppressTrailingZeroElements  suppresses trailing 0 elements\n     * @return the formatted text in days/hours/minutes/seconds\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(long, long)",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe format used is the ISO8601 period format.\u003c/p\u003e\n     * \n     * @param startMillis  the start of the duration to format\n     * @param endMillis  the end of the duration to format\n     * @return the time as a String\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(long, long, java.lang.String)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string, using the specified format.\n     * Padding the left hand side of numbers with zeroes is optional.\n     * \n     * @param startMillis  the start of the duration\n     * @param endMillis  the end of the duration\n     * @param format  the way in which to format the duration\n     * @return the time as a String\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(long, long, java.lang.String, boolean, java.util.TimeZone)",
      "begin_line": 262,
      "end_line": 356,
      "comment": "\n     * \u003cp\u003eFormats the time gap as a string, using the specified format.\n     * Padding the left hand side of numbers with zeroes is optional and \n     * the timezone may be specified. \n     * \n     * @param startMillis  the start of the duration\n     * @param endMillis  the end of the duration\n     * @param format  the way in which to format the duration\n     * @param padWithZeros whether to pad the left hand side of numbers with 0\u0027s\n     * @param timezone the millis are defined in\n     * @return the time as a String\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.format(org.apache.commons.lang.time.DurationFormatUtils.Token[], int, int, int, int, int, int, int, boolean)",
      "begin_line": 373,
      "end_line": 426,
      "comment": "\n     * \u003cp\u003eThe internal method to do the formatting.\u003c/p\u003e\n     * \n     * @param tokens  the tokens\n     * @param years  the number of years\n     * @param months  the number of months\n     * @param days  the number of days\n     * @param hours  the number of hours\n     * @param minutes  the number of minutes\n     * @param seconds  the number of seconds\n     * @param milliseconds  the number of millis\n     * @param padWithZeros  whether to pad\n     * @return the formetted string\n     "
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 428,
      "end_line": 428,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "M"
      ],
      "begin_line": 429,
      "end_line": 429,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "d"
      ],
      "begin_line": 430,
      "end_line": 430,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "H"
      ],
      "begin_line": 431,
      "end_line": 431,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 432,
      "end_line": 432,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "s"
      ],
      "begin_line": 433,
      "end_line": 433,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "S"
      ],
      "begin_line": 434,
      "end_line": 434,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.lexx(java.lang.String)",
      "begin_line": 442,
      "end_line": 496,
      "comment": "\n     * Parses a classic date format string into Tokens\n     *\n     * @param format to parse\n     * @return Token[] of tokens\n     "
    },
    {
      "type": "class_interface",
      "name": "Token",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 501,
      "end_line": 616,
      "comment": "\n     * Element that is parsed from the format pattern.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.Token.containsTokenWithValue(org.apache.commons.lang.time.DurationFormatUtils.Token[], java.lang.Object)",
      "begin_line": 510,
      "end_line": 518,
      "comment": "\n         * Helper method to determine if a set of tokens contain a value\n         *\n         * @param tokens set to look in\n         * @param value to look for\n         * @return boolean \u003ccode\u003etrue\u003c/code\u003e if contained\n         "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 520,
      "end_line": 520,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "count"
      ],
      "begin_line": 521,
      "end_line": 521,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.Token.Token(java.lang.Object)",
      "begin_line": 528,
      "end_line": 531,
      "comment": "\n         * Wraps a token around a value. A value would be something like a \u0027Y\u0027.\n         *\n         * @param value to wrap\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.Token.Token(java.lang.Object, int)",
      "begin_line": 540,
      "end_line": 543,
      "comment": "\n         * Wraps a token around a repeated number of a value, for example it would \n         * store \u0027yyyy\u0027 as a value for y and a count of 4.\n         *\n         * @param value to wrap\n         * @param count to wrap\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.Token.increment()",
      "begin_line": 548,
      "end_line": 550,
      "comment": "\n         * Adds another one of the value\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.Token.getCount()",
      "begin_line": 557,
      "end_line": 559,
      "comment": "\n         * Gets the current number of values represented\n         *\n         * @return int number of values represented\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.Token.getValue()",
      "begin_line": 566,
      "end_line": 568,
      "comment": "\n         * Gets the particular value this token represents.\n         * \n         * @return Object value\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.Token.equals(java.lang.Object)",
      "begin_line": 576,
      "end_line": 595,
      "comment": "\n         * Supports equality of this Token to another Token.\n         *\n         * @param obj2 Object to consider equality of\n         * @return boolean \u003ccode\u003etrue\u003c/code\u003e if equal\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.Token.hashCode()",
      "begin_line": 604,
      "end_line": 606,
      "comment": "\n         * Returns a hashcode for the token equal to the \n         * hashcode for the token\u0027s value. Thus \u0027TT\u0027 and \u0027TTTT\u0027 \n         * will have the same hashcode. \n         *\n         * @return The hashcode for the token\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.time.DurationFormatUtils.Token.toString()",
      "begin_line": 613,
      "end_line": 615,
      "comment": "\n         * Represents this token as a String.\n         *\n         * @return String representation of the token\n         "
    }
  ]
}