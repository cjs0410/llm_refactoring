{
  "filepath": "/tmp/Chart-22f/source/org/jfree/data/KeyedObjects2D.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "KeyedObjects2D",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 495,
      "comment": "\r\n * A data structure that stores zero, one or many objects, where each object is\r\n * associated with two keys (a \u0027row\u0027 key and a \u0027column\u0027 key).\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "rowKeys"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " The row keys. "
    },
    {
      "type": "field",
      "varNames": [
        "columnKeys"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The column keys. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " The row data. "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.KeyedObjects2D.KeyedObjects2D()",
      "begin_line": 74,
      "end_line": 78,
      "comment": "\r\n     * Creates a new instance (initially empty).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getRowCount()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\r\n     * Returns the row count.\r\n     *\r\n     * @return The row count.\r\n     * \r\n     * @see #getColumnCount()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getColumnCount()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\r\n     * Returns the column count.\r\n     *\r\n     * @return The column count.\r\n     * \r\n     * @see #getRowCount()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getObject(int, int)",
      "begin_line": 112,
      "end_line": 125,
      "comment": "\r\n     * Returns the object for a given row and column.\r\n     *\r\n     * @param row  the row index (in the range 0 to getRowCount() - 1).\r\n     * @param column  the column index (in the range 0 to getColumnCount() - 1).\r\n     *\r\n     * @return The object (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getObject(Comparable, Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getRowKey(int)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\r\n     * Returns the key for a given row.\r\n     *\r\n     * @param row  the row index (zero based).\r\n     *\r\n     * @return The row index.\r\n     * \r\n     * @see #getRowIndex(Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getRowIndex(java.lang.Comparable)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\r\n     * Returns the row index for a given key.\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @return The row index.\r\n     * \r\n     * @see #getRowKey(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getRowKeys()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\r\n     * Returns the row keys.\r\n     *\r\n     * @return The row keys (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getRowKeys()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getColumnKey(int)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\r\n     * Returns the key for a given column.\r\n     *\r\n     * @param column  the column.\r\n     *\r\n     * @return The key.\r\n     * \r\n     * @see #getColumnIndex(Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getColumnIndex(java.lang.Comparable)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\r\n     * Returns the column index for a given key.\r\n     *\r\n     * @param key  the key.\r\n     *\r\n     * @return The column index.\r\n     * \r\n     * @see #getColumnKey(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getColumnKeys()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\r\n     * Returns the column keys.\r\n     *\r\n     * @return The column keys (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getRowKeys()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.getObject(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 214,
      "end_line": 239,
      "comment": "\r\n     * Returns the object for the given row and column keys.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The object (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003erowKey\u003ccode\u003e or \r\n     *         \u003ccode\u003ecolumnKey\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\r\n     * @throws UnknownKeyException if \u003ccode\u003erowKey\u003c/code\u003e or \r\n     *         \u003ccode\u003ecolumnKey\u003c/code\u003e is not recognised.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.addObject(java.lang.Object, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 248,
      "end_line": 251,
      "comment": "\r\n     * Adds an object to the table.  Performs the same function as setObject().\r\n     *\r\n     * @param object  the object.\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.setObject(java.lang.Object, java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 260,
      "end_line": 285,
      "comment": "\r\n     * Adds or updates an object.\r\n     *\r\n     * @param object  the object.\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.removeObject(java.lang.Comparable, java.lang.Comparable)",
      "begin_line": 297,
      "end_line": 342,
      "comment": "\r\n     * Removes an object from the table by setting it to \u003ccode\u003enull\u003c/code\u003e.  If\r\n     * all the objects in the specified row and/or column are now \r\n     * \u003ccode\u003enull\u003c/code\u003e, the row and/or column is removed from the table.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #addObject(Object, Comparable, Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.removeRow(int)",
      "begin_line": 351,
      "end_line": 354,
      "comment": "\r\n     * Removes an entire row from the table.\r\n     *\r\n     * @param rowIndex  the row index.\r\n     * \r\n     * @see #removeColumn(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.removeRow(java.lang.Comparable)",
      "begin_line": 365,
      "end_line": 372,
      "comment": "\r\n     * Removes an entire row from the table.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @throws UnknownKeyException if \u003ccode\u003erowKey\u003c/code\u003e is not recognised.\r\n     * \r\n     * @see #removeColumn(Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.removeColumn(int)",
      "begin_line": 381,
      "end_line": 384,
      "comment": "\r\n     * Removes an entire column from the table.\r\n     *\r\n     * @param columnIndex  the column index.\r\n     * \r\n     * @see #removeRow(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.removeColumn(java.lang.Comparable)",
      "begin_line": 395,
      "end_line": 410,
      "comment": "\r\n     * Removes an entire column from the table.\r\n     *\r\n     * @param columnKey  the column key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @throws UnknownKeyException if \u003ccode\u003erowKey\u003c/code\u003e is not recognised.\r\n     * \r\n     * @see #removeRow(Comparable)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.equals(java.lang.Object)",
      "begin_line": 419,
      "end_line": 459,
      "comment": "\r\n     * Tests this object for equality with an arbitrary object.\r\n     *\r\n     * @param obj  the object to test (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.hashCode()",
      "begin_line": 466,
      "end_line": 472,
      "comment": "\r\n     * Returns a hashcode for this object.\r\n     * \r\n     * @return A hashcode.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.KeyedObjects2D.clone()",
      "begin_line": 482,
      "end_line": 493,
      "comment": "\r\n     * Returns a clone.\r\n     * \r\n     * @return A clone.\r\n     * \r\n     * @throws CloneNotSupportedException  this class will not throw this \r\n     *         exception, but subclasses (if any) might.\r\n     "
    }
  ]
}