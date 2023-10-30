{
  "filepath": "/tmp/Lang-18f/src/main/java/org/apache/commons/lang3/time/FastDateFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 70,
      "end_line": 1519,
      "comment": "\n * \u003cp\u003eFastDateFormat is a fast and thread-safe version of\n * {@link java.text.SimpleDateFormat}.\u003c/p\u003e\n *\n * \u003cp\u003eThis class can be used as a direct replacement to\n * {@code SimpleDateFormat} in most formatting situations.\n * This class is especially useful in multi-threaded server environments.\n * {@code SimpleDateFormat} is not thread-safe in any JDK version,\n * nor will it be as Sun have closed the bug/RFE.\n * \u003c/p\u003e\n *\n * \u003cp\u003eOnly formatting is supported, but all patterns are compatible with\n * SimpleDateFormat (except time zones and some year patterns - see below).\u003c/p\u003e\n *\n * \u003cp\u003eJava 1.4 introduced a new pattern letter, {@code \u0027Z\u0027}, to represent\n * time zones in RFC822 format (eg. {@code +0800} or {@code -1100}).\n * This pattern letter can be used here (on all JDK versions).\u003c/p\u003e\n *\n * \u003cp\u003eIn addition, the pattern {@code \u0027ZZ\u0027} has been made to represent\n * ISO8601 full format time zones (eg. {@code +08:00} or {@code -11:00}).\n * This introduces a minor incompatibility with Java 1.4, but at a gain of\n * useful functionality.\u003c/p\u003e\n *\n * \u003cp\u003eJavadoc cites for the year pattern: \u003ci\u003eFor formatting, if the number of\n * pattern letters is 2, the year is truncated to 2 digits; otherwise it is\n * interpreted as a number.\u003c/i\u003e Starting with Java 1.7 a pattern of \u0027Y\u0027 or\n * \u0027YYY\u0027 will be formatted as \u00272003\u0027, while it was \u002703\u0027 in former Java\n * versions. FastDateFormat implements the behavior of Java 7.\u003c/p\u003e\n *\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Required for serialization support.\n     *\n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * FULL locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONG"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * LONG locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MEDIUM"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * MEDIUM locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * SHORT locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cache"
      ],
      "begin_line": 107,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.Anonymous-81bc60bb-cc3d-496b-abe4-94d2cce7b882.createInstance(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 108,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cTimeZoneDisplayCache"
      ],
      "begin_line": 114,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mPattern"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * The pattern.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * The time zone.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * The locale.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRules"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * The parsed rules.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mMaxLengthEstimate"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * The estimated maximum length.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the default pattern in the\n     * default locale.\u003c/p\u003e\n     *\n     * @return a date/time formatter\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance(java.lang.String)",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern in the\n     * default locale.\u003c/p\u003e\n     *\n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance(java.lang.String, java.util.TimeZone)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern and\n     * time zone.\u003c/p\u003e\n     *\n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance(java.lang.String, java.util.Locale)",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern and\n     * locale.\u003c/p\u003e\n     *\n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param locale  optional locale, overrides system locale\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern, time zone\n     * and locale.\u003c/p\u003e\n     *\n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     *  or {@code null}\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateInstance(int)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style in the\n     * default time zone and locale.\u003c/p\u003e\n     *\n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateInstance(int, java.util.Locale)",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     *\n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateInstance(int, java.util.TimeZone)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     *\n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateInstance(int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style, time\n     * zone and locale.\u003c/p\u003e\n     *\n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(int)",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style in the\n     * default time zone and locale.\u003c/p\u003e\n     *\n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(int, java.util.Locale)",
      "begin_line": 296,
      "end_line": 298,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     *\n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(int, java.util.TimeZone)",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     *\n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted time\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style, time\n     * zone and locale.\u003c/p\u003e\n     *\n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted time\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(int, int)",
      "begin_line": 344,
      "end_line": 346,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style\n     * in the default time zone and locale.\u003c/p\u003e\n     *\n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(int, int, java.util.Locale)",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     *\n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(int, int, java.util.TimeZone)",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     *\n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(int, int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 393,
      "end_line": 396,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style,\n     * time zone and locale.\u003c/p\u003e\n     *\n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 408,
      "end_line": 420,
      "comment": "\n     * \u003cp\u003eGets the time zone display name, using a cache for performance.\u003c/p\u003e\n     *\n     * @param tz  the zone to query\n     * @param daylight  true if daylight savings\n     * @param style  the style to use {@code TimeZone.LONG} or {@code TimeZone.SHORT}\n     * @param locale  the locale to use\n     * @return the textual name of the time zone\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.FastDateFormat(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 432,
      "end_line": 438,
      "comment": "\n     * \u003cp\u003eConstructs a new FastDateFormat.\u003c/p\u003e\n     *\n     * @param pattern  {@link java.text.SimpleDateFormat} compatible pattern\n     * @param timeZone  non-null time zone to use\n     * @param locale  non-null locale to use\n     * @throws NullPointerException if pattern, timeZone, or locale is null.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.init()",
      "begin_line": 443,
      "end_line": 453,
      "comment": "\n     * \u003cp\u003eInitializes the instance for first use.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.parsePattern()",
      "begin_line": 463,
      "end_line": 584,
      "comment": "\n     * \u003cp\u003eReturns a list of Rules given a pattern.\u003c/p\u003e\n     *\n     * @return a {@code List} of Rule objects\n     * @throws IllegalArgumentException if pattern is invalid\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.parseToken(java.lang.String, int[])",
      "begin_line": 593,
      "end_line": 643,
      "comment": "\n     * \u003cp\u003ePerforms the parsing of tokens.\u003c/p\u003e\n     *\n     * @param pattern  the pattern\n     * @param indexRef  index references\n     * @return parsed token\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.selectNumberRule(int, int)",
      "begin_line": 652,
      "end_line": 661,
      "comment": "\n     * \u003cp\u003eGets an appropriate rule for the padding required.\u003c/p\u003e\n     *\n     * @param field  the field to get a rule for\n     * @param padding  the padding required\n     * @return a new rule with the correct padding\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 674,
      "end_line": 686,
      "comment": "\n     * \u003cp\u003eFormats a {@code Date}, {@code Calendar} or\n     * {@code Long} (milliseconds) object.\u003c/p\u003e\n     *\n     * @param obj  the object to format\n     * @param toAppendTo  the buffer to append to\n     * @param pos  the position - ignored\n     * @return the buffer passed in\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(long)",
      "begin_line": 695,
      "end_line": 697,
      "comment": "\n     * \u003cp\u003eFormats a millisecond {@code long} value.\u003c/p\u003e\n     *\n     * @param millis  the millisecond value to format\n     * @return the formatted string\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.util.Date)",
      "begin_line": 705,
      "end_line": 709,
      "comment": "\n     * \u003cp\u003eFormats a {@code Date} object using a {@code GregorianCalendar}.\u003c/p\u003e\n     *\n     * @param date  the date to format\n     * @return the formatted string\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.util.Calendar)",
      "begin_line": 717,
      "end_line": 719,
      "comment": "\n     * \u003cp\u003eFormats a {@code Calendar} object.\u003c/p\u003e\n     *\n     * @param calendar  the calendar to format\n     * @return the formatted string\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(long, java.lang.StringBuffer)",
      "begin_line": 730,
      "end_line": 732,
      "comment": "\n     * \u003cp\u003eFormats a milliseond {@code long} value into the\n     * supplied {@code StringBuffer}.\u003c/p\u003e\n     *\n     * @param millis  the millisecond value to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.util.Date, java.lang.StringBuffer)",
      "begin_line": 742,
      "end_line": 746,
      "comment": "\n     * \u003cp\u003eFormats a {@code Date} object into the\n     * supplied {@code StringBuffer} using a {@code GregorianCalendar}.\u003c/p\u003e\n     *\n     * @param date  the date to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 756,
      "end_line": 758,
      "comment": "\n     * \u003cp\u003eFormats a {@code Calendar} object into the\n     * supplied {@code StringBuffer}.\u003c/p\u003e\n     *\n     * @param calendar  the calendar to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.applyRules(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 768,
      "end_line": 773,
      "comment": "\n     * \u003cp\u003ePerforms the formatting by applying the rules to the\n     * specified calendar.\u003c/p\u003e\n     *\n     * @param calendar  the calendar to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 784,
      "end_line": 789,
      "comment": "\n     * \u003cp\u003eParsing is not supported.\u003c/p\u003e\n     *\n     * @param source  the string to parse\n     * @param pos  the parsing position\n     * @return {@code null} as not supported\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getPattern()",
      "begin_line": 798,
      "end_line": 800,
      "comment": "\n     * \u003cp\u003eGets the pattern used by this formatter.\u003c/p\u003e\n     *\n     * @return the pattern, {@link java.text.SimpleDateFormat} compatible\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeZone()",
      "begin_line": 809,
      "end_line": 811,
      "comment": "\n     * \u003cp\u003eGets the time zone used by this formatter.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis zone is always used for {@code Date} formatting. \u003c/p\u003e\n     *\n     * @return the time zone\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getLocale()",
      "begin_line": 818,
      "end_line": 820,
      "comment": "\n     * \u003cp\u003eGets the locale used by this formatter.\u003c/p\u003e\n     *\n     * @return the locale\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getMaxLengthEstimate()",
      "begin_line": 831,
      "end_line": 833,
      "comment": "\n     * \u003cp\u003eGets an estimate for the maximum string length that the\n     * formatter will produce.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual formatted length will almost always be less than or\n     * equal to this amount.\u003c/p\u003e\n     *\n     * @return the maximum formatted length\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.equals(java.lang.Object)",
      "begin_line": 843,
      "end_line": 852,
      "comment": "\n     * \u003cp\u003eCompares two objects for equality.\u003c/p\u003e\n     *\n     * @param obj  the object to compare to\n     * @return {@code true} if equal\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.hashCode()",
      "begin_line": 859,
      "end_line": 862,
      "comment": "\n     * \u003cp\u003eReturns a hashcode compatible with equals.\u003c/p\u003e\n     *\n     * @return a hashcode compatible with equals\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.toString()",
      "begin_line": 869,
      "end_line": 872,
      "comment": "\n     * \u003cp\u003eGets a debugging string version of this formatter.\u003c/p\u003e\n     *\n     * @return a debugging string\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.readObject(java.io.ObjectInputStream)",
      "begin_line": 884,
      "end_line": 887,
      "comment": "\n     * Create the object after serialization. This implementation reinitializes the\n     * transient properties.\n     *\n     * @param in ObjectInputStream from which the object is being deserialized.\n     * @throws IOException if there is an IO issue.\n     * @throws ClassNotFoundException if a class cannot be found.\n     "
    },
    {
      "type": "class_interface",
      "name": "Rule",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 894,
      "end_line": 909,
      "comment": "\n     * \u003cp\u003eInner class defining a rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.Rule.estimateLength()",
      "begin_line": 900,
      "end_line": 900,
      "comment": "\n         * Returns the estimated lentgh of the result.\n         *\n         * @return the estimated length\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.Rule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 908,
      "end_line": 908,
      "comment": "\n         * Appends the value of the specified calendar to the output buffer based on the rule implementation.\n         *\n         * @param buffer the output buffer\n         * @param calendar calendar to be appended\n         "
    },
    {
      "type": "class_interface",
      "name": "NumberRule",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 914,
      "end_line": 922,
      "comment": "\n     * \u003cp\u003eInner class defining a numeric rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.NumberRule.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 921,
      "end_line": 921,
      "comment": "\n         * Appends the specified value to the output buffer based on the rule implementation.\n         *\n         * @param buffer the output buffer\n         * @param value the value to be appended\n         "
    },
    {
      "type": "class_interface",
      "name": "CharacterLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 927,
      "end_line": 953,
      "comment": "\n     * \u003cp\u003eInner class to output a constant single character.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 928,
      "end_line": 928,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.CharacterLiteral.CharacterLiteral(char)",
      "begin_line": 936,
      "end_line": 938,
      "comment": "\n         * Constructs a new instance of {@code CharacterLiteral}\n         * to hold the specified value.\n         *\n         * @param value the character literal\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.CharacterLiteral.estimateLength()",
      "begin_line": 943,
      "end_line": 945,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.CharacterLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 950,
      "end_line": 952,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "StringLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 958,
      "end_line": 984,
      "comment": "\n     * \u003cp\u003eInner class to output a constant string.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 959,
      "end_line": 959,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.StringLiteral.StringLiteral(java.lang.String)",
      "begin_line": 967,
      "end_line": 969,
      "comment": "\n         * Constructs a new instance of {@code StringLiteral}\n         * to hold the specified value.\n         *\n         * @param value the string literal\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.StringLiteral.estimateLength()",
      "begin_line": 974,
      "end_line": 976,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.StringLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 981,
      "end_line": 983,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TextField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 989,
      "end_line": 1025,
      "comment": "\n     * \u003cp\u003eInner class to output one of a set of values.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 990,
      "end_line": 990,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mValues"
      ],
      "begin_line": 991,
      "end_line": 991,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TextField.TextField(int, java.lang.String[])",
      "begin_line": 1000,
      "end_line": 1003,
      "comment": "\n         * Constructs an instance of {@code TextField}\n         * with the specified field and values.\n         *\n         * @param field the field\n         * @param values the field values\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TextField.estimateLength()",
      "begin_line": 1008,
      "end_line": 1017,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TextField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1022,
      "end_line": 1024,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "UnpaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1030,
      "end_line": 1069,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1031,
      "end_line": 1031,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedNumberField.UnpaddedNumberField(int)",
      "begin_line": 1038,
      "end_line": 1040,
      "comment": "\n         * Constructs an instance of {@code UnpadedNumberField} with the specified field.\n         *\n         * @param field the field\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedNumberField.estimateLength()",
      "begin_line": 1045,
      "end_line": 1047,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1052,
      "end_line": 1054,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1059,
      "end_line": 1068,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "UnpaddedMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1074,
      "end_line": 1110,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1075,
      "end_line": 1075,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedMonthField.UnpaddedMonthField()",
      "begin_line": 1081,
      "end_line": 1083,
      "comment": "\n         * Constructs an instance of {@code UnpaddedMonthField}.\n         *\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedMonthField.estimateLength()",
      "begin_line": 1088,
      "end_line": 1090,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1095,
      "end_line": 1097,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1102,
      "end_line": 1109,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "PaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1115,
      "end_line": 1172,
      "comment": "\n     * \u003cp\u003eInner class to output a padded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1116,
      "end_line": 1116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mSize"
      ],
      "begin_line": 1117,
      "end_line": 1117,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.PaddedNumberField.PaddedNumberField(int, int)",
      "begin_line": 1125,
      "end_line": 1132,
      "comment": "\n         * Constructs an instance of {@code PaddedNumberField}.\n         *\n         * @param field the field\n         * @param size size of the output field\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.PaddedNumberField.estimateLength()",
      "begin_line": 1137,
      "end_line": 1139,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.PaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1144,
      "end_line": 1146,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.PaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1151,
      "end_line": 1171,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TwoDigitNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1177,
      "end_line": 1214,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1178,
      "end_line": 1178,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitNumberField.TwoDigitNumberField(int)",
      "begin_line": 1185,
      "end_line": 1187,
      "comment": "\n         * Constructs an instance of {@code TwoDigitNumberField} with the specified field.\n         *\n         * @param field the field\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitNumberField.estimateLength()",
      "begin_line": 1192,
      "end_line": 1194,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1199,
      "end_line": 1201,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1206,
      "end_line": 1213,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TwoDigitYearField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1219,
      "end_line": 1250,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit year.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1220,
      "end_line": 1220,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitYearField.TwoDigitYearField()",
      "begin_line": 1225,
      "end_line": 1227,
      "comment": "\n         * Constructs an instance of {@code TwoDigitYearField}.\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitYearField.estimateLength()",
      "begin_line": 1232,
      "end_line": 1234,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitYearField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1239,
      "end_line": 1241,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitYearField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1246,
      "end_line": 1249,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TwoDigitMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1255,
      "end_line": 1286,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1256,
      "end_line": 1256,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitMonthField.TwoDigitMonthField()",
      "begin_line": 1261,
      "end_line": 1263,
      "comment": "\n         * Constructs an instance of {@code TwoDigitMonthField}.\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitMonthField.estimateLength()",
      "begin_line": 1268,
      "end_line": 1270,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1275,
      "end_line": 1277,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1282,
      "end_line": 1285,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TwelveHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1291,
      "end_line": 1328,
      "comment": "\n     * \u003cp\u003eInner class to output the twelve hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 1292,
      "end_line": 1292,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwelveHourField.TwelveHourField(org.apache.commons.lang3.time.FastDateFormat.NumberRule)",
      "begin_line": 1300,
      "end_line": 1302,
      "comment": "\n         * Constructs an instance of {@code TwelveHourField} with the specified\n         * {@code NumberRule}.\n         *\n         * @param rule the rule\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwelveHourField.estimateLength()",
      "begin_line": 1307,
      "end_line": 1309,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwelveHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1314,
      "end_line": 1320,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwelveHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1325,
      "end_line": 1327,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TwentyFourHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1333,
      "end_line": 1370,
      "comment": "\n     * \u003cp\u003eInner class to output the twenty four hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 1334,
      "end_line": 1334,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwentyFourHourField.TwentyFourHourField(org.apache.commons.lang3.time.FastDateFormat.NumberRule)",
      "begin_line": 1342,
      "end_line": 1344,
      "comment": "\n         * Constructs an instance of {@code TwentyFourHourField} with the specified\n         * {@code NumberRule}.\n         *\n         * @param rule the rule\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwentyFourHourField.estimateLength()",
      "begin_line": 1349,
      "end_line": 1351,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwentyFourHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1356,
      "end_line": 1362,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwentyFourHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1367,
      "end_line": 1369,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNameRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 1375,
      "end_line": 1411,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone name.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1376,
      "end_line": 1376,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStandard"
      ],
      "begin_line": 1377,
      "end_line": 1377,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mDaylight"
      ],
      "begin_line": 1378,
      "end_line": 1378,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNameRule.TimeZoneNameRule(java.util.TimeZone, java.util.Locale, int)",
      "begin_line": 1387,
      "end_line": 1392,
      "comment": "\n         * Constructs an instance of {@code TimeZoneNameRule} with the specified properties.\n         *\n         * @param timeZone the time zone\n         * @param locale the locale\n         * @param style the style\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNameRule.estimateLength()",
      "begin_line": 1397,
      "end_line": 1399,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNameRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1404,
      "end_line": 1410,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNumberRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 1417,
      "end_line": 1464,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone as a number {@code +/-HHMM}\n     * or {@code +/-HH:MM}.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_COLON"
      ],
      "begin_line": 1418,
      "end_line": 1418,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_NO_COLON"
      ],
      "begin_line": 1419,
      "end_line": 1419,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mColon"
      ],
      "begin_line": 1421,
      "end_line": 1421,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNumberRule.TimeZoneNumberRule(boolean)",
      "begin_line": 1428,
      "end_line": 1430,
      "comment": "\n         * Constructs an instance of {@code TimeZoneNumberRule} with the specified properties.\n         *\n         * @param colon add colon between HH and MM in the output if {@code true}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNumberRule.estimateLength()",
      "begin_line": 1435,
      "end_line": 1437,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNumberRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1442,
      "end_line": 1463,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TimeZoneDisplayKey",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1470,
      "end_line": 1518,
      "comment": "\n     * \u003cp\u003eInner class that acts as a compound key for time zone names.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1471,
      "end_line": 1471,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStyle"
      ],
      "begin_line": 1472,
      "end_line": 1472,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 1473,
      "end_line": 1473,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneDisplayKey.TimeZoneDisplayKey(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 1483,
      "end_line": 1491,
      "comment": "\n         * Constructs an instance of {@code TimeZoneDisplayKey} with the specified properties.\n         *\n         * @param timeZone the time zone\n         * @param daylight adjust the style for daylight saving time if {@code true}\n         * @param style the timezone style\n         * @param locale the timezone locale\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneDisplayKey.hashCode()",
      "begin_line": 1496,
      "end_line": 1499,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneDisplayKey.equals(java.lang.Object)",
      "begin_line": 1504,
      "end_line": 1517,
      "comment": "\n         * {@inheritDoc}\n         "
    }
  ]
}