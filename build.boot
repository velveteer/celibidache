;; vi:syntax=clojure

(set-env!
 :source-paths    #{"src"}
 :resource-paths  #{"resources"}
 :dependencies '[[adzerk/boot-cljs              "1.7.228-1"       :scope "test"]
                 [adzerk/boot-cljs-repl         "0.3.0"           :scope "test"]
                 [adzerk/boot-reload            "0.4.7"           :scope "test"]
                 [pandeiro/boot-http            "0.7.3"           :scope "test"]
                 [com.cemerick/piggieback       "0.2.1"           :scope "test"]
                 [crisptrutski/boot-cljs-test   "0.2.2-SNAPSHOT"  :scope "test"]
                 [weasel                        "0.7.0"           :scope "test"]
                 [org.clojure/tools.nrepl       "0.2.12"          :scope "test"]
                 [deraen/boot-less              "0.2.1"           :scope "test"]
                 [binaryage/devtools            "0.6.1"           :scope "test"]
                 [binaryage/dirac               "0.2.0"           :scope "test"]
                 [jupl/boot-cljs-devtools       "0.1.0"           :scope "test"]
                 [org.clojure/clojurescript     "1.7.228"]
                 [reagent                       "0.6.0-alpha"]
                 [re-frame                      "0.7.0"]
                 [bidi                          "2.0.8"]
                 [kibu/pushy                    "0.3.6"]])
(require
 '[adzerk.boot-cljs             :refer [cljs]]
 '[jupl.boot-cljs-devtools      :refer [cljs-devtools]]
 '[adzerk.boot-reload           :refer [reload]]
 '[pandeiro.boot-http           :refer [serve]]
 '[crisptrutski.boot-cljs-test  :refer [test-cljs]]
 '[deraen.boot-less             :refer [less]])

(deftask dev []
  (comp (watch)
        (serve :dir "target" :not-found 'dev.not-found/not-found-handler :port 8080)
        (reload :on-jsload 'app.core/mount-root)
        (cljs-devtools)
        (cljs :optimizations :none :source-map true)
        (less)
        (target)))

(deftask build []
  (comp
    (less :compression true)
    (cljs :optimizations :advanced)
    (target)))

(deftask testing []
  (merge-env! :resource-paths #{"test/cljs"})
  (task-options! test-cljs {:namespaces '#{app.test} :js-env :phantom})
  identity)

(deftask test-once []
  (comp (testing)
        (test-cljs :exit? true)))

(deftask auto-test []
  (comp (testing)
        (watch)
        (test-cljs)))
