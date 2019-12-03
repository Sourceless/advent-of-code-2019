;; WIP solution... will probably come back to it tomorrow, because I'm not happy with it at all

(ns day-1-2)

(defn fuel-required [mass]
  (- (Math/floor (/ mass 3)) 2))

(defn fuel-required-series [mass]
  (iterate fuel-required mass))

(defn total-fuel-required [mass]
  (reduce + (drop 1 (take-while (partial <= 0) (fuel-required-series mass)))))

(defn read-stdin []
  (map (fn [v] (Integer/parseInt v)) (clojure.string/split-lines (slurp *in*))))

(defn -main []
  (println (int (reduce + (map total-fuel-required (read-stdin))))))

(-main)
