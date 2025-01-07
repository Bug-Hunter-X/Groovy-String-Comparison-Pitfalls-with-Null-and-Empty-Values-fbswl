```groovy
def myMethod(String param) {
    if (param == null) {
        return "Null Parameter"
    } else if (param.equals("")) {
        return "Empty Parameter"
    } else {
        return "Parameter: " + param
    }
}

println myMethod(null)
println myMethod("")
println myMethod("Hello")
```