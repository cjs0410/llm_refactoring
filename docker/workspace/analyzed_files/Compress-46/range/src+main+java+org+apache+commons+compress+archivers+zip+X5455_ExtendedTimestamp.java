{
  "filepath": "/tmp/Compress-46f/src/main/java/org/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "X5455_ExtendedTimestamp",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 83,
      "end_line": 599,
      "comment": "\n * \u003cp\u003eAn extra field that stores additional file and directory timestamp data\n * for zip entries.   Each zip entry can include up to three timestamps\n * (modify, access, create*).  The timestamps are stored as 32 bit signed\n * integers representing seconds since UNIX epoch (Jan 1st, 1970, UTC).\n * This field improves on zip\u0027s default timestamp granularity, since it\n * allows one to store additional timestamps, and, in addition, the timestamps\n * are stored using per-second granularity (zip\u0027s default behaviour can only store\n * timestamps to the nearest \u003cem\u003eeven\u003c/em\u003e second).\n * \u003c/p\u003e\u003cp\u003e\n * Unfortunately, 32 (signed) bits can only store dates up to the year 2037,\n * and so this extra field will eventually be obsolete.  Enjoy it while it lasts!\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003e\u003cb\u003emodifyTime:\u003c/b\u003e\n * most recent time of file/directory modification\n * (or file/dir creation if the entry has not been\n * modified since it was created).\n * \u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eaccessTime:\u003c/b\u003e\n * most recent time file/directory was opened\n * (e.g., read from disk).  Many people disable\n * their operating systems from updating this value\n * using the NOATIME mount option to optimize disk behaviour,\n * and thus it\u0027s not always reliable.  In those cases\n * it\u0027s always equal to modifyTime.\n * \u003c/li\u003e\n * \u003cli\u003e\u003cb\u003e*createTime:\u003c/b\u003e\n * modern linux file systems (e.g., ext2 and newer)\n * do not appear to store a value like this, and so\n * it\u0027s usually omitted altogether in the zip extra\n * field.  Perhaps other unix systems track this.\n * \u003c/li\u003e\u003c/ul\u003e\n * \u003cp\u003e\n * We\u0027re using the field definition given in Info-Zip\u0027s source archive:\n * zip-3.0.tar.gz/proginfo/extrafld.txt\n * \u003c/p\u003e\n * \u003cpre\u003e\n * Value         Size        Description\n * -----         ----        -----------\n * 0x5455        Short       tag for this extra block type (\"UT\")\n * TSize         Short       total data size for this block\n * Flags         Byte        info bits\n * (ModTime)     Long        time of last modification (UTC/GMT)\n * (AcTime)      Long        time of last access (UTC/GMT)\n * (CrTime)      Long        time of original creation (UTC/GMT)\n *\n * Central-header version:\n *\n * Value         Size        Description\n * -----         ----        -----------\n * 0x5455        Short       tag for this extra block type (\"UT\")\n * TSize         Short       total data size for this block\n * Flags         Byte        info bits (refers to local header!)\n * (ModTime)     Long        time of last modification (UTC/GMT)\n * \u003c/pre\u003e\n * @since 1.5\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MODIFY_TIME_BIT"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * The bit set inside the flags by when the last modification time\n     * is present in this extra field.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ACCESS_TIME_BIT"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * The bit set inside the flags by when the lasr access time is\n     * present in this extra field.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CREATE_TIME_BIT"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * The bit set inside the flags by when the original creation time\n     * is present in this extra field.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "flags"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " are ignored according to the current version of the spec (December 2012)."
    },
    {
      "type": "field",
      "varNames": [
        "bit0_modifyTimePresent"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " !\u003d null and length checks."
    },
    {
      "type": "field",
      "varNames": [
        "bit1_accessTimePresent"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bit2_createTimePresent"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modifyTime"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accessTime"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "createTime"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.X5455_ExtendedTimestamp()",
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Constructor for X5455_ExtendedTimestamp.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getHeaderId()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "\n     * The Header-ID.\n     *\n     * @return the value for the header id for this extrafield\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getLocalFileDataLength()",
      "begin_line": 140,
      "end_line": 147,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     *\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getCentralDirectoryLength()",
      "begin_line": 159,
      "end_line": 164,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     *\n     * \u003cp\u003eFor X5455 the central length is often smaller than the\n     * local length, because central cannot contain access or create\n     * timestamps.\u003c/p\u003e\n     *\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getLocalFileDataData()",
      "begin_line": 172,
      "end_line": 193,
      "comment": "\n     * The actual data to put into local file data - without Header-ID\n     * or length specifier.\n     *\n     * @return get the data\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getCentralDirectoryData()",
      "begin_line": 201,
      "end_line": 210,
      "comment": "\n     * The actual data to put into central directory data - without Header-ID\n     * or length specifier.\n     *\n     * @return the central directory data\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 220,
      "end_line": 242,
      "comment": "\n     * Populate data from this array as if it was in local file data.\n     *\n     * @param data   an array of bytes\n     * @param offset the start offset\n     * @param length the number of bytes in the array from offset\n     * @throws java.util.zip.ZipException on error\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 248,
      "end_line": 254,
      "comment": "\n     * Doesn\u0027t do anything special since this class always uses the\n     * same parsing logic for both central directory and local file data.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.reset()",
      "begin_line": 260,
      "end_line": 265,
      "comment": "\n     * Reset state back to newly constructed state.  Helps us make sure\n     * parse() calls always generate clean results.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setFlags(byte)",
      "begin_line": 281,
      "end_line": 286,
      "comment": "\n     * Sets flags byte.  The flags byte tells us which of the\n     * three datestamp fields are present in the data:\n     * \u003cpre\u003e\n     * bit0 - modify time\n     * bit1 - access time\n     * bit2 - create time\n     * \u003c/pre\u003e\n     * Only first 3 bits of flags are used according to the\n     * latest version of the spec (December 2012).\n     *\n     * @param flags flags byte indicating which of the\n     *              three datestamp fields are present.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getFlags()",
      "begin_line": 302,
      "end_line": 302,
      "comment": "\n     * Gets flags byte.  The flags byte tells us which of the\n     * three datestamp fields are present in the data:\n     * \u003cpre\u003e\n     * bit0 - modify time\n     * bit1 - access time\n     * bit2 - create time\n     * \u003c/pre\u003e\n     * Only first 3 bits of flags are used according to the\n     * latest version of the spec (December 2012).\n     *\n     * @return flags byte indicating which of the\n     *         three datestamp fields are present.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.isBit0_modifyTimePresent()",
      "begin_line": 311,
      "end_line": 311,
      "comment": "\n     * Returns whether bit0 of the flags byte is set or not,\n     * which should correspond to the presence or absence of\n     * a modify timestamp in this particular zip entry.\n     *\n     * @return true if bit0 of the flags byte is set.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.isBit1_accessTimePresent()",
      "begin_line": 320,
      "end_line": 320,
      "comment": "\n     * Returns whether bit1 of the flags byte is set or not,\n     * which should correspond to the presence or absence of\n     * a \"last access\" timestamp in this particular zip entry.\n     *\n     * @return true if bit1 of the flags byte is set.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.isBit2_createTimePresent()",
      "begin_line": 329,
      "end_line": 329,
      "comment": "\n     * Returns whether bit2 of the flags byte is set or not,\n     * which should correspond to the presence or absence of\n     * a create timestamp in this particular zip entry.\n     *\n     * @return true if bit2 of the flags byte is set.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getModifyTime()",
      "begin_line": 338,
      "end_line": 338,
      "comment": "\n     * Returns the modify time (seconds since epoch) of this zip entry\n     * as a ZipLong object, or null if no such timestamp exists in the\n     * zip entry.\n     *\n     * @return modify time (seconds since epoch) or null.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getAccessTime()",
      "begin_line": 347,
      "end_line": 347,
      "comment": "\n     * Returns the access time (seconds since epoch) of this zip entry\n     * as a ZipLong object, or null if no such timestamp exists in the\n     * zip entry.\n     *\n     * @return access time (seconds since epoch) or null.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getCreateTime()",
      "begin_line": 362,
      "end_line": 362,
      "comment": "\n     * \u003cp\u003e\n     * Returns the create time (seconds since epoch) of this zip entry\n     * as a ZipLong object, or null if no such timestamp exists in the\n     * zip entry.\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: modern linux file systems (e.g., ext2)\n     * do not appear to store a \"create time\" value, and so\n     * it\u0027s usually omitted altogether in the zip extra\n     * field.  Perhaps other unix systems track this.\n     *\n     * @return create time (seconds since epoch) or null.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getModifyJavaTime()",
      "begin_line": 372,
      "end_line": 374,
      "comment": "\n     * Returns the modify time as a java.util.Date\n     * of this zip entry, or null if no such timestamp exists in the zip entry.\n     * The milliseconds are always zeroed out, since the underlying data\n     * offers only per-second precision.\n     *\n     * @return modify time as java.util.Date or null.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getAccessJavaTime()",
      "begin_line": 384,
      "end_line": 386,
      "comment": "\n     * Returns the access time as a java.util.Date\n     * of this zip entry, or null if no such timestamp exists in the zip entry.\n     * The milliseconds are always zeroed out, since the underlying data\n     * offers only per-second precision.\n     *\n     * @return access time as java.util.Date or null.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.zipLongToDate(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 388,
      "end_line": 390,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getCreateJavaTime()",
      "begin_line": 406,
      "end_line": 408,
      "comment": "\n     * \u003cp\u003e\n     * Returns the create time as a a java.util.Date\n     * of this zip entry, or null if no such timestamp exists in the zip entry.\n     * The milliseconds are always zeroed out, since the underlying data\n     * offers only per-second precision.\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: modern linux file systems (e.g., ext2)\n     * do not appear to store a \"create time\" value, and so\n     * it\u0027s usually omitted altogether in the zip extra\n     * field.  Perhaps other unix systems track this.\n     *\n     * @return create time as java.util.Date or null.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setModifyTime(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 422,
      "end_line": 427,
      "comment": "\n     * \u003cp\u003e\n     * Sets the modify time (seconds since epoch) of this zip entry\n     * using a ZipLong object.\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param l ZipLong of the modify time (seconds per epoch)\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setAccessTime(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 441,
      "end_line": 446,
      "comment": "\n     * \u003cp\u003e\n     * Sets the access time (seconds since epoch) of this zip entry\n     * using a ZipLong object\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param l ZipLong of the access time (seconds per epoch)\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setCreateTime(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 460,
      "end_line": 465,
      "comment": "\n     * \u003cp\u003e\n     * Sets the create time (seconds since epoch) of this zip entry\n     * using a ZipLong object\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param l ZipLong of the create time (seconds per epoch)\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setModifyJavaTime(java.util.Date)",
      "begin_line": 480,
      "end_line": 480,
      "comment": "\n     * \u003cp\u003e\n     * Sets the modify time as a java.util.Date\n     * of this zip entry.  Supplied value is truncated to per-second\n     * precision (milliseconds zeroed-out).\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param d modify time as java.util.Date\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setAccessJavaTime(java.util.Date)",
      "begin_line": 495,
      "end_line": 495,
      "comment": "\n     * \u003cp\u003e\n     * Sets the access time as a java.util.Date\n     * of this zip entry.  Supplied value is truncated to per-second\n     * precision (milliseconds zeroed-out).\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param d access time as java.util.Date\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setCreateJavaTime(java.util.Date)",
      "begin_line": 510,
      "end_line": 510,
      "comment": "\n     * \u003cp\u003e\n     * Sets the create time as a java.util.Date\n     * of this zip entry.  Supplied value is truncated to per-second\n     * precision (milliseconds zeroed-out).\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param d create time as java.util.Date\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.dateToZipLong(java.util.Date)",
      "begin_line": 522,
      "end_line": 526,
      "comment": "\n     * Utility method converts java.util.Date (milliseconds since epoch)\n     * into a ZipLong (seconds since epoch).\n     * \u003cp/\u003e\n     * Also makes sure the converted ZipLong is not too big to fit\n     * in 32 unsigned bits.\n     *\n     * @param d java.util.Date to convert to ZipLong\n     * @return ZipLong\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.unixTimeToZipLong(long)",
      "begin_line": 528,
      "end_line": 533,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.toString()",
      "begin_line": 542,
      "end_line": 560,
      "comment": "\n     * Returns a String representation of this class useful for\n     * debugging purposes.\n     *\n     * @return A String representation of this class useful for\n     *         debugging purposes.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.clone()",
      "begin_line": 562,
      "end_line": 565,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.equals(java.lang.Object)",
      "begin_line": 567,
      "end_line": 580,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.hashCode()",
      "begin_line": 582,
      "end_line": 597,
      "comment": ""
    }
  ]
}