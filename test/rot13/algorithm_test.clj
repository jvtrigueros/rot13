(ns rot13.algorithm-test
  (:require [clojure.test :refer :all]
            [rot13.algorithm :refer :all]))

(def lower-alpha "abcdefghijklmnopqrstuvwxyz")
(def upper-alpha "ABCDEFGHIJKLMNOPQRSTUVWXYZ")

(deftest lowercase-test
  (testing "All lowercase letters should return true."
    (is (= true (every? rot13.algorithm/is-lowercase? (seq lower-alpha))))))