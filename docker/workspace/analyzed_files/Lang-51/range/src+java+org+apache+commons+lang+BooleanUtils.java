{
  "filepath": "/tmp/Lang-51f/src/java/org/apache/commons/lang/BooleanUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BooleanUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 973,
      "comment": "\n * \u003cp\u003eOperations on boolean primitives and Boolean objects.\u003c/p\u003e\n *\n * \u003cp\u003eThis class tries to handle \u003ccode\u003enull\u003c/code\u003e input gracefully.\n * An exception will not be thrown for a \u003ccode\u003enull\u003c/code\u003e input.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n * \n * @author Stephen Colebourne\n * @author Matthew Hawthorne\n * @author Gary Gregory\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.BooleanUtils.BooleanUtils()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eBooleanUtils\u003c/code\u003e instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eBooleanUtils.toBooleanObject(true);\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.negate(java.lang.Boolean)",
      "begin_line": 63,
      "end_line": 68,
      "comment": "\n     * \u003cp\u003eNegates the specified boolean.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf \u003ccode\u003enull\u003c/code\u003e is passed in, \u003ccode\u003enull\u003c/code\u003e will be returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.negate(Boolean.TRUE)  \u003d Boolean.FALSE;\n     *   BooleanUtils.negate(Boolean.FALSE) \u003d Boolean.TRUE;\n     *   BooleanUtils.negate(null)          \u003d null;\n     * \u003c/pre\u003e\n     * \n     * @param bool  the Boolean to negate, may be null\n     * @return the negated Boolean, or \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.isTrue(java.lang.Boolean)",
      "begin_line": 86,
      "end_line": 91,
      "comment": "\n     * \u003cp\u003eChecks if a \u003ccode\u003eBoolean\u003c/code\u003e value is \u003ccode\u003etrue\u003c/code\u003e,\n     * handling \u003ccode\u003enull\u003c/code\u003e by returning \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.isTrue(Boolean.TRUE)  \u003d true\n     *   BooleanUtils.isTrue(Boolean.FALSE) \u003d false\n     *   BooleanUtils.isTrue(null)          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to check, null returns \u003ccode\u003efalse\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e only if the input is non-null and true\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.isNotTrue(java.lang.Boolean)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * \u003cp\u003eChecks if a \u003ccode\u003eBoolean\u003c/code\u003e value is \u003ci\u003enot\u003c/i\u003e \u003ccode\u003etrue\u003c/code\u003e,\n     * handling \u003ccode\u003enull\u003c/code\u003e by returning \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.isNotTrue(Boolean.TRUE)  \u003d false\n     *   BooleanUtils.isNotTrue(Boolean.FALSE) \u003d true\n     *   BooleanUtils.isNotTrue(null)          \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to check, null returns \u003ccode\u003etrue\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the input is null or false\n     * @since 2.3\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.isFalse(java.lang.Boolean)",
      "begin_line": 125,
      "end_line": 130,
      "comment": "\n     * \u003cp\u003eChecks if a \u003ccode\u003eBoolean\u003c/code\u003e value is \u003ccode\u003efalse\u003c/code\u003e,\n     * handling \u003ccode\u003enull\u003c/code\u003e by returning \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.isFalse(Boolean.TRUE)  \u003d false\n     *   BooleanUtils.isFalse(Boolean.FALSE) \u003d true\n     *   BooleanUtils.isFalse(null)          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to check, null returns \u003ccode\u003efalse\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e only if the input is non-null and false\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.isNotFalse(java.lang.Boolean)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * \u003cp\u003eChecks if a \u003ccode\u003eBoolean\u003c/code\u003e value is \u003ci\u003enot\u003c/i\u003e \u003ccode\u003efalse\u003c/code\u003e,\n     * handling \u003ccode\u003enull\u003c/code\u003e by returning \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.isNotFalse(Boolean.TRUE)  \u003d true\n     *   BooleanUtils.isNotFalse(Boolean.FALSE) \u003d false\n     *   BooleanUtils.isNotFalse(null)          \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to check, null returns \u003ccode\u003etrue\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the input is null or true\n     * @since 2.3\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBooleanObject(boolean)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * \u003cp\u003eBoolean factory that avoids creating new Boolean objecs all the time.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method was added to JDK1.4 but is available here for earlier JDKs.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(false) \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(true)  \u003d Boolean.TRUE\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return Boolean.TRUE or Boolean.FALSE as appropriate\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBoolean(java.lang.Boolean)",
      "begin_line": 182,
      "end_line": 187,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a boolean handling \u003ccode\u003enull\u003c/code\u003e\n     * by returning \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(Boolean.TRUE)  \u003d true\n     *   BooleanUtils.toBoolean(Boolean.FALSE) \u003d false\n     *   BooleanUtils.toBoolean(null)          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e, \n     *  \u003ccode\u003enull\u003c/code\u003e returns \u003ccode\u003efalse\u003c/code\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(java.lang.Boolean, boolean)",
      "begin_line": 202,
      "end_line": 207,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a boolean handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, false) \u003d true\n     *   BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, true) \u003d false\n     *   BooleanUtils.toBooleanDefaultIfNull(null, true)          \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @param valueIfNull  the boolean value to return if \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBoolean(int)",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * \u003cp\u003eConverts an int to a boolean using the convention that \u003ccode\u003ezero\u003c/code\u003e\n     * is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(0) \u003d false\n     *   BooleanUtils.toBoolean(1) \u003d true\n     *   BooleanUtils.toBoolean(2) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param value  the int to convert\n     * @return \u003ccode\u003etrue\u003c/code\u003e if non-zero, \u003ccode\u003efalse\u003c/code\u003e\n     *  if zero\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBooleanObject(int)",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\n     * \u003cp\u003eConverts an int to a Boolean using the convention that \u003ccode\u003ezero\u003c/code\u003e\n     * is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(0) \u003d Boolean.FALSE\n     *   BooleanUtils.toBoolean(1) \u003d Boolean.TRUE\n     *   BooleanUtils.toBoolean(2) \u003d Boolean.TRUE\n     * \u003c/pre\u003e\n     *\n     * @param value  the int to convert\n     * @return Boolean.TRUE if non-zero, Boolean.FALSE if zero,\n     *  \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBooleanObject(java.lang.Integer)",
      "begin_line": 263,
      "end_line": 268,
      "comment": "\n     * \u003cp\u003eConverts an Integer to a Boolean using the convention that \u003ccode\u003ezero\u003c/code\u003e\n     * is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will be converted to \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(new Integer(0))    \u003d Boolean.FALSE\n     *   BooleanUtils.toBoolean(new Integer(1))    \u003d Boolean.TRUE\n     *   BooleanUtils.toBoolean(new Integer(null)) \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @return Boolean.TRUE if non-zero, Boolean.FALSE if zero,\n     *  \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e input\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBoolean(int, int, int)",
      "begin_line": 286,
      "end_line": 294,
      "comment": "\n     * \u003cp\u003eConverts an int to a boolean specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(0, 1, 0) \u003d false\n     *   BooleanUtils.toBoolean(1, 1, 0) \u003d true\n     *   BooleanUtils.toBoolean(2, 1, 2) \u003d false\n     *   BooleanUtils.toBoolean(2, 2, 0) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for \u003ccode\u003etrue\u003c/code\u003e\n     * @param falseValue  the value to match for \u003ccode\u003efalse\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if no match\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBoolean(java.lang.Integer, java.lang.Integer, java.lang.Integer)",
      "begin_line": 315,
      "end_line": 329,
      "comment": "\n     * \u003cp\u003eConverts an Integer to a boolean specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(new Integer(0), new Integer(1), new Integer(0)) \u003d false\n     *   BooleanUtils.toBoolean(new Integer(1), new Integer(1), new Integer(0)) \u003d true\n     *   BooleanUtils.toBoolean(new Integer(2), new Integer(1), new Integer(2)) \u003d false\n     *   BooleanUtils.toBoolean(new Integer(2), new Integer(2), new Integer(0)) \u003d true\n     *   BooleanUtils.toBoolean(null, null, new Integer(0))                     \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseValue  the value to match for \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e\n     * @throws IllegalArgumentException if no match\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBooleanObject(int, int, int, int)",
      "begin_line": 347,
      "end_line": 357,
      "comment": "\n     * \u003cp\u003eConverts an int to a Boolean specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(0, 0, 2, 3) \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(2, 1, 2, 3) \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(3, 1, 2, 3) \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for \u003ccode\u003etrue\u003c/code\u003e\n     * @param falseValue  the value to match for \u003ccode\u003efalse\u003c/code\u003e\n     * @param nullValue  the value to to match for \u003ccode\u003enull\u003c/code\u003e\n     * @return Boolean.TRUE, Boolean.FALSE, or \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if no match\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBooleanObject(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer)",
      "begin_line": 378,
      "end_line": 396,
      "comment": "\n     * \u003cp\u003eConverts an Integer to a Boolean specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(new Integer(0), new Integer(0), new Integer(2), new Integer(3)) \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(new Integer(2), new Integer(1), new Integer(2), new Integer(3)) \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(new Integer(3), new Integer(1), new Integer(2), new Integer(3)) \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param value  the Integer to convert\n     * @param trueValue  the value to match for \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseValue  the value to match for \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param nullValue  the value to to match for \u003ccode\u003enull\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return Boolean.TRUE, Boolean.FALSE, or \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if no match\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toInteger(boolean)",
      "begin_line": 412,
      "end_line": 414,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an int using the convention that\n     * \u003ccode\u003ezero\u003c/code\u003e is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toInteger(true)  \u003d 1\n     *   BooleanUtils.toInteger(false) \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return one if \u003ccode\u003etrue\u003c/code\u003e, zero if \u003ccode\u003efalse\u003c/code\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean)",
      "begin_line": 428,
      "end_line": 430,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an Integer using the convention that\n     * \u003ccode\u003ezero\u003c/code\u003e is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(true)  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(false) \u003d new Integer(0)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the boolean to convert\n     * @return one if \u003ccode\u003etrue\u003c/code\u003e, zero if \u003ccode\u003efalse\u003c/code\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toIntegerObject(java.lang.Boolean)",
      "begin_line": 446,
      "end_line": 451,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a Integer using the convention that\n     * \u003ccode\u003ezero\u003c/code\u003e is \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will be converted to \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(Boolean.TRUE)  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(Boolean.FALSE) \u003d new Integer(0)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to convert\n     * @return one if Boolean.TRUE, zero if Boolean.FALSE, \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003enull\u003c/code\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toInteger(boolean, int, int)",
      "begin_line": 466,
      "end_line": 468,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an int specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toInteger(true, 1, 0)  \u003d 1\n     *   BooleanUtils.toInteger(false, 1, 0) \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param bool  the to convert\n     * @param trueValue  the value to return if \u003ccode\u003etrue\u003c/code\u003e\n     * @param falseValue  the value to return if \u003ccode\u003efalse\u003c/code\u003e\n     * @return the appropriate value\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toInteger(java.lang.Boolean, int, int, int)",
      "begin_line": 485,
      "end_line": 490,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to an int specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toInteger(Boolean.TRUE, 1, 0, 2)  \u003d 1\n     *   BooleanUtils.toInteger(Boolean.FALSE, 1, 0, 2) \u003d 0\n     *   BooleanUtils.toInteger(null, 1, 0, 2)          \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to convert\n     * @param trueValue  the value to return if \u003ccode\u003etrue\u003c/code\u003e\n     * @param falseValue  the value to return if \u003ccode\u003efalse\u003c/code\u003e\n     * @param nullValue  the value to return if \u003ccode\u003enull\u003c/code\u003e\n     * @return the appropriate value\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean, java.lang.Integer, java.lang.Integer)",
      "begin_line": 507,
      "end_line": 509,
      "comment": "\n     * \u003cp\u003eConverts a boolean to an Integer specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(true, new Integer(1), new Integer(0))  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(false, new Integer(1), new Integer(0)) \u003d new Integer(0)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the to convert\n     * @param trueValue  the value to return if \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseValue  the value to return if \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the appropriate value\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toIntegerObject(java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer)",
      "begin_line": 529,
      "end_line": 534,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to an Integer specifying the conversion values.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toIntegerObject(Boolean.TRUE, new Integer(1), new Integer(0), new Integer(2))  \u003d new Integer(1)\n     *   BooleanUtils.toIntegerObject(Boolean.FALSE, new Integer(1), new Integer(0), new Integer(2)) \u003d new Integer(0)\n     *   BooleanUtils.toIntegerObject(null, new Integer(1), new Integer(0), new Integer(2))          \u003d new Integer(2)\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to convert\n     * @param trueValue  the value to return if \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseValue  the value to return if \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param nullValue  the value to return if \u003ccode\u003enull\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the appropriate value\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBooleanObject(java.lang.String)",
      "begin_line": 562,
      "end_line": 578,
      "comment": "\n     * \u003cp\u003eConverts a String to a Boolean.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003e\u0027true\u0027\u003c/code\u003e, \u003ccode\u003e\u0027on\u0027\u003c/code\u003e or \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e\n     * (case insensitive) will return \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003ccode\u003e\u0027false\u0027\u003c/code\u003e, \u003ccode\u003e\u0027off\u0027\u003c/code\u003e or \u003ccode\u003e\u0027no\u0027\u003c/code\u003e\n     * (case insensitive) will return \u003ccode\u003efalse\u003c/code\u003e.\n     * Otherwise, \u003ccode\u003enull\u003c/code\u003e is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(null)    \u003d null\n     *   BooleanUtils.toBooleanObject(\"true\")  \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"false\") \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"on\")    \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"ON\")    \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"off\")   \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"oFf\")   \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"blue\")  \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @return the Boolean value of the string,\n     *  \u003ccode\u003enull\u003c/code\u003e if no match or \u003ccode\u003enull\u003c/code\u003e input\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBooleanObject(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 602,
      "end_line": 620,
      "comment": "\n     * \u003cp\u003eConverts a String to a Boolean throwing an exception if no match.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBooleanObject(\"true\", \"true\", \"false\", \"null\")  \u003d Boolean.TRUE\n     *   BooleanUtils.toBooleanObject(\"false\", \"true\", \"false\", \"null\") \u003d Boolean.FALSE\n     *   BooleanUtils.toBooleanObject(\"null\", \"true\", \"false\", \"null\")  \u003d null\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @param trueString  the String to match for \u003ccode\u003etrue\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseString  the String to match for \u003ccode\u003efalse\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param nullString  the String to match for \u003ccode\u003enull\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the Boolean value of the string,\n     *  \u003ccode\u003enull\u003c/code\u003e if either the String matches \u003ccode\u003enullString\u003c/code\u003e\n     *  or if \u003ccode\u003enull\u003c/code\u003e input and \u003ccode\u003enullString\u003c/code\u003e is\n     *  \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the String doesn\u0027t match\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBoolean(java.lang.String)",
      "begin_line": 649,
      "end_line": 701,
      "comment": "\n     * \u003cp\u003eConverts a String to a boolean (optimised for performance).\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003e\u0027true\u0027\u003c/code\u003e, \u003ccode\u003e\u0027on\u0027\u003c/code\u003e or \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e\n     * (case insensitive) will return \u003ccode\u003etrue\u003c/code\u003e. Otherwise,\n     * \u003ccode\u003efalse\u003c/code\u003e is returned.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method performs 4 times faster (JDK1.4) than\n     * \u003ccode\u003eBoolean.valueOf(String)\u003c/code\u003e. However, this method accepts\n     * \u0027on\u0027 and \u0027yes\u0027 as true values.\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(null)    \u003d false\n     *   BooleanUtils.toBoolean(\"true\")  \u003d true\n     *   BooleanUtils.toBoolean(\"TRUE\")  \u003d true\n     *   BooleanUtils.toBoolean(\"tRUe\")  \u003d true\n     *   BooleanUtils.toBoolean(\"on\")    \u003d true\n     *   BooleanUtils.toBoolean(\"yes\")   \u003d true\n     *   BooleanUtils.toBoolean(\"false\") \u003d false\n     *   BooleanUtils.toBoolean(\"x gti\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @return the boolean value of the string, \u003ccode\u003efalse\u003c/code\u003e if no match\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toBoolean(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 732,
      "end_line": 746,
      "comment": "\n     * \u003cp\u003eConverts a String to a Boolean throwing an exception if no match found.\u003c/p\u003e\n     * \n     * \u003cp\u003enull is returned if there is no match.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.toBoolean(\"true\", \"true\", \"false\")  \u003d true\n     *   BooleanUtils.toBoolean(\"false\", \"true\", \"false\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check\n     * @param trueString  the String to match for \u003ccode\u003etrue\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseString  the String to match for \u003ccode\u003efalse\u003c/code\u003e\n     *  (case sensitive), may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the boolean value of the string\n     * @throws IllegalArgumentException if the String doesn\u0027t match\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toStringTrueFalse(java.lang.Boolean)",
      "begin_line": 764,
      "end_line": 766,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning \u003ccode\u003e\u0027true\u0027\u003c/code\u003e,\n     * \u003ccode\u003e\u0027false\u0027\u003c/code\u003e, or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringTrueFalse(Boolean.TRUE)  \u003d \"true\"\n     *   BooleanUtils.toStringTrueFalse(Boolean.FALSE) \u003d \"false\"\n     *   BooleanUtils.toStringTrueFalse(null)          \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027true\u0027\u003c/code\u003e, \u003ccode\u003e\u0027false\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toStringOnOff(java.lang.Boolean)",
      "begin_line": 782,
      "end_line": 784,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning \u003ccode\u003e\u0027on\u0027\u003c/code\u003e,\n     * \u003ccode\u003e\u0027off\u0027\u003c/code\u003e, or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringOnOff(Boolean.TRUE)  \u003d \"on\"\n     *   BooleanUtils.toStringOnOff(Boolean.FALSE) \u003d \"off\"\n     *   BooleanUtils.toStringOnOff(null)          \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027on\u0027\u003c/code\u003e, \u003ccode\u003e\u0027off\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toStringYesNo(java.lang.Boolean)",
      "begin_line": 800,
      "end_line": 802,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e,\n     * \u003ccode\u003e\u0027no\u0027\u003c/code\u003e, or \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringYesNo(Boolean.TRUE)  \u003d \"yes\"\n     *   BooleanUtils.toStringYesNo(Boolean.FALSE) \u003d \"no\"\n     *   BooleanUtils.toStringYesNo(null)          \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e, \u003ccode\u003e\u0027no\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toString(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 822,
      "end_line": 827,
      "comment": "\n     * \u003cp\u003eConverts a Boolean to a String returning one of the input Strings.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toString(Boolean.TRUE, \"true\", \"false\", null)   \u003d \"true\"\n     *   BooleanUtils.toString(Boolean.FALSE, \"true\", \"false\", null)  \u003d \"false\"\n     *   BooleanUtils.toString(null, \"true\", \"false\", null)           \u003d null;\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @param trueString  the String to return if \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseString  the String to return if \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param nullString  the String to return if \u003ccode\u003enull\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return one of the three input Strings\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toStringTrueFalse(boolean)",
      "begin_line": 844,
      "end_line": 846,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning \u003ccode\u003e\u0027true\u0027\u003c/code\u003e\n     * or \u003ccode\u003e\u0027false\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringTrueFalse(true)   \u003d \"true\"\n     *   BooleanUtils.toStringTrueFalse(false)  \u003d \"false\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027true\u0027\u003c/code\u003e, \u003ccode\u003e\u0027false\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toStringOnOff(boolean)",
      "begin_line": 861,
      "end_line": 863,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning \u003ccode\u003e\u0027on\u0027\u003c/code\u003e\n     * or \u003ccode\u003e\u0027off\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringOnOff(true)   \u003d \"on\"\n     *   BooleanUtils.toStringOnOff(false)  \u003d \"off\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027on\u0027\u003c/code\u003e, \u003ccode\u003e\u0027off\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toStringYesNo(boolean)",
      "begin_line": 878,
      "end_line": 880,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e\n     * or \u003ccode\u003e\u0027no\u0027\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toStringYesNo(true)   \u003d \"yes\"\n     *   BooleanUtils.toStringYesNo(false)  \u003d \"no\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @return \u003ccode\u003e\u0027yes\u0027\u003c/code\u003e, \u003ccode\u003e\u0027no\u0027\u003c/code\u003e,\n     *  or \u003ccode\u003enull\u003c/code\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.toString(boolean, java.lang.String, java.lang.String)",
      "begin_line": 897,
      "end_line": 899,
      "comment": "\n     * \u003cp\u003eConverts a boolean to a String returning one of the input Strings.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.toString(true, \"true\", \"false\")   \u003d \"true\"\n     *   BooleanUtils.toString(false, \"true\", \"false\")  \u003d \"false\"\n     * \u003c/pre\u003e\n     *\n     * @param bool  the Boolean to check\n     * @param trueString  the String to return if \u003ccode\u003etrue\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @param falseString  the String to return if \u003ccode\u003efalse\u003c/code\u003e,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return one of the two input Strings\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.xor(boolean[])",
      "begin_line": 917,
      "end_line": 941,
      "comment": "\n     * \u003cp\u003ePerforms an xor on a set of booleans.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   BooleanUtils.xor(new boolean[] { true, true })   \u003d false\n     *   BooleanUtils.xor(new boolean[] { false, false }) \u003d false\n     *   BooleanUtils.xor(new boolean[] { true, false })  \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param array  an array of \u003ccode\u003eboolean\u003ccode\u003es\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the xor is successful.\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.BooleanUtils.xor(java.lang.Boolean[])",
      "begin_line": 958,
      "end_line": 971,
      "comment": "\n     * \u003cp\u003ePerforms an xor on an array of Booleans.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.TRUE })   \u003d Boolean.FALSE\n     *   BooleanUtils.xor(new Boolean[] { Boolean.FALSE, Boolean.FALSE }) \u003d Boolean.FALSE\n     *   BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.FALSE })  \u003d Boolean.TRUE\n     * \u003c/pre\u003e\n     *\n     * @param array  an array of \u003ccode\u003eBoolean\u003ccode\u003es\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the xor is successful.\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e is empty.\n     * @throws IllegalArgumentException if \u003ccode\u003earray\u003c/code\u003e contains a \u003ccode\u003enull\u003c/code\u003e\n     "
    }
  ]
}