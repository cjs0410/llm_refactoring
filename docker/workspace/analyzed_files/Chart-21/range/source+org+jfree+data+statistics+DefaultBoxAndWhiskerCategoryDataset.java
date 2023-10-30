{
  "filepath": "/tmp/Chart-21f/source/org/jfree/data/statistics/DefaultBoxAndWhiskerCategoryDataset.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultBoxAndWhiskerCategoryDataset",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.general.AbstractDataset",
        "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset",
        "org.jfree.data.RangeInfo",
        "org.jfree.chart.util.PublicCloneable"
      ],
      "begin_line": 72,
      "end_line": 814,
      "comment": "\r\n * A convenience class that provides a default implementation of the\r\n * {@link BoxAndWhiskerCategoryDataset} interface.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Storage for the data. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValue"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The minimum range value. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValueRow"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The row index for the cell that the minimum range value comes from. "
    },
    {
      "type": "field",
      "varNames": [
        "minimumRangeValueColumn"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " \r\n     * The column index for the cell that the minimum range value comes from. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValue"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The maximum range value. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValueRow"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The row index for the cell that the maximum range value comes from. "
    },
    {
      "type": "field",
      "varNames": [
        "maximumRangeValueColumn"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " \r\n     * The column index for the cell that the maximum range value comes from. \r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeBounds"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The range of values. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.DefaultBoxAndWhiskerCategoryDataset()",
      "begin_line": 106,
      "end_line": 115,
      "comment": "\r\n     * Creates a new dataset.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.add(java.util.List, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 128,
      "end_line": 132,
      "comment": "\r\n     * Adds a list of values relating to one box-and-whisker entity to the \r\n     * table.  The various median values are calculated.\r\n     *\r\n     * @param list  a collection of values from which the various medians will \r\n     *              be calculated.\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #add(BoxAndWhiskerItem, Comparable, Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.add(org.jfree.data.statistics.BoxAndWhiskerItem, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 144,
      "end_line": 193,
      "comment": "\r\n     * Adds a list of values relating to one Box and Whisker entity to the \r\n     * table.  The various median values are calculated.\r\n     *\r\n     * @param item  a box and whisker item (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #add(List, Comparable, Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getItem(int, int)",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\r\n     * Return an item from within the dataset.\r\n     * \r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     * \r\n     * @return The item.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue(int, int)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\r\n     * Returns the value for an item.\r\n     *\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     *\r\n     * @return The value.\r\n     * \r\n     * @see #getMedianValue(int, int)\r\n     * @see #getValue(Comparable, Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\r\n     * Returns the value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return The value.\r\n     * \r\n     * @see #getMedianValue(Comparable, Comparable)\r\n     * @see #getValue(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue(int, int)",
      "begin_line": 247,
      "end_line": 257,
      "comment": "\r\n     * Returns the mean value for an item.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The mean value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMeanValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 269,
      "end_line": 277,
      "comment": "\r\n     * Returns the mean value for an item.\r\n     * \r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @return The mean value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(int, int)",
      "begin_line": 289,
      "end_line": 297,
      "comment": "\r\n     * Returns the median value for an item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The median value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMedianValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 309,
      "end_line": 317,
      "comment": "\r\n     * Returns the median value for an item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the columnKey.\r\n     *\r\n     * @return The median value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value(int, int)",
      "begin_line": 329,
      "end_line": 337,
      "comment": "\r\n     * Returns the first quartile value.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The first quartile value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ1Value(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 349,
      "end_line": 357,
      "comment": "\r\n     * Returns the first quartile value.\r\n     * \r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @return The first quartile value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value(int, int)",
      "begin_line": 369,
      "end_line": 377,
      "comment": "\r\n     * Returns the third quartile value.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The third quartile value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getQ3Value(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 389,
      "end_line": 397,
      "comment": "\r\n     * Returns the third quartile value.\r\n     * \r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @return The third quartile value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnIndex(java.lang.Comparable)",
      "begin_line": 408,
      "end_line": 410,
      "comment": "\r\n     * Returns the column index for a given key.\r\n     *\r\n     * @param key  the column key.\r\n     *\r\n     * @return The column index.\r\n     * \r\n     * @see #getColumnKey(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnKey(int)",
      "begin_line": 421,
      "end_line": 423,
      "comment": "\r\n     * Returns a column key.\r\n     *\r\n     * @param column  the column index (zero-based).\r\n     *\r\n     * @return The column key.\r\n     * \r\n     * @see #getColumnIndex(Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnKeys()",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\r\n     * Returns the column keys.\r\n     *\r\n     * @return The keys.\r\n     * \r\n     * @see #getRowKeys()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowIndex(java.lang.Comparable)",
      "begin_line": 445,
      "end_line": 447,
      "comment": "\r\n     * Returns the row index for a given key.\r\n     *\r\n     * @param key  the row key.\r\n     *\r\n     * @return The row index.\r\n     * \r\n     * @see #getRowKey(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowKey(int)",
      "begin_line": 458,
      "end_line": 460,
      "comment": "\r\n     * Returns a row key.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     *\r\n     * @return The row key.\r\n     * \r\n     * @see #getRowIndex(Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowKeys()",
      "begin_line": 469,
      "end_line": 471,
      "comment": "\r\n     * Returns the row keys.\r\n     *\r\n     * @return The keys.\r\n     * \r\n     * @see #getColumnKeys()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRowCount()",
      "begin_line": 480,
      "end_line": 482,
      "comment": "\r\n     * Returns the number of rows in the table.\r\n     *\r\n     * @return The row count.\r\n     * \r\n     * @see #getColumnCount()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getColumnCount()",
      "begin_line": 491,
      "end_line": 493,
      "comment": "\r\n     * Returns the number of columns in the table.\r\n     *\r\n     * @return The column count.\r\n     * \r\n     * @see #getRowCount()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRangeLowerBound(boolean)",
      "begin_line": 505,
      "end_line": 507,
      "comment": "\r\n     * Returns the minimum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The minimum value.\r\n     * \r\n     * @see #getRangeUpperBound(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRangeUpperBound(boolean)",
      "begin_line": 519,
      "end_line": 521,
      "comment": "\r\n     * Returns the maximum y-value in the dataset.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The maximum value.\r\n     * \r\n     * @see #getRangeLowerBound(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getRangeBounds(boolean)",
      "begin_line": 531,
      "end_line": 533,
      "comment": "\r\n     * Returns the range of the values in this dataset\u0027s range.\r\n     *\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * \r\n     * @return The range.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue(int, int)",
      "begin_line": 545,
      "end_line": 553,
      "comment": "\r\n     * Returns the minimum regular (non outlier) value for an item.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The minimum regular value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinRegularValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 565,
      "end_line": 573,
      "comment": "\r\n     * Returns the minimum regular (non outlier) value for an item.\r\n     * \r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @return The minimum regular value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(int, int)",
      "begin_line": 585,
      "end_line": 593,
      "comment": "\r\n     * Returns the maximum regular (non outlier) value for an item.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The maximum regular value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxRegularValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 605,
      "end_line": 613,
      "comment": "\r\n     * Returns the maximum regular (non outlier) value for an item.\r\n     * \r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @return The maximum regular value.\r\n     * \r\n     * @see #getItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier(int, int)",
      "begin_line": 625,
      "end_line": 633,
      "comment": "\r\n     * Returns the minimum outlier (non farout) value for an item.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The minimum outlier.\r\n     * \r\n     * @see #getItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMinOutlier(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 645,
      "end_line": 653,
      "comment": "\r\n     * Returns the minimum outlier (non farout) value for an item.\r\n     * \r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @return The minimum outlier.\r\n     * \r\n     * @see #getItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier(int, int)",
      "begin_line": 665,
      "end_line": 673,
      "comment": "\r\n     * Returns the maximum outlier (non farout) value for an item.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return The maximum outlier.\r\n     * \r\n     * @see #getItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getMaxOutlier(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 685,
      "end_line": 693,
      "comment": "\r\n     * Returns the maximum outlier (non farout) value for an item.\r\n     * \r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @return The maximum outlier.\r\n     * \r\n     * @see #getItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers(int, int)",
      "begin_line": 705,
      "end_line": 713,
      "comment": "\r\n     * Returns a list of outlier values for an item.\r\n     * \r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * \r\n     * @return A list of outlier values.\r\n     * \r\n     * @see #getItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.getOutliers(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 725,
      "end_line": 733,
      "comment": "\r\n     * Returns a list of outlier values for an item.\r\n     * \r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * \r\n     * @return A list of outlier values.\r\n     * \r\n     * @see #getItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.updateBounds()",
      "begin_line": 739,
      "end_line": 779,
      "comment": "\r\n     * Resets the cached bounds, by iterating over the entire dataset to find\r\n     * the current bounds.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.equals(java.lang.Object)",
      "begin_line": 788,
      "end_line": 798,
      "comment": "\r\n     * Tests this dataset for equality with an arbitrary object.\r\n     * \r\n     * @param obj  the object to test against (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @return A boolean.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset.clone()",
      "begin_line": 807,
      "end_line": 812,
      "comment": "\r\n     * Returns a clone of this dataset.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException if cloning is not possible.\r\n     "
    }
  ]
}