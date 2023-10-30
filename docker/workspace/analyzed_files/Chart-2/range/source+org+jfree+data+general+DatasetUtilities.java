{
  "filepath": "/tmp/Chart-2f/source/org/jfree/data/general/DatasetUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DatasetUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 162,
      "end_line": 2180,
      "comment": "\r\n * A collection of useful static methods relating to datasets.\r\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.data.general.DatasetUtilities.DatasetUtilities()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\r\n     * Private constructor for non-instanceability.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(org.jfree.data.pie.PieDataset)",
      "begin_line": 180,
      "end_line": 201,
      "comment": "\r\n     * Calculates the total of all the values in a {@link PieDataset}.  If\r\n     * the dataset contains negative or \u003ccode\u003enull\u003c/code\u003e values, they are\r\n     * ignored.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The total.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(org.jfree.data.category.CategoryDataset, java.lang.Comparable)",
      "begin_line": 212,
      "end_line": 216,
      "comment": "\r\n     * Creates a pie dataset from a table dataset by taking all the values\r\n     * for a single row.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rowKey  the row key.\r\n     *\r\n     * @return A pie dataset.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 227,
      "end_line": 236,
      "comment": "\r\n     * Creates a pie dataset from a table dataset by taking all the values\r\n     * for a single row.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param row  the row (zero-based index).\r\n     *\r\n     * @return A pie dataset.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(org.jfree.data.category.CategoryDataset, java.lang.Comparable)",
      "begin_line": 247,
      "end_line": 251,
      "comment": "\r\n     * Creates a pie dataset from a table dataset by taking all the values\r\n     * for a single column.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKey  the column key.\r\n     *\r\n     * @return A pie dataset.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(org.jfree.data.category.CategoryDataset, int)",
      "begin_line": 262,
      "end_line": 271,
      "comment": "\r\n     * Creates a pie dataset from a {@link CategoryDataset} by taking all the\r\n     * values for a single column.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param column  the column (zero-based index).\r\n     *\r\n     * @return A pie dataset.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(org.jfree.data.pie.PieDataset, java.lang.Comparable, double)",
      "begin_line": 286,
      "end_line": 290,
      "comment": "\r\n     * Creates a new pie dataset based on the supplied dataset, but modified\r\n     * by aggregating all the low value items (those whose value is lower\r\n     * than the \u003ccode\u003epercentThreshold\u003c/code\u003e) into a single item with the\r\n     * key \"Other\".\r\n     *\r\n     * @param source  the source dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  a new key for the aggregated items (\u003ccode\u003enull\u003c/code\u003e not\r\n     *             permitted).\r\n     * @param minimumPercent  the percent threshold.\r\n     *\r\n     * @return The pie dataset with (possibly) aggregated items.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(org.jfree.data.pie.PieDataset, java.lang.Comparable, double, int)",
      "begin_line": 307,
      "end_line": 351,
      "comment": "\r\n     * Creates a new pie dataset based on the supplied dataset, but modified\r\n     * by aggregating all the low value items (those whose value is lower\r\n     * than the \u003ccode\u003epercentThreshold\u003c/code\u003e) into a single item.  The\r\n     * aggregated items are assigned the specified key.  Aggregation only\r\n     * occurs if there are at least \u003ccode\u003eminItems\u003c/code\u003e items to aggregate.\r\n     *\r\n     * @param source  the source dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param key  the key to represent the aggregated items.\r\n     * @param minimumPercent  the percent threshold (ten percent is 0.10).\r\n     * @param minItems  only aggregate low values if there are at least this\r\n     *                  many.\r\n     *\r\n     * @return The pie dataset with (possibly) aggregated items.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.String, java.lang.String, double[][])",
      "begin_line": 367,
      "end_line": 380,
      "comment": "\r\n     * Creates a {@link CategoryDataset} that contains a copy of the data in an\r\n     * array (instances of \u003ccode\u003eDouble\u003c/code\u003e are created to represent the\r\n     * data items).\r\n     * \u003cp\u003e\r\n     * Row and column keys are created by appending 0, 1, 2, ... to the\r\n     * supplied prefixes.\r\n     *\r\n     * @param rowKeyPrefix  the row key prefix.\r\n     * @param columnKeyPrefix  the column key prefix.\r\n     * @param data  the data.\r\n     *\r\n     * @return The dataset.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.String, java.lang.String, java.lang.Number[][])",
      "begin_line": 395,
      "end_line": 408,
      "comment": "\r\n     * Creates a {@link CategoryDataset} that contains a copy of the data in\r\n     * an array.\r\n     * \u003cp\u003e\r\n     * Row and column keys are created by appending 0, 1, 2, ... to the\r\n     * supplied prefixes.\r\n     *\r\n     * @param rowKeyPrefix  the row key prefix.\r\n     * @param columnKeyPrefix  the column key prefix.\r\n     * @param data  the data.\r\n     *\r\n     * @return The dataset.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.Comparable[], java.lang.Comparable[], double[][])",
      "begin_line": 423,
      "end_line": 466,
      "comment": "\r\n     * Creates a {@link CategoryDataset} that contains a copy of the data in\r\n     * an array (instances of \u003ccode\u003eDouble\u003c/code\u003e are created to represent the\r\n     * data items).\r\n     * \u003cp\u003e\r\n     * Row and column keys are taken from the supplied arrays.\r\n     *\r\n     * @param rowKeys  the row keys (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param columnKeys  the column keys (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param data  the data.\r\n     *\r\n     * @return The dataset.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.createCategoryDataset(java.lang.Comparable, org.jfree.data.KeyedValues)",
      "begin_line": 477,
      "end_line": 492,
      "comment": "\r\n     * Creates a {@link CategoryDataset} by copying the data from the supplied\r\n     * {@link KeyedValues} instance.\r\n     *\r\n     * @param rowKey  the row key (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param rowData  the row data (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A dataset.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.sampleFunction2D(org.jfree.data.function.Function2D, double, double, int, java.lang.Comparable)",
      "begin_line": 507,
      "end_line": 515,
      "comment": "\r\n     * Creates an {@link XYDataset} by sampling the specified function over a\r\n     * fixed range.\r\n     *\r\n     * @param f  the function (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param start  the start value for the range.\r\n     * @param end  the end value for the range.\r\n     * @param samples  the number of sample points (must be \u003e 1).\r\n     * @param seriesKey  the key to give the resulting series\r\n     *                   (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A dataset.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(org.jfree.data.function.Function2D, double, double, int, java.lang.Comparable)",
      "begin_line": 532,
      "end_line": 555,
      "comment": "\r\n     * Creates an {@link XYSeries} by sampling the specified function over a\r\n     * fixed range.\r\n     *\r\n     * @param f  the function (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param start  the start value for the range.\r\n     * @param end  the end value for the range.\r\n     * @param samples  the number of sample points (must be \u003e 1).\r\n     * @param seriesKey  the key to give the resulting series\r\n     *                   (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return A series.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.isEmptyOrNull(org.jfree.data.pie.PieDataset)",
      "begin_line": 565,
      "end_line": 588,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the dataset is empty (or \u003ccode\u003enull\u003c/code\u003e),\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.isEmptyOrNull(org.jfree.data.category.CategoryDataset)",
      "begin_line": 598,
      "end_line": 621,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the dataset is empty (or \u003ccode\u003enull\u003c/code\u003e),\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.isEmptyOrNull(org.jfree.data.xy.XYDataset)",
      "begin_line": 631,
      "end_line": 640,
      "comment": "\r\n     * Returns \u003ccode\u003etrue\u003c/code\u003e if the dataset is empty (or \u003ccode\u003enull\u003c/code\u003e),\r\n     * and \u003ccode\u003efalse\u003c/code\u003e otherwise.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e permitted).\r\n     *\r\n     * @return A boolean.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 649,
      "end_line": 651,
      "comment": "\r\n     * Returns the range of values in the domain (x-values) of a dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range of values (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findDomainBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 663,
      "end_line": 681,
      "comment": "\r\n     * Returns the range of values in the domain (x-values) of a dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  determines whether or not the x-interval is taken\r\n     *                         into account (only applies if the dataset is an\r\n     *                         {@link IntervalXYDataset}).\r\n     *\r\n     * @return The range of values (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findDomainBounds(org.jfree.data.xy.XYDataset, java.util.List, boolean)",
      "begin_line": 698,
      "end_line": 713,
      "comment": "\r\n     * Returns the bounds of the x-values in the specified \u003ccode\u003edataset\u003c/code\u003e\r\n     * taking into account only the visible series and including any x-interval\r\n     * if requested.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param visibleSeriesKeys  the visible series keys (\u003ccode\u003enull\u003c/code\u003e\r\n     *     not permitted).\r\n     * @param includeInterval  include the x-interval (if any)?\r\n     *\r\n     * @return The bounds (or \u003ccode\u003enull\u003c/code\u003e if the dataset contains no\r\n     *     values.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateDomainBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 725,
      "end_line": 727,
      "comment": "\r\n     * Iterates over the items in an {@link XYDataset} to find\r\n     * the range of x-values.  If the dataset is an instance of\r\n     * {@link IntervalXYDataset}, the starting and ending x-values\r\n     * will be used for the bounds calculation.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateDomainBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 740,
      "end_line": 792,
      "comment": "\r\n     * Iterates over the items in an {@link XYDataset} to find\r\n     * the range of x-values.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines, for an\r\n     *          {@link IntervalXYDataset}, whether the x-interval or just the\r\n     *          x-value is used to determine the overall range.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 801,
      "end_line": 803,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 814,
      "end_line": 828,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.category.CategoryDataset, java.util.List, boolean)",
      "begin_line": 844,
      "end_line": 859,
      "comment": "\r\n     * Finds the bounds of the y-values in the specified dataset, including\r\n     * only those series that are listed in visibleSeriesKeys.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param visibleSeriesKeys  the keys for the visible series\r\n     *     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  include the y-interval (if the dataset has a\r\n     *     y-interval).\r\n     *\r\n     * @return The data bounds.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 869,
      "end_line": 871,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.  This method\r\n     * is the partner for the {@link #findDomainBounds(XYDataset)} method.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 884,
      "end_line": 898,
      "comment": "\r\n     * Returns the range of values in the range for the dataset.  This method\r\n     * is the partner for the {@link #findDomainBounds(XYDataset, boolean)}\r\n     * method.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findRangeBounds(org.jfree.data.xy.XYDataset, java.util.List, org.jfree.data.Range, boolean)",
      "begin_line": 916,
      "end_line": 932,
      "comment": "\r\n     * Finds the bounds of the y-values in the specified dataset, including\r\n     * only those series that are listed in visibleSeriesKeys, and those items\r\n     * whose x-values fall within the specified range.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param visibleSeriesKeys  the keys for the visible series\r\n     *     (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param xRange  the x-range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  include the y-interval (if the dataset has a\r\n     *     y-interval).\r\n     *\r\n     * @return The data bounds.\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateCategoryRangeBounds(org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 947,
      "end_line": 950,
      "comment": "\r\n     * Iterates over the data item of the category dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @deprecated As of 1.0.10, use\r\n     *         {@link #iterateRangeBounds(CategoryDataset, boolean)}.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 962,
      "end_line": 964,
      "comment": "\r\n     * Iterates over the data item of the category dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateRangeBounds(org.jfree.data.category.CategoryDataset, boolean)",
      "begin_line": 978,
      "end_line": 1034,
      "comment": "\r\n     * Iterates over the data item of the category dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(org.jfree.data.category.CategoryDataset, java.util.List, boolean)",
      "begin_line": 1049,
      "end_line": 1193,
      "comment": "\r\n     * Iterates over the data item of the category dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *                         y-interval is taken into account.\r\n     * @param visibleSeriesKeys  the visible series keys.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateXYRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 1205,
      "end_line": 1207,
      "comment": "\r\n     * Iterates over the data item of the xy dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @deprecated As of 1.0.10, use {@link #iterateRangeBounds(XYDataset)}.\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateRangeBounds(org.jfree.data.xy.XYDataset)",
      "begin_line": 1219,
      "end_line": 1221,
      "comment": "\r\n     * Iterates over the data item of the xy dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateRangeBounds(org.jfree.data.xy.XYDataset, boolean)",
      "begin_line": 1236,
      "end_line": 1303,
      "comment": "\r\n     * Iterates over the data items of the xy dataset to find\r\n     * the range bounds.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines, for an\r\n     *          {@link IntervalXYDataset}, whether the y-interval or just the\r\n     *          y-value is used to determine the overall range.\r\n     *\r\n     * @return The range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.10\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateToFindDomainBounds(org.jfree.data.xy.XYDataset, java.util.List, boolean)",
      "begin_line": 1320,
      "end_line": 1377,
      "comment": "\r\n     * Returns the range of x-values in the specified dataset for the\r\n     * data items belonging to the visible series.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param visibleSeriesKeys  the visible series keys (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *     y-interval for the dataset is included (this only applies if the\r\n     *     dataset is an instance of IntervalXYDataset).\r\n     *\r\n     * @return The x-range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.iterateToFindRangeBounds(org.jfree.data.xy.XYDataset, java.util.List, org.jfree.data.Range, boolean)",
      "begin_line": 1396,
      "end_line": 1508,
      "comment": "\r\n     * Returns the range of y-values in the specified dataset for the\r\n     * data items belonging to the visible series and with x-values in the\r\n     * given range.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param visibleSeriesKeys  the visible series keys (\u003ccode\u003enull\u003c/code\u003e not\r\n     *     permitted).\r\n     * @param xRange  the x-range (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param includeInterval  a flag that determines whether or not the\r\n     *     y-interval for the dataset is included (this only applies if the\r\n     *     dataset is an instance of IntervalXYDataset).\r\n     *\r\n     * @return The y-range (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @since 1.0.13\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumDomainValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 1523,
      "end_line": 1564,
      "comment": "\r\n     * Finds the minimum domain (or X) value for the specified dataset.  This\r\n     * is easy if the dataset implements the {@link DomainInfo} interface (a\r\n     * good idea if there is an efficient way to determine the minimum value).\r\n     * Otherwise, it involves iterating over the entire data-set.\r\n     * \u003cp\u003e\r\n     * Returns \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The minimum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumDomainValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 1578,
      "end_line": 1621,
      "comment": "\r\n     * Returns the maximum domain value for the specified dataset.  This is\r\n     * easy if the dataset implements the {@link DomainInfo} interface (a good\r\n     * idea if there is an efficient way to determine the maximum value).\r\n     * Otherwise, it involves iterating over the entire data-set.  Returns\r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1635,
      "end_line": 1676,
      "comment": "\r\n     * Returns the minimum range value for the specified dataset.  This is\r\n     * easy if the dataset implements the {@link RangeInfo} interface (a good\r\n     * idea if there is an efficient way to determine the minimum value).\r\n     * Otherwise, it involves iterating over the entire data-set.  Returns\r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The minimum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 1690,
      "end_line": 1738,
      "comment": "\r\n     * Returns the minimum range value for the specified dataset.  This is\r\n     * easy if the dataset implements the {@link RangeInfo} interface (a good\r\n     * idea if there is an efficient way to determine the minimum value).\r\n     * Otherwise, it involves iterating over the entire data-set.  Returns\r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values in the dataset are\r\n     * \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The minimum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1751,
      "end_line": 1794,
      "comment": "\r\n     * Returns the maximum range value for the specified dataset.  This is easy\r\n     * if the dataset implements the {@link RangeInfo} interface (a good idea\r\n     * if there is an efficient way to determine the maximum value).\r\n     * Otherwise, it involves iterating over the entire data-set.  Returns\r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values are \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(org.jfree.data.xy.XYDataset)",
      "begin_line": 1807,
      "end_line": 1854,
      "comment": "\r\n     * Returns the maximum range value for the specified dataset.  This is\r\n     * easy if the dataset implements the {@link RangeInfo} interface (a good\r\n     * idea if there is an efficient way to determine the maximum value).\r\n     * Otherwise, it involves iterating over the entire data-set.  Returns\r\n     * \u003ccode\u003enull\u003c/code\u003e if all the data values are \u003ccode\u003enull\u003c/code\u003e.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1864,
      "end_line": 1866,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range\r\n     * (y-values), assuming that the series in one category are stacked.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no values).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.category.CategoryDataset, double)",
      "begin_line": 1877,
      "end_line": 1911,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range\r\n     * (y-values), assuming that the series in one category are stacked.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param base  the base value for the bars.\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no values).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.category.CategoryDataset, org.jfree.data.KeyToGroupMap)",
      "begin_line": 1923,
      "end_line": 1976,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range\r\n     * (y-values), assuming that the series in one category are stacked.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param map  a structure that maps series to groups.\r\n     *\r\n     * @return The value range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no\r\n     *         values).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 1988,
      "end_line": 2016,
      "comment": "\r\n     * Returns the minimum value in the dataset range, assuming that values in\r\n     * each category are \"stacked\".\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The minimum value.\r\n     *\r\n     * @see #findMaximumStackedRangeValue(CategoryDataset)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(org.jfree.data.category.CategoryDataset)",
      "begin_line": 2028,
      "end_line": 2055,
      "comment": "\r\n     * Returns the maximum value in the dataset range, assuming that values in\r\n     * each category are \"stacked\".\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The maximum value (possibly \u003ccode\u003enull\u003c/code\u003e).\r\n     *\r\n     * @see #findMinimumStackedRangeValue(CategoryDataset)\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.xy.TableXYDataset)",
      "begin_line": 2065,
      "end_line": 2067,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range,\r\n     * assuming that the series are stacked.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range ([0.0, 0.0] if the dataset contains no values).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(org.jfree.data.xy.TableXYDataset, double)",
      "begin_line": 2078,
      "end_line": 2113,
      "comment": "\r\n     * Returns the minimum and maximum values for the dataset\u0027s range,\r\n     * assuming that the series are stacked, using the specified base value.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     * @param base  the base value.\r\n     *\r\n     * @return The range (\u003ccode\u003enull\u003c/code\u003e if the dataset contains no values).\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.calculateStackTotal(org.jfree.data.xy.TableXYDataset, int)",
      "begin_line": 2126,
      "end_line": 2136,
      "comment": "\r\n     * Calculates the total for the y-values in all series for a given item\r\n     * index.\r\n     *\r\n     * @param dataset  the dataset.\r\n     * @param item  the item index.\r\n     *\r\n     * @return The total.\r\n     *\r\n     * @since 1.0.5\r\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(org.jfree.data.category.CategoryDataset)",
      "begin_line": 2148,
      "end_line": 2178,
      "comment": "\r\n     * Calculates the range of values for a dataset where each item is the\r\n     * running total of the items for the current series.\r\n     *\r\n     * @param dataset  the dataset (\u003ccode\u003enull\u003c/code\u003e not permitted).\r\n     *\r\n     * @return The range.\r\n     *\r\n     * @see #findRangeBounds(CategoryDataset)\r\n     "
    }
  ]
}