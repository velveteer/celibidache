(ns app.core
  (:require [reagent.dom :refer [render]]
            [re-frame.core :refer [dispatch-sync]]
            [app.routes :as routes]
            [app.views :as views]
            [app.handlers]
            [app.subs]))

(defn mount-root []
  (render [views/main] (.getElementById js/document "app")))

(defn ^:export init []
  (routes/start!)
  (dispatch-sync [:initialize-db])
  (mount-root))
