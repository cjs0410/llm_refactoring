{
  "filepath": "/tmp/Compress-23f/src/main/java/org/apache/commons/compress/archivers/sevenz/Coders.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Coders",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 278,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 44,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(java.io.OutputStream, org.apache.commons.compress.archivers.sevenz.SevenZMethod, byte[])",
      "begin_line": 55,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "coderTable"
      ],
      "begin_line": 65,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CoderId",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 74,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CoderId.CoderId(org.apache.commons.compress.archivers.sevenz.SevenZMethod, org.apache.commons.compress.archivers.sevenz.Coders.CoderBase)",
      "begin_line": 75,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "coder"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CoderBase",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 84,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 85,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase.encode(java.io.OutputStream, byte[])",
      "begin_line": 87,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "CopyDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase"
      ],
      "begin_line": 93,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 94,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder.encode(java.io.OutputStream, byte[])",
      "begin_line": 99,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "LZMADecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase"
      ],
      "begin_line": 105,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 106,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "DeflateDecoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase"
      ],
      "begin_line": 121,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 122,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder.encode(java.io.OutputStream, byte[])",
      "begin_line": 128,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "BZIP2Decoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase"
      ],
      "begin_line": 134,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 135,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder.encode(java.io.OutputStream, byte[])",
      "begin_line": 140,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "AES256SHA256Decoder",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.sevenz.Coders.CoderBase"
      ],
      "begin_line": 147,
      "end_line": 242,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder.decode(java.io.InputStream, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 148,
      "end_line": 241,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isInitialized"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cipherInputStream"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder.Anonymous-44d4306d-5648-4696-87a4-efcf7da9cc79.init()",
      "begin_line": 155,
      "end_line": 225,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder.Anonymous-1cbafd1c-e79f-42f5-8404-d91b350ba804.read()",
      "begin_line": 227,
      "end_line": 230,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder.Anonymous-04047f42-4261-43ef-a459-ed8157f3ce9b.read(byte[], int, int)",
      "begin_line": 232,
      "end_line": 235,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder.Anonymous-2d7593e3-87e5-448b-aaf8-d2da8294eccf.close()",
      "begin_line": 237,
      "end_line": 239,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "DummyByteAddingInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.FilterInputStream"
      ],
      "begin_line": 250,
      "end_line": 277,
      "comment": "\n     * ZLIB requires an extra dummy byte.\n     *\n     * @see java.util.zip.Inflater#Inflater(boolean)\n     * @see org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "addDummyByte"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.DummyByteAddingInputStream(java.io.InputStream)",
      "begin_line": 253,
      "end_line": 255,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.read()",
      "begin_line": 257,
      "end_line": 265,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Coders.DummyByteAddingInputStream.read(byte[], int, int)",
      "begin_line": 267,
      "end_line": 276,
      "comment": ""
    }
  ]
}