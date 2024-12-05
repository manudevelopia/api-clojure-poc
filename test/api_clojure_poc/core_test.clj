(ns api-clojure-poc.core-test
  (:require [api-clojure-poc.core :refer :all]
            [clojure.test :refer :all]))

(deftest say-test
  (testing "Should return say message"
    (is (= (say "Hello, World!"))))
  )
