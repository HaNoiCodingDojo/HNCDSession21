(ns binary-generator.test.core
  (:use [binary-generator.core])
  (:use [clojure.test]))

(defn binary-generator [length]
  '())

(deftest length-0-return-empty-sequence
  (is (= '() (binary-generator 0))))

(deftest length-1-return-0-and-1
  (is (= '((0) (1))
         (binary-generator 1))))