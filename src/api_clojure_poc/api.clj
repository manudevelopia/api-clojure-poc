(ns api-clojure-poc.api
  (:require [api-clojure-poc.user.service :as user-service]
            [cheshire.core :refer :all])
  (:import (io.javalin Javalin))
  )

(defn build-response [ctx object]
  (.status ctx 200)
  (.result ctx (generate-string object))
  )

(defn -main [& args]
  (doto (Javalin/create)
    (.get "/users" #(build-response % (user-service/all)))
    (.start 7070))
  )
