```groovy
def myMethod(String param) {
    if (param == null) {
        return "Null Parameter"
    } else if (param.length() == 0) {
        return "Empty Parameter"
    } else {
        return "Parameter: " + param
    }
}

println myMethod(null)
println myMethod("")
println myMethod("Hello")
```