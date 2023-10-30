{
  "filepath": "/tmp/Compress-39f/src/main/java/org/apache/commons/compress/utils/ArchiveUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 297,
      "comment": "\n * Generic Archive utilities\n "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_SANITIZED_NAME_LENGTH"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.ArchiveUtils()",
      "begin_line": 34,
      "end_line": 35,
      "comment": " Private constructor to prevent instantiation of this utility class. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toString(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 49,
      "end_line": 61,
      "comment": "\n     * Generates a string containing the name, isDirectory setting and size of an entry.\n     * \u003cp\u003e\n     * For example:\n     * \u003cpre\u003e\n     * -    2000 main.c\n     * d     100 testfiles\n     * \u003c/pre\u003e\n     * \n     * @param entry the entry\n     * @return the representation of the entry\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(java.lang.String, byte[], int, int)",
      "begin_line": 72,
      "end_line": 81,
      "comment": "\n     * Check if buffer contents matches Ascii String.\n     * \n     * @param expected expected string\n     * @param buffer the buffer\n     * @param offset offset to read from\n     * @param length length of the buffer\n     * @return {@code true} if buffer is the same as the expected string\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(java.lang.String, byte[])",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Check if buffer contents matches Ascii String.\n     * \n     * @param expected the expected strin\n     * @param buffer the buffer\n     * @return {@code true} if buffer is the same as the expected string\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes(java.lang.String)",
      "begin_line": 101,
      "end_line": 107,
      "comment": "\n     * Convert a string to Ascii bytes.\n     * Used for comparing \"magic\" strings which need to be independent of the default Locale.\n     * \n     * @param inputString string to convert\n     * @return the bytes\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byte[])",
      "begin_line": 115,
      "end_line": 121,
      "comment": "\n     * Convert an input byte array to a String using the ASCII character set.\n     * \n     * @param inputBytes bytes to convert\n     * @return the bytes, interpreted as an Ascii string\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byte[], int, int)",
      "begin_line": 131,
      "end_line": 137,
      "comment": "\n     * Convert an input byte array to a String using the ASCII character set.\n     * \n     * @param inputBytes input byte array\n     * @param offset offset within array\n     * @param length length of array\n     * @return the bytes, interpreted as an Ascii string\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], int, int, byte[], int, int, boolean)",
      "begin_line": 151,
      "end_line": 181,
      "comment": "\n     * Compare byte buffers, optionally ignoring trailing nulls\n     * \n     * @param buffer1 first buffer\n     * @param offset1 first offset\n     * @param length1 first length\n     * @param buffer2 second buffer\n     * @param offset2 second offset\n     * @param length2 second length\n     * @param ignoreTrailingNulls whether to ignore trailing nulls\n     * @return {@code true} if buffer1 and buffer2 have same contents, having regard to trailing nulls\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], int, int, byte[], int, int)",
      "begin_line": 194,
      "end_line": 198,
      "comment": "\n     * Compare byte buffers\n     * \n     * @param buffer1 the first buffer\n     * @param offset1 the first offset\n     * @param length1 the first length\n     * @param buffer2 the second buffer\n     * @param offset2 the second offset\n     * @param length2 the second length\n     * @return {@code true} if buffer1 and buffer2 have same contents\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], byte[])",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * Compare byte buffers\n     * \n     * @param buffer1 the first buffer\n     * @param buffer2 the second buffer\n     * @return {@code true} if buffer1 and buffer2 have same contents\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqual(byte[], byte[], boolean)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Compare byte buffers, optionally ignoring trailing nulls\n     * \n     * @param buffer1 the first buffer\n     * @param buffer2 the second buffer \n     * @param ignoreTrailingNulls whether to ignore tariling nulls\n     * @return {@code true} if buffer1 and buffer2 have same contents\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byte[], int, int, byte[], int, int)",
      "begin_line": 234,
      "end_line": 238,
      "comment": "\n     * Compare byte buffers, ignoring trailing nulls\n     * \n     * @param buffer1 the first buffer\n     * @param offset1 the first offset\n     * @param length1 the first length\n     * @param buffer2 the second buffer\n     * @param offset2 the second offset\n     * @param length2 the second length\n     * @return {@code true} if buffer1 and buffer2 have same contents, having regard to trailing nulls\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byte[], int)",
      "begin_line": 249,
      "end_line": 256,
      "comment": "\n     * Returns true if the first N bytes of an array are all zero\n     * \n     * @param a\n     *            The array to check\n     * @param size\n     *            The number of characters to check (not the size of the array)\n     * @return true if the first N bytes are zero\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ArchiveUtils.sanitize(java.lang.String)",
      "begin_line": 273,
      "end_line": 295,
      "comment": "\n     * Returns a \"sanitized\" version of the string given as arguments,\n     * where sanitized means non-printable characters have been\n     * replaced with a question mark and the outcome is not longer\n     * than 255 chars.\n     *\n     * \u003cp\u003eThis method is used to clean up file names when they are\n     * used in exception messages as they may end up in log files or\n     * as console output and may have been read from a corrupted\n     * input.\u003c/p\u003e\n     *\n     * @param s the string to sanitize\n     * @return a sanitized version of the argument\n     * @since Compress 1.12\n     "
    }
  ]
}