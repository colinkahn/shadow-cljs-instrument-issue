(ns app.core-test
  (:require [clojure.spec.alpha :as s]
            [clojure.spec.test.alpha :as st]
            [app.core :as app]
            [app.core-specs :as specs]
            [cljs.test :as t :refer-macros [deftest is async testing]]))

(deftest test-1
  (is (= (set (st/instrument)) #{`app.core/foo})))
