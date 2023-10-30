{
  "filepath": "/tmp/Chart-4f/source/org/jfree/chart/plot/XYPlot.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "XYPlot",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.plot.Plot",
        "org.jfree.chart.plot.ValueAxisPlot",
        "org.jfree.chart.plot.Pannable",
        "org.jfree.chart.plot.Selectable",
        "org.jfree.chart.plot.Zoomable",
        "org.jfree.chart.event.RendererChangeListener",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 313,
      "end_line": 5866,
      "comment": "\r\n * A general class for plotting data in the form of (x, y) pairs.  This plot can\r\n * use data from any class that implements the {@link XYDataset} interface.\r\n * \u003cP\u003e\r\n * \u003ccode\u003eXYPlot\u003c/code\u003e makes use of an {@link XYItemRenderer} to draw each point\r\n * on the plot.  By using different renderers, various chart types can be\r\n * produced.\r\n * \u003cp\u003e\r\n * The {@link org.jfree.chart.ChartFactory} class contains static methods for\r\n * creating pre-configured charts.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 318,
      "end_line": 318,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_STROKE"
      ],
      "begin_line": 321,
      "end_line": 323,
      "comment": " The default grid line stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_GRIDLINE_PAINT"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " The default grid line paint. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_VISIBLE"
      ],
      "begin_line": 329,
      "end_line": 329,
      "comment": " The default crosshair visibility. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_STROKE"
      ],
      "begin_line": 332,
      "end_line": 333,
      "comment": " The default crosshair stroke. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CROSSHAIR_PAINT"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": " The default crosshair paint. "
    },
    {
      "type": "field",
      "varNames": [
        "localizationResources"
      ],
      "begin_line": 339,
      "end_line": 341,
      "comment": " The resourceBundle for the localization. "
    },
    {
      "type": "field",
      "varNames": [
        "orientation"
      ],
      "begin_line": 344,
      "end_line": 344,
      "comment": " The plot orientation. "
    },
    {
      "type": "field",
      "varNames": [
        "axisOffset"
      ],
      "begin_line": 347,
      "end_line": 347,
      "comment": " The offset between the data area and the axes. "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxes"
      ],
      "begin_line": 350,
      "end_line": 350,
      "comment": " The domain axis / axes (used for the x-values). "
    },
    {
      "type": "field",
      "varNames": [
        "domainAxisLocations"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": " The domain axis locations. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxes"
      ],
      "begin_line": 356,
      "end_line": 356,
      "comment": " The range axis (used for the y-values). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeAxisLocations"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": " The range axis location. "
    },
    {
      "type": "field",
      "varNames": [
        "datasets"
      ],
      "begin_line": 362,
      "end_line": 362,
      "comment": " Storage for the datasets. "
    },
    {
      "type": "field",
      "varNames": [
        "renderers"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": " Storage for the renderers. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToDomainAxesMap"
      ],
      "begin_line": 375,
      "end_line": 375,
      "comment": "\r\n     * Storage for the mapping between datasets/renderers and domain axes.  The\r\n     * keys in the map are Integer objects, corresponding to the dataset\r\n     * index.  The values in the map are List objects containing Integer\r\n     * objects (corresponding to the axis indices).  If the map contains no\r\n     * entry for a dataset, it is assumed to map to the primary domain axis\r\n     * (index \u003d 0).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "datasetToRangeAxesMap"
      ],
      "begin_line": 385,
      "end_line": 385,
      "comment": "\r\n     * Storage for the mapping between datasets/renderers and range axes.  The\r\n     * keys in the map are Integer objects, corresponding to the dataset\r\n     * index.  The values in the map are List objects containing Integer\r\n     * objects (corresponding to the axis indices).  If the map contains no\r\n     * entry for a dataset, it is assumed to map to the primary domain axis\r\n     * (index \u003d 0).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "quadrantOrigin"
      ],
      "begin_line": 388,
      "end_line": 388,
      "comment": " The origin point for the quadrants (if drawn). "
    },
    {
      "type": "field",
      "varNames": [
        "quadrantPaint"
      ],
      "begin_line": 391,
      "end_line": 392,
      "comment": " The paint used for each quadrant. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinesVisible"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": " A flag that controls whether the domain grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlineStroke"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": " The stroke used to draw the domain grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "domainGridlinePaint"
      ],
      "begin_line": 401,
      "end_line": 401,
      "comment": " The paint used to draw the domain grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinesVisible"
      ],
      "begin_line": 404,
      "end_line": 404,
      "comment": " A flag that controls whether the range grid-lines are visible. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlineStroke"
      ],
      "begin_line": 407,
      "end_line": 407,
      "comment": " The stroke used to draw the range grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeGridlinePaint"
      ],
      "begin_line": 410,
      "end_line": 410,
      "comment": " The paint used to draw the range grid-lines. "
    },
    {
      "type": "field",
      "varNames": [
        "domainMinorGridlinesVisible"
      ],
      "begin_line": 417,
      "end_line": 417,
      "comment": "\r\n     * A flag that controls whether the domain minor grid-lines are visible.\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainMinorGridlineStroke"
      ],
      "begin_line": 424,
      "end_line": 424,
      "comment": "\r\n     * The stroke used to draw the domain minor grid-lines.\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainMinorGridlinePaint"
      ],
      "begin_line": 431,
      "end_line": 431,
      "comment": "\r\n     * The paint used to draw the domain minor grid-lines.\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeMinorGridlinesVisible"
      ],
      "begin_line": 438,
      "end_line": 438,
      "comment": "\r\n     * A flag that controls whether the range minor grid-lines are visible.\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeMinorGridlineStroke"
      ],
      "begin_line": 445,
      "end_line": 445,
      "comment": "\r\n     * The stroke used to draw the range minor grid-lines.\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeMinorGridlinePaint"
      ],
      "begin_line": 452,
      "end_line": 452,
      "comment": "\r\n     * The paint used to draw the range minor grid-lines.\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainZeroBaselineVisible"
      ],
      "begin_line": 460,
      "end_line": 460,
      "comment": "\r\n     * A flag that controls whether or not the zero baseline against the domain\r\n     * axis is visible.\r\n     *\r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainZeroBaselineStroke"
      ],
      "begin_line": 467,
      "end_line": 467,
      "comment": "\r\n     * The stroke used for the zero baseline against the domain axis.\r\n     *\r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainZeroBaselinePaint"
      ],
      "begin_line": 474,
      "end_line": 474,
      "comment": "\r\n     * The paint used for the zero baseline against the domain axis.\r\n     *\r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselineVisible"
      ],
      "begin_line": 480,
      "end_line": 480,
      "comment": "\r\n     * A flag that controls whether or not the zero baseline against the range\r\n     * axis is visible.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselineStroke"
      ],
      "begin_line": 483,
      "end_line": 483,
      "comment": " The stroke used for the zero baseline against the range axis. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeZeroBaselinePaint"
      ],
      "begin_line": 486,
      "end_line": 486,
      "comment": " The paint used for the zero baseline against the range axis. "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairVisible"
      ],
      "begin_line": 489,
      "end_line": 489,
      "comment": " A flag that controls whether or not a domain crosshair is drawn.."
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairValue"
      ],
      "begin_line": 492,
      "end_line": 492,
      "comment": " The domain crosshair value. "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairStroke"
      ],
      "begin_line": 495,
      "end_line": 495,
      "comment": " The pen/brush used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairPaint"
      ],
      "begin_line": 498,
      "end_line": 498,
      "comment": " The color used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "domainCrosshairLockedOnData"
      ],
      "begin_line": 504,
      "end_line": 504,
      "comment": "\r\n     * A flag that controls whether or not the crosshair locks onto actual\r\n     * data points.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairVisible"
      ],
      "begin_line": 507,
      "end_line": 507,
      "comment": " A flag that controls whether or not a range crosshair is drawn.."
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairValue"
      ],
      "begin_line": 510,
      "end_line": 510,
      "comment": " The range crosshair value. "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairStroke"
      ],
      "begin_line": 513,
      "end_line": 513,
      "comment": " The pen/brush used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairPaint"
      ],
      "begin_line": 516,
      "end_line": 516,
      "comment": " The color used to draw the crosshair (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeCrosshairLockedOnData"
      ],
      "begin_line": 522,
      "end_line": 522,
      "comment": "\r\n     * A flag that controls whether or not the crosshair locks onto actual\r\n     * data points.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundDomainMarkers"
      ],
      "begin_line": 525,
      "end_line": 525,
      "comment": " A map of lists of foreground markers (optional) for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundDomainMarkers"
      ],
      "begin_line": 528,
      "end_line": 528,
      "comment": " A map of lists of background markers (optional) for the domain axes. "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundRangeMarkers"
      ],
      "begin_line": 531,
      "end_line": 531,
      "comment": " A map of lists of foreground markers (optional) for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundRangeMarkers"
      ],
      "begin_line": 534,
      "end_line": 534,
      "comment": " A map of lists of background markers (optional) for the range axes. "
    },
    {
      "type": "field",
      "varNames": [
        "annotations"
      ],
      "begin_line": 541,
      "end_line": 541,
      "comment": "\r\n     * A (possibly empty) list of annotations for the plot.  The list should\r\n     * be initialised in the constructor and never allowed to be\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainTickBandPaint"
      ],
      "begin_line": 544,
      "end_line": 544,
      "comment": " The paint used for the domain tick bands (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "rangeTickBandPaint"
      ],
      "begin_line": 547,
      "end_line": 547,
      "comment": " The paint used for the range tick bands (if any). "
    },
    {
      "type": "field",
      "varNames": [
        "fixedDomainAxisSpace"
      ],
      "begin_line": 550,
      "end_line": 550,
      "comment": " The fixed domain axis space. "
    },
    {
      "type": "field",
      "varNames": [
        "fixedRangeAxisSpace"
      ],
      "begin_line": 553,
      "end_line": 553,
      "comment": " The fixed range axis space. "
    },
    {
      "type": "field",
      "varNames": [
        "datasetRenderingOrder"
      ],
      "begin_line": 559,
      "end_line": 560,
      "comment": "\r\n     * The order of the dataset rendering (REVERSE draws the primary dataset\r\n     * last so that it appears to be on top).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "seriesRenderingOrder"
      ],
      "begin_line": 566,
      "end_line": 567,
      "comment": "\r\n     * The order of the series rendering (REVERSE draws the primary series\r\n     * last so that it appears to be on top).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "weight"
      ],
      "begin_line": 573,
      "end_line": 573,
      "comment": "\r\n     * The weight for this plot (only relevant if this is a subplot in a\r\n     * combined plot).\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fixedLegendItems"
      ],
      "begin_line": 579,
      "end_line": 579,
      "comment": "\r\n     * An optional collection of legend items that can be returned by the\r\n     * getLegendItems() method.\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "domainPannable"
      ],
      "begin_line": 587,
      "end_line": 587,
      "comment": "\r\n     * A flag that controls whether or not panning is enabled for the domain\r\n     * axis/axes.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rangePannable"
      ],
      "begin_line": 595,
      "end_line": 595,
      "comment": "\r\n     * A flag that controls whether or not panning is enabled for the range\r\n     * axis/axes.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.XYPlot.XYPlot()",
      "begin_line": 601,
      "end_line": 603,
      "comment": "\r\n     * Creates a new \u003ccode\u003eXYPlot\u003c/code\u003e instance with no dataset, no axes and\r\n     * no renderer.  You should specify these items before using the plot.\r\n     "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.plot.XYPlot.XYPlot(org.jfree.data.xy.XYDataset, org.jfree.chart.axis.ValueAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 616,
      "end_line": 710,
      "comment": "\r\n     * Creates a new plot with the specified dataset, axes and renderer.  Any\r\n     * of the arguments can be \u003ccode\u003enull\u003c/code\u003e, but in that case you should\r\n     * take care to specify the value before using the plot (otherwise a\r\n     * \u003ccode\u003eNullPointerException\u003c/code\u003e may be thrown).\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param domainAxis  the domain axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param rangeAxis  the range axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getPlotType()",
      "begin_line": 717,
      "end_line": 719,
      "comment": "\r\n     * Returns the plot type as a string.\r\n     *\r\n     * @return A short string describing the type of plot.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getOrientation()",
      "begin_line": 728,
      "end_line": 730,
      "comment": "\r\n     * Returns the orientation of the plot.\r\n     *\r\n     * @return The orientation (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setOrientation(PlotOrientation)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setOrientation(org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 740,
      "end_line": 748,
      "comment": "\r\n     * Sets the orientation for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param orientation  the orientation (\u003ccode\u003enull\u003c/code\u003e not allowed).\r\n     *\r\n     * @see #getOrientation()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getAxisOffset()",
      "begin_line": 757,
      "end_line": 759,
      "comment": "\r\n     * Returns the axis offset.\r\n     *\r\n     * @return The axis offset (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setAxisOffset(RectangleInsets)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setAxisOffset(org.jfree.chart.util.RectangleInsets)",
      "begin_line": 769,
      "end_line": 775,
      "comment": "\r\n     * Sets the axis offsets (gap between the data area and the axes) and sends\r\n     * a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param offset  the offset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getAxisOffset()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxis()",
      "begin_line": 787,
      "end_line": 789,
      "comment": "\r\n     * Returns the domain axis with index 0.  If the domain axis for this plot\r\n     * is \u003ccode\u003enull\u003c/code\u003e, then the method will return the parent plot\u0027s\r\n     * domain axis (if there is a parent plot).\r\n     *\r\n     * @return The domain axis (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getDomainAxis(int)\r\n     * @see #setDomainAxis(ValueAxis)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxis(int)",
      "begin_line": 800,
      "end_line": 813,
      "comment": "\r\n     * Returns the domain axis with the specified index, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     *\r\n     * @see #setDomainAxis(int, ValueAxis)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 824,
      "end_line": 826,
      "comment": "\r\n     * Sets the domain axis for the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param axis  the new axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDomainAxis()\r\n     * @see #setDomainAxis(int, ValueAxis)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxis(int, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 838,
      "end_line": 840,
      "comment": "\r\n     * Sets a domain axis and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDomainAxis(int)\r\n     * @see #setRangeAxis(int, ValueAxis)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxis(int, org.jfree.chart.axis.ValueAxis, boolean)",
      "begin_line": 852,
      "end_line": 868,
      "comment": "\r\n     * Sets a domain axis and, if requested, sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getDomainAxis(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxes(org.jfree.chart.axis.ValueAxis[])",
      "begin_line": 878,
      "end_line": 883,
      "comment": "\r\n     * Sets the domain axes for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param axes  the axes (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #setRangeAxes(ValueAxis[])\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisLocation()",
      "begin_line": 892,
      "end_line": 894,
      "comment": "\r\n     * Returns the location of the primary domain axis.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainAxisLocation(AxisLocation)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 904,
      "end_line": 907,
      "comment": "\r\n     * Sets the location of the primary domain axis and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDomainAxisLocation()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 918,
      "end_line": 921,
      "comment": "\r\n     * Sets the location of the domain axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getDomainAxisLocation()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisEdge()",
      "begin_line": 932,
      "end_line": 935,
      "comment": "\r\n     * Returns the edge for the primary domain axis (taking into account the\r\n     * plot\u0027s orientation).\r\n     *\r\n     * @return The edge.\r\n     *\r\n     * @see #getDomainAxisLocation()\r\n     * @see #getOrientation()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisCount()",
      "begin_line": 944,
      "end_line": 946,
      "comment": "\r\n     * Returns the number of domain axes.\r\n     *\r\n     * @return The axis count.\r\n     *\r\n     * @see #getRangeAxisCount()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearDomainAxes()",
      "begin_line": 954,
      "end_line": 963,
      "comment": "\r\n     * Clears the domain axes from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @see #clearRangeAxes()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.configureDomainAxes()",
      "begin_line": 968,
      "end_line": 975,
      "comment": "\r\n     * Configures the domain axes.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisLocation(int)",
      "begin_line": 988,
      "end_line": 997,
      "comment": "\r\n     * Returns the location for a domain axis.  If this hasn\u0027t been set\r\n     * explicitly, the method returns the location that is opposite to the\r\n     * primary domain axis location.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainAxisLocation(int, AxisLocation)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1009,
      "end_line": 1012,
      "comment": "\r\n     * Sets the location for a domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted for index\r\n     *     0).\r\n     *\r\n     * @see #getDomainAxisLocation(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1028,
      "end_line": 1039,
      "comment": "\r\n     * Sets the axis location for a domain axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted for\r\n     *     index 0).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #getDomainAxisLocation(int)\r\n     * @see #setRangeAxisLocation(int, AxisLocation, boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisEdge(int)",
      "begin_line": 1050,
      "end_line": 1058,
      "comment": "\r\n     * Returns the edge for a domain axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The edge.\r\n     *\r\n     * @see #getRangeAxisEdge(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxis()",
      "begin_line": 1070,
      "end_line": 1072,
      "comment": "\r\n     * Returns the range axis for the plot.  If the range axis for this plot is\r\n     * \u003ccode\u003enull\u003c/code\u003e, then the method will return the parent plot\u0027s range\r\n     * axis (if there is a parent plot).\r\n     *\r\n     * @return The range axis.\r\n     *\r\n     * @see #getRangeAxis(int)\r\n     * @see #setRangeAxis(ValueAxis)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxis(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 1083,
      "end_line": 1102,
      "comment": "\r\n     * Sets the range axis for the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRangeAxis()\r\n     * @see #setRangeAxis(int, ValueAxis)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisLocation()",
      "begin_line": 1111,
      "end_line": 1113,
      "comment": "\r\n     * Returns the location of the primary range axis.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeAxisLocation(AxisLocation)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1123,
      "end_line": 1126,
      "comment": "\r\n     * Sets the location of the primary range axis and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeAxisLocation()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1137,
      "end_line": 1140,
      "comment": "\r\n     * Sets the location of the primary range axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getRangeAxisLocation()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisEdge()",
      "begin_line": 1150,
      "end_line": 1153,
      "comment": "\r\n     * Returns the edge for the primary range axis.\r\n     *\r\n     * @return The range axis edge.\r\n     *\r\n     * @see #getRangeAxisLocation()\r\n     * @see #getOrientation()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxis(int)",
      "begin_line": 1164,
      "end_line": 1177,
      "comment": "\r\n     * Returns a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The axis (\u003ccode\u003enull\u003c/code\u003e possible).\r\n     *\r\n     * @see #setRangeAxis(int, ValueAxis)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxis(int, org.jfree.chart.axis.ValueAxis)",
      "begin_line": 1188,
      "end_line": 1190,
      "comment": "\r\n     * Sets a range axis and sends a {@link PlotChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRangeAxis(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxis(int, org.jfree.chart.axis.ValueAxis, boolean)",
      "begin_line": 1202,
      "end_line": 1218,
      "comment": "\r\n     * Sets a range axis and, if requested, sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param axis  the axis (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getRangeAxis(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxes(org.jfree.chart.axis.ValueAxis[])",
      "begin_line": 1228,
      "end_line": 1233,
      "comment": "\r\n     * Sets the range axes for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param axes  the axes (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #setDomainAxes(ValueAxis[])\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisCount()",
      "begin_line": 1242,
      "end_line": 1244,
      "comment": "\r\n     * Returns the number of range axes.\r\n     *\r\n     * @return The axis count.\r\n     *\r\n     * @see #getDomainAxisCount()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearRangeAxes()",
      "begin_line": 1252,
      "end_line": 1261,
      "comment": "\r\n     * Clears the range axes from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @see #clearDomainAxes()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.configureRangeAxes()",
      "begin_line": 1268,
      "end_line": 1275,
      "comment": "\r\n     * Configures the range axes.\r\n     *\r\n     * @see #configureDomainAxes()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisLocation(int)",
      "begin_line": 1288,
      "end_line": 1297,
      "comment": "\r\n     * Returns the location for a range axis.  If this hasn\u0027t been set\r\n     * explicitly, the method returns the location that is opposite to the\r\n     * primary range axis location.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The location (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeAxisLocation(int, AxisLocation)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation)",
      "begin_line": 1308,
      "end_line": 1311,
      "comment": "\r\n     * Sets the location for a range axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRangeAxisLocation(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeAxisLocation(int, org.jfree.chart.axis.AxisLocation, boolean)",
      "begin_line": 1327,
      "end_line": 1338,
      "comment": "\r\n     * Sets the axis location for a domain axis and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the axis index.\r\n     * @param location  the location (\u003ccode\u003enull\u003c/code\u003e not permitted for\r\n     *     index 0).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #getRangeAxisLocation(int)\r\n     * @see #setDomainAxisLocation(int, AxisLocation, boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisEdge(int)",
      "begin_line": 1350,
      "end_line": 1358,
      "comment": "\r\n     * Returns the edge for a range axis.\r\n     *\r\n     * @param index  the axis index.\r\n     *\r\n     * @return The edge.\r\n     *\r\n     * @see #getRangeAxisLocation(int)\r\n     * @see #getOrientation()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDataset()",
      "begin_line": 1368,
      "end_line": 1370,
      "comment": "\r\n     * Returns the primary dataset for the plot.\r\n     *\r\n     * @return The primary dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getDataset(int)\r\n     * @see #setDataset(XYDataset)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDataset(int)",
      "begin_line": 1381,
      "end_line": 1387,
      "comment": "\r\n     * Returns a dataset.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The dataset (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDataset(int, XYDataset)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDataset(org.jfree.data.xy.XYDataset)",
      "begin_line": 1398,
      "end_line": 1400,
      "comment": "\r\n     * Sets the primary dataset for the plot, replacing the existing dataset if\r\n     * there is one.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDataset()\r\n     * @see #setDataset(int, XYDataset)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDataset(int, org.jfree.data.xy.XYDataset)",
      "begin_line": 1410,
      "end_line": 1423,
      "comment": "\r\n     * Sets a dataset for the plot.\r\n     *\r\n     * @param index  the dataset index.\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDataset(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetCount()",
      "begin_line": 1430,
      "end_line": 1432,
      "comment": "\r\n     * Returns the number of datasets.\r\n     *\r\n     * @return The number of datasets.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.indexOf(org.jfree.data.xy.XYDataset)",
      "begin_line": 1442,
      "end_line": 1451,
      "comment": "\r\n     * Returns the index of the specified dataset, or \u003ccode\u003e-1\u003c/code\u003e if the\r\n     * dataset does not belong to the plot.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The index.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxis(int, int)",
      "begin_line": 1462,
      "end_line": 1466,
      "comment": "\r\n     * Maps a dataset to a particular domain axis.  All data will be plotted\r\n     * against axis zero by default, no mapping is required for this case.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndex  the axis index.\r\n     *\r\n     * @see #mapDatasetToRangeAxis(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.mapDatasetToDomainAxes(int, java.util.List)",
      "begin_line": 1478,
      "end_line": 1487,
      "comment": "\r\n     * Maps the specified dataset to the axes in the list.  Note that the\r\n     * conversion of data values into Java2D space is always performed using\r\n     * the first axis in the list.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndices  the axis indices (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxis(int, int)",
      "begin_line": 1498,
      "end_line": 1502,
      "comment": "\r\n     * Maps a dataset to a particular range axis.  All data will be plotted\r\n     * against axis zero by default, no mapping is required for this case.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndex  the axis index.\r\n     *\r\n     * @see #mapDatasetToDomainAxis(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.mapDatasetToRangeAxes(int, java.util.List)",
      "begin_line": 1514,
      "end_line": 1523,
      "comment": "\r\n     * Maps the specified dataset to the axes in the list.  Note that the\r\n     * conversion of data values into Java2D space is always performed using\r\n     * the first axis in the list.\r\n     *\r\n     * @param index  the dataset index (zero-based).\r\n     * @param axisIndices  the axis indices (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.checkAxisIndices(java.util.List)",
      "begin_line": 1532,
      "end_line": 1555,
      "comment": "\r\n     * This method is used to perform argument checking on the list of\r\n     * axis indices passed to mapDatasetToDomainAxes() and\r\n     * mapDatasetToRangeAxes().\r\n     *\r\n     * @param indices  the list of indices (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRendererCount()",
      "begin_line": 1564,
      "end_line": 1566,
      "comment": "\r\n     * Returns the number of renderer slots for this plot.\r\n     *\r\n     * @return The number of renderer slots.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRenderer()",
      "begin_line": 1575,
      "end_line": 1577,
      "comment": "\r\n     * Returns the renderer for the primary dataset.\r\n     *\r\n     * @return The item renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRenderer(XYItemRenderer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRenderer(int)",
      "begin_line": 1588,
      "end_line": 1595,
      "comment": "\r\n     * Returns the renderer for a dataset, or \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param index  the renderer index.\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRenderer(int, XYItemRenderer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderer(org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 1606,
      "end_line": 1608,
      "comment": "\r\n     * Sets the renderer for the primary dataset and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.  If the renderer\r\n     * is set to \u003ccode\u003enull\u003c/code\u003e, no data will be displayed.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRenderer()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderer(int, org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 1619,
      "end_line": 1621,
      "comment": "\r\n     * Sets a renderer and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param renderer  the renderer.\r\n     *\r\n     * @see #getRenderer(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderer(int, org.jfree.chart.renderer.xy.XYItemRenderer, boolean)",
      "begin_line": 1633,
      "end_line": 1649,
      "comment": "\r\n     * Sets a renderer and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param index  the index.\r\n     * @param renderer  the renderer.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getRenderer(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRenderers(org.jfree.chart.renderer.xy.XYItemRenderer[])",
      "begin_line": 1657,
      "end_line": 1662,
      "comment": "\r\n     * Sets the renderers for this plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param renderers  the renderers (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetRenderingOrder()",
      "begin_line": 1671,
      "end_line": 1673,
      "comment": "\r\n     * Returns the dataset rendering order.\r\n     *\r\n     * @return The order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDatasetRenderingOrder(DatasetRenderingOrder)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder)",
      "begin_line": 1685,
      "end_line": 1691,
      "comment": "\r\n     * Sets the rendering order and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.  By default, the plot renders the primary dataset\r\n     * last (so that the primary dataset overlays the secondary datasets).\r\n     * You can reverse this if you want to.\r\n     *\r\n     * @param order  the rendering order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDatasetRenderingOrder()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getSeriesRenderingOrder()",
      "begin_line": 1700,
      "end_line": 1702,
      "comment": "\r\n     * Returns the series rendering order.\r\n     *\r\n     * @return the order (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesRenderingOrder(SeriesRenderingOrder)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setSeriesRenderingOrder(org.jfree.chart.plot.SeriesRenderingOrder)",
      "begin_line": 1714,
      "end_line": 1720,
      "comment": "\r\n     * Sets the series order and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.  By default, the plot renders the primary series\r\n     * last (so that the primary series appears to be on top).\r\n     * You can reverse this if you want to.\r\n     *\r\n     * @param order  the rendering order (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getSeriesRenderingOrder()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getIndexOf(org.jfree.chart.renderer.xy.XYItemRenderer)",
      "begin_line": 1730,
      "end_line": 1732,
      "comment": "\r\n     * Returns the index of the specified renderer, or \u003ccode\u003e-1\u003c/code\u003e if the\r\n     * renderer is not assigned to this plot.\r\n     *\r\n     * @param renderer  the renderer (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The renderer index.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRendererForDataset(org.jfree.data.xy.XYDataset)",
      "begin_line": 1743,
      "end_line": 1755,
      "comment": "\r\n     * Returns the renderer for the specified dataset.  The code first\r\n     * determines the index of the dataset, then checks if there is a\r\n     * renderer with the same index (if not, the method returns renderer(0).\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The renderer (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getWeight()",
      "begin_line": 1765,
      "end_line": 1767,
      "comment": "\r\n     * Returns the weight for this plot when it is used as a subplot within a\r\n     * combined plot.\r\n     *\r\n     * @return The weight.\r\n     *\r\n     * @see #setWeight(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setWeight(int)",
      "begin_line": 1777,
      "end_line": 1780,
      "comment": "\r\n     * Sets the weight for the plot and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param weight  the weight.\r\n     *\r\n     * @see #getWeight()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainGridlinesVisible()",
      "begin_line": 1790,
      "end_line": 1792,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the domain gridlines are visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @see #setDomainGridlinesVisible(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainGridlinesVisible(boolean)",
      "begin_line": 1805,
      "end_line": 1810,
      "comment": "\r\n     * Sets the flag that controls whether or not the domain grid-lines are\r\n     * visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isDomainGridlinesVisible()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainMinorGridlinesVisible()",
      "begin_line": 1822,
      "end_line": 1824,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the domain minor gridlines are visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @see #setDomainMinorGridlinesVisible(boolean)\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainMinorGridlinesVisible(boolean)",
      "begin_line": 1839,
      "end_line": 1844,
      "comment": "\r\n     * Sets the flag that controls whether or not the domain minor grid-lines\r\n     * are visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isDomainMinorGridlinesVisible()\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainGridlineStroke()",
      "begin_line": 1854,
      "end_line": 1856,
      "comment": "\r\n     * Returns the stroke for the grid-lines (if any) plotted against the\r\n     * domain axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainGridlineStroke(Stroke)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainGridlineStroke(java.awt.Stroke)",
      "begin_line": 1869,
      "end_line": 1875,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the domain axis, and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003estroke\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #getDomainGridlineStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainMinorGridlineStroke()",
      "begin_line": 1888,
      "end_line": 1890,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainMinorGridlineStroke(java.awt.Stroke)",
      "begin_line": 1905,
      "end_line": 1911,
      "comment": "\r\n     * Sets the stroke for the minor grid lines plotted against the domain\r\n     * axis, and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003estroke\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #getDomainMinorGridlineStroke()\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainGridlinePaint()",
      "begin_line": 1921,
      "end_line": 1923,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the domain\r\n     * axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainGridlinePaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainGridlinePaint(java.awt.Paint)",
      "begin_line": 1936,
      "end_line": 1942,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the domain axis, and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003epaint\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #getDomainGridlinePaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainMinorGridlinePaint()",
      "begin_line": 1954,
      "end_line": 1956,
      "comment": "\r\n     * Returns the paint for the minor grid lines (if any) plotted against the\r\n     * domain axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainMinorGridlinePaint(Paint)\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainMinorGridlinePaint(java.awt.Paint)",
      "begin_line": 1971,
      "end_line": 1977,
      "comment": "\r\n     * Sets the paint for the minor grid lines plotted against the domain axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @throws IllegalArgumentException if \u003ccode\u003epaint\u003c/code\u003e is\r\n     *     \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @see #getDomainMinorGridlinePaint()\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeGridlinesVisible()",
      "begin_line": 1987,
      "end_line": 1989,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the range axis grid is visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setRangeGridlinesVisible(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeGridlinesVisible(boolean)",
      "begin_line": 2002,
      "end_line": 2007,
      "comment": "\r\n     * Sets the flag that controls whether or not the range axis grid lines\r\n     * are visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isRangeGridlinesVisible()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeGridlineStroke()",
      "begin_line": 2017,
      "end_line": 2019,
      "comment": "\r\n     * Returns the stroke for the grid lines (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeGridlineStroke(Stroke)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeGridlineStroke(java.awt.Stroke)",
      "begin_line": 2029,
      "end_line": 2035,
      "comment": "\r\n     * Sets the stroke for the grid lines plotted against the range axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeGridlineStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeGridlinePaint()",
      "begin_line": 2045,
      "end_line": 2047,
      "comment": "\r\n     * Returns the paint for the grid lines (if any) plotted against the range\r\n     * axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeGridlinePaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeGridlinePaint(java.awt.Paint)",
      "begin_line": 2057,
      "end_line": 2063,
      "comment": "\r\n     * Sets the paint for the grid lines plotted against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeGridlinePaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeMinorGridlinesVisible()",
      "begin_line": 2075,
      "end_line": 2077,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the range axis minor grid is visible, and\r\n     * \u003ccode\u003efalse\u003ccode\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setRangeMinorGridlinesVisible(boolean)\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeMinorGridlinesVisible(boolean)",
      "begin_line": 2092,
      "end_line": 2097,
      "comment": "\r\n     * Sets the flag that controls whether or not the range axis minor grid\r\n     * lines are visible.\r\n     * \u003cp\u003e\r\n     * If the flag value is changed, a {@link PlotChangeEvent} is sent to all\r\n     * registered listeners.\r\n     *\r\n     * @param visible  the new value of the flag.\r\n     *\r\n     * @see #isRangeMinorGridlinesVisible()\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeMinorGridlineStroke()",
      "begin_line": 2109,
      "end_line": 2111,
      "comment": "\r\n     * Returns the stroke for the minor grid lines (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeMinorGridlineStroke(Stroke)\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeMinorGridlineStroke(java.awt.Stroke)",
      "begin_line": 2123,
      "end_line": 2129,
      "comment": "\r\n     * Sets the stroke for the minor grid lines plotted against the range axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeMinorGridlineStroke()\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeMinorGridlinePaint()",
      "begin_line": 2141,
      "end_line": 2143,
      "comment": "\r\n     * Returns the paint for the minor grid lines (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeMinorGridlinePaint(Paint)\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeMinorGridlinePaint(java.awt.Paint)",
      "begin_line": 2155,
      "end_line": 2161,
      "comment": "\r\n     * Sets the paint for the minor grid lines plotted against the range axis\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeMinorGridlinePaint()\r\n     *\r\n     * @since 1.0.12\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainZeroBaselineVisible()",
      "begin_line": 2173,
      "end_line": 2175,
      "comment": "\r\n     * Returns a flag that controls whether or not a zero baseline is\r\n     * displayed for the domain axis.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #setDomainZeroBaselineVisible(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainZeroBaselineVisible(boolean)",
      "begin_line": 2188,
      "end_line": 2191,
      "comment": "\r\n     * Sets the flag that controls whether or not the zero baseline is\r\n     * displayed for the domain axis, and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #isDomainZeroBaselineVisible()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainZeroBaselineStroke()",
      "begin_line": 2202,
      "end_line": 2204,
      "comment": "\r\n     * Returns the stroke used for the zero baseline against the domain axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #setDomainZeroBaselineStroke(Stroke)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainZeroBaselineStroke(java.awt.Stroke)",
      "begin_line": 2216,
      "end_line": 2222,
      "comment": "\r\n     * Sets the stroke for the zero baseline for the domain axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #getRangeZeroBaselineStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainZeroBaselinePaint()",
      "begin_line": 2234,
      "end_line": 2236,
      "comment": "\r\n     * Returns the paint for the zero baseline (if any) plotted against the\r\n     * domain axis.\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainZeroBaselinePaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainZeroBaselinePaint(java.awt.Paint)",
      "begin_line": 2248,
      "end_line": 2254,
      "comment": "\r\n     * Sets the paint for the zero baseline plotted against the domain axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.0.5\r\n     *\r\n     * @see #getDomainZeroBaselinePaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeZeroBaselineVisible()",
      "begin_line": 2264,
      "end_line": 2266,
      "comment": "\r\n     * Returns a flag that controls whether or not a zero baseline is\r\n     * displayed for the range axis.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #setRangeZeroBaselineVisible(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeZeroBaselineVisible(boolean)",
      "begin_line": 2277,
      "end_line": 2280,
      "comment": "\r\n     * Sets the flag that controls whether or not the zero baseline is\r\n     * displayed for the range axis, and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param visible  the flag.\r\n     *\r\n     * @see #isRangeZeroBaselineVisible()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeZeroBaselineStroke()",
      "begin_line": 2289,
      "end_line": 2291,
      "comment": "\r\n     * Returns the stroke used for the zero baseline against the range axis.\r\n     *\r\n     * @return The stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeZeroBaselineStroke(Stroke)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeZeroBaselineStroke(java.awt.Stroke)",
      "begin_line": 2301,
      "end_line": 2307,
      "comment": "\r\n     * Sets the stroke for the zero baseline for the range axis,\r\n     * and sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeZeroBaselineStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeZeroBaselinePaint()",
      "begin_line": 2317,
      "end_line": 2319,
      "comment": "\r\n     * Returns the paint for the zero baseline (if any) plotted against the\r\n     * range axis.\r\n     *\r\n     * @return The paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeZeroBaselinePaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeZeroBaselinePaint(java.awt.Paint)",
      "begin_line": 2329,
      "end_line": 2335,
      "comment": "\r\n     * Sets the paint for the zero baseline plotted against the range axis and\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeZeroBaselinePaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainTickBandPaint()",
      "begin_line": 2345,
      "end_line": 2347,
      "comment": "\r\n     * Returns the paint used for the domain tick bands.  If this is\r\n     * \u003ccode\u003enull\u003c/code\u003e, no tick bands will be drawn.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainTickBandPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainTickBandPaint(java.awt.Paint)",
      "begin_line": 2356,
      "end_line": 2359,
      "comment": "\r\n     * Sets the paint for the domain tick bands.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getDomainTickBandPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeTickBandPaint()",
      "begin_line": 2369,
      "end_line": 2371,
      "comment": "\r\n     * Returns the paint used for the range tick bands.  If this is\r\n     * \u003ccode\u003enull\u003c/code\u003e, no tick bands will be drawn.\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeTickBandPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeTickBandPaint(java.awt.Paint)",
      "begin_line": 2380,
      "end_line": 2383,
      "comment": "\r\n     * Sets the paint for the range tick bands.\r\n     *\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getRangeTickBandPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getQuadrantOrigin()",
      "begin_line": 2393,
      "end_line": 2395,
      "comment": "\r\n     * Returns the origin for the quadrants that can be displayed on the plot.\r\n     * This defaults to (0, 0).\r\n     *\r\n     * @return The origin point (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setQuadrantOrigin(Point2D)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setQuadrantOrigin(java.awt.geom.Point2D)",
      "begin_line": 2405,
      "end_line": 2411,
      "comment": "\r\n     * Sets the quadrant origin and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param origin  the origin (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getQuadrantOrigin()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getQuadrantPaint(int)",
      "begin_line": 2422,
      "end_line": 2428,
      "comment": "\r\n     * Returns the paint used for the specified quadrant.\r\n     *\r\n     * @param index  the quadrant index (0-3).\r\n     *\r\n     * @return The paint (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setQuadrantPaint(int, Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setQuadrantPaint(int, java.awt.Paint)",
      "begin_line": 2439,
      "end_line": 2446,
      "comment": "\r\n     * Sets the paint used for the specified quadrant and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the quadrant index (0-3).\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getQuadrantPaint(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2460,
      "end_line": 2463,
      "comment": "\r\n     * Adds a marker for the domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #addDomainMarker(Marker, Layer)\r\n     * @see #clearDomainMarkers()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2477,
      "end_line": 2479,
      "comment": "\r\n     * Adds a marker for the domain axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @see #addDomainMarker(int, Marker, Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearDomainMarkers()",
      "begin_line": 2487,
      "end_line": 2507,
      "comment": "\r\n     * Clears all the (foreground and background) domain markers and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @see #addDomainMarker(int, Marker, Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearDomainMarkers(int)",
      "begin_line": 2517,
      "end_line": 2544,
      "comment": "\r\n     * Clears the (foreground and background) domain markers for a particular\r\n     * renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     *\r\n     * @see #clearRangeMarkers(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2561,
      "end_line": 2563,
      "comment": "\r\n     * Adds a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the domain axis (that the renderer is mapped to), however this is\r\n     * entirely up to the renderer.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @see #clearDomainMarkers(int)\r\n     * @see #addRangeMarker(int, Marker, Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2580,
      "end_line": 2611,
      "comment": "\r\n     * Adds a marker for a specific dataset/renderer and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the domain axis (that the renderer is mapped to), however this is\r\n     * entirely up to the renderer.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2624,
      "end_line": 2626,
      "comment": "\r\n     * Removes a marker for the domain axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param marker  the marker.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2640,
      "end_line": 2642,
      "comment": "\r\n     * Removes a marker for the domain axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param marker the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2657,
      "end_line": 2659,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeDomainMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2675,
      "end_line": 2694,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and, if requested,\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2707,
      "end_line": 2709,
      "comment": "\r\n     * Adds a marker for the range axis and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #addRangeMarker(Marker, Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2723,
      "end_line": 2725,
      "comment": "\r\n     * Adds a marker for the range axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param marker  the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @see #addRangeMarker(int, Marker, Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearRangeMarkers()",
      "begin_line": 2733,
      "end_line": 2753,
      "comment": "\r\n     * Clears all the range markers and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @see #clearRangeMarkers()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2769,
      "end_line": 2771,
      "comment": "\r\n     * Adds a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @see #clearRangeMarkers(int)\r\n     * @see #addDomainMarker(int, Marker, Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2787,
      "end_line": 2812,
      "comment": "\r\n     * Adds a marker for a specific dataset/renderer and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     * \u003cP\u003e\r\n     * Typically a marker will be drawn by the renderer as a line perpendicular\r\n     * to the range axis, however this is entirely up to the renderer.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearRangeMarkers(int)",
      "begin_line": 2820,
      "end_line": 2847,
      "comment": "\r\n     * Clears the (foreground and background) range markers for a particular\r\n     * renderer.\r\n     *\r\n     * @param index  the renderer index.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(org.jfree.chart.plot.Marker)",
      "begin_line": 2860,
      "end_line": 2862,
      "comment": "\r\n     * Removes a marker for the range axis and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param marker the marker.\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2876,
      "end_line": 2878,
      "comment": "\r\n     * Removes a marker for the range axis in the specified layer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param marker the marker (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer)",
      "begin_line": 2893,
      "end_line": 2895,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index the dataset/renderer index.\r\n     * @param marker the marker.\r\n     * @param layer the layer (foreground or background).\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeRangeMarker(int, org.jfree.chart.plot.Marker, org.jfree.chart.util.Layer, boolean)",
      "begin_line": 2911,
      "end_line": 2933,
      "comment": "\r\n     * Removes a marker for a specific dataset/renderer and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param index  the dataset/renderer index.\r\n     * @param marker  the marker.\r\n     * @param layer  the layer (foreground or background).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @return A boolean indicating whether or not the marker was actually\r\n     *         removed.\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 2944,
      "end_line": 2946,
      "comment": "\r\n     * Adds an annotation to the plot and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getAnnotations()\r\n     * @see #removeAnnotation(XYAnnotation)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.addAnnotation(org.jfree.chart.annotations.XYAnnotation, boolean)",
      "begin_line": 2957,
      "end_line": 2965,
      "comment": "\r\n     * Adds an annotation to the plot and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeAnnotation(org.jfree.chart.annotations.XYAnnotation)",
      "begin_line": 2978,
      "end_line": 2980,
      "comment": "\r\n     * Removes an annotation from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A boolean (indicates whether or not the annotation was removed).\r\n     *\r\n     * @see #addAnnotation(XYAnnotation)\r\n     * @see #getAnnotations()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.removeAnnotation(org.jfree.chart.annotations.XYAnnotation, boolean)",
      "begin_line": 2993,
      "end_line": 3002,
      "comment": "\r\n     * Removes an annotation from the plot and sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @return A boolean (indicates whether or not the annotation was removed).\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getAnnotations()",
      "begin_line": 3013,
      "end_line": 3015,
      "comment": "\r\n     * Returns the list of annotations.\r\n     *\r\n     * @return The list of annotations.\r\n     *\r\n     * @since 1.0.1\r\n     *\r\n     * @see #addAnnotation(XYAnnotation)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearAnnotations()",
      "begin_line": 3023,
      "end_line": 3026,
      "comment": "\r\n     * Clears all the annotations and sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @see #addAnnotation(XYAnnotation)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.calculateAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3036,
      "end_line": 3043,
      "comment": "\r\n     * Calculates the space required for all the axes in the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     *\r\n     * @return The required space.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.calculateDomainAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 3054,
      "end_line": 3090,
      "comment": "\r\n     * Calculates the space required for the domain axis/axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param space  a carrier for the result (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The required space.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.calculateRangeAxisSpace(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.AxisSpace)",
      "begin_line": 3101,
      "end_line": 3136,
      "comment": "\r\n     * Calculates the space required for the range axis/axes.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plotArea  the plot area.\r\n     * @param space  a carrier for the result (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The required space.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Point2D, org.jfree.chart.plot.PlotState, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3150,
      "end_line": 3403,
      "comment": "\r\n     * Draws the plot within the specified area on a graphics device.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the plot area (in Java2D space).\r\n     * @param anchor  an anchor point in Java2D space (\u003ccode\u003enull\u003c/code\u003e\r\n     *                permitted).\r\n     * @param parentState  the state from the parent plot, if there is one\r\n     *                     (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param info  collects chart drawing information (\u003ccode\u003enull\u003c/code\u003e\r\n     *              permitted).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawBackground(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3411,
      "end_line": 3415,
      "comment": "\r\n     * Draws the background for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawQuadrants(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3426,
      "end_line": 3531,
      "comment": "\r\n     * Draws the quadrants.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the area.\r\n     *\r\n     * @see #setQuadrantOrigin(Point2D)\r\n     * @see #setQuadrantPaint(int, Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainTickBands(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3542,
      "end_line": 3566,
      "comment": "\r\n     * Draws the domain tick bands, if any.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     *\r\n     * @see #setDomainTickBandPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeTickBands(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3577,
      "end_line": 3601,
      "comment": "\r\n     * Draws the range tick bands, if any.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     *\r\n     * @see #setRangeTickBandPaint(Paint)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawAxes(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3614,
      "end_line": 3688,
      "comment": "\r\n     * A utility method for drawing the axes.\r\n     *\r\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotArea  the plot area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the data area (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param plotState  collects information about the plot (\u003ccode\u003enull\u003c/code\u003e\r\n     *                   permitted).\r\n     *\r\n     * @return A map containing the state for each axis drawn.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.render(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.plot.PlotRenderingInfo, org.jfree.chart.plot.CrosshairState)",
      "begin_line": 3706,
      "end_line": 3799,
      "comment": "\r\n     * Draws a representation of the data within the dataArea region, using the\r\n     * current renderer.\r\n     * \u003cP\u003e\r\n     * The \u003ccode\u003einfo\u003c/code\u003e and \u003ccode\u003ecrosshairState\u003c/code\u003e arguments may be\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the region in which the data is to be drawn.\r\n     * @param index  the dataset index.\r\n     * @param info  an optional object for collection dimension information.\r\n     * @param crosshairState  collects crosshair information\r\n     *                        (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A flag that indicates whether any data was actually rendered.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisForDataset(int)",
      "begin_line": 3808,
      "end_line": 3826,
      "comment": "\r\n     * Returns the domain axis for a dataset.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The axis.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisForDataset(int)",
      "begin_line": 3835,
      "end_line": 3853,
      "comment": "\r\n     * Returns the range axis for a dataset.\r\n     *\r\n     * @param index  the dataset index.\r\n     *\r\n     * @return The axis.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3864,
      "end_line": 3901,
      "comment": "\r\n     * Draws the gridlines for the plot, if they are visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param ticks  the ticks.\r\n     *\r\n     * @see #drawRangeGridlines(Graphics2D, Rectangle2D, List)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeGridlines(java.awt.Graphics2D, java.awt.geom.Rectangle2D, java.util.List)",
      "begin_line": 3913,
      "end_line": 3952,
      "comment": "\r\n     * Draws the gridlines for the plot\u0027s primary range axis, if they are\r\n     * visible.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the data area.\r\n     * @param ticks  the ticks.\r\n     *\r\n     * @see #drawDomainGridlines(Graphics2D, Rectangle2D, List)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawZeroDomainBaseline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3964,
      "end_line": 3971,
      "comment": "\r\n     * Draws a base line across the chart at value zero on the domain axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the data area.\r\n     *\r\n     * @see #setDomainZeroBaselineVisible(boolean)\r\n     *\r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawZeroRangeBaseline(java.awt.Graphics2D, java.awt.geom.Rectangle2D)",
      "begin_line": 3981,
      "end_line": 3986,
      "comment": "\r\n     * Draws a base line across the chart at value zero on the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param area  the data area.\r\n     *\r\n     * @see #setRangeZeroBaselineVisible(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 3995,
      "end_line": 4007,
      "comment": "\r\n     * Draws the annotations for the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param info  the chart rendering info.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)",
      "begin_line": 4018,
      "end_line": 4040,
      "comment": "\r\n     * Draws the domain markers (if any) for an axis and layer.  This method is\r\n     * typically called from within the draw() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer (foreground or background).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeMarkers(java.awt.Graphics2D, java.awt.geom.Rectangle2D, int, org.jfree.chart.util.Layer)",
      "begin_line": 4051,
      "end_line": 4072,
      "comment": "\r\n     * Draws the range markers (if any) for a renderer and layer.  This method\r\n     * is typically called from within the draw() method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer (foreground or background).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainMarkers(org.jfree.chart.util.Layer)",
      "begin_line": 4083,
      "end_line": 4085,
      "comment": "\r\n     * Returns the list of domain markers (read only) for the specified layer.\r\n     *\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @return The list of domain markers.\r\n     *\r\n     * @see #getRangeMarkers(Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeMarkers(org.jfree.chart.util.Layer)",
      "begin_line": 4096,
      "end_line": 4098,
      "comment": "\r\n     * Returns the list of range markers (read only) for the specified layer.\r\n     *\r\n     * @param layer  the layer (foreground or background).\r\n     *\r\n     * @return The list of range markers.\r\n     *\r\n     * @see #getDomainMarkers(Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainMarkers(int, org.jfree.chart.util.Layer)",
      "begin_line": 4111,
      "end_line": 4124,
      "comment": "\r\n     * Returns a collection of domain markers for a particular renderer and\r\n     * layer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer.\r\n     *\r\n     * @return A collection of markers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getRangeMarkers(int, Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeMarkers(int, org.jfree.chart.util.Layer)",
      "begin_line": 4137,
      "end_line": 4150,
      "comment": "\r\n     * Returns a collection of range markers for a particular renderer and\r\n     * layer.\r\n     *\r\n     * @param index  the renderer index.\r\n     * @param layer  the layer.\r\n     *\r\n     * @return A collection of markers (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getDomainMarkers(int, Layer)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawHorizontalLine(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 4162,
      "end_line": 4179,
      "comment": "\r\n     * Utility method for drawing a horizontal line across the data area of the\r\n     * plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param value  the coordinate, where to draw the line.\r\n     * @param stroke  the stroke to use.\r\n     * @param paint  the paint to use.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawDomainCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 4194,
      "end_line": 4217,
      "comment": "\r\n     * Draws a domain crosshair.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param dataArea  the data area.\r\n     * @param orientation  the plot orientation.\r\n     * @param value  the crosshair value.\r\n     * @param axis  the axis against which the value is measured.\r\n     * @param stroke  the stroke used to draw the crosshair line.\r\n     * @param paint  the paint used to draw the crosshair line.\r\n     *\r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawVerticalLine(java.awt.Graphics2D, java.awt.geom.Rectangle2D, double, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 4228,
      "end_line": 4245,
      "comment": "\r\n     * Utility method for drawing a vertical line on the data area of the plot.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param value  the coordinate, where to draw the line.\r\n     * @param stroke  the stroke to use.\r\n     * @param paint  the paint to use.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.drawRangeCrosshair(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.PlotOrientation, double, org.jfree.chart.axis.ValueAxis, java.awt.Stroke, java.awt.Paint)",
      "begin_line": 4260,
      "end_line": 4283,
      "comment": "\r\n     * Draws a range crosshair.\r\n     *\r\n     * @param g2  the graphics target.\r\n     * @param dataArea  the data area.\r\n     * @param orientation  the plot orientation.\r\n     * @param value  the crosshair value.\r\n     * @param axis  the axis against which the value is measured.\r\n     * @param stroke  the stroke used to draw the crosshair line.\r\n     * @param paint  the paint used to draw the crosshair line.\r\n     *\r\n     * @since 1.0.4\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.handleClick(int, int, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 4292,
      "end_line": 4312,
      "comment": "\r\n     * Handles a \u0027click\u0027 on the plot by updating the anchor values.\r\n     *\r\n     * @param x  the x-coordinate, where the click occurred, in Java2D space.\r\n     * @param y  the y-coordinate, where the click occurred, in Java2D space.\r\n     * @param info  object containing information about the plot dimensions.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetsMappedToDomainAxis(java.lang.Integer)",
      "begin_line": 4322,
      "end_line": 4342,
      "comment": "\r\n     * A utility method that returns a list of datasets that are mapped to a\r\n     * particular axis.\r\n     *\r\n     * @param axisIndex  the axis index (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A list of datasets.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDatasetsMappedToRangeAxis(java.lang.Integer)",
      "begin_line": 4352,
      "end_line": 4372,
      "comment": "\r\n     * A utility method that returns a list of datasets that are mapped to a\r\n     * particular axis.\r\n     *\r\n     * @param axisIndex  the axis index (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A list of datasets.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainAxisIndex(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 4383,
      "end_line": 4394,
      "comment": "\r\n     * Returns the index of the given domain axis.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The axis index.\r\n     *\r\n     * @see #getRangeAxisIndex(ValueAxis)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeAxisIndex(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 4405,
      "end_line": 4416,
      "comment": "\r\n     * Returns the index of the given range axis.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The axis index.\r\n     *\r\n     * @see #getDomainAxisIndex(ValueAxis)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDataRange(org.jfree.chart.axis.ValueAxis)",
      "begin_line": 4425,
      "end_line": 4521,
      "comment": "\r\n     * Returns the range for the specified axis.\r\n     *\r\n     * @param axis  the axis.\r\n     *\r\n     * @return The range.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.datasetChanged(org.jfree.data.general.DatasetChangeEvent)",
      "begin_line": 4530,
      "end_line": 4541,
      "comment": "\r\n     * Receives notification of a change to the plot\u0027s dataset.\r\n     * \u003cP\u003e\r\n     * The axis ranges are updated if necessary.\r\n     *\r\n     * @param event  information about the event (not used here).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.rendererChanged(org.jfree.chart.event.RendererChangeEvent)",
      "begin_line": 4548,
      "end_line": 4556,
      "comment": "\r\n     * Receives notification of a renderer change event.\r\n     *\r\n     * @param event  the event.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainCrosshairVisible()",
      "begin_line": 4565,
      "end_line": 4567,
      "comment": "\r\n     * Returns a flag indicating whether or not the domain crosshair is visible.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setDomainCrosshairVisible(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairVisible(boolean)",
      "begin_line": 4578,
      "end_line": 4583,
      "comment": "\r\n     * Sets the flag indicating whether or not the domain crosshair is visible\r\n     * and, if the flag changes, sends a {@link PlotChangeEvent} to all\r\n     * registered listeners.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     *\r\n     * @see #isDomainCrosshairVisible()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainCrosshairLockedOnData()",
      "begin_line": 4593,
      "end_line": 4595,
      "comment": "\r\n     * Returns a flag indicating whether or not the crosshair should \"lock-on\"\r\n     * to actual data values.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setDomainCrosshairLockedOnData(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairLockedOnData(boolean)",
      "begin_line": 4606,
      "end_line": 4611,
      "comment": "\r\n     * Sets the flag indicating whether or not the domain crosshair should\r\n     * \"lock-on\" to actual data values.  If the flag value changes, this\r\n     * method sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #isDomainCrosshairLockedOnData()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainCrosshairValue()",
      "begin_line": 4620,
      "end_line": 4622,
      "comment": "\r\n     * Returns the domain crosshair value.\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #setDomainCrosshairValue(double)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairValue(double)",
      "begin_line": 4632,
      "end_line": 4634,
      "comment": "\r\n     * Sets the domain crosshair value and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners (provided that the domain crosshair is visible).\r\n     *\r\n     * @param value  the value.\r\n     *\r\n     * @see #getDomainCrosshairValue()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairValue(double, boolean)",
      "begin_line": 4646,
      "end_line": 4651,
      "comment": "\r\n     * Sets the domain crosshair value and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners (provided that the\r\n     * domain crosshair is visible).\r\n     *\r\n     * @param value  the new value.\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getDomainCrosshairValue()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainCrosshairStroke()",
      "begin_line": 4662,
      "end_line": 4664,
      "comment": "\r\n     * Returns the {@link Stroke} used to draw the crosshair (if visible).\r\n     *\r\n     * @return The crosshair stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainCrosshairStroke(Stroke)\r\n     * @see #isDomainCrosshairVisible()\r\n     * @see #getDomainCrosshairPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairStroke(java.awt.Stroke)",
      "begin_line": 4675,
      "end_line": 4681,
      "comment": "\r\n     * Sets the Stroke used to draw the crosshairs (if visible) and notifies\r\n     * registered listeners that the axis has been modified.\r\n     *\r\n     * @param stroke  the new crosshair stroke (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     *\r\n     * @see #getDomainCrosshairStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getDomainCrosshairPaint()",
      "begin_line": 4692,
      "end_line": 4694,
      "comment": "\r\n     * Returns the domain crosshair paint.\r\n     *\r\n     * @return The crosshair paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setDomainCrosshairPaint(Paint)\r\n     * @see #isDomainCrosshairVisible()\r\n     * @see #getDomainCrosshairStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainCrosshairPaint(java.awt.Paint)",
      "begin_line": 4704,
      "end_line": 4710,
      "comment": "\r\n     * Sets the paint used to draw the crosshairs (if visible) and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint the new crosshair paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getDomainCrosshairPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeCrosshairVisible()",
      "begin_line": 4720,
      "end_line": 4722,
      "comment": "\r\n     * Returns a flag indicating whether or not the range crosshair is visible.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setRangeCrosshairVisible(boolean)\r\n     * @see #isDomainCrosshairVisible()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairVisible(boolean)",
      "begin_line": 4733,
      "end_line": 4738,
      "comment": "\r\n     * Sets the flag indicating whether or not the range crosshair is visible.\r\n     * If the flag value changes, this method sends a {@link PlotChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param flag  the new value of the flag.\r\n     *\r\n     * @see #isRangeCrosshairVisible()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeCrosshairLockedOnData()",
      "begin_line": 4748,
      "end_line": 4750,
      "comment": "\r\n     * Returns a flag indicating whether or not the crosshair should \"lock-on\"\r\n     * to actual data values.\r\n     *\r\n     * @return The flag.\r\n     *\r\n     * @see #setRangeCrosshairLockedOnData(boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairLockedOnData(boolean)",
      "begin_line": 4761,
      "end_line": 4766,
      "comment": "\r\n     * Sets the flag indicating whether or not the range crosshair should\r\n     * \"lock-on\" to actual data values.  If the flag value changes, this method\r\n     * sends a {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param flag  the flag.\r\n     *\r\n     * @see #isRangeCrosshairLockedOnData()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeCrosshairValue()",
      "begin_line": 4775,
      "end_line": 4777,
      "comment": "\r\n     * Returns the range crosshair value.\r\n     *\r\n     * @return The value.\r\n     *\r\n     * @see #setRangeCrosshairValue(double)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairValue(double)",
      "begin_line": 4789,
      "end_line": 4791,
      "comment": "\r\n     * Sets the range crosshair value.\r\n     * \u003cP\u003e\r\n     * Registered listeners are notified that the plot has been modified, but\r\n     * only if the crosshair is visible.\r\n     *\r\n     * @param value  the new value.\r\n     *\r\n     * @see #getRangeCrosshairValue()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairValue(double, boolean)",
      "begin_line": 4803,
      "end_line": 4808,
      "comment": "\r\n     * Sets the range crosshair value and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners, but only if the crosshair is visible.\r\n     *\r\n     * @param value  the new value.\r\n     * @param notify  a flag that controls whether or not listeners are\r\n     *                notified.\r\n     *\r\n     * @see #getRangeCrosshairValue()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeCrosshairStroke()",
      "begin_line": 4819,
      "end_line": 4821,
      "comment": "\r\n     * Returns the stroke used to draw the crosshair (if visible).\r\n     *\r\n     * @return The crosshair stroke (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeCrosshairStroke(Stroke)\r\n     * @see #isRangeCrosshairVisible()\r\n     * @see #getRangeCrosshairPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairStroke(java.awt.Stroke)",
      "begin_line": 4832,
      "end_line": 4838,
      "comment": "\r\n     * Sets the stroke used to draw the crosshairs (if visible) and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param stroke  the new crosshair stroke (\u003ccode\u003enull\u003c/code\u003e not\r\n     *         permitted).\r\n     *\r\n     * @see #getRangeCrosshairStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getRangeCrosshairPaint()",
      "begin_line": 4849,
      "end_line": 4851,
      "comment": "\r\n     * Returns the range crosshair paint.\r\n     *\r\n     * @return The crosshair paint (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setRangeCrosshairPaint(Paint)\r\n     * @see #isRangeCrosshairVisible()\r\n     * @see #getRangeCrosshairStroke()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangeCrosshairPaint(java.awt.Paint)",
      "begin_line": 4861,
      "end_line": 4867,
      "comment": "\r\n     * Sets the paint used to color the crosshairs (if visible) and sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param paint the new crosshair paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getRangeCrosshairPaint()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getFixedDomainAxisSpace()",
      "begin_line": 4876,
      "end_line": 4878,
      "comment": "\r\n     * Returns the fixed domain axis space.\r\n     *\r\n     * @return The fixed domain axis space (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setFixedDomainAxisSpace(AxisSpace)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 4888,
      "end_line": 4890,
      "comment": "\r\n     * Sets the fixed domain axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getFixedDomainAxisSpace()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)",
      "begin_line": 4903,
      "end_line": 4908,
      "comment": "\r\n     * Sets the fixed domain axis space and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getFixedDomainAxisSpace()\r\n     *\r\n     * @since 1.0.9\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getFixedRangeAxisSpace()",
      "begin_line": 4917,
      "end_line": 4919,
      "comment": "\r\n     * Returns the fixed range axis space.\r\n     *\r\n     * @return The fixed range axis space (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setFixedRangeAxisSpace(AxisSpace)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace)",
      "begin_line": 4929,
      "end_line": 4931,
      "comment": "\r\n     * Sets the fixed range axis space and sends a {@link PlotChangeEvent} to\r\n     * all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getFixedRangeAxisSpace()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace, boolean)",
      "begin_line": 4944,
      "end_line": 4949,
      "comment": "\r\n     * Sets the fixed range axis space and, if requested, sends a\r\n     * {@link PlotChangeEvent} to all registered listeners.\r\n     *\r\n     * @param space  the space (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getFixedRangeAxisSpace()\r\n     *\r\n     * @since 1.0.9\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainPannable()",
      "begin_line": 4959,
      "end_line": 4961,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if panning is enabled for the domain axes,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setDomainPannable(boolean)",
      "begin_line": 4971,
      "end_line": 4973,
      "comment": "\r\n     * Sets the flag that enables or disables panning of the plot along the\r\n     * domain axes.\r\n     *\r\n     * @param pannable  the new flag value.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangePannable()",
      "begin_line": 4983,
      "end_line": 4985,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if panning is enabled for the range axes,\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setRangePannable(boolean)",
      "begin_line": 4995,
      "end_line": 4997,
      "comment": "\r\n     * Sets the flag that enables or disables panning of the plot along\r\n     * the range axes.\r\n     *\r\n     * @param pannable  the new flag value.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.panDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 5008,
      "end_line": 5024,
      "comment": "\r\n     * Pans the domain axes by the specified percentage.\r\n     *\r\n     * @param percent  the distance to pan (as a percentage of the axis length).\r\n     * @param info the plot info\r\n     * @param source the source point where the pan action started.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.panRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 5035,
      "end_line": 5051,
      "comment": "\r\n     * Pans the range axes by the specified percentage.\r\n     *\r\n     * @param percent  the distance to pan (as a percentage of the axis length).\r\n     * @param info the plot info\r\n     * @param source the source point where the pan action started.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 5062,
      "end_line": 5066,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     *\r\n     * @see #zoomRangeAxes(double, PlotRenderingInfo, Point2D)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomDomainAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 5080,
      "end_line": 5103,
      "comment": "\r\n     * Multiplies the range on the domain axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (in Java2D space).\r\n     * @param useAnchor  use source point as zoom anchor?\r\n     *\r\n     * @see #zoomRangeAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomDomainAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 5119,
      "end_line": 5127,
      "comment": "\r\n     * Zooms in on the domain axis/axes.  The new lower and upper bounds are\r\n     * specified as percentages of the current axis range, where 0 percent is\r\n     * the current lower bound and 100 percent is the current upper bound.\r\n     *\r\n     * @param lowerPercent  a percentage that determines the new lower bound\r\n     *                      for the axis (e.g. 0.20 is twenty percent).\r\n     * @param upperPercent  a percentage that determines the new upper bound\r\n     *                      for the axis (e.g. 0.80 is eighty percent).\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point (ignored).\r\n     *\r\n     * @see #zoomRangeAxes(double, double, PlotRenderingInfo, Point2D)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 5138,
      "end_line": 5142,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     *\r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomRangeAxes(double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D, boolean)",
      "begin_line": 5157,
      "end_line": 5180,
      "comment": "\r\n     * Multiplies the range on the range axis/axes by the specified factor.\r\n     *\r\n     * @param factor  the zoom factor.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     * @param useAnchor  a flag that controls whether or not the source point\r\n     *         is used for the zoom anchor.\r\n     *\r\n     * @see #zoomDomainAxes(double, PlotRenderingInfo, Point2D, boolean)\r\n     *\r\n     * @since 1.0.7\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.zoomRangeAxes(double, double, org.jfree.chart.plot.PlotRenderingInfo, java.awt.geom.Point2D)",
      "begin_line": 5192,
      "end_line": 5200,
      "comment": "\r\n     * Zooms in on the range axes.\r\n     *\r\n     * @param lowerPercent  the lower bound.\r\n     * @param upperPercent  the upper bound.\r\n     * @param info  the plot rendering info.\r\n     * @param source  the source point.\r\n     *\r\n     * @see #zoomDomainAxes(double, double, PlotRenderingInfo, Point2D)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isDomainZoomable()",
      "begin_line": 5210,
      "end_line": 5212,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e, indicating that the domain axis/axes for this\r\n     * plot are zoomable.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #isRangeZoomable()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.isRangeZoomable()",
      "begin_line": 5222,
      "end_line": 5224,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e, indicating that the range axis/axes for this\r\n     * plot are zoomable.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @see #isDomainZoomable()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getSeriesCount()",
      "begin_line": 5232,
      "end_line": 5239,
      "comment": "\r\n     * Returns the number of series in the primary dataset for this plot.  If\r\n     * the dataset is \u003ccode\u003enull\u003c/code\u003e, the method returns 0.\r\n     *\r\n     * @return The series count.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getFixedLegendItems()",
      "begin_line": 5248,
      "end_line": 5250,
      "comment": "\r\n     * Returns the fixed legend items, if any.\r\n     *\r\n     * @return The legend items (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setFixedLegendItems(LegendItemCollection)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.setFixedLegendItems(org.jfree.chart.LegendItemCollection)",
      "begin_line": 5261,
      "end_line": 5264,
      "comment": "\r\n     * Sets the fixed legend items for the plot.  Leave this set to\r\n     * \u003ccode\u003enull\u003c/code\u003e if you prefer the legend items to be created\r\n     * automatically.\r\n     *\r\n     * @param items  the legend items (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getFixedLegendItems()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.getLegendItems()",
      "begin_line": 5273,
      "end_line": 5302,
      "comment": "\r\n     * Returns the legend items for the plot.  Each legend item is generated by\r\n     * the plot\u0027s renderer, since the renderer is responsible for the visual\r\n     * representation of the data.\r\n     *\r\n     * @return The legend items.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.equals(java.lang.Object)",
      "begin_line": 5311,
      "end_line": 5512,
      "comment": "\r\n     * Tests this plot for equality with another object.\r\n     *\r\n     * @param obj  the object (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clone()",
      "begin_line": 5522,
      "end_line": 5599,
      "comment": "\r\n     * Returns a clone of the plot.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  this can occur if some component of\r\n     *         the plot cannot be cloned.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 5608,
      "end_line": 5632,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the output stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.readObject(java.io.ObjectInputStream)",
      "begin_line": 5642,
      "end_line": 5704,
      "comment": "\r\n     * Provides serialization support.\r\n     *\r\n     * @param stream  the input stream.\r\n     *\r\n     * @throws IOException  if there is an I/O error.\r\n     * @throws ClassNotFoundException  if there is a classpath problem.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.canSelectByPoint()",
      "begin_line": 5715,
      "end_line": 5717,
      "comment": "\r\n     * Returns \u003ccode\u003efalse\u003c/code\u003e to indicate that this plot does not support\r\n     * selection of data items at a point (only because it hasn\u0027t been\r\n     * implemented yet).\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.canSelectByRegion()",
      "begin_line": 5727,
      "end_line": 5729,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e to indicate that this plot supports selection\r\n     * of data items by region.\r\n     *\r\n     * @return A boolean.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.select(double, double, java.awt.geom.Rectangle2D, org.jfree.chart.RenderingSource)",
      "begin_line": 5736,
      "end_line": 5739,
      "comment": "\r\n     * Selects a single point - NOT YET IMPLEMENTED.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.select(java.awt.geom.GeneralPath, java.awt.geom.Rectangle2D, org.jfree.chart.RenderingSource)",
      "begin_line": 5750,
      "end_line": 5783,
      "comment": "\r\n     * Selects the data items within the specified region.\r\n     *\r\n     * @param region  the region (in Java2D coordinates).\r\n     * @param dataArea  the data area.\r\n     * @param source  the rendering source.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.findSelectionStateForDataset(org.jfree.data.xy.XYDataset, java.lang.Object)",
      "begin_line": 5795,
      "end_line": 5804,
      "comment": "\r\n     * Returns the selection state for the specified dataset.  This could be\r\n     * \u003ccode\u003enull\u003c/code\u003e if the dataset hasn\u0027t been set up to support\r\n     * selections.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param source  the selection source.\r\n     *\r\n     * @return The selection state (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.convertToDataSpace(java.awt.geom.GeneralPath, java.awt.geom.Rectangle2D, org.jfree.data.xy.XYDataset)",
      "begin_line": 5816,
      "end_line": 5842,
      "comment": "\r\n     * Converts a path from Java2D space to data space.\r\n     *\r\n     * @param path  the path (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataArea  the data area.\r\n     * @param dataset  the dataset which can be used to find the appropriate\r\n     *         axes.\r\n     *\r\n     * @return A path in data space.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.plot.XYPlot.clearSelection()",
      "begin_line": 5849,
      "end_line": 5864,
      "comment": "\r\n     * Clears the selection.\r\n     *\r\n     * @since 1.2.0\r\n     "
    }
  ]
}