(require '[lumo.build.api :as b])

(b/build "src"
  {:main 'hello-world.core
   :output-to "dist/main.js"
   :optimizations :advanced
   :target :nodejs})
