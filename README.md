# Scala Generic Type Parameter without Constraints

This example demonstrates a common Scala error related to generic type parameters. The `MyClass` class uses a type parameter `T` but doesn't specify any constraints on what `T` can be. This leads to compilation failure when trying to use a type that doesn't have a `println` method defined for it (like `List[Int]` in this example).

The solution shows how to constrain the type parameter `T` using upper bounds to ensure the code compiles and runs as expected.
