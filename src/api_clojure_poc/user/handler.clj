(ns api-clojure-poc.user.handler
  (:require [api-clojure-poc.user.service :as user-service]
            [cheshire.core :refer :all]))

(defn build-response [ctx object]
  (.status ctx 200)
  (.contentType ctx "application/json")
  (.result ctx (generate-string object)))

(defn all [ctx]
  (build-response ctx (user-service/all)) ())

(defn add [ctx]
  (build-response ctx (user-service/add (parse-string (.body ctx)))))
