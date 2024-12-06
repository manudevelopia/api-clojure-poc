(ns api-clojure-poc.api
  (:require [api-clojure-poc.user.handler :as user-handler]
            [cheshire.core :refer :all])
  (:import (io.javalin Javalin))
  )

(defn build-response [ctx object]
  (.status ctx 200)
  (.result ctx (generate-string object))
  )

(defn -main [& args]
  (doto (Javalin/create)
    (.get "/users" user-handler/all-user-handler)
    (.post "/users" user-handler/all-user-handler)
    (.start 7070))
  )
