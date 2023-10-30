{
  "filepath": "/tmp/Chart-18f/source/org/jfree/data/DefaultKeyedValues.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultKeyedValues",
      "is_interface": false,
      "parent_types": [
        "org.jfree.data.KeyedValues",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 76,
      "end_line": 470,
      "comment": "\n * An ordered list of (key, value) items.  This class provides a default \n * implementation of the {@link KeyedValues} interface.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "keys"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Storage for the keys. "
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Storage for the values. "
    },
    {
      "type": "field",
      "varNames": [
        "indexMap"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " \n     * Contains (key, Integer) mappings, where the Integer is the index for\n     * the key in the list. \n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.DefaultKeyedValues.DefaultKeyedValues()",
      "begin_line": 98,
      "end_line": 102,
      "comment": "\n     * Creates a new collection (initially empty).\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.getItemCount()",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Returns the number of items (values) in the collection.\n     *\n     * @return The item count.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.getValue(int)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Returns a value.\n     *\n     * @param item  the item of interest (zero-based index).\n     *\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @throws IndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is out of bounds.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.getKey(int)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Returns a key.\n     *\n     * @param index  the item index (zero-based).\n     *\n     * @return The row key.\n     * \n     * @throws IndexOutOfBoundsException if \u003ccode\u003eitem\u003c/code\u003e is out of bounds.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.getIndex(java.lang.Comparable)",
      "begin_line": 149,
      "end_line": 158,
      "comment": "\n     * Returns the index for a given key.\n     *\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The index, or \u003ccode\u003e-1\u003c/code\u003e if the key is not recognised.\n     * \n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \n     *     \u003ccode\u003enull\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.getKeys()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Returns the keys for the values in the collection.\n     *\n     * @return The keys (never \u003ccode\u003enull\u003c/code\u003e).\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.getValue(java.lang.Comparable)",
      "begin_line": 180,
      "end_line": 186,
      "comment": "\n     * Returns the value for a given key.\n     *\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     *\n     * @return The value (possibly \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @throws UnknownKeyException if the key is not recognised.\n     * \n     * @see #getValue(int)\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.addValue(java.lang.Comparable, double)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Updates an existing value, or adds a new value to the collection.\n     *\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param value  the value.\n     * \n     * @see #addValue(Comparable, Number)\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.addValue(java.lang.Comparable, java.lang.Number)",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * Adds a new value to the collection, or updates an existing value.\n     * This method passes control directly to the \n     * {@link #setValue(Comparable, Number)} method.\n     *\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.setValue(java.lang.Comparable, double)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Updates an existing value, or adds a new value to the collection.\n     *\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param value  the value.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.setValue(java.lang.Comparable, java.lang.Number)",
      "begin_line": 228,
      "end_line": 242,
      "comment": "\n     * Updates an existing value, or adds a new value to the collection.\n     *\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.insertValue(int, java.lang.Comparable, double)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Inserts a new value at the specified position in the dataset or, if\n     * there is an existing item with the specified key, updates the value \n     * for that item and moves it to the specified position.\n     * \n     * @param position  the position (in the range 0 to getItemCount()).\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param value  the value.\n     * \n     * @since 1.0.6\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.insertValue(int, java.lang.Comparable, java.lang.Number)",
      "begin_line": 270,
      "end_line": 292,
      "comment": "\n     * Inserts a new value at the specified position in the dataset or, if\n     * there is an existing item with the specified key, updates the value \n     * for that item and moves it to the specified position.\n     * \n     * @param position  the position (in the range 0 to getItemCount()).\n     * @param key  the key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param value  the value (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * \n     * @since 1.0.6\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.rebuildIndex()",
      "begin_line": 298,
      "end_line": 304,
      "comment": "\n     * Rebuilds the key to indexed-position mapping after an positioned insert\n     * or a remove operation.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.removeValue(int)",
      "begin_line": 315,
      "end_line": 319,
      "comment": "\n     * Removes a value from the collection.\n     *\n     * @param index  the index of the item to remove (in the range \n     *     \u003ccode\u003e0\u003c/code\u003e to \u003ccode\u003egetItemCount() - 1\u003c/code\u003e).\n     *     \n     * @throws IndexOutOfBoundsException if \u003ccode\u003eindex\u003c/code\u003e is not within\n     *     the specified range.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.removeValue(java.lang.Comparable)",
      "begin_line": 330,
      "end_line": 337,
      "comment": "\n     * Removes a value from the collection.\n     *\n     * @param key  the item key (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * \n     * @throws IllegalArgumentException if \u003ccode\u003ekey\u003c/code\u003e is \n     *     \u003ccode\u003enull\u003c/code\u003e.\n     * @throws UnknownKeyException if \u003ccode\u003ekey\u003c/code\u003e is not recognised.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.clear()",
      "begin_line": 344,
      "end_line": 348,
      "comment": "\n     * Clears all values from the collection.\n     * \n     * @since 1.0.2\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.sortByKeys(org.jfree.chart.util.SortOrder)",
      "begin_line": 355,
      "end_line": 373,
      "comment": "\n     * Sorts the items in the list by key.\n     *\n     * @param order  the sort order (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.sortByValues(org.jfree.chart.util.SortOrder)",
      "begin_line": 382,
      "end_line": 399,
      "comment": "\n     * Sorts the items in the list by value.  If the list contains \n     * \u003ccode\u003enull\u003c/code\u003e values, they will sort to the end of the list, \n     * irrespective of the sort order.\n     *\n     * @param order  the sort order (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.equals(java.lang.Object)",
      "begin_line": 408,
      "end_line": 443,
      "comment": "\n     * Tests if this object is equal to another.\n     *\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.hashCode()",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\n     * Returns a hash code.\n     * \n     * @return A hash code.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.DefaultKeyedValues.clone()",
      "begin_line": 462,
      "end_line": 468,
      "comment": "\n     * Returns a clone.\n     * \n     * @return A clone.\n     * \n     * @throws CloneNotSupportedException  this class will not throw this \n     *         exception, but subclasses might.\n     "
    }
  ]
}