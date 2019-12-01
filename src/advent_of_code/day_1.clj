(ns day-1)

(defn fuel-required [mass]
  (- (Math/floor (/ mass 3)) 2))

(defn read-stdin []
  (map (fn [v] (Integer/parseInt v)) (clojure.string/split-lines (slurp *in*))))

(defn -main []
  (println (int (reduce + (map fuel-required (read-stdin))))))

(-main)
