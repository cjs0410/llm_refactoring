{
  "filepath": "/tmp/Lang-8f/src/main/java/org/apache/commons/lang3/time/FastDatePrinter.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FastDatePrinter",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.DatePrinter",
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 1250,
      "comment": "\n * \u003cp\u003eFastDatePrinter is a fast and thread-safe version of\n * {@link java.text.SimpleDateFormat}.\u003c/p\u003e\n *\n * \u003cp\u003eThis class can be used as a direct replacement to\n * {@code SimpleDateFormat} in most formatting situations.\n * This class is especially useful in multi-threaded server environments.\n * {@code SimpleDateFormat} is not thread-safe in any JDK version,\n * nor will it be as Sun have closed the bug/RFE.\n * \u003c/p\u003e\n *\n * \u003cp\u003eOnly formatting is supported, but all patterns are compatible with\n * SimpleDateFormat (except time zones and some year patterns - see below).\u003c/p\u003e\n *\n * \u003cp\u003eJava 1.4 introduced a new pattern letter, {@code \u0027Z\u0027}, to represent\n * time zones in RFC822 format (eg. {@code +0800} or {@code -1100}).\n * This pattern letter can be used here (on all JDK versions).\u003c/p\u003e\n *\n * \u003cp\u003eIn addition, the pattern {@code \u0027ZZ\u0027} has been made to represent\n * ISO8601 full format time zones (eg. {@code +08:00} or {@code -11:00}).\n * This introduces a minor incompatibility with Java 1.4, but at a gain of\n * useful functionality.\u003c/p\u003e\n *\n * \u003cp\u003eJavadoc cites for the year pattern: \u003ci\u003eFor formatting, if the number of\n * pattern letters is 2, the year is truncated to 2 digits; otherwise it is\n * interpreted as a number.\u003c/i\u003e Starting with Java 1.7 a pattern of \u0027Y\u0027 or\n * \u0027YYY\u0027 will be formatted as \u00272003\u0027, while it was \u002703\u0027 in former Java\n * versions. FastDatePrinter implements the behavior of Java 7.\u003c/p\u003e\n *\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Required for serialization support.\n     *\n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FULL"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * FULL locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LONG"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * LONG locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MEDIUM"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * MEDIUM locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * SHORT locale dependent date or time style.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mPattern"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * The pattern.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * The time zone.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * The locale.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRules"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * The parsed rules.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mMaxLengthEstimate"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * The estimated maximum length.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.FastDatePrinter(java.lang.String, java.util.TimeZone, java.util.Locale)",
      "begin_line": 136,
      "end_line": 142,
      "comment": "\n     * \u003cp\u003eConstructs a new FastDatePrinter.\u003c/p\u003e\n     *\n     * @param pattern  {@link java.text.SimpleDateFormat} compatible pattern\n     * @param timeZone  non-null time zone to use\n     * @param locale  non-null locale to use\n     * @throws NullPointerException if pattern, timeZone, or locale is null.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.init()",
      "begin_line": 147,
      "end_line": 157,
      "comment": "\n     * \u003cp\u003eInitializes the instance for first use.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.parsePattern()",
      "begin_line": 167,
      "end_line": 288,
      "comment": "\n     * \u003cp\u003eReturns a list of Rules given a pattern.\u003c/p\u003e\n     *\n     * @return a {@code List} of Rule objects\n     * @throws IllegalArgumentException if pattern is invalid\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.parseToken(java.lang.String, int[])",
      "begin_line": 297,
      "end_line": 347,
      "comment": "\n     * \u003cp\u003ePerforms the parsing of tokens.\u003c/p\u003e\n     *\n     * @param pattern  the pattern\n     * @param indexRef  index references\n     * @return parsed token\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.selectNumberRule(int, int)",
      "begin_line": 356,
      "end_line": 365,
      "comment": "\n     * \u003cp\u003eGets an appropriate rule for the padding required.\u003c/p\u003e\n     *\n     * @param field  the field to get a rule for\n     * @param padding  the padding required\n     * @return a new rule with the correct padding\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(java.lang.Object, java.lang.StringBuffer, java.text.FieldPosition)",
      "begin_line": 378,
      "end_line": 390,
      "comment": "\n     * \u003cp\u003eFormats a {@code Date}, {@code Calendar} or\n     * {@code Long} (milliseconds) object.\u003c/p\u003e\n     *\n     * @param obj  the object to format\n     * @param toAppendTo  the buffer to append to\n     * @param pos  the position - ignored\n     * @return the buffer passed in\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(long)",
      "begin_line": 395,
      "end_line": 398,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#format(long)\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(java.util.Date)",
      "begin_line": 403,
      "end_line": 408,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Date)\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(java.util.Calendar)",
      "begin_line": 413,
      "end_line": 416,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Calendar)\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(long, java.lang.StringBuffer)",
      "begin_line": 421,
      "end_line": 424,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#format(long, java.lang.StringBuffer)\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(java.util.Date, java.lang.StringBuffer)",
      "begin_line": 429,
      "end_line": 434,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Date, java.lang.StringBuffer)\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.format(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 439,
      "end_line": 442,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#format(java.util.Calendar, java.lang.StringBuffer)\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.applyRules(java.util.Calendar, java.lang.StringBuffer)",
      "begin_line": 452,
      "end_line": 457,
      "comment": "\n     * \u003cp\u003ePerforms the formatting by applying the rules to the\n     * specified calendar.\u003c/p\u003e\n     *\n     * @param calendar  the calendar to format\n     * @param buf  the buffer to format into\n     * @return the specified string buffer\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.getPattern()",
      "begin_line": 464,
      "end_line": 467,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#getPattern()\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.getTimeZone()",
      "begin_line": 472,
      "end_line": 475,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#getTimeZone()\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.getLocale()",
      "begin_line": 480,
      "end_line": 483,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.lang3.time.DatePrinter#getLocale()\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.getMaxLengthEstimate()",
      "begin_line": 494,
      "end_line": 496,
      "comment": "\n     * \u003cp\u003eGets an estimate for the maximum string length that the\n     * formatter will produce.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual formatted length will almost always be less than or\n     * equal to this amount.\u003c/p\u003e\n     *\n     * @return the maximum formatted length\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.equals(java.lang.Object)",
      "begin_line": 506,
      "end_line": 515,
      "comment": "\n     * \u003cp\u003eCompares two objects for equality.\u003c/p\u003e\n     *\n     * @param obj  the object to compare to\n     * @return {@code true} if equal\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.hashCode()",
      "begin_line": 522,
      "end_line": 525,
      "comment": "\n     * \u003cp\u003eReturns a hashcode compatible with equals.\u003c/p\u003e\n     *\n     * @return a hashcode compatible with equals\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.toString()",
      "begin_line": 532,
      "end_line": 535,
      "comment": "\n     * \u003cp\u003eGets a debugging string version of this formatter.\u003c/p\u003e\n     *\n     * @return a debugging string\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.readObject(java.io.ObjectInputStream)",
      "begin_line": 547,
      "end_line": 550,
      "comment": "\n     * Create the object after serialization. This implementation reinitializes the\n     * transient properties.\n     *\n     * @param in ObjectInputStream from which the object is being deserialized.\n     * @throws IOException if there is an IO issue.\n     * @throws ClassNotFoundException if a class cannot be found.\n     "
    },
    {
      "type": "class_interface",
      "name": "Rule",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 557,
      "end_line": 572,
      "comment": "\n     * \u003cp\u003eInner class defining a rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.Rule.estimateLength()",
      "begin_line": 563,
      "end_line": 563,
      "comment": "\n         * Returns the estimated lentgh of the result.\n         *\n         * @return the estimated length\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.Rule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 571,
      "end_line": 571,
      "comment": "\n         * Appends the value of the specified calendar to the output buffer based on the rule implementation.\n         *\n         * @param buffer the output buffer\n         * @param calendar calendar to be appended\n         "
    },
    {
      "type": "class_interface",
      "name": "NumberRule",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.Rule"
      ],
      "begin_line": 577,
      "end_line": 585,
      "comment": "\n     * \u003cp\u003eInner class defining a numeric rule.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.NumberRule.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 584,
      "end_line": 584,
      "comment": "\n         * Appends the specified value to the output buffer based on the rule implementation.\n         *\n         * @param buffer the output buffer\n         * @param value the value to be appended\n         "
    },
    {
      "type": "class_interface",
      "name": "CharacterLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.Rule"
      ],
      "begin_line": 590,
      "end_line": 618,
      "comment": "\n     * \u003cp\u003eInner class to output a constant single character.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 591,
      "end_line": 591,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.CharacterLiteral.CharacterLiteral(char)",
      "begin_line": 599,
      "end_line": 601,
      "comment": "\n         * Constructs a new instance of {@code CharacterLiteral}\n         * to hold the specified value.\n         *\n         * @param value the character literal\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.CharacterLiteral.estimateLength()",
      "begin_line": 606,
      "end_line": 609,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.CharacterLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 614,
      "end_line": 617,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "StringLiteral",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.Rule"
      ],
      "begin_line": 623,
      "end_line": 651,
      "comment": "\n     * \u003cp\u003eInner class to output a constant string.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mValue"
      ],
      "begin_line": 624,
      "end_line": 624,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.StringLiteral.StringLiteral(java.lang.String)",
      "begin_line": 632,
      "end_line": 634,
      "comment": "\n         * Constructs a new instance of {@code StringLiteral}\n         * to hold the specified value.\n         *\n         * @param value the string literal\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.StringLiteral.estimateLength()",
      "begin_line": 639,
      "end_line": 642,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.StringLiteral.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 647,
      "end_line": 650,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TextField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.Rule"
      ],
      "begin_line": 656,
      "end_line": 694,
      "comment": "\n     * \u003cp\u003eInner class to output one of a set of values.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 657,
      "end_line": 657,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mValues"
      ],
      "begin_line": 658,
      "end_line": 658,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TextField.TextField(int, java.lang.String[])",
      "begin_line": 667,
      "end_line": 670,
      "comment": "\n         * Constructs an instance of {@code TextField}\n         * with the specified field and values.\n         *\n         * @param field the field\n         * @param values the field values\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TextField.estimateLength()",
      "begin_line": 675,
      "end_line": 685,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TextField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 690,
      "end_line": 693,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "UnpaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 699,
      "end_line": 741,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 700,
      "end_line": 700,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedNumberField.UnpaddedNumberField(int)",
      "begin_line": 707,
      "end_line": 709,
      "comment": "\n         * Constructs an instance of {@code UnpadedNumberField} with the specified field.\n         *\n         * @param field the field\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedNumberField.estimateLength()",
      "begin_line": 714,
      "end_line": 717,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 722,
      "end_line": 725,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 730,
      "end_line": 740,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "UnpaddedMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 746,
      "end_line": 785,
      "comment": "\n     * \u003cp\u003eInner class to output an unpadded month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 747,
      "end_line": 747,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField.UnpaddedMonthField()",
      "begin_line": 753,
      "end_line": 755,
      "comment": "\n         * Constructs an instance of {@code UnpaddedMonthField}.\n         *\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField.estimateLength()",
      "begin_line": 760,
      "end_line": 763,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 768,
      "end_line": 771,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 776,
      "end_line": 784,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "PaddedNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 790,
      "end_line": 850,
      "comment": "\n     * \u003cp\u003eInner class to output a padded number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 791,
      "end_line": 791,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mSize"
      ],
      "begin_line": 792,
      "end_line": 792,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.PaddedNumberField.PaddedNumberField(int, int)",
      "begin_line": 800,
      "end_line": 807,
      "comment": "\n         * Constructs an instance of {@code PaddedNumberField}.\n         *\n         * @param field the field\n         * @param size size of the output field\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.PaddedNumberField.estimateLength()",
      "begin_line": 812,
      "end_line": 815,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.PaddedNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 820,
      "end_line": 823,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.PaddedNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 828,
      "end_line": 849,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TwoDigitNumberField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 855,
      "end_line": 895,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit number.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mField"
      ],
      "begin_line": 856,
      "end_line": 856,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitNumberField.TwoDigitNumberField(int)",
      "begin_line": 863,
      "end_line": 865,
      "comment": "\n         * Constructs an instance of {@code TwoDigitNumberField} with the specified field.\n         *\n         * @param field the field\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitNumberField.estimateLength()",
      "begin_line": 870,
      "end_line": 873,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitNumberField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 878,
      "end_line": 881,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitNumberField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 886,
      "end_line": 894,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TwoDigitYearField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 900,
      "end_line": 934,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit year.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 901,
      "end_line": 901,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField.TwoDigitYearField()",
      "begin_line": 906,
      "end_line": 908,
      "comment": "\n         * Constructs an instance of {@code TwoDigitYearField}.\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField.estimateLength()",
      "begin_line": 913,
      "end_line": 916,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 921,
      "end_line": 924,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 929,
      "end_line": 933,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TwoDigitMonthField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 939,
      "end_line": 973,
      "comment": "\n     * \u003cp\u003eInner class to output a two digit month.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 940,
      "end_line": 940,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField.TwoDigitMonthField()",
      "begin_line": 945,
      "end_line": 947,
      "comment": "\n         * Constructs an instance of {@code TwoDigitMonthField}.\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField.estimateLength()",
      "begin_line": 952,
      "end_line": 955,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 960,
      "end_line": 963,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 968,
      "end_line": 972,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TwelveHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 978,
      "end_line": 1018,
      "comment": "\n     * \u003cp\u003eInner class to output the twelve hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 979,
      "end_line": 979,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwelveHourField.TwelveHourField(org.apache.commons.lang3.time.FastDatePrinter.NumberRule)",
      "begin_line": 987,
      "end_line": 989,
      "comment": "\n         * Constructs an instance of {@code TwelveHourField} with the specified\n         * {@code NumberRule}.\n         *\n         * @param rule the rule\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwelveHourField.estimateLength()",
      "begin_line": 994,
      "end_line": 997,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwelveHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1002,
      "end_line": 1009,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwelveHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1014,
      "end_line": 1017,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TwentyFourHourField",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.NumberRule"
      ],
      "begin_line": 1023,
      "end_line": 1063,
      "comment": "\n     * \u003cp\u003eInner class to output the twenty four hour field.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mRule"
      ],
      "begin_line": 1024,
      "end_line": 1024,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwentyFourHourField.TwentyFourHourField(org.apache.commons.lang3.time.FastDatePrinter.NumberRule)",
      "begin_line": 1032,
      "end_line": 1034,
      "comment": "\n         * Constructs an instance of {@code TwentyFourHourField} with the specified\n         * {@code NumberRule}.\n         *\n         * @param rule the rule\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwentyFourHourField.estimateLength()",
      "begin_line": 1039,
      "end_line": 1042,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwentyFourHourField.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1047,
      "end_line": 1054,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TwentyFourHourField.appendTo(java.lang.StringBuffer, int)",
      "begin_line": 1059,
      "end_line": 1062,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "field",
      "varNames": [
        "cTimeZoneDisplayCache"
      ],
      "begin_line": 1067,
      "end_line": 1068,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 1078,
      "end_line": 1090,
      "comment": "\n     * \u003cp\u003eGets the time zone display name, using a cache for performance.\u003c/p\u003e\n     *\n     * @param tz  the zone to query\n     * @param daylight  true if daylight savings\n     * @param style  the style to use {@code TimeZone.LONG} or {@code TimeZone.SHORT}\n     * @param locale  the locale to use\n     * @return the textual name of the time zone\n     "
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNameRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.Rule"
      ],
      "begin_line": 1095,
      "end_line": 1140,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone name.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 1096,
      "end_line": 1096,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStyle"
      ],
      "begin_line": 1097,
      "end_line": 1097,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStandard"
      ],
      "begin_line": 1098,
      "end_line": 1098,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mDaylight"
      ],
      "begin_line": 1099,
      "end_line": 1099,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNameRule.TimeZoneNameRule(java.util.TimeZone, java.util.Locale, int)",
      "begin_line": 1108,
      "end_line": 1114,
      "comment": "\n         * Constructs an instance of {@code TimeZoneNameRule} with the specified properties.\n         *\n         * @param timeZone the time zone\n         * @param locale the locale\n         * @param style the style\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNameRule.estimateLength()",
      "begin_line": 1119,
      "end_line": 1125,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNameRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1130,
      "end_line": 1139,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TimeZoneNumberRule",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.time.FastDatePrinter.Rule"
      ],
      "begin_line": 1146,
      "end_line": 1195,
      "comment": "\n     * \u003cp\u003eInner class to output a time zone as a number {@code +/-HHMM}\n     * or {@code +/-HH:MM}.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_COLON"
      ],
      "begin_line": 1147,
      "end_line": 1147,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE_NO_COLON"
      ],
      "begin_line": 1148,
      "end_line": 1148,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mColon"
      ],
      "begin_line": 1150,
      "end_line": 1150,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.TimeZoneNumberRule(boolean)",
      "begin_line": 1157,
      "end_line": 1159,
      "comment": "\n         * Constructs an instance of {@code TimeZoneNumberRule} with the specified properties.\n         *\n         * @param colon add colon between HH and MM in the output if {@code true}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.estimateLength()",
      "begin_line": 1164,
      "end_line": 1167,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.appendTo(java.lang.StringBuffer, java.util.Calendar)",
      "begin_line": 1172,
      "end_line": 1194,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "class_interface",
      "name": "TimeZoneDisplayKey",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1201,
      "end_line": 1249,
      "comment": "\n     * \u003cp\u003eInner class that acts as a compound key for time zone names.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "mTimeZone"
      ],
      "begin_line": 1202,
      "end_line": 1202,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mStyle"
      ],
      "begin_line": 1203,
      "end_line": 1203,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mLocale"
      ],
      "begin_line": 1204,
      "end_line": 1204,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey.TimeZoneDisplayKey(java.util.TimeZone, boolean, int, java.util.Locale)",
      "begin_line": 1214,
      "end_line": 1222,
      "comment": "\n         * Constructs an instance of {@code TimeZoneDisplayKey} with the specified properties.\n         *\n         * @param timeZone the time zone\n         * @param daylight adjust the style for daylight saving time if {@code true}\n         * @param style the timezone style\n         * @param locale the timezone locale\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey.hashCode()",
      "begin_line": 1227,
      "end_line": 1230,
      "comment": "\n         * {@inheritDoc}\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey.equals(java.lang.Object)",
      "begin_line": 1235,
      "end_line": 1248,
      "comment": "\n         * {@inheritDoc}\n         "
    }
  ]
}