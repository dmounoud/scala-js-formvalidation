# scala-js-formvalidation
Scala-js facade of FormValidation JQuery plugin

## Installation
1. As this project is not deployed to central repository, add the jitpack resolver to your `build.sbt`:

```scala
resolvers += "jitpack" at "https://jitpack.io"
```

2. Add the following dependency to your `build.sbt`:

```scala
libraryDependencies +=
  "com.github.diadys" % "scala-js-formvalidation" % "1.0"
```

3. Add the following JS files after purchasing FormValidation at http://formvalidation.io/ to your `src/main/resources` folder of your base project:

```scala
  fv/bootstrap.min.js
  fv/formValidation.min.js
  fv/fr.js
  fv/mandatoryIcon.min.js
```

## Example
```scala
import ch.diadys.formvalidation.FormValidation

$form
.on("init.form.fv", (e: JQueryEventObject, data: js.Dynamic) => {
  // $(e.target)  --> The form instance
  // data.fv      --> The FormValidation instance
  // data.options --> The form options

  // Do something ...
})
.formValidation(js.Dynamic.literal("framework" -> "bootstrap", "excluded" -> ":disabled"))
```

## License
This facade is licensed under the terms of the GNU v3.0 license.

## Authors
* Didier Mounoud
