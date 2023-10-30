{
  "filepath": "/tmp/Chart-18f/source/org/jfree/data/DefaultKeyedValues2D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultKeyedValues2D",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.KeyedValues2D",
        "org.jfree.chart.util.PublicCloneable",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 72,
      "end_line": 569,
      "comment": "\r\n * A data structure that stores zero, one or many values, where each value \r\n * is associated with two keys (a \u0027row\u0027 key and a \u0027column\u0027 key).  The keys \r\n * should be (a) instances of {@link Comparable} and (b) immutable.  \r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "rowKeys"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The row keys. "
    },
    {
      "type": "field",
      "varNames": [
        "columnKeys"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " The column keys. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The row data. "
    },
    {
      "type": "field",
      "varNames": [
        "sortRowKeys"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " If the row keys should be sorted by their comparable order. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.DefaultKeyedValues2D.DefaultKeyedValues2D()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\r\n     * Creates a new instance (initially empty).\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.DefaultKeyedValues2D.DefaultKeyedValues2D(boolean)",
      "begin_line": 103,
      "end_line": 108,
      "comment": "\r\n     * Creates a new instance (initially empty).\r\n     * \r\n     * @param sortRowKeys  if the row keys should be sorted.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getRowCount()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\r\n     * Returns the row count.\r\n     *\r\n     * @return The row count.\r\n     * \r\n     * @see #getColumnCount()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getColumnCount()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\r\n     * Returns the column count.\r\n     *\r\n     * @return The column count.\r\n     * \r\n     * @see #getRowCount()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getValue(int, int)",
      "begin_line": 142,
      "end_line": 155,
      "comment": "\r\n     * Returns the value for a given row and column.\r\n     *\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     *\r\n     * @return The value.\r\n     * \r\n     * @see #getValue(Comparable, Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getRowKey(int)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n     * Returns the key for a given row.\r\n     *\r\n     * @param row  the row index (in the range 0 to {@link #getRowCount()} - 1).\r\n     *\r\n     * @return The row key.\r\n     * \r\n     * @see #getRowIndex(Comparable)\r\n     * @see #getColumnKey(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getRowIndex(java.lang.Comparable)",
      "begin_line": 181,
      "end_line": 191,
      "comment": "\r\n     * Returns the row index for a given key.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The row index.\r\n     * \r\n     * @see #getRowKey(int)\r\n     * @see #getColumnIndex(Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getRowKeys()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\r\n     * Returns the row keys in an unmodifiable list.\r\n     *\r\n     * @return The row keys.\r\n     * \r\n     * @see #getColumnKeys()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getColumnKey(int)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\r\n     * Returns the key for a given column.\r\n     *\r\n     * @param column  the column (in the range 0 to {@link #getColumnCount()} \r\n     *     - 1).\r\n     *\r\n     * @return The key.\r\n     * \r\n     * @see #getColumnIndex(Comparable)\r\n     * @see #getRowKey(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getColumnIndex(java.lang.Comparable)",
      "begin_line": 229,
      "end_line": 234,
      "comment": "\r\n     * Returns the column index for a given key.\r\n     *\r\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The column index.\r\n     * \r\n     * @see #getColumnKey(int)\r\n     * @see #getRowIndex(Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getColumnKeys()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\r\n     * Returns the column keys in an unmodifiable list.\r\n     *\r\n     * @return The column keys.\r\n     * \r\n     * @see #getRowKeys()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.getValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 260,
      "end_line": 287,
      "comment": "\r\n     * Returns the value for the given row and column keys.  This method will\r\n     * throw an {@link UnknownKeyException} if either key is not defined in the\r\n     * data structure.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #addValue(Number, Comparable, Comparable)\r\n     * @see #removeValue(Comparable, Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.addValue(java.lang.Number, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 300,
      "end_line": 304,
      "comment": "\r\n     * Adds a value to the table.  Performs the same function as \r\n     * #setValue(Number, Comparable, Comparable).\r\n     *\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #setValue(Number, Comparable, Comparable)\r\n     * @see #removeValue(Comparable, Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.setValue(java.lang.Number, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 316,
      "end_line": 343,
      "comment": "\r\n     * Adds or updates a value.\r\n     *\r\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #addValue(Number, Comparable, Comparable)\r\n     * @see #removeValue(Comparable, Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.removeValue(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 355,
      "end_line": 401,
      "comment": "\r\n     * Removes a value from the table by setting it to \u003ccode\u003enull\u003c/code\u003e.  If\r\n     * all the values in the specified row and/or column are now \r\n     * \u003ccode\u003enull\u003c/code\u003e, the row and/or column is removed from the table.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #addValue(Number, Comparable, Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.removeRow(int)",
      "begin_line": 411,
      "end_line": 414,
      "comment": "\r\n     * Removes a row.\r\n     *\r\n     * @param rowIndex  the row index.\r\n     * \r\n     * @see #removeRow(Comparable)\r\n     * @see #removeColumn(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.removeRow(java.lang.Comparable)",
      "begin_line": 424,
      "end_line": 426,
      "comment": "\r\n     * Removes a row.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #removeRow(int)\r\n     * @see #removeColumn(Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.removeColumn(int)",
      "begin_line": 436,
      "end_line": 439,
      "comment": "\r\n     * Removes a column.\r\n     *\r\n     * @param columnIndex  the column index.\r\n     * \r\n     * @see #removeColumn(Comparable)\r\n     * @see #removeRow(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.removeColumn(java.lang.Comparable)",
      "begin_line": 454,
      "end_line": 470,
      "comment": "\r\n     * Removes a column from the table.\r\n     *\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @throws UnknownKeyException if the table does not contain a column with\r\n     *     the specified key.\r\n     * @throws IllegalArgumentException if \u003ccode\u003ecolumnKey\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @see #removeColumn(int)\r\n     * @see #removeRow(Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.clear()",
      "begin_line": 475,
      "end_line": 479,
      "comment": "\r\n     * Clears all the data and associated keys.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.equals(java.lang.Object)",
      "begin_line": 488,
      "end_line": 534,
      "comment": "\r\n     * Tests if this object is equal to another.\r\n     *\r\n     * @param o  the other object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.hashCode()",
      "begin_line": 541,
      "end_line": 547,
      "comment": "\r\n     * Returns a hash code.\r\n     * \r\n     * @return A hash code.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues2D.clone()",
      "begin_line": 557,
      "end_line": 567,
      "comment": "\r\n     * Returns a clone.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  this class will not throw this \r\n     *         exception, but subclasses (if any) might.\r\n     "
    }
  ]
}