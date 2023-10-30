{
  "filepath": "/tmp/Jsoup-90f/src/main/java/org/jsoup/helper/HttpConnection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HttpConnection",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.Connection"
      ],
      "begin_line": 52,
      "end_line": 1203,
      "comment": "\n * Implementation of {@link Connection}.\n * @see org.jsoup.Jsoup#connect(String)\n "
    },
    {
      "type": "field",
      "varNames": [
        "CONTENT_ENCODING"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_UA"
      ],
      "begin_line": 58,
      "end_line": 59,
      "comment": "\n     * Many users would get caught by not setting a user-agent and therefore getting different responses on their desktop\n     * vs in jsoup, which would otherwise default to {@code Java}. So by default, use a desktop UA.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "USER_AGENT"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CONTENT_TYPE"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MULTIPART_FORM_DATA"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FORM_URL_ENCODED"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HTTP_TEMP_REDIR"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " http/1.1 temporary redirect, not in Java\u0027s set."
    },
    {
      "type": "field",
      "varNames": [
        "DefaultUploadType"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.connect(java.lang.String)",
      "begin_line": 67,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.connect(java.net.URL)",
      "begin_line": 73,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.HttpConnection()",
      "begin_line": 79,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.encodeUrl(java.lang.String)",
      "begin_line": 89,
      "end_line": 96,
      "comment": "\n     * Encodes the input URL into a safe ASCII URL string\n     * @param url unescaped URL\n     * @return escaped URL\n     "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.encodeUrl(java.net.URL)",
      "begin_line": 98,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.encodeMimeName(java.lang.String)",
      "begin_line": 110,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "req"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "res"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.url(java.net.URL)",
      "begin_line": 119,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.url(java.lang.String)",
      "begin_line": 124,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.proxy(java.net.Proxy)",
      "begin_line": 134,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.proxy(java.lang.String, int)",
      "begin_line": 139,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.userAgent(java.lang.String)",
      "begin_line": 144,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.timeout(int)",
      "begin_line": 150,
      "end_line": 153,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.maxBodySize(int)",
      "begin_line": 155,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.followRedirects(boolean)",
      "begin_line": 160,
      "end_line": 163,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.referrer(java.lang.String)",
      "begin_line": 165,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.method(org.jsoup.Connection.Method)",
      "begin_line": 171,
      "end_line": 174,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.ignoreHttpErrors(boolean)",
      "begin_line": 176,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.ignoreContentType(boolean)",
      "begin_line": 181,
      "end_line": 184,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String, java.lang.String)",
      "begin_line": 187,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.sslSocketFactory(javax.net.ssl.SSLSocketFactory)",
      "begin_line": 192,
      "end_line": 195,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String, java.lang.String, java.io.InputStream)",
      "begin_line": 197,
      "end_line": 200,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String, java.lang.String, java.io.InputStream, java.lang.String)",
      "begin_line": 202,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 208,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String...)",
      "begin_line": 216,
      "end_line": 227,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.util.Collection\u003corg.jsoup.Connection.KeyVal\u003e)",
      "begin_line": 229,
      "end_line": 235,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.data(java.lang.String)",
      "begin_line": 237,
      "end_line": 244,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.requestBody(java.lang.String)",
      "begin_line": 246,
      "end_line": 249,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.header(java.lang.String, java.lang.String)",
      "begin_line": 251,
      "end_line": 254,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.headers(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 256,
      "end_line": 262,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.cookie(java.lang.String, java.lang.String)",
      "begin_line": 264,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.cookies(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 269,
      "end_line": 275,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.parser(org.jsoup.parser.Parser)",
      "begin_line": 277,
      "end_line": 280,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.get()",
      "begin_line": 282,
      "end_line": 286,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.post()",
      "begin_line": 288,
      "end_line": 292,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.execute()",
      "begin_line": 294,
      "end_line": 297,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.request()",
      "begin_line": 299,
      "end_line": 301,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.request(org.jsoup.Connection.Request)",
      "begin_line": 303,
      "end_line": 306,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.response()",
      "begin_line": 308,
      "end_line": 310,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.response(org.jsoup.Connection.Response)",
      "begin_line": 312,
      "end_line": 315,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.postDataCharset(java.lang.String)",
      "begin_line": 317,
      "end_line": 320,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Base",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.Connection.Base\u003cT\u003e"
      ],
      "begin_line": 322,
      "end_line": 534,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "url"
      ],
      "begin_line": 324,
      "end_line": 324,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headers"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cookies"
      ],
      "begin_line": 327,
      "end_line": 327,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Base.Base()",
      "begin_line": 329,
      "end_line": 332,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.url()",
      "begin_line": 334,
      "end_line": 336,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.url(java.net.URL)",
      "begin_line": 338,
      "end_line": 342,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.method()",
      "begin_line": 344,
      "end_line": 346,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.method(org.jsoup.Connection.Method)",
      "begin_line": 348,
      "end_line": 352,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.header(java.lang.String)",
      "begin_line": 354,
      "end_line": 363,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.addHeader(java.lang.String, java.lang.String)",
      "begin_line": 365,
      "end_line": 378,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.headers(java.lang.String)",
      "begin_line": 380,
      "end_line": 384,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.fixHeaderEncoding(java.lang.String)",
      "begin_line": 386,
      "end_line": 396,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.looksLikeUtf8(byte[])",
      "begin_line": 398,
      "end_line": 436,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.header(java.lang.String, java.lang.String)",
      "begin_line": 438,
      "end_line": 443,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.hasHeader(java.lang.String)",
      "begin_line": 445,
      "end_line": 448,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.hasHeaderWithValue(java.lang.String, java.lang.String)",
      "begin_line": 453,
      "end_line": 462,
      "comment": "\n         * Test if the request has a header with this value (case insensitive).\n         "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.removeHeader(java.lang.String)",
      "begin_line": 464,
      "end_line": 470,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.headers()",
      "begin_line": 472,
      "end_line": 481,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.multiHeaders()",
      "begin_line": 483,
      "end_line": 486,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.getHeadersCaseInsensitive(java.lang.String)",
      "begin_line": 488,
      "end_line": 497,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.scanHeaders(java.lang.String)",
      "begin_line": 499,
      "end_line": 506,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.cookie(java.lang.String)",
      "begin_line": 508,
      "end_line": 511,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.cookie(java.lang.String, java.lang.String)",
      "begin_line": 513,
      "end_line": 518,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.hasCookie(java.lang.String)",
      "begin_line": 520,
      "end_line": 523,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.removeCookie(java.lang.String)",
      "begin_line": 525,
      "end_line": 529,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Base.cookies()",
      "begin_line": 531,
      "end_line": 533,
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
      "begin_line": 536,
      "end_line": 669,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "proxy"
      ],
      "begin_line": 537,
      "end_line": 537,
      "comment": " nullable"
    },
    {
      "type": "field",
      "varNames": [
        "timeoutMilliseconds"
      ],
      "begin_line": 538,
      "end_line": 538,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxBodySizeBytes"
      ],
      "begin_line": 539,
      "end_line": 539,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "followRedirects"
      ],
      "begin_line": 540,
      "end_line": 540,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 541,
      "end_line": 541,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "body"
      ],
      "begin_line": 542,
      "end_line": 542,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreHttpErrors"
      ],
      "begin_line": 543,
      "end_line": 543,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ignoreContentType"
      ],
      "begin_line": 544,
      "end_line": 544,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 545,
      "end_line": 545,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parserDefined"
      ],
      "begin_line": 546,
      "end_line": 546,
      "comment": " called parser(...) vs initialized in ctor"
    },
    {
      "type": "field",
      "varNames": [
        "postDataCharset"
      ],
      "begin_line": 547,
      "end_line": 547,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sslSocketFactory"
      ],
      "begin_line": 548,
      "end_line": 548,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Request.Request()",
      "begin_line": 550,
      "end_line": 559,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.proxy()",
      "begin_line": 561,
      "end_line": 563,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.proxy(java.net.Proxy)",
      "begin_line": 565,
      "end_line": 568,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.proxy(java.lang.String, int)",
      "begin_line": 570,
      "end_line": 573,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.timeout()",
      "begin_line": 575,
      "end_line": 577,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.timeout(int)",
      "begin_line": 579,
      "end_line": 583,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.maxBodySize()",
      "begin_line": 585,
      "end_line": 587,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.maxBodySize(int)",
      "begin_line": 589,
      "end_line": 593,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.followRedirects()",
      "begin_line": 595,
      "end_line": 597,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.followRedirects(boolean)",
      "begin_line": 599,
      "end_line": 602,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreHttpErrors()",
      "begin_line": 604,
      "end_line": 606,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.sslSocketFactory()",
      "begin_line": 608,
      "end_line": 610,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.sslSocketFactory(javax.net.ssl.SSLSocketFactory)",
      "begin_line": 612,
      "end_line": 614,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreHttpErrors(boolean)",
      "begin_line": 616,
      "end_line": 619,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreContentType()",
      "begin_line": 621,
      "end_line": 623,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.ignoreContentType(boolean)",
      "begin_line": 625,
      "end_line": 628,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.data(org.jsoup.Connection.KeyVal)",
      "begin_line": 630,
      "end_line": 634,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.data()",
      "begin_line": 636,
      "end_line": 638,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.requestBody(java.lang.String)",
      "begin_line": 640,
      "end_line": 643,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.requestBody()",
      "begin_line": 645,
      "end_line": 647,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.parser(org.jsoup.parser.Parser)",
      "begin_line": 649,
      "end_line": 653,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.parser()",
      "begin_line": 655,
      "end_line": 657,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.postDataCharset(java.lang.String)",
      "begin_line": 659,
      "end_line": 664,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Request.postDataCharset()",
      "begin_line": 666,
      "end_line": 668,
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
      "begin_line": 671,
      "end_line": 1125,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_REDIRECTS"
      ],
      "begin_line": 672,
      "end_line": 672,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LOCATION"
      ],
      "begin_line": 673,
      "end_line": 673,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "statusCode"
      ],
      "begin_line": 674,
      "end_line": 674,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "statusMessage"
      ],
      "begin_line": 675,
      "end_line": 675,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "byteData"
      ],
      "begin_line": 676,
      "end_line": 676,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bodyStream"
      ],
      "begin_line": 677,
      "end_line": 677,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "conn"
      ],
      "begin_line": 678,
      "end_line": 678,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "charset"
      ],
      "begin_line": 679,
      "end_line": 679,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contentType"
      ],
      "begin_line": 680,
      "end_line": 680,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "executed"
      ],
      "begin_line": 681,
      "end_line": 681,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inputStreamRead"
      ],
      "begin_line": 682,
      "end_line": 682,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numRedirects"
      ],
      "begin_line": 683,
      "end_line": 683,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "req"
      ],
      "begin_line": 684,
      "end_line": 684,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "xmlContentTypeRxp"
      ],
      "begin_line": 689,
      "end_line": 689,
      "comment": "\n         * Matches XML content types (like text/xml, application/xhtml+xml;charset\u003dUTF8, etc)\n         "
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Response.Response()",
      "begin_line": 691,
      "end_line": 693,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.Response.Response(org.jsoup.helper.HttpConnection.Response)",
      "begin_line": 695,
      "end_line": 702,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.execute(org.jsoup.Connection.Request)",
      "begin_line": 704,
      "end_line": 706,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.execute(org.jsoup.Connection.Request, org.jsoup.helper.HttpConnection.Response)",
      "begin_line": 708,
      "end_line": 805,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.statusCode()",
      "begin_line": 807,
      "end_line": 809,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.statusMessage()",
      "begin_line": 811,
      "end_line": 813,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.charset()",
      "begin_line": 815,
      "end_line": 817,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.charset(java.lang.String)",
      "begin_line": 819,
      "end_line": 822,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.contentType()",
      "begin_line": 824,
      "end_line": 826,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.parse()",
      "begin_line": 828,
      "end_line": 840,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.prepareByteData()",
      "begin_line": 842,
      "end_line": 855,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.body()",
      "begin_line": 857,
      "end_line": 867,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.bodyAsBytes()",
      "begin_line": 869,
      "end_line": 872,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.bufferUp()",
      "begin_line": 874,
      "end_line": 878,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.bodyStream()",
      "begin_line": 880,
      "end_line": 886,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.createConnection(org.jsoup.Connection.Request)",
      "begin_line": 889,
      "end_line": 913,
      "comment": " set up connection defaults, and details from request"
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.safeClose()",
      "begin_line": 918,
      "end_line": 932,
      "comment": "\n         * Call on completion of stream read, to close the body (or error) stream\n         "
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.setupFromConnection(java.net.HttpURLConnection, org.jsoup.helper.HttpConnection.Response)",
      "begin_line": 935,
      "end_line": 954,
      "comment": " set up url, method, header, cookies"
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.createHeaderMap(java.net.HttpURLConnection)",
      "begin_line": 956,
      "end_line": 978,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.processResponseHeaders(java.util.Map\u003cjava.lang.String, java.util.List\u003cjava.lang.String\u003e\u003e)",
      "begin_line": 980,
      "end_line": 1004,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.setOutputContentType(org.jsoup.Connection.Request)",
      "begin_line": 1006,
      "end_line": 1027,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.writePost(org.jsoup.Connection.Request, java.io.OutputStream, java.lang.String)",
      "begin_line": 1029,
      "end_line": 1079,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.getRequestCookieString(org.jsoup.Connection.Request)",
      "begin_line": 1081,
      "end_line": 1093,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl(org.jsoup.Connection.Request)",
      "begin_line": 1096,
      "end_line": 1124,
      "comment": " for get url reqs, serialise the data map into the url"
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.needsMultipart(org.jsoup.Connection.Request)",
      "begin_line": 1127,
      "end_line": 1134,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "KeyVal",
      "is_interface": false,
      "parent_types": [
        "org.jsoup.Connection.KeyVal"
      ],
      "begin_line": 1136,
      "end_line": 1202,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "key"
      ],
      "begin_line": 1137,
      "end_line": 1137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 1138,
      "end_line": 1138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stream"
      ],
      "begin_line": 1139,
      "end_line": 1139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contentType"
      ],
      "begin_line": 1140,
      "end_line": 1140,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.create(java.lang.String, java.lang.String)",
      "begin_line": 1142,
      "end_line": 1144,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.create(java.lang.String, java.lang.String, java.io.InputStream)",
      "begin_line": 1146,
      "end_line": 1148,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.KeyVal()",
      "begin_line": 1150,
      "end_line": 1150,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.key(java.lang.String)",
      "begin_line": 1152,
      "end_line": 1156,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.key()",
      "begin_line": 1158,
      "end_line": 1160,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.value(java.lang.String)",
      "begin_line": 1162,
      "end_line": 1166,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.value()",
      "begin_line": 1168,
      "end_line": 1170,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.inputStream(java.io.InputStream)",
      "begin_line": 1172,
      "end_line": 1176,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.inputStream()",
      "begin_line": 1178,
      "end_line": 1180,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.hasInputStream()",
      "begin_line": 1182,
      "end_line": 1184,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.contentType(java.lang.String)",
      "begin_line": 1186,
      "end_line": 1191,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.contentType()",
      "begin_line": 1193,
      "end_line": 1196,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jsoup.helper.HttpConnection.KeyVal.toString()",
      "begin_line": 1198,
      "end_line": 1201,
      "comment": ""
    }
  ]
}