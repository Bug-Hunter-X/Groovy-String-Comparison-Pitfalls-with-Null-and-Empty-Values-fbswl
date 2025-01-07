# Groovy String Comparison Pitfalls with Null and Empty Values

This example highlights a subtle but common error in Groovy when comparing strings with null or empty values.  Groovy's flexible type system and implicit coercion can lead to unexpected results if you're not careful.

The `bug.groovy` file demonstrates the issue.  The `bugSolution.groovy` file shows how to resolve this by explicitly using the `equals()` method for robust string comparisons.

## How to Reproduce

1. Run `bug.groovy`.
2. Observe the unexpected output due to the incorrect string comparison.
3. Run `bugSolution.groovy` to see the corrected output using the `equals()` method.

## Solution

Always use the `equals()` method when comparing strings to prevent issues with null or empty values.