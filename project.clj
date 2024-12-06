(defproject api-clojure-poc "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.12.0"]
                 [io.javalin/javalin "6.3.0"]
                 [cheshire "5.12.0"]
                 [org.slf4j/slf4j-simple "2.0.16"]
                 [com.github.seancorfield/next.jdbc "1.3.955"]
                 [org.postgresql/postgresql "42.7.4"]

                 ]
  :main ^:skip-aot api-clojure-poc.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot      :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
