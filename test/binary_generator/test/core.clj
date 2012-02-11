(ns binary-generator.test.core
  (:use [binary-generator.core])
  (:use [clojure.test]))

(deftest length-0-return-empty-sequence
  (is (= '() (binary-generator 0))))
