{
  "filepath": "/tmp/Lang-26f/src/main/java/org/apache/commons/lang3/time/FastDateFormat.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDateFormat",
      "is_interface": false,
      "parent_types": [
        "java.text.Format"
      ],
      "begin_line": 71,
      "end_line": 1757,
      "comment": "\n * \u003cp\u003eFastDateFormat is a fast and thread-safe version of\n * {@link java.text.SimpleDateFormat}.\u003c/p\u003e\n * \n * \u003cp\u003eThis class can be used as a direct replacement to\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e in most formatting situations.\n * This class is especially useful in multi-threaded server environments.\n * \u003ccode\u003eSimpleDateFormat\u003c/code\u003e is not thread-safe in any JDK version,\n * nor will it be as Sun have closed the bug/RFE.\n * \u003c/p\u003e\n *\n * \u003cp\u003eOnly formatting is supported, but all patterns are compatible with\n * SimpleDateFormat (except time zones - see below).\u003c/p\u003e\n *\n * \u003cp\u003eJava 1.4 introduced a new pattern letter, \u003ccode\u003e\u0027Z\u0027\u003c/code\u003e, to represent\n * time zones in RFC822 format (eg. \u003ccode\u003e+0800\u003c/code\u003e or \u003ccode\u003e-1100\u003c/code\u003e).\n * This pattern letter can be used here (on all JDK versions).\u003c/p\u003e\n *\n * \u003cp\u003eIn addition, the pattern \u003ccode\u003e\u0027ZZ\u0027\u003c/code\u003e has been made to represent\n * ISO8601 full format time zones (eg. \u003ccode\u003e+08:00\u003c/code\u003e or \u003ccode\u003e-11:00\u003c/code\u003e).\n * This introduces a minor incompatibility with Java 1.4, but at a gain of\n * useful functionality.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author TeaTrove project\n * @author Brian S O\u0027Neill\n * @author Sean Schofield\n * @author Gary Gregory\n * @author Nikolay Metchev\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * FULL locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONG"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * LONG locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MEDIUM"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * MEDIUM locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * SHORT locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cDefaultPattern"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " lazily initialised by getInstance()"
    },
    {
      "type": "field",
      "varNames": [
        "cInstanceCache"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cDateInstanceCache"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cTimeInstanceCache"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cDateTimeInstanceCache"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cTimeZoneDisplayCache"
      ],
      "begin_line": 115,
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
        "mTimeZoneForced"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * Whether the time zone overrides any on Calendars.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * The locale.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mLocaleForced"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * Whether the locale overrides the default.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRules"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     * The parsed rules.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mMaxLengthEstimate"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * The estimated maximum length.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the default pattern in the\n     * default locale.\u003c/p\u003e\n     * \n     * @return a date/time formatter\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance(java.lang.String)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern in the\n     * default locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance(java.lang.String, java.util.TimeZone)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern and\n     * time zone.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance(java.lang.String, java.util.Locale)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern and\n     * locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param locale  optional locale, overrides system locale\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getInstance(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 212,
      "end_line": 221,
      "comment": "\n     * \u003cp\u003eGets a formatter instance using the specified pattern, time zone\n     * and locale.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a pattern based date/time formatter\n     * @throws IllegalArgumentException if pattern is invalid\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateInstance(int)",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style in the\n     * default time zone and locale.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateInstance(int, java.util.Locale)",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateInstance(int, java.util.TimeZone)",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateInstance(int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 280,
      "end_line": 305,
      "comment": "\n     * \u003cp\u003eGets a date formatter instance using the specified style, time\n     * zone and locale.\u003c/p\u003e\n     * \n     * @param style  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date formatter\n     * @throws IllegalArgumentException if the Locale has no date\n     *  pattern defined\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(int)",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style in the\n     * default time zone and locale.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(int, java.util.Locale)",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(int, java.util.TimeZone)",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted time\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 365,
      "end_line": 391,
      "comment": "\n     * \u003cp\u003eGets a time formatter instance using the specified style, time\n     * zone and locale.\u003c/p\u003e\n     * \n     * @param style  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted time\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard time formatter\n     * @throws IllegalArgumentException if the Locale has no time\n     *  pattern defined\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(int, int)",
      "begin_line": 405,
      "end_line": 408,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style\n     * in the default time zone and locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(int, int, java.util.Locale)",
      "begin_line": 422,
      "end_line": 425,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style and\n     * locale in the default time zone.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(int, int, java.util.TimeZone)",
      "begin_line": 440,
      "end_line": 443,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style and\n     * time zone in the default locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(int, int, java.util.TimeZone, java.util.Locale)",
      "begin_line": 457,
      "end_line": 483,
      "comment": "\n     * \u003cp\u003eGets a date/time formatter instance using the specified style,\n     * time zone and locale.\u003c/p\u003e\n     * \n     * @param dateStyle  date style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeStyle  time style: FULL, LONG, MEDIUM, or SHORT\n     * @param timeZone  optional time zone, overrides time zone of\n     *  formatted date\n     * @param locale  optional locale, overrides system locale\n     * @return a localized standard date/time formatter\n     * @throws IllegalArgumentException if the Locale has no date/time\n     *  pattern defined\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 496,
      "end_line": 505,
      "comment": "\n     * \u003cp\u003eGets the time zone display name, using a cache for performance.\u003c/p\u003e\n     * \n     * @param tz  the zone to query\n     * @param daylight  true if daylight savings\n     * @param style  the style to use \u003ccode\u003eTimeZone.LONG\u003c/code\u003e\n     *  or \u003ccode\u003eTimeZone.SHORT\u003c/code\u003e\n     * @param locale  the locale to use\n     * @return the textual name of the time zone\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getDefaultPattern()",
      "begin_line": 512,
      "end_line": 517,
      "comment": "\n     * \u003cp\u003eGets the default pattern.\u003c/p\u003e\n     * \n     * @return the default pattern\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.FastDateFormat(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 534,
      "end_line": 552,
      "comment": "\n     * \u003cp\u003eConstructs a new FastDateFormat.\u003c/p\u003e\n     * \n     * @param pattern  {@link java.text.SimpleDateFormat} compatible\n     *  pattern\n     * @param timeZone  time zone to use, \u003ccode\u003enull\u003c/code\u003e means use\n     *  default for \u003ccode\u003eDate\u003c/code\u003e and value within for\n     *  \u003ccode\u003eCalendar\u003c/code\u003e\n     * @param locale  locale, \u003ccode\u003enull\u003c/code\u003e means use system\n     *  default\n     * @throws IllegalArgumentException if pattern is invalid or\n     *  \u003ccode\u003enull\u003c/code\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.init()",
      "begin_line": 557,
      "end_line": 567,
      "comment": "\n     * \u003cp\u003eInitializes the instance for first use.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.parsePattern()",
      "begin_line": 577,
      "end_line": 698,
      "comment": "\n     * \u003cp\u003eReturns a list of Rules given a pattern.\u003c/p\u003e\n     * \n     * @return a \u003ccode\u003eList\u003c/code\u003e of Rule objects\n     * @throws IllegalArgumentException if pattern is invalid\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.parseToken(java.lang.String, int[])",
      "begin_line": 707,
      "end_line": 757,
      "comment": "\n     * \u003cp\u003ePerforms the parsing of tokens.\u003c/p\u003e\n     * \n     * @param pattern  the pattern\n     * @param indexRef  index references\n     * @return parsed token\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.selectNumberRule(int, int)",
      "begin_line": 766,
      "end_line": 775,
      "comment": "\n     * \u003cp\u003eGets an appropriate rule for the padding required.\u003c/p\u003e\n     * \n     * @param field  the field to get a rule for\n     * @param padding  the padding required\n     * @return a new rule with the correct padding\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 788,
      "end_line": 800,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eDate\u003c/code\u003e, \u003ccode\u003eCalendar\u003c/code\u003e or\n     * \u003ccode\u003eLong\u003c/code\u003e (milliseconds) object.\u003c/p\u003e\n     * \n     * @param obj  the object to format\n     * @param toAppendTo  the buffer to append to\n     * @param pos  the position - ignored\n     * @return the buffer passed in\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(long)",
      "begin_line": 809,
      "end_line": 811,
      "comment": "\n     * \u003cp\u003eFormats a millisecond \u003ccode\u003elong\u003c/code\u003e value.\u003c/p\u003e\n     * \n     * @param millis  the millisecond value to format\n     * @return the formatted string\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.util.Date)",
      "begin_line": 819,
      "end_line": 823,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eDate\u003c/code\u003e object.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @return the formatted string\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.util.Calendar)",
      "begin_line": 831,
      "end_line": 833,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eCalendar\u003c/code\u003e object.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @return the formatted string\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(long, java.lang.StringBuffer)",
      "begin_line": 844,
      "end_line": 846,
      "comment": "\n     * \u003cp\u003eFormats a milliseond \u003ccode\u003elong\u003c/code\u003e value into the\n     * supplied \u003ccode\u003eStringBuffer\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param millis  the millisecond value to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.util.Date, java.lang.StringBuffer)",
      "begin_line": 856,
      "end_line": 860,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eDate\u003c/code\u003e object into the\n     * supplied \u003ccode\u003eStringBuffer\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param date  the date to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.format(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 870,
      "end_line": 877,
      "comment": "\n     * \u003cp\u003eFormats a \u003ccode\u003eCalendar\u003c/code\u003e object into the\n     * supplied \u003ccode\u003eStringBuffer\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.applyRules(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 887,
      "end_line": 894,
      "comment": "\n     * \u003cp\u003ePerforms the formatting by applying the rules to the\n     * specified calendar.\u003c/p\u003e\n     * \n     * @param calendar  the calendar to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.parseObject(java.lang.String, java.text.ParsePosition)",
      "begin_line": 905,
      "end_line": 910,
      "comment": "\n     * \u003cp\u003eParsing is not supported.\u003c/p\u003e\n     * \n     * @param source  the string to parse\n     * @param pos  the parsing position\n     * @return \u003ccode\u003enull\u003c/code\u003e as not supported\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getPattern()",
      "begin_line": 919,
      "end_line": 921,
      "comment": "\n     * \u003cp\u003eGets the pattern used by this formatter.\u003c/p\u003e\n     * \n     * @return the pattern, {@link java.text.SimpleDateFormat} compatible\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeZone()",
      "begin_line": 933,
      "end_line": 935,
      "comment": "\n     * \u003cp\u003eGets the time zone used by this formatter.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis zone is always used for \u003ccode\u003eDate\u003c/code\u003e formatting.\n     * If a \u003ccode\u003eCalendar\u003c/code\u003e is passed in to be formatted, the\n     * time zone on that may be used depending on\n     * {@link #getTimeZoneOverridesCalendar()}.\u003c/p\u003e\n     * \n     * @return the time zone\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getTimeZoneOverridesCalendar()",
      "begin_line": 944,
      "end_line": 946,
      "comment": "\n     * \u003cp\u003eReturns \u003ccode\u003etrue\u003c/code\u003e if the time zone of the\n     * calendar overrides the time zone of the formatter.\u003c/p\u003e\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if time zone of formatter\n     *  overridden for calendars\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getLocale()",
      "begin_line": 953,
      "end_line": 955,
      "comment": "\n     * \u003cp\u003eGets the locale used by this formatter.\u003c/p\u003e\n     * \n     * @return the locale\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.getMaxLengthEstimate()",
      "begin_line": 966,
      "end_line": 968,
      "comment": "\n     * \u003cp\u003eGets an estimate for the maximum string length that the\n     * formatter will produce.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual formatted length will almost always be less than or\n     * equal to this amount.\u003c/p\u003e\n     * \n     * @return the maximum formatted length\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.equals(java.lang.Object)",
      "begin_line": 978,
      "end_line": 994,
      "comment": "\n     * \u003cp\u003eCompares two objects for equality.\u003c/p\u003e\n     * \n     * @param obj  the object to compare to\n     * @return \u003ccode\u003etrue\u003c/code\u003e if equal\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.hashCode()",
      "begin_line": 1001,
      "end_line": 1010,
      "comment": "\n     * \u003cp\u003eReturns a hashcode compatible with equals.\u003c/p\u003e\n     * \n     * @return a hashcode compatible with equals\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.toString()",
      "begin_line": 1017,
      "end_line": 1020,
      "comment": "\n     * \u003cp\u003eGets a debugging string version of this formatter.\u003c/p\u003e\n     * \n     * @return a debugging string\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.readObject(java.io.ObjectInputStream)",
      "begin_line": 1032,
      "end_line": 1035,
      "comment": "\n     * Create the object after serialization. This implementation reinitializes the \n     * transient properties.\n     *\n     * @param in ObjectInputStream from which the object is being deserialized.\n     * @throws IOException if there is an IO issue.\n     * @throws ClassNotFoundException if a class cannot be found.\n     "
    },
    {
      "type": "class_interface",
      "name": "Rule",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 1042,
      "end_line": 1057,
      "comment": "\n     * \u003cp\u003eInner class defining a rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.Rule.estimateLength()",
      "begin_line": 1048,
      "end_line": 1048,
      "comment": "\n         * Returns the estimated lentgh of the result.\n         * \n         * @return the estimated length\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.Rule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1056,
      "end_line": 1056,
      "comment": "\n         * Appends the value of the specified calendar to the output buffer based on the rule implementation.\n         * \n         * @param buffer the output buffer\n         * @param calendar calendar to be appended\n         "
    },
    {
      "type": "class_interface",
      "name": "NumberRule",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 1062,
      "end_line": 1070,
      "comment": "\n     * \u003cp\u003eInner class defining a numeric rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.NumberRule.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1069,
      "end_line": 1069,
      "comment": "\n         * Appends the specified value to the output buffer based on the rule implementation.\n         * \n         * @param buffer the output buffer\n         * @param value the value to be appended\n         "
    },
    {
      "type": "class_interface",
      "name": "CharacterLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 1075,
      "end_line": 1101,
      "comment": "\n     * \u003cp\u003eInner class to output a constant single character.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 1076,
      "end_line": 1076,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.CharacterLiteral.CharacterLiteral(char)",
      "begin_line": 1084,
      "end_line": 1086,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eCharacterLiteral\u003c/code\u003e\n         * to hold the specified value.\n         * \n         * @param value the character literal\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.CharacterLiteral.estimateLength()",
      "begin_line": 1091,
      "end_line": 1093,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.CharacterLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1098,
      "end_line": 1100,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "StringLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 1106,
      "end_line": 1132,
      "comment": "\n     * \u003cp\u003eInner class to output a constant string.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 1107,
      "end_line": 1107,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.StringLiteral.StringLiteral(java.lang.String)",
      "begin_line": 1115,
      "end_line": 1117,
      "comment": "\n         * Constructs a new instance of \u003ccode\u003eStringLiteral\u003c/code\u003e\n         * to hold the specified value.\n         * \n         * @param value the string literal\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.StringLiteral.estimateLength()",
      "begin_line": 1122,
      "end_line": 1124,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.StringLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1129,
      "end_line": 1131,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TextField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 1137,
      "end_line": 1173,
      "comment": "\n     * \u003cp\u003eInner class to output one of a set of values.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1138,
      "end_line": 1138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mValues"
      ],
      "begin_line": 1139,
      "end_line": 1139,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TextField.TextField(int, java.lang.String[])",
      "begin_line": 1148,
      "end_line": 1151,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTextField\u003c/code\u003e\n         * with the specified field and values.\n         * \n         * @param field the field\n         * @param values the field values\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TextField.estimateLength()",
      "begin_line": 1156,
      "end_line": 1165,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TextField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1170,
      "end_line": 1172,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "UnpaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1178,
      "end_line": 1217,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1179,
      "end_line": 1179,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedNumberField.UnpaddedNumberField(int)",
      "begin_line": 1186,
      "end_line": 1188,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eUnpadedNumberField\u003c/code\u003e with the specified field.\n         * \n         * @param field the field\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedNumberField.estimateLength()",
      "begin_line": 1193,
      "end_line": 1195,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1200,
      "end_line": 1202,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1207,
      "end_line": 1216,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "UnpaddedMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1222,
      "end_line": 1258,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1223,
      "end_line": 1223,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedMonthField.UnpaddedMonthField()",
      "begin_line": 1229,
      "end_line": 1231,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eUnpaddedMonthField\u003c/code\u003e.\n         *\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedMonthField.estimateLength()",
      "begin_line": 1236,
      "end_line": 1238,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1243,
      "end_line": 1245,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.UnpaddedMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1250,
      "end_line": 1257,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "PaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1263,
      "end_line": 1320,
      "comment": "\n     * \u003cp\u003eInner class to output a padded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1264,
      "end_line": 1264,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mSize"
      ],
      "begin_line": 1265,
      "end_line": 1265,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.PaddedNumberField.PaddedNumberField(int, int)",
      "begin_line": 1273,
      "end_line": 1280,
      "comment": "\n         * Constructs an instance of \u003ccode\u003ePaddedNumberField\u003c/code\u003e.\n         * \n         * @param field the field\n         * @param size size of the output field\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.PaddedNumberField.estimateLength()",
      "begin_line": 1285,
      "end_line": 1287,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.PaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1292,
      "end_line": 1294,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.PaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1299,
      "end_line": 1319,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TwoDigitNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1325,
      "end_line": 1362,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 1326,
      "end_line": 1326,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitNumberField.TwoDigitNumberField(int)",
      "begin_line": 1333,
      "end_line": 1335,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwoDigitNumberField\u003c/code\u003e with the specified field.\n         * \n         * @param field the field\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitNumberField.estimateLength()",
      "begin_line": 1340,
      "end_line": 1342,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1347,
      "end_line": 1349,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1354,
      "end_line": 1361,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TwoDigitYearField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1367,
      "end_line": 1398,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit year.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1368,
      "end_line": 1368,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitYearField.TwoDigitYearField()",
      "begin_line": 1373,
      "end_line": 1375,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwoDigitYearField\u003c/code\u003e.\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitYearField.estimateLength()",
      "begin_line": 1380,
      "end_line": 1382,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitYearField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1387,
      "end_line": 1389,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitYearField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1394,
      "end_line": 1397,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TwoDigitMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1403,
      "end_line": 1434,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 1404,
      "end_line": 1404,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitMonthField.TwoDigitMonthField()",
      "begin_line": 1409,
      "end_line": 1411,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwoDigitMonthField\u003c/code\u003e.\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitMonthField.estimateLength()",
      "begin_line": 1416,
      "end_line": 1418,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1423,
      "end_line": 1425,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwoDigitMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1430,
      "end_line": 1433,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TwelveHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1439,
      "end_line": 1476,
      "comment": "\n     * \u003cp\u003eInner class to output the twelve hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 1440,
      "end_line": 1440,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwelveHourField.TwelveHourField(org.apache.commons.lang3.time.FastDateFormat.NumberRule)",
      "begin_line": 1448,
      "end_line": 1450,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwelveHourField\u003c/code\u003e with the specified\n         * \u003ccode\u003eNumberRule\u003c/code\u003e.\n         * \n         * @param rule the rule\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwelveHourField.estimateLength()",
      "begin_line": 1455,
      "end_line": 1457,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwelveHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1462,
      "end_line": 1468,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwelveHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1473,
      "end_line": 1475,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TwentyFourHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.NumberRule"
      ],
      "begin_line": 1481,
      "end_line": 1518,
      "comment": "\n     * \u003cp\u003eInner class to output the twenty four hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 1482,
      "end_line": 1482,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwentyFourHourField.TwentyFourHourField(org.apache.commons.lang3.time.FastDateFormat.NumberRule)",
      "begin_line": 1490,
      "end_line": 1492,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTwentyFourHourField\u003c/code\u003e with the specified\n         * \u003ccode\u003eNumberRule\u003c/code\u003e.\n         * \n         * @param rule the rule\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwentyFourHourField.estimateLength()",
      "begin_line": 1497,
      "end_line": 1499,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwentyFourHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1504,
      "end_line": 1510,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TwentyFourHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1515,
      "end_line": 1517,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNameRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 1523,
      "end_line": 1586,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone name.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1524,
      "end_line": 1524,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZoneForced"
      ],
      "begin_line": 1525,
      "end_line": 1525,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 1526,
      "end_line": 1526,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStyle"
      ],
      "begin_line": 1527,
      "end_line": 1527,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStandard"
      ],
      "begin_line": 1528,
      "end_line": 1528,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mDaylight"
      ],
      "begin_line": 1529,
      "end_line": 1529,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNameRule.TimeZoneNameRule(java.util.TimeZone, boolean, java.util.Locale, int)",
      "begin_line": 1539,
      "end_line": 1552,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTimeZoneNameRule\u003c/code\u003e with the specified properties.\n         * \n         * @param timeZone the time zone\n         * @param timeZoneForced if \u003ccode\u003etrue\u003c/code\u003e the time zone is forced into standard and daylight\n         * @param locale the locale\n         * @param style the style\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNameRule.estimateLength()",
      "begin_line": 1557,
      "end_line": 1565,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNameRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1570,
      "end_line": 1585,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNumberRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDateFormat.Rule"
      ],
      "begin_line": 1592,
      "end_line": 1639,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone as a number \u003ccode\u003e+/-HHMM\u003c/code\u003e\n     * or \u003ccode\u003e+/-HH:MM\u003c/code\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_COLON"
      ],
      "begin_line": 1593,
      "end_line": 1593,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_NO_COLON"
      ],
      "begin_line": 1594,
      "end_line": 1594,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mColon"
      ],
      "begin_line": 1596,
      "end_line": 1596,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNumberRule.TimeZoneNumberRule(boolean)",
      "begin_line": 1603,
      "end_line": 1605,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTimeZoneNumberRule\u003c/code\u003e with the specified properties.\n         * \n         * @param colon add colon between HH and MM in the output if \u003ccode\u003etrue\u003c/code\u003e\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNumberRule.estimateLength()",
      "begin_line": 1610,
      "end_line": 1612,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneNumberRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1617,
      "end_line": 1638,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TimeZoneDisplayKey",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1645,
      "end_line": 1693,
      "comment": "\n     * \u003cp\u003eInner class that acts as a compound key for time zone names.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1646,
      "end_line": 1646,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStyle"
      ],
      "begin_line": 1647,
      "end_line": 1647,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 1648,
      "end_line": 1648,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneDisplayKey.TimeZoneDisplayKey(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 1658,
      "end_line": 1666,
      "comment": "\n         * Constructs an instance of \u003ccode\u003eTimeZoneDisplayKey\u003c/code\u003e with the specified properties.\n         *  \n         * @param timeZone the time zone\n         * @param daylight adjust the style for daylight saving time if \u003ccode\u003etrue\u003c/code\u003e\n         * @param style the timezone style\n         * @param locale the timezone locale\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneDisplayKey.hashCode()",
      "begin_line": 1671,
      "end_line": 1674,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.TimeZoneDisplayKey.equals(java.lang.Object)",
      "begin_line": 1679,
      "end_line": 1692,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "Pair",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1702,
      "end_line": 1755,
      "comment": "\n     * \u003cp\u003eHelper class for creating compound objects.\u003c/p\u003e\n     *\n     * \u003cp\u003eOne use for this class is to create a hashtable key\n     * out of multiple objects.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mObj1"
      ],
      "begin_line": 1703,
      "end_line": 1703,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mObj2"
      ],
      "begin_line": 1704,
      "end_line": 1704,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.Pair.Pair(java.lang.Object, java.lang.Object)",
      "begin_line": 1711,
      "end_line": 1714,
      "comment": "\n         * Constructs an instance of \u003ccode\u003ePair\u003c/code\u003e to hold the specified objects.\n         * @param obj1 one object in the pair\n         * @param obj2 second object in the pair\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.Pair.equals(java.lang.Object)",
      "begin_line": 1719,
      "end_line": 1736,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.Pair.hashCode()",
      "begin_line": 1741,
      "end_line": 1746,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDateFormat.Pair.toString()",
      "begin_line": 1751,
      "end_line": 1754,
      "comment": "\n         * {@inheritDoc}\n         "
    }
  ]
}