(ns app.pages.about
  (:require [app.routes :refer [get-token]]
            [re-frame.core :refer [subscribe]]))

(defn main []
  (let [current-route (get-token)
        current-page (subscribe [:current-page])
        route-params (subscribe [:route-params])]
    (fn []
      [:section
       [:section.mw5.mw7-ns.center.bg-light-gray.pa3.ph5-ns
        [:p.tc.center.lh-copy.measure "The current route is: " current-route]
        [:p.tc.center.lh-copy.measure "The page component is: " (name @current-page)]
        [:p.tc.center.lh-copy.measure "The route parameter is: " (:about-id @route-params)]]
       [:section.mw5.mw7-ns.center.bg-light-gray.pa3.ph5-ns
        [:p.center.lh-copy.measure
         "You can't do anything other than let it happen. You just let it evolve. You don't do anything yourself.
         All you do is make sure that nothing disturbs this wonderful creation in any way.
         You are extremely active and at the same time extremely passive. You don't do anything; you just let it evolve."]
        ]])))
