(ns api-clojure-poc.api
  (:require [api-clojure-poc.user.handler :as user-handler]
            [cheshire.core :refer :all])
  (:import (io.javalin Javalin)
           (org.slf4j LoggerFactory)))

(def logger (LoggerFactory/getLogger "api-clojure-poc.api"))

(defn -main [& args]
  (.info logger "This will log at INFO level.")
  (doto (Javalin/create)
    (.get "/users" user-handler/all)
    (.post "/users" user-handler/add)
    (.start 7070)))
