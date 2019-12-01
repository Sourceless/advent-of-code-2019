;; WIP solution... will probably come back to it tomorrow, because I'm not happy with it at all

(ns day-1-2)

(defn fuel-required [mass]
  (- (Math/floor (/ mass 3)) 2))

(defn total-fuel-required
  ([mass]
   (total-fuel-required mass 0))
  ([mass total-mass]
   (let [required (fuel-required mass)]
     (if (<= required 0)
       total-mass
       (total-fuel-required required (+ total-mass required)))))

(defn read-stdin []
  (map (fn [v] (Integer/parseInt v)) (clojure.string/split-lines (slurp *in*))))

(defn -main []
  (println (int (reduce + (map total-fuel-required (read-stdin))))))

(-main)
