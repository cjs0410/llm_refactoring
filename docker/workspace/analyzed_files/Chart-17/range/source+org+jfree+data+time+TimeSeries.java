{
  "filepath": "/tmp/Chart-17f/source/org/jfree/data/time/TimeSeries.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TimeSeries",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.Series",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 100,
      "end_line": 1037,
      "comment": "\r\n * Represents a sequence of zero or more data items in the form (period, value).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DOMAIN_DESCRIPTION"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Default value for the domain description. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RANGE_DESCRIPTION"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Default value for the range description. "
    },
    {
      "type": "field",
      "varNames": [
        "domain"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " A description of the domain. "
    },
    {
      "type": "field",
      "varNames": [
        "range"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " A description of the range. "
    },
    {
      "type": "field",
      "varNames": [
        "timePeriodClass"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The type of period for the data. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " The list of data items in the series. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumItemCount"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The maximum number of items for the series. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumItemAge"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " \r\n     * The maximum age of items for the series, specified as a number of\r\n     * time periods. \r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeries.TimeSeries(java.lang.Comparable)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\r\n     * Creates a new (empty) time series.  By default, a daily time series is \r\n     * created.  Use one of the other constructors if you require a different \r\n     * time period.\r\n     *\r\n     * @param name  the series name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeries.TimeSeries(java.lang.Comparable, java.lang.Class)",
      "begin_line": 152,
      "end_line": 155,
      "comment": "\r\n     * Creates a new (empty) time series with the specified name and class\r\n     * of {@link RegularTimePeriod}.\r\n     *\r\n     * @param name  the series name (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param timePeriodClass  the type of time period (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                         permitted).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.time.TimeSeries.TimeSeries(java.lang.Comparable, java.lang.String, java.lang.String, java.lang.Class)",
      "begin_line": 170,
      "end_line": 179,
      "comment": "\r\n     * Creates a new time series that contains no data.\r\n     * \u003cP\u003e\r\n     * Descriptions can be specified for the domain and range.  One situation\r\n     * where this is helpful is when generating a chart for the time series -\r\n     * axis labels can be taken from the domain and range description.\r\n     *\r\n     * @param name  the name of the series (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param domain  the domain description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param range  the range description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param timePeriodClass  the type of time period (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                         permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getDomainDescription()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\r\n     * Returns the domain description.\r\n     *\r\n     * @return The domain description (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainDescription(String)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.setDomainDescription(java.lang.String)",
      "begin_line": 201,
      "end_line": 205,
      "comment": "\r\n     * Sets the domain description and sends a \u003ccode\u003ePropertyChangeEvent\u003c/code\u003e \r\n     * (with the property name \u003ccode\u003eDomain\u003c/code\u003e) to all registered\r\n     * property change listeners.\r\n     *\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDomainDescription()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getRangeDescription()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\r\n     * Returns the range description.\r\n     *\r\n     * @return The range description (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeDescription(String)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.setRangeDescription(java.lang.String)",
      "begin_line": 226,
      "end_line": 230,
      "comment": "\r\n     * Sets the range description and sends a \u003ccode\u003ePropertyChangeEvent\u003c/code\u003e \r\n     * (with the property name \u003ccode\u003eRange\u003c/code\u003e) to all registered listeners.\r\n     *\r\n     * @param description  the description (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRangeDescription()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getItemCount()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\r\n     * Returns the number of items in the series.\r\n     *\r\n     * @return The item count.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getItems()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\r\n     * Returns the list of data items for the series (the list contains \r\n     * {@link TimeSeriesDataItem} objects and is unmodifiable).\r\n     *\r\n     * @return The list of data items.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getMaximumItemCount()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\r\n     * Returns the maximum number of items that will be retained in the series.\r\n     * The default value is \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e.\r\n     *\r\n     * @return The maximum item count.\r\n     * \r\n     * @see #setMaximumItemCount(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.setMaximumItemCount(int)",
      "begin_line": 274,
      "end_line": 283,
      "comment": "\r\n     * Sets the maximum number of items that will be retained in the series.  \r\n     * If you add a new item to the series such that the number of items will \r\n     * exceed the maximum item count, then the FIRST element in the series is \r\n     * automatically removed, ensuring that the maximum item count is not \r\n     * exceeded.\r\n     *\r\n     * @param maximum  the maximum (requires \u003e\u003d 0).\r\n     * \r\n     * @see #getMaximumItemCount()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getMaximumItemAge()",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\r\n     * Returns the maximum item age (in time periods) for the series.\r\n     *\r\n     * @return The maximum item age.\r\n     * \r\n     * @see #setMaximumItemAge(long)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.setMaximumItemAge(long)",
      "begin_line": 308,
      "end_line": 314,
      "comment": "\r\n     * Sets the number of time units in the \u0027history\u0027 for the series.  This \r\n     * provides one mechanism for automatically dropping old data from the\r\n     * time series. For example, if a series contains daily data, you might set\r\n     * the history count to 30.  Then, when you add a new data item, all data\r\n     * items more than 30 days older than the latest value are automatically \r\n     * dropped from the series.\r\n     *\r\n     * @param periods  the number of time periods.\r\n     * \r\n     * @see #getMaximumItemAge()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getTimePeriodClass()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\r\n     * Returns the time period class for this series.\r\n     * \u003cp\u003e\r\n     * Only one time period class can be used within a single series (enforced).\r\n     * If you add a data item with a {@link Year} for the time period, then all\r\n     * subsequent data items must also have a {@link Year} for the time period.\r\n     *\r\n     * @return The time period class (never \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getDataItem(int)",
      "begin_line": 338,
      "end_line": 340,
      "comment": "\r\n     * Returns a data item for the series.\r\n     *\r\n     * @param index  the item index (zero-based).\r\n     *\r\n     * @return The data item.\r\n     * \r\n     * @see #getDataItem(RegularTimePeriod)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getDataItem(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 352,
      "end_line": 360,
      "comment": "\r\n     * Returns the data item for a specific period.\r\n     *\r\n     * @param period  the period of interest (\u003ccode\u003enull\u003c/code\u003e not allowed).\r\n     *\r\n     * @return The data item matching the specified period (or \r\n     *         \u003ccode\u003enull\u003c/code\u003e if there is no match).\r\n     *\r\n     * @see #getDataItem(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getTimePeriod(int)",
      "begin_line": 369,
      "end_line": 371,
      "comment": "\r\n     * Returns the time period at the specified index.\r\n     *\r\n     * @param index  the index of the data item.\r\n     *\r\n     * @return The time period.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getNextTimePeriod()",
      "begin_line": 379,
      "end_line": 382,
      "comment": "\r\n     * Returns a time period that would be the next in sequence on the end of\r\n     * the time series.\r\n     *\r\n     * @return The next time period.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getTimePeriods()",
      "begin_line": 389,
      "end_line": 395,
      "comment": "\r\n     * Returns a collection of all the time periods in the time series.\r\n     *\r\n     * @return A collection of all the time periods.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getTimePeriodsUniqueToOtherSeries(org.jfree.data.time.TimeSeries)",
      "begin_line": 405,
      "end_line": 417,
      "comment": "\r\n     * Returns a collection of time periods in the specified series, but not in\r\n     * this series, and therefore unique to the specified series.\r\n     *\r\n     * @param series  the series to check against this one.\r\n     *\r\n     * @return The unique time periods.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getIndex(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 427,
      "end_line": 434,
      "comment": "\r\n     * Returns the index for the item (if any) that corresponds to a time \r\n     * period.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getValue(int)",
      "begin_line": 443,
      "end_line": 445,
      "comment": "\r\n     * Returns the value at the specified index.\r\n     *\r\n     * @param index  index of a value.\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.getValue(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 455,
      "end_line": 465,
      "comment": "\r\n     * Returns the value for a time period.  If there is no data item with the \r\n     * specified period, this method will return \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param period  time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.add(org.jfree.data.time.TimeSeriesDataItem)",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\r\n     * Adds a data item to the series and sends a \r\n     * {@link org.jfree.data.general.SeriesChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param item  the (timeperiod, value) pair (\u003ccode\u003enull\u003c/code\u003e not \r\n     *              permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.add(org.jfree.data.time.TimeSeriesDataItem, boolean)",
      "begin_line": 488,
      "end_line": 548,
      "comment": "\r\n     * Adds a data item to the series and sends a \r\n     * {@link org.jfree.data.general.SeriesChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param item  the (timeperiod, value) pair (\u003ccode\u003enull\u003c/code\u003e not \r\n     *              permitted).\r\n     * @param notify  notify listeners?\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.add(org.jfree.data.time.RegularTimePeriod, double)",
      "begin_line": 557,
      "end_line": 560,
      "comment": "\r\n     * Adds a new data item to the series and sends a {@link SeriesChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.add(org.jfree.data.time.RegularTimePeriod, double, boolean)",
      "begin_line": 570,
      "end_line": 574,
      "comment": "\r\n     * Adds a new data item to the series and sends a {@link SeriesChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value.\r\n     * @param notify  notify listeners?\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.add(org.jfree.data.time.RegularTimePeriod, java.lang.Number)",
      "begin_line": 584,
      "end_line": 587,
      "comment": "\r\n     * Adds a new data item to the series and sends \r\n     * a {@link org.jfree.data.general.SeriesChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.add(org.jfree.data.time.RegularTimePeriod, java.lang.Number, boolean)",
      "begin_line": 598,
      "end_line": 602,
      "comment": "\r\n     * Adds a new data item to the series and sends \r\n     * a {@link org.jfree.data.general.SeriesChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param period  the time period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.update(org.jfree.data.time.RegularTimePeriod, java.lang.Number)",
      "begin_line": 611,
      "end_line": 625,
      "comment": "\r\n     * Updates (changes) the value for a time period.  Throws a \r\n     * {@link SeriesException} if the period does not exist.\r\n     *\r\n     * @param period  the period (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.update(int, java.lang.Number)",
      "begin_line": 633,
      "end_line": 637,
      "comment": "\r\n     * Updates (changes) the value of a data item.\r\n     *\r\n     * @param index  the index of the data item.\r\n     * @param value  the new value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.addAndOrUpdate(org.jfree.data.time.TimeSeries)",
      "begin_line": 647,
      "end_line": 659,
      "comment": "\r\n     * Adds or updates data from one series to another.  Returns another series\r\n     * containing the values that were overwritten.\r\n     *\r\n     * @param series  the series to merge with this.\r\n     *\r\n     * @return A series containing the values that were overwritten.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.addOrUpdate(org.jfree.data.time.RegularTimePeriod, double)",
      "begin_line": 673,
      "end_line": 676,
      "comment": "\r\n     * Adds or updates an item in the times series and sends a \r\n     * {@link org.jfree.data.general.SeriesChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param period  the time period to add/update (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                permitted).\r\n     * @param value  the new value.\r\n     *\r\n     * @return A copy of the overwritten data item, or \u003ccode\u003enull\u003c/code\u003e if no \r\n     *         item was overwritten.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.addOrUpdate(org.jfree.data.time.RegularTimePeriod, java.lang.Number)",
      "begin_line": 690,
      "end_line": 725,
      "comment": "\r\n     * Adds or updates an item in the times series and sends a \r\n     * {@link org.jfree.data.general.SeriesChangeEvent} to all registered \r\n     * listeners.\r\n     *\r\n     * @param period  the time period to add/update (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                permitted).\r\n     * @param value  the new value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A copy of the overwritten data item, or \u003ccode\u003enull\u003c/code\u003e if no \r\n     *         item was overwritten.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.removeAgedItems(boolean)",
      "begin_line": 735,
      "end_line": 750,
      "comment": "\r\n     * Age items in the series.  Ensure that the timespan from the youngest to \r\n     * the oldest record in the series does not exceed maximumItemAge time \r\n     * periods.  Oldest items will be removed if required.\r\n     * \r\n     * @param notify  controls whether or not a {@link SeriesChangeEvent} is \r\n     *                sent to registered listeners IF any items are removed.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.removeAgedItems(long, boolean)",
      "begin_line": 762,
      "end_line": 796,
      "comment": "\r\n     * Age items in the series.  Ensure that the timespan from the supplied \r\n     * time to the oldest record in the series does not exceed history count.  \r\n     * oldest items will be removed if required.\r\n     *\r\n     * @param latest  the time to be compared against when aging data \r\n     *     (specified in milliseconds).\r\n     * @param notify  controls whether or not a {@link SeriesChangeEvent} is \r\n     *                sent to registered listeners IF any items are removed.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.clear()",
      "begin_line": 802,
      "end_line": 807,
      "comment": "\r\n     * Removes all data items from the series and sends a \r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.delete(org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 817,
      "end_line": 823,
      "comment": "\r\n     * Deletes the data item for the given time period and sends a \r\n     * {@link SeriesChangeEvent} to all registered listeners.  If there is no\r\n     * item with the specified time period, this method does nothing.\r\n     *\r\n     * @param period  the period of the item to delete (\u003ccode\u003enull\u003c/code\u003e not \r\n     *                permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.delete(int, int)",
      "begin_line": 831,
      "end_line": 839,
      "comment": "\r\n     * Deletes data from start until end index (end inclusive).\r\n     *\r\n     * @param start  the index of the first period to delete.\r\n     * @param end  the index of the last period to delete.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.clone()",
      "begin_line": 856,
      "end_line": 860,
      "comment": "\r\n     * Returns a clone of the time series.\r\n     * \u003cP\u003e\r\n     * Notes:\r\n     * \u003cul\u003e\r\n     *   \u003cli\u003eno need to clone the domain and range descriptions, since String \r\n     *     object is immutable;\u003c/li\u003e\r\n     *   \u003cli\u003ewe pass over to the more general method clone(start, end).\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     *\r\n     * @return A clone of the time series.\r\n     * \r\n     * @throws CloneNotSupportedException not thrown by this class, but \r\n     *         subclasses may differ.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.createCopy(int, int)",
      "begin_line": 874,
      "end_line": 900,
      "comment": "\r\n     * Creates a new timeseries by copying a subset of the data in this time\r\n     * series.\r\n     *\r\n     * @param start  the index of the first time period to copy.\r\n     * @param end  the index of the last time period to copy.\r\n     *\r\n     * @return A series containing a copy of this times series from start until\r\n     *         end.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a cloning problem.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.createCopy(org.jfree.data.time.RegularTimePeriod, org.jfree.data.time.RegularTimePeriod)",
      "begin_line": 914,
      "end_line": 952,
      "comment": "\r\n     * Creates a new timeseries by copying a subset of the data in this time \r\n     * series.\r\n     *\r\n     * @param start  the first time period to copy.\r\n     * @param end  the last time period to copy.\r\n     *\r\n     * @return A time series containing a copy of this time series from start \r\n     *         until end.\r\n     * \r\n     * @throws CloneNotSupportedException if there is a cloning problem.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.equals(java.lang.Object)",
      "begin_line": 961,
      "end_line": 1003,
      "comment": "\r\n     * Tests the series for equality with an arbitrary object.\r\n     *\r\n     * @param object  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.time.TimeSeries.hashCode()",
      "begin_line": 1010,
      "end_line": 1035,
      "comment": "\r\n     * Returns a hash code value for the object.\r\n     *\r\n     * @return The hashcode\r\n     "
    }
  ]
}