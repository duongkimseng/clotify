(ns ^:figwheel-no-load clotify.dev
  (:require
    [clotify.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
