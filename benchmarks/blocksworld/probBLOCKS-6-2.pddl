(define (problem BLOCKS-6-2)
(:domain BLOCKS)
(:objects E F B D C A a1 a2 a3 a4)
(:INIT (agent a1) (agent a2) (agent a3) (agent a4) (HANDEMPTY a1) (HANDEMPTY a2) (HANDEMPTY a3) (HANDEMPTY a4) (CLEAR A) (ONTABLE C) (ON A D) (ON D B) (ON B F) (ON F E) (ON E C)
 )
(:goal (AND (ON E F) (ON F A) (ON A B) (ON B C) (ON C D)))
)
