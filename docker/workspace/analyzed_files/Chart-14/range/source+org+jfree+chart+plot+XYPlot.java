{
  "filepath": "/tmp/Chart-14f/source/org/jfree/chart/plot/XYPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "org.jfree.chart.plot.ValueAxisPlot",
        "org.jfree.chart.plot.Zoomable",
        "org.jfree.chart.event.RendererChangeListener",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 277,
      "end_line": 5069,
      "comment": "\r\n * A general class for plotting data in the form of (x, y) pairs.  This plot can\r\n * use data from any class that implements the {@link XYDataset} interface.\r\n * \u003cP\u003e\r\n * \u003ccode\u003eXYPlot\u003c/code\u003e makes use of an {@link XYItemRenderer} to draw each point\r\n * on the plot.  By using different renderers, various chart types can be\r\n * produced.\r\n * \u003cp\u003e\r\n * The {@link org.jfree.chart.ChartFactory} class contains static methods for\r\n * creating pre-configured charts.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_STROKE"
      ],
      "begin_line": 284,
      "end_line": 286,
      "comment": " The default grid line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_PAINT"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": " The default grid line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_VISIBLE"
      ],
      "begin_line": 292,
      "end_line": 292,
      "comment": " The default crosshair visibility. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_STROKE"
      ],
      "begin_line": 295,
      "end_line": 296,
      "comment": " The default crosshair stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_PAINT"
      ],
      "begin_line": 299,
      "end_line": 299,
      "comment": " The default crosshair paint. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 302,
      "end_line": 304,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "orientation"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": " The plot orientation. "
    },
    {
      "type": "field",
      "varNames": [
        "axisOffset"
      ],
      "begin_line": 310,
      "end_line": 310,
      "comment": " The offset between the data area and the axes. "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxes"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": " The domain axis / axes (used for the x-values). "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxisLocations"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": " The domain axis locations. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxes"
      ],
      "begin_line": 319,
      "end_line": 319,
      "comment": " The range axis (used for the y-values). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxisLocations"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " The range axis location. "
    },
    {
      "type": "field",
      "varNames": [
        "datasets"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " Storage for the datasets. "
    },
    {
      "type": "field",
      "varNames": [
        "renderers"
      ],
      "begin_line": 328,
      "end_line": 328,
      "comment": " Storage for the renderers. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToDomainAxisMap"
      ],
      "begin_line": 335,
      "end_line": 335,
      "comment": "\r\n     * Storage for keys that map datasets/renderers to domain axes.  If the\r\n     * map contains no entry for a dataset, it is assumed to map to the\r\n     * primary domain axis (index \u003d 0).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToRangeAxisMap"
      ],
      "begin_line": 342,
      "end_line": 342,
      "comment": "\r\n     * Storage for keys that map datasets/renderers to range axes. If the\r\n     * map contains no entry for a dataset, it is assumed to map to the\r\n     * primary domain axis (index \u003d 0).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "quadrantOrigin"
      ],
      "begin_line": 345,
      "end_line": 345,
      "comment": " The origin point for the quadrants (if drawn). "
    },
    {
      "type": "field",
      "varNames": [
        "quadrantPaint"
      ],
      "begin_line": 348,
      "end_line": 349,
      "comment": " The paint used for each quadrant. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinesVisible"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": " A flag that controls whether the domain grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlineStroke"
      ],
      "begin_line": 355,
      "end_line": 355,
      "comment": " The stroke used to draw the domain grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinePaint"
      ],
      "begin_line": 358,
      "end_line": 358,
      "comment": " The paint used to draw the domain grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinesVisible"
      ],
      "begin_line": 361,
      "end_line": 361,
      "comment": " A flag that controls whether the range grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlineStroke"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": " The stroke used to draw the range grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinePaint"
      ],
      "begin_line": 367,
      "end_line": 367,
      "comment": " The paint used to draw the range grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "domainZeroBaselineVisible"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": " \r\n     * A flag that controls whether or not the zero baseline against the domain\r\n     * axis is visible.\r\n     * \r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainZeroBaselineStroke"
      ],
      "begin_line": 382,
      "end_line": 382,
      "comment": " \r\n     * The stroke used for the zero baseline against the domain axis. \r\n     * \r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainZeroBaselinePaint"
      ],
      "begin_line": 389,
      "end_line": 389,
      "comment": " \r\n     * The paint used for the zero baseline against the domain axis. \r\n     * \r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselineVisible"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": " \r\n     * A flag that controls whether or not the zero baseline against the range\r\n     * axis is visible.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselineStroke"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": " The stroke used for the zero baseline against the range axis. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselinePaint"
      ],
      "begin_line": 401,
      "end_line": 401,
      "comment": " The paint used for the zero baseline against the range axis. "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairVisible"
      ],
      "begin_line": 404,
      "end_line": 404,
      "comment": " A flag that controls whether or not a domain crosshair is drawn.."
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairValue"
      ],
      "begin_line": 407,
      "end_line": 407,
      "comment": " The domain crosshair value. "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairStroke"
      ],
      "begin_line": 410,
      "end_line": 410,
      "comment": " The pen/brush used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairPaint"
      ],
      "begin_line": 413,
      "end_line": 413,
      "comment": " The color used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairLockedOnData"
      ],
      "begin_line": 419,
      "end_line": 419,
      "comment": "\r\n     * A flag that controls whether or not the crosshair locks onto actual\r\n     * data points.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairVisible"
      ],
      "begin_line": 422,
      "end_line": 422,
      "comment": " A flag that controls whether or not a range crosshair is drawn.."
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairValue"
      ],
      "begin_line": 425,
      "end_line": 425,
      "comment": " The range crosshair value. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairStroke"
      ],
      "begin_line": 428,
      "end_line": 428,
      "comment": " The pen/brush used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairPaint"
      ],
      "begin_line": 431,
      "end_line": 431,
      "comment": " The color used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairLockedOnData"
      ],
      "begin_line": 437,
      "end_line": 437,
      "comment": "\r\n     * A flag that controls whether or not the crosshair locks onto actual\r\n     * data points.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundDomainMarkers"
      ],
      "begin_line": 440,
      "end_line": 440,
      "comment": " A map of lists of foreground markers (optional) for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundDomainMarkers"
      ],
      "begin_line": 443,
      "end_line": 443,
      "comment": " A map of lists of background markers (optional) for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundRangeMarkers"
      ],
      "begin_line": 446,
      "end_line": 446,
      "comment": " A map of lists of foreground markers (optional) for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundRangeMarkers"
      ],
      "begin_line": 449,
      "end_line": 449,
      "comment": " A map of lists of background markers (optional) for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "annotations"
      ],
      "begin_line": 456,
      "end_line": 456,
      "comment": " \r\n     * A (possibly empty) list of annotations for the plot.  The list should\r\n     * be initialised in the constructor and never allowed to be \r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainTickBandPaint"
      ],
      "begin_line": 459,
      "end_line": 459,
      "comment": " The paint used for the domain tick bands (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeTickBandPaint"
      ],
      "begin_line": 462,
      "end_line": 462,
      "comment": " The paint used for the range tick bands (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "fixedDomainAxisSpace"
      ],
      "begin_line": 465,
      "end_line": 465,
      "comment": " The fixed domain axis space. "
    },
    {
      "type": "field",
      "varNames": [
        "fixedRangeAxisSpace"
      ],
      "begin_line": 468,
      "end_line": 468,
      "comment": " The fixed range axis space. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetRenderingOrder"
      ],
      "begin_line": 474,
      "end_line": 475,
      "comment": "\r\n     * The order of the dataset rendering (REVERSE draws the primary dataset\r\n     * last so that it appears to be on top).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesRenderingOrder"
      ],
      "begin_line": 481,
      "end_line": 482,
      "comment": "\r\n     * The order of the series rendering (REVERSE draws the primary series\r\n     * last so that it appears to be on top).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 488,
      "end_line": 488,
      "comment": "\r\n     * The weight for this plot (only relevant if this is a subplot in a\r\n     * combined plot).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fixedLegendItems"
      ],
      "begin_line": 494,
      "end_line": 494,
      "comment": "\r\n     * An optional collection of legend items that can be returned by the\r\n     * getLegendItems() method.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.XYPlot.XYPlot()",
      "begin_line": 500,
      "end_line": 502,
      "comment": "\r\n     * Creates a new \u003ccode\u003eXYPlot\u003c/code\u003e instance with no dataset, no axes and\r\n     * no renderer.  You should specify these items before using the plot.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.XYPlot.XYPlot(org.jfree.data.xy.XYDataset, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 515,
      "end_line": 601,
      "comment": "\r\n     * Creates a new plot with the specified dataset, axes and renderer.  Any\r\n     * of the arguments can be \u003ccode\u003enull\u003c/code\u003e, but in that case you should\r\n     * take care to specify the value before using the plot (otherwise a\r\n     * \u003ccode\u003eNullPointerException\u003c/code\u003e may be thrown).\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param domainAxis  the domain axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rangeAxis  the range axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getPlotType()",
      "begin_line": 608,
      "end_line": 610,
      "comment": "\r\n     * Returns the plot type as a string.\r\n     *\r\n     * @return A short string describing the type of plot.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getOrientation()",
      "begin_line": 619,
      "end_line": 621,
      "comment": "\r\n     * Returns the orientation of the plot.\r\n     *\r\n     * @return The orientation (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setOrientation(PlotOrientation)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 631,
      "end_line": 639,
      "comment": "\r\n     * Sets the orientation for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not allowed).\r\n     * \r\n     * @see #getOrientation()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getAxisOffset()",
      "begin_line": 648,
      "end_line": 650,
      "comment": "\r\n     * Returns the axis offset.\r\n     *\r\n     * @return The axis offset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setAxisOffset(RectangleInsets)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setAxisOffset(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 660,
      "end_line": 666,
      "comment": "\r\n     * Sets the axis offsets (gap between the data area and the axes) and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param offset  the offset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getAxisOffset()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxis()",
      "begin_line": 678,
      "end_line": 680,
      "comment": "\r\n     * Returns the domain axis with index 0.  If the domain axis for this plot\r\n     * is \u003ccode\u003enull\u003c/code\u003e, then the method will return the parent plot\u0027s \r\n     * domain axis (if there is a parent plot).\r\n     *\r\n     * @return The domain axis (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getDomainAxis(int)\r\n     * @see #setDomainAxis(ValueAxis)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxis(int)",
      "begin_line": 691,
      "end_line": 704,
      "comment": "\r\n     * Returns the domain axis with the specified index, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     * \r\n     * @see #setDomainAxis(int, ValueAxis)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 715,
      "end_line": 717,
      "comment": "\r\n     * Sets the domain axis for the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param axis  the new axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDomainAxis()\r\n     * @see #setDomainAxis(int, ValueAxis)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxis(int, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 729,
      "end_line": 731,
      "comment": "\r\n     * Sets a domain axis and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDomainAxis(int)\r\n     * @see #setRangeAxis(int, ValueAxis)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxis(int, org.jfree.chart.axis.ValueAxis, boolean)",
      "begin_line": 743,
      "end_line": 759,
      "comment": "\r\n     * Sets a domain axis and, if requested, sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getDomainAxis(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxes(org.jfree.chart.axis.ValueAxis[])",
      "begin_line": 769,
      "end_line": 774,
      "comment": "\r\n     * Sets the domain axes for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param axes  the axes (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #setRangeAxes(ValueAxis[])\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisLocation()",
      "begin_line": 783,
      "end_line": 785,
      "comment": "\r\n     * Returns the location of the primary domain axis.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainAxisLocation(AxisLocation)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 795,
      "end_line": 798,
      "comment": "\r\n     * Sets the location of the primary domain axis and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDomainAxisLocation()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 809,
      "end_line": 812,
      "comment": "\r\n     * Sets the location of the domain axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getDomainAxisLocation()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisEdge()",
      "begin_line": 823,
      "end_line": 826,
      "comment": "\r\n     * Returns the edge for the primary domain axis (taking into account the\r\n     * plot\u0027s orientation).\r\n     *\r\n     * @return The edge.\r\n     * \r\n     * @see #getDomainAxisLocation()\r\n     * @see #getOrientation()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisCount()",
      "begin_line": 835,
      "end_line": 837,
      "comment": "\r\n     * Returns the number of domain axes.\r\n     *\r\n     * @return The axis count.\r\n     * \r\n     * @see #getRangeAxisCount()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearDomainAxes()",
      "begin_line": 845,
      "end_line": 854,
      "comment": "\r\n     * Clears the domain axes from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @see #clearRangeAxes()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.configureDomainAxes()",
      "begin_line": 859,
      "end_line": 866,
      "comment": "\r\n     * Configures the domain axes. \r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisLocation(int)",
      "begin_line": 879,
      "end_line": 888,
      "comment": "\r\n     * Returns the location for a domain axis.  If this hasn\u0027t been set\r\n     * explicitly, the method returns the location that is opposite to the\r\n     * primary domain axis location.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainAxisLocation(int, AxisLocation)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation)",
      "begin_line": 900,
      "end_line": 903,
      "comment": "\r\n     * Sets the location for a domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted for index\r\n     *     0).\r\n     * \r\n     * @see #getDomainAxisLocation(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 919,
      "end_line": 930,
      "comment": "\r\n     * Sets the axis location for a domain axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted for \r\n     *     index 0).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #getDomainAxisLocation(int)\r\n     * @see #setRangeAxisLocation(int, AxisLocation, boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisEdge(int)",
      "begin_line": 941,
      "end_line": 949,
      "comment": "\r\n     * Returns the edge for a domain axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The edge.\r\n     * \r\n     * @see #getRangeAxisEdge(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxis()",
      "begin_line": 961,
      "end_line": 963,
      "comment": "\r\n     * Returns the range axis for the plot.  If the range axis for this plot is\r\n     * \u003ccode\u003enull\u003c/code\u003e, then the method will return the parent plot\u0027s range \r\n     * axis (if there is a parent plot).\r\n     *\r\n     * @return The range axis.\r\n     * \r\n     * @see #getRangeAxis(int)\r\n     * @see #setRangeAxis(ValueAxis)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 974,
      "end_line": 993,
      "comment": "\r\n     * Sets the range axis for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRangeAxis()\r\n     * @see #setRangeAxis(int, ValueAxis)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisLocation()",
      "begin_line": 1002,
      "end_line": 1004,
      "comment": "\r\n     * Returns the location of the primary range axis.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeAxisLocation(AxisLocation)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1014,
      "end_line": 1017,
      "comment": "\r\n     * Sets the location of the primary range axis and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeAxisLocation()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1028,
      "end_line": 1031,
      "comment": "\r\n     * Sets the location of the primary range axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getRangeAxisLocation()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisEdge()",
      "begin_line": 1041,
      "end_line": 1044,
      "comment": "\r\n     * Returns the edge for the primary range axis.\r\n     *\r\n     * @return The range axis edge.\r\n     * \r\n     * @see #getRangeAxisLocation()\r\n     * @see #getOrientation()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxis(int)",
      "begin_line": 1055,
      "end_line": 1068,
      "comment": "\r\n     * Returns a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     * \r\n     * @see #setRangeAxis(int, ValueAxis)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxis(int, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 1079,
      "end_line": 1081,
      "comment": "\r\n     * Sets a range axis and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRangeAxis(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxis(int, org.jfree.chart.axis.ValueAxis, boolean)",
      "begin_line": 1093,
      "end_line": 1109,
      "comment": "\r\n     * Sets a range axis and, if requested, sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getRangeAxis(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxes(org.jfree.chart.axis.ValueAxis[])",
      "begin_line": 1119,
      "end_line": 1124,
      "comment": "\r\n     * Sets the range axes for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param axes  the axes (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #setDomainAxes(ValueAxis[])\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisCount()",
      "begin_line": 1133,
      "end_line": 1135,
      "comment": "\r\n     * Returns the number of range axes.\r\n     *\r\n     * @return The axis count.\r\n     * \r\n     * @see #getDomainAxisCount()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearRangeAxes()",
      "begin_line": 1143,
      "end_line": 1152,
      "comment": "\r\n     * Clears the range axes from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @see #clearDomainAxes()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.configureRangeAxes()",
      "begin_line": 1159,
      "end_line": 1166,
      "comment": "\r\n     * Configures the range axes.\r\n     * \r\n     * @see #configureDomainAxes()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisLocation(int)",
      "begin_line": 1179,
      "end_line": 1188,
      "comment": "\r\n     * Returns the location for a range axis.  If this hasn\u0027t been set\r\n     * explicitly, the method returns the location that is opposite to the\r\n     * primary range axis location.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeAxisLocation(int, AxisLocation)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1199,
      "end_line": 1202,
      "comment": "\r\n     * Sets the location for a range axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRangeAxisLocation(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1218,
      "end_line": 1229,
      "comment": "\r\n     * Sets the axis location for a domain axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted for \r\n     *     index 0).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #getRangeAxisLocation(int)\r\n     * @see #setDomainAxisLocation(int, AxisLocation, boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisEdge(int)",
      "begin_line": 1241,
      "end_line": 1249,
      "comment": "\r\n     * Returns the edge for a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The edge.\r\n     * \r\n     * @see #getRangeAxisLocation(int)\r\n     * @see #getOrientation()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDataset()",
      "begin_line": 1259,
      "end_line": 1261,
      "comment": "\r\n     * Returns the primary dataset for the plot.\r\n     *\r\n     * @return The primary dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getDataset(int)\r\n     * @see #setDataset(XYDataset)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDataset(int)",
      "begin_line": 1272,
      "end_line": 1278,
      "comment": "\r\n     * Returns a dataset.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDataset(int, XYDataset)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDataset(org.jfree.data.xy.XYDataset)",
      "begin_line": 1289,
      "end_line": 1291,
      "comment": "\r\n     * Sets the primary dataset for the plot, replacing the existing dataset if\r\n     * there is one.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDataset()\r\n     * @see #setDataset(int, XYDataset)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDataset(int, org.jfree.data.xy.XYDataset)",
      "begin_line": 1301,
      "end_line": 1314,
      "comment": "\r\n     * Sets a dataset for the plot.\r\n     *\r\n     * @param index  the dataset index.\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDataset(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetCount()",
      "begin_line": 1321,
      "end_line": 1323,
      "comment": "\r\n     * Returns the number of datasets.\r\n     *\r\n     * @return The number of datasets.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.indexOf(org.jfree.data.xy.XYDataset)",
      "begin_line": 1333,
      "end_line": 1342,
      "comment": "\r\n     * Returns the index of the specified dataset, or \u003ccode\u003e-1\u003c/code\u003e if the\r\n     * dataset does not belong to the plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxis(int, int)",
      "begin_line": 1353,
      "end_line": 1358,
      "comment": "\r\n     * Maps a dataset to a particular domain axis.  All data will be plotted\r\n     * against axis zero by default, no mapping is required for this case.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndex  the axis index.\r\n     * \r\n     * @see #mapDatasetToRangeAxis(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxis(int, int)",
      "begin_line": 1369,
      "end_line": 1374,
      "comment": "\r\n     * Maps a dataset to a particular range axis.  All data will be plotted\r\n     * against axis zero by default, no mapping is required for this case.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndex  the axis index.\r\n     * \r\n     * @see #mapDatasetToDomainAxis(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRenderer()",
      "begin_line": 1383,
      "end_line": 1385,
      "comment": "\r\n     * Returns the renderer for the primary dataset.\r\n     *\r\n     * @return The item renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRenderer(XYItemRenderer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRenderer(int)",
      "begin_line": 1396,
      "end_line": 1403,
      "comment": "\r\n     * Returns the renderer for a dataset, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param index  the renderer index.\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRenderer(int, XYItemRenderer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderer(org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 1414,
      "end_line": 1416,
      "comment": "\r\n     * Sets the renderer for the primary dataset and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  If the renderer\r\n     * is set to \u003ccode\u003enull\u003c/code\u003e, no data will be displayed.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRenderer()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderer(int, org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 1427,
      "end_line": 1429,
      "comment": "\r\n     * Sets a renderer and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param renderer  the renderer.\r\n     * \r\n     * @see #getRenderer(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderer(int, org.jfree.chart.renderer.xy.XYItemRenderer, boolean)",
      "begin_line": 1441,
      "end_line": 1457,
      "comment": "\r\n     * Sets a renderer and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param renderer  the renderer.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getRenderer(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderers(org.jfree.chart.renderer.xy.XYItemRenderer[])",
      "begin_line": 1465,
      "end_line": 1470,
      "comment": "\r\n     * Sets the renderers for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \r\n     * @param renderers  the renderers (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetRenderingOrder()",
      "begin_line": 1479,
      "end_line": 1481,
      "comment": "\r\n     * Returns the dataset rendering order.\r\n     *\r\n     * @return The order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDatasetRenderingOrder(DatasetRenderingOrder)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)",
      "begin_line": 1493,
      "end_line": 1499,
      "comment": "\r\n     * Sets the rendering order and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.  By default, the plot renders the primary dataset\r\n     * last (so that the primary dataset overlays the secondary datasets).\r\n     * You can reverse this if you want to.\r\n     *\r\n     * @param order  the rendering order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDatasetRenderingOrder()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getSeriesRenderingOrder()",
      "begin_line": 1508,
      "end_line": 1510,
      "comment": "\r\n     * Returns the series rendering order.\r\n     *\r\n     * @return the order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setSeriesRenderingOrder(SeriesRenderingOrder)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setSeriesRenderingOrder(org.jfree.chart.plot.SeriesRenderingOrder)",
      "begin_line": 1522,
      "end_line": 1528,
      "comment": "\r\n     * Sets the series order and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.  By default, the plot renders the primary series\r\n     * last (so that the primary series appears to be on top).\r\n     * You can reverse this if you want to.\r\n     *\r\n     * @param order  the rendering order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getSeriesRenderingOrder()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getIndexOf(org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 1538,
      "end_line": 1540,
      "comment": "\r\n     * Returns the index of the specified renderer, or \u003ccode\u003e-1\u003c/code\u003e if the\r\n     * renderer is not assigned to this plot.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The renderer index.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRendererForDataset(org.jfree.data.xy.XYDataset)",
      "begin_line": 1551,
      "end_line": 1563,
      "comment": "\r\n     * Returns the renderer for the specified dataset.  The code first\r\n     * determines the index of the dataset, then checks if there is a\r\n     * renderer with the same index (if not, the method returns renderer(0).\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getWeight()",
      "begin_line": 1573,
      "end_line": 1575,
      "comment": "\r\n     * Returns the weight for this plot when it is used as a subplot within a\r\n     * combined plot.\r\n     *\r\n     * @return The weight.\r\n     * \r\n     * @see #setWeight(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setWeight(int)",
      "begin_line": 1585,
      "end_line": 1588,
      "comment": "\r\n     * Sets the weight for the plot and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param weight  the weight.\r\n     * \r\n     * @see #getWeight()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainGridlinesVisible()",
      "begin_line": 1598,
      "end_line": 1600,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the domain gridlines are visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     * \r\n     * @see #setDomainGridlinesVisible(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainGridlinesVisible(boolean)",
      "begin_line": 1613,
      "end_line": 1618,
      "comment": "\r\n     * Sets the flag that controls whether or not the domain grid-lines are\r\n     * visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     * \r\n     * @see #isDomainGridlinesVisible()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainGridlineStroke()",
      "begin_line": 1628,
      "end_line": 1630,
      "comment": "\r\n     * Returns the stroke for the grid-lines (if any) plotted against the\r\n     * domain axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainGridlineStroke(Stroke)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainGridlineStroke(java.awt.Stroke)",
      "begin_line": 1645,
      "end_line": 1651,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the domain axis, and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cp\u003e\r\n     * If you set this to \u003ccode\u003enull\u003c/code\u003e, no grid lines will be drawn.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003estroke\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #getDomainGridlineStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainGridlinePaint()",
      "begin_line": 1661,
      "end_line": 1663,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the domain\r\n     * axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainGridlinePaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainGridlinePaint(java.awt.Paint)",
      "begin_line": 1676,
      "end_line": 1682,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the domain axis, and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @throws IllegalArgumentException if \u003ccode\u003epaint\u003c/code\u003e is \r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     * \r\n     * @see #getDomainGridlinePaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeGridlinesVisible()",
      "begin_line": 1692,
      "end_line": 1694,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the range axis grid is visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #setRangeGridlinesVisible(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeGridlinesVisible(boolean)",
      "begin_line": 1707,
      "end_line": 1712,
      "comment": "\r\n     * Sets the flag that controls whether or not the range axis grid lines\r\n     * are visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     * \r\n     * @see #isRangeGridlinesVisible()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeGridlineStroke()",
      "begin_line": 1722,
      "end_line": 1724,
      "comment": "\r\n     * Returns the stroke for the grid lines (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeGridlineStroke(Stroke)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeGridlineStroke(java.awt.Stroke)",
      "begin_line": 1734,
      "end_line": 1740,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the range axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeGridlineStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeGridlinePaint()",
      "begin_line": 1750,
      "end_line": 1752,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the range\r\n     * axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeGridlinePaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeGridlinePaint(java.awt.Paint)",
      "begin_line": 1762,
      "end_line": 1768,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeGridlinePaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainZeroBaselineVisible()",
      "begin_line": 1780,
      "end_line": 1782,
      "comment": "\r\n     * Returns a flag that controls whether or not a zero baseline is\r\n     * displayed for the domain axis.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #setDomainZeroBaselineVisible(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainZeroBaselineVisible(boolean)",
      "begin_line": 1795,
      "end_line": 1798,
      "comment": "\r\n     * Sets the flag that controls whether or not the zero baseline is\r\n     * displayed for the domain axis, and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #isDomainZeroBaselineVisible()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainZeroBaselineStroke()",
      "begin_line": 1809,
      "end_line": 1811,
      "comment": "\r\n     * Returns the stroke used for the zero baseline against the domain axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #setDomainZeroBaselineStroke(Stroke)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainZeroBaselineStroke(java.awt.Stroke)",
      "begin_line": 1823,
      "end_line": 1829,
      "comment": "\r\n     * Sets the stroke for the zero baseline for the domain axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #getRangeZeroBaselineStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainZeroBaselinePaint()",
      "begin_line": 1841,
      "end_line": 1843,
      "comment": "\r\n     * Returns the paint for the zero baseline (if any) plotted against the\r\n     * domain axis.\r\n     * \r\n     * @since 1.0.5\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainZeroBaselinePaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainZeroBaselinePaint(java.awt.Paint)",
      "begin_line": 1855,
      "end_line": 1861,
      "comment": "\r\n     * Sets the paint for the zero baseline plotted against the domain axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @since 1.0.5\r\n     * \r\n     * @see #getDomainZeroBaselinePaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeZeroBaselineVisible()",
      "begin_line": 1871,
      "end_line": 1873,
      "comment": "\r\n     * Returns a flag that controls whether or not a zero baseline is\r\n     * displayed for the range axis.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #setRangeZeroBaselineVisible(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeZeroBaselineVisible(boolean)",
      "begin_line": 1884,
      "end_line": 1887,
      "comment": "\r\n     * Sets the flag that controls whether or not the zero baseline is\r\n     * displayed for the range axis, and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     * \r\n     * @see #isRangeZeroBaselineVisible()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeZeroBaselineStroke()",
      "begin_line": 1896,
      "end_line": 1898,
      "comment": "\r\n     * Returns the stroke used for the zero baseline against the range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeZeroBaselineStroke(Stroke)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeZeroBaselineStroke(java.awt.Stroke)",
      "begin_line": 1908,
      "end_line": 1914,
      "comment": "\r\n     * Sets the stroke for the zero baseline for the range axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeZeroBaselineStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeZeroBaselinePaint()",
      "begin_line": 1924,
      "end_line": 1926,
      "comment": "\r\n     * Returns the paint for the zero baseline (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeZeroBaselinePaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeZeroBaselinePaint(java.awt.Paint)",
      "begin_line": 1936,
      "end_line": 1942,
      "comment": "\r\n     * Sets the paint for the zero baseline plotted against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeZeroBaselinePaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainTickBandPaint()",
      "begin_line": 1952,
      "end_line": 1954,
      "comment": "\r\n     * Returns the paint used for the domain tick bands.  If this is\r\n     * \u003ccode\u003enull\u003c/code\u003e, no tick bands will be drawn.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainTickBandPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainTickBandPaint(java.awt.Paint)",
      "begin_line": 1963,
      "end_line": 1966,
      "comment": "\r\n     * Sets the paint for the domain tick bands.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getDomainTickBandPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeTickBandPaint()",
      "begin_line": 1976,
      "end_line": 1978,
      "comment": "\r\n     * Returns the paint used for the range tick bands.  If this is\r\n     * \u003ccode\u003enull\u003c/code\u003e, no tick bands will be drawn.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeTickBandPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeTickBandPaint(java.awt.Paint)",
      "begin_line": 1987,
      "end_line": 1990,
      "comment": "\r\n     * Sets the paint for the range tick bands.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getRangeTickBandPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getQuadrantOrigin()",
      "begin_line": 2000,
      "end_line": 2002,
      "comment": "\r\n     * Returns the origin for the quadrants that can be displayed on the plot.\r\n     * This defaults to (0, 0).\r\n     *\r\n     * @return The origin point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setQuadrantOrigin(Point2D)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setQuadrantOrigin(java.awt.geom.Point2D)",
      "begin_line": 2012,
      "end_line": 2018,
      "comment": "\r\n     * Sets the quadrant origin and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param origin  the origin (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getQuadrantOrigin()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getQuadrantPaint(int)",
      "begin_line": 2029,
      "end_line": 2035,
      "comment": "\r\n     * Returns the paint used for the specified quadrant.\r\n     *\r\n     * @param index  the quadrant index (0-3).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setQuadrantPaint(int, Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setQuadrantPaint(int, java.awt.Paint)",
      "begin_line": 2046,
      "end_line": 2053,
      "comment": "\r\n     * Sets the paint used for the specified quadrant and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the quadrant index (0-3).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getQuadrantPaint(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2067,
      "end_line": 2070,
      "comment": "\r\n     * Adds a marker for the domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #addDomainMarker(Marker, Layer)\r\n     * @see #clearDomainMarkers()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2084,
      "end_line": 2086,
      "comment": "\r\n     * Adds a marker for the domain axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @see #addDomainMarker(int, Marker, Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearDomainMarkers()",
      "begin_line": 2094,
      "end_line": 2114,
      "comment": "\r\n     * Clears all the (foreground and background) domain markers and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \r\n     * @see #addDomainMarker(int, Marker, Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearDomainMarkers(int)",
      "begin_line": 2124,
      "end_line": 2151,
      "comment": "\r\n     * Clears the (foreground and background) domain markers for a particular\r\n     * renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * \r\n     * @see #clearRangeMarkers(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2168,
      "end_line": 2170,
      "comment": "\r\n     * Adds a marker for a specific dataset/renderer and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the domain axis (that the renderer is mapped to), however this is\r\n     * entirely up to the renderer.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @see #clearDomainMarkers(int)\r\n     * @see #addRangeMarker(int, Marker, Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2187,
      "end_line": 2218,
      "comment": "\r\n     * Adds a marker for a specific dataset/renderer and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the domain axis (that the renderer is mapped to), however this is\r\n     * entirely up to the renderer.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2231,
      "end_line": 2233,
      "comment": "\r\n     * Removes a marker for the domain axis and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param marker  the marker.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2247,
      "end_line": 2249,
      "comment": "\r\n     * Removes a marker for the domain axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param marker the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2264,
      "end_line": 2266,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2282,
      "end_line": 2301,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and, if requested, \r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2314,
      "end_line": 2316,
      "comment": "\r\n     * Adds a marker for the range axis and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #addRangeMarker(Marker, Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2330,
      "end_line": 2332,
      "comment": "\r\n     * Adds a marker for the range axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @see #addRangeMarker(int, Marker, Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearRangeMarkers()",
      "begin_line": 2340,
      "end_line": 2360,
      "comment": "\r\n     * Clears all the range markers and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @see #clearRangeMarkers()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2376,
      "end_line": 2378,
      "comment": "\r\n     * Adds a marker for a specific dataset/renderer and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * \r\n     * @see #clearRangeMarkers(int)\r\n     * @see #addDomainMarker(int, Marker, Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2394,
      "end_line": 2419,
      "comment": "\r\n     * Adds a marker for a specific dataset/renderer and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearRangeMarkers(int)",
      "begin_line": 2427,
      "end_line": 2454,
      "comment": "\r\n     * Clears the (foreground and background) range markers for a particular\r\n     * renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2467,
      "end_line": 2469,
      "comment": "\r\n     * Removes a marker for the range axis and sends a {@link PlotChangeEvent} \r\n     * to all registered listeners.\r\n     *\r\n     * @param marker the marker.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2483,
      "end_line": 2485,
      "comment": "\r\n     * Removes a marker for the range axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param marker the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2500,
      "end_line": 2502,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2518,
      "end_line": 2540,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually \r\n     *         removed.\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 2551,
      "end_line": 2553,
      "comment": "\r\n     * Adds an annotation to the plot and sends a {@link PlotChangeEvent} to \r\n     * all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getAnnotations()\r\n     * @see #removeAnnotation(XYAnnotation)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addAnnotation(org.jfree.chart.annotations.XYAnnotation, boolean)",
      "begin_line": 2564,
      "end_line": 2572,
      "comment": "\r\n     * Adds an annotation to the plot and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 2585,
      "end_line": 2587,
      "comment": "\r\n     * Removes an annotation from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A boolean (indicates whether or not the annotation was removed).\r\n     * \r\n     * @see #addAnnotation(XYAnnotation)\r\n     * @see #getAnnotations()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeAnnotation(org.jfree.chart.annotations.XYAnnotation, boolean)",
      "begin_line": 2600,
      "end_line": 2609,
      "comment": "\r\n     * Removes an annotation from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @return A boolean (indicates whether or not the annotation was removed).\r\n     * \r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getAnnotations()",
      "begin_line": 2620,
      "end_line": 2622,
      "comment": "\r\n     * Returns the list of annotations.\r\n     *\r\n     * @return The list of annotations.\r\n     * \r\n     * @since 1.0.1\r\n     * \r\n     * @see #addAnnotation(XYAnnotation)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearAnnotations()",
      "begin_line": 2630,
      "end_line": 2633,
      "comment": "\r\n     * Clears all the annotations and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     * \r\n     * @see #addAnnotation(XYAnnotation)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 2643,
      "end_line": 2649,
      "comment": "\r\n     * Calculates the space required for all the axes in the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     *\r\n     * @return The required space.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.calculateDomainAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 2660,
      "end_line": 2696,
      "comment": "\r\n     * Calculates the space required for the domain axis/axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param space  a carrier for the result (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The required space.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 2707,
      "end_line": 2742,
      "comment": "\r\n     * Calculates the space required for the range axis/axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param space  a carrier for the result (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The required space.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 2756,
      "end_line": 3012,
      "comment": "\r\n     * Draws the plot within the specified area on a graphics device.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area (in Java2D space).\r\n     * @param anchor  an anchor point in Java2D space (\u003ccode\u003enull\u003c/code\u003e\r\n     *                permitted).\r\n     * @param parentState  the state from the parent plot, if there is one\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param info  collects chart drawing information (\u003ccode\u003enull\u003c/code\u003e\r\n     *              permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3020,
      "end_line": 3024,
      "comment": "\r\n     * Draws the background for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawQuadrants(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3035,
      "end_line": 3135,
      "comment": "\r\n     * Draws the quadrants.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     * \r\n     * @see #setQuadrantOrigin(Point2D)\r\n     * @see #setQuadrantPaint(int, Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainTickBands(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3146,
      "end_line": 3170,
      "comment": "\r\n     * Draws the domain tick bands, if any.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     * \r\n     * @see #setDomainTickBandPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeTickBands(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3181,
      "end_line": 3205,
      "comment": "\r\n     * Draws the range tick bands, if any.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     * \r\n     * @see #setRangeTickBandPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawAxes(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3218,
      "end_line": 3292,
      "comment": "\r\n     * A utility method for drawing the axes.\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotArea  the plot area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the data area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   permitted).\r\n     *\r\n     * @return A map containing the state for each axis drawn.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.CrosshairState)",
      "begin_line": 3310,
      "end_line": 3384,
      "comment": "\r\n     * Draws a representation of the data within the dataArea region, using the\r\n     * current renderer.\r\n     * \u003cP\u003e\r\n     * The \u003ccode\u003einfo\u003c/code\u003e and \u003ccode\u003ecrosshairState\u003c/code\u003e arguments may be\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the region in which the data is to be drawn.\r\n     * @param index  the dataset index.\r\n     * @param info  an optional object for collection dimension information.\r\n     * @param crosshairState  collects crosshair information\r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A flag that indicates whether any data was actually rendered.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisForDataset(int)",
      "begin_line": 3393,
      "end_line": 3411,
      "comment": "\r\n     * Returns the domain axis for a dataset.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The axis.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisForDataset(int)",
      "begin_line": 3420,
      "end_line": 3438,
      "comment": "\r\n     * Returns the range axis for a dataset.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The axis.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3449,
      "end_line": 3468,
      "comment": "\r\n     * Draws the gridlines for the plot, if they are visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     * \r\n     * @see #drawRangeGridlines(Graphics2D, Rectangle2D, List)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3480,
      "end_line": 3505,
      "comment": "\r\n     * Draws the gridlines for the plot\u0027s primary range axis, if they are\r\n     * visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the data area.\r\n     * @param ticks  the ticks.\r\n     * \r\n     * @see #drawDomainGridlines(Graphics2D, Rectangle2D, List)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3517,
      "end_line": 3524,
      "comment": "\r\n     * Draws a base line across the chart at value zero on the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the data area.\r\n     * \r\n     * @see #setDomainZeroBaselineVisible(boolean)\r\n     * \r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawZeroRangeBaseline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3534,
      "end_line": 3539,
      "comment": "\r\n     * Draws a base line across the chart at value zero on the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the data area.\r\n     * \r\n     * @see #setRangeZeroBaselineVisible(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3548,
      "end_line": 3560,
      "comment": "\r\n     * Draws the annotations for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param info  the chart rendering info.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)",
      "begin_line": 3571,
      "end_line": 3593,
      "comment": "\r\n     * Draws the domain markers (if any) for an axis and layer.  This method is\r\n     * typically called from within the draw() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer (foreground or background).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)",
      "begin_line": 3604,
      "end_line": 3625,
      "comment": "\r\n     * Draws the range markers (if any) for a renderer and layer.  This method\r\n     * is typically called from within the draw() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer (foreground or background).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainMarkers(org.jfree.chart.util.Layer)",
      "begin_line": 3636,
      "end_line": 3638,
      "comment": "\r\n     * Returns the list of domain markers (read only) for the specified layer.\r\n     *\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @return The list of domain markers.\r\n     * \r\n     * @see #getRangeMarkers(Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeMarkers(org.jfree.chart.util.Layer)",
      "begin_line": 3649,
      "end_line": 3651,
      "comment": "\r\n     * Returns the list of range markers (read only) for the specified layer.\r\n     *\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @return The list of range markers.\r\n     * \r\n     * @see #getDomainMarkers(Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainMarkers(int, org.jfree.chart.util.Layer)",
      "begin_line": 3664,
      "end_line": 3677,
      "comment": "\r\n     * Returns a collection of domain markers for a particular renderer and\r\n     * layer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer.\r\n     *\r\n     * @return A collection of markers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getRangeMarkers(int, Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeMarkers(int, org.jfree.chart.util.Layer)",
      "begin_line": 3690,
      "end_line": 3703,
      "comment": "\r\n     * Returns a collection of range markers for a particular renderer and\r\n     * layer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer.\r\n     *\r\n     * @return A collection of markers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #getDomainMarkers(int, Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawHorizontalLine(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 3715,
      "end_line": 3732,
      "comment": "\r\n     * Utility method for drawing a horizontal line across the data area of the\r\n     * plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param value  the coordinate, where to draw the line.\r\n     * @param stroke  the stroke to use.\r\n     * @param paint  the paint to use.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 3747,
      "end_line": 3770,
      "comment": "\r\n     * Draws a domain crosshair.\r\n     * \r\n     * @param g2  the graphics target.\r\n     * @param dataArea  the data area.\r\n     * @param orientation  the plot orientation.\r\n     * @param value  the crosshair value.\r\n     * @param axis  the axis against which the value is measured.\r\n     * @param stroke  the stroke used to draw the crosshair line.\r\n     * @param paint  the paint used to draw the crosshair line.\r\n     * \r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawVerticalLine(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 3781,
      "end_line": 3798,
      "comment": "\r\n     * Utility method for drawing a vertical line on the data area of the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param value  the coordinate, where to draw the line.\r\n     * @param stroke  the stroke to use.\r\n     * @param paint  the paint to use.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 3813,
      "end_line": 3836,
      "comment": "\r\n     * Draws a range crosshair.\r\n     * \r\n     * @param g2  the graphics target.\r\n     * @param dataArea  the data area.\r\n     * @param orientation  the plot orientation.\r\n     * @param value  the crosshair value.\r\n     * @param axis  the axis against which the value is measured.\r\n     * @param stroke  the stroke used to draw the crosshair line.\r\n     * @param paint  the paint used to draw the crosshair line.\r\n     * \r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3845,
      "end_line": 3865,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot by updating the anchor values.\r\n     *\r\n     * @param x  the x-coordinate, where the click occurred, in Java2D space.\r\n     * @param y  the y-coordinate, where the click occurred, in Java2D space.\r\n     * @param info  object containing information about the plot dimensions.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetsMappedToDomainAxis(java.lang.Integer)",
      "begin_line": 3875,
      "end_line": 3895,
      "comment": "\r\n     * A utility method that returns a list of datasets that are mapped to a\r\n     * particular axis.\r\n     *\r\n     * @param axisIndex  the axis index (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A list of datasets.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetsMappedToRangeAxis(java.lang.Integer)",
      "begin_line": 3905,
      "end_line": 3925,
      "comment": "\r\n     * A utility method that returns a list of datasets that are mapped to a\r\n     * particular axis.\r\n     *\r\n     * @param axisIndex  the axis index (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A list of datasets.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisIndex(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 3936,
      "end_line": 3947,
      "comment": "\r\n     * Returns the index of the given domain axis.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The axis index.\r\n     * \r\n     * @see #getRangeAxisIndex(ValueAxis)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 3958,
      "end_line": 3969,
      "comment": "\r\n     * Returns the index of the given range axis.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The axis index.\r\n     * \r\n     * @see #getDomainAxisIndex(ValueAxis)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 3978,
      "end_line": 4029,
      "comment": "\r\n     * Returns the range for the specified axis.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The range.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 4038,
      "end_line": 4049,
      "comment": "\r\n     * Receives notification of a change to the plot\u0027s dataset.\r\n     * \u003cP\u003e\r\n     * The axis ranges are updated if necessary.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.rendererChanged(org.jfree.chart.event.RendererChangeEvent)",
      "begin_line": 4056,
      "end_line": 4058,
      "comment": "\r\n     * Receives notification of a renderer change event.\r\n     *\r\n     * @param event  the event.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainCrosshairVisible()",
      "begin_line": 4067,
      "end_line": 4069,
      "comment": "\r\n     * Returns a flag indicating whether or not the domain crosshair is visible.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setDomainCrosshairVisible(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairVisible(boolean)",
      "begin_line": 4080,
      "end_line": 4085,
      "comment": "\r\n     * Sets the flag indicating whether or not the domain crosshair is visible \r\n     * and, if the flag changes, sends a {@link PlotChangeEvent} to all \r\n     * registered listeners.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     * \r\n     * @see #isDomainCrosshairVisible()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainCrosshairLockedOnData()",
      "begin_line": 4095,
      "end_line": 4097,
      "comment": "\r\n     * Returns a flag indicating whether or not the crosshair should \"lock-on\"\r\n     * to actual data values.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setDomainCrosshairLockedOnData(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairLockedOnData(boolean)",
      "begin_line": 4108,
      "end_line": 4113,
      "comment": "\r\n     * Sets the flag indicating whether or not the domain crosshair should\r\n     * \"lock-on\" to actual data values.  If the flag value changes, this\r\n     * method sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #isDomainCrosshairLockedOnData()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainCrosshairValue()",
      "begin_line": 4122,
      "end_line": 4124,
      "comment": "\r\n     * Returns the domain crosshair value.\r\n     *\r\n     * @return The value.\r\n     * \r\n     * @see #setDomainCrosshairValue(double)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairValue(double)",
      "begin_line": 4134,
      "end_line": 4136,
      "comment": "\r\n     * Sets the domain crosshair value and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners (provided that the domain crosshair is visible).\r\n     *\r\n     * @param value  the value.\r\n     * \r\n     * @see #getDomainCrosshairValue()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairValue(double, boolean)",
      "begin_line": 4148,
      "end_line": 4153,
      "comment": "\r\n     * Sets the domain crosshair value and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners (provided that the\r\n     * domain crosshair is visible).\r\n     *\r\n     * @param value  the new value.\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getDomainCrosshairValue()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainCrosshairStroke()",
      "begin_line": 4164,
      "end_line": 4166,
      "comment": "\r\n     * Returns the {@link Stroke} used to draw the crosshair (if visible).\r\n     *\r\n     * @return The crosshair stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainCrosshairStroke(Stroke)\r\n     * @see #isDomainCrosshairVisible()\r\n     * @see #getDomainCrosshairPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairStroke(java.awt.Stroke)",
      "begin_line": 4177,
      "end_line": 4183,
      "comment": "\r\n     * Sets the Stroke used to draw the crosshairs (if visible) and notifies\r\n     * registered listeners that the axis has been modified.\r\n     *\r\n     * @param stroke  the new crosshair stroke (\u003ccode\u003enull\u003c/code\u003e not \r\n     *     permitted).\r\n     *     \r\n     * @see #getDomainCrosshairStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainCrosshairPaint()",
      "begin_line": 4194,
      "end_line": 4196,
      "comment": "\r\n     * Returns the domain crosshair paint.\r\n     *\r\n     * @return The crosshair paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setDomainCrosshairPaint(Paint)\r\n     * @see #isDomainCrosshairVisible()\r\n     * @see #getDomainCrosshairStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairPaint(java.awt.Paint)",
      "begin_line": 4206,
      "end_line": 4212,
      "comment": "\r\n     * Sets the paint used to draw the crosshairs (if visible) and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint the new crosshair paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getDomainCrosshairPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeCrosshairVisible()",
      "begin_line": 4222,
      "end_line": 4224,
      "comment": "\r\n     * Returns a flag indicating whether or not the range crosshair is visible.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setRangeCrosshairVisible(boolean)\r\n     * @see #isDomainCrosshairVisible()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairVisible(boolean)",
      "begin_line": 4235,
      "end_line": 4240,
      "comment": "\r\n     * Sets the flag indicating whether or not the range crosshair is visible.\r\n     * If the flag value changes, this method sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     * \r\n     * @see #isRangeCrosshairVisible()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeCrosshairLockedOnData()",
      "begin_line": 4250,
      "end_line": 4252,
      "comment": "\r\n     * Returns a flag indicating whether or not the crosshair should \"lock-on\"\r\n     * to actual data values.\r\n     *\r\n     * @return The flag.\r\n     * \r\n     * @see #setRangeCrosshairLockedOnData(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairLockedOnData(boolean)",
      "begin_line": 4263,
      "end_line": 4268,
      "comment": "\r\n     * Sets the flag indicating whether or not the range crosshair should\r\n     * \"lock-on\" to actual data values.  If the flag value changes, this method\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     * \r\n     * @see #isRangeCrosshairLockedOnData()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeCrosshairValue()",
      "begin_line": 4277,
      "end_line": 4279,
      "comment": "\r\n     * Returns the range crosshair value.\r\n     *\r\n     * @return The value.\r\n     * \r\n     * @see #setRangeCrosshairValue(double)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairValue(double)",
      "begin_line": 4291,
      "end_line": 4293,
      "comment": "\r\n     * Sets the range crosshair value.\r\n     * \u003cP\u003e\r\n     * Registered listeners are notified that the plot has been modified, but\r\n     * only if the crosshair is visible.\r\n     *\r\n     * @param value  the new value.\r\n     * \r\n     * @see #getRangeCrosshairValue()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairValue(double, boolean)",
      "begin_line": 4305,
      "end_line": 4310,
      "comment": "\r\n     * Sets the range crosshair value and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners, but only if the crosshair is visible.\r\n     *\r\n     * @param value  the new value.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *                \r\n     * @see #getRangeCrosshairValue()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeCrosshairStroke()",
      "begin_line": 4321,
      "end_line": 4323,
      "comment": "\r\n     * Returns the stroke used to draw the crosshair (if visible).\r\n     *\r\n     * @return The crosshair stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeCrosshairStroke(Stroke)\r\n     * @see #isRangeCrosshairVisible()\r\n     * @see #getRangeCrosshairPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairStroke(java.awt.Stroke)",
      "begin_line": 4334,
      "end_line": 4340,
      "comment": "\r\n     * Sets the stroke used to draw the crosshairs (if visible) and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the new crosshair stroke (\u003ccode\u003enull\u003c/code\u003e not \r\n     *         permitted).\r\n     * \r\n     * @see #getRangeCrosshairStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeCrosshairPaint()",
      "begin_line": 4351,
      "end_line": 4353,
      "comment": "\r\n     * Returns the range crosshair paint.\r\n     *\r\n     * @return The crosshair paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setRangeCrosshairPaint(Paint)\r\n     * @see #isRangeCrosshairVisible()\r\n     * @see #getRangeCrosshairStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairPaint(java.awt.Paint)",
      "begin_line": 4363,
      "end_line": 4369,
      "comment": "\r\n     * Sets the paint used to color the crosshairs (if visible) and sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint the new crosshair paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * \r\n     * @see #getRangeCrosshairPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getFixedDomainAxisSpace()",
      "begin_line": 4378,
      "end_line": 4380,
      "comment": "\r\n     * Returns the fixed domain axis space.\r\n     *\r\n     * @return The fixed domain axis space (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFixedDomainAxisSpace(AxisSpace)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 4390,
      "end_line": 4392,
      "comment": "\r\n     * Sets the fixed domain axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getFixedDomainAxisSpace()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)",
      "begin_line": 4405,
      "end_line": 4410,
      "comment": "\r\n     * Sets the fixed domain axis space and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getFixedDomainAxisSpace()\r\n     * \r\n     * @since 1.0.9\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getFixedRangeAxisSpace()",
      "begin_line": 4419,
      "end_line": 4421,
      "comment": "\r\n     * Returns the fixed range axis space.\r\n     *\r\n     * @return The fixed range axis space (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFixedRangeAxisSpace(AxisSpace)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 4431,
      "end_line": 4433,
      "comment": "\r\n     * Sets the fixed range axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getFixedRangeAxisSpace()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)",
      "begin_line": 4446,
      "end_line": 4451,
      "comment": "\r\n     * Sets the fixed range axis space and, if requested, sends a \r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     * \r\n     * @see #getFixedRangeAxisSpace()\r\n     * \r\n     * @since 1.0.9\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4462,
      "end_line": 4466,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * \r\n     * @see #zoomRangeAxes(double, PlotRenderingInfo, Point2D)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 4480,
      "end_line": 4503,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     * \r\n     * @see #zoomRangeAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4519,
      "end_line": 4527,
      "comment": "\r\n     * Zooms in on the domain axis/axes.  The new lower and upper bounds are\r\n     * specified as percentages of the current axis range, where 0 percent is\r\n     * the current lower bound and 100 percent is the current upper bound.\r\n     *\r\n     * @param lowerPercent  a percentage that determines the new lower bound\r\n     *                      for the axis (e.g. 0.20 is twenty percent).\r\n     * @param upperPercent  a percentage that determines the new upper bound\r\n     *                      for the axis (e.g. 0.80 is eighty percent).\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (ignored).\r\n     * \r\n     * @see #zoomRangeAxes(double, double, PlotRenderingInfo, Point2D)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4538,
      "end_line": 4542,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     * \r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 4557,
      "end_line": 4580,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     * @param useAnchor  a flag that controls whether or not the source point\r\n     *         is used for the zoom anchor.\r\n     * \r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     * \r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 4592,
      "end_line": 4600,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     *\r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     * \r\n     * @see #zoomDomainAxes(double, double, PlotRenderingInfo, Point2D)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainZoomable()",
      "begin_line": 4610,
      "end_line": 4612,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e, indicating that the domain axis/axes for this\r\n     * plot are zoomable.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #isRangeZoomable()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeZoomable()",
      "begin_line": 4622,
      "end_line": 4624,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e, indicating that the range axis/axes for this\r\n     * plot are zoomable.\r\n     *\r\n     * @return A boolean.\r\n     * \r\n     * @see #isDomainZoomable()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getSeriesCount()",
      "begin_line": 4632,
      "end_line": 4639,
      "comment": "\r\n     * Returns the number of series in the primary dataset for this plot.  If\r\n     * the dataset is \u003ccode\u003enull\u003c/code\u003e, the method returns 0.\r\n     *\r\n     * @return The series count.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getFixedLegendItems()",
      "begin_line": 4648,
      "end_line": 4650,
      "comment": "\r\n     * Returns the fixed legend items, if any.\r\n     *\r\n     * @return The legend items (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     * \r\n     * @see #setFixedLegendItems(LegendItemCollection)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedLegendItems(org.jfree.chart.LegendItemCollection)",
      "begin_line": 4661,
      "end_line": 4664,
      "comment": "\r\n     * Sets the fixed legend items for the plot.  Leave this set to\r\n     * \u003ccode\u003enull\u003c/code\u003e if you prefer the legend items to be created\r\n     * automatically.\r\n     *\r\n     * @param items  the legend items (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * \r\n     * @see #getFixedLegendItems()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getLegendItems()",
      "begin_line": 4673,
      "end_line": 4702,
      "comment": "\r\n     * Returns the legend items for the plot.  Each legend item is generated by\r\n     * the plot\u0027s renderer, since the renderer is responsible for the visual\r\n     * representation of the data.\r\n     *\r\n     * @return The legend items.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.equals(java.lang.Object)",
      "begin_line": 4711,
      "end_line": 4886,
      "comment": "\r\n     * Tests this plot for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clone()",
      "begin_line": 4896,
      "end_line": 4970,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  this can occur if some component of\r\n     *         the plot cannot be cloned.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 4979,
      "end_line": 4999,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 5009,
      "end_line": 5067,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     "
    }
  ]
}