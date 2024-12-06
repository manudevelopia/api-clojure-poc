(ns api-clojure-poc.user.handler
  (:require [api-clojure-poc.user.service :as user-service]
            [cheshire.core :refer :all]))

(defn all-user-handler [ctx]
  (.status ctx 200)
  (.result ctx (generate-string (user-service/all)))
  )

(defn add [ctx]
  (.status ctx 200)
  (.result ctx (generate-string (user-service/add (.body ctx))))
  )