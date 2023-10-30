{
  "filepath": "/tmp/Lang-29f/src/main/java/org/apache/commons/lang3/SystemUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SystemUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 1824,
      "comment": "\n * \u003cp\u003e\n * Helpers for \u003ccode\u003ejava.lang.System\u003c/code\u003e.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * If a system property cannot be read due to security restrictions, the corresponding field in this class will be set to \u003ccode\u003enull\u003c/code\u003e\n * and a message will be written to \u003ccode\u003eSystem.err\u003c/code\u003e.\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * #ThreadSafe#\n * \u003c/p\u003e\n * \n * @author Apache Software Foundation\n * @author Based on code from Avalon Excalibur\n * @author Based on code from Lucene\n * @author \u003ca href\u003d\"mailto:sdowney@panix.com\"\u003eSteve Downey\u003c/a\u003e\n * @author Gary Gregory\n * @author Michael Becke\n * @author Tetsuya Kaneuchi\n * @author Rafal Krupinski\n * @author Jason Gritman\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION_TRIM_SIZE"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "OS_NAME_WINDOWS_PREFIX"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * The prefix String for all Windows OS.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_HOME_KEY"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * The System property key for the user home directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_DIR_KEY"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * The System property key for the user directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_IO_TMPDIR_KEY"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * The System property key for the Java IO temporary directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_HOME_KEY"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * The System property key for the Java home directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "AWT_TOOLKIT"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003eawt.toolkit\u003c/code\u003e System Property.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Holds a class name, on Windows XP this is \u003ccode\u003esun.awt.windows.WToolkit\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cb\u003eOn platforms without a GUI, this value is \u003ccode\u003enull\u003c/code\u003e.\u003c/b\u003e\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FILE_ENCODING"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003efile.encoding\u003c/code\u003e System Property.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * File encoding, such as \u003ccode\u003eCp1252\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FILE_SEPARATOR"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003efile.separator\u003c/code\u003e System Property. File separator (\u003ccode\u003e\u0026quot;/\u0026quot;\u003c/code\u003e on UNIX).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_FONTS"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.awt.fonts\u003c/code\u003e System Property.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_GRAPHICSENV"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.awt.graphicsenv\u003c/code\u003e System Property.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_HEADLESS"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.awt.headless\u003c/code\u003e System Property. The value of this property is the String \u003ccode\u003e\"true\"\u003c/code\u003e or\n     * \u003ccode\u003e\"false\"\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @see #isJavaAwtHeadless()\n     * @since 2.1\n     * @since Java 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_AWT_PRINTERJOB"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.awt.printerjob\u003c/code\u003e System Property.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_CLASS_PATH"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.class.path\u003c/code\u003e System Property. Java class path.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_CLASS_VERSION"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.class.version\u003c/code\u003e System Property. Java class format version number.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_COMPILER"
      ],
      "begin_line": 283,
      "end_line": 283,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.compiler\u003c/code\u003e System Property. Name of JIT compiler to use. First in JDK version 1.2. Not used in Sun JDKs after\n     * 1.2.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2. Not used in Sun versions after 1.2.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_ENDORSED_DIRS"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.endorsed.dirs\u003c/code\u003e System Property. Path of endorsed directory or directories.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_EXT_DIRS"
      ],
      "begin_line": 321,
      "end_line": 321,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.ext.dirs\u003c/code\u003e System Property. Path of extension directory or directories.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_HOME"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.home\u003c/code\u003e System Property. Java installation directory.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_IO_TMPDIR"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.io.tmpdir\u003c/code\u003e System Property. Default temp file path.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_LIBRARY_PATH"
      ],
      "begin_line": 378,
      "end_line": 378,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.library.path\u003c/code\u003e System Property. List of paths to search when loading libraries.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_RUNTIME_NAME"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.runtime.name\u003c/code\u003e System Property. Java Runtime Environment name.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_RUNTIME_VERSION"
      ],
      "begin_line": 418,
      "end_line": 418,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.runtime.version\u003c/code\u003e System Property. Java Runtime Environment version.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_SPECIFICATION_NAME"
      ],
      "begin_line": 437,
      "end_line": 437,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.specification.name\u003c/code\u003e System Property. Java Runtime Environment specification name.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_SPECIFICATION_VENDOR"
      ],
      "begin_line": 456,
      "end_line": 456,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.specification.vendor\u003c/code\u003e System Property. Java Runtime Environment specification vendor.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_SPECIFICATION_VERSION"
      ],
      "begin_line": 475,
      "end_line": 475,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.specification.version\u003c/code\u003e System Property. Java Runtime Environment specification version.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_UTIL_PREFS_PREFERENCES_FACTORY"
      ],
      "begin_line": 495,
      "end_line": 495,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.util.prefs.PreferencesFactory\u003c/code\u003e System Property. A class name.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     * @since Java 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VENDOR"
      ],
      "begin_line": 514,
      "end_line": 514,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.vendor\u003c/code\u003e System Property. Java vendor-specific string.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VENDOR_URL"
      ],
      "begin_line": 533,
      "end_line": 533,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.vendor.url\u003c/code\u003e System Property. Java vendor URL.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION"
      ],
      "begin_line": 552,
      "end_line": 552,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.version\u003c/code\u003e System Property. Java version number.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_INFO"
      ],
      "begin_line": 572,
      "end_line": 572,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.vm.info\u003c/code\u003e System Property. Java Virtual Machine implementation info.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_NAME"
      ],
      "begin_line": 591,
      "end_line": 591,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.vm.name\u003c/code\u003e System Property. Java Virtual Machine implementation name.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_SPECIFICATION_NAME"
      ],
      "begin_line": 610,
      "end_line": 610,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.vm.specification.name\u003c/code\u003e System Property. Java Virtual Machine specification name.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_SPECIFICATION_VENDOR"
      ],
      "begin_line": 629,
      "end_line": 629,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.vm.specification.vendor\u003c/code\u003e System Property. Java Virtual Machine specification vendor.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_SPECIFICATION_VERSION"
      ],
      "begin_line": 648,
      "end_line": 648,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.vm.specification.version\u003c/code\u003e System Property. Java Virtual Machine specification version.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_VENDOR"
      ],
      "begin_line": 667,
      "end_line": 667,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.vm.vendor\u003c/code\u003e System Property. Java Virtual Machine implementation vendor.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VM_VERSION"
      ],
      "begin_line": 686,
      "end_line": 686,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003ejava.vm.version\u003c/code\u003e System Property. Java Virtual Machine implementation version.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LINE_SEPARATOR"
      ],
      "begin_line": 705,
      "end_line": 705,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003eline.separator\u003c/code\u003e System Property. Line separator (\u003ccode\u003e\u0026quot;\\n\u0026quot;\u003c/code\u003e on UNIX).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "OS_ARCH"
      ],
      "begin_line": 724,
      "end_line": 724,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003eos.arch\u003c/code\u003e System Property. Operating system architecture.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "OS_NAME"
      ],
      "begin_line": 743,
      "end_line": 743,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003eos.name\u003c/code\u003e System Property. Operating system name.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "OS_VERSION"
      ],
      "begin_line": 762,
      "end_line": 762,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003eos.version\u003c/code\u003e System Property. Operating system version.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PATH_SEPARATOR"
      ],
      "begin_line": 781,
      "end_line": 781,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003epath.separator\u003c/code\u003e System Property. Path separator (\u003ccode\u003e\u0026quot;:\u0026quot;\u003c/code\u003e on UNIX).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_COUNTRY"
      ],
      "begin_line": 802,
      "end_line": 803,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003euser.country\u003c/code\u003e or \u003ccode\u003euser.region\u003c/code\u003e System Property. User\u0027s country code, such as \u003ccode\u003eGB\u003c/code\u003e. First in\n     * Java version 1.2 as \u003ccode\u003euser.region\u003c/code\u003e. Renamed to \u003ccode\u003euser.country\u003c/code\u003e in 1.4\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_DIR"
      ],
      "begin_line": 822,
      "end_line": 822,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003euser.dir\u003c/code\u003e System Property. User\u0027s current working directory.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_HOME"
      ],
      "begin_line": 841,
      "end_line": 841,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003euser.home\u003c/code\u003e System Property. User\u0027s home directory.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_LANGUAGE"
      ],
      "begin_line": 861,
      "end_line": 861,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003euser.language\u003c/code\u003e System Property. User\u0027s language code, such as \u003ccode\u003e\"en\"\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     * @since Java 1.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_NAME"
      ],
      "begin_line": 880,
      "end_line": 880,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003euser.name\u003c/code\u003e System Property. User\u0027s account name.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since Java 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_TIMEZONE"
      ],
      "begin_line": 899,
      "end_line": 899,
      "comment": "\n     * \u003cp\u003e\n     * The \u003ccode\u003euser.timezone\u003c/code\u003e System Property. For example: \u003ccode\u003e\"America/Los_Angeles\"\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Defaults to \u003ccode\u003enull\u003c/code\u003e if the runtime does not have security access to read this property or the property does not exist.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This value is initialized when the class is loaded. If {@link System#setProperty(String,String)} or\n     * {@link System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync with that\n     * System property.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION_TRIMMED"
      ],
      "begin_line": 917,
      "end_line": 917,
      "comment": "\n     * \u003cp\u003e\n     * Gets the Java version as a \u003ccode\u003eString\u003c/code\u003e trimming leading letters.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003enull\u003c/code\u003e if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION_FLOAT"
      ],
      "begin_line": 943,
      "end_line": 943,
      "comment": "\n     * \u003cp\u003e\n     * Gets the Java version as a \u003ccode\u003efloat\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Example return values:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e1.2f\u003c/code\u003e for Java 1.2\n     * \u003cli\u003e\u003ccode\u003e1.31f\u003c/code\u003e for Java 1.3.1\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003e\n     * The field will return zero if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAVA_VERSION_INT"
      ],
      "begin_line": 964,
      "end_line": 964,
      "comment": "\n     * \u003cp\u003e\n     * Gets the Java version as an \u003ccode\u003eint\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Example return values:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e120\u003c/code\u003e for Java 1.2\n     * \u003cli\u003e\u003ccode\u003e131\u003c/code\u003e for Java 1.3.1\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003e\n     * The field will return zero if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_1"
      ],
      "begin_line": 980,
      "end_line": 980,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.1 (also 1.1.x versions).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_2"
      ],
      "begin_line": 991,
      "end_line": 991,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.2 (also 1.2.x versions).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_3"
      ],
      "begin_line": 1002,
      "end_line": 1002,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.3 (also 1.3.x versions).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_4"
      ],
      "begin_line": 1013,
      "end_line": 1013,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.4 (also 1.4.x versions).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_5"
      ],
      "begin_line": 1024,
      "end_line": 1024,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.5 (also 1.5.x versions).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_6"
      ],
      "begin_line": 1035,
      "end_line": 1035,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.6 (also 1.6.x versions).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_JAVA_1_7"
      ],
      "begin_line": 1048,
      "end_line": 1048,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Java version 1.7 (also 1.7.x versions).\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if {@link #JAVA_VERSION} is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 3.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_AIX"
      ],
      "begin_line": 1069,
      "end_line": 1069,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is AIX.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_HP_UX"
      ],
      "begin_line": 1082,
      "end_line": 1082,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is HP-UX.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_IRIX"
      ],
      "begin_line": 1095,
      "end_line": 1095,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Irix.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_LINUX"
      ],
      "begin_line": 1108,
      "end_line": 1108,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Linux.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_MAC"
      ],
      "begin_line": 1121,
      "end_line": 1121,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Mac.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_MAC_OSX"
      ],
      "begin_line": 1134,
      "end_line": 1134,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Mac.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_OS2"
      ],
      "begin_line": 1147,
      "end_line": 1147,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is OS/2.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_SOLARIS"
      ],
      "begin_line": 1160,
      "end_line": 1160,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Solaris.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_SUN_OS"
      ],
      "begin_line": 1173,
      "end_line": 1173,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is SunOS.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_UNIX"
      ],
      "begin_line": 1186,
      "end_line": 1187,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is a POSIX compilant system, as in any of AIX, HP-UX, Irix, Linux, MacOSX, Solaris or SUN OS.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS"
      ],
      "begin_line": 1200,
      "end_line": 1200,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Windows.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_2000"
      ],
      "begin_line": 1213,
      "end_line": 1213,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Windows 2000.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_95"
      ],
      "begin_line": 1226,
      "end_line": 1226,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Windows 95.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_98"
      ],
      "begin_line": 1240,
      "end_line": 1240,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Windows 98.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_ME"
      ],
      "begin_line": 1254,
      "end_line": 1254,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Windows ME.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_NT"
      ],
      "begin_line": 1268,
      "end_line": 1268,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Windows NT.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_XP"
      ],
      "begin_line": 1282,
      "end_line": 1282,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Windows XP.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_VISTA"
      ],
      "begin_line": 1296,
      "end_line": 1296,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Windows Vista.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 2.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "IS_OS_WINDOWS_7"
      ],
      "begin_line": 1309,
      "end_line": 1309,
      "comment": "\n     * \u003cp\u003e\n     * Is \u003ccode\u003etrue\u003c/code\u003e if this is Windows 7.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The field will return \u003ccode\u003efalse\u003c/code\u003e if \u003ccode\u003eOS_NAME\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @since 3.0\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getJavaHome()",
      "begin_line": 1323,
      "end_line": 1325,
      "comment": "\n     * \u003cp\u003e\n     * Gets the Java home directory as a \u003ccode\u003eFile\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @return a directory\n     * @throws SecurityException\n     *             if a security manager exists and its \u003ccode\u003echeckPropertyAccess\u003c/code\u003e method doesn\u0027t allow access to the specified system\n     *             property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getJavaIoTmpDir()",
      "begin_line": 1339,
      "end_line": 1341,
      "comment": "\n     * \u003cp\u003e\n     * Gets the Java IO temporary directory as a \u003ccode\u003eFile\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @return a directory\n     * @throws SecurityException\n     *             if a security manager exists and its \u003ccode\u003echeckPropertyAccess\u003c/code\u003e method doesn\u0027t allow access to the specified system\n     *             property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getJavaVersionAsFloat()",
      "begin_line": 1363,
      "end_line": 1365,
      "comment": "\n     * \u003cp\u003e\n     * Gets the Java version number as a \u003ccode\u003efloat\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Example return values:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e1.2f\u003c/code\u003e for Java 1.2\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e1.31f\u003c/code\u003e for Java 1.3.1\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e1.6f\u003c/code\u003e for Java 1.6.0_20\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003e\n     * Patch releases are not reported.\n     * \u003c/p\u003e\n     * \n     * @return the version, for example 1.31f for Java 1.3.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getJavaVersionAsInt()",
      "begin_line": 1387,
      "end_line": 1389,
      "comment": "\n     * \u003cp\u003e\n     * Gets the Java version number as an \u003ccode\u003eint\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Example return values:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e120\u003c/code\u003e for Java 1.2\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e131\u003c/code\u003e for Java 1.3.1\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e160\u003c/code\u003e for Java 1.6.0_20\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003e\n     * Patch releases are not reported.\n     * \u003c/p\u003e\n     * \n     * @return the version, for example 131 for Java 1.3.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getJavaVersionMatches(java.lang.String)",
      "begin_line": 1400,
      "end_line": 1402,
      "comment": "\n     * \u003cp\u003e\n     * Decides if the Java version matches.\n     * \u003c/p\u003e\n     * \n     * @param versionPrefix\n     *            the prefix for the java version\n     * @return true if matches, or false if not or can\u0027t determine\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getJavaVersionTrimmed()",
      "begin_line": 1409,
      "end_line": 1419,
      "comment": "\n     * Trims the text of the java version to start with numbers.\n     * \n     * @return the trimmed java version\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getOSMatches(java.lang.String, java.lang.String)",
      "begin_line": 1430,
      "end_line": 1432,
      "comment": "\n     * Decides if the operating system matches.\n     * \n     * @param osNamePrefix\n     *            the prefix for the os name\n     * @param osVersionPrefix\n     *            the prefix for the version\n     * @return true if matches, or false if not or can\u0027t determine\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getOSMatchesName(java.lang.String)",
      "begin_line": 1441,
      "end_line": 1443,
      "comment": "\n     * Decides if the operating system matches.\n     * \n     * @param osNamePrefix\n     *            the prefix for the os name\n     * @return true if matches, or false if not or can\u0027t determine\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getSystemProperty(java.lang.String)",
      "begin_line": 1460,
      "end_line": 1469,
      "comment": "\n     * \u003cp\u003e\n     * Gets a System property, defaulting to \u003ccode\u003enull\u003c/code\u003e if the property cannot be read.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If a \u003ccode\u003eSecurityException\u003c/code\u003e is caught, the return value is \u003ccode\u003enull\u003c/code\u003e and a message is written to\n     * \u003ccode\u003eSystem.err\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @param property\n     *            the system property name\n     * @return the system property value or \u003ccode\u003enull\u003c/code\u003e if a security problem occurs\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getUserDir()",
      "begin_line": 1483,
      "end_line": 1485,
      "comment": "\n     * \u003cp\u003e\n     * Gets the user directory as a \u003ccode\u003eFile\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @return a directory\n     * @throws SecurityException\n     *             if a security manager exists and its \u003ccode\u003echeckPropertyAccess\u003c/code\u003e method doesn\u0027t allow access to the specified system\n     *             property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.getUserHome()",
      "begin_line": 1499,
      "end_line": 1501,
      "comment": "\n     * \u003cp\u003e\n     * Gets the user home directory as a \u003ccode\u003eFile\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @return a directory\n     * @throws SecurityException\n     *             if a security manager exists and its \u003ccode\u003echeckPropertyAccess\u003c/code\u003e method doesn\u0027t allow access to the specified system\n     *             property.\n     * @see System#getProperty(String)\n     * @since 2.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isJavaAwtHeadless()",
      "begin_line": 1512,
      "end_line": 1514,
      "comment": "\n     * Returns whether the {@link #JAVA_AWT_HEADLESS} value is \u003ccode\u003etrue\u003c/code\u003e.\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003eJAVA_AWT_HEADLESS\u003c/code\u003e is \u003ccode\u003e\"true\"\u003c/code\u003e, \u003ccode\u003efalse\u003c/code\u003e otherwise.\n     * \n     * @see #JAVA_AWT_HEADLESS\n     * @since 2.1\n     * @since Java 1.4\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(float)",
      "begin_line": 1533,
      "end_line": 1535,
      "comment": "\n     * \u003cp\u003e\n     * Is the Java version at least the requested version.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Example input:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e1.2f\u003c/code\u003e to test for Java 1.2\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e1.31f\u003c/code\u003e to test for Java 1.3.1\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param requiredVersion\n     *            the required version, for example 1.31f\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the actual version is equal or greater than the required version\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(int)",
      "begin_line": 1555,
      "end_line": 1557,
      "comment": "\n     * \u003cp\u003e\n     * Is the Java version at least the requested version.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Example input:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e120\u003c/code\u003e to test for Java 1.2 or greater\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e131\u003c/code\u003e to test for Java 1.3.1 or greater\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param requiredVersion\n     *            the required version, for example 131\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the actual version is equal or greater than the required version\n     * @since 2.0\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isJavaVersionMatch(java.lang.String, java.lang.String)",
      "begin_line": 1573,
      "end_line": 1578,
      "comment": "\n     * \u003cp\u003e\n     * Decides if the Java version matches.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method is package private instead of private to support unit test invocation.\n     * \u003c/p\u003e\n     * \n     * @param version\n     *            the actual Java version\n     * @param versionPrefix\n     *            the prefix for the expected Java version\n     * @return true if matches, or false if not or can\u0027t determine\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isOSMatch(java.lang.String, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 1596,
      "end_line": 1601,
      "comment": "\n     * Decides if the operating system matches.\n     * \u003cp\u003e\n     * This method is package private instead of private to support unit test invocation.\n     * \u003c/p\u003e\n     * \n     * @param osName\n     *            the actual OS name\n     * @param osVersion\n     *            the actual OS version\n     * @param osNamePrefix\n     *            the prefix for the expected OS name\n     * @param osVersionPrefix\n     *            the prefix for the expected OS version\n     * @return true if matches, or false if not or can\u0027t determine\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.isOSNameMatch(java.lang.String, java.lang.String)",
      "begin_line": 1615,
      "end_line": 1620,
      "comment": "\n     * Decides if the operating system matches.\n     * \u003cp\u003e\n     * This method is package private instead of private to support unit test invocation.\n     * \u003c/p\u003e\n     * \n     * @param osName\n     *            the actual OS name\n     * @param osNamePrefix\n     *            the prefix for the expected OS name\n     * @return true if matches, or false if not or can\u0027t determine\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.toJavaVersionFloat(java.lang.String)",
      "begin_line": 1645,
      "end_line": 1647,
      "comment": "\n     * \u003cp\u003e\n     * Converts the given Java version string to a \u003ccode\u003efloat\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Example return values:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e1.2f\u003c/code\u003e for Java 1.2\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e1.31f\u003c/code\u003e for Java 1.3.1\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e1.6f\u003c/code\u003e for Java 1.6.0_20\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003e\n     * Patch releases are not reported.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method is package private instead of private to support unit test invocation.\n     * \u003c/p\u003e\n     * \n     * @return the version, for example 1.31f for Java 1.3.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.toJavaVersionInt(java.lang.String)",
      "begin_line": 1672,
      "end_line": 1674,
      "comment": "\n     * \u003cp\u003e\n     * Converts the given Java version string to an \u003ccode\u003eint\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Example return values:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e120\u003c/code\u003e for Java 1.2\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e131\u003c/code\u003e for Java 1.3.1\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e160\u003c/code\u003e for Java 1.6.0_20\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003e\n     * Patch releases are not reported.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method is package private instead of private to support unit test invocation.\n     * \u003c/p\u003e\n     * \n     * @return the version, for example 131 for Java 1.3.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray(java.lang.String)",
      "begin_line": 1695,
      "end_line": 1697,
      "comment": "\n     * \u003cp\u003e\n     * Converts the given Java version string to an \u003ccode\u003eint[]\u003c/code\u003e of maximum size \u003ccode\u003e3\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Example return values:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e[1, 2, 0]\u003c/code\u003e for Java 1.2\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e[1, 3, 1]\u003c/code\u003e for Java 1.3.1\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e[1, 5, 0]\u003c/code\u003e for Java 1.5.0_21\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * This method is package private instead of private to support unit test invocation.\n     * \u003c/p\u003e\n     * \n     * @return the version, for example [1, 5, 0] for Java 1.5.0_21\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.toJavaVersionIntArray(java.lang.String, int)",
      "begin_line": 1715,
      "end_line": 1729,
      "comment": "\n     * \u003cp\u003e\n     * Converts the given Java version string to an \u003ccode\u003eint[]\u003c/code\u003e of maximum size \u003ccode\u003elimit\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Example return values:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e[1, 2, 0]\u003c/code\u003e for Java 1.2\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e[1, 3, 1]\u003c/code\u003e for Java 1.3.1\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e[1, 5, 0, 21]\u003c/code\u003e for Java 1.5.0_21\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @return the version, for example [1, 5, 0, 21] for Java 1.5.0_21\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.toVersionFloat(int[])",
      "begin_line": 1751,
      "end_line": 1769,
      "comment": "\n     * \u003cp\u003e\n     * Converts given the Java version array to a \u003ccode\u003efloat\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Example return values:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e1.2f\u003c/code\u003e for Java 1.2\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e1.31f\u003c/code\u003e for Java 1.3.1\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e1.6f\u003c/code\u003e for Java 1.6.0_20\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003e\n     * Patch releases are not reported.\n     * \u003c/p\u003e\n     * \n     * @return the version, for example 1.31f for Java 1.3.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SystemUtils.toVersionInt(int[])",
      "begin_line": 1791,
      "end_line": 1807,
      "comment": "\n     * \u003cp\u003e\n     * Converts given the Java version array to an \u003ccode\u003eint\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Example return values:\n     * \u003c/p\u003e\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e120\u003c/code\u003e for Java 1.2\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e131\u003c/code\u003e for Java 1.3.1\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e160\u003c/code\u003e for Java 1.6.0_20\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * \u003cp\u003e\n     * Patch releases are not reported.\n     * \u003c/p\u003e\n     * \n     * @return the version, for example 1.31f for Java 1.3.1\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SystemUtils.SystemUtils()",
      "begin_line": 1820,
      "end_line": 1822,
      "comment": "\n     * \u003cp\u003e\n     * SystemUtils instances should NOT be constructed in standard programming. Instead, the class should be used as\n     * \u003ccode\u003eSystemUtils.FILE_SEPARATOR\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * This constructor is public to permit tools that require a JavaBean instance to operate.\n     * \u003c/p\u003e\n     "
    }
  ]
}