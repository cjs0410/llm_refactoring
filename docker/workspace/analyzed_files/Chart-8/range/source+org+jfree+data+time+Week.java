{
  "filepath": "/tmp/Chart-8f/source/org/jfree/data/time/Week.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Week",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.time.RegularTimePeriod",
        "java.io.Serializable"
      ],
      "begin_line": 90,
      "end_line": 647,
      "comment": "\r\n * A calendar week.  All years are considered to have 53 weeks, numbered from 1\r\n * to 53, although in many cases the 53rd week is empty.  Most of the time, the\r\n * 1st week of the year *begins* in the previous calendar year, but it always\r\n * finishes in the current year (this behaviour matches the workings of the\r\n * \u003ccode\u003eGregorianCalendar\u003c/code\u003e class).\r\n * \u003cP\u003e\r\n * This class is immutable, which is a requirement for all\r\n * {@link RegularTimePeriod} subclasses.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "FIRST_WEEK_IN_YEAR"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Constant for the first week in the year. "
    },
    {
      "type": "field",
      "varNames": [
        "LAST_WEEK_IN_YEAR"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Constant for the last week in the year. "
    },
    {
      "type": "field",
      "varNames": [
        "year"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " The year in which the week falls. "
    },
    {
      "type": "field",
      "varNames": [
        "week"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " The week (1-53). "
    },
    {
      "type": "field",
      "varNames": [
        "firstMillisecond"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The first millisecond. "
    },
    {
      "type": "field",
      "varNames": [
        "lastMillisecond"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The last millisecond. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Week.Week()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\r\n     * Creates a new time period for the week in which the current system\r\n     * date/time falls.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Week.Week(int, int)",
      "begin_line": 127,
      "end_line": 135,
      "comment": "\r\n     * Creates a time period representing the week in the specified year.\r\n     *\r\n     * @param week  the week (1 to 53).\r\n     * @param year  the year (1900 to 9999).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Week.Week(int, org.jfree.data.time.Year)",
      "begin_line": 143,
      "end_line": 151,
      "comment": "\r\n     * Creates a time period representing the week in the specified year.\r\n     *\r\n     * @param week  the week (1 to 53).\r\n     * @param year  the year (1900 to 9999).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Week.Week(java.util.Date)",
      "begin_line": 159,
      "end_line": 162,
      "comment": "\r\n     * Creates a time period for the week in which the specified date/time\r\n     * falls.\r\n     *\r\n     * @param time  the time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Week.Week(java.util.Date, java.util.TimeZone)",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\r\n     * Creates a time period for the week in which the specified date/time\r\n     * falls, calculated relative to the specified time zone.\r\n     *\r\n     * @param time  the date/time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @deprecated As of 1.0.7, use {@link #Week(Date, TimeZone, Locale)}.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.Week.Week(java.util.Date, java.util.TimeZone, java.util.Locale)",
      "begin_line": 188,
      "end_line": 222,
      "comment": "\r\n     * Creates a time period for the week in which the specified date/time\r\n     * falls, calculated relative to the specified time zone.\r\n     *\r\n     * @param time  the date/time (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param zone  the time zone (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param locale  the locale (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getYear()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\r\n     * Returns the year in which the week falls.\r\n     *\r\n     * @return The year (never \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getYearValue()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\r\n     * Returns the year in which the week falls, as an integer value.\r\n     *\r\n     * @return The year.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getWeek()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\r\n     * Returns the week.\r\n     *\r\n     * @return The week.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getFirstMillisecond()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\r\n     * Returns the first millisecond of the week.  This will be determined\r\n     * relative to the time zone specified in the constructor, or in the\r\n     * calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The first millisecond of the week.\r\n     *\r\n     * @see #getLastMillisecond()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getLastMillisecond()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\r\n     * Returns the last millisecond of the week.  This will be\r\n     * determined relative to the time zone specified in the constructor, or\r\n     * in the calendar instance passed in the most recent call to the\r\n     * {@link #peg(Calendar)} method.\r\n     *\r\n     * @return The last millisecond of the week.\r\n     *\r\n     * @see #getFirstMillisecond()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.peg(java.util.Calendar)",
      "begin_line": 287,
      "end_line": 290,
      "comment": "\r\n     * Recalculates the start date/time and end date/time for this time period\r\n     * relative to the supplied calendar (which incorporates a time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.3\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.previous()",
      "begin_line": 300,
      "end_line": 321,
      "comment": "\r\n     * Returns the week preceding this one.  This method will return\r\n     * \u003ccode\u003enull\u003c/code\u003e for some lower limit on the range of weeks (currently\r\n     * week 1, 1900).  For week 1 of any year, the previous week is always week\r\n     * 53, but week 53 may not contain any days (you should check for this).\r\n     *\r\n     * @return The preceding week (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.next()",
      "begin_line": 332,
      "end_line": 357,
      "comment": "\r\n     * Returns the week following this one.  This method will return\r\n     * \u003ccode\u003enull\u003c/code\u003e for some upper limit on the range of weeks (currently\r\n     * week 53, 9999).  For week 52 of any year, the following week is always\r\n     * week 53, but week 53 may not contain any days (you should check for\r\n     * this).\r\n     *\r\n     * @return The following week (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getSerialIndex()",
      "begin_line": 364,
      "end_line": 366,
      "comment": "\r\n     * Returns a serial index number for the week.\r\n     *\r\n     * @return The serial index number.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getFirstMillisecond(java.util.Calendar)",
      "begin_line": 379,
      "end_line": 391,
      "comment": "\r\n     * Returns the first millisecond of the week, evaluated using the supplied\r\n     * calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The first millisecond of the week.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.getLastMillisecond(java.util.Calendar)",
      "begin_line": 404,
      "end_line": 416,
      "comment": "\r\n     * Returns the last millisecond of the week, evaluated using the supplied\r\n     * calendar (which determines the time zone).\r\n     *\r\n     * @param calendar  the calendar (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The last millisecond of the week.\r\n     *\r\n     * @throws NullPointerException if \u003ccode\u003ecalendar\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.toString()",
      "begin_line": 425,
      "end_line": 427,
      "comment": "\r\n     * Returns a string representing the week (e.g. \"Week 9, 2002\").\r\n     *\r\n     * TODO: look at internationalisation.\r\n     *\r\n     * @return A string representing the week.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.equals(java.lang.Object)",
      "begin_line": 439,
      "end_line": 456,
      "comment": "\r\n     * Tests the equality of this Week object to an arbitrary object.  Returns\r\n     * true if the target is a Week instance representing the same week as this\r\n     * object.  In all other cases, returns false.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e if week and year of this and object are the\r\n     *         same.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.hashCode()",
      "begin_line": 467,
      "end_line": 472,
      "comment": "\r\n     * Returns a hash code for this object instance.  The approach described by\r\n     * Joshua Bloch in \"Effective Java\" has been used here:\r\n     * \u003cp\u003e\r\n     * \u003ccode\u003ehttp://developer.java.sun.com/developer/Books/effectivejava\r\n     * /Chapter3.pdf\u003c/code\u003e\r\n     *\r\n     * @return A hash code.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.compareTo(java.lang.Object)",
      "begin_line": 484,
      "end_line": 514,
      "comment": "\r\n     * Returns an integer indicating the order of this Week object relative to\r\n     * the specified object:\r\n     *\r\n     * negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     *\r\n     * @param o1  the object to compare.\r\n     *\r\n     * @return negative \u003d\u003d before, zero \u003d\u003d same, positive \u003d\u003d after.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.parseWeek(java.lang.String)",
      "begin_line": 527,
      "end_line": 575,
      "comment": "\r\n     * Parses the string argument as a week.\r\n     * \u003cP\u003e\r\n     * This method is required to accept the format \"YYYY-Wnn\".  It will also\r\n     * accept \"Wnn-YYYY\". Anything else, at the moment, is a bonus.\r\n     *\r\n     * @param s  string to parse.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e if the string is not parseable, the week\r\n     *         otherwise.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.findSeparator(java.lang.String)",
      "begin_line": 585,
      "end_line": 598,
      "comment": "\r\n     * Finds the first occurrence of \u0027 \u0027, \u0027-\u0027, \u0027,\u0027 or \u0027.\u0027\r\n     *\r\n     * @param s  the string to parse.\r\n     *\r\n     * @return \u003ccode\u003e-1\u003c/code\u003e if none of the characters was found, the\r\n     *      index of the first occurrence otherwise.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.evaluateAsYear(java.lang.String)",
      "begin_line": 609,
      "end_line": 620,
      "comment": "\r\n     * Creates a year from a string, or returns null (format exceptions\r\n     * suppressed).\r\n     *\r\n     * @param s  string to parse.\r\n     *\r\n     * @return \u003ccode\u003enull\u003c/code\u003e if the string is not parseable, the year\r\n     *         otherwise.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.Week.stringToWeek(java.lang.String)",
      "begin_line": 629,
      "end_line": 645,
      "comment": "\r\n     * Converts a string to a week.\r\n     *\r\n     * @param s  the string to parse.\r\n     * @return \u003ccode\u003e-1\u003c/code\u003e if the string does not contain a week number,\r\n     *         the number of the week otherwise.\r\n     "
    }
  ]
}