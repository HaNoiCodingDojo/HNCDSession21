(ns binary-generator.test.core
  (:use [binary-generator.core])
  (:use [clojure.test]))

(defn binary-generator [length]
  (cond (= 0 length) '()
        (= 1 length) '((0) (1))
        (= 2 length) (concat (list (conj '(0) 0)) (list (conj '(0) 1)) (list (conj '(1) 0)) (list (conj '(1) 1))))

  )

(deftest length-0-return-empty-sequence
  (is (= '() (binary-generator 0))))

(deftest length-1-return-0-and-1
  (is (= '((0) (1))
         (binary-generator 1))))

(deftest length-2-return-0-0-and-0-1-and-1-0-and-1-1
  (is (= '((0 0) (0 1) (1 0) (1 1))
         (binary-generator 2))))