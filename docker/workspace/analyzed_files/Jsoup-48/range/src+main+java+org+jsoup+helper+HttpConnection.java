{
  "filepath": "/tmp/Jsoup-48f/src/main/java/org/jsoup/helper/HttpConnection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HttpConnection",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.Connection"
      ],
      "begin_line": 30,
      "end_line": 953,
      "comment": "\n * Implementation of {@link Connection}.\n * @see org.jsoup.Jsoup#connect(String)\n "
    },
    {
      "type": "field",
      "varNames": [
        "CONTENT_ENCODING"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONTENT_TYPE"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MULTIPART_FORM_DATA"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FORM_URL_ENCODED"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.connect(java.lang.String)",
      "begin_line": 36,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.connect(java.net.URL)",
      "begin_line": 42,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.encodeUrl(java.lang.String)",
      "begin_line": 48,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.encodeMimeName(java.lang.String)",
      "begin_line": 54,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "req"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "res"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.HttpConnection()",
      "begin_line": 63,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.url(java.net.URL)",
      "begin_line": 68,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.url(java.lang.String)",
      "begin_line": 73,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.userAgent(java.lang.String)",
      "begin_line": 83,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.timeout(int)",
      "begin_line": 89,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.maxBodySize(int)",
      "begin_line": 94,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.followRedirects(boolean)",
      "begin_line": 99,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.referrer(java.lang.String)",
      "begin_line": 104,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.method(org.jsoup.Connection.Method)",
      "begin_line": 110,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.ignoreHttpErrors(boolean)",
      "begin_line": 115,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.ignoreContentType(boolean)",
      "begin_line": 120,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.validateTLSCertificates(boolean)",
      "begin_line": 125,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String, java.lang.String)",
      "begin_line": 130,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String, java.lang.String, java.io.InputStream)",
      "begin_line": 135,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 140,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String...)",
      "begin_line": 148,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.util.Collection\u003corg.jsoup.Connection.KeyVal\u003e)",
      "begin_line": 161,
      "end_line": 167,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.header(java.lang.String, java.lang.String)",
      "begin_line": 169,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.cookie(java.lang.String, java.lang.String)",
      "begin_line": 174,
      "end_line": 177,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.cookies(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 179,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.parser(org.jsoup.parser.Parser)",
      "begin_line": 187,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.get()",
      "begin_line": 192,
      "end_line": 196,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.post()",
      "begin_line": 198,
      "end_line": 202,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.execute()",
      "begin_line": 204,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.request()",
      "begin_line": 209,
      "end_line": 211,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.request(org.jsoup.Connection.Request)",
      "begin_line": 213,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.response()",
      "begin_line": 218,
      "end_line": 220,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.response(org.jsoup.Connection.Response)",
      "begin_line": 222,
      "end_line": 225,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.postDataCharset(java.lang.String)",
      "begin_line": 227,
      "end_line": 230,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Base",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.Connection.Base\u003cT\u003e"
      ],
      "begin_line": 232,
      "end_line": 350,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "url"
      ],
      "begin_line": 234,
      "end_line": 234,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headers"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cookies"
      ],
      "begin_line": 237,
      "end_line": 237,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Base.Base()",
      "begin_line": 239,
      "end_line": 242,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.url()",
      "begin_line": 244,
      "end_line": 246,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.url(java.net.URL)",
      "begin_line": 248,
      "end_line": 252,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.method()",
      "begin_line": 254,
      "end_line": 256,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.method(org.jsoup.Connection.Method)",
      "begin_line": 258,
      "end_line": 262,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.header(java.lang.String)",
      "begin_line": 264,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.header(java.lang.String, java.lang.String)",
      "begin_line": 269,
      "end_line": 275,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.hasHeader(java.lang.String)",
      "begin_line": 277,
      "end_line": 280,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.hasHeaderWithValue(java.lang.String, java.lang.String)",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\n         * Test if the request has a header with this value (case insensitive).\n         "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.removeHeader(java.lang.String)",
      "begin_line": 289,
      "end_line": 295,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.headers()",
      "begin_line": 297,
      "end_line": 299,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.getHeaderCaseInsensitive(java.lang.String)",
      "begin_line": 301,
      "end_line": 313,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.scanHeaders(java.lang.String)",
      "begin_line": 315,
      "end_line": 322,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.cookie(java.lang.String)",
      "begin_line": 324,
      "end_line": 327,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.cookie(java.lang.String, java.lang.String)",
      "begin_line": 329,
      "end_line": 334,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.hasCookie(java.lang.String)",
      "begin_line": 336,
      "end_line": 339,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.removeCookie(java.lang.String)",
      "begin_line": 341,
      "end_line": 345,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.cookies()",
      "begin_line": 347,
      "end_line": 349,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Request",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.helper.HttpConnection.Base\u003corg.jsoup.Connection.Request\u003e",
        "org.jsoup.Connection.Request"
      ],
      "begin_line": 352,
      "end_line": 459,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "timeoutMilliseconds"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxBodySizeBytes"
      ],
      "begin_line": 354,
      "end_line": 354,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "followRedirects"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreHttpErrors"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreContentType"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parserDefined"
      ],
      "begin_line": 360,
      "end_line": 360,
      "comment": " called parser(...) vs initialized in ctor"
    },
    {
      "type": "field",
      "varNames": [
        "validateTSLCertificates"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "postDataCharset"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Request.Request()",
      "begin_line": 364,
      "end_line": 372,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.timeout()",
      "begin_line": 374,
      "end_line": 376,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.timeout(int)",
      "begin_line": 378,
      "end_line": 382,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.maxBodySize()",
      "begin_line": 384,
      "end_line": 386,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.maxBodySize(int)",
      "begin_line": 388,
      "end_line": 392,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.followRedirects()",
      "begin_line": 394,
      "end_line": 396,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.followRedirects(boolean)",
      "begin_line": 398,
      "end_line": 401,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreHttpErrors()",
      "begin_line": 403,
      "end_line": 405,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.validateTLSCertificates()",
      "begin_line": 407,
      "end_line": 409,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.validateTLSCertificates(boolean)",
      "begin_line": 411,
      "end_line": 413,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreHttpErrors(boolean)",
      "begin_line": 415,
      "end_line": 418,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreContentType()",
      "begin_line": 420,
      "end_line": 422,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreContentType(boolean)",
      "begin_line": 424,
      "end_line": 427,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.data(org.jsoup.Connection.KeyVal)",
      "begin_line": 429,
      "end_line": 433,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.data()",
      "begin_line": 435,
      "end_line": 437,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.parser(org.jsoup.parser.Parser)",
      "begin_line": 439,
      "end_line": 443,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.parser()",
      "begin_line": 445,
      "end_line": 447,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.postDataCharset(java.lang.String)",
      "begin_line": 449,
      "end_line": 454,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.postDataCharset()",
      "begin_line": 456,
      "end_line": 458,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Response",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.helper.HttpConnection.Base\u003corg.jsoup.Connection.Response\u003e",
        "org.jsoup.Connection.Response"
      ],
      "begin_line": 461,
      "end_line": 897,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_REDIRECTS"
      ],
      "begin_line": 462,
      "end_line": 462,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sslSocketFactory"
      ],
      "begin_line": 463,
      "end_line": 463,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCATION"
      ],
      "begin_line": 464,
      "end_line": 464,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "statusCode"
      ],
      "begin_line": 465,
      "end_line": 465,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "statusMessage"
      ],
      "begin_line": 466,
      "end_line": 466,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "byteData"
      ],
      "begin_line": 467,
      "end_line": 467,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 468,
      "end_line": 468,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contentType"
      ],
      "begin_line": 469,
      "end_line": 469,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "executed"
      ],
      "begin_line": 470,
      "end_line": 470,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numRedirects"
      ],
      "begin_line": 471,
      "end_line": 471,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "req"
      ],
      "begin_line": 472,
      "end_line": 472,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "xmlContentTypeRxp"
      ],
      "begin_line": 477,
      "end_line": 477,
      "comment": "\n         * Matches XML content types (like text/xml, application/xhtml+xml;charset\u003dUTF8, etc)\n         "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Response.Response()",
      "begin_line": 479,
      "end_line": 481,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Response.Response(org.jsoup.helper.HttpConnection.Response)",
      "begin_line": 483,
      "end_line": 490,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.execute(org.jsoup.Connection.Request)",
      "begin_line": 492,
      "end_line": 494,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.execute(org.jsoup.Connection.Request, org.jsoup.helper.HttpConnection.Response)",
      "begin_line": 496,
      "end_line": 583,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.statusCode()",
      "begin_line": 585,
      "end_line": 587,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.statusMessage()",
      "begin_line": 589,
      "end_line": 591,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.charset()",
      "begin_line": 593,
      "end_line": 595,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.contentType()",
      "begin_line": 597,
      "end_line": 599,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.parse()",
      "begin_line": 601,
      "end_line": 607,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.body()",
      "begin_line": 609,
      "end_line": 619,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.bodyAsBytes()",
      "begin_line": 621,
      "end_line": 624,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.createConnection(org.jsoup.Connection.Request)",
      "begin_line": 627,
      "end_line": 651,
      "comment": " set up connection defaults, and details from request"
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.getInsecureVerifier()",
      "begin_line": 660,
      "end_line": 666,
      "comment": "\n         * Instantiate Hostname Verifier that does nothing.\n         * This is used for connections with disabled SSL certificates validation.\n         *\n         *\n         * @return Hostname Verifier that does nothing and accepts all hostnames\n         "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.Anonymous-393da93a-db34-442d-8cc6-070c0e8418ff.verify(java.lang.String, javax.net.ssl.SSLSession)",
      "begin_line": 662,
      "end_line": 664,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.initUnSecureTSL()",
      "begin_line": 677,
      "end_line": 707,
      "comment": "\n         * Initialise Trust manager that does not validate certificate chains and\n         * add it to current SSLContext.\n         * \u003cp/\u003e\n         * please not that this method will only perform action if sslSocketFactory is not yet\n         * instantiated.\n         *\n         * @throws IOException\n         "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.Anonymous-43a307fd-9dd7-4b29-bb91-b0382974096a.checkClientTrusted(java.security.cert.X509Certificate[], java.lang.String)",
      "begin_line": 682,
      "end_line": 683,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.Anonymous-df71aebb-eff2-4a3f-b002-0d89f1ea6f4b.checkServerTrusted(java.security.cert.X509Certificate[], java.lang.String)",
      "begin_line": 685,
      "end_line": 686,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.Anonymous-5b9d5ecf-6c05-44f6-aaf7-81179ed9014b.getAcceptedIssuers()",
      "begin_line": 688,
      "end_line": 690,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.setupFromConnection(java.net.HttpURLConnection, org.jsoup.Connection.Response)",
      "begin_line": 710,
      "end_line": 727,
      "comment": " set up url, method, header, cookies"
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.createHeaderMap(java.net.HttpURLConnection)",
      "begin_line": 729,
      "end_line": 751,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.processResponseHeaders(java.util.Map\u003cjava.lang.String, java.util.List\u003cjava.lang.String\u003e\u003e)",
      "begin_line": 753,
      "end_line": 787,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.setOutputContentType(org.jsoup.Connection.Request)",
      "begin_line": 789,
      "end_line": 806,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.writePost(org.jsoup.Connection.Request, java.io.OutputStream, java.lang.String)",
      "begin_line": 808,
      "end_line": 852,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.getRequestCookieString(org.jsoup.Connection.Request)",
      "begin_line": 854,
      "end_line": 866,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl(org.jsoup.Connection.Request)",
      "begin_line": 869,
      "end_line": 896,
      "comment": " for get url reqs, serialise the data map into the url"
    },
    {
      "type": "class_interface",
      "name": "KeyVal",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.Connection.KeyVal"
      ],
      "begin_line": 899,
      "end_line": 952,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 900,
      "end_line": 900,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 901,
      "end_line": 901,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stream"
      ],
      "begin_line": 902,
      "end_line": 902,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.create(java.lang.String, java.lang.String)",
      "begin_line": 904,
      "end_line": 906,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.create(java.lang.String, java.lang.String, java.io.InputStream)",
      "begin_line": 908,
      "end_line": 910,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.KeyVal()",
      "begin_line": 912,
      "end_line": 912,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.key(java.lang.String)",
      "begin_line": 914,
      "end_line": 918,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.key()",
      "begin_line": 920,
      "end_line": 922,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.value(java.lang.String)",
      "begin_line": 924,
      "end_line": 928,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.value()",
      "begin_line": 930,
      "end_line": 932,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.inputStream(java.io.InputStream)",
      "begin_line": 934,
      "end_line": 938,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.inputStream()",
      "begin_line": 940,
      "end_line": 942,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.hasInputStream()",
      "begin_line": 944,
      "end_line": 946,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.toString()",
      "begin_line": 948,
      "end_line": 951,
      "comment": ""
    }
  ]
}