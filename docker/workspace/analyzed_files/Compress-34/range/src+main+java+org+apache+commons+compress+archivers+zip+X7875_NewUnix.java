{
  "filepath": "/tmp/Compress-34f/src/main/java/org/apache/commons/compress/archivers/zip/X7875_NewUnix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "X7875_NewUnix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 346,
      "comment": "\n * An extra field that stores UNIX UID/GID data (owner \u0026amp; group ownership) for a given\n * zip entry.  We\u0027re using the field definition given in Info-Zip\u0027s source archive:\n * zip-3.0.tar.gz/proginfo/extrafld.txt\n *\n * \u003cpre\u003e\n * Local-header version:\n *\n * Value         Size        Description\n * -----         ----        -----------\n * 0x7875        Short       tag for this extra block type (\"ux\")\n * TSize         Short       total data size for this block\n * Version       1 byte      version of this extra field, currently 1\n * UIDSize       1 byte      Size of UID field\n * UID           Variable    UID for this entry (little endian)\n * GIDSize       1 byte      Size of GID field\n * GID           Variable    GID for this entry (little endian)\n *\n * Central-header version:\n *\n * Value         Size        Description\n * -----         ----        -----------\n * 0x7855        Short       tag for this extra block type (\"Ux\")\n * TSize         Short       total data size for this block (0)\n * \u003c/pre\u003e\n * @since 1.5\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_THOUSAND"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " always \u00271\u0027 according to current info-zip spec."
    },
    {
      "type": "field",
      "varNames": [
        "uid"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " NOTE:  equals() and hashCode() currently assume these can never be null."
    },
    {
      "type": "field",
      "varNames": [
        "gid"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.X7875_NewUnix()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Constructor for X7875_NewUnix.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getHeaderId()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * The Header-ID.\n     *\n     * @return the value for the header id for this extrafield\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getUID()",
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * Gets the UID as a long.  UID is typically a 32 bit unsigned\n     * value on most UNIX systems, so we return a long to avoid\n     * integer overflow into the negatives in case values above\n     * and including 2^31 are being used.\n     *\n     * @return the UID value.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getGID()",
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Gets the GID as a long.  GID is typically a 32 bit unsigned\n     * value on most UNIX systems, so we return a long to avoid\n     * integer overflow into the negatives in case values above\n     * and including 2^31 are being used.\n     *\n     * @return the GID value.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.setUID(long)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Sets the UID.\n     *\n     * @param l UID value to set on this extra field.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.setGID(long)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Sets the GID.\n     *\n     * @param l GID value to set on this extra field.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataLength()",
      "begin_line": 132,
      "end_line": 138,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     *\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryLength()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Length of the extra field in the central directory data - without\n     * Header-ID or length specifier.\n     *\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getLocalFileDataData()",
      "begin_line": 156,
      "end_line": 185,
      "comment": "\n     * The actual data to put into local file data - without Header-ID\n     * or length specifier.\n     *\n     * @return get the data\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.getCentralDirectoryData()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * The actual data to put into central directory data - without Header-ID\n     * or length specifier.\n     *\n     * @return get the data\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 205,
      "end_line": 220,
      "comment": "\n     * Populate data from this array as if it was in local file data.\n     *\n     * @param data   an array of bytes\n     * @param offset the start offset\n     * @param length the number of bytes in the array from offset\n     * @throws java.util.zip.ZipException on error\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 226,
      "end_line": 229,
      "comment": "\n     * Doesn\u0027t do anything since this class doesn\u0027t store anything\n     * inside the central directory.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.reset()",
      "begin_line": 235,
      "end_line": 239,
      "comment": "\n     * Reset state back to newly constructed state.  Helps us make sure\n     * parse() calls always generate clean results.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.toString()",
      "begin_line": 248,
      "end_line": 251,
      "comment": "\n     * Returns a String representation of this class useful for\n     * debugging purposes.\n     *\n     * @return A String representation of this class useful for\n     *         debugging purposes.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.clone()",
      "begin_line": 253,
      "end_line": 256,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.equals(java.lang.Object)",
      "begin_line": 258,
      "end_line": 266,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.hashCode()",
      "begin_line": 268,
      "end_line": 277,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X7875_NewUnix.trimLeadingZeroesForceMinLength(byte[])",
      "begin_line": 288,
      "end_line": 345,
      "comment": "\n     * Not really for external usage, but marked \"package\" visibility\n     * to help us JUnit it.   Trims a byte array of leading zeroes while\n     * also enforcing a minimum length, and thus it really trims AND pads\n     * at the same time.\n     *\n     * @param array byte[] array to trim \u0026 pad.\n     * @return trimmed \u0026 padded byte[] array.\n     "
    }
  ]
}