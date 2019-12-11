(ns app.core-test
  (:require [clojure.spec.alpha :as s]
            [clojure.spec.test.alpha :as st]
            [app.core :as app]
            [cljs.test :as t :refer-macros [deftest is async testing]]))

(deftest test-1
  (async done
    (st/unstrument)
    (is (= (set (st/instrument)) #{`app.core/foo}))
    (done)))

(deftest test-2
  (async done
    (st/unstrument)
    (is (= (set (st/instrument)) #{`app.core/foo}))
    (done)))

(deftest test-3
  (async done
    (st/unstrument)
    (is (= (set (st/instrument)) #{`app.core/foo}))
    (done)))

(deftest test-4
  (async done
    (st/unstrument)
    (is (= (set (st/instrument)) #{`app.core/foo}))
    (done)))
