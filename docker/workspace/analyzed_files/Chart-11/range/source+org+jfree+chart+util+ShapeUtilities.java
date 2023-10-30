{
  "filepath": "/tmp/Chart-11f/source/org/jfree/chart/util/ShapeUtilities.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ShapeUtilities",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 79,
      "end_line": 597,
      "comment": "\n * Utility methods for {@link Shape} objects.\n "
    },
    {
      "type": "constructor",
      "signature": "org.jfree.chart.util.ShapeUtilities.ShapeUtilities()",
      "begin_line": 84,
      "end_line": 85,
      "comment": "\n     * Prevents instantiation.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.clone(java.awt.Shape)",
      "begin_line": 102,
      "end_line": 112,
      "comment": "\n     * Returns a clone of the specified shape, or \u003ccode\u003enull\u003c/code\u003e.  At the\n     * current time, this method supports cloning for instances of\n     * \u003ccode\u003eLine2D\u003c/code\u003e, \u003ccode\u003eRectangularShape\u003c/code\u003e, \u003ccode\u003eArea\u003c/code\u003e\n     * and \u003ccode\u003eGeneralPath\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003ccode\u003eRectangularShape\u003c/code\u003e includes \u003ccode\u003eArc2D\u003c/code\u003e,\n     * \u003ccode\u003eEllipse2D\u003c/code\u003e, \u003ccode\u003eRectangle2D\u003c/code\u003e,\n     * \u003ccode\u003eRoundRectangle2D\u003c/code\u003e.\n     *\n     * @param shape  the shape to clone (\u003ccode\u003enull\u003c/code\u003e permitted,\n     *               returns \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @return A clone or \u003ccode\u003enull\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.equal(java.awt.Shape, java.awt.Shape)",
      "begin_line": 127,
      "end_line": 147,
      "comment": "\n     * Tests two shapes for equality.  If both shapes are \u003ccode\u003enull\u003c/code\u003e,\n     * this method will return \u003ccode\u003etrue\u003c/code\u003e.\n     * \u003cp\u003e\n     * In the current implementation, the following shapes are supported:\n     * \u003ccode\u003eEllipse2D\u003c/code\u003e, \u003ccode\u003eLine2D\u003c/code\u003e and \u003ccode\u003eRectangle2D\u003c/code\u003e\n     * (implicit).\n     *\n     * @param s1  the first shape (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param s2  the second shape (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.equal(java.awt.geom.Line2D, java.awt.geom.Line2D)",
      "begin_line": 158,
      "end_line": 172,
      "comment": "\n     * Compares two lines are returns \u003ccode\u003etrue\u003c/code\u003e if they are equal or\n     * both \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param l1  the first line (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param l2  the second line (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.equal(java.awt.geom.Ellipse2D, java.awt.geom.Ellipse2D)",
      "begin_line": 183,
      "end_line": 194,
      "comment": "\n     * Compares two ellipses and returns \u003ccode\u003etrue\u003c/code\u003e if they are equal or\n     * both \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param e1  the first ellipse (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param e2  the second ellipse (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.equal(java.awt.geom.Arc2D, java.awt.geom.Arc2D)",
      "begin_line": 205,
      "end_line": 225,
      "comment": "\n     * Compares two arcs and returns \u003ccode\u003etrue\u003c/code\u003e if they are equal or\n     * both \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param a1  the first arc (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param a2  the second arc (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.equal(java.awt.Polygon, java.awt.Polygon)",
      "begin_line": 236,
      "end_line": 253,
      "comment": "\n     * Tests two polygons for equality.  If both are \u003ccode\u003enull\u003c/code\u003e this\n     * method returns \u003ccode\u003etrue\u003c/code\u003e.\n     *\n     * @param p1  polygon 1 (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param p2  polygon 2 (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.equal(java.awt.geom.GeneralPath, java.awt.geom.GeneralPath)",
      "begin_line": 264,
      "end_line": 296,
      "comment": "\n     * Tests two polygons for equality.  If both are \u003ccode\u003enull\u003c/code\u003e this\n     * method returns \u003ccode\u003etrue\u003c/code\u003e.\n     *\n     * @param p1  path 1 (\u003ccode\u003enull\u003c/code\u003e permitted).\n     * @param p2  path 2 (\u003ccode\u003enull\u003c/code\u003e permitted).\n     *\n     * @return A boolean.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.createTranslatedShape(java.awt.Shape, double, double)",
      "begin_line": 307,
      "end_line": 316,
      "comment": "\n     * Creates and returns a translated shape.\n     *\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param transX  the x translation (in Java2D space).\n     * @param transY  the y translation (in Java2D space).\n     *\n     * @return The translated shape.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.createTranslatedShape(java.awt.Shape, org.jfree.chart.util.RectangleAnchor, double, double)",
      "begin_line": 330,
      "end_line": 345,
      "comment": "\n     * Translates a shape to a new location such that the anchor point\n     * (relative to the rectangular bounds of the shape) aligns with the\n     * specified (x, y) coordinate in Java2D space.\n     *\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param anchor  the anchor (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param locationX  the x-coordinate (in Java2D space).\n     * @param locationY  the y-coordinate (in Java2D space).\n     *\n     * @return A new and translated shape.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.rotateShape(java.awt.Shape, double, float, float)",
      "begin_line": 358,
      "end_line": 366,
      "comment": "\n     * Rotates a shape about the specified coordinates.\n     *\n     * @param base  the shape (\u003ccode\u003enull\u003c/code\u003e permitted, returns\n     *              \u003ccode\u003enull\u003c/code\u003e).\n     * @param angle  the angle (in radians).\n     * @param x  the x coordinate for the rotation point (in Java2D space).\n     * @param y  the y coordinate for the rotation point (in Java2D space).\n     *\n     * @return the rotated shape.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.drawRotatedShape(java.awt.Graphics2D, java.awt.Shape, double, float, float)",
      "begin_line": 377,
      "end_line": 386,
      "comment": "\n     * Draws a shape with the specified rotation about \u003ccode\u003e(x, y)\u003c/code\u003e.\n     *\n     * @param g2  the graphics device (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param shape  the shape (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param angle  the angle (in radians).\n     * @param x  the x coordinate for the rotation point.\n     * @param y  the y coordinate for the rotation point.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SQRT2"
      ],
      "begin_line": 389,
      "end_line": 389,
      "comment": " A useful constant used internally. "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.createDiagonalCross(float, float)",
      "begin_line": 399,
      "end_line": 415,
      "comment": "\n     * Creates a diagonal cross shape.\n     *\n     * @param l  the length of each \u0027arm\u0027.\n     * @param t  the thickness.\n     *\n     * @return A diagonal cross shape.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.createRegularCross(float, float)",
      "begin_line": 425,
      "end_line": 441,
      "comment": "\n     * Creates a diagonal cross shape.\n     *\n     * @param l  the length of each \u0027arm\u0027.\n     * @param t  the thickness.\n     *\n     * @return A diagonal cross shape.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.createDiamond(float)",
      "begin_line": 450,
      "end_line": 458,
      "comment": "\n     * Creates a diamond shape.\n     *\n     * @param s  the size factor (equal to half the height of the diamond).\n     *\n     * @return A diamond shape.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.createUpTriangle(float)",
      "begin_line": 467,
      "end_line": 474,
      "comment": "\n     * Creates a triangle shape that points upwards.\n     *\n     * @param s  the size factor (equal to half the height of the triangle).\n     *\n     * @return A triangle shape.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.createDownTriangle(float)",
      "begin_line": 483,
      "end_line": 490,
      "comment": "\n     * Creates a triangle shape that points downwards.\n     *\n     * @param s  the size factor (equal to half the height of the triangle).\n     *\n     * @return A triangle shape.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.createLineRegion(java.awt.geom.Line2D, float)",
      "begin_line": 502,
      "end_line": 527,
      "comment": "\n     * Creates a region surrounding a line segment by \u0027widening\u0027 the line\n     * segment.  A typical use for this method is the creation of a\n     * \u0027clickable\u0027 region for a line that is displayed on-screen.\n     *\n     * @param line  the line (\u003ccode\u003enull\u003c/code\u003e not permitted).\n     * @param width  the width of the region.\n     *\n     * @return A region that surrounds the line.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.getPointInRectangle(double, double, java.awt.geom.Rectangle2D)",
      "begin_line": 542,
      "end_line": 549,
      "comment": "\n     * Returns a point based on (x, y) but constrained to be within the bounds\n     * of a given rectangle.\n     *\n     * @param x  the x-coordinate.\n     * @param y  the y-coordinate.\n     * @param area  the constraining rectangle (\u003ccode\u003enull\u003c/code\u003e not\n     *              permitted).\n     *\n     * @return A point within the rectangle.\n     *\n     * @throws NullPointerException if \u003ccode\u003earea\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.contains(java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 560,
      "end_line": 573,
      "comment": "\n     * Checks, whether the given rectangle1 fully contains rectangle 2\n     * (even if rectangle 2 has a height or width of zero!).\n     *\n     * @param rect1  the first rectangle.\n     * @param rect2  the second rectangle.\n     *\n     * @return A boolean.\n     "
    },
    {
      "type": "method",
      "signature": "org.jfree.chart.util.ShapeUtilities.intersects(java.awt.geom.Rectangle2D, java.awt.geom.Rectangle2D)",
      "begin_line": 585,
      "end_line": 596,
      "comment": "\n     * Checks, whether the given rectangle1 fully contains rectangle 2\n     * (even if rectangle 2 has a height or width of zero!).\n     *\n     * @param rect1  the first rectangle.\n     * @param rect2  the second rectangle.\n     *\n     * @return A boolean.\n     "
    }
  ]
}