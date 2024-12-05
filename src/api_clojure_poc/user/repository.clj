(ns api-clojure-poc.user.repository
  (:require [api-clojure-poc.user.model :as model]))

(defn all []
  (list (model/->User "John Doe" "john.doe@email.com")
        (model/->User "Jane Doe" "jane.doe@email.com"))
  )
