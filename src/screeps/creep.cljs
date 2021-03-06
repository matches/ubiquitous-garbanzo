(ns screeps.creep
  (:refer-clojure :exclude [name]))

(defn id
  [c]
  (.-id c))

(defn body
  [c]
  (js->clj (.-body c)))

(defn name
  [c]
  (.-name c))

(defn move
  [c direction]
  (.move c direction))

(defn move-to
  [c target]
  (.moveTo c target))

(defn build
  [c t]
  (.build c t))

(defn harvest
  [c t]
  (.harvest c t))

(defn energy
  [c]
  (aget c "carry" "energy"))

(defn energy-capacity
  [c]
  (aget c "carryCapacity"))

(defn transfer-energy
  [c t & [amt]]
  (.transferEnergy c t amt))

(defn upgrade-controller
  [c ctrl]
  (.upgradeController c ctrl))

(defn claim-controller
  [c ctrl]
  (.claimController c ctrl))

(defn memory
  [c]
  (js->clj (.-memory c) :keywordize-keys true))

(defn memory!
  [c m]
  (aset js/Memory "creeps" (name c) (clj->js m)))

