{
  "filepath": "/tmp/Lang-15f/src/main/java/org/apache/commons/lang3/reflect/TypeUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 1101,
      "comment": "\n * \u003cp\u003e Utility methods focusing on type inspection, particularly with regard to\n * generics. \u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.TypeUtils()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * \u003cp\u003e TypeUtils instances should NOT be constructed in standard\n     * programming. Instead, the class should be used as\n     * \u003ccode\u003eTypeUtils.isAssignable(cls, toClass)\u003c/code\u003e. \u003c/p\u003e \u003cp\u003e This\n     * constructor is public to permit tools that require a JavaBean instance to\n     * operate. \u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.reflect.Type)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target type\n     * following the Java generics rules. If both types are {@link Class}\n     * objects, the method returns the result of\n     * {@link ClassUtils#isAssignable(Class, Class)}. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toType the target type\n     * @return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003etype\u003c/code\u003e is assignable to \u003ccode\u003etoType\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.reflect.Type, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 77,
      "end_line": 102,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target type\n     * following the Java generics rules. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toType the target type\n     * @param typeVarAssigns optional map of type variable assignments\n     * @return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003etype\u003c/code\u003e is assignable to \u003ccode\u003etoType\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.Class\u003c?\u003e)",
      "begin_line": 112,
      "end_line": 168,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target class\n     * following the Java generics rules. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toClass the target class\n     * @return true if \u003ccode\u003etype\u003c/code\u003e is assignable to \u003ccode\u003etoClass\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.reflect.ParameterizedType, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 179,
      "end_line": 235,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target\n     * parameterized type following the Java generics rules. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toParameterizedType the target parameterized type\n     * @param typeVarAssigns a map with type variables\n     * @return true if \u003ccode\u003etype\u003c/code\u003e is assignable to \u003ccode\u003etoType\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.unrollVariableAssignments(java.lang.reflect.TypeVariable\u003c?\u003e, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 237,
      "end_line": 248,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.reflect.GenericArrayType, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 260,
      "end_line": 324,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target\n     * generic array type following the Java generics rules. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toGenericArrayType the target generic array type\n     * @param typeVarAssigns a map with type variables\n     * @return true if \u003ccode\u003etype\u003c/code\u003e is assignable to\n     * \u003ccode\u003etoGenericArrayType\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.reflect.WildcardType, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 336,
      "end_line": 413,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target\n     * wildcard type following the Java generics rules. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toWildcardType the target wildcard type\n     * @param typeVarAssigns a map with type variables\n     * @return true if \u003ccode\u003etype\u003c/code\u003e is assignable to\n     * \u003ccode\u003etoWildcardType\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isAssignable(java.lang.reflect.Type, java.lang.reflect.TypeVariable\u003c?\u003e, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 425,
      "end_line": 461,
      "comment": "\n     * \u003cp\u003e Checks if the subject type may be implicitly cast to the target type\n     * variable following the Java generics rules. \u003c/p\u003e\n     *\n     * @param type the subject type to be assigned to the target type\n     * @param toTypeVariable the target type variable\n     * @param typeVarAssigns a map with type variables\n     * @return true if \u003ccode\u003etype\u003c/code\u003e is assignable to\n     * \u003ccode\u003etoTypeVariable\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.substituteTypeVariables(java.lang.reflect.Type, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 471,
      "end_line": 484,
      "comment": "\n     * \u003cp\u003e \u003c/p\u003e\n     *\n     * @param type the type to be replaced\n     * @param typeVarAssigns the map with type variables\n     * @return the replaced type\n     * @throws IllegalArgumentException if the type cannot be substituted\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.reflect.ParameterizedType)",
      "begin_line": 497,
      "end_line": 499,
      "comment": "\n     * \u003cp\u003e Retrieves all the type arguments for this parameterized type\n     * including owner hierarchy arguments such as \u003ccode\u003e\n     * Outer\u003cK,V\u003e.Inner\u003cT\u003e.DeepInner\u003cE\u003e\u003c/code\u003e . The arguments are returned in a\n     * {@link Map} specifying the argument type for each {@link TypeVariable}.\n     * \u003c/p\u003e\n     *\n     * @param type specifies the subject parameterized type from which to\n     * harvest the parameters.\n     * @return a map of the type arguments to their respective type variables.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.reflect.Type, java.lang.Class\u003c?\u003e)",
      "begin_line": 533,
      "end_line": 535,
      "comment": "\n     * \u003cp\u003e Gets the type arguments of a class/interface based on a subtype. For\n     * instance, this method will determine that both of the parameters for the\n     * interface {@link Map} are {@link Object} for the subtype\n     * {@link java.util.Properties Properties} even though the subtype does not\n     * directly implement the \u003ccode\u003eMap\u003c/code\u003e interface. \u003cp\u003e \u003c/p\u003e This method\n     * returns \u003ccode\u003enull\u003c/code\u003e if \u003ccode\u003etype\u003c/code\u003e is not assignable to\n     * \u003ccode\u003etoClass\u003c/code\u003e. It returns an empty map if none of the classes or\n     * interfaces in its inheritance hierarchy specify any type arguments. \u003c/p\u003e\n     * \u003cp\u003e A side-effect of this method is that it also retrieves the type\n     * arguments for the classes and interfaces that are part of the hierarchy\n     * between \u003ccode\u003etype\u003c/code\u003e and \u003ccode\u003etoClass\u003c/code\u003e. So with the above\n     * example, this method will also determine that the type arguments for\n     * {@link java.util.Hashtable Hashtable} are also both \u003ccode\u003eObject\u003c/code\u003e.\n     * In cases where the interface specified by \u003ccode\u003etoClass\u003c/code\u003e is\n     * (indirectly) implemented more than once (e.g. where \u003ccode\u003etoClass\u003c/code\u003e\n     * specifies the interface {@link java.lang.Iterable Iterable} and\n     * \u003ccode\u003etype\u003c/code\u003e specifies a parameterized type that implements both\n     * {@link java.util.Set Set} and {@link java.util.Collection Collection}),\n     * this method will look at the inheritance hierarchy of only one of the\n     * implementations/subclasses; the first interface encountered that isn\u0027t a\n     * subinterface to one of the others in the \u003ccode\u003etype\u003c/code\u003e to\n     * \u003ccode\u003etoClass\u003c/code\u003e hierarchy. \u003c/p\u003e\n     *\n     * @param type the type from which to determine the type parameters of\n     * \u003ccode\u003etoClass\u003c/code\u003e\n     * @param toClass the class whose type parameters are to be determined based\n     * on the subtype \u003ccode\u003etype\u003c/code\u003e\n     * @return a map of the type assignments for the type variables in each type\n     * in the inheritance hierarchy from \u003ccode\u003etype\u003c/code\u003e to\n     * \u003ccode\u003etoClass\u003c/code\u003e inclusive.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.reflect.Type, java.lang.Class\u003c?\u003e, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 545,
      "end_line": 587,
      "comment": "\n     * \u003cp\u003e Return a map of the type arguments of \u003ccode\u003etype\u003c/code\u003e in the context of \u003ccode\u003etoClass\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param type the type in question\n     * @param toClass the class\n     * @param subtypeVarAssigns a map with type variables\n     * @return the map with type arguments\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.reflect.ParameterizedType, java.lang.Class\u003c?\u003e, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 597,
      "end_line": 640,
      "comment": "\n     * \u003cp\u003e Return a map of the type arguments of a parameterized type in the context of \u003ccode\u003etoClass\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param parameterizedType the parameterized type\n     * @param toClass the class\n     * @param subtypeVarAssigns a map with type variables\n     * @return the map with type arguments\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 650,
      "end_line": 681,
      "comment": "\n     * \u003cp\u003e Return a map of the type arguments of a class in the context of \u003ccode\u003etoClass\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param cls the class in question\n     * @param toClass the context class\n     * @param subtypeVarAssigns a map with type variables\n     * @return the map with type arguments\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.determineTypeArguments(java.lang.Class\u003c?\u003e, java.lang.reflect.ParameterizedType)",
      "begin_line": 710,
      "end_line": 740,
      "comment": "\n     * \u003cp\u003e Tries to determine the type arguments of a class/interface based on a\n     * super parameterized type\u0027s type arguments. This method is the inverse of\n     * {@link #getTypeArguments(Type, Class)} which gets a class/interface\u0027s\n     * type arguments based on a subtype. It is far more limited in determining\n     * the type arguments for the subject class\u0027s type variables in that it can\n     * only determine those parameters that map from the subject {@link Class}\n     * object to the supertype. \u003c/p\u003e \u003cp\u003e Example: {@link java.util.TreeSet\n     * TreeSet} sets its parameter as the parameter for\n     * {@link java.util.NavigableSet NavigableSet}, which in turn sets the\n     * parameter of {@link java.util.SortedSet}, which in turn sets the\n     * parameter of {@link Set}, which in turn sets the parameter of\n     * {@link java.util.Collection}, which in turn sets the parameter of\n     * {@link java.lang.Iterable}. Since \u003ccode\u003eTreeSet\u003c/code\u003e\u0027s parameter maps\n     * (indirectly) to \u003ccode\u003eIterable\u003c/code\u003e\u0027s parameter, it will be able to\n     * determine that based on the super type \u003ccode\u003eIterable\u003c? extends\n     * Map\u003cInteger,? extends Collection\u003c?\u003e\u003e\u003e\u003c/code\u003e, the parameter of\n     * \u003ccode\u003eTreeSet\u003c/code\u003e is \u003ccode\u003e? extends Map\u003cInteger,? extends\n     * Collection\u003c?\u003e\u003e\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param cls the class whose type parameters are to be determined\n     * @param superType the super type from which \u003ccode\u003ecls\u003c/code\u003e\u0027s type\n     * arguments are to be determined\n     * @return a map of the type assignments that could be determined for the\n     * type variables in each type in the inheritance hierarchy from\n     * \u003ccode\u003etype\u003c/code\u003e to \u003ccode\u003etoClass\u003c/code\u003e inclusive.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.mapTypeVariablesToArguments(java.lang.Class\u003cT\u003e, java.lang.reflect.ParameterizedType, java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 750,
      "end_line": 787,
      "comment": "\n     * \u003cp\u003ePerforms a mapping of type variables.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the generic type of the class in question\n     * @param cls the class in question\n     * @param parameterizedType the parameterized type\n     * @param typeVarAssigns the map to be filled\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getClosestParentType(java.lang.Class\u003c?\u003e, java.lang.Class\u003c?\u003e)",
      "begin_line": 797,
      "end_line": 835,
      "comment": "\n     * \u003cp\u003e Closest parent type? Closest to what? The closest parent type to the\n     * super class specified by \u003ccode\u003esuperClass\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param cls the class in question\n     * @param superClass the super class\n     * @return the closes parent type\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isInstance(java.lang.Object, java.lang.reflect.Type)",
      "begin_line": 845,
      "end_line": 852,
      "comment": "\n     * \u003cp\u003e Checks if the given value can be assigned to the target type\n     * following the Java generics rules. \u003c/p\u003e\n     *\n     * @param value the value to be checked\n     * @param type the target type\n     * @return true of \u003ccode\u003evalue\u003c/code\u003e is an instance of \u003ccode\u003etype\u003c/code\u003e.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(java.lang.reflect.Type[])",
      "begin_line": 875,
      "end_line": 899,
      "comment": "\n     * \u003cp\u003e This method strips out the redundant upper bound types in type\n     * variable types and wildcard types (or it would with wildcard types if\n     * multiple upper bounds were allowed). \u003c/p\u003e \u003cp\u003e Example: with the variable\n     * type declaration:\n     *\n     * \u003cpre\u003e \u0026lt;K extends java.util.Collection\u0026lt;String\u0026gt; \u0026amp;\n     * java.util.List\u0026lt;String\u0026gt;\u0026gt; \u003c/pre\u003e\n     *\n     * since \u003ccode\u003eList\u003c/code\u003e is a subinterface of \u003ccode\u003eCollection\u003c/code\u003e,\n     * this method will return the bounds as if the declaration had been:\n     *\n     * \u003cpre\u003e \u0026lt;K extends java.util.List\u0026lt;String\u0026gt;\u0026gt; \u003c/pre\u003e\n     *\n     * \u003c/p\u003e\n     *\n     * @param bounds an array of types representing the upper bounds of either\n     * \u003ccode\u003eWildcardType\u003c/code\u003e or \u003ccode\u003eTypeVariable\u003c/code\u003e.\n     * @return an array containing the values from \u003ccode\u003ebounds\u003c/code\u003e minus the\n     * redundant types.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(java.lang.reflect.TypeVariable\u003c?\u003e)",
      "begin_line": 910,
      "end_line": 914,
      "comment": "\n     * \u003cp\u003e Returns an array containing the sole type of {@link Object} if\n     * {@link TypeVariable#getBounds()} returns an empty array. Otherwise, it\n     * returns the result of \u003ccode\u003eTypeVariable.getBounds()\u003c/code\u003e passed into\n     * {@link #normalizeUpperBounds}. \u003c/p\u003e\n     *\n     * @param typeVariable the subject type variable\n     * @return a non-empty array containing the bounds of the type variable.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(java.lang.reflect.WildcardType)",
      "begin_line": 926,
      "end_line": 930,
      "comment": "\n     * \u003cp\u003e Returns an array containing the sole value of {@link Object} if\n     * {@link WildcardType#getUpperBounds()} returns an empty array. Otherwise,\n     * it returns the result of \u003ccode\u003eWildcardType.getUpperBounds()\u003c/code\u003e\n     * passed into {@link #normalizeUpperBounds}. \u003c/p\u003e\n     *\n     * @param wildcardType the subject wildcard type\n     * @return a non-empty array containing the upper bounds of the wildcard\n     * type.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(java.lang.reflect.WildcardType)",
      "begin_line": 941,
      "end_line": 945,
      "comment": "\n     * \u003cp\u003e Returns an array containing a single value of \u003ccode\u003enull\u003c/code\u003e if\n     * {@link WildcardType#getLowerBounds()} returns an empty array. Otherwise,\n     * it returns the result of \u003ccode\u003eWildcardType.getLowerBounds()\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param wildcardType the subject wildcard type\n     * @return a non-empty array containing the lower bounds of the wildcard\n     * type.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(java.util.Map\u003cjava.lang.reflect.TypeVariable\u003c?\u003e, java.lang.reflect.Type\u003e)",
      "begin_line": 960,
      "end_line": 976,
      "comment": "\n     * \u003cp\u003e Determines whether or not specified types satisfy the bounds of their\n     * mapped type variables. When a type parameter extends another (such as\n     * \u003ccode\u003e\u003cT, S extends T\u003e\u003c/code\u003e), uses another as a type parameter (such as\n     * \u003ccode\u003e\u003cT, S extends Comparable\u003cT\u003e\u003c/code\u003e), or otherwise depends on\n     * another type variable to be specified, the dependencies must be included\n     * in \u003ccode\u003etypeVarAssigns\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @param typeVarAssigns specifies the potential types to be assigned to the\n     * type variables.\n     * @return whether or not the types can be assigned to their respective type\n     * variables.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getRawType(java.lang.reflect.ParameterizedType)",
      "begin_line": 985,
      "end_line": 998,
      "comment": "\n     * \u003cp\u003e Transforms the passed in type to a {@code Class} object. Type-checking method of convenience. \u003c/p\u003e\n     *\n     * @param parameterizedType the type to be converted\n     * @return the corresponding {@code Class} object\n     * @throws IllegalStateException if the conversion fails\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getRawType(java.lang.reflect.Type, java.lang.reflect.Type)",
      "begin_line": 1012,
      "end_line": 1074,
      "comment": "\n     * \u003cp\u003e Get the raw type of a Java type, given its context. Primarily for use\n     * with {@link TypeVariable}s and {@link GenericArrayType}s, or when you do\n     * not know the runtime type of \u003ccode\u003etype\u003c/code\u003e: if you know you have a\n     * {@link Class} instance, it is already raw; if you know you have a\n     * {@link ParameterizedType}, its raw type is only a method call away. \u003c/p\u003e\n     *\n     * @param type to resolve\n     * @param assigningType type to be resolved against\n     * @return the resolved \u003ccode\u003eClass\u003c/code\u003e object or \u003ccode\u003enull\u003c/code\u003e if\n     * the type could not be resolved\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.isArrayType(java.lang.reflect.Type)",
      "begin_line": 1081,
      "end_line": 1083,
      "comment": "\n     * Learn whether the specified type denotes an array type.\n     * @param type the type to be checked\n     * @return \u003ccode\u003etrue\u003c/code\u003e if \u003ccode\u003etype\u003c/code\u003e is an array class or a {@link GenericArrayType}.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(java.lang.reflect.Type)",
      "begin_line": 1090,
      "end_line": 1099,
      "comment": "\n     * Get the array component type of \u003ccode\u003etype\u003c/code\u003e.\n     * @param type the type to be checked\n     * @return component type or null if type is not an array type\n     "
    }
  ]
}