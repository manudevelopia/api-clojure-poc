(ns api-clojure-poc.api
  (:require [api-clojure-poc.user.handler :as user-handler]
            [cheshire.core :refer :all])
  (:import (io.javalin Javalin)))

(defn -main [& args]
  (doto (Javalin/create)
    (.get "/users" user-handler/all)
    (.post "/users" user-handler/add)
    (.start 7070)))
