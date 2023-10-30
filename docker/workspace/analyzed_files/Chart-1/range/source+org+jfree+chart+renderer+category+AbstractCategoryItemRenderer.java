{
  "filepath": "/tmp/Chart-1f/source/org/jfree/chart/renderer/category/AbstractCategoryItemRenderer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractCategoryItemRenderer",
      "is_interface": false,
      "parent_types": [
        "org.jfree.chart.renderer.AbstractRenderer",
        "org.jfree.chart.renderer.category.CategoryItemRenderer",
        "java.lang.Cloneable",
        "org.jfree.chart.util.PublicCloneable",
        "java.io.Serializable"
      ],
      "begin_line": 183,
      "end_line": 1994,
      "comment": "\r\n * An abstract base class that you can use to implement a new\r\n * {@link CategoryItemRenderer}.  When you create a new\r\n * {@link CategoryItemRenderer} you are not required to extend this class,\r\n * but it makes the job easier.\r\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " For serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "plot"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " The plot that the renderer is assigned to. "
    },
    {
      "type": "field",
      "varNames": [
        "itemLabelGeneratorList"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " A list of item label generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseItemLabelGenerator"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " The base item label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "toolTipGeneratorList"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " A list of tool tip generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseToolTipGenerator"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " The base tool tip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "urlGeneratorList"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " A list of label generators (one per series). "
    },
    {
      "type": "field",
      "varNames": [
        "baseURLGenerator"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " The base label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemLabelGenerator"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " The legend item label generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemToolTipGenerator"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " The legend item tool tip generator. "
    },
    {
      "type": "field",
      "varNames": [
        "legendItemURLGenerator"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": " The legend item URL generator. "
    },
    {
      "type": "field",
      "varNames": [
        "backgroundAnnotations"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": "\r\n     * Annotations to be drawn in the background layer (\u0027underneath\u0027 the data\r\n     * items).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "foregroundAnnotations"
      ],
      "begin_line": 234,
      "end_line": 234,
      "comment": "\r\n     * Annotations to be drawn in the foreground layer (\u0027on top\u0027 of the data\r\n     * items).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rowCount"
      ],
      "begin_line": 237,
      "end_line": 237,
      "comment": " The number of rows in the dataset (temporary record). "
    },
    {
      "type": "field",
      "varNames": [
        "columnCount"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": " The number of columns in the dataset (temporary record). "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.AbstractCategoryItemRenderer()",
      "begin_line": 249,
      "end_line": 257,
      "comment": "\r\n     * Creates a new renderer with no tool tip generator and no URL generator.\r\n     * The defaults (no tool tip or URL generators) have been chosen to\r\n     * minimise the processing required to generate a default chart.  If you\r\n     * require tool tips or URLs, then you can easily add the required\r\n     * generators.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getPassCount()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\r\n     * Returns the number of passes through the dataset required by the\r\n     * renderer.  This method returns \u003ccode\u003e1\u003c/code\u003e, subclasses should\r\n     * override if they need more passes.\r\n     *\r\n     * @return The pass count.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getPlot()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\r\n     * Returns the plot that the renderer has been assigned to (where\r\n     * \u003ccode\u003enull\u003c/code\u003e indicates that the renderer is not currently assigned\r\n     * to a plot).\r\n     *\r\n     * @return The plot (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setPlot(CategoryPlot)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setPlot(org.jfree.chart.plot.CategoryPlot)",
      "begin_line": 292,
      "end_line": 297,
      "comment": "\r\n     * Sets the plot that the renderer has been assigned to.  This method is\r\n     * usually called by the {@link CategoryPlot}, in normal usage you\r\n     * shouldn\u0027t need to call this method directly.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getPlot()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemLabelGenerator(int, int, boolean)",
      "begin_line": 315,
      "end_line": 323,
      "comment": "\r\n     * Returns the item label generator for a data item.  This implementation\r\n     * returns the series item label generator if one is defined, otherwise\r\n     * it returns the default item label generator (which may be\r\n     * \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesItemLabelGenerator(int)",
      "begin_line": 334,
      "end_line": 337,
      "comment": "\r\n     * Returns the item label generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesItemLabelGenerator(int, CategoryItemLabelGenerator)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator)",
      "begin_line": 348,
      "end_line": 351,
      "comment": "\r\n     * Sets the item label generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesItemLabelGenerator(int, org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)",
      "begin_line": 365,
      "end_line": 371,
      "comment": "\r\n     * Sets the item label generator for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesItemLabelGenerator(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getBaseItemLabelGenerator()",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\r\n     * Returns the base item label generator.\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseItemLabelGenerator(CategoryItemLabelGenerator)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator)",
      "begin_line": 392,
      "end_line": 395,
      "comment": "\r\n     * Sets the base item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseItemLabelGenerator()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator, boolean)",
      "begin_line": 408,
      "end_line": 414,
      "comment": "\r\n     * Sets the base item label generator and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseItemLabelGenerator()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getToolTipGenerator(int, int, boolean)",
      "begin_line": 431,
      "end_line": 440,
      "comment": "\r\n     * Returns the tool tip generator that should be used for the specified\r\n     * item.  You can override this method if you want to return a different\r\n     * generator per item.\r\n     *\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesToolTipGenerator(int)",
      "begin_line": 452,
      "end_line": 454,
      "comment": "\r\n     * Returns the tool tip generator for the specified series (a \"layer 1\"\r\n     * generator).\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setSeriesToolTipGenerator(int, CategoryToolTipGenerator)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator)",
      "begin_line": 465,
      "end_line": 468,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getSeriesToolTipGenerator(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesToolTipGenerator(int, org.jfree.chart.labels.CategoryToolTipGenerator, boolean)",
      "begin_line": 483,
      "end_line": 489,
      "comment": "\r\n     * Sets the tool tip generator for a series and sends a\r\n     * {@link org.jfree.chart.event.RendererChangeEvent} to all registered\r\n     * listeners.\r\n     *\r\n     * @param series  the series index (zero-based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesToolTipGenerator(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getBaseToolTipGenerator()",
      "begin_line": 498,
      "end_line": 500,
      "comment": "\r\n     * Returns the base tool tip generator (the \"layer 2\" generator).\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setBaseToolTipGenerator(CategoryToolTipGenerator)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator)",
      "begin_line": 510,
      "end_line": 512,
      "comment": "\r\n     * Sets the base tool tip generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getBaseToolTipGenerator()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator, boolean)",
      "begin_line": 525,
      "end_line": 531,
      "comment": "\r\n     * Sets the base tool tip generator and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getBaseToolTipGenerator()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getURLGenerator(int, int, boolean)",
      "begin_line": 546,
      "end_line": 554,
      "comment": "\r\n     * Returns the URL generator for a data item.\r\n     *\r\n     * @param row  the row index (zero based).\r\n     * @param column  the column index (zero based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return The URL generator.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getSeriesURLGenerator(int)",
      "begin_line": 565,
      "end_line": 567,
      "comment": "\r\n     * Returns the URL generator for a series.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     *\r\n     * @return The URL generator for the series.\r\n     *\r\n     * @see #setSeriesURLGenerator(int, CategoryURLGenerator)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator)",
      "begin_line": 578,
      "end_line": 581,
      "comment": "\r\n     * Sets the URL generator for a series and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator.\r\n     *\r\n     * @see #getSeriesURLGenerator(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setSeriesURLGenerator(int, org.jfree.chart.urls.CategoryURLGenerator, boolean)",
      "begin_line": 595,
      "end_line": 601,
      "comment": "\r\n     * Sets the URL generator for a series and, if requested, sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param series  the series index (zero based).\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @since 1.2.0\r\n     *\r\n     * @see #getSeriesURLGenerator(int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getBaseURLGenerator()",
      "begin_line": 610,
      "end_line": 612,
      "comment": "\r\n     * Returns the base item URL generator.\r\n     *\r\n     * @return The item URL generator.\r\n     *\r\n     * @see #setBaseURLGenerator(CategoryURLGenerator)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator)",
      "begin_line": 621,
      "end_line": 623,
      "comment": "\r\n     * Sets the base item URL generator.\r\n     *\r\n     * @param generator  the item URL generator.\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator, boolean)",
      "begin_line": 635,
      "end_line": 641,
      "comment": "\r\n     * Sets the base item URL generator.\r\n     *\r\n     * @param generator  the item URL generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param notify  notify listeners?\r\n     *\r\n     * @see #getBaseURLGenerator()\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 654,
      "end_line": 657,
      "comment": "\r\n     * Adds an annotation and sends a {@link RendererChangeEvent} to all\r\n     * registered listeners.  The annotation is added to the foreground\r\n     * layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addAnnotation(org.jfree.chart.annotations.CategoryAnnotation, org.jfree.chart.util.Layer)",
      "begin_line": 667,
      "end_line": 683,
      "comment": "\r\n     * Adds an annotation to the specified layer.\r\n     *\r\n     * @param annotation  the annotation (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param layer  the layer (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation)",
      "begin_line": 696,
      "end_line": 701,
      "comment": "\r\n     * Removes the specified annotation and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @param annotation  the annotation to remove (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                    permitted).\r\n     *\r\n     * @return A boolean to indicate whether or not the annotation was\r\n     *         successfully removed.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.removeAnnotations()",
      "begin_line": 709,
      "end_line": 713,
      "comment": "\r\n     * Removes all annotations and sends a {@link RendererChangeEvent}\r\n     * to all registered listeners.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItemLabelGenerator()",
      "begin_line": 722,
      "end_line": 724,
      "comment": "\r\n     * Returns the legend item label generator.\r\n     *\r\n     * @return The label generator (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemLabelGenerator(CategorySeriesLabelGenerator)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setLegendItemLabelGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 734,
      "end_line": 741,
      "comment": "\r\n     * Sets the legend item label generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #getLegendItemLabelGenerator()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItemToolTipGenerator()",
      "begin_line": 750,
      "end_line": 752,
      "comment": "\r\n     * Returns the legend item tool tip generator.\r\n     *\r\n     * @return The tool tip generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(CategorySeriesLabelGenerator)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setLegendItemToolTipGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 762,
      "end_line": 766,
      "comment": "\r\n     * Sets the legend item tool tip generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #setLegendItemToolTipGenerator(CategorySeriesLabelGenerator)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItemURLGenerator()",
      "begin_line": 775,
      "end_line": 777,
      "comment": "\r\n     * Returns the legend item URL generator.\r\n     *\r\n     * @return The URL generator (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #setLegendItemURLGenerator(CategorySeriesLabelGenerator)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.setLegendItemURLGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator)",
      "begin_line": 787,
      "end_line": 791,
      "comment": "\r\n     * Sets the legend item URL generator and sends a\r\n     * {@link RendererChangeEvent} to all registered listeners.\r\n     *\r\n     * @param generator  the generator (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @see #getLegendItemURLGenerator()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRowCount()",
      "begin_line": 799,
      "end_line": 801,
      "comment": "\r\n     * Returns the number of rows in the dataset.  This value is updated in the\r\n     * {@link AbstractCategoryItemRenderer#initialise} method.\r\n     *\r\n     * @return The row count.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getColumnCount()",
      "begin_line": 809,
      "end_line": 811,
      "comment": "\r\n     * Returns the number of columns in the dataset.  This value is updated in\r\n     * the {@link AbstractCategoryItemRenderer#initialise} method.\r\n     *\r\n     * @return The column count.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.createState(org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 825,
      "end_line": 840,
      "comment": "\r\n     * Creates a new state instance---this method is called from the\r\n     * {@link #initialise(Graphics2D, Rectangle2D, CategoryPlot, int,\r\n     * PlotRenderingInfo)} method.  Subclasses can override this method if\r\n     * they need to use a subclass of {@link CategoryItemRendererState}.\r\n     *\r\n     * @param info  collects plot rendering info (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The new state instance (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.initialise(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.data.category.CategoryDataset, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 856,
      "end_line": 890,
      "comment": "\r\n     * Initialises the renderer and returns a state object that will be used\r\n     * for the remainder of the drawing process for a single chart.  The state\r\n     * object allows for the fact that the renderer may be used simultaneously\r\n     * by multiple threads (each thread will work with a separate state object).\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param plot  the plot.\r\n     * @param info  an object for returning information about the structure of\r\n     *              the plot (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The renderer state.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 901,
      "end_line": 903,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return The range (or \u003ccode\u003enull\u003c/code\u003e if the dataset is\r\n     *         \u003ccode\u003enull\u003c/code\u003e or empty).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.findRangeBounds(org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 917,
      "end_line": 936,
      "comment": "\r\n     * Returns the range of values the renderer requires to display all the\r\n     * items from the specified dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     * @param includeInterval  include the y-interval if the dataset has one.\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset is \u003ccode\u003enull\u003c/code\u003e\r\n     *         or empty).\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getItemMiddle(java.lang.Comparable, java.lang.Comparable, org.jfree.data.category.CategoryDataset, org.jfree.chart.axis.CategoryAxis, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleEdge)",
      "begin_line": 952,
      "end_line": 957,
      "comment": "\r\n     * Returns the Java2D coordinate for the middle of the specified data item.\r\n     *\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param dataset  the dataset.\r\n     * @param axis  the axis.\r\n     * @param area  the data area.\r\n     * @param edge  the edge along which the axis lies.\r\n     *\r\n     * @return The Java2D coordinate for the middle of the item.\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawBackground(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 968,
      "end_line": 974,
      "comment": "\r\n     * Draws a background for the data area.  The default implementation just\r\n     * gets the plot to draw the background, but some renderers will override\r\n     * this behaviour.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawOutline(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D)",
      "begin_line": 985,
      "end_line": 991,
      "comment": "\r\n     * Draws an outline for the data area.  The default implementation just\r\n     * gets the plot to draw the outline, but some renderers will override this\r\n     * behaviour.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the data area.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawDomainLine(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1013,
      "end_line": 1038,
      "comment": "\r\n     * Draws a grid line against the domain axis.\r\n     * \u003cP\u003e\r\n     * Note that this default implementation assumes that the horizontal axis\r\n     * is the domain axis. If this is not the case, you will need to override\r\n     * this method.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any\r\n     *                  3D effect).\r\n     * @param value  the Java2D value at which the grid line should be drawn.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #drawRangeGridline(Graphics2D, CategoryPlot, ValueAxis,\r\n     *     Rectangle2D, double)\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeLine(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, java.awt.geom.Rectangle2D, double, java.awt.Paint, java.awt.Stroke)",
      "begin_line": 1056,
      "end_line": 1080,
      "comment": "\r\n     * Draws a line perpendicular to the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param plot  the plot.\r\n     * @param axis  the value axis.\r\n     * @param dataArea  the area for plotting data (not yet adjusted for any 3D\r\n     *                  effect).\r\n     * @param value  the value at which the grid line should be drawn.\r\n     * @param paint  the paint (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param stroke  the stroke (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @see #drawRangeGridline\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawDomainMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.plot.CategoryMarker, java.awt.geom.Rectangle2D)",
      "begin_line": 1094,
      "end_line": 1166,
      "comment": "\r\n     * Draws a marker for the domain axis.\r\n     *\r\n     * @param g2  the graphics device (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param plot  the plot (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param axis  the range axis (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param marker  the marker to be drawn (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param dataArea  the area inside the axes (not \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #drawRangeMarker(Graphics2D, CategoryPlot, ValueAxis, Marker,\r\n     *     Rectangle2D)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawRangeMarker(java.awt.Graphics2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.ValueAxis, org.jfree.chart.plot.Marker, java.awt.geom.Rectangle2D)",
      "begin_line": 1180,
      "end_line": 1334,
      "comment": "\r\n     * Draws a marker for the range axis.\r\n     *\r\n     * @param g2  the graphics device (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param plot  the plot (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param axis  the range axis (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param marker  the marker to be drawn (not \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param dataArea  the area inside the axes (not \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #drawDomainMarker(Graphics2D, CategoryPlot, CategoryAxis,\r\n     *     CategoryMarker, Rectangle2D)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.calculateDomainMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 1350,
      "end_line": 1369,
      "comment": "\r\n     * Calculates the (x, y) coordinates for drawing the label for a marker on\r\n     * the range axis.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param markerArea  the rectangle surrounding the marker.\r\n     * @param markerOffset  the marker offset.\r\n     * @param labelOffsetType  the label offset type.\r\n     * @param anchor  the label anchor.\r\n     *\r\n     * @return The coordinates for drawing the marker label.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.calculateRangeMarkerTextAnchorPoint(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D, org.jfree.chart.util.RectangleInsets, org.jfree.chart.util.LengthAdjustmentType, org.jfree.chart.util.RectangleAnchor)",
      "begin_line": 1384,
      "end_line": 1403,
      "comment": "\r\n     * Calculates the (x, y) coordinates for drawing a marker label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the plot orientation.\r\n     * @param dataArea  the data area.\r\n     * @param markerArea  the rectangle surrounding the marker.\r\n     * @param markerOffset  the marker offset.\r\n     * @param labelOffsetType  the label offset type.\r\n     * @param anchor  the label anchor.\r\n     *\r\n     * @return The coordinates for drawing the marker label.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItem(int, int)",
      "begin_line": 1417,
      "end_line": 1460,
      "comment": "\r\n     * Returns a legend item for a series.  This default implementation will\r\n     * return \u003ccode\u003enull\u003c/code\u003e if {@link #isSeriesVisible(int)} or\r\n     * {@link #isSeriesVisibleInLegend(int)} returns \u003ccode\u003efalse\u003c/code\u003e.\r\n     *\r\n     * @param datasetIndex  the dataset index (zero-based).\r\n     * @param series  the series index (zero-based).\r\n     *\r\n     * @return The legend item (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getLegendItems()\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.equals(java.lang.Object)",
      "begin_line": 1469,
      "end_line": 1524,
      "comment": "\r\n     * Tests this renderer for equality with another object.\r\n     *\r\n     * @param obj  the object.\r\n     *\r\n     * @return \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.hashCode()",
      "begin_line": 1531,
      "end_line": 1534,
      "comment": "\r\n     * Returns a hash code for the renderer.\r\n     *\r\n     * @return The hash code.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getDrawingSupplier()",
      "begin_line": 1541,
      "end_line": 1548,
      "comment": "\r\n     * Returns the drawing supplier from the plot.\r\n     *\r\n     * @return The drawing supplier (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.updateCrosshairValues(org.jfree.chart.plot.CategoryCrosshairState, java.lang.Comparable, java.lang.Comparable, double, int, double, double, org.jfree.chart.plot.PlotOrientation)",
      "begin_line": 1568,
      "end_line": 1588,
      "comment": "\r\n     * Considers the current (x, y) coordinate and updates the crosshair point\r\n     * if it meets the criteria (usually means the (x, y) coordinate is the\r\n     * closest to the anchor point so far).\r\n     *\r\n     * @param crosshairState  the crosshair state (\u003ccode\u003enull\u003c/code\u003e permitted,\r\n     *                        but the method does nothing in that case).\r\n     * @param rowKey  the row key.\r\n     * @param columnKey  the column key.\r\n     * @param value  the data value.\r\n     * @param datasetIndex  the dataset index.\r\n     * @param transX  the x-value translated to Java2D space.\r\n     * @param transY  the y-value translated to Java2D space.\r\n     * @param orientation  the plot orientation (\u003ccode\u003enull\u003c/code\u003e not\r\n     *                     permitted).\r\n     *\r\n     * @since 1.0.11\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawItemLabel(java.awt.Graphics2D, org.jfree.chart.plot.PlotOrientation, org.jfree.data.category.CategoryDataset, int, int, boolean, double, double, boolean)",
      "begin_line": 1606,
      "end_line": 1633,
      "comment": "\r\n     * Draws an item label.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param orientation  the orientation.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row.\r\n     * @param column  the column.\r\n     * @param selected  is the item selected?\r\n     * @param x  the x coordinate (in Java2D space).\r\n     * @param y  the y coordinate (in Java2D space).\r\n     * @param negative  indicates a negative value (which affects the item\r\n     *                  label position).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.drawAnnotations(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.chart.util.Layer, org.jfree.chart.plot.PlotRenderingInfo)",
      "begin_line": 1647,
      "end_line": 1668,
      "comment": "\r\n     * Draws all the annotations for the specified layer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the data area.\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param layer  the layer.\r\n     * @param info  the plot rendering info.\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.clone()",
      "begin_line": 1680,
      "end_line": 1750,
      "comment": "\r\n     * Returns an independent copy of the renderer.  The \u003ccode\u003eplot\u003c/code\u003e\r\n     * reference is shallow copied.\r\n     *\r\n     * @return A clone.\r\n     *\r\n     * @throws CloneNotSupportedException  can be thrown if one of the objects\r\n     *         belonging to the renderer does not support cloning (for example,\r\n     *         an item label generator).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getDomainAxis(org.jfree.chart.plot.CategoryPlot, org.jfree.data.category.CategoryDataset)",
      "begin_line": 1760,
      "end_line": 1764,
      "comment": "\r\n     * Returns the domain axis that is used for the specified dataset.\r\n     *\r\n     * @param plot  the plot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A domain axis.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getRangeAxis(org.jfree.chart.plot.CategoryPlot, int)",
      "begin_line": 1774,
      "end_line": 1780,
      "comment": "\r\n     * Returns a range axis for a plot.\r\n     *\r\n     * @param plot  the plot.\r\n     * @param index  the axis index.\r\n     *\r\n     * @return A range axis.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.getLegendItems()",
      "begin_line": 1790,
      "end_line": 1822,
      "comment": "\r\n     * Returns a (possibly empty) collection of legend items for the series\r\n     * that this renderer is responsible for drawing.\r\n     *\r\n     * @return The legend item collection (never \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #getLegendItem(int, int)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity(org.jfree.chart.entity.EntityCollection, java.awt.Shape, org.jfree.data.category.CategoryDataset, int, int, boolean)",
      "begin_line": 1836,
      "end_line": 1843,
      "comment": "\r\n     * Adds an entity with the specified hotspot.\r\n     *\r\n     * @param entities  the entity collection.\r\n     * @param hotspot  the hotspot (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index.\r\n     * @param column  the column index.\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.addEntity(org.jfree.chart.entity.EntityCollection, java.awt.Shape, org.jfree.data.category.CategoryDataset, int, int, boolean, double, double)",
      "begin_line": 1862,
      "end_line": 1893,
      "comment": "\r\n     * Adds an entity to the collection.\r\n     *\r\n     * @param entities  the entity collection being populated.\r\n     * @param hotspot  the entity area (if \u003ccode\u003enull\u003c/code\u003e a default will be\r\n     *              used).\r\n     * @param dataset  the dataset.\r\n     * @param row  the series.\r\n     * @param column  the item.\r\n     * @param selected  is the item selected?\r\n     * @param entityX  the entity\u0027s center x-coordinate in user space (only\r\n     *                 used if \u003ccode\u003earea\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e).\r\n     * @param entityY  the entity\u0027s center y-coordinate in user space (only\r\n     *                 used if \u003ccode\u003earea\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.2.0\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.createHotSpotShape(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, org.jfree.chart.renderer.category.CategoryItemRendererState)",
      "begin_line": 1912,
      "end_line": 1917,
      "comment": "\r\n     * Returns a shape that can be used for hit testing on a data item drawn\r\n     * by the renderer.\r\n     *\r\n     * @param g2  the graphics device.\r\n     * @param dataArea  the area within which the data is being rendered.\r\n     * @param plot  the plot (can be used to obtain standard color\r\n     *              information etc).\r\n     * @param domainAxis  the domain axis.\r\n     * @param rangeAxis  the range axis.\r\n     * @param dataset  the dataset.\r\n     * @param row  the row index (zero-based).\r\n     * @param column  the column index (zero-based).\r\n     * @param selected  is the item selected?\r\n     *\r\n     * @return A shape equal to the hot spot for a data item.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.createHotSpotBounds(java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, org.jfree.chart.renderer.category.CategoryItemRendererState, java.awt.geom.Rectangle2D)",
      "begin_line": 1937,
      "end_line": 1956,
      "comment": "\r\n     * Returns the rectangular bounds for the hot spot for an item drawn by\r\n     * this renderer.  This is intended to provide a quick test for\r\n     * eliminating data points before more accurate testing against the\r\n     * shape returned by createHotSpotShape().\r\n     *\r\n     * @param g2\r\n     * @param dataArea\r\n     * @param plot\r\n     * @param domainAxis\r\n     * @param rangeAxis\r\n     * @param dataset\r\n     * @param row\r\n     * @param column\r\n     * @param selected\r\n     * @param result\r\n     * @return\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.hitTest(double, double, java.awt.Graphics2D, java.awt.geom.Rectangle2D, org.jfree.chart.plot.CategoryPlot, org.jfree.chart.axis.CategoryAxis, org.jfree.chart.axis.ValueAxis, org.jfree.data.category.CategoryDataset, int, int, boolean, org.jfree.chart.renderer.category.CategoryItemRendererState)",
      "begin_line": 1979,
      "end_line": 1992,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the specified point (xx, yy) in Java2D\r\n     * space falls within the \"hot spot\" for the specified data item, and\r\n     * \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param xx\r\n     * @param yy\r\n     * @param g2\r\n     * @param dataArea\r\n     * @param plot\r\n     * @param domainAxis\r\n     * @param rangeAxis\r\n     * @param dataset\r\n     * @param row\r\n     * @param column\r\n     * @param selected\r\n     *\r\n     * @return\r\n     *\r\n     * @since 1.2.0\r\n     "
    }
  ]
}