(define (problem BLOCKS-15-1)
(:domain BLOCKS)
(:objects J B K A D H E N C F L M I O G a1 a2 a3 a4)
(:INIT (agent a1) (agent a2) (agent a3) (agent a4) (HANDEMPTY a1) (HANDEMPTY a2) (HANDEMPTY a3) (HANDEMPTY a4) (CLEAR G) (CLEAR O) (ONTABLE I) (ONTABLE M) (ON G L) (ON L F) (ON F C)
 (ON C N) (ON N E) (ON E H) (ON H D) (ON D A) (ON A K) (ON K B) (ON B J)
 (ON J I) (ON O M)  )
(:goal (AND (ON D G) (ON G F) (ON F K) (ON K J) (ON J E) (ON E M) (ON M A)
            (ON A B) (ON B C) (ON C N) (ON N O) (ON O I) (ON I L) (ON L H)))
)
