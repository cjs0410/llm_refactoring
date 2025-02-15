{
  "filepath": "/tmp/Lang-13f/src/main/java/org/apache/commons/lang3/SerializationUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerializationUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 293,
      "comment": "\n * \u003cp\u003eAssists with the serialization process and performs additional functionality based\n * on serialization.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cul\u003e\n * \u003cli\u003eDeep clone using serialization\n * \u003cli\u003eSerialize managing finally and IOException\n * \u003cli\u003eDeserialize managing finally and IOException\n * \u003c/ul\u003e\n *\n * \u003cp\u003eThis class throws exceptions for invalid {@code null} inputs.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n *\n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SerializationUtils.SerializationUtils()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * \u003cp\u003eSerializationUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as {@code SerializationUtils.clone(object)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     * @since 2.0\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtils.clone(T)",
      "begin_line": 78,
      "end_line": 111,
      "comment": "\n     * \u003cp\u003eDeep clone an {@code Object} using serialization.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is many times slower than writing clone methods by hand\n     * on all objects in your object graph. However, for complex object\n     * graphs, or for those that don\u0027t support deep cloning this can\n     * be a simple alternative implementation. Of course all the objects\n     * must be {@code Serializable}.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type of the object involved\n     * @param object  the {@code Serializable} object to clone\n     * @return the cloned object\n     * @throws SerializationException (runtime) if the serialization fails\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtils.serialize(java.io.Serializable, java.io.OutputStream)",
      "begin_line": 130,
      "end_line": 151,
      "comment": "\n     * \u003cp\u003eSerializes an {@code Object} to the specified stream.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream will be closed once the object is written.\n     * This avoids the need for a finally clause, and maybe also exception\n     * handling, in the application code.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream passed in is not buffered internally within this method.\n     * This is the responsibility of your application if desired.\u003c/p\u003e\n     *\n     * @param obj  the object to serialize to bytes, may be null\n     * @param outputStream  the stream to write to, must not be null\n     * @throws IllegalArgumentException if {@code outputStream} is {@code null}\n     * @throws SerializationException (runtime) if the serialization fails\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtils.serialize(java.io.Serializable)",
      "begin_line": 161,
      "end_line": 165,
      "comment": "\n     * \u003cp\u003eSerializes an {@code Object} to a byte array for\n     * storage/serialization.\u003c/p\u003e\n     *\n     * @param obj  the object to serialize to bytes\n     * @return a byte[] with the converted Serializable\n     * @throws SerializationException (runtime) if the serialization fails\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtils.deserialize(java.io.InputStream)",
      "begin_line": 184,
      "end_line": 207,
      "comment": "\n     * \u003cp\u003eDeserializes an {@code Object} from the specified stream.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream will be closed once the object is written. This\n     * avoids the need for a finally clause, and maybe also exception\n     * handling, in the application code.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream passed in is not buffered internally within this method.\n     * This is the responsibility of your application if desired.\u003c/p\u003e\n     *\n     * @param inputStream  the serialized object input stream, must not be null\n     * @return the deserialized object\n     * @throws IllegalArgumentException if {@code inputStream} is {@code null}\n     * @throws SerializationException (runtime) if the serialization fails\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtils.deserialize(byte[])",
      "begin_line": 217,
      "end_line": 223,
      "comment": "\n     * \u003cp\u003eDeserializes a single {@code Object} from an array of bytes.\u003c/p\u003e\n     *\n     * @param objectData  the serialized object, must not be null\n     * @return the deserialized object\n     * @throws IllegalArgumentException if {@code objectData} is {@code null}\n     * @throws SerializationException (runtime) if the serialization fails\n     "
    },
    {
      "type": "class_interface",
      "name": "ClassLoaderAwareObjectInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.ObjectInputStream"
      ],
      "begin_line": 238,
      "end_line": 291,
      "comment": "\n     * \u003cp\u003eCustom specialization of the standard JDK {@link java.io.ObjectInputStream}\n     * that uses a custom  \u003ccode\u003eClassLoader\u003c/code\u003e to resolve a class.\n     * If the specified \u003ccode\u003eClassLoader\u003c/code\u003e is not able to resolve the class,\n     * the context classloader of the current thread will be used.\n     * This way, the standard deserialization work also in web-application\n     * containers and application servers, no matter in which of the\n     * \u003ccode\u003eClassLoader\u003c/code\u003e the particular class that encapsulates\n     * serialization/deserialization lives. \u003c/p\u003e\n     * \n     * \u003cp\u003eFor more in-depth information about the problem for which this\n     * class here is a workaround, see the JIRA issue LANG-626. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "primitiveTypes"
      ],
      "begin_line": 239,
      "end_line": 240,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "classLoader"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream.ClassLoaderAwareObjectInputStream(java.io.InputStream, java.lang.ClassLoader)",
      "begin_line": 250,
      "end_line": 263,
      "comment": "\n         * Constructor.\n         * @param in The \u003ccode\u003eInputStream\u003c/code\u003e.\n         * @param classLoader classloader to use\n         * @throws IOException if an I/O error occurs while reading stream header.\n         * @see java.io.ObjectInputStream\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream.resolveClass(java.io.ObjectStreamClass)",
      "begin_line": 273,
      "end_line": 289,
      "comment": "\n         * Overriden version that uses the parametrized \u003ccode\u003eClassLoader\u003c/code\u003e or the \u003ccode\u003eClassLoader\u003c/code\u003e\n         * of the current \u003ccode\u003eThread\u003c/code\u003e to resolve the class.\n         * @param desc An instance of class \u003ccode\u003eObjectStreamClass\u003c/code\u003e.\n         * @return A \u003ccode\u003eClass\u003c/code\u003e object corresponding to \u003ccode\u003edesc\u003c/code\u003e.\n         * @throws IOException Any of the usual Input/Output exceptions.\n         * @throws ClassNotFoundException If class of a serialized object cannot be found.\n         "
    }
  ]
}