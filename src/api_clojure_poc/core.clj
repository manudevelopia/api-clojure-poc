(ns api-clojure-poc.core
  (:gen-class))

(defn say [message]
  message
  )

(defn -main [& args]
  (say "Hello, World!")
  )
