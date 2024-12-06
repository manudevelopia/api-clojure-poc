(ns api-clojure-poc.user.handler
  (:require [api-clojure-poc.api :as api]
            [api-clojure-poc.user.service :as user-service]))

(defn all-user-handler [ctx]
  (api/build-response ctx (user-service/all))
  )