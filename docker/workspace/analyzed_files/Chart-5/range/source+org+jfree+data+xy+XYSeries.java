{
  "filepath": "/tmp/Chart-5f/source/org/jfree/data/xy/XYSeries.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYSeries",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.Series",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 96,
      "end_line": 736,
      "comment": "\r\n * Represents a sequence of zero or more data items in the form (x, y).  By\r\n * default, items in the series will be sorted into ascending order by x-value,\r\n * and duplicate x-values are permitted.  Both the sorting and duplicate\r\n * defaults can be changed in the constructor.  Y-values can be\r\n * \u003ccode\u003enull\u003c/code\u003e to represent missing values.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Storage for the data items in the series. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumItemCount"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " The maximum number of items for the series. "
    },
    {
      "type": "field",
      "varNames": [
        "autoSort"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " A flag that controls whether the items are automatically sorted. "
    },
    {
      "type": "field",
      "varNames": [
        "allowDuplicateXValues"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " A flag that controls whether or not duplicate x-values are allowed. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYSeries.XYSeries(java.lang.Comparable)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\r\n     * Creates a new empty series.  By default, items added to the series will\r\n     * be sorted into ascending order by x-value, and duplicate x-values will\r\n     * be allowed (these defaults can be modified with another constructor.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYSeries.XYSeries(java.lang.Comparable, boolean)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\r\n     * Constructs a new empty series, with the auto-sort flag set as requested,\r\n     * and duplicate values allowed.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param autoSort  a flag that controls whether or not the items in the\r\n     *                  series are sorted.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.xy.XYSeries.XYSeries(java.lang.Comparable, boolean, boolean)",
      "begin_line": 150,
      "end_line": 157,
      "comment": "\r\n     * Constructs a new xy-series that contains no data.  You can specify\r\n     * whether or not duplicate x-values are allowed for the series.\r\n     *\r\n     * @param key  the series key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param autoSort  a flag that controls whether or not the items in the\r\n     *                  series are sorted.\r\n     * @param allowDuplicateXValues  a flag that controls whether duplicate\r\n     *                               x-values are allowed.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getAutoSort()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\r\n     * Returns the flag that controls whether the items in the series are\r\n     * automatically sorted.  There is no setter for this flag, it must be\r\n     * defined in the series constructor.\r\n     *\r\n     * @return A boolean.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getAllowDuplicateXValues()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\r\n     * Returns a flag that controls whether duplicate x-values are allowed.\r\n     * This flag can only be set in the constructor.\r\n     *\r\n     * @return A boolean.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getItemCount()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\r\n     * Returns the number of items in the series.\r\n     *\r\n     * @return The item count.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getItems()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\r\n     * Returns the list of data items for the series (the list contains\r\n     * {@link XYDataItem} objects and is unmodifiable).\r\n     *\r\n     * @return The list of data items.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getMaximumItemCount()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\r\n     * Returns the maximum number of items that will be retained in the series.\r\n     * The default value is \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e.\r\n     *\r\n     * @return The maximum item count.\r\n     * @see #setMaximumItemCount(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.setMaximumItemCount(int)",
      "begin_line": 224,
      "end_line": 234,
      "comment": "\r\n     * Sets the maximum number of items that will be retained in the series.\r\n     * If you add a new item to the series such that the number of items will\r\n     * exceed the maximum item count, then the first element in the series is\r\n     * automatically removed, ensuring that the maximum item count is not\r\n     * exceeded.\r\n     * \u003cp\u003e\r\n     * Typically this value is set before the series is populated with data,\r\n     * but if it is applied later, it may cause some items to be removed from\r\n     * the series (in which case a {@link SeriesChangeEvent} will be sent to\r\n     * all registered listeners.\r\n     *\r\n     * @param maximum  the maximum number of items for the series.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(org.jfree.data.xy.XYDataItem)",
      "begin_line": 242,
      "end_line": 245,
      "comment": "\r\n     * Adds a data item to the series and sends a {@link SeriesChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param item  the (x, y) item (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(double, double)",
      "begin_line": 254,
      "end_line": 256,
      "comment": "\r\n     * Adds a data item to the series and sends a {@link SeriesChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param x  the x value.\r\n     * @param y  the y value.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(double, double, boolean)",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\r\n     * Adds a data item to the series and, if requested, sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param x  the x value.\r\n     * @param y  the y value.\r\n     * @param notify  a flag that controls whether or not a\r\n     *                {@link SeriesChangeEvent} is sent to all registered\r\n     *                listeners.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(double, java.lang.Number)",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\r\n     * Adds a data item to the series and sends a {@link SeriesChangeEvent} to\r\n     * all registered listeners.  The unusual pairing of parameter types is to\r\n     * make it easier to add \u003ccode\u003enull\u003c/code\u003e y-values.\r\n     *\r\n     * @param x  the x value.\r\n     * @param y  the y value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(double, java.lang.Number, boolean)",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\r\n     * Adds a data item to the series and, if requested, sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.  The unusual\r\n     * pairing of parameter types is to make it easier to add null y-values.\r\n     *\r\n     * @param x  the x value.\r\n     * @param y  the y value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  a flag that controls whether or not a\r\n     *                {@link SeriesChangeEvent} is sent to all registered\r\n     *                listeners.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(java.lang.Number, java.lang.Number)",
      "begin_line": 313,
      "end_line": 316,
      "comment": "\r\n     * Adds a new data item to the series (in the correct position if the\r\n     * \u003ccode\u003eautoSort\u003c/code\u003e flag is set for the series) and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Throws an exception if the x-value is a duplicate AND the\r\n     * allowDuplicateXValues flag is false.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @throws SeriesException if the x-value is a duplicate and the\r\n     *     \u003ccode\u003eallowDuplicateXValues\u003c/code\u003e flag is not set for this series.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(java.lang.Number, java.lang.Number, boolean)",
      "begin_line": 331,
      "end_line": 335,
      "comment": "\r\n     * Adds new data to the series and, if requested, sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Throws an exception if the x-value is a duplicate AND the\r\n     * allowDuplicateXValues flag is false.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  a flag the controls whether or not a\r\n     *                {@link SeriesChangeEvent} is sent to all registered\r\n     *                listeners.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.add(org.jfree.data.xy.XYDataItem, boolean)",
      "begin_line": 346,
      "end_line": 394,
      "comment": "\r\n     * Adds a data item to the series and, if requested, sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param item  the (x, y) item (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  a flag that controls whether or not a\r\n     *                {@link SeriesChangeEvent} is sent to all registered\r\n     *                listeners.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.delete(int, int)",
      "begin_line": 403,
      "end_line": 408,
      "comment": "\r\n     * Deletes a range of items from the series and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param start  the start index (zero-based).\r\n     * @param end  the end index (zero-based).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.remove(int)",
      "begin_line": 418,
      "end_line": 422,
      "comment": "\r\n     * Removes the item at the specified index and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     *\r\n     * @return The item removed.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.remove(java.lang.Number)",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\r\n     * Removes the item with the specified x-value and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param x  the x-value.\r\n\r\n     * @return The item removed.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.clear()",
      "begin_line": 439,
      "end_line": 444,
      "comment": "\r\n     * Removes all data items from the series.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getDataItem(int)",
      "begin_line": 453,
      "end_line": 455,
      "comment": "\r\n     * Return the data item with the specified index.\r\n     *\r\n     * @param index  the index.\r\n     *\r\n     * @return The data item with the specified index.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getX(int)",
      "begin_line": 464,
      "end_line": 466,
      "comment": "\r\n     * Returns the x-value at the specified index.\r\n     *\r\n     * @param index  the index (zero-based).\r\n     *\r\n     * @return The x-value (never \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.getY(int)",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\r\n     * Returns the y-value at the specified index.\r\n     *\r\n     * @param index  the index (zero-based).\r\n     *\r\n     * @return The y-value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.updateByIndex(int, java.lang.Number)",
      "begin_line": 488,
      "end_line": 492,
      "comment": "\r\n     * Updates the value of an item in the series and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the item (zero based index).\r\n     * @param y  the new value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.1\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.update(java.lang.Number, java.lang.Number)",
      "begin_line": 503,
      "end_line": 513,
      "comment": "\r\n     * Updates an item in the series.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @throws SeriesException if there is no existing item with the specified\r\n     *         x-value.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.addOrUpdate(double, double)",
      "begin_line": 526,
      "end_line": 528,
      "comment": "\r\n     * Adds or updates an item in the series and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param x  the x-value.\r\n     * @param y  the y-value.\r\n     *\r\n     * @return The item that was overwritten, if any.\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.addOrUpdate(java.lang.Number, java.lang.Number)",
      "begin_line": 540,
      "end_line": 580,
      "comment": "\r\n     * Adds or updates an item in the series and sends a\r\n     * {@link SeriesChangeEvent} to all registered listeners.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param y  the y-value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A copy of the overwritten data item, or \u003ccode\u003enull\u003c/code\u003e if no\r\n     *         item was overwritten.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.indexOf(java.lang.Number)",
      "begin_line": 592,
      "end_line": 605,
      "comment": "\r\n     * Returns the index of the item with the specified x-value, or a negative\r\n     * index if the series does not contain an item with that x-value.  Be\r\n     * aware that for an unsorted series, the index is found by iterating\r\n     * through all items in the series.\r\n     *\r\n     * @param x  the x-value (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.toArray()",
      "begin_line": 614,
      "end_line": 628,
      "comment": "\r\n     * Returns a new array containing the x and y values from this series.\r\n     *\r\n     * @return A new array containing the x and y values from this series.\r\n     *\r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.clone()",
      "begin_line": 637,
      "end_line": 641,
      "comment": "\r\n     * Returns a clone of the series.\r\n     *\r\n     * @return A clone of the series.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a cloning problem.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.createCopy(int, int)",
      "begin_line": 653,
      "end_line": 672,
      "comment": "\r\n     * Creates a new series by copying a subset of the data in this time series.\r\n     *\r\n     * @param start  the index of the first item to copy.\r\n     * @param end  the index of the last item to copy.\r\n     *\r\n     * @return A series containing a copy of this series from start until end.\r\n     *\r\n     * @throws CloneNotSupportedException if there is a cloning problem.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.equals(java.lang.Object)",
      "begin_line": 682,
      "end_line": 706,
      "comment": "\r\n     * Tests this series for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test against for equality\r\n     *             (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.xy.XYSeries.hashCode()",
      "begin_line": 713,
      "end_line": 734,
      "comment": "\r\n     * Returns a hash code.\r\n     *\r\n     * @return A hash code.\r\n     "
    }
  ]
}